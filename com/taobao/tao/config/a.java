package com.taobao.tao.config;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.ShareEnv;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_ACTION_CLOSE_SHARE_MENU = "share_receiver_close_share_menu";

    static {
        kge.a(-5691234);
    }

    public static Application a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f921f837", new Object[0]) : ShareEnv.getApplication();
    }
}
