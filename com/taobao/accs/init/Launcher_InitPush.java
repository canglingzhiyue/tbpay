package com.taobao.accs.init;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.a;
import com.taobao.accs.ut.monitor.ManuMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.c;
import com.taobao.agoo.notification.AgooWVPlugin;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.honor.HonorRegister;
import org.android.agoo.mezu.MeizuRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;
import tb.dca;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_InitPush implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "Launcher_InitPush";
    public static volatile boolean initialized;
    public static volatile Boolean isSupportPush;
    public static final ManuMonitor manuMonitor;
    private static boolean reported;

    static {
        kge.a(562338644);
        kge.a(1028243835);
        isSupportPush = null;
        manuMonitor = new ManuMonitor();
        reported = false;
        initialized = false;
    }

    public static void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (initialized) {
            ALog.e(TAG, "already init", new Object[0]);
        } else {
            initialized = true;
            ALog.e(TAG, "init", new Object[0]);
            try {
                q.a(AgooWVPlugin.WV_NAME, (Class<? extends e>) AgooWVPlugin.class);
                initPushChannel(application);
                dca.a(application);
            } catch (Throwable th) {
                ALog.e(TAG, "init push err", th, new Object[0]);
            }
        }
    }

    public static boolean isSupportPush() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72422d0a", new Object[0])).booleanValue();
        }
        if (isSupportPush == null) {
            synchronized (Launcher_InitPush.class) {
                if (isSupportPush == null) {
                    Context context = GlobalClientInfo.getContext();
                    if (!c.h(context) && !MiPushRegistar.checkDevice() && !OppoRegister.checkDevice(context) && !VivoRegister.checkDevice(context) && !MeizuRegister.checkDevice(context)) {
                        z = false;
                        isSupportPush = Boolean.valueOf(z);
                    }
                    z = true;
                    isSupportPush = Boolean.valueOf(z);
                }
            }
        }
        return isSupportPush.booleanValue();
    }

    public static void initPushChannel(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb29a68", new Object[]{context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
        if (sharedPreferences.getInt(Constants.KEY_TOKEN_REPORT_STATUS, 0) > 0) {
            AppMonitor.getInstance().commitStat(new ManuMonitor(true));
        }
        sharedPreferences.edit().putInt(Constants.KEY_TOKEN_REPORT_STATUS, 1).apply();
        a.c().schedule(new Runnable() { // from class: com.taobao.accs.init.Launcher_InitPush.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Launcher_InitPush.monitorNow(context);
                }
            }
        }, 30L, TimeUnit.SECONDS);
    }

    public static boolean isHonorChannelEnabled(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c6f63a7", new Object[]{context})).booleanValue() : HonorRegister.isSupport(context);
    }

    public static void monitorNow(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49eb4385", new Object[]{context});
        } else if (reported && !manuMonitor.isAgooControlCmd) {
        } else {
            reported = true;
            try {
                AppMonitor.getInstance().commitStat(manuMonitor);
                context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit().putInt(Constants.KEY_TOKEN_REPORT_STATUS, 0).apply();
            } catch (Exception e) {
                ALog.e(TAG, "monitorNow err", e, new Object[0]);
            }
        }
    }
}
