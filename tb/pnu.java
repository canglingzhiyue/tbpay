package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* loaded from: classes8.dex */
public class pnu implements pnr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pnr f32777a;
    private pno b;

    static {
        kge.a(-544947292);
        kge.a(-593771168);
    }

    public void a(pno pnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f54307", new Object[]{this, pnoVar});
        } else {
            this.b = pnoVar;
        }
    }

    public void a(pnr pnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f6a024", new Object[]{this, pnrVar});
        } else {
            this.f32777a = pnrVar;
        }
    }

    @Override // tb.pnr
    public void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdf0661", new Object[]{this, tLiveMsg});
            return;
        }
        pnr pnrVar = this.f32777a;
        if (pnrVar != null) {
            pnrVar.a(tLiveMsg);
        }
        pno pnoVar = this.b;
        if (pnoVar == null) {
            return;
        }
        pnoVar.a(tLiveMsg);
    }

    @Override // tb.pnr
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        pnr pnrVar = this.f32777a;
        if (pnrVar != null) {
            pnrVar.a(i, obj);
        }
        pno pnoVar = this.b;
        if (pnoVar == null) {
            return;
        }
        pnoVar.a(i, obj);
    }
}
