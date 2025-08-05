package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.push.ic;
import com.xiaomi.push.ig;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.ca;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.riy;

/* loaded from: classes9.dex */
public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static volatile a f24296a;

        /* renamed from: a  reason: collision with other field name */
        private Context f28a;

        /* renamed from: a  reason: collision with other field name */
        private Boolean f30a;

        /* renamed from: a  reason: collision with other field name */
        private String f31a;

        /* renamed from: a  reason: collision with other field name */
        private C1054a f29a = new C1054a();

        /* renamed from: a  reason: collision with other field name */
        private final ArrayList<ig> f32a = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public class C1054a {

            /* renamed from: a  reason: collision with other field name */
            private ScheduledFuture<?> f35a;

            /* renamed from: a  reason: collision with other field name */
            private ScheduledThreadPoolExecutor f36a = new ScheduledThreadPoolExecutor(1);

            /* renamed from: a  reason: collision with other field name */
            public final ArrayList<ig> f34a = new ArrayList<>();

            /* renamed from: a  reason: collision with other field name */
            private final Runnable f33a = new ab(this);

            public C1054a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a() {
                if (this.f35a == null) {
                    this.f35a = this.f36a.scheduleAtFixedRate(this.f33a, 1000L, 1000L, TimeUnit.MILLISECONDS);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b() {
                ig remove = this.f34a.remove(0);
                for (jb jbVar : ca.a(Arrays.asList(remove), a.this.f28a.getPackageName(), b.m1665a(a.this.f28a).m1666a(), 30720)) {
                    com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.d());
                    ao.a(a.this.f28a).a((ao) jbVar, ic.Notification, true, (ip) null);
                }
            }

            public void a(ig igVar) {
                this.f36a.execute(new aa(this, igVar));
            }
        }

        public static a a() {
            if (f24296a == null) {
                synchronized (a.class) {
                    if (f24296a == null) {
                        f24296a = new a();
                    }
                }
            }
            return f24296a;
        }

        private void a(ig igVar) {
            synchronized (this.f32a) {
                if (!this.f32a.contains(igVar)) {
                    this.f32a.add(igVar);
                    if (this.f32a.size() > 100) {
                        this.f32a.remove(0);
                    }
                }
            }
        }

        private boolean a(Context context) {
            if (!ao.a(context).m1658a()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                if (packageInfo == null) {
                    return false;
                }
                return packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        private boolean b(Context context) {
            return b.m1665a(context).m1666a() == null && !a(this.f28a);
        }

        private boolean b(ig igVar) {
            if (ca.a(igVar, false)) {
                return false;
            }
            if (!this.f30a.booleanValue()) {
                this.f29a.a(igVar);
                return true;
            }
            com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + igVar.d());
            ao.a(this.f28a).a(igVar);
            return true;
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m1636a(Context context) {
            if (context == null) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f28a = context;
            this.f30a = Boolean.valueOf(a(context));
            b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        public synchronized void a(String str) {
            if (TextUtils.isEmpty(str)) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
                return;
            }
            this.f31a = str;
            b(MiTinyDataClient.PENDING_REASON_CHANNEL);
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m1637a() {
            return this.f28a != null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
            r0 = "MiTinyDataClient Pending " + r6.b() + " reason is " + com.xiaomi.mipush.sdk.MiTinyDataClient.PENDING_REASON_CHANNEL;
         */
        /* renamed from: a  reason: collision with other method in class */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public synchronized boolean m1638a(com.xiaomi.push.ig r6) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiTinyDataClient.a.m1638a(com.xiaomi.push.ig):boolean");
        }

        public void b(String str) {
            com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient.processPendingList(" + str + riy.BRACKET_END_STR);
            ArrayList arrayList = new ArrayList();
            synchronized (this.f32a) {
                arrayList.addAll(this.f32a);
                this.f32a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m1638a((ig) it.next());
            }
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        a.a().m1636a(context);
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            a.a().a(str);
        }
    }

    public static boolean upload(Context context, ig igVar) {
        com.xiaomi.channel.commonutils.logger.b.c("MiTinyDataClient.upload " + igVar.d());
        if (!a.a().m1637a()) {
            a.a().m1636a(context);
        }
        return a.a().m1638a(igVar);
    }

    public static boolean upload(Context context, String str, String str2, long j, String str3) {
        ig igVar = new ig();
        igVar.d(str);
        igVar.c(str2);
        igVar.a(j);
        igVar.b(str3);
        igVar.a(true);
        igVar.a("push_sdk_channel");
        return upload(context, igVar);
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        ig igVar = new ig();
        igVar.d(str);
        igVar.c(str2);
        igVar.a(j);
        igVar.b(str3);
        return a.a().m1638a(igVar);
    }
}
