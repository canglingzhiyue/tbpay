package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"getRecommendSwitch", "queryRecommendSwitch"})
/* loaded from: classes3.dex */
public class f extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        JSONObject a2 = com.alibaba.wireless.aliprivacyext.f.a(str2);
        if (a2 == null) {
            b(bVar, "参数异常", null);
            return true;
        }
        String string = a2.getString("fromSource");
        if (StringUtils.isEmpty(string) && "queryRecommendSwitch".equals(str)) {
            b(bVar, "缺少fromSource参数,请联系业务方分配", null);
            return true;
        } else if (com.alibaba.wireless.aliprivacyext.recommendation.a.b(context)) {
            boolean a3 = com.alibaba.wireless.aliprivacyext.recommendation.a.a(context);
            HashMap hashMap = new HashMap();
            hashMap.put("switch", Boolean.valueOf(a3));
            a(bVar, "调用成功", hashMap);
            a(context, "noUidExt", str, string, str2);
            return true;
        } else {
            com.alibaba.wireless.aliprivacyext.recommendation.e a4 = com.alibaba.wireless.aliprivacyext.recommendation.c.a().a(string);
            boolean recommendSwitchBooleanStatus = a4.getRecommendSwitchBooleanStatus();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("switch", Boolean.valueOf(recommendSwitchBooleanStatus));
            a(bVar, "调用成功", hashMap2);
            a(context, a4.getStatus(), str, string, str2);
            return true;
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : "queryRecommendSwitch".equals(str) ? "OpenJSBridge" : "CROJSBridge";
    }

    private void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{this, context, str, str2, str3, str4});
        } else {
            TrackLog.trackQueryRecommendStatusLog(context, str, a(str2), str3, str4);
        }
    }
}
