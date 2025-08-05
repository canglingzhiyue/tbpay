package com.uploader.implement;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.strategy.HttpDnsAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.IUploaderEnvironment;
import com.uploader.export.f;
import com.uploader.export.m;
import java.util.ArrayList;
import java.util.List;
import tb.ror;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final a f24068a;
    public final m b;
    public final Context c;
    public IUploaderEnvironment d;

    public d(Context context, f fVar) {
        m mVar;
        this.c = context;
        IUploaderEnvironment c = fVar.c();
        if (c instanceof m) {
            mVar = (m) c;
        } else {
            this.d = fVar.c();
            mVar = new m(0) { // from class: com.uploader.implement.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 1073469215) {
                        return super.a();
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.uploader.export.m
                public synchronized com.uploader.export.b a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (com.uploader.export.b) ipChange.ipc$dispatch("3ffbd71f", new Object[]{this});
                    }
                    com.uploader.export.b a2 = super.a();
                    if (a2.f24057a == d.this.d.getEnvironment() && a2.b.equals(d.this.d.getAppKey())) {
                        return a2;
                    }
                    return new com.uploader.export.b(d.this.d.getEnvironment(), d.this.d.getAppKey(), TextUtils.isEmpty(d.this.d.getDomain()) ? a2.c : d.this.d.getDomain(), a2.d);
                }

                @Override // com.uploader.export.m, com.uploader.export.IUploaderEnvironment
                public int getEnvironment() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("487b46d7", new Object[]{this})).intValue() : d.this.d.getEnvironment();
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public String getUtdid() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : d.this.d.getUtdid();
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public String getAppVersion() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this}) : d.this.d.getAppVersion();
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public String getUserId() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this}) : d.this.d.getUserId();
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public String signature(String str) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59879677", new Object[]{this, str}) : d.this.d.signature(str);
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public int putSslTicket(Context context2, String str, byte[] bArr) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("699c5fdc", new Object[]{this, context2, str, bArr})).intValue() : d.this.d.putSslTicket(context2, str, bArr);
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public byte[] getSslTicket(Context context2, String str) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a0e03714", new Object[]{this, context2, str}) : d.this.d.getSslTicket(context2, str);
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public byte[] decrypt(Context context2, String str, byte[] bArr) {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6cd37cb8", new Object[]{this, context2, str, bArr}) : d.this.d.decrypt(context2, str, bArr);
                }

                @Override // com.uploader.export.IUploaderEnvironment
                public boolean enableFlowControl() {
                    IpChange ipChange = $ipChange;
                    return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a8f2d57", new Object[]{this})).booleanValue() : d.this.d.enableFlowControl();
                }
            };
        }
        this.b = mVar;
        this.f24068a = new a(this.b, context);
        this.f24068a.i();
        c.a(fVar.b());
        com.uploader.implement.a.a(fVar.a());
        b.a(context);
    }

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final m d;
        public Context f;
        public boolean g = true;

        /* renamed from: a  reason: collision with root package name */
        public C1047a f24070a = new C1047a();
        public C1047a b = new C1047a();
        public C1047a c = new C1047a();
        public boolean e = true;

        /* renamed from: com.uploader.implement.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public static class C1047a {

            /* renamed from: a  reason: collision with root package name */
            public String f24071a;
            public String b;
            public Pair<String, Long> h;
            public List<Pair<String, Integer>> c = new ArrayList();
            public int d = 0;
            public List<b> e = new ArrayList();
            public List<b> f = new ArrayList();
            public int g = 0;
            public long i = 0;
            public long j = 604800;
        }

        /* loaded from: classes9.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f24072a;
            public int b;
            public String c;
            public boolean d;
        }

        public a(m mVar, Context context) {
            this.d = mVar;
            this.f = context;
        }

        public Pair<String, Long> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("dd4f14b2", new Object[]{this});
            }
            com.uploader.export.b a2 = this.d.a();
            Pair<C1047a, Integer> a3 = a(a2);
            C1047a c1047a = (C1047a) a3.first;
            String str = a2.c;
            String str2 = a2.d;
            if (!str.equals(c1047a.f24071a) || !str2.equals(c1047a.b)) {
                c1047a.c.clear();
                c1047a.e.clear();
                c1047a.f.clear();
                c1047a.g = 0;
                c1047a.d = 0;
                c1047a.f24071a = "";
                c1047a.b = "";
                c1047a.i = 0L;
                c1047a.h = null;
                return null;
            }
            return ((C1047a) a3.first).h;
        }

        public Pair<String, Integer> b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("2780adf3", new Object[]{this});
            }
            com.uploader.export.b a2 = this.d.a();
            Pair<C1047a, Integer> a3 = a(a2);
            if (((C1047a) a3.first).c.size() == 0) {
                ((C1047a) a3.first).c.add(new Pair<>(a2.c, a3.second));
                List<String> b2 = b(a2);
                for (int i = 0; i < b2.size(); i++) {
                    ((C1047a) a3.first).c.add(new Pair<>(b2.get(i), a3.second));
                }
            }
            if (((C1047a) a3.first).d >= ((C1047a) a3.first).c.size()) {
                ((C1047a) a3.first).d = 0;
            }
            return ((C1047a) a3.first).c.get(((C1047a) a3.first).d);
        }

        private List<String> b(com.uploader.export.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f027fa09", new Object[]{this, bVar});
            }
            ArrayList arrayList = new ArrayList();
            try {
                ArrayList<HttpDnsAdapter.HttpDnsOrigin> originsByHttpDnsNoWait = HttpDnsAdapter.getOriginsByHttpDnsNoWait(bVar.c, false);
                if (originsByHttpDnsNoWait != null && !originsByHttpDnsNoWait.isEmpty()) {
                    for (int i = 0; i < originsByHttpDnsNoWait.size(); i++) {
                        HttpDnsAdapter.HttpDnsOrigin httpDnsOrigin = originsByHttpDnsNoWait.get(i);
                        if (httpDnsOrigin != null) {
                            String originIP = httpDnsOrigin.getOriginIP();
                            if (!TextUtils.isEmpty(originIP)) {
                                arrayList.add(originIP);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                }
            } catch (Throwable unused) {
            }
            List<String> a2 = com.uploader.implement.b.a(bVar.c);
            if (a2 != null && !a2.isEmpty()) {
                return a2;
            }
            arrayList.add(bVar.d);
            return arrayList;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            ((C1047a) a(this.d.a()).first).d++;
        }

        public void a(String str, long j, long j2, List<Pair<String, Integer>> list, List<b> list2) {
            long j3 = j;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c324b014", new Object[]{this, str, new Long(j3), new Long(j2), list, list2});
                return;
            }
            com.uploader.export.b a2 = this.d.a();
            Pair<C1047a, Integer> a3 = a(a2);
            if (j3 <= 0) {
                j3 = 300;
            }
            ((C1047a) a3.first).h = new Pair<>(str, Long.valueOf(System.currentTimeMillis() + (j3 * 1000)));
            long j4 = j2 <= 0 ? 604800L : j2;
            ((C1047a) a3.first).j = j4;
            PreferenceManager.getDefaultSharedPreferences(this.f).edit().putLong("aus_upload_file_ttl", j4).apply();
            ((C1047a) a3.first).f24071a = a2.c;
            ((C1047a) a3.first).b = a2.d;
            if (list2 != null && list2.size() > 0) {
                ((C1047a) a3.first).e.clear();
                ((C1047a) a3.first).f.clear();
                for (b bVar : list2) {
                    if ("xquic".equalsIgnoreCase(bVar.c)) {
                        ((C1047a) a3.first).f.add(bVar);
                        if (this.g && com.uploader.implement.b.c() && ror.c()) {
                        }
                    }
                    ((C1047a) a3.first).e.add(bVar);
                }
                ((C1047a) a3.first).g = 0;
            }
            if (list != null && list.size() > 0) {
                ((C1047a) a3.first).c.clear();
                Pair<String, Integer> pair = new Pair<>(a2.c, a3.second);
                Pair<String, Integer> pair2 = new Pair<>(a2.d, a3.second);
                for (Pair<String, Integer> pair3 : list) {
                    if (!pair.equals(pair3) && !pair2.equals(pair3)) {
                        ((C1047a) a3.first).c.add(pair3);
                    }
                }
                ((C1047a) a3.first).c.add(pair);
                ((C1047a) a3.first).c.add(pair2);
                ((C1047a) a3.first).d = 0;
            }
            a(true);
        }

        public b d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aeea151a", new Object[]{this});
            }
            Pair<C1047a, Integer> a2 = a(this.d.a());
            if (((C1047a) a2.first).e.size() == 0) {
                return null;
            }
            if (((C1047a) a2.first).g >= ((C1047a) a2.first).e.size()) {
                ((C1047a) a2.first).g = 0;
            }
            return ((C1047a) a2.first).e.get(((C1047a) a2.first).g);
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            ((C1047a) a(this.d.a()).first).g++;
        }

        public List<b> f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : ((C1047a) a(this.d.a()).first).f;
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            com.uploader.export.b a2 = this.d.a();
            Pair<C1047a, Integer> a3 = a(a2);
            ((C1047a) a3.first).i = j - (System.currentTimeMillis() / 1000);
            if (!com.uploader.implement.a.a(4)) {
                return;
            }
            com.uploader.implement.a.a(4, "UploaderConfig", "[updateTimestampOffset] update timestamp succeed.,environment:" + a2.f24057a + ", offset=" + ((C1047a) a3.first).i + " seconds");
        }

        public long g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f962", new Object[]{this})).longValue() : ((C1047a) a(this.d.a()).first).i;
        }

        public long h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[]{this})).longValue() : ((C1047a) a(this.d.a()).first).j;
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            } else {
                ((C1047a) a(this.d.a()).first).j = PreferenceManager.getDefaultSharedPreferences(this.f).getLong("aus_upload_file_ttl", 604800L);
            }
        }

        public String j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.d.a().c;
        }

        public Pair<C1047a, Integer> a(com.uploader.export.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("5a270da9", new Object[]{this, bVar});
            }
            int i = bVar.f24057a;
            if (i == 1) {
                return new Pair<>(this.b, 80);
            }
            if (i == 2) {
                return new Pair<>(this.c, 80);
            }
            return new Pair<>(this.f24070a, 443);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.e;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.g = z;
            }
        }
    }
}
