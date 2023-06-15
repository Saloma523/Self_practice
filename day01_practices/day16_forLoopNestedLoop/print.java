package day16_forLoopNestedLoop;

public class print {
    public static void main(String[] args) {

        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";
        String result5 = "";

        for (char i = 'A'; i <= 'E' ; i++) {


            for (char j = 'a'; j <= 'z' ; j++) {
               if(i == 'A'){
                   result1+= "" + i+j;
               }
               if(i == 'B'){
                   result2+= "" + i+j;
               }
                if(i == 'C'){
                    result3+= "" + i+j;
                }
                if(i == 'D'){
                    result4+= "" + i+j;
                }
                if(i == 'E'){
                    result5+= "" + i+j;
                }




            }

        }


        System.out.print(result1);
        System.out.println();
        System.out.print(result2);
        System.out.println();
        System.out.print(result3);
        System.out.println();
        System.out.print(result4);
        System.out.println();
        System.out.print(result5);

    }
}
/*
 Use a nested loop to print the following output:
        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
        Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
        Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
        Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez

 */
