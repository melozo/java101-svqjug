public class Xcopy {
    public static void main(String[] args) {

        IntContainer original = new IntContainer();
        original.value = 43;

        Xcopy x = new Xcopy();
        IntContainer returnFromGo = x.go(original);
        System.out.println(original.value + " " + returnFromGo.value);
    }

    private IntContainer go(IntContainer blau) {
        blau.value = blau.value * 2;
        return blau;
    }
}
