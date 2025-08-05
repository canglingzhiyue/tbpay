package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes8.dex */
public final class oeg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f31970a;
    public long b;
    public int d;
    public oei f;
    public List<oej> g;
    public oeh h;
    public long i;
    public oeh j;
    public boolean c = false;
    public int e = 0;

    static {
        kge.a(1541202757);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (!this.f.c) {
            return this.e;
        }
        return -1;
    }
}
