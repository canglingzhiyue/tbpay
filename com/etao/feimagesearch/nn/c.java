package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.i;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.cot;
import tb.cqy;
import tb.cra;
import tb.kge;

/* loaded from: classes3.dex */
public class c extends com.etao.feimagesearch.nn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Set<String> c;
    private final Map<String, k<?, ?>> d;
    private final ad e;

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c163efab", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ Set b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("fb315b44", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ ad c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("6d269230", new Object[]{cVar}) : cVar.e;
    }

    static {
        kge.a(-900566083);
        i.a("Video", new i.b() { // from class: com.etao.feimagesearch.nn.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.nn.i.a
            public k a(NetConfig netConfig) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("ee8ac240", new Object[]{this, netConfig}) : new cra(netConfig);
            }
        });
        i.a("Object", new i.b() { // from class: com.etao.feimagesearch.nn.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.nn.i.a
            public k a(NetConfig netConfig) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("ee8ac240", new Object[]{this, netConfig}) : new cqy(netConfig);
            }
        });
        i.a("plt_autodetect", new i.b() { // from class: com.etao.feimagesearch.nn.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.nn.i.a
            public k a(NetConfig netConfig) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("ee8ac240", new Object[]{this, netConfig}) : new cqy(netConfig);
            }
        });
        com.etao.feimagesearch.mnn.utils.a.c();
        com.etao.feimagesearch.mnn.utils.a.e();
    }

    public c(String str) {
        super(str);
        this.c = new HashSet();
        this.d = new ConcurrentHashMap();
        this.e = new ad("AliNNWorker" + str + "_" + f6887a.get());
    }

    public void a(NetConfig netConfig, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed27a2", new Object[]{this, netConfig, eVar});
            return;
        }
        cot.d("PltAlgo_AliNNNetWorker", "buildNetWork: ");
        k a2 = i.a(netConfig);
        if (a2 != null) {
            this.c.add(netConfig.name);
            this.e.b("buildNetWork", new a(netConfig, a2, eVar));
            return;
        }
        cot.b("PltAlgo_AliNNNetWorker", "No Unit for %s", netConfig.type);
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    public void a(String str, String str2, Object obj, j<?, ?> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ae8e9f", new Object[]{this, str, str2, obj, jVar});
            return;
        }
        cot.d("PltAlgo_AliNNNetWorker", "runNetWork: ");
        k<?, ?> kVar = this.d.get(str);
        if (kVar == null) {
            jVar.d();
            return;
        }
        this.e.b(String.format("%s -> runNetWork(%s)", str2, str), new b(kVar, obj, jVar, str));
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cot.d("PltAlgo_AliNNNetWorker", "destroy: ");
        this.e.a(new ac() { // from class: com.etao.feimagesearch.nn.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                HashMap hashMap = new HashMap(c.a(c.this));
                c.a(c.this).clear();
                for (Map.Entry entry : hashMap.entrySet()) {
                    cot.b("PltAlgo_AliNNNetWorker", "Destroy net: %s", entry.getKey());
                    try {
                        ((k) entry.getValue()).c();
                    } catch (Exception e) {
                        cot.a("PltAlgo_AliNNNetWorker", "destroy", e);
                    }
                }
            }
        }, false);
    }

    /* loaded from: classes3.dex */
    public class a extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final k b;
        private final e c;
        private final NetConfig d;

        static {
            kge.a(603659291);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -73738099) {
                super.a((Throwable) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ k a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("bd80399f", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ NetConfig b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NetConfig) ipChange.ipc$dispatch("67dd174a", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ e c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("ba4240a3", new Object[]{aVar}) : aVar.c;
        }

        public a(NetConfig netConfig, k kVar, e eVar) {
            this.d = netConfig;
            this.b = kVar;
            this.c = eVar;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.b("PltAlgo_AliNNNetWorker", "BuildNetwork start [%s]", this.d.name);
            if (this.b.b()) {
                e eVar = this.c;
                if (eVar != null) {
                    eVar.a();
                }
                c.a(c.this).put(this.d.name, this.b);
                ad c = c.c(c.this);
                c.a(c() + " -> BuildNetTask", new ac() { // from class: com.etao.feimagesearch.nn.c.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        cot.b("PltAlgo_AliNNNetWorker", "BuildNetwork finishMain -- %s [%s]", a.a(a.this).a(), a.b(a.this).name);
                        c.b(c.this).remove(a.b(a.this).name);
                        if (a.c(a.this) == null) {
                            return;
                        }
                        a.c(a.this).b();
                    }
                });
                return;
            }
            e eVar2 = this.c;
            if (eVar2 != null) {
                eVar2.c();
            }
            ad c2 = c.c(c.this);
            c2.a(c() + " -> BuildNetTask", new ac() { // from class: com.etao.feimagesearch.nn.c.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.b("PltAlgo_AliNNNetWorker", "BuildNetwork errorMain [%s]", a.b(a.this).name);
                    c.b(c.this).remove(a.b(a.this).name);
                    if (a.c(a.this) == null) {
                        return;
                    }
                    a.c(a.this).d();
                }
            });
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            super.a(th);
            e eVar = this.c;
            if (eVar != null) {
                eVar.c();
            }
            ad c = c.c(c.this);
            c.a(c() + " -> BuildNetTask", new ac() { // from class: com.etao.feimagesearch.nn.c.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.b("PltAlgo_AliNNNetWorker", "BuildNetwork errorMain [%s]", a.b(a.this).name);
                    c.b(c.this).remove(a.b(a.this).name);
                    if (a.c(a.this) == null) {
                        return;
                    }
                    a.c(a.this).d();
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public class b extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final k b;
        private final j c;
        private final String d;
        private final Object e;

        static {
            kge.a(420232634);
        }

        public static /* synthetic */ j a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("45b0795f", new Object[]{bVar}) : bVar.c;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d05aa29", new Object[]{bVar}) : bVar.d;
        }

        public b(k kVar, Object obj, j jVar, String str) {
            this.b = kVar;
            this.c = jVar;
            this.d = str;
            this.e = obj;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            final Object f = this.c.f();
            if (f == null) {
                f = this.b.a(this.c.b(), this.e);
                this.c.a(f);
            }
            ad c = c.c(c.this);
            c.a(c() + " -> NetRunTask", new ac() { // from class: com.etao.feimagesearch.nn.c.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        b.a(b.this).b(f);
                    }
                }
            });
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            this.c.c();
            cot.b("PltAlgo_AliNNNetWorker", "NetRunTask error [%s]", this.d);
            ad c = c.c(c.this);
            c.a(c() + " -> NetRunTask", new ac() { // from class: com.etao.feimagesearch.nn.c.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.b("PltAlgo_AliNNNetWorker", "NetRunTask error main [%s]", b.b(b.this));
                    b.a(b.this).d();
                }
            });
        }
    }
}
