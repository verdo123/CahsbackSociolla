Feature: Proses Pre-transfer
#T1
  Scenario: Verifikator berhasil melakukan ekspor data yang tervalidasi
    Given User login
    When User klik menu Pre-transfer pada side bar
    And User click export excel
    Then User mendapatkan data excel