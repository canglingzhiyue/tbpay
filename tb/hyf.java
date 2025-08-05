package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.helper.h;
import com.taobao.mtop.wvplugin.a;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class hyf extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "alipayBindV2";

    static {
        kge.a(-1343750938);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "6582404051474426395";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        JSONArray jSONArray;
        String str;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        hyn.a("BindAliPaySubcriber", "onHandleEventChain", "----");
        try {
            JSONObject jSONObject = e(eVar).getJSONObject("doPay");
            if (jSONObject == null || (jSONArray = jSONObject.getJSONArray(a.RESULT_KEY)) == null || (split = (str = (String) jSONArray.get(0)).split("::")) == null || split.length <= 1) {
                return;
            }
            if (CoreConstants.MTOP_BIZ_DOPAY_ERROR_CODE.equals(split[0])) {
                h.a(eVar.a(), jSONObject.getJSONObject("data").getString("signStr"));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(arz.KEY_RET_MSG, str);
            hyq.a(eVar.a(), "BindAliPaySubcriber", "onHandleEventChain", str, split[1], hashMap);
            com.alibaba.android.ultron.vfw.widget.a.a(this.d, split[1]);
        } catch (Throwable th) {
            hyq.c(this.d, "BindAliPaySubcriber", "onHandleEventChain", th.toString(), null);
        }
    }
}
