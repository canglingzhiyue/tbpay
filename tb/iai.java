package tb;

import com.alibaba.android.ultron.event.ext.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.constants.OrderBizCode;

/* loaded from: classes6.dex */
public class iai extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-756694062);
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (!(jSONObject.get("alert") instanceof JSONObject)) {
            bkd.a(getClass().getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "没有alert");
            bxb.a(OrderBizCode.orderList, "删除订单失败#缺少Alert字段", "没有alert");
            return null;
        }
        JSONObject a2 = a.a(bkg.a(jSONObject));
        if (a2 == null) {
            bkd.a(getClass().getSimpleName(), "buildCombineEvent", "EVENT_CHAIN_PARAMS_VALID_ERROR", "构建alert事件失败");
            bxb.a(OrderBizCode.orderList, "删除订单失败#构建alert事件失败", "构建alert事件失败");
            return null;
        }
        JSONObject a3 = bkg.a(jSONObject);
        a3.remove("alert");
        JSONObject a4 = a(a2, "confirm", "refreshMtopV2", a3);
        a(a4, "success", "refreshPageV2", (JSONObject) null);
        if ((jSONObject.get("from") instanceof String) && alz.BizKeyOrderDetail.equals(jSONObject.getString("from"))) {
            a(a4, "success", "closePageV2", (JSONObject) null);
        }
        return a2;
    }
}
