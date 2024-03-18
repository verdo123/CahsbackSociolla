Feature: Proses Pre-transfer
#T1
  Scenario: Verifikator berhasil melakukan ekspor dara yang tervalidasi
    Given User telah berhasil login
    When User klik menu Pre-transfer pada side bar
    And User click export excel
    Then User mendapatkan data excel