Feature: Proses verifikasi

  Scenario: Verifikator berhasil melakukan verifikasi data register
    Given User telah berhasil login
    When User klik menu verifikasi pada side bar
    And User memilih aksi pada custumer yang akan diverifikasi
    And klik tombol Verikasi
#    And User klik tombol OK
#    Then User mendapatkan feedback "Sukses verifikasi data" klik OK