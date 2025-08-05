package com.taobao.desktop.common.request;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.khu;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DESKTOP_LINK_API = "mtop.alibaba.mobile.desktop.link.get";
    public static final String DESKTOP_LINK_API_VERSION = "1.0";
    public static final String DESKTOP_LINK_UNSIGN_API = "mtop.alibaba.mobile.desktop.link.weakget";
    public static final String DESKTOP_ROUTER_LINK_API = "mtop.taobao.afc.delayDp.get";
    public static final String WIDGET_TOP_API = "mtop.taobao.growth.starlink.config.get";

    public static void a(String str, String str2, Map<String, String> map, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7707b3", new Object[]{str, str2, map, cVar});
            return;
        }
        khu.a("requestData api" + str + "apiVersion" + str2 + "paramsMap" + map);
        a.a(str, str2, map, false, cVar, null);
    }

    public static void a(Map<String, String> map, boolean z, c cVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed941d55", new Object[]{map, new Boolean(z), cVar, handler});
            return;
        }
        khu.a("requestData paramsMap：" + map.toString() + ", unSign: " + z);
        if (z) {
            a.a(DESKTOP_LINK_UNSIGN_API, "1.0", map, true, cVar, handler);
        } else {
            a.a("mtop.alibaba.mobile.desktop.link.get", "1.0", map, false, cVar, handler);
        }
    }
}
