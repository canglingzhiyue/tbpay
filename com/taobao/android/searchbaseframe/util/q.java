package com.taobao.android.searchbaseframe.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes6.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final q INSTANCE;

    static {
        kge.a(662753143);
        INSTANCE = new q();
    }

    private q() {
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : kotlin.jvm.internal.q.a((Object) "true", (Object) OrangeConfig.getInstance().getConfig(com.taobao.search.common.util.r.SEARCH_BIZ_NAME, "disableLBSInfo", ""));
    }

    @JvmStatic
    public static final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : OrangeConfig.getInstance().getConfig(com.taobao.search.common.util.r.SEARCH_BIZ_NAME, "homePassParamsWhiteList", "");
    }

    @JvmStatic
    public static final List<String> c() {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[0]);
        }
        String a2 = com.taobao.android.searchbaseframe.roman.a.a();
        if (com.alibaba.ability.localization.b.c()) {
            config = OrangeConfig.getInstance().getConfig(com.taobao.search.common.util.r.SEARCH_BIZ_NAME, "RomanPreloadBizNameConfigI18N", a2);
        } else {
            config = OrangeConfig.getInstance().getConfig(com.taobao.search.common.util.r.SEARCH_BIZ_NAME, "RomanPreloadBizNameConfig", a2);
        }
        try {
            kotlin.jvm.internal.q.a((Object) config, "config");
            return kotlin.text.n.b((CharSequence) config, new String[]{","}, false, 0, 6, (Object) null);
        } catch (Exception unused) {
            return new ArrayList(1);
        }
    }

    @JvmStatic
    public static final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : g.a(OrangeConfig.getInstance().getConfig(com.taobao.search.common.util.r.SEARCH_BIZ_NAME, "templatePreloadV2", "true"), true);
    }

    @JvmStatic
    public static final boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : TextUtils.equals("true", OrangeConfig.getInstance().getConfig(com.taobao.search.common.util.r.SEARCH_BIZ_NAME, "reportBxGesture", "true"));
    }
}
