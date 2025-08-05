package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iah extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FROM = "from";
    public static final String KEY_RESULT = "stringifyAddCartResult";
    public static final String REFRESH_ACTION = "cartRefreshData";
    public static final String TAG = "cartRefreshV2";

    static {
        kge.a(872163892);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-2755057536428783720";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        JSONObject jSONObject = eVar.e().a().get("key$event_data");
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 != null) {
            jSONObject2.put("from", (Object) alz.BizKeyOrderList);
            str = jSONObject2.toJSONString();
        } else {
            str = "";
        }
        LocalBroadcastManager.getInstance(eVar.a()).sendBroadcast(new Intent("cartRefreshData").putExtra("stringifyAddCartResult", str));
    }
}
