Feature: Proses Login
#1
  Scenario: Verifikator berhasil login dengan username dan password yang valid
    Given User di halaman login
    When User memasukan username yang valid
    And User memasukan password yang valid
    And User klik tombol login
    Then User berhasil login dan diarahkan ke halaman utama