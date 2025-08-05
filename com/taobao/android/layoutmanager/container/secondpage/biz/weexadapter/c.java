package com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter;

import android.net.Uri;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f13222a;

    static {
        kge.a(-1765047833);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean C = oeb.C();
        ogg.a("ProfileWeexService", "enableWeex:" + C);
        return C;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (TextUtils.isEmpty(f13222a)) {
            f13222a = oeb.a("weitao_switch.WeexNewProfilePageURL", EnvironmentSwitcher.a() == EnvironmentSwitcher.EnvType.OnLINE.getValue() ? "https://web.m.taobao.com/app/tbvideo/profile/Home?wh_weex=true&weex_mode=dom&wx_navbar_transparent=true&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&disableNav=YES" : "https://web.wapa.taobao.com/app/tbvideo/profile/Home?wh_weex=true&weex_mode=dom&wx_navbar_transparent=true&wx_navbar_hidden=true&_wx_statusbar_hidden=true&wx_use_layoutng=true&disableNav=YES");
            ogg.a("ProfileWeexService", "getProfileWeexUrl:" + f13222a);
        }
        return f13222a;
    }

    public static Map<String, Object> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    public static Uri b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("c9854db5", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        Map<String, Object> a2 = a(uri);
        StringBuilder sb = new StringBuilder(b());
        for (Map.Entry<String, Object> entry : a2.entrySet()) {
            sb.append("&");
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(Uri.encode(entry.getValue().toString()));
        }
        return Uri.parse(sb.toString());
    }
}
