public class clearBits {
    int n = 5;
    int pos = 2;

    int bitMask = 1 << pos;

    int notBitMask = ~(bitMask);

    int newNumber = notBitMask & n;
}
