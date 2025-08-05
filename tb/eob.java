package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.event.params.b;

/* loaded from: classes4.dex */
public class eob extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b f27487a;

    static {
        kge.a(-340963004);
    }

    public eob(JSONObject jSONObject) {
        String string = jSONObject.getString("itemId");
        long longValue = jSONObject.getLongValue("startTime");
        long longValue2 = jSONObject.getLongValue("endTime");
        String string2 = jSONObject.getString("itemUrl");
        String string3 = jSONObject.getString("title");
        String string4 = jSONObject.getString("salesSite");
        this.f27487a = new b(string, longValue, longValue2);
        b bVar = this.f27487a;
        bVar.d = string3;
        bVar.e = string2;
        bVar.f = string4;
        emu.a("com.taobao.android.detail.datasdk.event.jhs.RemindJhsWaitingEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27487a;
    }
}
