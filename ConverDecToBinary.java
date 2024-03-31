public class ConverDecToBinary {

    public static void main(String[] args) {
        ConverDecToBinary converter = new ConverDecToBinary();
        System.out.println(converter.convertToBinary(13));
    }

    public String convertToBinary(int n) {
        String res = "";
        while (n != 0) {
            if (n % 2 == 0) {
                res += '0';
            } else {
                res += '1';
            }
            n = n / 2;
        }
        res = reverse(res);
        return res;
    }

    public String reverse(String res) {
        String fin = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            char c = res.charAt(i);
            fin += c;
        }
        return fin;
    }
}
