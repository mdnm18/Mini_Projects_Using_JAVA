
import java.util.Scanner;

class Element {

    String name;
    String symbol;
    int atomicNumber;
    String electronicConfiguration;
    String discoveredBy;
    String charge;

    Element(String name, String symbol, int atomicNumber, String electronicConfiguration, String discoveredBy, String charge) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.electronicConfiguration = electronicConfiguration;
        this.discoveredBy = discoveredBy;
        this.charge = charge;
    }

    void displayDetails() {
        System.out.println("NAME : " + name);
        System.out.println("SYMBOL : " + symbol);
        System.out.println("ATOMIC NUMBER : " + atomicNumber);
        System.out.println("ELECTRONIC CONFIGURATION : " + electronicConfiguration);
        System.out.println("DISCOVERED BY : " + discoveredBy);
        System.out.println("CHARGE : " + charge);
    }
}

public class PeriodicTable {

    public static void main(String[] args) {
        Element[] elements = new Element[118];

        elements[0] = new Element("HYDROGEN", "H", 1, "1s^1", "HENRY CAVENDISH", "+1");
        elements[1] = new Element("HELIUM", "He", 2, "1s^2", "PIERRE JULES CESAR JANSSEN", "0");
        elements[2] = new Element("LITHIUM", "Li", 3, "1s^2 2s^1", "JOHAN AUGUST ARFEVEDSON", "+1");
        elements[3] = new Element("BERYLLIUM", "Be", 4, "1s^2 2s^2", "NICHOLAS L. V. G. A. BEYER", "+2");
        elements[4] = new Element("BORON", "B", 5, "1s^2 2s^2 2p^1", "J. L. GAY-LUSSAC", "+3");
        elements[5] = new Element("CARBON", "C", 6, "1s^2 2s^2 2p^2", "ANONYMOUS", "±4");
        elements[6] = new Element("NITROGEN", "N", 7, "1s^2 2s^2 2p^3", "D. RUTHERFORD", "-3");
        elements[7] = new Element("OXYGEN", "O", 8, "1s^2 2s^2 2p^4", "CAVENDISH", "-2");
        elements[8] = new Element("FLUORINE", "F", 9, "1s^2 2s^2 2p^5", "HENRY MOISSAN", "-1");
        elements[9] = new Element("NEON", "Ne", 10, "1s^2 2s^2 2p^6", "J. W. STRUTT", "0");
        elements[10] = new Element("SODIUM", "Na", 11, "1s^2 2s^2 2p^6 3s^1", "HENRY CAVENDISH", "+1");
        elements[11] = new Element("MAGNESIUM", "Mg", 12, "1s^2 2s^2 2p^6 3s^2", "JOHN HULKE", "+2");
        elements[12] = new Element("ALUMINIUM", "Al", 13, "1s^2 2s^2 2p^6 3s^2 3p^1", "HUMPHRY DAVY", "+3");
        elements[13] = new Element("SILICON", "Si", 14, "1s^2 2s^2 2p^6 3s^2 3p^2", "J. J. BERZELIUS", "±4");
        elements[14] = new Element("PHOSPHORUS", "P", 15, "1s^2 2s^2 2p^6 3s^2 3p^3", "HENRY H. R. KIRK", "-3");
        elements[15] = new Element("SULFUR", "S", 16, "1s^2 2s^2 2p^6 3s^2 3p^4", "ANONYMOUS", "-2");
        elements[16] = new Element("CHLORINE", "Cl", 17, "1s^2 2s^2 2p^6 3s^2 3p^5", "ANTOINE LAVOISIER", "-1");
        elements[17] = new Element("ARGON", "Ar", 18, "1s^2 2s^2 2p^6 3s^2 3p^6", "W. RAMSAY", "0");
        elements[18] = new Element("POTASSIUM", "K", 19, "1s^2 2s^2 2p^6 3s^2 3p^6 4s^1", "SIR HUMPHRY DAVY", "+1");
        elements[19] = new Element("CALCIUM", "Ca", 20, "1s^2 2s^2 2p^6 3s^2 3p^6 4s^2", "HENRY MOISSAN", "+2");
        elements[20] = new Element("SCANDIUM", "Sc", 21, "[Ar] 3d^1 4s^2", "LARS FOLKMAN", "+3");
        elements[21] = new Element("TITANIUM", "Ti", 22, "[Ar] 3d^2 4s^2", "W. G. K. G. H. ROEBUCK", "+4");
        elements[22] = new Element("VANADIUM", "V", 23, "[Ar] 3d^3 4s^2", "ANDERS AHLSTRÖM", "+5");
        elements[23] = new Element("CHROMIUM", "Cr", 24, "[Ar] 3d^5 4s^1", "L. C. W. D. A. A. W. M. WENZEL", "+6");
        elements[24] = new Element("MANGANESE", "Mn", 25, "[Ar] 3d^5 4s^2", "JOHN HULKE", "+7");
        elements[25] = new Element("IRON", "Fe", 26, "[Ar] 3d^6 4s^2", "HENRY BECQUEREL", "+2");
        elements[26] = new Element("COBALT", "Co", 27, "[Ar] 3d^7 4s^2", "GEORG M. R. K. C.", "+2");
        elements[27] = new Element("NICKEL", "Ni", 28, "[Ar] 3d^8 4s^2", "G. B. G.", "+2");
        elements[28] = new Element("COPPER", "Cu", 29, "[Ar] 3d^{10} 4s^1", "HUMPHRY DAVY", "+1");
        elements[29] = new Element("ZINC", "Zn", 30, "[Ar] 3d^{10} 4s^2", "W. G. G.", "+2");
        elements[30] = new Element("GALLIUM", "Ga", 31, "[Ar] 3d^{10} 4s^2 4p^1", "PAULÉ LÉVÉN", "+3");
        elements[31] = new Element("GERMANIUM", "Ge", 32, "[Ar] 3d^{10} 4s^2 4p^2", "C. A. D. R.", "±4");
        elements[32] = new Element("ARSENIC", "As", 33, "[Ar] 3d^{10} 4s^2 4p^3", "C. A. D. R.", "-3");
        elements[33] = new Element("SELENIUM", "Se", 34, "[Ar] 3d^{10} 4s^2 4p^4", "HENRY MOISSAN", "-2");
        elements[34] = new Element("BROMINE", "Br", 35, "[Ar] 3d^{10} 4s^2 4p^5", "ANTOINE LAVOISIER", "-1");
        elements[35] = new Element("KRYPTON", "Kr", 36, "[Ar] 3d^{10} 4s^2 4p^6", "W. RAMSAY", "0");
        elements[36] = new Element("RUBIDIUM", "Rb", 37, "[Kr] 5s^1", "B. A. F. A. K.", "+1");
        elements[37] = new Element("STRONTIUM", "Sr", 38, "[Kr] 5s^2", "SIR HUMPHRY DAVY", "+2");
        elements[38] = new Element("YTTRIUM", "Y", 39, "[Kr] 4d^1 5s^2", "J. J. G. G.", "+3");
        elements[39] = new Element("ZIRCONIUM", "Zr", 40, "[Kr] 4d^2 5s^2", "HENRY MOISSAN", "+4");
        elements[40] = new Element("NIOBIUM", "Nb", 41, "[Kr] 4d^4 5s^1", "C. E. G. C. J. C.", "+5");
        elements[41] = new Element("MOLYBDENUM", "Mo", 42, "[Kr] 4d^5 5s^1", "C. E. G. C. J. C.", "+6");
        elements[42] = new Element("TECHNETIUM", "Tc", 43, "[Kr] 4d^5 5s^2", "C. E. G. C. J. C.", "+7");
        elements[43] = new Element("RUTHENIUM", "Ru", 44, "[Kr] 4d^7 5s^2", "H. H. H.", "+4");
        elements[44] = new Element("RHODIUM", "Rh", 45, "[Kr] 4d^8 5s^1", "W. R. H.", "+3");
        elements[45] = new Element("PALLADIUM", "Pd", 46, "[Kr] 4d^{10}", "HENRY MOISSAN", "+2");
        elements[46] = new Element("SILVER", "Ag", 47, "[Kr] 4d^{10} 5s^1", "H. C. H.", "+1");
        elements[47] = new Element("CADMIUM", "Cd", 48, "[Kr] 4d^{10} 5s^2", "H. C. H.", "+2");
        elements[48] = new Element("INDIUM", "In", 49, "[Kr] 4d^{10} 5s^2 5p^1", "G. J. B. R. C.", "+3");
        elements[49] = new Element("TIN", "Sn", 50, "[Kr] 4d^{10} 5s^2 5p^2", "C. J. A. W. K. C. C. H.", "±4");
        elements[50] = new Element("ANTIMONY", "Sb", 51, "[Kr] 4d^{10} 5s^2 5p^3", "C. A. D. R.", "-3");
        elements[51] = new Element("TELLURIUM", "Te", 52, "[Kr] 4d^{10} 5s^2 5p^4", "C. A. D. R.", "-2");
        elements[52] = new Element("IODINE", "I", 53, "[Kr] 4d^{10} 5s^2 5p^5", "C. A. D. R.", "-1");
        elements[53] = new Element("XENON", "Xe", 54, "[Kr] 4d^{10} 5s^2 5p^6", "W. RAMSAY", "0");
        elements[54] = new Element("CESIUM", "Cs", 55, "[Xe] 6s^1", "HENRY MOISSAN", "+1");
        elements[55] = new Element("BARIUM", "Ba", 56, "[Xe] 6s^2", "HENRY MOISSAN", "+2");
        elements[56] = new Element("LANTHANUM", "La", 57, "[Xe] 5d^1 6s^2", "H. H. H.", "+3");
        elements[57] = new Element("CERIUM", "Ce", 58, "[Xe] 4f^1 5d^1 6s^2", "A. A. G. D. C. G.", "+3");
        elements[58] = new Element("PRASEODYMIUM", "Pr", 59, "[Xe] 4f^3 6s^2", "A. A. G. D. C. G.", "+3");
        elements[59] = new Element("NEODYMIUM", "Nd", 60, "[Xe] 4f^4 6s^2", "A. A. G. D. C. G.", "+3");
        elements[60] = new Element("PROMETHIUM", "Pm", 61, "[Xe] 4f^5 6s^2", "A. A. G. D. C. G.", "+3");
        elements[61] = new Element("SAMARIUM", "Sm", 62, "[Xe] 4f^6 6s^2", "A. A. G. D. C. G.", "+3");
        elements[62] = new Element("EUROPIUM", "Eu", 63, "[Xe] 4f^7 6s^2", "A. A. G. D. C. G.", "+3");
        elements[63] = new Element("GADOLINIUM", "Gd", 64, "[Xe] 4f^7 5d^1 6s^2", "A. A. G. D. C. G.", "+3");
        elements[64] = new Element("TERBIUM", "Tb", 65, "[Xe] 4f^9 6s^2", "A. A. G. D. C. G.", "+3");
        elements[65] = new Element("DYSPROSIUM", "Dy", 66, "[Xe] 4f^{10} 6s^2", "A. A. G. D. C. G.", "+3");
        elements[66] = new Element("HOLMIUM", "Ho", 67, "[Xe] 4f^{11} 6s^2", "A. A. G. D. C. G.", "+3");
        elements[67] = new Element("ERBIUM", "Er", 68, "[Xe] 4f^{12} 6s^2", "A. A. G. D. C. G.", "+3");
        elements[68] = new Element("THULIUM", "Tm", 69, "[Xe] 4f^{13} 6s^2", "A. A. G. D. C. G.", "+3");
        elements[69] = new Element("YTTERBIUM", "Yb", 70, "[Xe] 4f^{14} 6s^2", "A. A. G. D. C. G.", "+3");
        elements[70] = new Element("LUTETIUM", "Lu", 71, "[Xe] 4f^{14} 5d^1 6s^2", "A. A. G. D. C. G.", "+3");
        elements[71] = new Element("HAFNIUM", "Hf", 72, "[Xe] 4f^{14} 5d^2 6s^2", "D. M. S. A. H. H. H.", "+4");
        elements[72] = new Element("TANTALUM", "Ta", 73, "[Xe] 4f^{14} 5d^3 6s^2", "D. M. S. A. H. H. H.", "+5");
        elements[73] = new Element("TUNGSTEN", "W", 74, "[Xe] 4f^{14} 5d^4 6s^2", "D. M. S. A. H. H. H.", "+6");
        elements[74] = new Element("RHENIUM", "Re", 75, "[Xe] 4f^{14} 5d^5 6s^2", "D. M. S. A. H. H. H.", "+7");
        elements[75] = new Element("OSMIUM", "Os", 76, "[Xe] 4f^{14} 5d^6 6s^2", "D. M. S. A. H. H. H.", "+8");
        elements[76] = new Element("IRIDIUM", "Ir", 77, "[Xe] 4f^{14} 5d^7 6s^2", "D. M. S. A. H. H. H.", "+3");
        elements[77] = new Element("PLATINUM", "Pt", 78, "[Xe] 4f^{14} 5d^9 6s^1", "D. M. S. A. H. H. H.", "+2");
        elements[78] = new Element("GOLD", "Au", 79, "[Xe] 4f^{14} 5d^{10} 6s^1", "D. M. S. A. H. H. H.", "+1");
        elements[79] = new Element("MERCURY", "Hg", 80, "[Xe] 4f^{14} 5d^{10} 6s^2", "D. M. S. A. H. H. H.", "+2");
        elements[80] = new Element("THALLIUM", "Tl", 81, "[Xe] 4f^{14} 5d^{10} 6s^2 6p^1", "D. M. S. A. H. H. H.", "+3");
        elements[81] = new Element("LEAD", "Pb", 82, "[Xe] 4f^{14} 5d^{10} 6s^2 6p^2", "D. M. S. A. H. H. H.", "±4");
        elements[82] = new Element("BISMUTH", "Bi", 83, "[Xe] 4f^{14} 5d^{10} 6s^2 6p^3", "D. M. S. A. H. H. H.", "-3");
        elements[83] = new Element("POLONIUM", "Po", 84, "[Xe] 4f^{14} 5d^{10} 6s^2 6p^4", "D. M. S. A. H. H. H.", "-2");
        elements[84] = new Element("ASTATINE", "At", 85, "[Xe] 4f^{14} 5d^{10} 6s^2 6p^5", "D. M. S. A. H. H. H.", "-1");
        elements[85] = new Element("RADON", "Rn", 86, "[Xe] 4f^{14} 5d^{10} 6s^2 6p^6", "D. M. S. A. H. H. H.", "0");
        elements[86] = new Element("FRANCIUM", "Fr", 87, "[Rn] 7s^1", "A. G. J. G.", "+1");
        elements[87] = new Element("RADIUM", "Ra", 88, "[Rn] 7s^2", "A. G. J. G.", "+2");
        elements[88] = new Element("ACTINIUM", "Ac", 89, "[Rn] 6d^1 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[89] = new Element("THORIUM", "Th", 90, "[Rn] 6d^2 7s^2", "F. G. H. F. A. A. A. A.", "+4");
        elements[90] = new Element("PROTACTINIUM", "Pa", 91, "[Rn] 5f^2 6d^1 7s^2", "F. G. H. F. A. A. A. A.", "+5");
        elements[91] = new Element("URANIUM", "U", 92, "[Rn] 5f^3 6d^1 7s^2", "F. G. H. F. A. A. A. A.", "+6");
        elements[92] = new Element("NEPTUNIUM", "Np", 93, "[Rn] 5f^4 6d^1 7s^2", "F. G. H. F. A. A. A. A.", "+7");
        elements[93] = new Element("PLUTONIUM", "Pu", 94, "[Rn] 5f^6 7s^2", "F. G. H. F. A. A. A. A.", "+4");
        elements[94] = new Element("AMERICIUM", "Am", 95, "[Rn] 5f^7 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[95] = new Element("CURIUM", "Cm", 96, "[Rn] 5f^7 6d^1 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[96] = new Element("BERKELIUM", "Bk", 97, "[Rn] 5f^9 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[97] = new Element("CALIFORNIUM", "Cf", 98, "[Rn] 5f^{10} 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[98] = new Element("EINSTEINIUM", "Es", 99, "[Rn] 5f^{11} 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[99] = new Element("FERMIUM", "Fm", 100, "[Rn] 5f^{12} 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[100] = new Element("MENDELEVIUM", "Md", 101, "[Rn] 5f^{13} 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[101] = new Element("NOBELIUM", "No", 102, "[Rn] 5f^{14} 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[102] = new Element("LAWRENCIUM", "Lr", 103, "[Rn] 5f^{14} 6d^1 7s^2", "F. G. H. F. A. A. A. A.", "+3");
        elements[103] = new Element("RUTHERFORDIUM", "Rf", 104, "[Rn] 5f^{14} 6d^2 7s^2", "F. G. H. F. A. A. A. A.", "+4");
        elements[104] = new Element("DUBNIUM", "Db", 105, "[Rn] 5f^{14} 6d^3 7s^2", "F. G. H. F. A. A. A. A.", "+5");
        elements[105] = new Element("SEABORGIUM", "Sg", 106, "[Rn] 5f^{14} 6d^4 7s^2", "F. G. H. F. A. A. A. A.", "+6");
        elements[106] = new Element("BOHRIUM", "Bh", 107, "[Rn] 5f^{14} 6d^5 7s^2", "F. G. H. F. A. A. A. A.", "+7");
        elements[107] = new Element("HASSIUM", "Hs", 108, "[Rn] 5f^{14} 6d^6 7s^2", "F. G. H. F. A. A. A. A.", "+8");
        elements[108] = new Element("MEITNERIUM", "Mt", 109, "[Rn] 5f^{14} 6d^7 7s^2", "F. G. H. F. A. A. A. A.", "+9");
        elements[109] = new Element("DARMSTADTIUM", "Ds", 110, "[Rn] 5f^{14} 6d^8 7s^2", "F. G. H. F. A. A. A. A.", "+10");
        elements[110] = new Element("ROENTGENIUM", "Rg", 111, "[Rn] 5f^{14} 6d^9 7s^2", "F. G. H. F. A. A. A. A.", "+11");
        elements[111] = new Element("COPERNICIUM", "Cn", 112, "[Rn] 5f^{14} 6d^{10} 7s^2", "F. G. H. F. A. A. A. A.", "+12");
        elements[112] = new Element("NIHONIUM", "Nh", 113, "[Rn] 5f^{14} 6d^{10} 7s^2 7p^1", "F. G. H. F. A. A. A. A.", "+3");
        elements[113] = new Element("FLEROVIUM", "Fl", 114, "[Rn] 5f^{14} 6d^{10} 7s^2 7p^2", "F. G. H. F. A. A. A. A.", "+4");
        elements[114] = new Element("MOSCOVIUM", "Mc", 115, "[Rn] 5f^{14} 6d^{10} 7s^2 7p^3", "F. G. H. F. A. A. A. A.", "+5");
        elements[115] = new Element("LIVERMORIUM", "Lv", 116, "[Rn] 5f^{14} 6d^{10} 7s^2 7p^4", "F. G. H. F. A. A. A. A.", "+6");
        elements[116] = new Element("TENNESSINE", "Ts", 117, "[Rn] 5f^{14} 6d^{10} 7s^2 7p^5", "F. G. H. F. A. A. A. A.", "-1");
        elements[117] = new Element("OGANESSON", "Og", 118, "[Rn] 5f^{14} 6d^{10} 7s^2 7p^6", "YURIY OGANESYAN", "0");

        Scanner scanner = new Scanner(System.in);
        System.out.println("<----------WELCOME TO MODERN PERIODIC TABLE---------->");
        System.out.println("> ENTER 1 TO KNOW ABOUT AN ELEMENT");
        System.out.println("> ENTER 2 TO CLOSE THE PERIODIC TABLE");
        System.out.print("ENTER : ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("> ENTER THE ATOMIC NUMBER OF THE ELEMENT TO BE SEARCHED : ");
            int atomicNumber = scanner.nextInt();
            if (atomicNumber >= 1 && atomicNumber <= 118) {
                elements[atomicNumber - 1].displayDetails();
            } else {
                System.out.println("ELEMENT NOT FOUND");
            }
        } else if (choice == 2) {
            System.out.println("DO YOU WANT TO EXIT? (YES/NO)");
            System.out.println("> PRESS 1 FOR 'YES'");
            System.out.println("> PRESS 2 FOR 'NO'");
            System.out.print("ENTER : ");
            int exitChoice = scanner.nextInt();
            if (exitChoice == 1) {
                System.out.println("THE PERIODIC TABLE HAS CLOSED");
            } else if (exitChoice == 2) {
                System.out.println("PERIODIC TABLE HAS NOT CLOSED AND YOU CAN CONTINUE TO LEARN MORE ABOUT ELEMENTS");
            }
        }

        scanner.close();
    }
}
