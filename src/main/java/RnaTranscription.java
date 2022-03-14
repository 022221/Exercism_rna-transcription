import java.util.HashMap;
import java.util.Map;
import java.lang.*;

class RnaTranscription {

    static Map<Character, Character> dnaComplementsByNucleotide = new HashMap<Character, Character>();

    static {
        dnaComplementsByNucleotide.put('G', 'C');
        dnaComplementsByNucleotide.put('C', 'G');
        dnaComplementsByNucleotide.put('T', 'A');
        dnaComplementsByNucleotide.put('A', 'U');
    }

    String transcribe(String dnaStrand) {

        StringBuilder rnaStrand = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {

            rnaStrand.append(dnaComplementsByNucleotide.get(dnaStrand.charAt(i)));

        }

        return rnaStrand.toString();
    }
}
