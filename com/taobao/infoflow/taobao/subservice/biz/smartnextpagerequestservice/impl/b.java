package com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f17535a;

    static {
        kge.a(75796760);
        f17535a = new String[]{"netLevel", "scrollingSpeed", "predictStayDur", "predictRequestCost", "predictAlgoStayDur"};
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return BUFS.getIntentions("home.recmd.loading", "PageHome");
        } catch (Throwable th) {
            ldf.a("NextPageBxIntention", "getNextPageBxIntention error", th);
            return null;
        }
    }

    public static JSONObject a(String str) {
        JSONObject jSONObject;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Throwable th) {
            ldf.a("NextPageBxIntention", "getNextPageBxIntention error", th);
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : f17535a) {
            if (jSONObject.containsKey(str2)) {
                jSONObject2.put(str2, (Object) jSONObject.getString(str2));
            }
        }
        return jSONObject2;
    }
}
