package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.c;
import com.taobao.android.remoteso.resolver2.d;
import com.taobao.android.remoteso.resolver2.j;
import com.taobao.android.remoteso.resolver2.k;
import com.taobao.android.remoteso.resolver2.l;
import com.taobao.android.remoteso.status.RSoStatus;
import com.taobao.android.remoteso.status.c;
import java.util.Map;
import tb.iks;

/* loaded from: classes6.dex */
public class ijr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ijd f29089a;
    private final Map<String, c> b;
    private final com.taobao.android.remoteso.status.c c;
    private final d d;
    private final iju e;

    public static /* synthetic */ k a(ijr ijrVar, j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("933f14d0", new Object[]{ijrVar, jVar}) : ijrVar.b(jVar);
    }

    public static /* synthetic */ Map a(ijr ijrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2553fbc", new Object[]{ijrVar}) : ijrVar.b;
    }

    public static /* synthetic */ void a(ijr ijrVar, j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186e5a91", new Object[]{ijrVar, jVar, aVar});
        } else {
            ijrVar.b(jVar, aVar);
        }
    }

    public static /* synthetic */ void a(ijr ijrVar, c.InterfaceC0566c interfaceC0566c, com.taobao.android.remoteso.resolver2.c cVar, j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927d094e", new Object[]{ijrVar, interfaceC0566c, cVar, jVar, aVar});
        } else {
            ijrVar.a(interfaceC0566c, cVar, jVar, aVar);
        }
    }

    public static /* synthetic */ com.taobao.android.remoteso.status.c b(ijr ijrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.remoteso.status.c) ipChange.ipc$dispatch("b322895d", new Object[]{ijrVar}) : ijrVar.c;
    }

    public ijr(iju ijuVar, ijd ijdVar, Map<String, com.taobao.android.remoteso.resolver2.c> map, com.taobao.android.remoteso.status.c cVar, d dVar) {
        this.e = ijuVar;
        this.f29089a = ijdVar;
        this.b = map;
        this.c = cVar;
        this.d = dVar;
    }

    public k a(final j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("4c517c4f", new Object[]{this, jVar}) : (k) this.c.a(jVar, new c.a<k>() { // from class: tb.ijr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.remoteso.resolver2.k, java.lang.Object] */
            @Override // com.taobao.android.remoteso.status.c.a
            public /* synthetic */ k b(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("2d8b2ec7", new Object[]{this, rSoStatus, interfaceC0566c}) : a(rSoStatus, interfaceC0566c);
            }

            public k a(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (k) ipChange2.ipc$dispatch("1120670d", new Object[]{this, rSoStatus, interfaceC0566c});
                }
                RSoLog.c("PeekResolver ->  peekOneResult, enter " + jVar.a());
                if (rSoStatus == RSoStatus.INITIALIZED || rSoStatus == RSoStatus.FETCHED) {
                    k a2 = ijr.a(ijr.this, jVar);
                    if (a2.i()) {
                        a2.a(jVar.j() ? "cache" : ijp.FROM_EXIST);
                    }
                    RSoLog.c("PeekResolver ->  peekOneResult, peekOneLib get result=" + a2);
                    return a2;
                }
                return l.a(jVar, RSoException.error(6308), "manager-peek-error");
            }
        });
    }

    public void a(final j jVar, c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d284eb2", new Object[]{this, jVar, aVar});
            return;
        }
        final a aVar2 = new a(aVar, this.f29089a.a("key_deffer_resolve_callback_enabled", true));
        this.c.a(jVar, new c.a<Void>() { // from class: tb.ijr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
            @Override // com.taobao.android.remoteso.status.c.a
            public /* synthetic */ Void b(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("2d8b2ec7", new Object[]{this, rSoStatus, interfaceC0566c}) : a(rSoStatus, interfaceC0566c);
            }

            public Void a(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Void) ipChange2.ipc$dispatch("11d50cb3", new Object[]{this, rSoStatus, interfaceC0566c});
                }
                if (rSoStatus == RSoStatus.INITIALIZED || rSoStatus == RSoStatus.FETCHED) {
                    RSoLog.c("PeekResolver ->  resolveOneResult, try peek lib " + jVar.a());
                    k a2 = ijr.a(ijr.this, jVar);
                    if (a2.i()) {
                        if (rSoStatus != RSoStatus.FETCHED) {
                            interfaceC0566c.a(RSoStatus.FETCHED);
                        }
                        aVar2.a(a2.a(ijp.FROM_EXIST));
                        return null;
                    } else if (rSoStatus == RSoStatus.FETCHED) {
                        ikq.a("ResolverManager, resolveOneResult, RSoStatus.FETCHED but peekOneLib failed", jVar.toString());
                    }
                }
                if (rSoStatus == RSoStatus.INITIALIZED || rSoStatus == RSoStatus.FETCHED || rSoStatus == RSoStatus.FETCH_FAILED) {
                    RSoLog.c("PeekResolver ->  resolveOneResult, need resolve, " + jVar.a());
                    com.taobao.android.remoteso.resolver2.c cVar = (com.taobao.android.remoteso.resolver2.c) ijr.a(ijr.this).get(jVar.b());
                    if (cVar == null) {
                        interfaceC0566c.a(RSoStatus.FETCH_FAILED);
                        throw RSoException.error(2006, "from = " + jVar.b());
                    }
                    ijr.a(ijr.this, interfaceC0566c, cVar, jVar, aVar2);
                    return null;
                } else if (rSoStatus == RSoStatus.FETCHING) {
                    RSoLog.c("PeekResolver ->  resolveOneResult, pending, wait for previous resolve finish. lib = " + jVar.a());
                    ijr.a(ijr.this, jVar, aVar2);
                    return null;
                } else {
                    RSoLog.c("PeekResolver ->  resolveOneResult, already fetched, return result " + jVar.a());
                    throw new RuntimeException("currentStatus not make sense, wtf " + rSoStatus);
                }
            }
        });
    }

    /* loaded from: classes6.dex */
    public static class a implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final c.a f29096a;
        private final boolean b;

        public static /* synthetic */ c.a a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("247beb98", new Object[]{aVar}) : aVar.f29096a;
        }

        public a(c.a aVar, boolean z) {
            this.f29096a = aVar;
            this.b = z;
        }

        @Override // com.taobao.android.remoteso.resolver2.c.a
        public void a(final k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
            } else if (!this.b) {
                RSoLog.c("PeekResolver -> defferCallback disable, call onResolveFinish on current thread");
                this.f29096a.a(kVar);
            } else {
                ika.a(new Runnable() { // from class: tb.ijr.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        RSoLog.c("PeekResolver -> defferCallback, result = " + kVar);
                        a.a(a.this).a(kVar);
                    }
                });
            }
        }
    }

    private void b(final j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63013b3", new Object[]{this, jVar, aVar});
        } else {
            this.c.a(jVar, new c.b() { // from class: tb.ijr.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.status.c.b
                public boolean a(RSoStatus rSoStatus) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("36b3c7de", new Object[]{this, rSoStatus})).booleanValue();
                    }
                    if (rSoStatus == RSoStatus.FETCH_FAILED) {
                        RSoLog.c("PeekResolver ->  resolveOneResult, FETCH_FAILED in listener got fetched, " + jVar.a());
                        aVar.a(l.a(jVar, RSoException.error(6309), "status-notify-error"));
                        return true;
                    } else if (rSoStatus == RSoStatus.FETCHED) {
                        k a2 = ijr.a(ijr.this, jVar);
                        c.a aVar2 = aVar;
                        if (a2.i()) {
                            a2 = a2.a(ijp.FROM_COMBINED_RESOLVE);
                        }
                        aVar2.a(a2);
                        return true;
                    } else {
                        ikq.a("checkNeedResolve_" + rSoStatus, "status changed impossible " + jVar.a() + ", status to =" + rSoStatus);
                        return false;
                    }
                }
            });
        }
    }

    private void a(c.InterfaceC0566c interfaceC0566c, com.taobao.android.remoteso.resolver2.c cVar, final j jVar, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce8434d", new Object[]{this, interfaceC0566c, cVar, jVar, aVar});
        } else if (iks.a(this.f29089a.c("key_resolver_black_list"), new iks.a<String>() { // from class: tb.ijr.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iks.a
            public boolean a(String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : ikw.a((CharSequence) jVar.a(), (CharSequence) str);
            }
        })) {
            aVar.a(l.a(jVar, RSoException.error(3100), "config-disabled"));
        } else if (!this.e.d()) {
            k a2 = l.a(jVar, RSoException.error(6307, "process = " + this.e.g()), "child-process-error");
            aVar.a(a2);
            RSoLog.c("PeekResolver -> skipped, result=fail, not in main process, pullResult=" + a2);
        } else {
            interfaceC0566c.a(RSoStatus.FETCHING);
            this.d.a(cVar, jVar, new c.a() { // from class: tb.ijr.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.remoteso.resolver2.c.a
                public void a(final k kVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bc3202ab", new Object[]{this, kVar});
                    } else {
                        ijr.b(ijr.this).a(jVar, new c.a<Void>() { // from class: tb.ijr.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                            @Override // com.taobao.android.remoteso.status.c.a
                            public /* synthetic */ Void b(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c2) {
                                IpChange ipChange3 = $ipChange;
                                return ipChange3 instanceof IpChange ? ipChange3.ipc$dispatch("2d8b2ec7", new Object[]{this, rSoStatus, interfaceC0566c2}) : a(rSoStatus, interfaceC0566c2);
                            }

                            public Void a(RSoStatus rSoStatus, c.InterfaceC0566c interfaceC0566c2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (Void) ipChange3.ipc$dispatch("11d50cb3", new Object[]{this, rSoStatus, interfaceC0566c2});
                                }
                                if (kVar.i()) {
                                    interfaceC0566c2.a(RSoStatus.FETCHED);
                                    kVar.a("resolve");
                                } else {
                                    interfaceC0566c2.a(RSoStatus.FETCH_FAILED);
                                }
                                aVar.a(kVar);
                                return null;
                            }
                        });
                    }
                }
            });
        }
    }

    private k b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("91f2beee", new Object[]{this, jVar}) : this.d.a(jVar);
    }
}
