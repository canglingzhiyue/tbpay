package com.taobao.android.order.core.dinamicX.view.barcode;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes6.dex */
public final class a implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f14622a;
    private final int b;
    private final int c;
    private final int[] d;

    static {
        kge.a(175729407);
        kge.a(-723128125);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : c();
    }

    public a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f14622a = i;
        this.b = i2;
        this.c = (i + 31) / 32;
        this.d = new int[this.c * i2];
    }

    private a(int i, int i2, int i3, int[] iArr) {
        this.f14622a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else {
            if (i4 <= 0 || i3 <= 0) {
                throw new IllegalArgumentException("Height and width must be at least 1");
            }
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.b || i5 > this.f14622a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f14622a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14622a == aVar.f14622a && this.b == aVar.b && this.c == aVar.c && Arrays.equals(this.d, aVar.d);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i = this.f14622a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : a("X ", "  ");
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : a(str, str2, "\n");
    }

    private String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        StringBuilder sb = new StringBuilder(this.b * (this.f14622a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.f14622a; i2++) {
                sb.append(a(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("94e7f489", new Object[]{this}) : new a(this.f14622a, this.b, this.c, (int[]) this.d.clone());
    }
}
