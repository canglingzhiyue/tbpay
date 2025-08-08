package com.xiaomi.mipush.sdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.xiaomi.push.bg;
import com.xiaomi.push.bh;
import com.xiaomi.push.bl;
import com.xiaomi.push.di;
import com.xiaomi.push.fd;
import com.xiaomi.push.ic;
import com.xiaomi.push.id;
import com.xiaomi.push.ig;
import com.xiaomi.push.ih;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.ji;
import com.xiaomi.push.jm;
import com.xiaomi.push.jn;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bj;
import com.xiaomi.push.service.bm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class ao {

    /* renamed from: a  reason: collision with root package name */
    private static ao f24312a = null;

    /* renamed from: a  reason: collision with other field name */
    private static final ArrayList<a> f48a = new ArrayList<>();
    private static boolean b = false;

    /* renamed from: a  reason: collision with other field name */
    private long f49a;

    /* renamed from: a  reason: collision with other field name */
    private Context f50a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f52a;

    /* renamed from: a  reason: collision with other field name */
    private Messenger f53a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f57a;

    /* renamed from: a  reason: collision with other field name */
    private List<Message> f56a = new ArrayList();
    private boolean c = false;

    /* renamed from: b  reason: collision with other field name */
    private String f58b = null;

    /* renamed from: a  reason: collision with other field name */
    private Intent f51a = null;

    /* renamed from: a  reason: collision with other field name */
    private Integer f54a = null;

    /* renamed from: a  reason: collision with other field name */
    private String f55a = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a<T extends jn<T, ?>> {

        /* renamed from: a  reason: collision with root package name */
        ic f24313a;

        /* renamed from: a  reason: collision with other field name */
        T f59a;

        /* renamed from: a  reason: collision with other field name */
        boolean f60a;

        a() {
        }
    }

    private ao(Context context) {
        this.f57a = false;
        this.f52a = null;
        this.f50a = context.getApplicationContext();
        this.f57a = m1651c();
        b = m1652d();
        this.f52a = new ap(this, Looper.getMainLooper());
        if (com.xiaomi.push.j.m2118a(context)) {
            com.xiaomi.push.service.j.a(new aq(this));
        }
        Intent b2 = b();
        if (b2 != null) {
            b(b2);
        }
    }

    private synchronized int a() {
        return this.f50a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    /* renamed from: a  reason: collision with other method in class */
    private Intent m1646a() {
        return (!m1658a() || "com.xiaomi.xmsf".equals(this.f50a.getPackageName())) ? e() : d();
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    public static synchronized ao a(Context context) {
        ao aoVar;
        synchronized (ao.class) {
            if (f24312a == null) {
                f24312a = new ao(context);
            }
            aoVar = f24312a;
        }
        return aoVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private String m1649a() {
        String str = this.f58b;
        if (str != null) {
            return str;
        }
        try {
            if (this.f50a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f58b = "com.xiaomi.push.service.XMPushService";
                return this.f58b;
            }
        } catch (Exception unused) {
        }
        this.f58b = "com.xiaomi.xmsf.push.service.XMPushService";
        return this.f58b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, au auVar, boolean z, HashMap<String, String> hashMap) {
        jb jbVar;
        String str2;
        if (!b.m1665a(this.f50a).m1672b() || !bg.b(this.f50a)) {
            return;
        }
        jb jbVar2 = new jb();
        jbVar2.a(true);
        Intent m1646a = m1646a();
        if (StringUtils.isEmpty(str)) {
            str = bc.a();
            jbVar2.a(str);
            jbVar = z ? new jb(str, true) : null;
            synchronized (af.class) {
                af.a(this.f50a).m1642a(str);
            }
        } else {
            jbVar2.a(str);
            jbVar = z ? new jb(str, true) : null;
        }
        switch (at.f24318a[auVar.ordinal()]) {
            case 1:
                jbVar2.c(im.DisablePushMessage.f538a);
                jbVar.c(im.DisablePushMessage.f538a);
                if (hashMap != null) {
                    jbVar2.a(hashMap);
                    jbVar.a(hashMap);
                }
                str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                m1646a.setAction(str2);
                break;
            case 2:
                jbVar2.c(im.EnablePushMessage.f538a);
                jbVar.c(im.EnablePushMessage.f538a);
                if (hashMap != null) {
                    jbVar2.a(hashMap);
                    jbVar.a(hashMap);
                }
                str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                m1646a.setAction(str2);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                jbVar2.c(im.ThirdPartyRegUpdate.f538a);
                if (hashMap != null) {
                    jbVar2.a(hashMap);
                    break;
                }
                break;
        }
        com.xiaomi.channel.commonutils.logger.b.e("type:" + auVar + ", " + str);
        jbVar2.b(b.m1665a(this.f50a).m1666a());
        jbVar2.d(this.f50a.getPackageName());
        a((ao) jbVar2, ic.Notification, false, (ip) null);
        if (z) {
            jbVar.b(b.m1665a(this.f50a).m1666a());
            jbVar.d(this.f50a.getPackageName());
            byte[] a2 = jm.a(ai.a(this.f50a, jbVar, ic.Notification, false, this.f50a.getPackageName(), b.m1665a(this.f50a).m1666a()));
            if (a2 != null) {
                di.a(this.f50a.getPackageName(), this.f50a, jbVar, ic.Notification, a2.length);
                m1646a.putExtra("mipush_payload", a2);
                m1646a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                m1646a.putExtra("mipush_app_id", b.m1665a(this.f50a).m1666a());
                m1646a.putExtra("mipush_app_token", b.m1665a(this.f50a).b());
                c(m1646a);
            }
        }
        Message obtain = Message.obtain();
        obtain.what = 19;
        int ordinal = auVar.ordinal();
        obtain.obj = str;
        obtain.arg1 = ordinal;
        if (hashMap != null && hashMap.get("third_sync_reason") != null) {
            Bundle bundle = new Bundle();
            bundle.putString("third_sync_reason", hashMap.get("third_sync_reason"));
            obtain.setData(bundle);
        }
        this.f52a.sendMessageDelayed(obtain, 5000L);
    }

    private Intent b() {
        if (!"com.xiaomi.xmsf".equals(this.f50a.getPackageName())) {
            return c();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel xmsf create own channel");
        return e();
    }

    private void b(Intent intent) {
        try {
            if (com.xiaomi.push.j.m2117a() || Build.VERSION.SDK_INT < 26) {
                this.f50a.startService(intent);
            } else {
                d(intent);
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }

    private Intent c() {
        if (m1658a()) {
            com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start miui china channel");
            return d();
        }
        com.xiaomi.channel.commonutils.logger.b.c("pushChannel app start  own channel");
        return e();
    }

    private synchronized void c(int i) {
        this.f50a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i).commit();
    }

    private void c(Intent intent) {
        int a2 = az.a(this.f50a).a(ih.ServiceBootMode.a(), id.START.a());
        int a3 = a();
        boolean z = a2 == id.BIND.a() && b;
        int a4 = (z ? id.BIND : id.START).a();
        if (a4 != a3) {
            m1659a(a4);
        }
        if (z) {
            d(intent);
        } else {
            b(intent);
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    private boolean m1651c() {
        try {
            PackageInfo packageInfo = this.f50a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Intent d() {
        Intent intent = new Intent();
        String packageName = this.f50a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", m1649a());
        intent.putExtra("mipush_app_package", packageName);
        h();
        return intent;
    }

    private synchronized void d(Intent intent) {
        if (this.c) {
            Message a2 = a(intent);
            if (this.f56a.size() >= 50) {
                this.f56a.remove(0);
            }
            this.f56a.add(a2);
        } else if (this.f53a == null) {
            this.f50a.bindService(intent, new as(this), 1);
            this.c = true;
            this.f56a.clear();
            this.f56a.add(a(intent));
        } else {
            try {
                this.f53a.send(a(intent));
            } catch (RemoteException unused) {
                this.f53a = null;
                this.c = false;
            }
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    private boolean m1652d() {
        if (m1658a()) {
            try {
                return this.f50a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    private Intent e() {
        Intent intent = new Intent();
        String packageName = this.f50a.getPackageName();
        i();
        intent.setComponent(new ComponentName(this.f50a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* renamed from: e  reason: collision with other method in class */
    private boolean m1653e() {
        String packageName = this.f50a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f50a.getApplicationInfo().flags & 1) != 0;
    }

    private void g() {
        this.f49a = SystemClock.elapsedRealtime();
    }

    private void h() {
        try {
            PackageManager packageManager = this.f50a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f50a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    private void i() {
        try {
            PackageManager packageManager = this.f50a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f50a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m1654a() {
        return this.f49a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1655a() {
        b(m1646a());
    }

    public void a(int i) {
        a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m1646a.putExtra(bj.E, this.f50a.getPackageName());
        m1646a.putExtra(bj.F, i);
        m1646a.putExtra(bj.G, i2);
        c(m1646a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, String str) {
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.thirdparty");
        m1646a.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        m1646a.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        b(m1646a);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1656a(Context context) {
        if (com.xiaomi.push.j.m2117a()) {
            return;
        }
        ag a2 = n.a(context);
        if (ag.HUAWEI.equals(a2)) {
            a((String) null, au.UPLOAD_HUAWEI_TOKEN, e.ASSEMBLE_PUSH_HUAWEI, "update");
        }
        if (ag.OPPO.equals(a2)) {
            a((String) null, au.UPLOAD_COS_TOKEN, e.ASSEMBLE_PUSH_COS, "update");
        }
        if (!ag.VIVO.equals(a2)) {
            return;
        }
        a((String) null, au.UPLOAD_FTOS_TOKEN, e.ASSEMBLE_PUSH_FTOS, "update");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m1657a(Intent intent) {
        intent.fillIn(m1646a(), 24);
        c(intent);
    }

    public final void a(ig igVar) {
        Intent m1646a = m1646a();
        byte[] a2 = jm.a(igVar);
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        m1646a.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        m1646a.putExtra("mipush_payload", a2);
        b(m1646a);
    }

    public final void a(jc jcVar, boolean z) {
        fd.a(this.f50a.getApplicationContext()).a(this.f50a.getPackageName(), "E100003", jcVar.a(), 6001, null);
        this.f51a = null;
        b.m1665a(this.f50a).f65a = jcVar.a();
        Intent m1646a = m1646a();
        byte[] a2 = jm.a(ai.a(this.f50a, jcVar, ic.Registration));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("register fail, because msgBytes is null.");
            return;
        }
        m1646a.setAction("com.xiaomi.mipush.REGISTER_APP");
        m1646a.putExtra("mipush_app_id", b.m1665a(this.f50a).m1666a());
        m1646a.putExtra("mipush_payload", a2);
        m1646a.putExtra("mipush_session", this.f55a);
        m1646a.putExtra("mipush_env_chanage", z);
        m1646a.putExtra("mipush_env_type", b.m1665a(this.f50a).a());
        if (!bg.b(this.f50a) || !m1661b()) {
            this.f51a = m1646a;
            return;
        }
        g();
        c(m1646a);
    }

    public final void a(ji jiVar) {
        byte[] a2 = jm.a(ai.a(this.f50a, jiVar, ic.UnRegistration));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        m1646a.putExtra("mipush_app_id", b.m1665a(this.f50a).m1666a());
        m1646a.putExtra("mipush_payload", a2);
        c(m1646a);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, ip ipVar) {
        a((ao) t, icVar, !icVar.equals(ic.Registration), ipVar);
    }

    public <T extends jn<T, ?>> void a(T t, ic icVar, boolean z) {
        a aVar = new a();
        aVar.f59a = t;
        aVar.f24313a = icVar;
        aVar.f60a = z;
        synchronized (f48a) {
            f48a.add(aVar);
            if (f48a.size() > 10) {
                f48a.remove(0);
            }
        }
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, ip ipVar) {
        a(t, icVar, z, true, ipVar, true);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, ip ipVar, boolean z2) {
        a(t, icVar, z, true, ipVar, z2);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3) {
        a(t, icVar, z, z2, ipVar, z3, this.f50a.getPackageName(), b.m1665a(this.f50a).m1666a());
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3, String str, String str2) {
        a(t, icVar, z, z2, ipVar, z3, str, str2, true);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3, String str, String str2, boolean z4) {
        a(t, icVar, z, z2, ipVar, z3, str, str2, z4, true);
    }

    public final <T extends jn<T, ?>> void a(T t, ic icVar, boolean z, boolean z2, ip ipVar, boolean z3, String str, String str2, boolean z4, boolean z5) {
        if (z5 && !b.m1665a(this.f50a).m1674c()) {
            if (z2) {
                a((ao) t, icVar, z);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.b.m1616a("drop the message before initialization.");
                return;
            }
        }
        iy a2 = z4 ? ai.a(this.f50a, t, icVar, z, str, str2) : ai.b(this.f50a, t, icVar, z, str, str2);
        if (ipVar != null) {
            a2.a(ipVar);
        }
        byte[] a3 = jm.a(a2);
        if (a3 == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("send message fail, because msgBytes is null.");
            return;
        }
        di.a(this.f50a.getPackageName(), this.f50a, t, icVar, a3.length);
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.SEND_MESSAGE");
        m1646a.putExtra("mipush_payload", a3);
        m1646a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        c(m1646a);
    }

    public final void a(String str, au auVar, e eVar, String str2) {
        af.a(this.f50a).a(auVar, "syncing");
        HashMap<String, String> m1684a = i.m1684a(this.f50a, eVar);
        m1684a.put("third_sync_reason", str2);
        a(str, auVar, false, m1684a);
    }

    public void a(String str, String str2) {
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m1646a.putExtra(bj.E, this.f50a.getPackageName());
        m1646a.putExtra(bj.K, str);
        m1646a.putExtra(bj.L, str2);
        c(m1646a);
    }

    public final void a(boolean z) {
        a(z, (String) null);
    }

    public final void a(boolean z, String str) {
        au auVar;
        if (z) {
            af.a(this.f50a).a(au.DISABLE_PUSH, "syncing");
            af.a(this.f50a).a(au.ENABLE_PUSH, "");
            auVar = au.DISABLE_PUSH;
        } else {
            af.a(this.f50a).a(au.ENABLE_PUSH, "syncing");
            af.a(this.f50a).a(au.DISABLE_PUSH, "");
            auVar = au.ENABLE_PUSH;
        }
        a(str, auVar, true, (HashMap<String, String>) null);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1658a() {
        return this.f57a && 1 == b.m1665a(this.f50a).a();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1659a(int i) {
        if (!b.m1665a(this.f50a).m1672b()) {
            return false;
        }
        c(i);
        jb jbVar = new jb();
        jbVar.a(bc.a());
        jbVar.b(b.m1665a(this.f50a).m1666a());
        jbVar.d(this.f50a.getPackageName());
        jbVar.c(im.ClientABTest.f538a);
        jbVar.f678a = new HashMap();
        Map<String, String> map = jbVar.f678a;
        map.put("boot_mode", i + "");
        a(this.f50a).a((ao) jbVar, ic.Notification, false, (ip) null);
        return true;
    }

    /* renamed from: b  reason: collision with other method in class */
    public final void m1660b() {
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        c(m1646a);
    }

    public void b(int i) {
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m1646a.putExtra(bj.E, this.f50a.getPackageName());
        m1646a.putExtra(bj.H, i);
        String str = bj.J;
        m1646a.putExtra(str, bl.b(this.f50a.getPackageName() + i));
        c(m1646a);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m1661b() {
        if (!m1658a() || !m1653e()) {
            return true;
        }
        if (this.f54a == null) {
            this.f54a = Integer.valueOf(bm.a(this.f50a).a());
            if (this.f54a.intValue() == 0) {
                this.f50a.getContentResolver().registerContentObserver(bm.a(this.f50a).m2313a(), false, new ar(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f54a.intValue() != 0;
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m1662c() {
        if (this.f51a != null) {
            g();
            c(this.f51a);
            this.f51a = null;
        }
    }

    /* renamed from: d  reason: collision with other method in class */
    public void m1663d() {
        synchronized (f48a) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            Iterator<a> it = f48a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                a(next.f59a, next.f24313a, next.f60a, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            f48a.clear();
        }
    }

    /* renamed from: e  reason: collision with other method in class */
    public void m1664e() {
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) bh.a(ProcessUtils.ACTIVITY_THREAD, "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f50a.getPackageName();
        if (StringUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            com.xiaomi.channel.commonutils.logger.b.m1616a("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        m1646a.putExtra(bj.E, packageName);
        c(m1646a);
    }

    public void f() {
        Intent m1646a = m1646a();
        m1646a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m1646a.putExtra(bj.E, this.f50a.getPackageName());
        m1646a.putExtra(bj.J, bl.b(this.f50a.getPackageName()));
        c(m1646a);
    }
}
