package com.taobao.android.searchbaseframe.net;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import anetwork.channel.Param;
import anetwork.channel.entity.StringParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1355935466);
    }

    /* renamed from: com.taobao.android.searchbaseframe.net.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC0575b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-945266421);
        }

        public abstract void a(e eVar);

        public void b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8064233", new Object[]{this, eVar});
                return;
            }
            NetError c = eVar.c();
            if (c == null) {
                return;
            }
            k.a("HttpUtil", "net result:" + c.getCode() + " " + c.getMsg());
        }
    }

    public static a a(imn imnVar, com.taobao.android.searchbaseframe.net.a aVar, AbstractC0575b abstractC0575b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bceb91fb", new Object[]{imnVar, aVar, abstractC0575b});
        }
        a aVar2 = new a(imnVar, aVar, abstractC0575b, true);
        aVar2.a();
        return aVar2;
    }

    public static List<Param> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                arrayList.add(new StringParam(key, value));
            }
        }
        return arrayList;
    }

    /* loaded from: classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.android.searchbaseframe.net.a f14990a;
        private final AbstractC0575b b;
        private final imn c;
        private volatile boolean d = false;
        private boolean e;

        static {
            kge.a(-2109372184);
            kge.a(-1390502639);
        }

        public static /* synthetic */ AbstractC0575b a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AbstractC0575b) ipChange.ipc$dispatch("5999fb4d", new Object[]{aVar}) : aVar.b;
        }

        public a(imn imnVar, com.taobao.android.searchbaseframe.net.a aVar, AbstractC0575b abstractC0575b, boolean z) {
            this.c = imnVar;
            this.f14990a = aVar;
            this.b = abstractC0575b;
            this.e = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c();
            }
        }

        private e b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("f8efe997", new Object[]{this});
            }
            c<com.taobao.android.searchbaseframe.net.a, e> d = this.c.d().d();
            if (d == null) {
                e eVar = new e();
                eVar.a(new NetError(0, "no httpAdapter"));
                return eVar;
            }
            return d.a((c<com.taobao.android.searchbaseframe.net.a, e>) this.f14990a);
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.d) {
            } else {
                final e b = b();
                if (this.d) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: com.taobao.android.searchbaseframe.net.b.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.b()) {
                            a.a(a.this).b(b);
                        } else {
                            try {
                                a.a(a.this).a(b);
                            } catch (Exception e) {
                                e.printStackTrace();
                                e eVar = new e();
                                NetError netError = new NetError(4);
                                netError.setException(e);
                                eVar.a(netError);
                                a.a(a.this).b(eVar);
                            }
                        }
                    }
                };
                if (this.e) {
                    new Handler(Looper.getMainLooper()).post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("42cf967e", new Object[]{this});
            }
            b.a(this.c.c().k().f, this);
            this.c.b().f("HttpUtil", (String) this.f14990a.b);
            return this;
        }
    }

    public static void a(Executor executor, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30a02c", new Object[]{executor, runnable});
        } else {
            executor.execute(runnable);
        }
    }
}
