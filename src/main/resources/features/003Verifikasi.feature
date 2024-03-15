Feature: Proses verifikasi
#T1
#  Scenario: Verifikator berhasil melakukan verifikasi data register
#    Given User telah berhasil login
#    When User klik menu verifikasi pada side bar
#    And User memilih aksi pada custumer yang akan diverifikasi
#    And klik tombol Verikasi
#    And User klik tombol OK
#    Then User mendapatkan feedback Sukses verifikasi data klik OK

#T2
#  Scenario: Verifikator berhasil merubah pembayaran QRIS tanpa menu edit
#    Given User telah berhasil login
#    When User klik menu verifikasi pada side bar
#    And User memilih aksi pada custumer yang akan diverifikasi
#    And User mengubah Pembayaran QRIS
#    And klik tombol Verikasi
#    And User klik tombol OK
#    Then User mendapatkan feedback Sukses verifikasi data klik OK

#T3
  Scenario: Verifikator melakukan edit pada data cashback
    Given User telah berhasil login
    When User klik menu verifikasi pada side bar
    And User memilih aksi pada custumer yang akan diverifikasi
    And User klik tombol edit
    And User input nama lengkap
    And User input nomor HP
    And User input nomor rekening
    And User input nominal transaksi
    And User input tanggal transaksi
    Then User klik tommbol save
