package com.taobao.wireless.link.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import mtopsdk.common.util.StringUtils;
import android.widget.RemoteViews;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.message.uikit.util.ActivityJumpUtil;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.wireless.link.model.BrandVersion;
import com.taobao.wireless.link.model.MessageData;
import com.taobao.wireless.link.model.SupportBrandVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.esr;
import tb.kge;
import tb.rjt;
import tb.rkg;
import tb.rki;
import tb.rkj;
import tb.rkk;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Notification f23605a;
    private static NotificationManager b;

    static {
        kge.a(-683111751);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            f(context);
            MessageData b2 = b(context);
            rkg.a("link_tag", "NotificationUtils === openNotification === 开始绘制通知");
            a(context, true);
            Notification a2 = a(context, b2, false);
            NotificationManager notificationManager = b;
            if (notificationManager != null) {
                notificationManager.notify(20191111, a2);
                rkg.a("link_tag", "NotificationUtils === openNotification === 通知绘制完成");
            }
            rki.a(rki.ARG1_NOTIFICATION_SWITCH_STATE, "true", "", null);
        }
    }

    public static MessageData b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageData) ipChange.ipc$dispatch("248eeb32", new Object[]{context});
        }
        MessageData messageData = com.taobao.wireless.link.controller.a.a().f23587a;
        return StringUtils.isEmpty(messageData.noti_type) ? (MessageData) rkk.a(context).b("message_data", new MessageData()) : messageData;
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else if (context == null) {
        } else {
            a(context, false);
            NotificationManager notificationManager = b;
            if (notificationManager != null) {
                notificationManager.cancel(20191111);
                rkg.a("link_tag", "NotificationUtils === closeNotification === 取消通知");
            }
            rki.a(rki.ARG1_NOTIFICATION_SWITCH_STATE, "false", "", null);
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else if (context == null) {
        } else {
            com.taobao.wireless.link.controller.a.a().j = "false";
            com.taobao.wireless.link.controller.a.a().k = "false";
            rkk a2 = rkk.a(context);
            a2.a("isShowNotifi", "false");
            a2.a("isShowNotifiSwitch", "false");
            NotificationManager notificationManager = b;
            if (notificationManager != null) {
                notificationManager.cancel(20191111);
                rkg.a("link_tag", "NotificationUtils === closeNotificationMessage === 取消通知");
            }
            rki.a(rki.ARG1_NOTIFICATION_SWITCH_STATE, "false", "", null);
        }
    }

    public static void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
            return;
        }
        rkk a2 = rkk.a(context);
        if (z) {
            com.taobao.wireless.link.controller.a.a().j = "true";
            com.taobao.wireless.link.controller.a.a().k = "true";
            a2.a("isShowNotifi", "true");
            a2.a("isShowNotifiSwitch", "true");
            return;
        }
        com.taobao.wireless.link.controller.a.a().j = "false";
        a2.a("isShowNotifi", "false");
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else if (!b(0)) {
        } else {
            rkg.a("link_tag", "NotificationUtils === refreshNotification == 刷新消息");
            Notification a2 = a(context, b(context), true);
            f23605a = a2;
            if (a2 == null) {
                return;
            }
            b.notify(20191111, f23605a);
        }
    }

    public static Notification a(Context context, MessageData messageData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("1c7205d3", new Object[]{context, messageData, new Boolean(z)});
        }
        if (context == null) {
            return f23605a;
        }
        rkg.a("link_tag", "NotificationUtils === showNotification === 绘制通知");
        if (!z) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", messageData.message_id);
            hashMap.put("hc_url", messageData.noti_linkUrl_hd);
            hashMap.put("hd_url", messageData.noti_linkUrl_hc);
            rki.a(rki.ARG1_NOTIFICATION_EXPOSE, "", "", hashMap);
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setSmallIcon(R.drawable.assistant_logo);
        builder.setOngoing(true);
        builder.setPriority(2);
        RemoteViews a2 = a(context, messageData);
        a(context, a2, messageData);
        b = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (Build.VERSION.SDK_INT >= 26) {
            b.createNotificationChannel(new NotificationChannel("淘宝小助手", "天猫双十一", 3));
            builder.setChannelId("淘宝小助手");
            rkg.a("link_tag", "NotificationUtils === showNotification === 设置通知channel");
        }
        rkg.a("link_tag", "NotificationUtils === showNotification === 设置通知布局");
        builder.setCustomContentView(a2);
        Notification build = builder.build();
        f23605a = build;
        return build;
    }

    private static RemoteViews a(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteViews) ipChange.ipc$dispatch("1c642bad", new Object[]{context, messageData});
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_bar);
        if (messageData != null && !StringUtils.isEmpty(messageData.noti_text_title)) {
            remoteViews.setTextViewText(R.id.tv_name, messageData.noti_text_title);
        }
        if (com.taobao.wireless.link.controller.a.a().e != null) {
            remoteViews.setImageViewBitmap(R.id.iv_title_logo, com.taobao.wireless.link.controller.a.a().e);
        }
        if (com.taobao.wireless.link.controller.a.a().f != null) {
            remoteViews.setImageViewBitmap(R.id.iv_setting, com.taobao.wireless.link.controller.a.a().f);
        }
        if (com.taobao.wireless.link.controller.a.a().g != null) {
            remoteViews.setImageViewBitmap(R.id.iv_left_logo, com.taobao.wireless.link.controller.a.a().g);
        }
        if (messageData != null && !StringUtils.isEmpty(messageData.noti_text_hc)) {
            remoteViews.setTextViewText(R.id.tv_left_name, messageData.noti_text_hc);
        }
        if (com.taobao.wireless.link.controller.a.a().h != null) {
            remoteViews.setImageViewBitmap(R.id.iv_right_logo, com.taobao.wireless.link.controller.a.a().h);
        }
        if (messageData != null && !StringUtils.isEmpty(messageData.noti_text_hd)) {
            remoteViews.setTextViewText(R.id.tv_right_name, messageData.noti_text_hd);
        }
        return remoteViews;
    }

    private static void a(Context context, RemoteViews remoteViews, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7f4bad", new Object[]{context, remoteViews, messageData});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.id.ll_left_zone));
        arrayList.add(Integer.valueOf(R.id.ll_right_zone));
        arrayList.add(Integer.valueOf(R.id.iv_setting));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Intent intent = new Intent(context, NotificationBroadcastReceiver.class);
            if (num.intValue() == R.id.ll_left_zone) {
                intent.putExtra(ActivityJumpUtil.LANDING_URL, messageData.noti_linkUrl_hc);
                intent.setAction("com.taobao.taobao.notification_left");
            } else if (num.intValue() == R.id.ll_right_zone) {
                intent.putExtra(ActivityJumpUtil.LANDING_URL, messageData.noti_linkUrl_hd);
                intent.setAction("com.taobao.taobao.notification_right");
            } else if (num.intValue() == R.id.iv_setting) {
                intent.putExtra(ActivityJumpUtil.LANDING_URL, "http%3A%2F%2Fm.taobao.com%2Fgo%2Fmytaobaocommonsettings");
                intent.setAction("com.taobao.taobao.notification_set");
            }
            remoteViews.setOnClickPendingIntent(num.intValue(), com.android.taobao.aop.a.b(context, (int) System.currentTimeMillis(), intent, 134217728));
        }
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79908c52", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        rki.a(str2, com.taobao.wireless.link.controller.a.a().f23587a.message_id, str, null);
        rkj.a(context, str3, str, str4, str5);
    }

    public static void f(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
            return;
        }
        try {
            MessageData b2 = b(context);
            com.taobao.phenix.intf.b.h().a(context).a(b2.noti_picUrl_hc).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.wireless.link.notification.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    com.taobao.wireless.link.controller.a.a().g = succPhenixEvent.getDrawable().getBitmap();
                    b.e(context);
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.wireless.link.notification.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    b.d(context);
                    return false;
                }
            }).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "1111").fetch();
            com.taobao.phenix.intf.b.h().a(context).a(b2.noti_picUrl_hd).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.wireless.link.notification.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    com.taobao.wireless.link.controller.a.a().h = succPhenixEvent.getDrawable().getBitmap();
                    b.e(context);
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.wireless.link.notification.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    b.d(context);
                    return false;
                }
            }).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "1111").fetch();
            com.taobao.phenix.intf.b.h().a(context).a(b2.noti_title_left).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.wireless.link.notification.b.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    com.taobao.wireless.link.controller.a.a().e = succPhenixEvent.getDrawable().getBitmap();
                    b.e(context);
                    return false;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.wireless.link.notification.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    b.d(context);
                    return false;
                }
            }).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "1111").fetch();
            com.taobao.phenix.intf.b.h().a(context).a("https://gw.alicdn.com/tfs/TB1Cyhfe1P2gK0jSZFoXXauIVXa-66-66.png").succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.wireless.link.notification.b.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    com.taobao.wireless.link.controller.a.a().f = succPhenixEvent.getDrawable().getBitmap();
                    b.e(context);
                    return false;
                }
            }).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "1111").fetch();
        } catch (Exception e) {
            rkg.a("link_tag", "NotificationUtils === loadPic 异常：" + e.getMessage());
        }
    }

    public static void b(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a78a2b5", new Object[]{context, new Boolean(z)});
            return;
        }
        try {
            if (z) {
                rkg.a("link_tag", "NotificationUtils === dealWithNotification === 收到orange推送，处理消息：canShowNotification=" + com.taobao.wireless.link.controller.a.a().j);
                if (b(0) || f23605a == null) {
                    return;
                }
                d(context);
            } else if (!b(0) || StringUtils.isEmpty(b(context).noti_type)) {
            } else {
                a(context);
            }
        } catch (Throwable th) {
            TLog.loge("linkManager", "assistant", "启动或者orange异常=" + th);
        }
    }

    public static boolean a(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            rkk a2 = rkk.a(rjt.a().f33186a);
            str = com.taobao.wireless.link.controller.a.a().k;
            if (StringUtils.isEmpty(str)) {
                str = (String) a2.b("isShowNotifiSwitch", "false");
            }
        } catch (Throwable th) {
            rkg.a("link_tag", "NotificationUtils === isShowSwitch === 获取开关状态异常：" + th.getMessage());
        }
        if (!b(0)) {
            if (!StringUtils.equals("true", str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            String str = com.taobao.wireless.link.controller.a.a().j;
            if (StringUtils.isEmpty(str)) {
                str = (String) rkk.a(rjt.a().f33186a).b("isShowNotifi", "false");
            }
            return StringUtils.equals(str, "true");
        } catch (Exception e) {
            rkg.a("link_tag", "NotificationUtils === getSwitchState === 获取开关状态异常：" + e.getMessage());
            return false;
        }
    }

    public static boolean g(Context context) {
        List<BrandVersion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        try {
            SupportBrandVersion supportBrandVersion = rjt.a().c.f;
            if (supportBrandVersion == null) {
                supportBrandVersion = (SupportBrandVersion) rkk.a(context).b("notificationSupportBrandVersion", new SupportBrandVersion());
            }
            if (supportBrandVersion != null && (list = supportBrandVersion.supportBrandVersion) != null) {
                for (BrandVersion brandVersion : list) {
                    if (brandVersion.brand.contains(Build.MANUFACTURER.toLowerCase()) && brandVersion.version.contains(Build.VERSION.RELEASE)) {
                        rkg.a("link_tag", "NotificationUtils === isInWhiteLIst === 系统版本为：" + Build.VERSION.RELEASE + " 手机厂商为：" + Build.MANUFACTURER.toLowerCase() + "，支持通知栏功能");
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            rkg.a("link_tag", "NotificationUtils === isInWhiteLIst === 获取小助手支持的品牌和系统版本异常=" + e.getMessage());
        }
        return false;
    }
}
