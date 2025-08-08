package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fcu extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f27811a = null;
    private Map<String, String> b = null;

    static {
        kge.a(-1913621379);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fcu() {
        emu.a("com.taobao.android.detail.wrapper.ext.event.bottom.BuyNowClickedEvent");
    }

    public fcu(JSONObject jSONObject) {
        try {
            a(jSONObject);
            b(jSONObject);
        } catch (Exception e) {
            i.b("BuyNowClickedEvent", "BuyNowClickedEvent init exception :", e);
        }
        emu.a("com.taobao.android.detail.wrapper.ext.event.bottom.BuyNowClickedEvent");
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f27811a;
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("extraBuyParams")) != null) {
            this.b = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                if (entry != null && entry.getValue() != null) {
                    String obj = entry.getValue().toString();
                    if (StringUtils.isEmpty(obj)) {
                        obj = "";
                    }
                    this.b.put(entry.getKey(), obj);
                }
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
            if (StringUtils.isEmpty(string)) {
                string = "";
            }
            this.f27811a = string;
        }
    }
}
