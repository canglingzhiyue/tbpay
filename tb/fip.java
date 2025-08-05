package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fip implements j<fio> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private flz f27978a;

    static {
        kge.a(-295429635);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fio fioVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fioVar}) : a(fioVar);
    }

    public fip(flz flzVar) {
        this.f27978a = flzVar;
    }

    public i a(fio fioVar) {
        JSONObject jSONObject;
        d dVar;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("9d3f7f63", new Object[]{this, fioVar});
        }
        if (fioVar == null || (jSONObject = fioVar.f27977a) == null || (dVar = (d) jSONObject.get("VerticalItemNode")) == null) {
            return null;
        }
        try {
            i = Integer.parseInt(jSONObject.getString("eventId"));
        } catch (Exception unused) {
            fjt.a("UserTrackSubscribe", "eventId解析失败，eventId：" + jSONObject.getString("eventId"));
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        String string = jSONObject.getString("arg1");
        String string2 = jSONObject.getString("arg2");
        String string3 = jSONObject.getString("arg3");
        JSONObject jSONObject2 = (JSONObject) jSONObject.get("args");
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (String str : jSONObject2.keySet()) {
                hashMap.put(str, jSONObject2.getString(str));
            }
        }
        if (i == 2101) {
            this.f27978a.a(dVar.g, string, string2, string3, hashMap, dVar, true);
        } else if (i == 2201) {
            this.f27978a.b(dVar.g, string, string2, string3, hashMap, dVar);
        }
        return null;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
