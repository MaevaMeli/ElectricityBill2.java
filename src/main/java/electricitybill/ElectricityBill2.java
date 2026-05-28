package electricitybill;

/**
 * Die Rechnungsverbrauch in Euro für einen bestimmten Jahresverbrauch (in kWh) berechnen.
 */
public class ElectricityBill2 {

  /**
   * Returns der kleinste  Rechnungsverbrauch nach einer Vergleichung von zwei Rechnungsverbrauch
   * für einen bestimmten Jahresverbrauch.
   *
   * @param jahresverbrauch      Verbrauchsmenge in kWh
   * @param grundpreistarif1     erste preis tarif 1
   * @param verbrauchpreistarif1 zweite preis tarif 1
   * @param grundpreistarif2     erste preis tarif 2
   * @param verbrauchpreistarif2 zweite preis tarif 2
   * @return der kleinste rechnungsverbrauch
   */
  public static float invoiceAmount(int jahresverbrauch, float grundpreistarif1,
                                    float verbrauchpreistarif1, float grundpreistarif2,
                                    float verbrauchpreistarif2) {
    /*
     *Die beide Rechnungsverbrauch aus den jeweilligen Tarifen werden zuerstmal berechnet und die
     * Verbrauchpreise sind durch 100 geteilt ,um ihre angegebene Werte ,die in Cent sind ,in Euro
     * umzurechnen .
     */
    float rechnungsverbrauch1 = grundpreistarif1 * 12 + jahresverbrauch * verbrauchpreistarif1
        / 100;

    float rechnungsverbrauch2 = grundpreistarif2 * 12 + jahresverbrauch * verbrauchpreistarif2
        / 100;
    /*
     * Es wird nun eine weitere variable deklariert , die die zwei Rechnungsverbrauch vergleicht und
     * der mit dem kleinen Wert nihmmt .
     * Falls der rechnungsverbrauch1 kleiner als der rechnungsverbrauch2 ist , nihmmt die variable
     * rechnungsverbrauch den Wert von dem rechnungsverbrauch1 andernfalls bekommt sie den Wert von
     * dem rechnungsverbrauch2 .
     */
    float rechnungsverbrauch = rechnungsverbrauch1 < rechnungsverbrauch2
                               ? rechnungsverbrauch1
                               :
                               rechnungsverbrauch2;
    /*
     * Bei dem Methoderumpf geht es zuerst um die Rundung  der Variable rechnungsverbrauch der Typ
     * float , indem  wir es mal 100 multiplizieren und plus 0.5  addieren ,dann um das Abschneiden
     * durch eine Typkonvertierung (int) und Schließlich das Ergebnis aus dem Typ int in der
     * Ergebnistyp der methode float  zu konvertieren .
     *
     */
    return ((int) (rechnungsverbrauch * 100 + 0.5) / 100f);

  }

  /**
   * Prints values of the call methode to the screen and run the program.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    invoiceAmount(3535, 17.07f, 33.26f,
        19.53f, 30.17f);

    System.out.println(invoiceAmount(3535, 17.07f,
        33.26f, 19.53f, 30.17f));


  }
}



