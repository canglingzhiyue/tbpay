package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kly {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f30154a = 32768;
    public static int b = 4096;
    public static int c = 10000;
    public static int d = 15000;
    public static boolean e = true;
    public int f;
    public int g;
    private kmo h;
    private kmq i;
    private int j;
    private int k;

    public kly(kmr kmrVar) {
        this.f = 3;
        this.g = 3;
        this.h = kmrVar.e;
        this.i = kmrVar.f;
        if (kmrVar.f.r > 0) {
            this.f = kmrVar.f.r;
            this.g = kmrVar.f.r;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : c;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (0 == this.h.b) {
            return d * 10;
        }
        int i = (int) (this.h.b / 10);
        int i2 = d;
        return i > i2 ? i : i2;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f - this.j == 1;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.g - this.k == 1;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.j;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        kmq kmqVar = this.i;
        return kmqVar != null ? kmqVar.f30169a : "";
    }
}
