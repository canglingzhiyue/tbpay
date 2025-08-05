package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class rrk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33335a = true;
    public int b = 90;
    public boolean c = true;
    public int d = 1;
    public boolean e = true;
    public int f = 270;
    public int g = 100;
    public int h = 0;
    private int i = 2056;
    private int j = 1080;

    static {
        kge.a(1809443429);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f33335a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DeviceSetting{displayAuto=" + this.f33335a + ", displayAngle=" + this.b + ", cameraAuto=" + this.c + ", cameraID=" + this.d + ", algorithmAuto=" + this.e + ", algorithmAngle=" + this.f + ", maxApiLevel=" + this.g + ", minApiLevel=" + this.h + '}';
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.i;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.j;
    }
}
