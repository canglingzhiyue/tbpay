package com.meizu.cloud.pushsdk.f.c;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import anet.channel.Constants;
import com.alibaba.analytics.core.sync.q;
import com.meizu.cloud.pushsdk.e.d.i;
import com.meizu.cloud.pushsdk.e.d.j;
import com.taobao.search.common.util.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7951a;
    private final com.meizu.cloud.pushsdk.e.d.g b;
    protected final Context c;
    private Uri.Builder d;
    protected final f e;
    private d f;
    private b g;
    private final SSLSocketFactory h;
    private final HostnameVerifier i;
    private String j;
    protected final int k;
    protected final int l;
    protected final int m;
    private final long n;
    private final long o;
    protected final TimeUnit p;
    private final com.meizu.cloud.pushsdk.e.d.a q;
    protected final AtomicBoolean r;

    /* renamed from: com.meizu.cloud.pushsdk.f.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0281a {

        /* renamed from: a  reason: collision with root package name */
        protected final String f7952a;
        protected final Context b;
        protected SSLSocketFactory l;
        protected HostnameVerifier m;
        protected f c = null;
        protected d d = d.POST;
        protected b e = b.Single;
        protected int f = 5;
        protected int g = 250;
        protected int h = 5;
        protected long i = Constants.RECV_TIMEOUT;
        protected long j = Constants.RECV_TIMEOUT;
        protected TimeUnit k = TimeUnit.SECONDS;
        protected com.meizu.cloud.pushsdk.e.d.a n = new com.meizu.cloud.pushsdk.e.d.e();

        public C0281a(String str, Context context, Class<? extends a> cls) {
            this.f7952a = str;
            this.b = context;
        }

        public C0281a a(int i) {
            this.h = i;
            return this;
        }

        public C0281a a(com.meizu.cloud.pushsdk.e.d.a aVar) {
            if (aVar != null) {
                this.n = aVar;
                String simpleName = C0281a.class.getSimpleName();
                com.meizu.cloud.pushsdk.f.g.c.c(simpleName, "set new call " + aVar, new Object[0]);
            }
            return this;
        }

        public C0281a a(b bVar) {
            this.e = bVar;
            return this;
        }

        public C0281a a(f fVar) {
            this.c = fVar;
            return this;
        }

        public C0281a b(int i) {
            this.g = i;
            return this;
        }

        public C0281a c(int i) {
            this.f = i;
            return this;
        }
    }

    public a(C0281a c0281a) {
        String simpleName = a.class.getSimpleName();
        this.f7951a = simpleName;
        this.b = com.meizu.cloud.pushsdk.e.d.g.a("application/json; charset=utf-8");
        this.r = new AtomicBoolean(false);
        this.f = c0281a.d;
        this.e = c0281a.c;
        this.c = c0281a.b;
        this.g = c0281a.e;
        this.h = c0281a.l;
        this.i = c0281a.m;
        this.k = c0281a.f;
        this.l = c0281a.h;
        this.m = c0281a.g;
        this.n = c0281a.i;
        this.o = c0281a.j;
        this.j = c0281a.f7952a;
        this.p = c0281a.k;
        this.q = c0281a.n;
        a();
        com.meizu.cloud.pushsdk.f.g.c.c(simpleName, "Emitter created successfully!", new Object[0]);
    }

    private i a(com.meizu.cloud.pushsdk.f.b.a aVar) {
        a(aVar, "");
        this.d.clearQuery();
        HashMap hashMap = (HashMap) aVar.a();
        for (String str : hashMap.keySet()) {
            this.d.appendQueryParameter(str, (String) hashMap.get(str));
        }
        return new i.b().a(this.d.build().toString()).b().a();
    }

    private i a(ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.meizu.cloud.pushsdk.f.b.a> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().a());
        }
        com.meizu.cloud.pushsdk.f.b.b bVar = new com.meizu.cloud.pushsdk.f.b.b("push_group_data", arrayList2);
        String str = this.f7951a;
        com.meizu.cloud.pushsdk.f.g.c.a(str, "final SelfDescribingJson " + bVar, new Object[0]);
        String uri = this.d.build().toString();
        return new i.b().a(uri).c(j.a(this.b, bVar.toString())).a();
    }

    private void a() {
        Uri.Builder buildUpon = Uri.parse(k.HTTPS_PREFIX + this.j).buildUpon();
        this.d = buildUpon;
        if (this.f == d.GET) {
            buildUpon.appendPath(q.MSGTYPE_INTERVAL);
        } else {
            buildUpon.appendEncodedPath("push_data_report/mobile");
        }
    }

    private void a(com.meizu.cloud.pushsdk.e.d.k kVar) {
        if (kVar != null) {
            try {
                if (kVar.a() == null) {
                    return;
                }
                kVar.a().close();
            } catch (Exception unused) {
                com.meizu.cloud.pushsdk.f.g.c.a(this.f7951a, "Unable to close source data", new Object[0]);
            }
        }
    }

    private void a(com.meizu.cloud.pushsdk.f.b.a aVar, String str) {
        if ("".equals(str)) {
            str = com.meizu.cloud.pushsdk.f.g.e.b();
        }
        aVar.a("stm", str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(i iVar) {
        com.meizu.cloud.pushsdk.e.d.k kVar = null;
        try {
            try {
                com.meizu.cloud.pushsdk.f.g.c.a(this.f7951a, "Sending request: %s", iVar);
                kVar = this.q.a(iVar);
                return kVar.b();
            } catch (IOException e) {
                com.meizu.cloud.pushsdk.f.g.c.b(this.f7951a, "Request sending failed: %s", Log.getStackTraceString(e));
                a(kVar);
                return -1;
            }
        } finally {
            a(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public LinkedList<e> a(c cVar) {
        int size = cVar.b().size();
        LinkedList<Long> a2 = cVar.a();
        LinkedList<e> linkedList = new LinkedList<>();
        long j = 22;
        if (this.f == d.GET) {
            for (int i = 0; i < size; i++) {
                LinkedList linkedList2 = new LinkedList();
                linkedList2.add(a2.get(i));
                com.meizu.cloud.pushsdk.f.b.a aVar = cVar.b().get(i);
                linkedList.add(new e(aVar.b() + 22 > this.n, a(aVar), linkedList2));
            }
        } else {
            int i2 = 0;
            while (i2 < size) {
                LinkedList linkedList3 = new LinkedList();
                long j2 = 0;
                ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList = new ArrayList<>();
                LinkedList linkedList4 = linkedList3;
                int i3 = i2;
                while (i3 < this.g.a() + i2 && i3 < size) {
                    com.meizu.cloud.pushsdk.f.b.a aVar2 = cVar.b().get(i3);
                    long b = aVar2.b() + j;
                    if (b + 88 > this.o) {
                        ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList2 = new ArrayList<>();
                        LinkedList linkedList5 = new LinkedList();
                        arrayList2.add(aVar2);
                        linkedList5.add(a2.get(i3));
                        linkedList.add(new e(true, a(arrayList2), linkedList5));
                    } else {
                        j2 += b;
                        if (j2 + 88 + (arrayList.size() - 1) > this.o) {
                            linkedList.add(new e(false, a(arrayList), linkedList4));
                            ArrayList<com.meizu.cloud.pushsdk.f.b.a> arrayList3 = new ArrayList<>();
                            LinkedList linkedList6 = new LinkedList();
                            arrayList3.add(aVar2);
                            linkedList6.add(a2.get(i3));
                            arrayList = arrayList3;
                            linkedList4 = linkedList6;
                            j2 = b;
                        } else {
                            arrayList.add(aVar2);
                            linkedList4.add(a2.get(i3));
                        }
                    }
                    i3++;
                    j = 22;
                }
                if (!arrayList.isEmpty()) {
                    linkedList.add(new e(false, a(arrayList), linkedList4));
                }
                i2 += this.g.a();
                j = 22;
            }
        }
        return linkedList;
    }

    public abstract void a(com.meizu.cloud.pushsdk.f.b.a aVar, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(int i) {
        return i >= 200 && i < 300;
    }

    public abstract void b();

    public String c() {
        return this.d.clearQuery().build().toString();
    }
}
