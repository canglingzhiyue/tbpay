package com.etao.feimagesearch.util;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(762724709);
        Companion = new a(null);
    }

    @JvmStatic
    public static final void a(com.taobao.android.weex_framework.p pVar, String str, String str2, JSONObject jSONObject, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6da84e", new Object[]{pVar, str, str2, jSONObject, map});
        } else {
            Companion.a(pVar, str, str2, jSONObject, map);
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1625066899);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final void a(com.taobao.android.weex_framework.p pVar, String str, String str2, JSONObject jSONObject, Map<String, ? extends Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b6da84e", new Object[]{this, pVar, str, str2, jSONObject, map});
            } else if (pVar == null) {
            } else {
                try {
                    pVar.initWithURL(Uri.parse(str));
                    if (!StringUtils.equals(str, str2)) {
                        pVar.addInstanceEnv("bundleUrl", str2);
                    }
                    com.taobao.android.weex_framework.r monitorInfo = pVar.getMonitorInfo();
                    kotlin.jvm.internal.q.a((Object) monitorInfo, "instance.monitorInfo");
                    monitorInfo.d(str);
                    com.taobao.android.weex_framework.r monitorInfo2 = pVar.getMonitorInfo();
                    kotlin.jvm.internal.q.a((Object) monitorInfo2, "instance.monitorInfo");
                    monitorInfo2.a(str2);
                    pVar.render(jSONObject, map);
                } catch (Exception unused) {
                    pVar.renderByUrl(str, str2, jSONObject, map);
                }
            }
        }
    }
}
