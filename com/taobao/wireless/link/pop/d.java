package com.taobao.wireless.link.pop;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.common.Constants;
import com.taobao.wireless.link.model.BrandVersion;
import com.taobao.wireless.link.model.SupportBrandVersion;
import com.taobao.wireless.link.pop.recevier.AccsConnectReceiver;
import com.taobao.wireless.link.pop.recevier.PopScreenReceiver;
import java.util.Calendar;
import java.util.List;
import tb.joq;
import tb.kge;
import tb.rjt;
import tb.rkg;
import tb.rkk;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f23618a;

    static {
        kge.a(-327456971);
        f23618a = "tbopen://m.taobao.com/tbopen/index.html?source=auto&action=ali.open.nav&module=h5&bc_fl_src=";
    }

    public static boolean a(Context context) {
        List<BrandVersion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            SupportBrandVersion supportBrandVersion = rjt.a().c.c;
            if (supportBrandVersion == null) {
                supportBrandVersion = (SupportBrandVersion) rkk.a(context).b("popSupportBrandVersion", new SupportBrandVersion());
            }
            if (supportBrandVersion != null && (list = supportBrandVersion.supportBrandVersion) != null) {
                for (BrandVersion brandVersion : list) {
                    if (brandVersion.brand.contains(Build.MANUFACTURER.toLowerCase()) && brandVersion.version.contains(Build.VERSION.RELEASE)) {
                        rkg.a("link_tag", "PopUtils === isInWhiteLIst === 系统版本为：" + Build.VERSION.RELEASE + " 手机厂商为：" + Build.MANUFACTURER.toLowerCase() + "，支持桌面消息功能");
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            rkg.a("link_tag", "PopUtils === isInWhiteList == 获取白名单异常:" + e.getMessage());
        }
        return false;
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static long a(PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f793aed8", new Object[]{popMessageData})).longValue();
        }
        if (popMessageData != null && popMessageData.showTime <= 15000) {
            return popMessageData.showTime;
        }
        return 15000L;
    }

    public static void a(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25949ec", new Object[]{context, popMessageData});
            return;
        }
        com.taobao.wireless.link.controller.a.a().b = popMessageData;
        rkk.a(context).a("pop_message", popMessageData);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        com.taobao.wireless.link.controller.a.a().b = null;
        rkk.a(context).b("pop_message");
    }

    public static PopMessageData c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopMessageData) ipChange.ipc$dispatch("2427bc9a", new Object[]{context});
        }
        PopMessageData popMessageData = com.taobao.wireless.link.controller.a.a().b;
        if (popMessageData == null || popMessageData.messageType == 0) {
            try {
                return (PopMessageData) rkk.a(context).b("pop_message", new PopMessageData());
            } catch (Exception e) {
                rkg.a("link_tag", "PopUtils === getPushMessage == 从本地获取消息解析失败：" + e);
            }
        }
        return popMessageData;
    }

    public static boolean b(PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e93d5507", new Object[]{popMessageData})).booleanValue();
        }
        if (popMessageData == null) {
            return false;
        }
        String str = popMessageData.blackList;
        String str2 = rjt.a().b;
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            return str.contains(str2);
        }
        return false;
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        PopScreenReceiver popScreenReceiver = new PopScreenReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        context.registerReceiver(popScreenReceiver, intentFilter);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        AccsConnectReceiver accsConnectReceiver = new AccsConnectReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ACTION_CONNECT_INFO);
        application.registerReceiver(accsConnectReceiver, intentFilter);
    }

    public static int e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{context})).intValue() : ((Integer) rkk.a(context).b("requestCount", 0)).intValue();
    }

    public static void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
        } else {
            rkk.a(context).a("requestCount", Integer.valueOf(i));
        }
    }

    public static long f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a17cbe6f", new Object[]{context})).longValue() : ((Long) rkk.a(context).b(joq.STAGE_NETWORK, 0L)).longValue();
    }

    public static void a(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9e64", new Object[]{context, new Long(j)});
        } else {
            rkk.a(context).a(joq.STAGE_NETWORK, Long.valueOf(j));
        }
    }

    public static boolean b(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f60774b1", new Object[]{context, popMessageData})).booleanValue();
        }
        if (popMessageData == null) {
            return false;
        }
        if (popMessageData.messageType == 1) {
            return !StringUtils.isEmpty(popMessageData.title) && !StringUtils.isEmpty(popMessageData.subTitle) && !StringUtils.isEmpty(popMessageData.rightButtonText) && !StringUtils.isEmpty(popMessageData.rightButtonUrl);
        } else if (popMessageData.messageType != 2) {
            return true;
        } else {
            return !StringUtils.isEmpty(popMessageData.clickUrl) && !StringUtils.isEmpty(popMessageData.picUrl);
        }
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue() : c(context).messageType != 0;
    }

    public static boolean a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11caec", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(6);
        calendar.setTimeInMillis(j2);
        return i == calendar.get(6);
    }

    public static boolean b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a7862e8", new Object[]{context, new Integer(i)})).booleanValue();
        }
        String a2 = com.taobao.wireless.link.common.b.a(context, "mtopRequestScene", "1,2,3");
        if (StringUtils.isEmpty(a2)) {
            return true;
        }
        return a2.contains(i + "");
    }

    public static String h(Context context) {
        if (context == null) {
            return "unknown";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return String.valueOf(((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled());
            } catch (Throwable th) {
                rkg.b("link_tag", "PopUtils === getPushState === >=24,获取通知状态异常：" + th);
                return "unknown";
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            boolean z = false;
            if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                z = true;
            }
            return String.valueOf(z);
        } catch (Throwable th2) {
            rkg.b("link_tag", "PopUtils === getPushState === 获取通知状态异常：：" + th2);
            return "unknown";
        }
    }

    public static void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a382c158", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 25) {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.intent.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            rkg.b("link_tag", "PopUtils === jumpPushPage === 跳转通知页面异常，跳转到应用详情页面" + e);
            try {
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent2);
            } catch (Exception unused) {
                rkg.b("link_tag", "PopUtils === jumpPushPage === 跳转通知页面异常,跳转到应用详情页面，还异常：" + e);
            }
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        Calendar calendar = Calendar.getInstance();
        return String.format("%02d:%02d", Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)));
    }
}
