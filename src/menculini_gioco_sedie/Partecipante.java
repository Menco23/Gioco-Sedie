/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menculini_gioco_sedie;

class Partecipante extends Thread

{
	Posto sedie[];
        private Scrittore scrittore;
        private int idPartecipante;

	public Partecipante(Posto sedie[], Scrittore scrittore, int idPartecipante) {

		this.sedie = sedie;
                this.scrittore = scrittore;
                this.idPartecipante = idPartecipante;

	}

	public void run() {

		try {
			sleep((int) (Math.random() * 1000));

			for (int i = 0; i < sedie.length; i++) {
				if (sedie[i].occupa()) {
					System.out.println("Sono il Thread " + this.getName()
							+ ". Sono riuscito a sedermi sul posto " + i);
				scrittore.scrivi(idPartecipante, i);
                                        return;
				}
			}
			System.out.println("Sono il Thread " + this.getName()
					+ ". Ho perso :((((");

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
