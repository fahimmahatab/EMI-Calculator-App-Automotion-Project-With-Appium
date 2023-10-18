import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EMICalTestRunner extends Setup {
    @BeforeTest
    public void startEmiCalc() {
        EMICalScreen emiCalScreen = new EMICalScreen(driver);
        emiCalScreen.btnStart.click();
    }

    @Test(priority = 1, description = "Calculate EMI", dataProviderClass = Dataset.class, dataProvider = "data-provider")
    public void calculateEmi(int amount, double interest, int year, double processingFee, int mEMI, int tInterest, int pFee, int tPayment) {
        EMICalScreen emiCalScreen = new EMICalScreen(driver);
        emiCalScreen.calculateEmi(amount, interest, year, processingFee);

        int actualmEMI = (int) Math.round(Double.parseDouble(emiCalScreen.lblMonthlyEmi.getText().replace(",", "")));
        int actualtInterest = (int) Math.round(Double.parseDouble(emiCalScreen.lblTotalInterest.getText().replace(",", "")));
        int actualpFee = (int) Math.round(Double.parseDouble(emiCalScreen.lblProcessingFee.getText().replace(",", "")));
        int actualtPayment = (int) Math.round(Double.parseDouble(emiCalScreen.lblTotalPayment.getText().replace(",", "")));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualmEMI, mEMI);
        softAssert.assertEquals(actualtInterest, tInterest);
        softAssert.assertEquals(actualpFee, pFee);
        softAssert.assertEquals(actualtPayment, tPayment);
        softAssert.assertAll();

        emiCalScreen.btnReset.click();
    }
}
