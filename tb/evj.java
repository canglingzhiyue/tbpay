package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.params.b;
import com.taobao.android.trade.event.Event;

/* loaded from: classes4.dex */
public class evj implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f27598a;

    static {
        kge.a(-167287890);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20702;
    }

    public evj(JSONObject jSONObject) {
        String string = jSONObject.getString("itemId");
        long longValue = jSONObject.getLongValue("startTime");
        long longValue2 = jSONObject.getLongValue("endTime");
        String string2 = jSONObject.getString("itemUrl");
        String string3 = jSONObject.getString("title");
        String string4 = jSONObject.getString("salesSite");
        this.f27598a = new b(string, longValue, longValue2);
        b bVar = this.f27598a;
        bVar.d = string3;
        bVar.e = string2;
        bVar.f = string4;
        tpc.a("com.taobao.android.detail.sdk.event.jhs.RemindJhsWaitingEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27598a;
    }
}
