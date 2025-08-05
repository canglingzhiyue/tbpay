package tb;

import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.Map;

/* loaded from: classes4.dex */
public class enu extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String e;

    /* renamed from: a  reason: collision with root package name */
    public String f27479a;
    public Bundle b;
    public Map<String, String> c;
    public String d;

    static {
        kge.a(-1277185675);
        e = enu.class.getSimpleName();
    }

    public enu(String str) {
        this.f27479a = str;
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenUrlEvent");
    }

    public enu(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f27479a = epw.a(jSONObject.getString("url"));
            JSONObject jSONObject2 = jSONObject.getJSONObject(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS);
            if (jSONObject2 != null) {
                Uri.Builder buildUpon = Uri.parse(this.f27479a).buildUpon();
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        buildUpon.appendQueryParameter(key, value.toString());
                    }
                }
                this.f27479a = buildUpon.toString();
            }
        }
        emu.a("com.taobao.android.detail.datasdk.event.basic.OpenUrlEvent");
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a5850f14", new Object[]{this}) : this.f27479a;
    }
}
