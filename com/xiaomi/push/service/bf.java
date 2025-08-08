package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public class bf {

    /* renamed from: a  reason: collision with root package name */
    private static bf f24662a;

    /* renamed from: a  reason: collision with other field name */
    private ConcurrentHashMap<String, HashMap<String, b>> f948a = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private List<a> f947a = new ArrayList();

    /* loaded from: classes9.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with other field name */
        public Context f949a;

        /* renamed from: a  reason: collision with other field name */
        Messenger f951a;

        /* renamed from: a  reason: collision with other field name */
        private XMPushService f953a;

        /* renamed from: a  reason: collision with other field name */
        public k f956a;

        /* renamed from: a  reason: collision with other field name */
        public String f957a;

        /* renamed from: a  reason: collision with other field name */
        public boolean f959a;

        /* renamed from: b  reason: collision with other field name */
        public String f960b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;

        /* renamed from: a  reason: collision with other field name */
        c f955a = c.unbind;

        /* renamed from: a  reason: collision with root package name */
        private int f24663a = 0;

        /* renamed from: a  reason: collision with other field name */
        private final CopyOnWriteArrayList<a> f958a = new CopyOnWriteArrayList<>();
        c b = null;

        /* renamed from: b  reason: collision with other field name */
        private boolean f961b = false;

        /* renamed from: a  reason: collision with other field name */
        private XMPushService.c f952a = new XMPushService.c(this);

        /* renamed from: a  reason: collision with other field name */
        IBinder.DeathRecipient f950a = null;

        /* renamed from: a  reason: collision with other field name */
        final C1056b f954a = new C1056b();

        /* loaded from: classes9.dex */
        public interface a {
            void a(c cVar, c cVar2, int i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.xiaomi.push.service.bf$b$b  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public class C1056b extends XMPushService.j {

            /* renamed from: a  reason: collision with other field name */
            String f962a;
            int b;

            /* renamed from: b  reason: collision with other field name */
            String f963b;
            int c;

            public C1056b() {
                super(0);
            }

            public XMPushService.j a(int i, int i2, String str, String str2) {
                this.b = i;
                this.c = i2;
                this.f963b = str2;
                this.f962a = str;
                return this;
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public String mo2367a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a  reason: collision with other method in class */
            public void mo2367a() {
                if (b.this.a(this.b, this.c, this.f963b)) {
                    b.this.a(this.b, this.c, this.f962a, this.f963b);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b(" ignore notify client :" + b.this.g);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes9.dex */
        public class c implements IBinder.DeathRecipient {

            /* renamed from: a  reason: collision with root package name */
            final Messenger f24665a;

            /* renamed from: a  reason: collision with other field name */
            final b f964a;

            c(b bVar, Messenger messenger) {
                this.f964a = bVar;
                this.f24665a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.xiaomi.channel.commonutils.logger.b.b("peer died, chid = " + this.f964a.g);
                b.this.f953a.a(new bh(this, 0), 0L);
                if (!"9".equals(this.f964a.g) || !"com.xiaomi.xmsf".equals(b.this.f953a.getPackageName())) {
                    return;
                }
                b.this.f953a.a(new bi(this, 0), 60000L);
            }
        }

        public b() {
        }

        public b(XMPushService xMPushService) {
            this.f953a = xMPushService;
            a(new bg(this));
        }

        public static String a(String str) {
            int lastIndexOf;
            return (!StringUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf("/")) != -1) ? str.substring(lastIndexOf + 1) : "";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i2, String str, String str2) {
            c cVar = this.f955a;
            this.b = cVar;
            if (i == 2) {
                this.f956a.a(this.f949a, this, i2);
            } else if (i == 3) {
                this.f956a.a(this.f949a, this, str2, str);
            } else if (i != 1) {
            } else {
                boolean z = cVar == c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f24663a++;
                } else if (z) {
                    this.f24663a = 0;
                    if (this.f951a != null) {
                        try {
                            this.f951a.send(Message.obtain(null, 16, this.f953a.f871a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f956a.a(this.f953a, this, z, i2, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(int i, int i2, String str) {
            boolean z;
            StringBuilder sb;
            String str2;
            c cVar = this.b;
            if (cVar == null || !(z = this.f961b)) {
                return true;
            }
            if (cVar == this.f955a) {
                sb = new StringBuilder();
                str2 = " status recovered, don't notify client:";
            } else if (this.f951a != null && z) {
                com.xiaomi.channel.commonutils.logger.b.b("Peer alive notify status to client:" + this.g);
                return true;
            } else {
                sb = new StringBuilder();
                str2 = "peer died, ignore notify ";
            }
            sb.append(str2);
            sb.append(this.g);
            com.xiaomi.channel.commonutils.logger.b.b(sb.toString());
            return false;
        }

        private boolean b(int i, int i2, String str) {
            return i != 1 ? i != 2 ? i == 3 && !"wait".equals(str) : this.f953a.m2244c() : this.f955a != c.binded && this.f953a.m2244c() && i2 != 21 && (i2 != 7 || !"wait".equals(str));
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((this.f24663a + 1) * 15)) * 1000;
        }

        public String a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? "unknown" : "KICK" : Constrant.ChangeStatus.CLOSE : "OPEN";
        }

        /* renamed from: a  reason: collision with other method in class */
        void m2309a() {
            try {
                Messenger messenger = this.f951a;
                if (messenger != null && this.f950a != null) {
                    messenger.getBinder().unlinkToDeath(this.f950a, 0);
                }
            } catch (Exception unused) {
            }
            this.b = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(Messenger messenger) {
            m2309a();
            try {
                if (messenger != null) {
                    this.f951a = messenger;
                    this.f961b = true;
                    this.f950a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f950a, 0);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b("peer linked with old sdk chid = " + this.g);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.b("peer linkToDeath err: " + e.getMessage());
                this.f951a = null;
                this.f961b = false;
            }
        }

        public void a(a aVar) {
            this.f958a.add(aVar);
        }

        public void a(c cVar, int i, int i2, String str, String str2) {
            boolean z;
            Iterator<a> it = this.f958a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(this.f955a, cVar, i2);
                }
            }
            c cVar2 = this.f955a;
            int i3 = 0;
            if (cVar2 != cVar) {
                com.xiaomi.channel.commonutils.logger.b.m1616a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar2, cVar, a(i), bj.a(i2), str, str2, this.g));
                this.f955a = cVar;
            }
            if (this.f956a == null) {
                com.xiaomi.channel.commonutils.logger.b.d("status changed while the client dispatcher is missing");
            } else if (cVar == c.binding) {
            } else {
                if (this.b != null && (z = this.f961b)) {
                    i3 = (this.f951a == null || !z) ? PowerMsgType.NewEndEditItemMsg : 1000;
                }
                this.f953a.b(this.f954a);
                if (b(i, i2, str2)) {
                    a(i, i2, str, str2);
                } else {
                    this.f953a.a(this.f954a.a(i, i2, str, str2), i3);
                }
            }
        }

        public void b(a aVar) {
            this.f958a.remove(aVar);
        }
    }

    /* loaded from: classes9.dex */
    public enum c {
        unbind,
        binding,
        binded
    }

    private bf() {
    }

    public static synchronized bf a() {
        bf bfVar;
        synchronized (bf.class) {
            if (f24662a == null) {
                f24662a = new bf();
            }
            bfVar = f24662a;
        }
        return bfVar;
    }

    private String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized int m2301a() {
        return this.f948a.size();
    }

    public synchronized b a(String str, String str2) {
        HashMap<String, b> hashMap = this.f948a.get(str);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(a(str2));
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized ArrayList<b> m2302a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        for (HashMap<String, b> hashMap : this.f948a.values()) {
            arrayList.addAll(hashMap.values());
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Collection<b> m2303a(String str) {
        if (!this.f948a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f948a.get(str).clone()).values();
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized List<String> m2304a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (HashMap<String, b> hashMap : this.f948a.values()) {
            for (b bVar : hashMap.values()) {
                if (str.equals(bVar.f957a)) {
                    arrayList.add(bVar.g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m2305a() {
        Iterator<b> it = m2302a().iterator();
        while (it.hasNext()) {
            it.next().m2309a();
        }
        this.f948a.clear();
    }

    public synchronized void a(Context context) {
        for (HashMap<String, b> hashMap : this.f948a.values()) {
            for (b bVar : hashMap.values()) {
                bVar.a(c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    public synchronized void a(Context context, int i) {
        for (HashMap<String, b> hashMap : this.f948a.values()) {
            for (b bVar : hashMap.values()) {
                bVar.a(c.unbind, 2, i, (String) null, (String) null);
            }
        }
    }

    public synchronized void a(a aVar) {
        this.f947a.add(aVar);
    }

    public synchronized void a(b bVar) {
        HashMap<String, b> hashMap = this.f948a.get(bVar.g);
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.f948a.put(bVar.g, hashMap);
        }
        hashMap.put(a(bVar.f960b), bVar);
        com.xiaomi.channel.commonutils.logger.b.m1616a("add active client. " + bVar.f957a);
        for (a aVar : this.f947a) {
            aVar.a();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m2306a(String str) {
        HashMap<String, b> hashMap = this.f948a.get(str);
        if (hashMap != null) {
            for (b bVar : hashMap.values()) {
                bVar.m2309a();
            }
            hashMap.clear();
            this.f948a.remove(str);
        }
        for (a aVar : this.f947a) {
            aVar.a();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m2307a(String str, String str2) {
        HashMap<String, b> hashMap = this.f948a.get(str);
        if (hashMap != null) {
            b bVar = hashMap.get(a(str2));
            if (bVar != null) {
                bVar.m2309a();
            }
            hashMap.remove(a(str2));
            if (hashMap.isEmpty()) {
                this.f948a.remove(str);
            }
        }
        for (a aVar : this.f947a) {
            aVar.a();
        }
    }

    public synchronized void b() {
        this.f947a.clear();
    }
}
