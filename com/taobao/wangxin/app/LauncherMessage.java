package com.taobao.wangxin.app;

import android.app.Application;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.launcher.init.InitOpenPoint;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class LauncherMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BUNDLE_NAME = "com.taobao.wangxin";
    public static long sFirstDispatchTime;
    private final String TAG = "LauncherMessage";
    private final String MODULE = "MPMSGS";

    static {
        kge.a(730577745);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        sFirstDispatchTime = SystemClock.uptimeMillis();
        if ("1".equals(OrangeConfig.getInstance().getConfig("launch_config", "wx_mode", "1"))) {
            c.a(BUNDLE_NAME, null);
        }
        InitOpenPoint.registerProcessor(new DefaultInitProcessor(application));
        TLog.loge("MPMSGS", "LauncherMessage", "init");
        FeatureInitHelper.init("LauncherMessage", InitMessage.INIT_CLASS_NAME);
    }

    public void initMsgBundle(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823988ae", new Object[]{this, application, hashMap});
            return;
        }
        TLog.loge("MPMSGS", "LauncherMessage", "initMsgBundle");
        BundleSplitUtil.INSTANCE.checkMsgBundleReady("LauncherMessage", 0, $$Lambda$LauncherMessage$ZKrYLyhdNzNXX0XLKjegQmD_vo.INSTANCE, $$Lambda$LauncherMessage$2vJc94J20lxa07GQNpp1AhDgcA.INSTANCE, false, null);
    }
}
