package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes4.dex */
public class enr extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27475a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-1195232475);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "优惠券";
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public enr(JSONObject jSONObject) {
        this.f27475a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        if (jSONObject != null) {
            this.f27475a = epw.a(jSONObject.getString("url"));
            this.b = epw.a(jSONObject.getString("itemId"));
            this.c = epw.a(jSONObject.getString("sellerId"));
            this.d = epw.a(jSONObject.getString("shopId"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("url_params");
            if (jSONObject2 != null) {
                Uri.Builder buildUpon = Uri.parse(this.f27475a).buildUpon();
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue().toString());
                }
                this.f27475a = buildUpon.toString();
            }
        }
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenCouponViewEvent");
    }
}
