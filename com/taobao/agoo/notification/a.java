package com.taobao.agoo.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.plugin.notification.HmsNotificationManagerEx;
import com.huawei.hms.push.plugin.notification.NotificationStatus;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.d;
import com.taobao.application.common.c;
import com.taobao.runtimepermission.f;
import java.lang.ref.WeakReference;
import tb.cxo;
import tb.cxp;
import tb.cxr;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POST_NOTIFICATIONS_PERMISSION = "android.permission.POST_NOTIFICATIONS";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.taobao.agoo.notification.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0321a {
        void a();

        void a(int i, String str);
    }

    static {
        kge.a(-1093854290);
    }

    public static /* synthetic */ void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else {
            b(str, z);
        }
    }

    public static /* synthetic */ void a(String str, boolean z, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5229d5eb", new Object[]{str, new Boolean(z), new Integer(i), str2});
        } else {
            b(str, z, i, str2);
        }
    }

    public static /* synthetic */ void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            c(context);
        }
    }

    public static void a(final Context context, final String str, int i) {
        Activity b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i)});
        } else if (context == null) {
            ALog.e("AgooNotificationManager", "enableNotification illegalArguments", new Object[0]);
        } else if (a(context)) {
            ALog.e("AgooNotificationManager", "notification switch was enabled", new Object[0]);
        } else {
            ALog.e("AgooNotificationManager", "enableNotification", "scene", str, "type", Integer.valueOf(i));
            if (i <= 0 || i > 5) {
                i = 1;
            }
            try {
                if (i == 1) {
                    c(context);
                    b(str, true);
                } else if (i == 2) {
                    a(context, new InterfaceC0321a() { // from class: com.taobao.agoo.notification.a.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.agoo.notification.a.InterfaceC0321a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            ALog.e("AgooNotificationManager", "enableNotification.vip.onSuccess()", new Object[0]);
                            a.a(str, false);
                        }

                        @Override // com.taobao.agoo.notification.a.InterfaceC0321a
                        public void a(int i2, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i2), str2});
                                return;
                            }
                            ALog.e("AgooNotificationManager", "enableNotification.vip.onFailure()", "errCode", Integer.valueOf(i2), "errMsg", str2);
                            a.a(str, false, i2, str2);
                        }
                    });
                } else if (i == 3) {
                    a(context, new InterfaceC0321a() { // from class: com.taobao.agoo.notification.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.agoo.notification.a.InterfaceC0321a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            ALog.e("AgooNotificationManager", "enableNotification.mix.onSuccess()", new Object[0]);
                            a.a(str, false);
                        }

                        @Override // com.taobao.agoo.notification.a.InterfaceC0321a
                        public void a(int i2, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i2), str2});
                                return;
                            }
                            ALog.e("AgooNotificationManager", "enableNotification.mix.onFailure()", "errCode", Integer.valueOf(i2), "errMsg", str2);
                            a.b(context);
                            a.a(str, true);
                        }
                    });
                } else if (i == 4) {
                    if (Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    if (context instanceof Activity) {
                        b = (Activity) context;
                    } else {
                        b = c.b();
                    }
                    if (ActivityCompat.shouldShowRequestPermissionRationale(b, POST_NOTIFICATIONS_PERMISSION)) {
                        ALog.e("AgooNotificationManager", "shouldShow return true", new Object[0]);
                        d.a("agoo", "noti_perm_req", str, "-1", "Return early");
                        return;
                    }
                    a(context, str);
                } else if (i != 5 || Build.VERSION.SDK_INT < 33 || ActivityCompat.checkSelfPermission(context, POST_NOTIFICATIONS_PERMISSION) == 0) {
                } else {
                    ALog.e("AgooNotificationManager", "permission not granted", new Object[0]);
                    a(context, str);
                }
            } catch (Throwable th) {
                ALog.e("AgooNotificationManager", "enableNotification err", th, new Object[0]);
            }
        }
    }

    private static void a(Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else {
            f.a(context, new String[]{POST_NOTIFICATIONS_PERMISSION}).a(1L).c(true).a(new Runnable() { // from class: com.taobao.agoo.notification.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.e("AgooNotificationManager", "POST_NOTIFICATIONS_PERMISSION granted", new Object[0]);
                    d.a("agoo", "noti_perm_req", str + "_G");
                }
            }).b(new Runnable() { // from class: com.taobao.agoo.notification.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ALog.e("AgooNotificationManager", "POST_NOTIFICATIONS_PERMISSION denied", new Object[0]);
                    d.a("agoo", "noti_perm_req", str + "_D");
                }
            }).a();
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent();
            if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 25) {
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.intent.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            ALog.e("AgooNotificationManager", "enableNotificationBySystem err", e, new Object[0]);
            try {
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
                context.startActivity(intent2);
            } catch (Exception e2) {
                ALog.e("AgooNotificationManager", "enableNotificationBySystem, app settings err", e2, new Object[0]);
            }
        }
    }

    private static void a(Context context, final InterfaceC0321a interfaceC0321a) {
        Activity b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e52b7f", new Object[]{context, interfaceC0321a});
            return;
        }
        if (context instanceof Activity) {
            b = (Activity) context;
        } else {
            b = c.b();
        }
        final WeakReference weakReference = new WeakReference(b);
        com.taobao.accs.common.a.f().execute(new Runnable() { // from class: com.taobao.agoo.notification.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                final Activity activity = (Activity) weakReference.get();
                if (activity == null) {
                    InterfaceC0321a interfaceC0321a2 = interfaceC0321a;
                    if (interfaceC0321a2 == null) {
                        return;
                    }
                    interfaceC0321a2.a(1001, "");
                    return;
                }
                try {
                    HmsNotificationManagerEx.getInstance(activity).enableNotification().a(new cxo<NotificationStatus>() { // from class: com.taobao.agoo.notification.a.5.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.cxo
                        public void onComplete(cxr<NotificationStatus> cxrVar) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("1a59d472", new Object[]{this, cxrVar});
                                return;
                            }
                            ALog.e("AgooNotificationManager", "onComplete: ", new Object[0]);
                            try {
                                if (!cxrVar.b() || cxrVar.d() == null || !cxrVar.d().hasResolution()) {
                                    return;
                                }
                                cxrVar.d().startResolutionForResult(activity, 1);
                                if (interfaceC0321a == null) {
                                    return;
                                }
                                interfaceC0321a.a();
                            } catch (Throwable th) {
                                ALog.e("AgooNotificationManager", "onComplete err", th, new Object[0]);
                                if (interfaceC0321a == null) {
                                    return;
                                }
                                interfaceC0321a.a(1003, th.toString());
                            }
                        }
                    }).a(new cxp() { // from class: com.taobao.agoo.notification.a.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.cxp
                        public void a(Exception exc) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("dd91d31e", new Object[]{this, exc});
                                return;
                            }
                            String exc2 = exc == null ? "" : exc.toString();
                            ALog.e("AgooNotificationManager", "onFailure: " + exc2, new Object[0]);
                            if (interfaceC0321a == null) {
                                return;
                            }
                            interfaceC0321a.a(1002, exc2);
                        }
                    });
                } catch (Throwable th) {
                    ALog.e("AgooNotificationManager", "enableNotificationByVip err", th, new Object[0]);
                }
            }
        });
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : !"false".equals(com.taobao.accs.utl.c.f(context));
    }

    private static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        d.a("agoo", RemoteMessageConst.NOTIFICATION, str + "|" + z);
    }

    private static void b(String str, boolean z, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376b44ac", new Object[]{str, new Boolean(z), new Integer(i), str2});
            return;
        }
        d.a("agoo", RemoteMessageConst.NOTIFICATION, str + "|" + z, i + "", str2);
    }
}
