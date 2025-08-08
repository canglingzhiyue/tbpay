package com.taobao.msgnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.support.v4.util.LruCache;
import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.utl.UTMini;
import com.taobao.android.base.Versions;
import com.taobao.android.task.Coordinator;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.system.base.IOldAgooNotification;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LruCache<String, Integer> e = new LruCache<>(50);
    private Handler c = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public NotificationManager f18274a = (NotificationManager) Globals.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION);
    public PowerManager b = (PowerManager) Globals.getApplication().getSystemService("power");
    private Map<String, List<IOldAgooNotification>> d = new ConcurrentHashMap();

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static g f18277a;

        static {
            kge.a(992576788);
            f18277a = new g();
        }

        public static /* synthetic */ g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("220a328c", new Object[0]) : f18277a;
        }
    }

    static {
        kge.a(1110212161);
    }

    public static /* synthetic */ Map a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1a7748bb", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ void a(g gVar, String str, IOldAgooNotification iOldAgooNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a562a3c9", new Object[]{gVar, str, iOldAgooNotification});
        } else {
            gVar.a(str, iOldAgooNotification);
        }
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("220a328c", new Object[0]) : a.a();
    }

    public NotificationManager b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotificationManager) ipChange.ipc$dispatch("7eb2d306", new Object[]{this}) : this.f18274a;
    }

    public PowerManager c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PowerManager) ipChange.ipc$dispatch("d235f448", new Object[]{this}) : this.b;
    }

    public boolean a(final Intent intent, final Intent intent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e85e4e6", new Object[]{this, intent, intent2})).booleanValue();
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.msgnotification.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                TLog.loge("agoo_push", "agoo_arrive_biz");
                try {
                    str = intent.getStringExtra("id");
                } catch (Exception e) {
                    TLog.loge("agoo_push", Log.getStackTraceString(e));
                    str = "";
                }
                AppMonitor.Counter.commit("accs", "agoo_arrive_biz", str, mto.a.GEO_NOT_SUPPORT);
                TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 19999, "agoo_arrive_biz", null, null, null, "messageId=" + str);
                TLog.loge("agoo_push", "agoo_arrive_biz, messageId=" + str);
                IOldAgooNotification a2 = f.a(intent, intent2, Globals.getApplication());
                if (a2 == null) {
                    return;
                }
                if (a2.getMergeType() == 1) {
                    g.a(g.this, "agoo", a2);
                    return;
                }
                try {
                    a2.performNotify();
                } catch (Throwable th) {
                    k.a("AgooNotificationManger", "sendNotify is error,e=" + th.toString());
                    TLog.loge("AgooNotificationManger", Log.getStackTraceString(th));
                }
            }
        });
        return true;
    }

    private void a(final String str, IOldAgooNotification iOldAgooNotification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d59022b", new Object[]{this, str, iOldAgooNotification});
            return;
        }
        if (this.d.containsKey(str)) {
            this.d.get(str).add(iOldAgooNotification);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(iOldAgooNotification);
            this.d.put(str, arrayList);
        }
        this.c.postDelayed(new Runnable() { // from class: com.taobao.msgnotification.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IOldAgooNotification iOldAgooNotification2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (g.a(g.this).get(str) == null || ((List) g.a(g.this).get(str)).size() <= 0) {
                } else {
                    List list = (List) g.a(g.this).get(str);
                    if (list.size() == 1) {
                        iOldAgooNotification2 = (IOldAgooNotification) list.get(0);
                    } else {
                        IOldAgooNotification iOldAgooNotification3 = (IOldAgooNotification) list.get(list.size() - 1);
                        iOldAgooNotification3.setTitle(b.a(R.string.mp_notification_taobao));
                        iOldAgooNotification3.setContent(b.a(R.string.mp_notification_you_have) + list.size() + b.a(R.string.mp_notification_unread_notification));
                        iOldAgooNotification3.setUrl(NavUrls.NAV_URL_MSG_CENTER_CATEGORY);
                        iOldAgooNotification2 = iOldAgooNotification3;
                    }
                    ((List) g.a(g.this).get(str)).clear();
                    try {
                        iOldAgooNotification2.performNotify();
                    } catch (Throwable th) {
                        k.a("AgooNotificationManger", "sendNotify is error,e=" + th.toString());
                        TLog.loge("AgooNotificationManger", Log.getStackTraceString(th));
                    }
                }
            }
        }, 1000L);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (Versions.isDebug()) {
            String str = "cancelNotify NotifyId=" + i + ", mNotifyManager=" + this.f18274a;
        }
        if (this.f18274a == null) {
            this.f18274a = (NotificationManager) Globals.getApplication().getSystemService(RemoteMessageConst.NOTIFICATION);
        }
        try {
            if (i == 0) {
                this.f18274a.cancelAll();
            } else {
                this.f18274a.cancel(i);
            }
        } catch (Exception e) {
            k.a("AgooNotificationManger", "cacelNotify;" + e.getMessage());
        }
    }

    @MethodSpy(name = "showNotification")
    public void a(String str, int i, Notification notification) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ba947", new Object[]{this, str, new Integer(i), notification});
            return;
        }
        try {
            b().notify(i, notification);
            a(str, i);
        } catch (SecurityException e) {
            k.a("AgooNotificationManger", e.toString());
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        Integer num = this.e.get(str);
        if (num == null) {
            return false;
        }
        a(num.intValue());
        this.e.remove(str);
        return true;
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.e.put(str.split("&&")[0], Integer.valueOf(i));
        }
    }
}
