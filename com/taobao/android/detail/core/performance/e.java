package com.taobao.android.detail.core.performance;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.eik;
import tb.eiq;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-1918087050);
        emu.a("com.taobao.android.detail.core.performance.DetailPreloadOptService");
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : eiq.b;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!a(str) && !b(str)) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanUsePreload-->不能进行预加载");
            return false;
        } else if (StringUtils.isEmpty(str2)) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanUsePreload-->不能进行预加载: itemId 为空");
            return false;
        } else if (com.taobao.android.detail.core.performance.preload.k.a().b(str2) == null) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanUsePreload-->不能进行预加载: cacheData 为空");
            return false;
        } else if (com.taobao.android.detail.core.performance.preload.k.a().b(str2).a()) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanUsePreload-->不能进行预加载: cacheData 过期");
            return false;
        } else if (com.taobao.android.detail.core.performance.preload.k.a().b(str2).c()) {
            return true;
        } else {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanUsePreload-->不能进行预加载: cacheData不能被使用");
            return false;
        }
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue() : a(str, str2);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanCacheRequestData-->渠道来源为空");
            return false;
        } else if (!a(str)) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanCacheRequestData-->没有开启预加载优化");
            return false;
        } else if (!eiq.c) {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanCacheRequestData-->动态缓存数据的开关关闭");
            return false;
        } else if (eik.d(str)) {
            return true;
        } else {
            com.taobao.android.detail.core.utils.i.c(l.a("DetailPreloadOptService"), "isCanCacheRequestData-->没有命中主接口数据回写的优化");
            return false;
        }
    }
}
