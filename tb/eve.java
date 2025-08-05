package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class eve implements Event {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27595a = null;
    private Map<String, String> b = null;

    static {
        kge.a(332125970);
        kge.a(-1834561497);
    }

    @Override // com.taobao.android.trade.event.Event
    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return 20605;
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public eve() {
        tpc.a("com.taobao.android.detail.sdk.event.bottom.BuyNowClickedEvent");
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extraBuyParams");
        if (jSONObject2 == null) {
            return;
        }
        this.b = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            if (entry != null && entry.getValue() != null) {
                String obj = entry.getValue().toString();
                if (TextUtils.isEmpty(obj)) {
                    obj = "";
                }
                this.b.put(entry.getKey(), obj);
            }
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("SKUBuyNowButtonText");
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            this.f27595a = string;
        }
    }

    public eve(JSONObject jSONObject) {
        try {
            a(jSONObject);
            b(jSONObject);
        } catch (Exception unused) {
        }
        tpc.a("com.taobao.android.detail.sdk.event.bottom.BuyNowClickedEvent");
    }
}
