package tb;

import com.taobao.android.detail.sdk.event.params.c;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public abstract class evt implements Event {

    /* renamed from: a  reason: collision with root package name */
    public c f27606a;

    static {
        kge.a(1558897479);
        kge.a(-1834561497);
    }

    public evt(c cVar) {
        this.f27606a = cVar;
        tpc.a("com.taobao.android.detail.sdk.event.trade.BaseTradeEvent");
    }
}
