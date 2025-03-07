package lesson20.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner class; testNG deki .xml file larda belirttiğimiz class'ları,packageları veya methodları nasıl
çalıştırıyorsak, Cucumber frameworkundede Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz
 */
//Cucumber ile JUnit'in entegre olmasını sağlayan test çalıştırıcı notasyonudur
@RunWith(Cucumber.class)
//Seneryoların nerede ve nasıl çalışacağı, hangi raporu kullanacağıyla alakalı seçenekleri ayarlarız
@CucumberOptions(  //plugin kismi raporlar icin
        plugin = {
                "pretty", //console renkli yazdirmak icin
                "html:target/default-cucumber-reports.html", //html report için
                "json:target/json-reports/cucumber.json",  //plugin ekledikten sonra bunu cucumber report için ekle
                "junit:test-output/htmlReport/cucumber.xml", //xml report için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//spark report icin
                "rerun:TestOutput/failed_scenario.txt"},//bu satirdaki kod, hata veren testleri kaydedip yeniden otomatik kosmak icin
        features = "src/test/java/lesson20/features",
        glue = {"lesson20/stepDefinitions","lesson20/hooks"},
        /* 1-Bu parametre ile kodlarımızı yazdığımız stepDefinition class'ının packege'ını belirtiriz
2- Hooks classin yolunu veririz.
                                             */
        tags = "",
        dryRun = false,
        monochrome = false //console okunakli hale getirir,false scenario adimlarini renkli gosterir,  true renksiz yapar
)

public class TestReportRunner {
}
/*
features ===> features'ların olduğu packega'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega'ın yolunu ver(Source Root), Hooks class yolunu ver
tags ====> çalıştırmak istediğin grubu yaz
dryRun = true ====> eksik step definition bulup gösterir. calismaz. konsolda eksik stepleri gosterir.
 */


