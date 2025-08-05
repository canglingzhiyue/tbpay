package com.taobao.android.order.core.dinamicX.view.barcode;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class d implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f14623a;

    public Collection<BarcodeFormat> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("66d215f", new Object[]{this});
        }
        return null;
    }

    public abstract boolean[] a(String str);

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 10;
    }

    static {
        kge.a(-1413831430);
        kge.a(1322448450);
        f14623a = Pattern.compile("[0-9]+");
    }

    @Override // com.taobao.android.order.core.dinamicX.view.barcode.e
    public a a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5e68b0fd", new Object[]{this, str, barcodeFormat, new Integer(i), new Integer(i2), map});
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        Collection<BarcodeFormat> a2 = a();
        if (a2 != null && !a2.contains(barcodeFormat)) {
            throw new IllegalArgumentException("Can only encode " + a2 + ", but got " + barcodeFormat);
        }
        int b = b();
        if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
            b = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
        }
        return a(a(str), i, i2, b);
    }

    private static a a(boolean[] zArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ccfafb9b", new Object[]{zArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        if (max % i4 != 0) {
            max = i5 * i4;
        }
        int i6 = (max - (length * i5)) / 2;
        a aVar = new a(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                aVar.a(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return aVar;
    }

    public static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("823dd55d", new Object[]{zArr, new Integer(i), iArr, new Boolean(z)})).intValue();
        }
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i2;
            int i7 = 0;
            while (i7 < i5) {
                zArr[i6] = z2;
                i7++;
                i6++;
            }
            i4 += i5;
            z2 = !z2;
            i3++;
            i2 = i6;
        }
        return i4;
    }
}
