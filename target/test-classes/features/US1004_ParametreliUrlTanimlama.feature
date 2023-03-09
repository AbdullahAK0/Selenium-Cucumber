Feature: US1004 kullanici parametre olarak girdigi Url'e gider

  @ilk
  Scenario: TC08 Kullanici url'i parametre olarak girebilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    Then "amazonUrl" sayfasina gittigini test eder
    And sayfayi kapatir