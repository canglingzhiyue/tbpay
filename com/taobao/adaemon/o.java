package com.taobao.adaemon;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.xkg;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLOSE_PROVIDER = "adaemon_close_provider_preload";
    public static final String KEY_DONT_STARTSERVICE = "adaemon_dont_startservice";
    public static final String KEY_FRAME_LOCK_LIVE = "adaemon_frame_lock";
    public static final String KEY_FRAME_LOCK_ND = "adaemon_frame_lock_nd";
    public static final String KEY_FRAME_SCHEDULE = "adaemon_frame_schedule";
    public static final String KEY_LIMIT_PREWARM = "adaemon_limit_prewarm";
    public static final String KEY_PROVIDER_PRELOAD = "adaemon_provider_preload";
    public static final String KEY_PROVIDER_PREWARM = "adaemon_provider_prewarm";
    public static final String KEY_TAO_TAB_BOOST = "adaemon_tao_tab_boost";

    static {
        kge.a(-1626924367);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : xkg.a(str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a(KEY_FRAME_SCHEDULE);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a(KEY_FRAME_LOCK_LIVE);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : a(KEY_FRAME_LOCK_ND);
    }
}
