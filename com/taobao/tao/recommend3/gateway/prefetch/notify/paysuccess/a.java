package com.taobao.tao.recommend3.gateway.prefetch.notify.paysuccess;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import tb.kge;
import tb.ksk;
import tb.ksn;
import tb.lap;
import tb.opr;
import tb.osd;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1901895369);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!c(str)) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "服务端开关、orange等检测没通过");
        } else {
            Uri b = b(str);
            JSONObject a2 = a();
            if (!a(b, a2)) {
                lap.a("recmdPrefetch", "PrefetchReceiver", "url检测没通过");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TSRecmdReqPrefetch.PREFETCH_PARAMS, (Object) a2);
            JSONObject jSONObject2 = a2.getJSONObject("apiParams");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                jSONObject.putAll(jSONObject2);
            }
            JSONObject a3 = a(b);
            if (a3 != null && !a3.isEmpty()) {
                jSONObject.putAll(a3);
            }
            opr.a(opr.OPTIMIZE_TYPE_PS_ORDER);
            osd.a(ksk.REC_PAY_SUCCESS).b(a(a2), jSONObject);
            lap.a("recmdPrefetch", "PrefetchReceiver", "预请求准备发起了");
        }
    }

    private JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        try {
            return JSONObject.parseObject(j.a("preRequestParams", "{\"api\":\"mtop.taobao.wireless.home.awesome.trade.recommend\",\"version\":\"1.0\",\"timeout\":\"90000\",\"ignores\":[\"clientReqTime\",\"abtest\",\"commonBizParams\", \"globalLbs\"],\"apiParams\":{\"appid\":\"8219\"}}"));
        } catch (Exception e) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "获取预请求配置出现异常：" + e);
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
        lap.a("recmdPrefetch", "PrefetchReceiver", "api: " + string + "apiVersion:" + string2);
        return new ksn(string, string2);
    }

    private JSONObject a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5579f4ff", new Object[]{this, uri});
        }
        if (uri == null) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "uri == null");
            return null;
        }
        String queryParameter = uri.getQueryParameter("bizParams");
        JSONObject jSONObject = new JSONObject();
        try {
            return JSONObject.parseObject(queryParameter);
        } catch (Exception e) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "解析上行参数出现异常: " + e);
            return jSONObject;
        }
    }

    private Uri b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("95fe68aa", new Object[]{this, str});
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "解析链接出现异常: " + e);
            return null;
        }
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "intent == null");
            return false;
        } else if (j.a("paySuccessOrderEnable", true)) {
            return true;
        } else {
            lap.a("recmdPrefetch", "PrefetchReceiver", "orange开关是关的");
            return false;
        }
    }

    private boolean a(Uri uri, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8dc2cf5", new Object[]{this, uri, jSONObject})).booleanValue();
        }
        if (uri == null) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "链接为空");
            return false;
        } else if (jSONObject == null || jSONObject.isEmpty()) {
            lap.a("recmdPrefetch", "PrefetchReceiver", "预加载任务参数为空");
            return false;
        } else {
            return uri.getBooleanQueryParameter("isPreRequestEnable", false);
        }
    }
}
