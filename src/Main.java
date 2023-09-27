import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String Main = "ŠŽYOŠŠVTPVĮŲĮĮŲŠVŲEŲMUŲŠŲLKŠVŲŽŽRŽŽĮŽFPĖŲŠŽJŲŪVŠŲŽYDGTŠDPDEŽŠFŪŠIĮARJEŲYĖŽŠFŽLŠYBIVŽMLUEPŠRŠYŠISŠŪĖDBŠULŪVPŠĖŠŠŽJŲŪĮŠŲFERLJJPIŲĖBAONELŠŲEBŠŠEIŠŲŽBAŲŠĖŠVYŠŲĘŽŠHŠRIRKŽŲŪŠEUJBYKŠIŠTŲBĮŲŲŠŠITĮCSHKŠŠŲŲPTŽŪŽEOORŠŠŲŠĮIŽFFĮLYEIKNŠNŽLFHŠŠŠNPKŲANŠĖPATŪŠUVLDŪŠBVDPĖNOUŲIŲŲLŲEBŠMŪĖOVĮĖŽŠDBUŠŲŲŠKŲŠELTLĮFJEUŲŠKVYKJĮŠŠŲRŽOĖŠŽŠŠYŠŽŽIŪTŽOŠOUĮŠMŠŪVEŲŲVRLAYŲŠTAĮAILĖYŲEVŲŠRKŲŽEŽĮĖVŠBĘBFOJŠIEOŲKFPŽPUPĖŠĖNĮRŠŠĮŠĮŽBĮĖCŠŠŽKŲŠNŲŲBĖŲDŲŠAOŲŽŠŠŠŽŪVŲŪFDŠSRVYVŠŠŪŲŽSTOŠŲUMŽŠPVŠŠŽKDŠŲNŠŠŠBIJŠJŠŠŲYŪŠAŠTŲJŪBŲŠGEHŽTŪŠJŲŲJŠADEREKŠEŲŲŽDSGŠUŠPŽŲKJVŲOOŽIŽŠĘLŲĮŠEŪŠŲBŽĮVARŲNŲŠŪĮŽŠVŠMIVTŠŪŠBĮŲŽGJAONVIŪGŲKĖŽČNŠKŲĮNYĮOŪŲŽŲĮOŠGLPIPNYŽŠDŽPĮIŠIŠVŽŲOĖBŽVULJŠŠŪŠILŲAŽVVĮFPŽAĖAŠLIPŠŪŲNABĮAVŽJŠĮŽŪLRŲĮŽEŽŽIAFŠHJOYYŲŠŲĖVIŲŽDŠŲJŠŠŲĖJŲŠŪEĮŠEŠŠIAABŠŽABAPŲTMŲTŠNŲILLŠĮŲRŠJŽUYŠŲTPTĮCŠKRPBŽŠŠKĖAŲPŲJCŲŠVVŲŠMŠUMRĖŠŲŠFŠLEŽŪLRŠĖŲAŠMEŠŠFPOŠPŲPEJŠRŠĮŲOŽTŽUŠĖĮDŲKŠŠNIIMĮĖŠNABJĖEŠIIJŠĖLVĖRĖJFŲŽORŠĮŽŠVĮŲLEŪŠCKĮALILEĮABŠĮTŽDŽŪŲOOŽEPŠCIĮVMRVRLŠŠUŠŲUŲŠŠAŠŠŠŽFRŽĖVVŠCŽŠŲNDNIŠVŠŠŠŲYLIŠCDŽĖŪĖUMŲĮVIŽRIŠRAŲŽBBGŠŲŠOŠBŠŪUŲBYĮYŠŠŽŲŠŠYŠPŠOĮBŪŽDŽCJŠĖŲFŠĘŠŠRIBAŲĮĮŠŠŠOŲJĮĮVŠŠŠLOŠCŠŠŪĮBŠTFĮIŠUŲĖŠŽŽYVKŲPĮEĮĘŽVJĮĖJUŲŲAVAIGŠCŠMŪĮŽŽĮŠŠŠŠŠŪYŲŠŠDĖŲŠŠĮPYRMPVŠŪĖŠĮEĖŠŪŠNVŲŠLŲPŲŽŲTMŠŠĖŠYTŠPRLNVOŪVŲRIŪOĖŲŠFŲŪHŪAŽŽŪYPŠDJŽŪŠĘPLRYCAOŪEEŲĮŲŽJĮYNORPJEŲKLBRŽVVŲŠLŽYŲVTFTŽŲĖYYMGŪŠLŠŽVĮŽŠBPTKFŠĮOŽŠĖIŠEAPŲŽIŲŲBŠŪSŲLŪLŲIŠLBUNŲTŲAŽŠHŲŠŠUKŪIRĮŲŠYAĘTŠTTYŲŽNDŠŠĮENIŠKŠŽŪRĮIĖEGVŽŠŠŲŠŽŪAŲŠTŠFDŽŲŽRŲMYIYYŲKRŠŽŲTŠFPŲŪĖTRŠŲMPVLŠŠĖNOŪYRŠTŠĮŲJJPJRBIŠŲŲĮYŠGMLLEFCYŪYŪYTOYĮŠUĮ";//TGĘŠŲŲĖČEĘDDFVBDVLSFVSDFVAAIDVDSEA
        System.out.println(Main);
        // sukuriu array mainui
        String[] stringArray = new String[Main.length()];
        // sukeliu viska i array is main po viena simboli
        for (int i = 0; i < Main.length(); i++) {
            // Convert the character to a string and add it to the array
            stringArray[i] = String.valueOf(Main.charAt(i));
            System.out.print(stringArray[i]);
        }
        System.out.println("");
        ArrayList<String> consonants = new ArrayList<>(); //priebalses tarp T ir E
        String[] vowelsArray = {"A", "Ą", "E", "Ę", "Ė", "I", "Į", "Y", "O", "U", "Ų", "Ū"};
        ArrayList<String> vowels = new ArrayList<>();   // balses tarp E ir L
        String[] consonantsArray = {"B", "C", "Č", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "Š", "T", "V", "Z", "Ž"};
        ArrayList<String> lettersSuVarnele = new ArrayList<>(); // raides su varnelem tarp L ir I, nerasau tik raidziu su varnele
        String[] lettersSuVarneleArray = {"A", "E", "I", "Y", "O", "U", "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "Z"};
        ArrayList<String> closedLetters = new ArrayList<>(); // uzdaros raides tarp I ir A
        String[] closedLettersArray = {"A", "Ą", "E", "Ę", "Ė", "I", "Į", "Y", "U", "Ų", "Ū", "C", "Č", "F", "G", "H", "J", "K", "L", "M", "N", "R", "S", "Š", "T", "V", "Z", "Ž"};
        //bandau kazka irodyti
        ArrayList<String> deleteList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        for (int i = 0; i < stringArray.length; i++) {
            stringList.add(stringArray[i]);
        }
        System.out.println("11: " + stringList);
        /////////////////////
        ArrayList<String> result = new ArrayList<>();
        for(int j = 0; j < stringList.size(); j++) {
            int indexT = stringList.indexOf("T");
            int indexE = stringList.indexOf("E");
            if (indexE > indexT) {
                stringList.remove(indexE);
            }
            for (int i = indexT + 1; i < indexE; i++) {
                consonants.add(stringList.get(i));
            }
            System.out.println("priebalses: " + consonants);
            for (String vowel : vowelsArray) {
                while (consonants.contains(vowel)) {
                    consonants.remove(vowel);
                }
            }

            System.out.println("Likusios priebalses: " + consonants);

            // balses tarp E ir L (index e as jau turiu)
            int indexL = stringList.indexOf("L");
            if (indexL > indexE) {
                stringList.remove(indexL);
            }
            for (int i = indexE + 1; i < indexL; i++) {
                vowels.add(stringList.get(i));
            }
            System.out.println("Balses: " + vowels);
            for (String consonant : consonantsArray) {
                while (vowels.contains(consonant)) {
                    vowels.remove(consonant);
                }
            }
            //stringList.remove(indexE);
            System.out.println("Likusios balses: " + vowels);

            // raides su varnelem tarp L ir I (index L as jau turiu)
            int indexI = stringList.indexOf("I");
            if (indexI > indexL) {
                stringList.remove(indexI);
            }
            for (int i = indexL + 1; i < indexI; i++) {
                lettersSuVarnele.add(stringList.get(i));
            }
            System.out.println("Raides su varnelem: " + lettersSuVarnele);
            for (String letter : lettersSuVarneleArray) {
                while (lettersSuVarnele.contains(letter)) {
                    lettersSuVarnele.remove(letter);
                }
            }
            //stringList.remove(indexL);
            System.out.println("Likusios raides su varnelem: " + lettersSuVarnele);

            // uzdaros raides tarp I ir A (index I as jau turiu)
            int indexA = stringList.indexOf("A");
            if (indexA > indexI) {
                stringList.remove(indexA);
            }
            for (int i = indexI + 1; i < indexA; i++) {
                closedLetters.add(stringList.get(i));
            }
            System.out.println("Uzdaros raides: " + closedLetters);
            for (String closed : closedLettersArray) {
                while (closedLetters.contains(closed)) {
                    closedLetters.remove(closed);
                }
            }
            for(int i = 0; i <= indexE; i++)
            {
                stringList.remove(stringList.get(i));
            }
        }
        System.out.println("Likusios uzdaros raides: " + closedLetters);
        /// viska sudesiu i last string result
        System.out.println(vowels.size() + consonants.size() + lettersSuVarnele.size() + closedLetters.size());
    }
}
