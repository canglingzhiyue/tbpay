package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lhq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final lks<RecyclerView> f30621a;
    private final lhr b;
    private lhp c;

    static {
        kge.a(1490436173);
    }

    public lhq(ljs ljsVar, lks<RecyclerView> lksVar) {
        this.f30621a = lksVar;
        this.b = new lhr(ljsVar);
        this.c = new lhp(ljsVar);
        lksVar.a(this.b);
        lksVar.a(this.c);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f30621a.b(this.b);
        this.f30621a.a(this.c);
    }
}
