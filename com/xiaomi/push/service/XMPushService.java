package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import com.taobao.weex.common.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.ah;
import com.xiaomi.push.db;
import com.xiaomi.push.dk;
import com.xiaomi.push.ds;
import com.xiaomi.push.du;
import com.xiaomi.push.es;
import com.xiaomi.push.fd;
import com.xiaomi.push.fj;
import com.xiaomi.push.gb;
import com.xiaomi.push.gd;
import com.xiaomi.push.gf;
import com.xiaomi.push.gm;
import com.xiaomi.push.gq;
import com.xiaomi.push.gr;
import com.xiaomi.push.gt;
import com.xiaomi.push.gv;
import com.xiaomi.push.gw;
import com.xiaomi.push.hb;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ic;
import com.xiaomi.push.ih;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jc;
import com.xiaomi.push.jm;
import com.xiaomi.push.js;
import com.xiaomi.push.service.bf;
import com.xiaomi.push.service.bq;
import com.xiaomi.push.service.q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.riy;

/* loaded from: classes9.dex */
public class XMPushService extends Service implements gt {
    private static boolean b = false;

    /* renamed from: a  reason: collision with other field name */
    private ContentObserver f870a;

    /* renamed from: a  reason: collision with other field name */
    private gm f872a;

    /* renamed from: a  reason: collision with other field name */
    private gq f873a;

    /* renamed from: a  reason: collision with other field name */
    private gr f874a;

    /* renamed from: a  reason: collision with other field name */
    private a f876a;

    /* renamed from: a  reason: collision with other field name */
    private f f877a;

    /* renamed from: a  reason: collision with other field name */
    private k f878a;

    /* renamed from: a  reason: collision with other field name */
    private r f879a;

    /* renamed from: a  reason: collision with other field name */
    private t f880a;

    /* renamed from: a  reason: collision with other field name */
    private bp f882a;

    /* renamed from: a  reason: collision with other field name */
    private com.xiaomi.push.service.k f883a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f888a = false;

    /* renamed from: a  reason: collision with root package name */
    private int f24608a = 0;

    /* renamed from: b  reason: collision with other field name */
    private int f889b = 0;

    /* renamed from: a  reason: collision with other field name */
    private long f869a = 0;

    /* renamed from: a  reason: collision with other field name */
    protected Class f885a = XMJobService.class;
    private int c = -1;

    /* renamed from: a  reason: collision with other field name */
    private bd f881a = null;

    /* renamed from: a  reason: collision with other field name */
    private com.xiaomi.push.service.q f884a = null;

    /* renamed from: a  reason: collision with other field name */
    Messenger f871a = null;

    /* renamed from: a  reason: collision with other field name */
    private Collection<aq> f887a = Collections.synchronizedCollection(new ArrayList());

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<n> f886a = new ArrayList<>();

    /* renamed from: a  reason: collision with other field name */
    private gv f875a = new cj(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with other field name */
        private final Object f890a;

        private a() {
            this.f890a = new Object();
        }

        /* synthetic */ a(XMPushService xMPushService, cj cjVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f890a) {
                try {
                    this.f890a.notifyAll();
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("[Alarm] notify lock. " + e);
                }
            }
        }

        private void a(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                com.xiaomi.channel.commonutils.logger.b.d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f890a) {
                try {
                    this.f890a.wait(j);
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] heartbeat alarm has been triggered.");
            if (!bj.q.equals(intent.getAction())) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("[Alarm] cancel the old ping timer");
                fj.a();
            } else if (!TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            } else {
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    a(3000L);
                    com.xiaomi.channel.commonutils.logger.b.m1616a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class b extends j {

        /* renamed from: a  reason: collision with other field name */
        bf.b f891a;

        public b(bf.b bVar) {
            super(9);
            this.f891a = null;
            this.f891a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "bind the client. " + this.f891a.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            try {
                if (!XMPushService.this.m2244c()) {
                    com.xiaomi.channel.commonutils.logger.b.d("trying bind while the connection is not created, quit!");
                } else {
                    bf.b a2 = bf.a().a(this.f891a.g, this.f891a.f960b);
                    if (a2 == null) {
                        com.xiaomi.channel.commonutils.logger.b.m1616a("ignore bind because the channel " + this.f891a.g + " is removed ");
                    } else if (a2.f955a == bf.c.unbind) {
                        a2.a(bf.c.binding, 0, 0, (String) null, (String) null);
                        XMPushService.this.f873a.a(a2);
                        gd.a(XMPushService.this, a2);
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m1616a("trying duplicate bind, ingore! " + a2.f955a);
                    }
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("Meet error when trying to bind. " + e);
                XMPushService.this.a(10, e);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class c extends j {

        /* renamed from: a  reason: collision with root package name */
        private final bf.b f24611a;

        public c(bf.b bVar) {
            super(12);
            this.f24611a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "bind time out. chid=" + this.f24611a.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            this.f24611a.a(bf.c.unbind, 1, 21, (String) null, (String) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return TextUtils.equals(((c) obj).f24611a.g, this.f24611a.g);
        }

        public int hashCode() {
            return this.f24611a.g.hashCode();
        }
    }

    /* loaded from: classes9.dex */
    class d extends j {

        /* renamed from: a  reason: collision with root package name */
        private gf f24612a;

        public d(gf gfVar) {
            super(8);
            this.f24612a = null;
            this.f24612a = gfVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            XMPushService.this.f881a.a(this.f24612a);
            if (com.xiaomi.push.service.e.a(this.f24612a)) {
                XMPushService.this.a(new bq.a(), 15000L);
            }
        }
    }

    /* loaded from: classes9.dex */
    public class e extends j {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e() {
            super(1);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "do reconnect..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            if (XMPushService.this.m2239a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.a(xMPushService.getApplicationContext())) {
                    XMPushService.this.f();
                    return;
                }
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("should not connect. quit the job.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* loaded from: classes9.dex */
    public class g extends j {

        /* renamed from: a  reason: collision with other field name */
        public Exception f893a;
        public int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(int i, Exception exc) {
            super(2);
            this.b = i;
            this.f893a = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "disconnect the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            XMPushService.this.a(this.b, this.f893a);
        }
    }

    /* loaded from: classes9.dex */
    class h extends j {
        h() {
            super(65535);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "Init Job";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            XMPushService.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class i extends j {

        /* renamed from: a  reason: collision with root package name */
        private Intent f24617a;

        public i(Intent intent) {
            super(15);
            this.f24617a = null;
            this.f24617a = intent;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "Handle intent action = " + this.f24617a.getAction();
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            XMPushService.this.d(this.f24617a);
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class j extends q.b {
        public j(int i) {
            super(i);
        }

        /* renamed from: a */
        public abstract String mo2367a();

        public abstract void a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24718a != 4 && this.f24718a != 8) {
                com.xiaomi.channel.commonutils.logger.b.m1617a(com.xiaomi.channel.commonutils.logger.a.f24275a, mo2367a());
            }
            a();
        }
    }

    /* loaded from: classes9.dex */
    class k extends BroadcastReceiver {
        k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("[HB] hold short heartbeat, " + com.xiaomi.push.j.a(intent));
            if (intent == null || intent.getExtras() == null) {
                return;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* loaded from: classes9.dex */
    class l extends j {
        public l() {
            super(5);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "ask the job queue to quit";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            XMPushService.this.f884a.m2348a();
        }
    }

    /* loaded from: classes9.dex */
    class m extends j {

        /* renamed from: a  reason: collision with root package name */
        private hh f24620a;

        public m(hh hhVar) {
            super(8);
            this.f24620a = null;
            this.f24620a = hhVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "receive a message.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            XMPushService.this.f881a.a(this.f24620a);
        }
    }

    /* loaded from: classes9.dex */
    public interface n {
        /* renamed from: a */
        void mo2024a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class o extends j {

        /* renamed from: a  reason: collision with other field name */
        boolean f896a;

        public o(boolean z) {
            super(4);
            this.f896a = z;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "send ping..";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            if (XMPushService.this.m2244c()) {
                try {
                    if (!this.f896a) {
                        gd.a();
                    }
                    XMPushService.this.f873a.b(this.f896a);
                } catch (hb e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    XMPushService.this.a(10, e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class p extends j {

        /* renamed from: a  reason: collision with other field name */
        bf.b f897a;

        public p(bf.b bVar) {
            super(4);
            this.f897a = null;
            this.f897a = bVar;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "rebind the client. " + this.f897a.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            try {
                this.f897a.a(bf.c.unbind, 1, 16, (String) null, (String) null);
                XMPushService.this.f873a.a(this.f897a.g, this.f897a.f960b);
                XMPushService.this.a(new b(this.f897a), 300L);
            } catch (hb e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
                XMPushService.this.a(10, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class q extends j {
        q() {
            super(3);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "reset the connection.";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            XMPushService.this.a(11, (Exception) null);
            if (XMPushService.this.m2239a()) {
                XMPushService xMPushService = XMPushService.this;
                if (!xMPushService.a(xMPushService.getApplicationContext())) {
                    return;
                }
                XMPushService.this.f();
            }
        }
    }

    /* loaded from: classes9.dex */
    class r extends BroadcastReceiver {
        r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public class s extends j {

        /* renamed from: a  reason: collision with other field name */
        bf.b f898a;

        /* renamed from: a  reason: collision with other field name */
        String f899a;
        int b;

        /* renamed from: b  reason: collision with other field name */
        String f900b;

        public s(bf.b bVar, int i, String str, String str2) {
            super(9);
            this.f898a = null;
            this.f898a = bVar;
            this.b = i;
            this.f899a = str;
            this.f900b = str2;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public String mo2367a() {
            return "unbind the channel. " + this.f898a.g;
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a  reason: collision with other method in class */
        public void mo2367a() {
            if (this.f898a.f955a != bf.c.unbind && XMPushService.this.f873a != null) {
                try {
                    XMPushService.this.f873a.a(this.f898a.g, this.f898a.f960b);
                } catch (hb e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    XMPushService.this.a(10, e);
                }
            }
            this.f898a.a(bf.c.unbind, this.b, 0, this.f900b, this.f899a);
        }
    }

    /* loaded from: classes9.dex */
    class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.this.f888a) {
                XMPushService.this.f888a = true;
            }
            XMPushService.this.onStart(intent, 1);
        }
    }

    private hh a(hh hhVar, String str, String str2) {
        StringBuilder sb;
        String str3;
        bf a2 = bf.a();
        List<String> m2304a = a2.m2304a(str);
        if (m2304a.isEmpty()) {
            sb = new StringBuilder();
            str3 = "open channel should be called first before sending a packet, pkg=";
        } else {
            hhVar.o(str);
            str = hhVar.k();
            if (TextUtils.isEmpty(str)) {
                str = m2304a.get(0);
                hhVar.l(str);
            }
            bf.b a3 = a2.a(str, hhVar.m());
            if (!m2244c()) {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not connected, chid=";
            } else if (a3 != null && a3.f955a == bf.c.binded) {
                if (TextUtils.equals(str2, a3.i)) {
                    return hhVar;
                }
                sb = new StringBuilder();
                sb.append("invalid session. ");
                sb.append(str2);
                com.xiaomi.channel.commonutils.logger.b.m1616a(sb.toString());
                return null;
            } else {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not opened, chid=";
            }
        }
        sb.append(str3);
        sb.append(str);
        com.xiaomi.channel.commonutils.logger.b.m1616a(sb.toString());
        return null;
    }

    private bf.b a(String str, Intent intent) {
        bf.b a2 = bf.a().a(str, intent.getStringExtra(bj.r));
        if (a2 == null) {
            a2 = new bf.b(this);
        }
        a2.g = intent.getStringExtra(bj.u);
        a2.f960b = intent.getStringExtra(bj.r);
        a2.c = intent.getStringExtra(bj.y);
        a2.f957a = intent.getStringExtra(bj.E);
        a2.e = intent.getStringExtra(bj.C);
        a2.f = intent.getStringExtra(bj.D);
        a2.f959a = intent.getBooleanExtra(bj.B, false);
        a2.h = intent.getStringExtra(bj.A);
        a2.i = intent.getStringExtra(bj.I);
        a2.d = intent.getStringExtra(bj.z);
        a2.f956a = this.f883a;
        a2.a((Messenger) intent.getParcelableExtra(bj.M));
        a2.f949a = getApplicationContext();
        bf.a().a(a2);
        return a2;
    }

    private String a() {
        String m2115a = com.xiaomi.push.j.m2115a("ro.miui.region");
        return TextUtils.isEmpty(m2115a) ? com.xiaomi.push.j.m2115a("ro.product.locale.region") : m2115a;
    }

    private void a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e2) {
                com.xiaomi.channel.commonutils.logger.b.a(e2);
            }
        }
    }

    private void a(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        String string = extras.getString(Constants.CodeCache.BANNER_DIGEST);
        com.xiaomi.push.service.p.a(getApplicationContext()).m2343a(string);
        db.a(this, string);
    }

    private void a(Intent intent, int i2) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        jb jbVar = new jb();
        try {
            jm.a(jbVar, byteArrayExtra);
            com.xiaomi.push.ah.a(getApplicationContext()).a((ah.a) new com.xiaomi.push.service.b(jbVar, new WeakReference(this), booleanExtra), i2);
        } catch (js unused) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_ping : send help app ping  error");
        }
    }

    private static void a(String str) {
        if (com.xiaomi.push.m.China.name().equals(str)) {
            com.xiaomi.push.cs.a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            com.xiaomi.push.cs.a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            com.xiaomi.push.cs.a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            com.xiaomi.push.cs.a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            com.xiaomi.push.cs.a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            com.xiaomi.push.cs.a("resolver.msg.xiaomi.net", "111.13.142.153:443");
            com.xiaomi.push.cs.a("resolver.msg.xiaomi.net", "111.202.1.252:443");
        }
    }

    private void a(String str, int i2) {
        Collection<bf.b> m2303a = bf.a().m2303a(str);
        if (m2303a != null) {
            for (bf.b bVar : m2303a) {
                if (bVar != null) {
                    a(new s(bVar, i2, null, null));
                }
            }
        }
        bf.a().m2306a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            com.xiaomi.push.an.a();
            for (int i2 = 100; i2 > 0; i2--) {
                if (com.xiaomi.push.bg.c(context)) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100L);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m2227a(String str, Intent intent) {
        bf.b a2 = bf.a().a(str, intent.getStringExtra(bj.r));
        boolean z = false;
        if (a2 == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(bj.I);
        String stringExtra2 = intent.getStringExtra(bj.A);
        if (!TextUtils.isEmpty(a2.i) && !TextUtils.equals(stringExtra, a2.i)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("session changed. old session=" + a2.i + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(a2.h)) {
            return z;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("security changed. chid = " + str + " sechash = " + com.xiaomi.push.bl.a(stringExtra2));
        return true;
    }

    /* renamed from: a  reason: collision with other method in class */
    private int[] m2228a() {
        String[] split;
        String a2 = az.a(getApplicationContext()).a(ih.FallDownTimeRange.a(), "");
        if (!TextUtils.isEmpty(a2) && (split = a2.split(",")) != null && split.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(split[0]).intValue();
                iArr[1] = Integer.valueOf(split[1]).intValue();
                if (iArr[0] >= 0 && iArr[0] <= 23 && iArr[1] >= 0 && iArr[1] <= 23) {
                    if (iArr[0] != iArr[1]) {
                        return iArr;
                    }
                }
            } catch (NumberFormatException e2) {
                com.xiaomi.channel.commonutils.logger.b.d("parse falldown time range failure: " + e2);
            }
        }
        return null;
    }

    private String b() {
        String str;
        com.xiaomi.push.an.a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        int i2 = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            bm a2 = bm.a(this);
            String str2 = null;
            while (true) {
                if (!TextUtils.isEmpty(str2) && a2.a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = a();
                }
                try {
                    synchronized (obj) {
                        if (i2 < 30) {
                            obj.wait(1000L);
                        } else {
                            obj.wait(30000L);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i2++;
            }
            str = a();
        } else {
            str = "CN";
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        com.xiaomi.channel.commonutils.logger.b.m1616a("wait coutrycode :" + str + " cost = " + elapsedRealtime2 + " , count = " + i2);
        return str;
    }

    private void b(Intent intent) {
        long j2;
        String stringExtra = intent.getStringExtra(bj.E);
        String stringExtra2 = intent.getStringExtra(bj.I);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        bf a2 = bf.a();
        gf gfVar = null;
        if (bundleExtra != null) {
            hg hgVar = (hg) a(new hg(bundleExtra), stringExtra, stringExtra2);
            if (hgVar == null) {
                return;
            }
            gfVar = gf.a(hgVar, a2.a(hgVar.k(), hgVar.m()).h);
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j2 = Long.parseLong(intent.getStringExtra(bj.r));
                } catch (NumberFormatException unused) {
                    j2 = 0;
                }
                String stringExtra3 = intent.getStringExtra(bj.s);
                String stringExtra4 = intent.getStringExtra(bj.t);
                String stringExtra5 = intent.getStringExtra("ext_chid");
                bf.b a3 = a2.a(stringExtra5, String.valueOf(j2));
                if (a3 != null) {
                    gf gfVar2 = new gf();
                    try {
                        gfVar2.a(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    gfVar2.a("SECMSG", (String) null);
                    if (TextUtils.isEmpty(stringExtra3)) {
                        stringExtra3 = "xiaomi.com";
                    }
                    gfVar2.a(j2, stringExtra3, stringExtra4);
                    gfVar2.a(intent.getStringExtra("ext_pkt_id"));
                    gfVar2.a(byteArrayExtra, a3.h);
                    com.xiaomi.channel.commonutils.logger.b.m1616a("send a message: chid=" + stringExtra5 + ", packetId=" + intent.getStringExtra("ext_pkt_id"));
                    gfVar = gfVar2;
                }
            }
        }
        if (gfVar != null) {
            c(new bu(this, gfVar));
        }
    }

    private void b(boolean z) {
        this.f869a = SystemClock.elapsedRealtime();
        if (!m2244c()) {
            a(true);
        } else if (com.xiaomi.push.bg.b(this)) {
            c(new o(z));
        } else {
            c(new g(17, null));
            a(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String str;
        com.xiaomi.push.cs.a().m1799d();
        com.xiaomi.push.service.p.a(getApplicationContext()).m2342a();
        com.xiaomi.push.service.a a2 = com.xiaomi.push.service.a.a(getApplicationContext());
        String a3 = a2.a();
        com.xiaomi.channel.commonutils.logger.b.m1617a("XMPushService", "region of cache is " + a3);
        if (TextUtils.isEmpty(a3)) {
            String b2 = b();
            str = b2;
            a3 = com.xiaomi.push.j.a(b2).name();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(a3) && com.xiaomi.push.m.China.name().equals(a3)) {
            a2.a(a3, true);
            a2.b("CN", true);
            str = "CN";
        } else if (!TextUtils.isEmpty(a3)) {
            if ("com.xiaomi.xmsf".equals(getPackageName())) {
                a3 = "";
                str = a3;
            } else {
                a3 = com.xiaomi.push.m.China.name();
                str = "CN";
            }
            a2.a(a3, true);
            a2.b(str, true);
        } else {
            a3 = com.xiaomi.push.m.China.name();
        }
        com.xiaomi.channel.commonutils.logger.b.m1618a("XMPushService", "after check, appRegion is ", a3, ", countryCode=", str);
        if (com.xiaomi.push.m.China.name().equals(a3)) {
            gr.a("cn.app.chat.xiaomi.net");
        }
        a(a3);
        if (m2233h()) {
            com.xiaomi.channel.commonutils.logger.b.m1617a("XMPushService", "-->postOnCreate(): try trigger connect now");
            ct ctVar = new ct(this, 11);
            a(ctVar);
            v.a(new cu(this, ctVar));
        }
        try {
            if (!com.xiaomi.push.r.m2214a()) {
                return;
            }
            this.f883a.a(this);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
        }
    }

    private void c(Intent intent) {
        String stringExtra = intent.getStringExtra(bj.E);
        String stringExtra2 = intent.getStringExtra(bj.I);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        hg[] hgVarArr = new hg[parcelableArrayExtra.length];
        intent.getBooleanExtra("ext_encrypt", true);
        for (int i2 = 0; i2 < parcelableArrayExtra.length; i2++) {
            hgVarArr[i2] = new hg((Bundle) parcelableArrayExtra[i2]);
            hgVarArr[i2] = (hg) a(hgVarArr[i2], stringExtra, stringExtra2);
            if (hgVarArr[i2] == null) {
                return;
            }
        }
        bf a2 = bf.a();
        gf[] gfVarArr = new gf[hgVarArr.length];
        for (int i3 = 0; i3 < hgVarArr.length; i3++) {
            hg hgVar = hgVarArr[i3];
            gfVarArr[i3] = gf.a(hgVar, a2.a(hgVar.k(), hgVar.m()).h);
        }
        c(new com.xiaomi.push.service.c(this, gfVarArr));
    }

    private void c(j jVar) {
        this.f884a.a(jVar);
    }

    private void c(boolean z) {
        try {
            if (!com.xiaomi.push.r.m2214a()) {
                return;
            }
            if (!z) {
                sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
                return;
            }
            sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
            for (aq aqVar : (aq[]) this.f887a.toArray(new aq[0])) {
                aqVar.mo2327a();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
        }
    }

    private void d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.b.a(e2);
            networkInfo = null;
        }
        com.xiaomi.push.service.p.a(getApplicationContext()).a(networkInfo);
        if (networkInfo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("network changed,");
            sb.append(riy.ARRAY_START_STR + "type: " + networkInfo.getTypeName() + riy.ARRAY_START_STR + networkInfo.getSubtypeName() + "], state: " + networkInfo.getState() + "/" + networkInfo.getDetailedState());
            com.xiaomi.channel.commonutils.logger.b.m1617a("XMPushService", sb.toString());
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            com.xiaomi.channel.commonutils.logger.b.m1617a("XMPushService", "network changed, no active network");
        }
        if (gb.a() != null) {
            gb.a().m1953a();
        }
        hv.m2022a((Context) this);
        this.f872a.d();
        if (com.xiaomi.push.bg.b(this)) {
            if (m2244c() && m2231f()) {
                b(false);
            }
            if (!m2244c() && !m2245d()) {
                this.f884a.a(1);
                a(new e());
            }
            du.a(this).a();
        } else {
            a(new g(2, null));
        }
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:400:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 2326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.d(android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (!m2239a()) {
            fj.a();
        } else if (fj.m1934a()) {
        } else {
            fj.a(true);
        }
    }

    private void e(Intent intent) {
        int i2;
        try {
            es.a(getApplicationContext()).a(new bl());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra == null) {
                return;
            }
            jb jbVar = new jb();
            jm.a(jbVar, byteArrayExtra);
            String b2 = jbVar.b();
            Map<String, String> m2129a = jbVar.m2129a();
            if (m2129a == null) {
                return;
            }
            String str = m2129a.get("extra_help_aw_info");
            String str2 = m2129a.get("extra_aw_app_online_cmd");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            try {
                i2 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                i2 = 0;
            }
            if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(b2) || TextUtils.isEmpty(str)) {
                return;
            }
            es.a(getApplicationContext()).a(this, str, i2, stringExtra, b2);
        } catch (js e2) {
            com.xiaomi.channel.commonutils.logger.b.d("aw_logic: translate fail. " + e2.getMessage());
        }
    }

    /* renamed from: e  reason: collision with other method in class */
    public static boolean m2230e() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String str;
        gq gqVar = this.f873a;
        if (gqVar == null || !gqVar.m1990b()) {
            gq gqVar2 = this.f873a;
            if (gqVar2 == null || !gqVar2.m1991c()) {
                this.f874a.b(com.xiaomi.push.bg.m1732a((Context) this));
                g();
                if (this.f873a != null) {
                    return;
                }
                bf.a().a(this);
                c(false);
                return;
            }
            str = "try to connect while is connected.";
        } else {
            str = "try to connect while connecting.";
        }
        com.xiaomi.channel.commonutils.logger.b.d(str);
    }

    /* renamed from: f  reason: collision with other method in class */
    private boolean m2231f() {
        if (SystemClock.elapsedRealtime() - this.f869a < 30000) {
            return false;
        }
        return com.xiaomi.push.bg.d(this);
    }

    private void g() {
        try {
            this.f872a.a(this.f875a, new cm(this));
            this.f872a.e();
            this.f873a = this.f872a;
        } catch (hb e2) {
            com.xiaomi.channel.commonutils.logger.b.a("fail to create Slim connection", e2);
            this.f872a.b(3, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g  reason: collision with other method in class */
    public boolean m2232g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    private void h() {
    }

    /* renamed from: h  reason: collision with other method in class */
    private boolean m2233h() {
        boolean z;
        String packageName = getPackageName();
        if ("com.xiaomi.xmsf".equals(packageName)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("current sdk expect region is cn");
            z = com.xiaomi.push.m.China.name().equals(com.xiaomi.push.service.a.a(getApplicationContext()).a());
        } else {
            z = !w.a(this).m2365b(packageName);
        }
        if (!z) {
            com.xiaomi.channel.commonutils.logger.b.m1618a("XMPushService", "-->isPushEnabled(): isEnabled=", Boolean.valueOf(z), ", package=", packageName, ", region=", com.xiaomi.push.service.a.a(getApplicationContext()).a());
        }
        return z;
    }

    private void i() {
        synchronized (this.f886a) {
            this.f886a.clear();
        }
    }

    /* renamed from: i  reason: collision with other method in class */
    private boolean m2234i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && j() && !com.xiaomi.push.i.m2030b((Context) this) && !com.xiaomi.push.i.m2027a(getApplicationContext());
    }

    private boolean j() {
        int intValue = Integer.valueOf(String.format("%tH", new Date())).intValue();
        int i2 = this.f24608a;
        int i3 = this.f889b;
        if (i2 > i3) {
            if (intValue >= i2 || intValue < i3) {
                return true;
            }
        } else if (i2 < i3 && intValue >= i2 && intValue < i3) {
            return true;
        }
        return false;
    }

    private boolean k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return az.a(this).a(ih.ForegroundServiceSwitch.a(), false);
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m2235a() {
        if (this.c < 0) {
            this.c = com.xiaomi.push.g.a((Context) this, "com.xiaomi.xmsf");
        }
        return this.c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public gq m2236a() {
        return this.f873a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public com.xiaomi.push.service.k m2237a() {
        return new com.xiaomi.push.service.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m2238a() {
        if (SystemClock.elapsedRealtime() - this.f869a >= gw.a() && com.xiaomi.push.bg.d(this)) {
            b(true);
        }
    }

    public void a(int i2) {
        this.f884a.a(i2);
    }

    public void a(int i2, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        gq gqVar = this.f873a;
        sb.append(gqVar == null ? null : Integer.valueOf(gqVar.hashCode()));
        com.xiaomi.channel.commonutils.logger.b.m1616a(sb.toString());
        gq gqVar2 = this.f873a;
        if (gqVar2 != null) {
            gqVar2.b(i2, exc);
            this.f873a = null;
        }
        a(7);
        a(4);
        bf.a().a(this, i2);
    }

    public void a(gf gfVar) {
        gq gqVar = this.f873a;
        if (gqVar != null) {
            gqVar.b(gfVar);
            return;
        }
        throw new hb("try send msg while connection is null.");
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar) {
        com.xiaomi.channel.commonutils.logger.b.c("begin to connect...");
        gb.a().a(gqVar);
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, int i2, Exception exc) {
        gb.a().a(gqVar, i2, exc);
        if (!m2234i()) {
            a(false);
        }
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, Exception exc) {
        gb.a().a(gqVar, exc);
        c(false);
        if (!m2234i()) {
            a(false);
        }
    }

    public void a(j jVar) {
        a(jVar, 0L);
    }

    public void a(j jVar, long j2) {
        try {
            this.f884a.a(jVar, j2);
        } catch (IllegalStateException e2) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("can't execute job err = " + e2.getMessage());
        }
    }

    public void a(n nVar) {
        synchronized (this.f886a) {
            this.f886a.add(nVar);
        }
    }

    public void a(bf.b bVar) {
        if (bVar != null) {
            long a2 = bVar.a();
            com.xiaomi.channel.commonutils.logger.b.m1616a("schedule rebind job in " + (a2 / 1000));
            a(new b(bVar), a2);
        }
    }

    public void a(String str, String str2, int i2, String str3, String str4) {
        bf.b a2 = bf.a().a(str, str2);
        if (a2 != null) {
            a(new s(a2, i2, str4, str3));
        }
        bf.a().m2307a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, byte[] bArr, boolean z) {
        Collection<bf.b> m2303a = bf.a().m2303a("5");
        if (m2303a.isEmpty()) {
            if (!z) {
                return;
            }
            y.b(str, bArr);
        } else if (m2303a.iterator().next().f955a == bf.c.binded) {
            a(new ck(this, 4, str, bArr));
        } else if (!z) {
        } else {
            y.b(str, bArr);
        }
    }

    public void a(boolean z) {
        this.f882a.a(z);
    }

    public void a(byte[] bArr, String str) {
        if (bArr == null) {
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            com.xiaomi.channel.commonutils.logger.b.m1616a("register request without payload");
            return;
        }
        iy iyVar = new iy();
        try {
            jm.a(iyVar, bArr);
            if (iyVar.f658a != ic.Registration) {
                y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                com.xiaomi.channel.commonutils.logger.b.m1616a("register request with invalid payload");
                return;
            }
            jc jcVar = new jc();
            try {
                jm.a(jcVar, iyVar.m2108a());
                a(new x(this, iyVar.b(), jcVar.b(), jcVar.c(), bArr));
                fd.a(getApplicationContext()).a(iyVar.b(), "E100003", jcVar.a(), 6002, null);
            } catch (js e2) {
                com.xiaomi.channel.commonutils.logger.b.d("app register error. " + e2);
                y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
            }
        } catch (js e3) {
            com.xiaomi.channel.commonutils.logger.b.d("app register fail. " + e3);
            y.a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    public void a(gf[] gfVarArr) {
        gq gqVar = this.f873a;
        if (gqVar != null) {
            gqVar.a(gfVarArr);
            return;
        }
        throw new hb("try send msg while connection is null.");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2239a() {
        boolean b2 = com.xiaomi.push.bg.b(this);
        boolean z = bf.a().m2301a() > 0;
        boolean z2 = !m2243b();
        boolean m2233h = m2233h();
        boolean z3 = !m2232g();
        boolean z4 = b2 && z && z2 && m2233h && z3;
        if (!z4) {
            com.xiaomi.channel.commonutils.logger.b.e(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", Boolean.valueOf(b2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(m2233h), Boolean.valueOf(z3)));
        }
        return z4;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m2240a(int i2) {
        return this.f884a.m2350a(i2);
    }

    /* renamed from: b  reason: collision with other method in class */
    public com.xiaomi.push.service.k m2241b() {
        return this.f883a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b  reason: collision with other method in class */
    public void m2242b() {
        com.xiaomi.push.service.p.a(getApplicationContext()).m2347d();
        Iterator it = new ArrayList(this.f886a).iterator();
        while (it.hasNext()) {
            ((n) it.next()).mo2024a();
        }
    }

    @Override // com.xiaomi.push.gt
    public void b(gq gqVar) {
        gb.a().b(gqVar);
        c(true);
        this.f882a.m2316a();
        if (!fj.m1934a() && !m2234i()) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("reconnection successful, reactivate alarm.");
            fj.a(true);
        }
        Iterator<bf.b> it = bf.a().m2302a().iterator();
        while (it.hasNext()) {
            a(new b(it.next()));
        }
        if (this.f888a || !com.xiaomi.push.j.m2118a(getApplicationContext())) {
            return;
        }
        com.xiaomi.push.ah.a(getApplicationContext()).a(new cn(this));
    }

    public void b(j jVar) {
        this.f884a.a(jVar.f24718a, jVar);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m2243b() {
        try {
            Class<?> a2 = com.xiaomi.push.r.a(this, "miui.os.Build");
            Field field = a2.getField("IS_CM_CUSTOMIZATION_TEST");
            Field field2 = a2.getField("IS_CU_CUSTOMIZATION_TEST");
            Field field3 = a2.getField("IS_CT_CUSTOMIZATION_TEST");
            if (!field.getBoolean(null) && !field2.getBoolean(null)) {
                if (!field3.getBoolean(null)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m2244c() {
        gq gqVar = this.f873a;
        return gqVar != null && gqVar.m1991c();
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m2245d() {
        gq gqVar = this.f873a;
        return gqVar != null && gqVar.m1990b();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f871a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        String[] split;
        super.onCreate();
        com.xiaomi.channel.commonutils.logger.b.a(getApplicationContext());
        com.xiaomi.push.r.a((Context) this);
        u m2360a = v.m2360a((Context) this);
        if (m2360a != null) {
            com.xiaomi.push.aa.a(m2360a.f24726a);
        }
        if (com.xiaomi.push.j.m2118a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f876a = new a(this, null);
            com.xiaomi.push.l.a(this, this.f876a, new IntentFilter(bj.q), "com.xiaomi.xmsf.permission.MIPUSH_RECEIVE", handler, 4);
            b = true;
            handler.post(new co(this));
        }
        this.f871a = new Messenger(new cp(this));
        bk.a(this);
        this.f874a = new cq(this, null, 5222, "xiaomi.com", null);
        this.f874a.a(true);
        this.f872a = new gm(this, this.f874a);
        this.f883a = m2237a();
        fj.a(this);
        this.f872a.a(this);
        this.f881a = new bd(this);
        this.f882a = new bp(this);
        new com.xiaomi.push.service.l().a();
        gb.m1954a().a(this);
        this.f884a = new com.xiaomi.push.service.q("Connection Controller Thread");
        bf a2 = bf.a();
        a2.b();
        a2.a(new cr(this));
        if (k()) {
            h();
        }
        ia.a(this).a(new com.xiaomi.push.service.s(this), "UPLOADER_PUSH_CHANNEL");
        a(new hx(this));
        a(new ch(this));
        if (com.xiaomi.push.j.m2118a((Context) this)) {
            a(new be());
        }
        a(new h());
        this.f887a.add(by.a(this));
        if (m2233h()) {
            this.f877a = new f();
            registerReceiver(this.f877a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (com.xiaomi.push.j.m2118a(getApplicationContext())) {
            this.f880a = new t();
            com.xiaomi.push.l.a(this, this.f880a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", null, 2);
            this.f878a = new k();
            com.xiaomi.push.l.a(this, this.f878a, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", null, 2);
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f870a = new cs(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f870a);
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.b.d("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] m2228a = m2228a();
            if (m2228a != null) {
                this.f879a = new r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f879a, intentFilter);
                this.f24608a = m2228a[0];
                this.f889b = m2228a[1];
                com.xiaomi.channel.commonutils.logger.b.m1616a("falldown initialized: " + this.f24608a + "," + this.f889b);
            }
        }
        db.a(this, this.f872a);
        dk.a(this, this.f872a);
        String str = "";
        if (m2360a != null) {
            try {
                if (!TextUtils.isEmpty(m2360a.f1028a) && (split = m2360a.f1028a.split("@")) != null && split.length > 0) {
                    str = split[0];
                }
            } catch (Exception unused) {
            }
        }
        ds.a(this);
        com.xiaomi.channel.commonutils.logger.b.e("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + com.xiaomi.push.g.a(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    @Override // android.app.Service
    public void onDestroy() {
        f fVar = this.f877a;
        if (fVar != null) {
            a(fVar);
            this.f877a = null;
        }
        t tVar = this.f880a;
        if (tVar != null) {
            a(tVar);
            this.f880a = null;
        }
        k kVar = this.f878a;
        if (kVar != null) {
            a(kVar);
            this.f878a = null;
        }
        r rVar = this.f879a;
        if (rVar != null) {
            a(rVar);
            this.f879a = null;
        }
        a aVar = this.f876a;
        if (aVar != null) {
            a(aVar);
            this.f876a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f870a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f870a);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.d("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f887a.clear();
        this.f884a.m2351b();
        a(new cl(this, 2));
        a(new l());
        bf.a().b();
        bf.a().a(this, 15);
        bf.a().m2305a();
        this.f872a.b(this);
        bw.a().m2325a();
        fj.a();
        i();
        db.b(this, this.f872a);
        dk.b(this, this.f872a);
        super.onDestroy();
        com.xiaomi.channel.commonutils.logger.b.m1616a("Service destroyed");
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        String format;
        i iVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            com.xiaomi.channel.commonutils.logger.b.d("onStart() with intent NULL");
        } else {
            try {
                String stringExtra = intent.getStringExtra(bj.u);
                String stringExtra2 = intent.getStringExtra(bj.E);
                String stringExtra3 = intent.getStringExtra("mipush_app_package");
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && !"miui.net.wifi.DIGEST_INFORMATION_CHANGED".equals(intent.getAction())) {
                    format = String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", intent.getAction(), stringExtra, stringExtra2, stringExtra3);
                    com.xiaomi.channel.commonutils.logger.b.m1617a("XMPushService", format);
                }
                format = String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, intent = %s", intent.getAction(), stringExtra, stringExtra2, stringExtra3, com.xiaomi.push.j.a(intent));
                com.xiaomi.channel.commonutils.logger.b.m1617a("XMPushService", format);
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.b.d("onStart() cause error: " + th.getMessage());
                return;
            }
        }
        if (intent != null && intent.getAction() != null) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f884a.m2349a()) {
                    com.xiaomi.channel.commonutils.logger.b.d("ERROR, the job controller is blocked.");
                    bf.a().a(this, 14);
                    stopSelf();
                } else {
                    iVar = new i(intent);
                    a(iVar);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                iVar = new i(intent);
                a(iVar);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            com.xiaomi.channel.commonutils.logger.b.c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        onStart(intent, i3);
        return 1;
    }
}
