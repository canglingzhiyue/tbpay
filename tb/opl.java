package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.a;

/* loaded from: classes8.dex */
public class opl implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-493120216);
        kge.a(1996923139);
    }

    @Override // com.taobao.tao.recommend3.gateway.prefetch.tschedule.a
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        String b = b(str);
        if (TextUtils.isEmpty(b)) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetch", "tab为空，无法识别是什么场景");
            return;
        }
        JSONObject a2 = a(jSONObject);
        if (a2 == null || a2.isEmpty()) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetch", "预请求参数为空");
            return;
        }
        ksk a3 = a(b);
        int a4 = opj.a();
        lap.a("recmdPrefetch", "OrderListRecmdPrefetch", "预请求准备发起了");
        oph.a(a2, a3, a4);
        opr.b("tschedule");
        opr.a(opr.OPTIMIZE_TYPE_ORDER_LIST_T_SCHEDULE);
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject.isEmpty()) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetch", "预加载任务参数为空");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        return jSONObject2;
    }

    private ksk a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksk) ipChange.ipc$dispatch("7c71ae71", new Object[]{this, str});
        }
        if (ops.b(str) > 0) {
            return ksk.REC_ORDER_LIST_CATAPULT;
        }
        return ksk.REC_ORDER_LIST;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        Uri c = c(str);
        if (c == null) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetch", "uri为null");
            return null;
        }
        return ops.a(c);
    }

    private Uri c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5eff5feb", new Object[]{this, str});
        }
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            lap.a("recmdPrefetch", "OrderListRecmdPrefetch", "uri解析失败");
            return null;
        }
    }
}
