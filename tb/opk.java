package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.a;

/* loaded from: classes8.dex */
public class opk implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2092236866);
        kge.a(1996923139);
    }

    @Override // com.taobao.tao.recommend3.gateway.prefetch.tschedule.a
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        ksk b = ksk.b(jSONObject.getString("channel"));
        if (!a(b, jSONObject)) {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "不符合预请求条件");
            return;
        }
        Uri a2 = a(str);
        if (a2 == null) {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "uri为空");
            return;
        }
        ksn a3 = a(jSONObject);
        JSONObject a4 = a(a2, jSONObject);
        osd a5 = osd.a(b);
        if (a5 == null) {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "container == null");
            return;
        }
        a5.b(a3, a4);
        opr.a(opr.OPTIMIZE_TYPE_T_SCHEDULE);
        opr.b("tschedule");
        lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "预请求准备发起了");
    }

    private boolean a(ksk kskVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee84a19f", new Object[]{this, kskVar, jSONObject})).booleanValue();
        }
        if (!j.a("tScheduleEnable", true)) {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "orange开关是关的");
            return false;
        } else if (kskVar == null) {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "gatewayContainerType == null");
            return false;
        } else if (!"tschedule".equals(opt.a(kskVar.a()))) {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "服务端开关没下发");
            return false;
        } else if (!jSONObject.isEmpty()) {
            return true;
        } else {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "预请求参数为空");
            return false;
        }
    }

    private JSONObject a(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cd82d411", new Object[]{this, uri, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) jSONObject);
        JSONObject jSONObject3 = jSONObject.getJSONObject("apiParams");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            jSONObject2.putAll(jSONObject3);
        }
        JSONObject a2 = a(uri);
        if (a2 != null && !a2.isEmpty()) {
            jSONObject2.putAll(a2);
        }
        return jSONObject2;
    }

    private JSONObject a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5579f4ff", new Object[]{this, uri});
        }
        try {
            return JSON.parseObject(uri.getQueryParameter("bizParams"));
        } catch (Exception e) {
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "解析上行参数出现异常: " + e);
            return null;
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
            lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "解析链接出现异常: " + e);
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
        lap.a("recmdPrefetch", "AfterBuyCommonPrefetch", "api：" + string + "api version: " + string2);
        return new ksn(string, string2);
    }
}
