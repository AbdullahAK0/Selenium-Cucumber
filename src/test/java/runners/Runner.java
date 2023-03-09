package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false)


public class Runner {


}

/*
    Runner class'i testlerimizi tekli ya da coklu calistirmamizi saglar
    Runner class'i BOS bir class'tir.
    Burada asil isi yapan 2 tane notasyon
    ve iclerine yazdigimiz argumentlerdir.

    @CucemberOptions icerisine yazacagimiz degerler
    bu Runner class'inin calistiracagi
        -feature dosyalarinin ve
        -feature dosyalarina ait Java method'larinin nerede oldugunu
        -ve bu feature dosyalari icerisinde olusturulan Scenerio
        veya feature'larin hangilerinin calistirilacagini belirler.

    dryRun  : default degeri olan "false" oldugunda
              feature dosyasinda run tusuna bastigimiz gibi calistirir
              stepdefinition'i olusturan adimlari calistirir
              stepdefinition'i olmayan ilk adimda eksik adimlari
              bize raporlar.

              Ancak bu tür calistirmada gereksiz calistirilan adimlar olur
              bunun yerine

              "true" degerini verirseniz testi calistirmayi denemez
              sadece adimlari kontrol eder
              eksik adim varsa kodlari olusturur.

              Eksik adim yoksa hicbir adimi calistirmadan
              test PASSED der.

              Buradaki test PASSED "eksik adim yok" anlamindadir.
 */
