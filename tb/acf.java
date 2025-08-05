package tb;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
final class acf {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f25233a = !acf.class.desiredAssertionStatus();

    private acf() {
    }

    public static int a(int i) {
        if (i <= 4) {
            return 8;
        }
        return i << 1;
    }

    public static int[] a(int[] iArr, int i, int i2) {
        if (f25233a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                int[] iArr2 = new int[a(i)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr = iArr2;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.Object] */
    public static <T> T[] a(T[] tArr, int i, T t) {
        if (f25233a || i <= tArr.length) {
            if (i + 1 > tArr.length) {
                ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a(i));
                System.arraycopy(tArr, 0, r0, 0, i);
                tArr = r0;
            }
            tArr[i] = t;
            return tArr;
        }
        throw new AssertionError();
    }
}
