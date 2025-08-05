package tb;

import android.app.Activity;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.helper.h;
import com.taobao.android.order.bundle.helper.i;
import com.taobao.android.order.bundle.ultron.module.ReallyPayFiles;

/* loaded from: classes6.dex */
public class hye extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "alipayV2";

    static {
        kge.a(-316182007);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "1060987294545483898";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        hyn.a("AliPaySubscriber", "onHandleEventChain", "----");
        ReallyPayFiles reallyPayFiles = (ReallyPayFiles) i.a(eVar.c("key$event_data"), ReallyPayFiles.class);
        if (reallyPayFiles == null) {
            return;
        }
        if (reallyPayFiles.orderIds != null && reallyPayFiles.orderIds.size() > 1) {
            reallyPayFiles.orderIds = null;
        }
        if (!h.a((Activity) eVar.a(), reallyPayFiles)) {
            hyq.d(eVar.a(), "AliPaySubscriber", "act == null || dataObj == null");
        }
        if (!iro.b("waitPay", "")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context", (Object) eVar.a());
        a.a().a(UltronTradeHybridStage.ON_RENDER_END, "waitPay", jSONObject);
    }
}
