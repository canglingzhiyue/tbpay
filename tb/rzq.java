package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.ssrcore.c;

/* loaded from: classes9.dex */
public class rzq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f33437a;
    private volatile ryn b;
    private volatile boolean c = false;

    public rzq(ryn rynVar, c cVar) {
        this.b = rynVar;
        this.f33437a = cVar;
    }

    public void a(ryn rynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf98271", new Object[]{this, rynVar});
        } else {
            this.b = rynVar;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            this.b.b();
            this.c = true;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrApiID{ssrContext=" + this.f33437a + ", call=" + this.b + ", isCancelled=" + this.c + '}';
    }
}
