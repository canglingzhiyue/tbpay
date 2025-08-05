package com.alipay.security.mobile.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.a;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public class CommonUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long PERIOD = 86400000;
    private static final String SECURITY_PREFERENCE = "securitypreference00";

    public static boolean isBlank(String str) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6cf455f", new Object[]{str})).booleanValue();
        }
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSamSungS6() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68f544de", new Object[0])).booleanValue();
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str != null && str2 != null && str.toLowerCase().equals("samsung") && (str2.toLowerCase().equals("sm-g9200") || str2.toLowerCase().equals("sm-g9250"));
    }

    public static boolean equals(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c24d6de", new Object[]{str, str2})).booleanValue();
        }
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public static void notifyUpdate(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f43b283", new Object[]{context, str, str2});
            return;
        }
        String packageName = context.getPackageName();
        if (!packageName.equals("com.eg.android.AlipayGphone") && !packageName.equals("com.eg.android.AlipayGphoneRC")) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        long nextNotifyTime = getNextNotifyTime(context);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
            Date date = new Date(currentTimeMillis);
            String str3 = "当前时间 : " + simpleDateFormat.format(date);
        } catch (Exception unused) {
        }
        if (currentTimeMillis < nextNotifyTime) {
            if (nextNotifyTime - currentTimeMillis <= 86400000) {
                return;
            }
            setNextNotifyTime(context, currentTimeMillis + (Math.abs(currentTimeMillis - nextNotifyTime) % 86400000));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        intent.setPackage(packageName);
        notificationManager.notify(3, new Notification.Builder(context).setSmallIcon(getNoticeIcon(context)).setTicker("支付宝安全校验服务更新").setContentIntent(a.a(context.getApplicationContext(), 0, intent, 134217728)).setContentTitle("更新提示").setContentText("安全校验服务需要更新，点击去更新").setAutoCancel(true).setLights(-16711936, 300, 1000).setWhen(System.currentTimeMillis()).setPriority(0).setDefaults(1).build());
        setNextNotifyTime(context, currentTimeMillis + 86400000);
    }

    private static int getNoticeIcon(Context context) {
        try {
            String packageName = context.getPackageName();
            return ((Integer) Class.forName(packageName + ".R$drawable").getField("appicon_push").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static void setNextNotifyTime(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d8328e", new Object[]{context, new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(SECURITY_PREFERENCE, 0).edit();
        edit.putLong("KEY_NOTIFICATION_TIME", j);
        edit.commit();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
            Date date = new Date(j);
            String str = "下次触发时间 : " + simpleDateFormat.format(date);
        } catch (Exception unused) {
        }
    }

    private static long getNextNotifyTime(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b121ff76", new Object[]{context})).longValue();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SECURITY_PREFERENCE, 0);
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
            Date date = new Date(sharedPreferences.getLong("KEY_NOTIFICATION_TIME", -1L));
            String str = "本次触发时间 : " + simpleDateFormat.format(date);
        } catch (Exception unused) {
        }
        return sharedPreferences.getLong("KEY_NOTIFICATION_TIME", -1L);
    }
}
