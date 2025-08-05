package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.vmodel.main.TitleViewModel;
import com.taobao.android.trade.event.Event;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class evp implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TitleViewModel.ShareType f27603a;
    public Map<String, String> b;
    public String c;

    static {
        kge.a(-30509433);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20201;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public evp() {
        tpc.a("com.taobao.android.detail.sdk.event.title.ShareEvent");
    }

    public evp(TitleViewModel.ShareType shareType) {
        this.f27603a = shareType;
        tpc.a("com.taobao.android.detail.sdk.event.title.ShareEvent");
    }

    public evp(TitleViewModel.ShareType shareType, JSONObject jSONObject) {
        this.f27603a = shareType;
        this.c = jSONObject.getString("detailShareScene");
        JSONObject jSONObject2 = jSONObject.getJSONObject("detailShareParams");
        if (jSONObject2 != null) {
            this.b = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.b.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        tpc.a("com.taobao.android.detail.sdk.event.title.ShareEvent");
    }
}
