package tb;

import android.content.Context;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.c;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.AbsStreamResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamOtherResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.nextrpc.stream.request.StreamNextRpcRequest;
import com.alibaba.android.nextrpc.stream.request.b;
import com.alibaba.android.nextrpc.stream.request.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arc;
import tb.ase;
import tb.ask;

/* loaded from: classes2.dex */
public class ems extends huy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.android.nextrpc.stream.request.a f27439a;
    private final asm b = new ask();
    private final boolean c;
    private final boolean d;

    static {
        kge.a(-108233832);
    }

    public ems(Context context, String str, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.f27439a = new b().a(context).a(bbi.a(str)).a();
    }

    @Override // tb.ase
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f27439a.a();
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
            AURATraceUtil.b(2, "aura-stream-request-start[" + System.currentTimeMillis() + riy.ARRAY_END_STR);
            MtopBusiness a2 = bqh.a(bqh.a(aURANextRPCEndpoint), aURANextRPCEndpoint);
            if (this.c) {
                a2.mo1330supportStreamJson(true);
            }
            if (baz.a("allowParseJson", true)) {
                a2.allowParseJson(false);
            }
            StreamNextRpcRequest streamNextRpcRequest = new StreamNextRpcRequest(a2, aURANextRPCEndpoint.getAllTimeOutSeconds());
            a aVar2 = new a(aVar, this.d);
            final String a3 = this.f27439a.a(streamNextRpcRequest, aVar2);
            aVar2.a(new a.InterfaceC1114a() { // from class: tb.ems.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ems.a.InterfaceC1114a
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : a3;
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ase.a f27441a;
        private InterfaceC1114a b;
        private final long c = System.currentTimeMillis();
        private final boolean d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: tb.ems$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public interface InterfaceC1114a {
            String a();
        }

        static {
            kge.a(-2045633748);
            kge.a(-1714534073);
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void c(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e3d8095", new Object[]{this, streamOtherResponse});
            }
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("abc5cf04", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ InterfaceC1114a b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InterfaceC1114a) ipChange.ipc$dispatch("867ea30", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ ase.a c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ase.a) ipChange.ipc$dispatch("2b925004", new Object[]{aVar}) : aVar.f27441a;
        }

        public a(ase.a aVar, boolean z) {
            this.f27441a = aVar;
            this.d = z;
        }

        public void a(InterfaceC1114a interfaceC1114a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0634333", new Object[]{this, interfaceC1114a});
            } else {
                this.b = interfaceC1114a;
            }
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(final StreamRemoteMainResponse streamRemoteMainResponse, final List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("578d65d", new Object[]{this, streamRemoteMainResponse, list});
            } else if (this.f27441a == null) {
            } else {
                final long currentTimeMillis = System.currentTimeMillis();
                ard a2 = arc.a();
                a2.a("收到nextRPC流式数据 第" + streamRemoteMainResponse.getMainNum() + "段" + currentTimeMillis, arc.a.a().a("AURA/performance").b());
                final c a3 = a(streamRemoteMainResponse);
                final long currentTimeMillis2 = System.currentTimeMillis();
                if (streamRemoteMainResponse.getMainNum() == 1) {
                    AURATraceUtil.b(2, "aura-stream-request-end[" + currentTimeMillis2 + riy.ARRAY_END_STR);
                    AURATraceUtil.b(2, "aura-stream-request-thread-switch-start[" + currentTimeMillis2 + riy.ARRAY_END_STR);
                }
                huy.a(this.d, new Runnable() { // from class: tb.ems.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (streamRemoteMainResponse.getMainNum() == 1) {
                            long currentTimeMillis3 = System.currentTimeMillis();
                            xhz.a(a3, streamRemoteMainResponse.getStatistics());
                            xhz.a(a3.i(), 0, a.a(a.this), currentTimeMillis3);
                            xhz.a(a3.i(), 1, currentTimeMillis, currentTimeMillis2);
                            xhz.a(a3.i(), 2, currentTimeMillis2, currentTimeMillis3);
                            AURATraceUtil.b(2, "aura-stream-request-thread-switch-end[" + System.currentTimeMillis() + riy.ARRAY_END_STR);
                        }
                        a.c(a.this).a(a3, huy.a(list, a.b(a.this).a()));
                    }
                }, new Runnable() { // from class: tb.ems.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.c(a.this).a((ase.a) a3);
                        }
                    }
                });
            }
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(StreamOtherResponse streamOtherResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4febbc13", new Object[]{this, streamOtherResponse});
            } else if (this.f27441a == null || streamOtherResponse == null) {
            } else {
                final c a2 = a((AbsStreamResponse) streamOtherResponse);
                bbh.a(new Runnable() { // from class: tb.ems.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.c(a.this).a((ase.a) a2);
                        }
                    }
                }, 0L);
            }
        }

        @Override // com.alibaba.android.nextrpc.stream.request.d
        public void a(final List<AttachedResponse> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            } else if (this.f27441a == null) {
            } else {
                ard a2 = arc.a();
                a2.a("收到 流式 副响应 " + System.currentTimeMillis(), arc.a.a().a("AURA/performance").b());
                bbh.a(new Runnable() { // from class: tb.ems.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.c(a.this).a(huy.a(list, a.b(a.this).a()));
                        }
                    }
                }, 0L);
            }
        }

        private c a(AbsStreamResponse absStreamResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5b03c4e9", new Object[]{this, absStreamResponse});
            }
            c cVar = new c();
            bbe.a(bbl.a() ? "UI" : "非UI线程接收到主数据");
            cVar.b(absStreamResponse.getMainNum());
            cVar.a(absStreamResponse.getData());
            cVar.d(absStreamResponse.getApi());
            cVar.e(absStreamResponse.getVersion());
            cVar.a(absStreamResponse.getHeaders());
            MtopResponse mtopResponse = absStreamResponse.getMtopResponse();
            if (mtopResponse == null) {
                return cVar;
            }
            cVar.a(mtopResponse);
            cVar.c(mtopResponse.getRetMsg());
            cVar.b(mtopResponse.getRetCode());
            cVar.a(mtopResponse.isApiSuccess());
            cVar.a(mtopResponse.getMappingCode());
            cVar.a(mtopResponse.getResponseCode());
            bbe.a("解析主数据结束");
            return cVar;
        }
    }
}
