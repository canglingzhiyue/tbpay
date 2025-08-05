package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> int a(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b63135bc", new Object[]{tArr})).intValue();
        }
        if (tArr != null) {
            return tArr.length;
        }
        return 0;
    }

    public static <T> void a(T[] tArr, T[] tArr2, T[] tArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d3bf69", new Object[]{tArr, tArr2, tArr3});
        } else if (tArr.length < a(tArr2) + a(tArr3)) {
            tfr.b("ArrayUtil", "safeMerge: merge failed, out of boundary, exit");
        } else {
            a(tArr, tArr2, 0, a(tArr2));
            a(tArr, tArr3, a(tArr2), a(tArr3));
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb56912", new Object[]{iArr, iArr2, iArr3});
            return;
        }
        try {
            if (iArr.length < iArr2.length + iArr3.length) {
                tfr.b("ArrayUtil", "safeMerge: merge failed, out of boundary, exit");
                return;
            }
            a(iArr, iArr2, 0, iArr2.length);
            a(iArr, iArr3, iArr2.length, iArr3.length);
        } catch (NullPointerException e) {
            tfr.b("ArrayUtil", "safeMergeInt: copy with null pointer " + e);
        }
    }

    public static <T> void a(T[] tArr, T[] tArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b7d528", new Object[]{tArr, tArr2, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i2 < 0 || i > tArr2.length || i > tArr.length || i2 > tArr2.length || i2 > tArr.length) {
            tfr.b("ArrayUtil", "safeCopy: copy failed, out of boundary, exit");
        } else {
            System.arraycopy(tArr2, 0, tArr, i, i2);
        }
    }

    public static void a(int[] iArr, int[] iArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cad3a64", new Object[]{iArr, iArr2, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i2 < 0 || i > iArr2.length || i > iArr.length || i2 > iArr2.length || i2 > iArr.length) {
            tfr.b("ArrayUtil", "safeCopy: copy failed, out of boundary, exit");
        } else {
            System.arraycopy(iArr2, 0, iArr, i, i2);
        }
    }
}
