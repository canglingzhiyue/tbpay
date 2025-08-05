package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;

/* loaded from: classes5.dex */
public class fkq implements j<fii> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f28014a;

    static {
        kge.a(801371638);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fii fiiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fiiVar}) : a(fiiVar);
    }

    public fkq(b bVar, fkw fkwVar, String str) {
        this.f28014a = fkwVar.t;
        fim.a(bVar.f(), str, fil.a(fii.class, ""), this);
    }

    public i a(fii fiiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("27508a5d", new Object[]{this, fiiVar});
        }
        if (fiiVar.g != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("navStart", (Object) Long.valueOf(this.f28014a));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apmConfigSend", (Object) jSONObject);
            fiiVar.g.a(jSONObject2);
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
