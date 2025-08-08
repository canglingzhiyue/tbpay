package com.alibaba.wireless.aliprivacyext.jsbridge.api;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

@com.alibaba.wireless.aliprivacyext.jsbridge.c(name = {"getPrivacyProfile"})
/* loaded from: classes3.dex */
public class e extends com.alibaba.wireless.aliprivacyext.jsbridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.wireless.aliprivacyext.jsbridge.a
    public boolean a(Context context, String str, String str2, com.alibaba.wireless.aliprivacyext.plugins.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, bVar})).booleanValue();
        }
        com.alibaba.wireless.aliprivacy.c.a("GetRecommendSwitchApi", "GetPrivacyProfileApi start: " + str2);
        JSONObject a2 = com.alibaba.wireless.aliprivacyext.f.a(str2);
        if (a2 == null) {
            com.alibaba.wireless.aliprivacy.c.b("GetRecommendSwitchApi", "GetPrivacyProfileApi jsonObject == null");
            b(bVar, "参数异常", null);
            return true;
        }
        String string = a2.getString("profile");
        if (StringUtils.isEmpty(string)) {
            com.alibaba.wireless.aliprivacy.c.b("GetRecommendSwitchApi", "GetPrivacyProfileApi StringUtils.isEmpty(profile)");
            b(bVar, "参数异常", null);
            return true;
        }
        String a3 = com.alibaba.wireless.aliprivacyext.recommendation.b.a(context, string);
        com.alibaba.wireless.aliprivacy.c.a("GetRecommendSwitchApi", "GetPrivacyProfileApi end: " + a3);
        HashMap hashMap = new HashMap();
        hashMap.put(string, a3);
        a(bVar, "调用成功", hashMap);
        return true;
    }
}
