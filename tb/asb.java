package tb;

import android.content.Context;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.request.CachedMainResponse;
import com.alibaba.android.nextrpc.request.NextRpcRequest;
import com.alibaba.android.nextrpc.request.RemoteMainResponse;
import com.alibaba.android.nextrpc.request.b;
import com.alibaba.android.nextrpc.request.c;
import com.alibaba.android.nextrpc.request.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arc;
import tb.ase;
import tb.ask;

/* loaded from: classes2.dex */
public class asb extends huy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f25546a;
    private final asm b = new ask();
    private final boolean c;
    private final boolean d;

    /* renamed from: tb.asb$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25548a = new int[AURANextRPCEndpoint.AttachedResponseStrategy.values().length];

        static {
            try {
                f25548a[AURANextRPCEndpoint.AttachedResponseStrategy.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25548a[AURANextRPCEndpoint.AttachedResponseStrategy.IMMEDIATELY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-2095876076);
    }

    public static /* synthetic */ Object ipc$super(asb asbVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static ase a(Context context, String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ase) ipChange.ipc$dispatch("c7f64549", new Object[]{context, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        }
        if (z) {
            if (baz.a("enableNewNextRPCStream", true)) {
                return new xhy(str, z3);
            }
            return new ems(context.getApplicationContext(), str, z2, z3);
        }
        return new asb(context.getApplicationContext(), str, z2, z3);
    }

    public asb(Context context, String str, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.f25546a = new c().a(context).a(bbi.a(str)).a();
    }

    @Override // tb.ase
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f25546a.a();
        }
    }

    @Override // tb.ase
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint, ase.a aVar) {
        ask.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("965b590b", new Object[]{this, aURANextRPCEndpoint, aVar});
        } else if (aURANextRPCEndpoint.getNextRPCPrefetch() == null) {
        } else {
            ase.a a2 = this.b.a(aURANextRPCEndpoint);
            if (aVar == null) {
                cVar = new ask.c(a2);
            } else {
                cVar = new ask.c(a2, aVar);
            }
            a(aURANextRPCEndpoint, cVar, (ase.b) null);
        }
    }

    @Override // tb.ase
    public void a(AURANextRPCEndpoint aURANextRPCEndpoint, ase.a aVar, ase.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9398d7aa", new Object[]{this, aURANextRPCEndpoint, aVar, bVar});
        } else if (bVar != null && aURANextRPCEndpoint.getNextRPCPrefetch() != null && this.b.a(aURANextRPCEndpoint, aVar, bVar)) {
        } else {
            AURATraceUtil.b(2, "aura-request-start[" + System.currentTimeMillis() + riy.ARRAY_END_STR);
            MtopBusiness a2 = bqh.a(bqh.a(aURANextRPCEndpoint), aURANextRPCEndpoint);
            if (this.c) {
                a2.mo1330supportStreamJson(true);
            }
            NextRpcRequest nextRpcRequest = new NextRpcRequest(a2, aURANextRPCEndpoint.getAllTimeOutSeconds(), b(aURANextRPCEndpoint));
            a aVar2 = new a(aVar, this.c, this.d);
            final String a3 = this.f25546a.a(nextRpcRequest, aVar2);
            aVar2.a(new a.InterfaceC1087a() { // from class: tb.asb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.asb.a.InterfaceC1087a
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : a3;
                }
            });
        }
    }

    private NextRpcRequest.AttachedResponseStrategy b(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NextRpcRequest.AttachedResponseStrategy) ipChange.ipc$dispatch("8a5d9edc", new Object[]{this, aURANextRPCEndpoint});
        }
        NextRpcRequest.AttachedResponseStrategy attachedResponseStrategy = NextRpcRequest.AttachedResponseStrategy.IMMEDIATELY;
        AURANextRPCEndpoint.AttachedResponseStrategy attachedResponseStrategy2 = aURANextRPCEndpoint.getAttachedResponseStrategy();
        return (attachedResponseStrategy2 == null || AnonymousClass2.f25548a[attachedResponseStrategy2.ordinal()] != 1) ? attachedResponseStrategy : NextRpcRequest.AttachedResponseStrategy.FULL;
    }

    /* loaded from: classes2.dex */
    public static class a implements e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ase.a f25549a;
        private InterfaceC1087a b;
        private final boolean c;
        private final long d = System.currentTimeMillis();
        private final boolean e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tb.asb$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC1087a {
            String a();
        }

        static {
            kge.a(-892251320);
            kge.a(1070865210);
        }

        public static /* synthetic */ ase.a a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ase.a) ipChange.ipc$dispatch("42c0df2b", new Object[]{aVar}) : aVar.f25549a;
        }

        public static /* synthetic */ long b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("867f86c0", new Object[]{aVar})).longValue() : aVar.d;
        }

        public static /* synthetic */ InterfaceC1087a c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InterfaceC1087a) ipChange.ipc$dispatch("9499926f", new Object[]{aVar}) : aVar.b;
        }

        public void a(InterfaceC1087a interfaceC1087a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92e41dee", new Object[]{this, interfaceC1087a});
            } else {
                this.b = interfaceC1087a;
            }
        }

        public a(ase.a aVar, boolean z, boolean z2) {
            this.f25549a = aVar;
            this.c = z;
            this.e = z2;
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17733f99", new Object[]{this, remoteMainResponse});
            } else if (this.f25549a == null || remoteMainResponse == null) {
            } else {
                final com.alibaba.android.aura.datamodel.nextrpc.a a2 = a(remoteMainResponse.getMtopResponse());
                bbh.a(new Runnable() { // from class: tb.asb.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a((ase.a) a2);
                        }
                    }
                }, 0L);
            }
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void b(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1e8e01a", new Object[]{this, remoteMainResponse});
            } else if (this.f25549a == null || remoteMainResponse == null) {
            } else {
                final com.alibaba.android.aura.datamodel.nextrpc.a c = c(remoteMainResponse);
                bbh.a(new Runnable() { // from class: tb.asb.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a((ase.a) c);
                        }
                    }
                }, 0L);
            }
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(CachedMainResponse cachedMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b7caa33d", new Object[]{this, cachedMainResponse});
            } else if (this.f25549a == null || cachedMainResponse == null) {
            } else {
                final com.alibaba.android.aura.datamodel.nextrpc.a a2 = a(cachedMainResponse.getMtopCacheEvent().getMtopResponse());
                bbh.a(new Runnable() { // from class: tb.asb.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).b(a2);
                        }
                    }
                }, new Runnable() { // from class: tb.asb.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a((ase.a) a2);
                        }
                    }
                });
            }
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(RemoteMainResponse remoteMainResponse, final List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f897a8a", new Object[]{this, remoteMainResponse, list});
                return;
            }
            AURATraceUtil.b(2, "aura-request-end[" + System.currentTimeMillis() + riy.ARRAY_END_STR);
            if (this.f25549a == null || remoteMainResponse == null) {
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            ard a2 = arc.a();
            a2.a("收到nextRPC主数据 " + currentTimeMillis, arc.a.a().a("AURA/performance").b());
            final com.alibaba.android.aura.datamodel.nextrpc.a c = c(remoteMainResponse);
            final long currentTimeMillis2 = System.currentTimeMillis();
            AURATraceUtil.b(2, "aura-request-thread-switch-start[" + currentTimeMillis + riy.ARRAY_END_STR);
            huy.a(this.e, new Runnable() { // from class: tb.asb.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    long currentTimeMillis3 = System.currentTimeMillis();
                    AURATraceUtil.b(2, "aura-request-thread-switch-end[" + System.currentTimeMillis() + riy.ARRAY_END_STR);
                    xhz.a(c.i(), 0, a.b(a.this), currentTimeMillis3);
                    xhz.a(c.i(), 1, currentTimeMillis, currentTimeMillis2);
                    xhz.a(c.i(), 2, currentTimeMillis2, currentTimeMillis3);
                    a.a(a.this).a(c, huy.a(list, a.c(a.this).a()));
                }
            }, new Runnable() { // from class: tb.asb.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a.this).a((ase.a) c);
                    }
                }
            });
        }

        @Override // com.alibaba.android.nextrpc.request.e
        public void a(final List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (this.f25549a == null || list == null) {
            } else {
                ard a2 = arc.a();
                a2.a("收到 副响应 " + System.currentTimeMillis(), arc.a.a().a("AURA/performance").b());
                bbh.a(new Runnable() { // from class: tb.asb.a.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this).a(huy.a(list, a.c(a.this).a()));
                        }
                    }
                }, 0L);
            }
        }

        private com.alibaba.android.aura.datamodel.nextrpc.a c(RemoteMainResponse remoteMainResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.aura.datamodel.nextrpc.a) ipChange.ipc$dispatch("7b448301", new Object[]{this, remoteMainResponse});
            }
            com.alibaba.android.aura.datamodel.nextrpc.a aVar = new com.alibaba.android.aura.datamodel.nextrpc.a();
            bbe.a(bbl.a() ? "UI" : "非UI线程接收到主数据");
            MtopResponse mtopResponse = remoteMainResponse.getMtopResponse();
            if (mtopResponse == null) {
                return aVar;
            }
            aVar.a(mtopResponse);
            if (this.c) {
                aVar.a(mtopResponse.getOriginFastJsonObject());
            } else {
                aVar.d(mtopResponse.getApi());
                aVar.e(mtopResponse.getV());
                aVar.c(mtopResponse.getRetMsg());
                aVar.a(b(mtopResponse));
            }
            aVar.b(mtopResponse.getRetCode());
            aVar.a(mtopResponse.isApiSuccess());
            aVar.a(mtopResponse.getMappingCode());
            aVar.a(mtopResponse.getResponseCode());
            aVar.a(mtopResponse.getHeaderFields());
            bbe.a("解析主数据结束");
            return aVar;
        }

        private com.alibaba.android.aura.datamodel.nextrpc.a a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.aura.datamodel.nextrpc.a) ipChange.ipc$dispatch("1b4f1aaf", new Object[]{this, mtopResponse});
            }
            com.alibaba.android.aura.datamodel.nextrpc.a aVar = new com.alibaba.android.aura.datamodel.nextrpc.a();
            bbe.a("接收到主数据");
            if (mtopResponse == null) {
                return aVar;
            }
            aVar.a(mtopResponse);
            aVar.d(mtopResponse.getApi());
            aVar.e(mtopResponse.getV());
            aVar.c(mtopResponse.getRetMsg());
            aVar.a(b(mtopResponse));
            aVar.b(mtopResponse.getRetCode());
            aVar.a(mtopResponse.isApiSuccess());
            aVar.a(mtopResponse.getMappingCode());
            aVar.a(mtopResponse.getResponseCode());
            aVar.a(mtopResponse.getHeaderFields());
            bbe.a("解析主数据结束");
            return aVar;
        }

        private JSONObject b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("92da388e", new Object[]{this, mtopResponse});
            }
            if (mtopResponse.getOriginFastJsonObject() != null) {
                return mtopResponse.getOriginFastJsonObject();
            }
            return bba.a(mtopResponse.getBytedata() == null ? "" : new String(mtopResponse.getBytedata()));
        }
    }
}
