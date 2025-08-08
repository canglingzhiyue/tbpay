package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;

/* loaded from: classes6.dex */
public class hyg extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "reallyPayV2";

    static {
        kge.a(-1597094386);
    }

    public static /* synthetic */ Object ipc$super(hyg hygVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "2496968488994613456";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (eVar == null || eVar.i() == null) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", eVar == null ? "ultronEvent 为空" : "ultronEvent.getEventParams() 为空");
        } else if (!(eVar.i() instanceof DMEvent)) {
        } else {
            try {
                JSONObject jSONObject = e(eVar).getJSONObject("doPay").getJSONObject("data");
                if (jSONObject != null) {
                    if (!StringUtils.isEmpty(jSONObject.getString("actionUrl"))) {
                        c(eVar, "openUrl", a(jSONObject.getString("actionUrl")));
                    } else {
                        a(eVar, hye.SUBSCRIBER_ID, (JSONObject) null, jSONObject);
                    }
                    a.a().a(UltronTradeHybridStage.ON_DATA_PRE_LOAD, h(), jSONObject);
                    return;
                }
                Context a2 = eVar.a();
                hyq.c(a2, "ReallyPaySubscriber", "缺少  doPay 信息" + e(eVar).toJSONString());
            } catch (Throwable th) {
                bkd.a("ReallyPaySubscriber", "reallyPayV2-parseDataError", th.toString());
            }
        }
    }

    private JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageType", (Object) "H5");
        jSONObject.put("url", (Object) str);
        return jSONObject;
    }

    private String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (this.e != null && !StringUtils.isEmpty(this.e.g())) {
            if (this.e.g().equalsIgnoreCase(alz.BizKeyOrderList)) {
                return alz.BizKeyOrderList;
            }
            if (this.e.g().equalsIgnoreCase(alz.BizKeyOrderDetail)) {
                return alz.BizKeyOrderDetail;
            }
        }
        return "";
    }
}
