package tests;

import com.epam.Model.Calculator;
import com.epamService.Service.CalculatorServicePage;
import com.epamService.Service.PropertyReadPage;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.epam.constants.ProjectConstants.NO_OF_INSTANCES;

public class CalculatorPageTests extends BaseTest{
    @Test
    public void checkInformationInVmClassString() throws InterruptedException, IOException {
        Calculator calculator=CalculatorServicePage.getCalculatorData();
        calculatorPage.openCloudPage();
        calculatorPage.goToGoogleCloudPlatformPricingCalculatorPage(
                "Google Cloud Platform Pricing Calculator");
        calculatorPage
                .sendKeyInToNumberOfInstancesField(calculator);       /*calculatorPage.selectSeriesOfMachine();
        calculatorPage.selectMachineType();
        calculatorPage.clickAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGpus();
        calculatorPage.selectLocalSsd();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
        calculatorPage.checkInformationInVmClassIsRegular();
        calculatorPage.checkInformationInInstanceTypeIncludeN1Standard8();
        calculatorPage.checkRegionIsFrankfurt();
        calculatorPage.checkLocalSsdSpace2x375Gib();
        calculatorPage.checkCommitmentTermOneYear();*/

    }
}