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
#  Scenario: Verifikator melakukan edit pada data cashback
#    Given User telah berhasil login
#    When User klik menu verifikasi pada side bar
#    And User memilih aksi pada custumer yang akan diverifikasi
#    And User klik tombol edit
#    And User input nama lengkap
#    And User input nomor HP
#    And User input nomor rekening
#    And User input nominal transaksi
#    And User input tanggal transaksi
#    Then User klik tommbol save

#T4
#  Scenario: Verifikator melakukan edit nominal dibawah minimal transaksi pada data cashback
#    Given User telah berhasil login
#    When User klik menu verifikasi pada side bar
#    And User memilih aksi pada custumer yang akan diverifikasi
#    And User klik tombol edit
#    And User input nama lengkap
#    And User input nomor HP
#    And User input nomor rekening
#    And User input nominal transaksi dibawah minimal cashback
#    And User input tanggal transaksi
#    Then User klik tommbol save

#T5 Negatif
#  Scenario: Verifikator melakukan edit negatif pada data cashback
#    Given User telah berhasil login
#    When User klik menu verifikasi pada side bar
#    And User memilih aksi pada custumer yang akan diverifikasi
#    And User klik tombol edit
#    And User tidak input nama lengkap
#    And User tidak input nomor HP
#    And User tidak input nomor rekening
#    And User tidak input nominal transaksi
#    And User tidak input tanggal transaksi
#    And User klik tommbol save
#    Then User mendapatkan alert The Customer Name field is required
