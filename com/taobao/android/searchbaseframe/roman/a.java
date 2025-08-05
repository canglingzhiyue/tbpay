package com.taobao.android.searchbaseframe.roman;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLT_CAMERA = "plt-camera";
    public static final String PLT_CAMERA_I18N = "i18n-camera-page-2023";
    public static final String PLT_CAMERA_TAB_3 = "plt_camera_page_tab3";
    public static final String PLT_IRP = "image-search-2022";
    public static final String PLT_IRP_I18N = "i18n-image-search-2022";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, com.taobao.android.searchbaseframe.util.e<String, Integer>> f14996a;

    static {
        kge.a(1626724269);
        f14996a = new HashMap<String, com.taobao.android.searchbaseframe.util.e<String, Integer>>() { // from class: com.taobao.android.searchbaseframe.roman.BuiltinFallbackMatcher$1
            {
                put(a.PLT_CAMERA, com.taobao.android.searchbaseframe.util.e.a("https://g.alicdn.com/asr-pages/camera-page-2023/0.0.49/weex/home.v20.wlm", 23));
                put("plt_camera_page_tab3", com.taobao.android.searchbaseframe.util.e.a("https://g.alicdn.com/asr-pages/plt_camera_page_tab3/0.0.1/weex/home.v20.wlm", 1));
                put(a.PLT_CAMERA_I18N, com.taobao.android.searchbaseframe.util.e.a("https://g.alicdn.com/tmall-ovs-rax/i18n-camera-page-2023/0.0.55/weex/home.v20.wlm", 1));
                put(a.PLT_IRP, com.taobao.android.searchbaseframe.util.e.a("https://g.alicdn.com/imagesearch-page/image-search-2022/1.0.50/weex/home.v20.wlm", 1));
            }
        };
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : com.alibaba.ability.localization.b.c() ? "i18n-camera-page-2023,i18n-image-search-2022" : "plt-camera,image-search-2022,plt_camera_page_tab3";
    }

    public static com.taobao.android.searchbaseframe.util.e<String, Integer> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.util.e) ipChange.ipc$dispatch("370be91d", new Object[]{str}) : f14996a.get(str);
    }
}
