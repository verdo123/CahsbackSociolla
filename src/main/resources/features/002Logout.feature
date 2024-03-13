Feature: Proses Logout
#1
  Scenario: Verifikator berhasil logout
    Given User berhasil login
    When User klik tombol Logout pada side bar
    Then User berhasil logout dan diarahkan ke halaman login