package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class spu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33832a = false;
    private Pair<Integer, Integer> b;

    static {
        kge.a(1314204300);
    }

    public Pair<Integer, Integer> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("dd4f14b2", new Object[]{this}) : this.b;
    }

    public void a(Pair<Integer, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a82db72", new Object[]{this, pair});
        } else {
            this.b = pair;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f33832a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f33832a = z;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : oeb.a("ShortVideo.enableDestroySharePlayerDWInstance", true);
    }
}
