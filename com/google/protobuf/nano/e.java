package com.google.protobuf.nano;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class e {
    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final byte[][] EMPTY_BYTES_ARRAY = new byte[0];
    public static final byte[] EMPTY_BYTES = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        return i & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static boolean a(a aVar, int i) throws IOException {
        return aVar.b(i);
    }

    public static int b(int i) {
        return i >>> 3;
    }

    public static final int b(a aVar, int i) throws IOException {
        int x = aVar.x();
        aVar.b(i);
        int i2 = 1;
        while (aVar.a() == i) {
            aVar.b(i);
            i2++;
        }
        aVar.f(x);
        return i2;
    }
}
