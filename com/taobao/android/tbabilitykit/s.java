package com.taobao.android.tbabilitykit;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dle;
import tb.dlp;
import tb.jal;
import tb.kge;

/* loaded from: classes.dex */
public class s implements dlp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-675527505);
        kge.a(-174523748);
    }

    @Override // tb.dlp
    public dkx a(dle dleVar, String str, String str2, JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("619c2c54", new Object[]{this, dleVar, str, str2, jSONObject});
        }
        if (dleVar == null) {
            return new dkw(new dkv(10004, "ut异常error context为空"), false);
        }
        if ("updatePageName".equals(str)) {
            if (TextUtils.isEmpty(str2)) {
                return new dkw(new dkv(10004, "ut异常error updatePageName pageName为空"), false);
            }
            Context a3 = dleVar.a();
            if (a3 == null) {
                return new dkw(new dkv(10004, "ut异常error updatePageName activity 为空"), false);
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(a3, str2);
                return new dla();
            } catch (Throwable unused) {
                return new dkw(new dkv(10004, "ut异常error updatePageName"), false);
            }
        } else if (com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_NEXT_PAGE_PROPERTIES.equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(a(jSONObject));
                return new dla();
            } catch (Throwable unused2) {
                return new dkw(new dkv(10004, "ut异常error updateNextPageProperties"), false);
            }
        } else if (com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGE_PROPERTIES.equals(str)) {
            Context a4 = dleVar.a();
            if (a4 == null) {
                return new dkw(new dkv(10004, "ut异常error updatePageProperties activity 为空"), false);
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(a4, a(jSONObject));
                return new dla();
            } catch (Throwable unused3) {
                return new dkw(new dkv(10004, "ut异常error updatePageProperties"), false);
            }
        } else if ("updateNextPageUtparam".equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(a(jSONObject)));
                return new dla();
            } catch (Throwable unused4) {
                return new dkw(new dkv(10004, "ut异常error updateNextPageUtparam"), false);
            }
        } else if ("updateNextPageUtparamCnt".equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparamCnt(JSON.toJSONString(a(jSONObject)));
                return new dla();
            } catch (Throwable unused5) {
                return new dkw(new dkv(10004, "ut异常error updateNextPageUtparamCnt"), false);
            }
        } else if (com.alibaba.triver.triver_shop.newShop.ext.m.UPDATE_PAGE_UTPARAM.equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(dleVar.a(), JSON.toJSONString(a(jSONObject)));
                return new dla();
            } catch (Throwable unused6) {
                return new dkw(new dkv(10004, "ut异常error updatePageUtparamCnt"), false);
            }
        } else {
            if ("click".equals(str)) {
                a2 = 2101;
            } else if ("componentExposure".equals(str)) {
                a2 = 2201;
            } else if ("pageExposure".equals(str)) {
                a2 = 2001;
            } else if (TextUtils.isEmpty(str)) {
                return new dkw(new dkv(10004, "utAction 为空"), false);
            } else {
                a2 = a(str);
            }
            if (a2 == -1) {
                return new dkw(new dkv(10004, "utAction 不符合eventId规则"), false);
            }
            return jal.a(a2, str2, jSONObject);
        }
    }

    private Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, String.valueOf(value));
                }
            }
        }
        return hashMap;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
