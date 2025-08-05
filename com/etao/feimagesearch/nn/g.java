package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.realtime.m;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import java.util.HashSet;
import java.util.Set;
import tb.cot;
import tb.kge;

/* loaded from: classes3.dex */
public class g extends com.etao.feimagesearch.nn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final ad c;
    private final String d;
    private final Set<String> e;
    private com.etao.feimagesearch.mnn.e<?, ?> f;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ ad a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ad) ipChange.ipc$dispatch("6d0aa132", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ void a(g gVar, String str, com.etao.feimagesearch.mnn.e eVar, e eVar2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1189d82f", new Object[]{gVar, str, eVar, eVar2, new Boolean(z)});
        } else {
            gVar.a(str, eVar, eVar2, z);
        }
    }

    public static /* synthetic */ Set b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d78e3c0", new Object[]{gVar}) : gVar.e;
    }

    public static /* synthetic */ String c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b20eacf0", new Object[]{gVar}) : gVar.d;
    }

    public static /* synthetic */ com.etao.feimagesearch.mnn.e d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.mnn.e) ipChange.ipc$dispatch("2d84b1a2", new Object[]{gVar}) : gVar.f;
    }

    static {
        kge.a(1005749646);
        com.etao.feimagesearch.mnn.h.a("plt_search", new com.etao.feimagesearch.mnn.f<com.etao.feimagesearch.mnn.realtime.j, m>() { // from class: com.etao.feimagesearch.nn.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.mnn.f
            public com.etao.feimagesearch.mnn.e<com.etao.feimagesearch.mnn.realtime.j, m> a(NetConfig netConfig) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (com.etao.feimagesearch.mnn.e) ipChange.ipc$dispatch("e1347497", new Object[]{this, netConfig}) : com.etao.feimagesearch.mnn.realtime.i.Companion.a();
            }
        });
        com.etao.feimagesearch.mnn.h.a("plt_code_detect", new com.etao.feimagesearch.mnn.f<com.etao.feimagesearch.mnn.decode.b, com.etao.feimagesearch.mnn.decode.c>() { // from class: com.etao.feimagesearch.nn.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.mnn.f
            public com.etao.feimagesearch.mnn.e<com.etao.feimagesearch.mnn.decode.b, com.etao.feimagesearch.mnn.decode.c> a(NetConfig netConfig) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (com.etao.feimagesearch.mnn.e) ipChange.ipc$dispatch("e1347497", new Object[]{this, netConfig}) : com.etao.feimagesearch.mnn.decode.a.Companion.a();
            }
        });
    }

    public g(String str, String str2) {
        super(str);
        this.e = new HashSet();
        this.f = null;
        this.c = new ad("MNNWorker_" + str + "_" + f6887a.incrementAndGet());
        this.d = str2;
    }

    public void a(NetConfig netConfig, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed27a2", new Object[]{this, netConfig, eVar});
            return;
        }
        cot.d("realtime_MnnNetWorker", "buildNetWork: ");
        this.e.add(netConfig.name);
        this.c.b("buildNetTak", new a(netConfig, eVar, this.d));
    }

    /* loaded from: classes3.dex */
    public class a extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final NetConfig b;
        private final e c;
        private com.etao.feimagesearch.mnn.e<?, ?> d;
        private String e;

        static {
            kge.a(1993360874);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -73738099) {
                super.a((Throwable) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ e a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b1ff4961", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ NetConfig b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (NetConfig) ipChange.ipc$dispatch("8571ebc6", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ com.etao.feimagesearch.mnn.e c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.etao.feimagesearch.mnn.e) ipChange.ipc$dispatch("27cfd81e", new Object[]{aVar}) : aVar.d;
        }

        public a(NetConfig netConfig, e eVar, String str) {
            this.b = netConfig;
            this.c = eVar;
            this.e = str;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.b("BuildNetTask", "BuildNetwork start [%s]", this.b.name);
            this.d = com.etao.feimagesearch.mnn.h.a(this.b);
            com.etao.feimagesearch.mnn.e<?, ?> eVar = this.d;
            if (eVar == null) {
                cot.b("realtime_MnnNetWorker", "Cannot create mnnNetWorker, there must something wrong, type = " + this.b.type);
                com.etao.feimagesearch.mnn.utils.a.a(this.b, 0L, "-10000", "algorithm not supported");
                g.a(g.this).a("MnnMainBuildFailed", new ac() { // from class: com.etao.feimagesearch.nn.g.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            a.a(a.this).d();
                        }
                    }
                });
                g.a(g.this).b("MnnMainBuildFailed", new ac() { // from class: com.etao.feimagesearch.nn.g.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            a.a(a.this).c();
                        }
                    }
                });
                return;
            }
            eVar.a(new com.etao.feimagesearch.mnn.k() { // from class: com.etao.feimagesearch.nn.g.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.mnn.k
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        g.a(g.this, a.b(a.this).name, a.c(a.this), a.a(a.this), true);
                    }
                }

                @Override // com.etao.feimagesearch.mnn.k
                public void a(int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    } else {
                        g.a(g.this, a.b(a.this).name, a.c(a.this), a.a(a.this), false);
                    }
                }
            }, this.e);
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                return;
            }
            super.a(th);
            g.a(g.this, this.b.name, null, this.c, false);
        }
    }

    private void a(final String str, com.etao.feimagesearch.mnn.e eVar, final e eVar2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b458a5", new Object[]{this, str, eVar, eVar2, new Boolean(z)});
        } else if (eVar2 == null) {
        } else {
            this.f = eVar;
            if (z) {
                this.c.b("realtime_MnnNetWorker_onBuildSuccess", new ac() { // from class: com.etao.feimagesearch.nn.g.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            eVar2.a();
                        }
                    }
                });
                this.c.a("realtime_MnnNetWorker_onMainBuildSuccess", new ac() { // from class: com.etao.feimagesearch.nn.g.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.etao.feimagesearch.util.ac
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        eVar2.b();
                        g.b(g.this).remove(str);
                    }
                });
                return;
            }
            this.c.b("realtime_MnnNetWorker_onBuildFailed", new ac() { // from class: com.etao.feimagesearch.nn.g.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        eVar2.c();
                    }
                }
            });
            this.c.a("realtime_MnnNetWorker_onMainBuildFailed", new ac() { // from class: com.etao.feimagesearch.nn.g.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    eVar2.d();
                    g.b(g.this).remove(str);
                }
            });
        }
    }

    public void a(String str, String str2, Object obj, final j<?, ?> jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ae8e9f", new Object[]{this, str, str2, obj, jVar});
            return;
        }
        final String format = String.format("%s -> runNetWork(%s)", str2, str);
        if (this.f == null) {
            this.c.b(format, new ac() { // from class: com.etao.feimagesearch.nn.g.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.b("realtime_MnnNetWorker", "mnnRunUnit is null " + format);
                    jVar.c();
                }
            });
            this.c.a(format, new ac() { // from class: com.etao.feimagesearch.nn.g.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        jVar.d();
                    }
                }
            });
            return;
        }
        this.c.b(String.format("%s -> runNetWork(%s)", str2, str), new b(this.f, obj, jVar, format));
    }

    /* loaded from: classes3.dex */
    public class b extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public com.etao.feimagesearch.mnn.e f6912a;
        public Object b;
        public j c;
        public String d;

        static {
            kge.a(1219543902);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -73738099) {
                super.a((Throwable) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(com.etao.feimagesearch.mnn.e<?, ?> eVar, Object obj, j jVar, String str) {
            this.f6912a = eVar;
            this.b = obj;
            this.c = jVar;
            this.d = str;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.b("realtime_MnnNetWorker", "NetRunTask start [%s]", this.d);
            if (this.c.f() != null) {
                return;
            }
            this.f6912a.a(this.c.b(), this.b, new com.etao.feimagesearch.mnn.d() { // from class: com.etao.feimagesearch.nn.g.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.mnn.d
                public void a(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                        return;
                    }
                    cot.b("realtime_MnnNetWorker", "onError: ");
                    b.this.a(th);
                }

                @Override // com.etao.feimagesearch.mnn.d
                public void a(final Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                        return;
                    }
                    cot.b("realtime_MnnNetWorker", "NetRunTask finish -- %s", b.this.d);
                    ad a2 = g.a(g.this);
                    a2.b(b.this.c() + " -> NetRunTask", new ac() { // from class: com.etao.feimagesearch.nn.g.b.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.etao.feimagesearch.util.ac
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                b.this.c.a(obj);
                            }
                        }
                    });
                    ad a3 = g.a(g.this);
                    a3.a(b.this.c() + " -> NetRunTask", new ac() { // from class: com.etao.feimagesearch.nn.g.b.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.etao.feimagesearch.util.ac
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            cot.b("realtime_MnnNetWorker", "NetRunTask finish main [%s]", b.this.d);
                            b.this.c.b(obj);
                        }
                    });
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
            ad a2 = g.a(g.this);
            a2.b(c() + " -> NetRunTask", new ac() { // from class: com.etao.feimagesearch.nn.g.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        b.this.c.c();
                    }
                }
            });
            cot.b("realtime_MnnNetWorker", "onError: " + th.getMessage());
            th.printStackTrace();
            ad a3 = g.a(g.this);
            a3.a(c() + " -> NetRunTask", new ac() { // from class: com.etao.feimagesearch.nn.g.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.b("realtime_MnnNetWorker", "NetRunTask error main [%s]", b.this.d);
                    b.this.c.d();
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f == null) {
        } else {
            this.c.a(new ac() { // from class: com.etao.feimagesearch.nn.g.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    cot.c("realtime_MnnNetWorker", "Destroy net: " + g.c(g.this));
                    try {
                        g.d(g.this).a(g.c(g.this));
                    } catch (Exception e) {
                        cot.a("realtime_MnnNetWorker", "destroy", e);
                    }
                }
            }, true);
        }
    }
}
