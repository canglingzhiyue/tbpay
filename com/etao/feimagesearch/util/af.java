package com.etao.feimagesearch.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.Map;
import tb.cof;
import tb.cox;
import tb.ctc;
import tb.kge;

/* loaded from: classes4.dex */
public class af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SCAN_SPM = "a2141.b85463733.0.0";

    static {
        kge.a(-1933619893);
    }

    public static void a(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!com.etao.feimagesearch.config.b.cp()) {
        } else {
            JSONObject jSONObject = null;
            try {
                Map<String, String> pageProperties = UTAnalytics.getInstance().getDefaultTracker().getPageProperties(context);
                if (pageProperties != null) {
                    String str2 = pageProperties.get("utLogMap");
                    if (!StringUtils.isEmpty(str2)) {
                        jSONObject = JSON.parseObject(str2);
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("rainbow", (Object) cof.a());
            try {
                str = URLEncoder.encode(jSONObject.toJSONString(), "utf-8");
            } catch (Exception unused2) {
                str = "";
            }
            cox.a(context, "utLogMap", str);
        }
    }

    public static void a(ctc ctcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e96c80e", new Object[]{ctcVar, new Boolean(z)});
        } else if (z) {
            cox.a(ctcVar.s(), "Page_PhotoSearchScan");
            cox.a(ctcVar.s(), "spm-cnt", "a2141.b85463733", "rainbow", cof.a(), "pssource", ctcVar.h().getPssource(), com.etao.feimagesearch.p.KEY_DEVICE_TYPE, com.etao.feimagesearch.p.a());
            a(ctcVar.s());
            ctcVar.h().setPageSpm(SCAN_SPM);
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(ctcVar.s(), "Page_PhotoSearchScan");
        } else {
            if (!com.etao.feimagesearch.config.b.cM()) {
                cox.a(ctcVar.s(), "rainbow", cof.a());
            }
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(ctcVar.s());
        }
    }
}
