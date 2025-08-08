package com.taobao.wangxin.app;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.login4android.api.Login;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.notification.badge.MsgShortcutBadger;
import com.taobao.message.unread.RemoteGlobalUnread;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.e;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.t;
import tb.kge;
import tb.rul;

/* loaded from: classes9.dex */
public class LauncherMessagePreload {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_NUMBER = "mpMessageBoxGlobalsTipNumber";
    private static final String KEY_TYPE = "mpMessageBoxGlobalsTipType";
    private static final String MODULE = "MPMSGS";
    private static final String TAG = "LauncherMessagePreload";
    public static long sFirstDispatchTime;
    public static int sFirstTipNumber;
    public static int sFirstTipType;
    public static long sFirstUpdateNavigationTime;
    public static boolean sHasUpdateNavigationError;
    public static int sUseSnapshot;

    static {
        kge.a(2086149496);
    }

    public static /* synthetic */ void access$000(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678c1348", new Object[]{application});
        } else {
            requestRemote(application);
        }
    }

    public static /* synthetic */ void access$100(Context context, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6430e470", new Object[]{context, new Integer(i), new Integer(i2)});
        } else {
            updateUnreadNumUI(context, i, i2);
        }
    }

    public static void init(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        sFirstDispatchTime = SystemClock.uptimeMillis();
        TLog.loge(MODULE, TAG, "init");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        sUseSnapshot = defaultSharedPreferences.getInt("mpMessageBoxGlobalsUseSnapshot", 0);
        if (!BundleSplitUtil.INSTANCE.isMsgBundleReady(false) && "1".equals(OrangeConfig.getInstance().getConfig("mpm_data_switch", "remoteUnread", "1"))) {
            if (defaultSharedPreferences.contains(KEY_NUMBER)) {
                if (sUseSnapshot != 0) {
                    updateUnreadNumUI(application, defaultSharedPreferences.getInt(KEY_NUMBER, 0), defaultSharedPreferences.getInt(KEY_TYPE, 0));
                }
            } else if (Login.checkSessionValid()) {
                UIHandler.postDelayed(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (BundleSplitUtil.INSTANCE.isMsgBundleReady(false)) {
                        } else {
                            LauncherMessagePreload.access$000(application);
                        }
                    }
                }, ((int) (Math.random() * 5000.0d)) + 1);
            } else {
                new Intent();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
                Globals.getApplication().registerReceiver(new BroadcastReceiver() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            return;
                        }
                        try {
                            Globals.getApplication().unregisterReceiver(this);
                        } catch (Throwable th) {
                            TLog.loge(LauncherMessagePreload.TAG, Log.getStackTraceString(th));
                        }
                        if (!StringUtils.equals(intent.getAction(), LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS) || BundleSplitUtil.INSTANCE.isMsgBundleReady(false)) {
                            return;
                        }
                        LauncherMessagePreload.access$000(application);
                    }
                }, intentFilter);
            }
        } else if (sUseSnapshot != 0) {
            updateUnreadNumUI(application, defaultSharedPreferences.getInt(KEY_NUMBER, 0), defaultSharedPreferences.getInt(KEY_TYPE, 0));
        }
        if (FeatureInitHelper.isInit(Login.getUserId())) {
            return;
        }
        if (ABGlobal.isFeatureOpened(Globals.getApplication(), "msgDexLoadOptV2")) {
            Schedules.getLowBackground().execute(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TLog.loge(LauncherMessagePreload.TAG, " isMsgBundleReady ");
                    BundleSplitUtil.INSTANCE.isMsgBundleReady(true);
                    TLog.loge(LauncherMessagePreload.TAG, " end isMsgBundleReady ");
                }
            });
        }
        c.a("com.taobao.message.conversation.DefaultMessageTabHost", new c.a() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassLoaded(Class<?> cls) {
                TLog.loge(LauncherMessagePreload.TAG, " FlexaClass onClassLoaded ");
                try {
                    Class<?> cls2 = Class.forName("com.taobao.message.preload.PreLoadClassHelper");
                    if (cls2 != null) {
                        cls2.getMethod("init", new Class[0]).invoke(null, new Object[0]);
                    } else {
                        TLog.loge(LauncherMessagePreload.TAG, " preload is error ");
                    }
                } catch (Throwable th) {
                    TLog.loge(LauncherMessagePreload.TAG, Log.getStackTraceString(th));
                }
                TLog.loge(LauncherMessagePreload.TAG, " end  FlexaClass ");
            }

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassNotFound() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                } else {
                    TLog.loge(LauncherMessagePreload.TAG, " FlexaClass onClassNotFound ");
                }
            }
        }, Schedules.getLowBackground());
    }

    private static void requestRemote(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bb0a3", new Object[]{application});
        } else {
            RemoteGlobalUnread.request(Arrays.asList("bc", "cc", "notice", "subscribe"), new rul<Integer, t>() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rul
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public t mo2421invoke(Integer num) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (t) ipChange2.ipc$dispatch("3df7b2c7", new Object[]{this, num});
                    }
                    if (num != null && num.intValue() > 0) {
                        LauncherMessagePreload.access$100(application, num.intValue(), 0);
                    }
                    return t.INSTANCE;
                }
            }, new rul<String, t>() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.rul
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public t mo2421invoke(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (t) ipChange2.ipc$dispatch("1f9953f6", new Object[]{this, str});
                    }
                    TLog.loge(LauncherMessagePreload.TAG, str);
                    return t.INSTANCE;
                }
            });
        }
    }

    private static void updateUnreadNumUI(Context context, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f2ff5f", new Object[]{context, new Integer(i), new Integer(i2)});
            return;
        }
        sFirstTipType = i2;
        sFirstTipNumber = i;
        try {
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        if (i <= 0) {
            MsgShortcutBadger.removeCount(context);
        } else {
            if (i2 == 0) {
                MsgShortcutBadger.applyCount(context, i);
            }
            TBS.Ext.commitEvent("Page_Extend", 2201, "User_TBMSGMessage_Unread", null, null, "tipNumber=" + i, "tipType=" + i2, "reportType=snapshot");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (i <= 0) {
                        e.a("message", NavigationTabMsgMode.NONE, (String) null);
                    } else if (i2 != 0 ? !e.a("message", NavigationTabMsgMode.RED_POINT_INDICATOR, " ") : !e.a("message", NavigationTabMsgMode.DEFAULT, String.valueOf(i))) {
                        LauncherMessagePreload.sHasUpdateNavigationError = true;
                    }
                    LauncherMessagePreload.sFirstUpdateNavigationTime = SystemClock.uptimeMillis();
                }
            });
        }
        TBS.Ext.commitEvent("Page_Extend", 2201, "User_TBMSGMessage_Unread", null, null, "tipNumber=" + i, "tipType=" + i2, "reportType=snapshot");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.wangxin.app.LauncherMessagePreload.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (i <= 0) {
                    e.a("message", NavigationTabMsgMode.NONE, (String) null);
                } else if (i2 != 0 ? !e.a("message", NavigationTabMsgMode.RED_POINT_INDICATOR, " ") : !e.a("message", NavigationTabMsgMode.DEFAULT, String.valueOf(i))) {
                    LauncherMessagePreload.sHasUpdateNavigationError = true;
                }
                LauncherMessagePreload.sFirstUpdateNavigationTime = SystemClock.uptimeMillis();
            }
        });
    }
}
