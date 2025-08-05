package com.taobao.android.weex_framework.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] UNICORN_FALSE_CONFIGS;
    public static final String[] UNICORN_TRUE_CONFIGS;
    private static volatile a d;
    public static Boolean e;

    /* loaded from: classes6.dex */
    public interface a {
    }

    static {
        kge.a(1911338974);
        UNICORN_TRUE_CONFIGS = new String[]{"enable-hybrid-plus", "enable-tile-render"};
        UNICORN_FALSE_CONFIGS = new String[]{"enable-share-thread", "enable-earlier-ready"};
        e = null;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("23ffd0cd", new Object[0]);
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    com.taobao.android.weex_framework.adapter.k s = com.taobao.android.weex_framework.l.a().s();
                    if (s == null) {
                        throw new RuntimeException("MUSConfigUtilInterface instance is null");
                    }
                    d = s;
                }
            }
        }
        return d;
    }
}
