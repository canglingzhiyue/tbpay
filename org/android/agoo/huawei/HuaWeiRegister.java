package org.android.agoo.huawei;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.push.HmsMessaging;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.m;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.android.agoo.control.NotifManager;

/* loaded from: classes.dex */
public class HuaWeiRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HuaWeiRegister";
    public static boolean isChannelRegister = false;
    private static ScheduledThreadPoolExecutor scheduleThreadPoolExecutor;

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            getToken(context);
        }
    }

    public static void register(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc44075", new Object[]{application});
        } else {
            registerBundle(application, false);
        }
    }

    public static void registerBundle(final Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4e7ffe1", new Object[]{application, new Boolean(z)});
            return;
        }
        try {
            isChannelRegister = z;
            if (!z && !UtilityImpl.isMainProcess(application)) {
                ALog.e(TAG, "register not in main process, return", new Object[0]);
            } else if (checkDevice() && Build.VERSION.SDK_INT >= 17) {
                BaseNotifyClickActivity.addNotifyListener(new HuaweiMsgParseImpl());
                if (m.n()) {
                    ALog.e(TAG, "register begin with optimization", new Object[0]);
                    getToken(application.getApplicationContext());
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.android.agoo.huawei.HuaWeiRegister.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ALog.e(HuaWeiRegister.TAG, "register begin", "isChannel", Boolean.valueOf(HuaWeiRegister.isChannelRegister));
                        HuaWeiRegister.access$000(application.getApplicationContext());
                    }
                }, 5000L);
            } else {
                ALog.e(TAG, "register checkDevice false", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "register", th, new Object[0]);
        }
    }

    private static void getToken(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d188e7be", new Object[]{context});
        } else {
            getScheduledExecutor().execute(new Runnable() { // from class: org.android.agoo.huawei.HuaWeiRegister.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.e(HuaWeiRegister.TAG, "getToken schedule", new Object[0]);
                    try {
                        String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(Constants.HUAWEI_HMS_CLIENT_APPID);
                        String str = "";
                        if (!StringUtils.isEmpty(string)) {
                            str = string.replace("appid=", str);
                        }
                        ALog.e(HuaWeiRegister.TAG, "getToken", "appId", str);
                        String token = StringUtils.isEmpty(str) ? HmsInstanceId.getInstance(context).getToken() : HmsInstanceId.getInstance(context).getToken(str, HmsMessaging.DEFAULT_TOKEN_SCOPE);
                        ALog.e(HuaWeiRegister.TAG, "onToken", "token", token);
                        if (StringUtils.isEmpty(token)) {
                            return;
                        }
                        NotifManager notifManager = new NotifManager();
                        notifManager.init(context);
                        notifManager.reportThirdPushToken(token, "HW_TOKEN");
                    } catch (Exception e) {
                        ALog.e(HuaWeiRegister.TAG, "getToken failed.", e, new Object[0]);
                    }
                }
            });
        }
    }

    public static boolean checkDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763e9f09", new Object[0])).booleanValue();
        }
        try {
            String str = Build.BRAND;
            if (!"huawei".equalsIgnoreCase(str) && !"honor".equalsIgnoreCase(str) && !"tianyi".equalsIgnoreCase(str) && !"liantong".equalsIgnoreCase(str) && !"hinova".equalsIgnoreCase(str) && !"nzone".equalsIgnoreCase(str)) {
                if (!"ptac".equalsIgnoreCase(str)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Log.e(TAG, "checkDevice failed.", e);
            return false;
        }
    }

    public static synchronized ScheduledThreadPoolExecutor getScheduledExecutor() {
        synchronized (HuaWeiRegister.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("46f0cbe6", new Object[0]);
            }
            if (scheduleThreadPoolExecutor == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: org.android.agoo.huawei.HuaWeiRegister.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.concurrent.ThreadFactory
                    public Thread newThread(Runnable runnable) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "ACCS-HW");
                    }
                });
                scheduleThreadPoolExecutor = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.setKeepAliveTime(30L, TimeUnit.SECONDS);
                scheduleThreadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return scheduleThreadPoolExecutor;
        }
    }

    private static boolean isSupport(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44a03800", new Object[]{context})).booleanValue() : checkDevice() && Build.VERSION.SDK_INT >= 21 && HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context) == 0;
    }
}
