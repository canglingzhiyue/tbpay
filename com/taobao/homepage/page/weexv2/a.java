package com.taobao.homepage.page.weexv2;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.topmultitab.c;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DOM = "dom";
    public static final String KEY_MUS = "mus";
    public static final String KEY_WEEX_MODE = "weex_mode";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f17246a;

    static {
        kge.a(-1045684198);
        f17246a = false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "second_floor_shake_open", "true"));
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        if (f17246a != z) {
            if (z) {
                e.e("WeexSecondFloorUtils", "当前在二楼");
                c.a().I();
            } else {
                e.e("WeexSecondFloorUtils", "当前退出二楼");
                c.a().J();
            }
        }
        f17246a = z;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : f17246a;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "weex_textureView_change_open", "true"));
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            e.e("WeexSecondFloorUtils", "targetUrl为空");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            return parse.isHierarchical() && (StringUtils.equals(parse.getQueryParameter("weex_mode"), "dom") || StringUtils.equals(parse.getQueryParameter("weex_mode"), KEY_MUS));
        }
        e.e("WeexSecondFloorUtils", "uri == null");
        return false;
    }
}
