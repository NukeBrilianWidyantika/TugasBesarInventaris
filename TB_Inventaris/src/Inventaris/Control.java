package Inventaris;

import java.util.Scanner;

public class Control{
	Model call1 = new Model();
	Scanner in = new Scanner(System.in);
	int LCD = 0, AC = 0, lampu = 0, kipas = 0, steker = 0, CCTV = 0;

	double hitung_luas() {
		return call1.getpanjang_ruang() * call1.getlebar_ruang();
	}

	String hitung_bentuk() {
		if (call1.getpanjang_ruang() == call1.getlebar_ruang()) {
			return "Ruangan tidak sesuai";
		} else {
			return "Ruangan sesuai";
		}
	}

	double hitung_rasio() {
		return hitung_luas() / call1.getjml_kursi();
	}

	String analisis_pintu_dan_jendela() {
		if (call1.getjml_pintu() >= 2) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kelistrikan() {
		if (call1.getPosisi_steker().equalsIgnoreCase("a")
				&& call1.getJml_steker() >= 4 && steker == 4) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_LCD() {
		if (call1.getJml_kabel_LCD() >= 1
				&& call1.getKondisi_kabel_LCD().equalsIgnoreCase("berfungsi")
				&& call1.getPosisi_kabel_LCD().equalsIgnoreCase("a")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_lampu() {
		if (call1.getJml_lampu() >= 18 && lampu == 18
				&& call1.getPosisi_lampu().equalsIgnoreCase("a")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kipas_angin() {
		if (call1.getJml_kipas() >= 2 && kipas == 2
				&& call1.getPosisi_kipas().equalsIgnoreCase("a")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_AC() {
		if (call1.getJml_AC() >= 1 && AC >= 1
				&& call1.getPosisi_AC().equalsIgnoreCase("a")
				&& call1.getPosisi_AC().equalsIgnoreCase("b")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_internet() {
		if (call1.getBandwidth().equalsIgnoreCase("a")
				&& call1.getLogin().equalsIgnoreCase("baik")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_CCTV() {
		if (call1.getJml_CCTV() == 2 && CCTV == 2
				&& call1.getPosisi_CCTV().equalsIgnoreCase("a")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kebersihan() {
		if (call1.getKondisi_lantai().equalsIgnoreCase("bersih")
				&& call1.getKondisi_dinding().equalsIgnoreCase("bersih")
				&& call1.getKondisi_atap().equalsIgnoreCase("bersih")
				&& call1.getKondisi_pintu().equalsIgnoreCase("bersih")
				&& call1.getKondisi_jendela().equalsIgnoreCase("bersih")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_sirkulasi_udara() {
		if (call1.getSirkulasi_udara().equalsIgnoreCase("a")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_pencahayaan() {
		if (250 >= call1.getNilai_pencahayaan()
				&& call1.getNilai_pencahayaan() >= 350) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kelembapan() {
		if (70 >= call1.getKelembapan() && call1.getKelembapan() <= 80) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_suhu() {
		if (25 >= call1.getKelembapan() && call1.getKelembapan() <= 35) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kebisingan() {
		if ("tidak bising".equals(call1.getKebisingan())) {
			return "Sesuai";
		} else {
			return "tidak sesuai";
		}
	}

	String analisis_bau() {
		if (call1.getBau().equalsIgnoreCase("tidak")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kebocoran() {
		if (call1.getKebocoran().equalsIgnoreCase("tidak")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kerusakan() {
		if (call1.getKerusakan().equalsIgnoreCase("tidak")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_keausan() {
		if (call1.getKeausan().equalsIgnoreCase("tidak")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kekokohan() {
		if (call1.getKekokohan().equalsIgnoreCase("kokoh")) {
			return"Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_kuncipintu_dan_jendela() {
		if (call1.getJml_kunci_pintu() != 0 && call1.getJml_kunci_jendela() != 0) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}

	String analisis_keamanan_ruang() {
		if (call1.getBahaya().equalsIgnoreCase("aman")) {
			return "Sesuai";
		} else {
			return "Tidak sesuai";
		}
	}
}
