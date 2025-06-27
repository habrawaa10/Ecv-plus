import java.util.Scanner;
public class Ecvplus {
    public static void main(String[] args) {

        final int coorectpin = 4400;
        final double bankbalance = 100.0;
        final int bankpin = 123456;
        final int mobile = 614465419;
        final double lacagta = 30.0;
        final String BILOW = "*770#";
        Scanner input = new Scanner(System.in);
        System.out.println("fadlan geli *770#");
        String gal = input.next();


        if (gal.equals(BILOW)) {
            System.out.println("fadlan geli pin kaaga");

            int pin = input.nextInt();
            if (pin == coorectpin) {
                System.out.println("-EVCPlus-");
                System.out.println("1.Itus haraagaaga");
                System.out.println("2.kaarka hadalka");
                System.out.println("3. bixi biil");
                System.out.println("4.U wareeji EVCPlus");
                System.out.println("5. warbixin kooban");
                System.out.println("6.salaam Bank");
                System.out.println("7.Maareynta");
                System.out.println("8.TAAJ");
                System.out.println("9. Bill Payment");
                System.out.println("0.ka bax");

                int choice = input.nextInt();
                if (choice ==1) {
                    System.out.println("<-EVCPlus-> Haraagaagu waa $"+lacagta);
                } else if (choice== 2) {
                    System.out.println("Kaarka hadalka");
                    System.out.println("1. ku shubo Airtime");
                    System.out.println("2. Ugu shub Airtime");
                    System.out.println("3. MIFI package");
                    System.out.println("4. ku shub internet");
                    System.out.println("5. ugu shub qof kale (MMT)");
                    System.out.println("0.ka bax");
                } else if (choice ==3) {
                    System.out.println("Bixi Bill");
                    System.out.println("1. post paid");
                    System.out.println("2. ku iibso");
                    int choice2 = input.nextInt();
                    if (choice2 ==1)
                        System.out.println("Post paid");
                    System.out.println("1. ogow biilka");
                    System.out.println("2. ka bixi bill");

                } else if (choice==4) {
                    System.out.println("enter mobile");
                    int inermobile = input.nextInt();
                    if (inermobile == mobile){
                        System.out.println("fadlan geli lacagta");
                        double geli= input.nextInt();
                        if (geli > 0 && geli <= lacagta)
                            System.out.println("mahubtaa in aad $"+geli+" u wareejisid \n 252613748997 ? ");
                        System.out.println("1. haa ");
                        System.out.println("2. maya");
                        int hubi = input.nextInt();
                        if (hubi==1) {
                            System.out.println("[-EVCPlus-]$" + geli + " "+ "ayaad \n u wareejisay " +
                                    "0613748997, tar:\n 20/06/2025 17:35:29,haraagaagu \n waa " + (lacagta - geli));
                        }
                        else
                            System.out.println("mahadsanid!.");

                    }

                } else if (choice==5) {
                    System.out.println("warbixin kooban");
                    System.out.println("1. Last action");
                    System.out.println("2. wareejintii udambeysay");
                    System.out.println("3. iibsashadii udambeysay");
                    System.out.println("4. last 3 actions ");
                    System.out.println("4. Email me my activity");
                    int ch5 = input.nextInt();



                } else if (choice == 6) {
                    System.out.println("Salaam bank");
                    System.out.println("1. Itus haraahaaga");
                    System.out.println("2. Lcag dhigasho");
                    System.out.println("3. lacag qaadasho ");
                    System.out.println("4. ka wareeji EVCPlus");
                    System.out.println("5. ka wareeji account-kaaga");
                    System.out.println("6. hubi wareejin accont");
                    System.out.println("7. maareynta bankiga ");
                    System.out.println("8. kala bax");
                    int ch6 = input.nextInt();
                    if (ch6==1)
                        System.out.println("fadlan geli numberkaaga sirta ee bankiga(Enter PIN");
                    double sir = input.nextInt();
                    if (sir==bankpin) {
                        System.out.println("koontadaada bangiga:xxxxxxxx haraagaagu \n waa " + bankbalance + " USD IBAN:SO XXXXXXXXXXXXXXXXXXXX");
                    }

                } else if (choice == 7) {
                    System.out.println("Maareynta");
                    System.out.println("1. bedel Lambarka sirta ah ");
                    System.out.println("2. bedel luqada ");
                    System.out.println("3. wargelin mobile lumay");
                    System.out.println("4. lacag xirasho");
                    System.out.println("5. U celi lacag qaldantay");
                    int ch7 = input.nextInt();

                } else if (choice == 8) {
                    System.out.println("TAAJ");
                    System.out.println("1. gudaha ");
                    System.out.println("2. Dibadda ");
                    System.out.println("3. ogoow khidmahada");
                    System.out.println("4. Macluumaadka xawaaladda ");
                    System.out.println("5. Jooji xawaaladda ");
                    System.out.println("6. fur xawaaladda ");
                    int ch8 = input.nextInt();

                } else if (choice == 9) {
                    System.out.println("EVCPlus");
                    System.out.println("1. Itus haraagaaga Bill ka");
                    System.out.println("2. wada bixi bill-ka");
                    System.out.println("3. Qeyb ka bixi bill-ka");
                    int ch9 = input.nextInt();

                }
                else
                    System.out.println("fadlan dooro number sah ah");


            }
        } else
            System.out.println("<-EVCPlus>-Nambarka sirta ah waa khalad");


    }
    }
