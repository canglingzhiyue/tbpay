package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.a;

/* loaded from: classes8.dex */
public class opm implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1074316307);
        kge.a(1996923139);
    }

    @Override // com.taobao.tao.recommend3.gateway.prefetch.tschedule.a
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        Uri a2 = a(str);
        if (!a(a2, jSONObject)) {
            lap.a("recmdPrefetch", "PaySuccessRecmdPrefetch", "不符合预请求条件");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        JSONObject a3 = a(a2);
        if (a3 != null && !a3.isEmpty()) {
            jSONObject2.putAll(a3);
        }
        osd.a(ksk.REC_PAY_SUCCESS).b(a(jSONObject), jSONObject2);
        opr.a(opr.OPTIMIZE_TYPE_PS_T_SCHEDULE);
        opr.b("tschedule");
        lap.a("recmdPrefetch", "PaySuccessRecmdPrefetch", "预请求准备发起了");
    }

    private JSONObject a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5579f4ff", new Object[]{this, uri});
        }
        String queryParameter = uri.getQueryParameter("bizParams");
        JSONObject jSONObject = new JSONObject();
        try {
            return JSON.parseObject(queryParameter);
        } catch (Exception e) {
            lap.a("recmdPrefetch", "PaySuccessRecmdPrefetch", "解析上行参数出现异常: " + e);
            return jSONObject;
        }
    }

    private boolean a(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8dc2cf5", new Object[]{this, uri, jSONObject})).booleanValue();
        }
        if (uri == null) {
            lap.a("recmdPrefetch", "PaySuccessRecmdPrefetch", "链接为空");
            return false;
        } else if (jSONObject.isEmpty()) {
            lap.a("recmdPrefetch", "PaySuccessRecmdPrefetch", "预加载任务参数为空");
            return false;
        } else {
            return uri.getBooleanQueryParameter("isPreRequestEnable", false);
        }
    }

    private Uri a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("ccfd7169", new Object[]{this, str});
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            lap.a("recmdPrefetch", "PaySuccessRecmdPrefetch", "解析链接出现异常: " + e);
            return null;
        }
    }

    private ksn a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksn) ipChange.ipc$dispatch("290332b8", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("api");
        String string2 = jSONObject.getString("version");
        lap.a("recmdPrefetch", "PaySuccessRecmdPrefetch", "api：" + string + "api version: " + string2);
        return new ksn(string, string2);
    }
}
