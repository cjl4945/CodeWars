public class LongToIP {
    public static String longToIP(long ip) {
        // Java doesn't have uint32, so here we use long to represent int32
        return ((ip >> 24)&0xFF) + "." + ((ip >> 16)&0xFF) + "." + ((ip >> 8)&0xFF) + "." + ((ip)&0xFF);
//        String binary = Long.toBinaryString(ip);
//        while (binary.length() != 32){
//            binary = "0" + binary;
//        }
//        Long oct1,oct2,oct3,oct4;
//
//        if (binary.substring(0,8).equals("00000000")) {
//            oct1 = (long)0;
//        }
//        else{
//            oct1 = Long.parseLong(binary.substring(0, 8), 2);
//        }
//        if (binary.substring(8,16).equals("00000000")) {
//            oct2 = (long)0;
//        }
//        else{
//            oct2 = Long.parseLong(binary.substring(8, 16), 2);
//        }
//        if (binary.substring(16,24).equals("00000000")) {
//            oct3 = (long)0;
//        }
//        else{
//            oct3 = Long.parseLong(binary.substring(16, 24), 2);
//        }
//        if (binary.substring(24).equals("00000000")) {
//            oct4 = (long)0;
//        }
//        else{
//            oct4 = Long.parseLong(binary.substring(24), 2);
//        }
//
//
//        return oct1.toString() + "." + oct2.toString() + "." + oct3.toString() + "." + oct4.toString(); // do it!
    }

    public static void main(String[] args) {
        System.out.println(longToIP(2154959208L));
        System.out.println(longToIP(0));
        System.out.println(longToIP(2149583361L));
    }
}
