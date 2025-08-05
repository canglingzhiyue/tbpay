package tb;

import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.nextrpc.streamv2.request.b;
import com.alibaba.android.nextrpc.streamv2.request.c;
import com.alibaba.android.nextrpc.streamv2.request.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import mtopsdk.mtop.domain.MtopRequest;
import tb.arc;
import tb.ase;
import tb.ask;

/* loaded from: classes2.dex */
public class xhy extends huy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final c c;
    private final xif b = new xif();

    /* renamed from: a  reason: collision with root package name */
    private final asm f34298a = new ask();

    static {
        kge.a(-933494732);
    }

    public xhy(String str, boolean z) {
        this.c = c.Companion.a(bbi.a(str));
    }

    @Override // tb.ase
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.a();
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
            ase.a a2 = this.f34298a.a(aURANextRPCEndpoint);
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
        } else if (bVar != null && aURANextRPCEndpoint.getNextRPCPrefetch() != null && this.f34298a.a(aURANextRPCEndpoint, aVar, bVar)) {
        } else {
            AURATraceUtil.b(2, "aura-stream-request-start[" + System.currentTimeMillis() + riy.ARRAY_END_STR);
            MtopRequest a2 = bqh.a(aURANextRPCEndpoint);
            MtopBusiness a3 = bqh.a(a2, aURANextRPCEndpoint);
            a3.mo1330supportStreamJson(true);
            if (baz.a("allowParseJson", true)) {
                a3.allowParseJson(false);
            }
            this.b.b();
            b a4 = b.Companion.a(a2, a3);
            a4.a(this.b);
            this.c.a(a4, new a(aVar));
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ase.a f34299a;
        private final long b = System.currentTimeMillis();

        static {
            kge.a(1343584456);
            kge.a(2103611420);
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(com.alibaba.android.nextrpc.streamv2.request.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd63bd6b", new Object[]{this, aVar});
            }
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6431ca", new Object[]{this, bVar});
            }
        }

        public a(ase.a aVar) {
            this.f34299a = aVar;
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(xii xiiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("752d840", new Object[]{this, xiiVar});
            } else if (this.f34299a == null) {
            } else {
                this.f34299a.a((ase.a) b(xiiVar));
            }
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(List<xih> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
            } else if (this.f34299a == null) {
            } else {
                ard a2 = arc.a();
                a2.a("收到 流式 副响应 " + System.currentTimeMillis(), arc.a.a().a("AURA/performance").b());
                this.f34299a.a(huy.a(list));
            }
        }

        @Override // com.alibaba.android.nextrpc.streamv2.request.d
        public void a(xij xijVar, List<xih> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41ad6944", new Object[]{this, xijVar, list, new Boolean(z)});
            } else if (this.f34299a == null) {
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                ard a2 = arc.a();
                a2.a("收到nextRPC流式数据 第" + xijVar.f() + "段 " + currentTimeMillis, arc.a.a().a("AURA/performance").b());
                com.alibaba.android.aura.datamodel.nextrpc.c a3 = a(xijVar);
                try {
                    if (xijVar.f() == 1) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        xhz.a(a3, (com.alibaba.android.nextrpc.stream.internal.response.b) null);
                        xhz.a(a3.i(), 0, this.b, currentTimeMillis2);
                        xhz.a(a3.i(), 1, currentTimeMillis, currentTimeMillis2);
                        AURATraceUtil.b(2, "aura-stream-request-thread-switch-end[" + currentTimeMillis2 + riy.ARRAY_END_STR);
                    }
                    this.f34299a.a(a3, huy.a(list));
                } catch (Throwable th) {
                    arc.a().a(AURATraceUtil.a(th), arc.a.a().a("AURA/error").b());
                    this.f34299a.a((ase.a) a3);
                }
            }
        }

        private com.alibaba.android.aura.datamodel.nextrpc.c a(xij xijVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.aura.datamodel.nextrpc.c) ipChange.ipc$dispatch("67896dbb", new Object[]{this, xijVar});
            }
            com.alibaba.android.aura.datamodel.nextrpc.c cVar = new com.alibaba.android.aura.datamodel.nextrpc.c();
            bbe.a(bbl.a() ? "UI" : "非UI线程接收到主数据");
            cVar.b(xijVar.f());
            cVar.a(xijVar.c());
            cVar.d(xijVar.a().c);
            cVar.e(xijVar.a().d);
            cVar.a(xijVar.b());
            cVar.a(xijVar.a());
            bbe.a("解析主数据结束");
            return cVar;
        }

        private com.alibaba.android.aura.datamodel.nextrpc.c b(xii xiiVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.alibaba.android.aura.datamodel.nextrpc.c) ipChange.ipc$dispatch("f4ecead9", new Object[]{this, xiiVar});
            }
            com.alibaba.android.aura.datamodel.nextrpc.c cVar = new com.alibaba.android.aura.datamodel.nextrpc.c();
            bbe.a(bbl.a() ? "UI" : "非UI线程接收到主数据");
            cVar.b(xiiVar.a());
            cVar.a(xiiVar.e());
            cVar.a(xiiVar.d());
            cVar.c(xiiVar.c());
            bbe.a("解析主数据结束");
            return cVar;
        }
    }
}
