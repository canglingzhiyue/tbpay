package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fck extends eoc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NEED_ADDRESS_ID_KEY = "needAddressId";

    /* renamed from: a  reason: collision with root package name */
    public String f27802a;
    public JSONObject b;

    static {
        kge.a(-379908715);
    }

    @Override // tb.eoc, com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public fck(JSONObject jSONObject) {
        String str;
        if (!TextUtils.isEmpty(jSONObject.getString("url"))) {
            this.f27802a = jSONObject.getString("url");
        } else {
            this.f27802a = "";
        }
        if (!TextUtils.isEmpty(jSONObject.getString("params"))) {
            this.b = jSONObject.getJSONObject("params");
        } else {
            this.b = new JSONObject();
        }
        if (this.b != null && (str = this.f27802a) != null && str.contains("needAddressId=true")) {
            this.b.put("needAddressId", (Object) Boolean.TRUE.toString());
        }
        emu.a("com.taobao.android.detail.wrapper.ext.event.basic.OpenCommonFloatWeexDialogEvent");
    }
}
