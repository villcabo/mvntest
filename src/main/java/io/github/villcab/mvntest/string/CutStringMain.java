package io.github.villcab.mvntest.string;

public class CutStringMain {

    public static String cutString(String input) {
        if (input == null) return "";
        input = input.trim();
        if (input.isEmpty()) return "";
        String[] split = input.split(",");
        if (split.length == 0) {
            return "";
        }
        String[] split1 = split[0].split("=");
        if (split1.length == 0) {
            return "";
        }
        return split1[1];
    }

    public static void main(String[] args) {
        String jansId = "jansId=0a3236fe-ec36-4308-80dc-9bf6319d780c,ou=fido2_register,inum=XXXX.EEEE-1111,ou=people,o=jans";
        System.out.println(cutString(jansId));
    }
}
