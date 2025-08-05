package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lks;

/* loaded from: classes7.dex */
public class lhu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lks<RecyclerView> f30630a;
    private lhw b;

    static {
        kge.a(1243133801);
    }

    public lhu(ljs ljsVar, lks<RecyclerView> lksVar) {
        this.f30630a = lksVar;
        this.b = new lhw(ljsVar);
        a(this.b, this.f30630a);
    }

    private void a(lks.c<RecyclerView> cVar, lks<RecyclerView> lksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36632d81", new Object[]{this, cVar, lksVar});
        } else {
            lksVar.a(cVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f30630a.b(this.b);
        this.b = null;
    }
}
