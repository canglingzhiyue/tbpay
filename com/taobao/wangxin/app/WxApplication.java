package com.taobao.wangxin.app;

import android.app.Application;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.launcher.init.InitOpenPoint;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import kotlin.t;
import tb.kge;
import tb.ruk;

/* loaded from: classes9.dex */
public class WxApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_SDK = "uiASyncSdkV2";
    private final String TAG = "WxApplication";
    private final String MODULE = "MPMSGS";

    static {
        kge.a(-1672513223);
    }

    public static /* synthetic */ Object ipc$super(WxApplication wxApplication, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        TLog.loge("MPMSGS", "WxApplication", " WxApplication  onCreate ");
        if (ABGlobal.isFeatureOpened(this, "closeMessageLaunchInit")) {
            return;
        }
        enableTrace(Globals.getApplication());
        TraceUtil.beginSection("WxApplication");
        InitOpenPoint.registerProcessor(new DefaultInitProcessor(this));
        if (Looper.getMainLooper() == Looper.myLooper() && ABGlobal.isFeatureOpened(this, KEY_ASYNC_SDK)) {
            TLog.loge("WxApplication", "LauncherMessage v2");
            TraceUtil.asyncTraceBegin("checkMsgBundleReady", 1110011);
            BundleSplitUtil.INSTANCE.checkMsgBundleReady("LauncherMessage", 0, new ruk() { // from class: com.taobao.wangxin.app.-$$Lambda$WxApplication$xsmli78erdG894SSI-XKLIXCXk8
                @Override // tb.ruk
                /* renamed from: invoke */
                public final Object mo2427invoke() {
                    return WxApplication.this.lambda$onCreate$0$WxApplication();
                }
            }, $$Lambda$WxApplication$dWXjAkQ7y0g6TKWHwwdM5M7p6CU.INSTANCE, false, null);
        } else {
            FeatureInitHelper.init("WxApplication", InitMessage.INIT_CLASS_NAME);
        }
        TraceUtil.endTrace();
        TLog.loge("MPMSGS", "WxApplication", " WxApplication  end ");
    }

    public /* synthetic */ t lambda$onCreate$0$WxApplication() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("63a77234", new Object[]{this});
        }
        TLog.loge("WxApplication", "end LauncherMessage");
        globalInit();
        Schedules.getLowBackground().execute(new Runnable() { // from class: com.taobao.wangxin.app.WxApplication.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FeatureInitHelper.init("WxApplication", InitMessage.INIT_CLASS_NAME);
                TraceUtil.asyncTraceEnd("checkMsgBundleReady", 1110011);
            }
        });
        return t.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ t lambda$onCreate$1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("9d23a049", new Object[]{str});
        }
        TraceUtil.asyncTraceEnd("checkMsgBundleReady", 1110011);
        return t.INSTANCE;
    }

    private void globalInit() {
        try {
            Class<?> cls = Class.forName("com.taobao.wangxin.app.MsgInitializer");
            if (cls != null) {
                cls.getMethod("init", Application.class).invoke(null, Globals.getApplication());
                cls.getMethod("registerIAccount", new Class[0]).invoke(null, new Object[0]);
                TLog.loge("MPMSGS", "WxApplication", " globalInit  end ");
                return;
            }
            TLog.loge("WxApplication", " globalInit is error ");
        } catch (Throwable th) {
            TLog.loge("WxApplication", Log.getStackTraceString(th));
        }
    }

    private static void enableTrace(Application application) {
        if (ABGlobal.isFeatureOpened(application, "msgEnableTrace")) {
            try {
                Class.forName("android.os.Trace").getDeclaredMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
                DXTraceUtil.a(true);
                TraceUtil.setEnableTrace(true);
                com.taobao.message.lab.comfrm.util.TraceUtil.setEnableTrace(true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
