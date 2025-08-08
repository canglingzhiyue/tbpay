package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.request.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ultronengine.event.s;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.tao.log.statistics.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(257478028);
    }

    public static Map<String, String> a(Activity activity, QueryParamsManager queryParamsManager, String str, Map<String, String> map) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c4b39d1", new Object[]{activity, queryParamsManager, str, map});
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            jSONObject.putAll(map);
        }
        jSONObject.put(RequestConfig.IS_ICART_IS_FIRST_REQUEST, (Object) "true");
        jSONObject.put("globalSell", (Object) "1");
        jSONObject.put("mergeCombo", (Object) "true");
        jSONObject.put("version", (Object) "1.1.1");
        if (bgd.a()) {
            jSONObject.put(d.PARAM_IS_INNER, (Object) String.valueOf(bgd.a()));
        }
        String a2 = ben.a(activity);
        if (!StringUtils.isEmpty(a2)) {
            jSONObject.put("shopIdInfoStr", (Object) a2);
        }
        String c = e.c(queryParamsManager.a());
        if (!StringUtils.isEmpty(c)) {
            jSONObject.put(s.DIVISION_CODE, (Object) c);
        }
        if (queryParamsManager.h()) {
            jSONObject.put(RequestConfig.IS_FULL_DATA_QUERY, (Object) "true");
        }
        if (queryParamsManager.i() && !queryParamsManager.k()) {
            if (!CheckHoldManager.a().c().isEmpty()) {
                jSONObject.put("iCheckedCartIds", (Object) CheckHoldManager.a().d());
            }
            if (!CheckHoldManager.a().e().isEmpty()) {
                jSONObject.put("iCheckedCartIdsForRepeatBuy", (Object) CheckHoldManager.a().e());
            }
        }
        if (!StringUtils.isEmpty(bcd.a().c())) {
            jSONObject.put("addressId", (Object) bcd.a().c());
        }
        if (queryParamsManager.b() != null) {
            jSONObject.put("cartSortParams", (Object) queryParamsManager.b());
        }
        String d = queryParamsManager.d();
        if (!StringUtils.isEmpty(d)) {
            jSONObject.put("cartCustomExParam", (Object) d);
        }
        String n = queryParamsManager.n();
        if (!StringUtils.isEmpty(n)) {
            jSONObject.put("holdCustomExParams", (Object) n);
        }
        if (str != null) {
            jSONObject.put("instanceId", (Object) str);
        }
        jSONObject.put("requestTimeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
        try {
            z = false;
            for (String str2 : bea.p()) {
                try {
                    if (!z2) {
                        z2 = khz.b(str2);
                    }
                    if (!z) {
                        z = khz.a(str2);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            z = false;
        }
        jSONObject.put(RequestConfig.IS_SUPPORT_WIDGET, (Object) String.valueOf(z2));
        jSONObject.put(RequestConfig.IS_WIDGET_INSTALLED, (Object) String.valueOf(z));
        HashMap hashMap = new HashMap();
        hashMap.put("exParams", jSONObject.toJSONString());
        return hashMap;
    }
}
