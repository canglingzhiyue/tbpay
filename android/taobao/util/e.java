package android.taobao.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a[] f1539a;
    private int b;
    private int c;
    private float d;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1540a;
        public int b;
        public Object c;
        public a d;

        static {
            kge.a(-890801671);
        }

        public a(int i, int i2, Object obj, a aVar) {
            this.f1540a = i;
            this.b = i2;
            this.c = obj;
            this.d = aVar;
        }
    }

    static {
        kge.a(1099691915);
    }

    public e() {
        this(16, 0.75f);
    }

    public e(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        i = i > 1073741824 ? 1073741824 : i;
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Illegal Load: " + f);
        }
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
        }
        this.d = f;
        this.f1539a = new a[i2];
        this.c = (int) (i2 * f);
    }

    public Object a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        a[] aVarArr = this.f1539a;
        for (a aVar = aVarArr[(Integer.MAX_VALUE & i) % aVarArr.length]; aVar != null; aVar = aVar.d) {
            if (aVar.f1540a == i) {
                return aVar.c;
            }
        }
        return null;
    }

    public Object a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5af2095b", new Object[]{this, new Integer(i), obj});
        }
        a[] aVarArr = this.f1539a;
        int i2 = Integer.MAX_VALUE & i;
        int length = i2 % aVarArr.length;
        for (a aVar = aVarArr[length]; aVar != null; aVar = aVar.d) {
            if (aVar.f1540a == i) {
                Object obj2 = aVar.c;
                aVar.c = obj;
                return obj2;
            }
        }
        if (this.b >= this.c) {
            b();
            aVarArr = this.f1539a;
            length = i2 % aVarArr.length;
        }
        aVarArr[length] = new a(i, i, obj, aVarArr[length]);
        this.b++;
        return null;
    }

    public int[] a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this});
        }
        int i2 = this.b;
        if (i2 == 0) {
            return new int[0];
        }
        int[] iArr = new int[i2];
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.f1539a;
            if (i >= aVarArr.length) {
                return iArr;
            }
            a aVar = aVarArr[i];
            while (aVar != null) {
                iArr[i3] = aVar.b;
                aVar = aVar.d;
                i3++;
            }
            i++;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('{');
        int[] a2 = a();
        for (int i = 0; i < a2.length; i++) {
            int i2 = a2[i];
            Object a3 = a(i2);
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(i2);
            stringBuffer.append('=');
            if (a3 == this) {
                a3 = "(this Map)";
            }
            stringBuffer.append(a3);
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a[] aVarArr = this.f1539a;
        int length = aVarArr.length;
        int i = length << 1;
        a[] aVarArr2 = new a[i];
        this.c = (int) (i * this.d);
        this.f1539a = aVarArr2;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return;
            }
            a aVar = aVarArr[i2];
            while (aVar != null) {
                a aVar2 = aVar.d;
                int i3 = (aVar.f1540a & Integer.MAX_VALUE) % i;
                aVar.d = aVarArr2[i3];
                aVarArr2[i3] = aVar;
                aVar = aVar2;
            }
            length = i2;
        }
    }
}
