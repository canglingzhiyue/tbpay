package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kmq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_DM = 1;
    public static final int TYPE_HUC = 2;
    public static final int TYPE_TNET = 3;

    /* renamed from: a  reason: collision with root package name */
    public String f30169a;
    public boolean b;
    public String h;
    public int i;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    public int p;
    public boolean q;
    public int c = 10;
    public int d = 7;
    public int e = 1;
    public int f = 1;
    public boolean g = false;
    public boolean j = true;
    public String o = "";
    public int r = 3;
    public boolean s = true;
    public String t = "";

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Param{priority=" + this.c + ", network=" + this.d + ", callbackCondition=" + this.e + ", callbackType=" + this.f + ", fileStorePath='" + this.h + "'}";
    }
}
