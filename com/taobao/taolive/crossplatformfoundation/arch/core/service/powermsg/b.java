package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.dxng.kmp_api_exporter.m;
import com.taobao.dxng.kmp_api_exporter.n;
import com.taobao.dxng.kmp_api_exporter.p;
import com.taobao.dxng.kmp_api_exporter.r;
import com.taobao.dxng.kmp_api_exporter.u;
import com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do.PMMessageResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;
import tb.tqy;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0006\u00100\u001a\u00020-J\u0012\u00101\u001a\u0002022\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0012\u00103\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00104\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00105\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00106\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00107\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00108\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00109\u001a\u00020-2\b\u0010:\u001a\u0004\u0018\u00010$J\u0006\u0010;\u001a\u00020-J\u0012\u0010<\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\r\u0010=\u001a\u000202H\u0016¢\u0006\u0002\u0010>J\r\u0010?\u001a\u000202H\u0016¢\u0006\u0002\u0010>J0\u0010@\u001a\u00020-2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010A\u001a\u0004\u0018\u00010\u00142\b\u0010B\u001a\u0004\u0018\u00010\u00142\b\u0010C\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010D\u001a\u00020-2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010E\u001a\u00020\u0014H\u0002J\b\u0010F\u001a\u00020-H\u0016J\b\u0010G\u001a\u00020-H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006H"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMInstance;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/processor/IOpenArchMessageProcessor;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchPMInstanceListener;", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "service", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMService;", "context", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", DataReceiveMonitor.CB_LISTENER, "<init>", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMService;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchPMInstanceListener;)V", "getService", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMService;", "setService", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMService;)V", "getContext", "()Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", "setContext", "(Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;)V", "uuid", "", "getUuid", "()Ljava/lang/String;", "setUuid", "(Ljava/lang/String;)V", "identifier", "getIdentifier", "setIdentifier", "topic", "getTopic", "setTopic", "entityIdentifier", "getEntityIdentifier", "setEntityIdentifier", "fetchIdentifier", "state", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/PMInstanceState;", "prevState", "pmClient", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsg;", "listeners", "", "getListeners", "()Ljava/util/List;", "onReceiveHistoryMsg", "", "message", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse;", "requestHistoryMsg", "checkMessageValid", "", "onTextMessageArrived", "onJoinMessageArrived", "onCountMessageArrived", "onMessageArrived", "onErrorArrived", "onSubscribed", "updateState", "next", "back2PrevState", "onUnSubscribed", TBPlayerConst.TBPlayerMethodSetup, "()Ljava/lang/Boolean;", "shutdown", "subscribe", "from", "ext", com.taobao.tao.powermsg.model.a.COL_BTAG, "unsubscribe", "generateIdentifier", "whenInstanceCreated", "whenInstanceWillRelease", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b implements com.taobao.uniinfra_kmp.common_utils.c, tqy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private c f21406a;
    private a b;
    private String c;
    private String d;
    private String e;
    private PMInstanceState f;
    private PMInstanceState g;
    private final List<tqy> h;
    private String i;

    static {
        kge.a(-1933906633);
        kge.a(-222548127);
        kge.a(-800627510);
        kge.a(239485178);
    }

    public b() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ t lambda$GRZY4YbNctRdPfGJJ0EywfZ9OlU(b bVar, p pVar) {
        return a(bVar, pVar);
    }

    public b(c cVar, a aVar, tqy tqyVar) {
        this.f21406a = cVar;
        this.b = aVar;
        this.c = d();
        a aVar2 = this.b;
        this.d = aVar2 != null ? aVar2.a() : null;
        this.f = PMInstanceState.Undefined;
        this.g = PMInstanceState.Undefined;
        this.h = new ArrayList();
        if (tqyVar != null) {
            this.h.add(tqyVar);
        }
    }

    public /* synthetic */ b(c cVar, a aVar, tqy tqyVar, int i, o oVar) {
        this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : tqyVar);
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public String getUuid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
    }

    public final void b() {
        OpenArchPMBizCode openArchPMBizCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String str = this.d;
        if (str == null) {
            a aVar = this.b;
            str = aVar != null ? aVar.a() : null;
        }
        if (str == null) {
            return;
        }
        u uVar = new u();
        a aVar2 = this.b;
        if (aVar2 == null || (openArchPMBizCode = aVar2.b()) == null) {
            openArchPMBizCode = OpenArchPMBizCode.DefaultBizCode;
        }
        uVar.a(openArchPMBizCode.getCode());
        uVar.a(str);
        uVar.b(0);
        uVar.c(20);
        n.a(m.Companion, uVar, new rul() { // from class: com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg.-$$Lambda$b$GRZY4YbNctRdPfGJJ0EywfZ9OlU
            @Override // tb.rul
            /* renamed from: invoke */
            public final Object mo2421invoke(Object obj) {
                return b.lambda$GRZY4YbNctRdPfGJJ0EywfZ9OlU(b.this, (p) obj);
            }
        });
    }

    public static final t a(b this$0, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("4c5877b", new Object[]{this$0, pVar});
        }
        q.d(this$0, "this$0");
        if (pVar != null) {
            List<com.taobao.dxng.kmp_api_exporter.t> a2 = pVar.a();
            if (a2 != null) {
                for (com.taobao.dxng.kmp_api_exporter.t tVar : a2) {
                    c cVar = this$0.f21406a;
                    if (cVar != null) {
                        cVar.a(tVar);
                    }
                }
            }
            List<com.taobao.dxng.kmp_api_exporter.o> b = pVar.b();
            if (b != null) {
                for (com.taobao.dxng.kmp_api_exporter.o oVar : b) {
                    c cVar2 = this$0.f21406a;
                    if (cVar2 != null) {
                        cVar2.a(oVar);
                    }
                }
            }
            List<com.taobao.dxng.kmp_api_exporter.q> c = pVar.c();
            if (c != null) {
                for (com.taobao.dxng.kmp_api_exporter.q qVar : c) {
                    c cVar3 = this$0.f21406a;
                    if (cVar3 != null) {
                        cVar3.a(qVar);
                    }
                }
            }
            List<r> d = pVar.d();
            if (d != null) {
                for (r rVar : d) {
                    c cVar4 = this$0.f21406a;
                    if (cVar4 != null) {
                        cVar4.a(rVar);
                    }
                }
            }
        }
        return t.INSTANCE;
    }

    private final boolean d(PMMessageResponse pMMessageResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("687292d7", new Object[]{this, pMMessageResponse})).booleanValue();
        }
        if (pMMessageResponse == null) {
            return false;
        }
        a aVar = this.b;
        return d.a(aVar != null ? aVar.c() : null, pMMessageResponse) && q.a((Object) pMMessageResponse.getTopic(), (Object) this.d);
    }

    @Override // tb.tqy
    public void a(PMMessageResponse pMMessageResponse) {
        List<tqy> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41614e36", new Object[]{this, pMMessageResponse});
        } else if (d(pMMessageResponse) && (list = this.h) != null) {
            for (tqy tqyVar : list) {
                if (pMMessageResponse != null) {
                    tqyVar.a(pMMessageResponse);
                }
            }
        }
    }

    @Override // tb.tqy
    public void b(PMMessageResponse pMMessageResponse) {
        List<tqy> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bc6515", new Object[]{this, pMMessageResponse});
            return;
        }
        a(PMInstanceState.Subscribed);
        if (!d(pMMessageResponse) || (list = this.h) == null) {
            return;
        }
        for (tqy tqyVar : list) {
            tqyVar.b(pMMessageResponse);
        }
    }

    public final void a(PMInstanceState pMInstanceState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f9e4df", new Object[]{this, pMInstanceState});
            return;
        }
        this.g = this.f;
        this.f = pMInstanceState;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f = this.g;
        }
    }

    @Override // tb.tqy
    public void c(PMMessageResponse pMMessageResponse) {
        List<tqy> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6177bf4", new Object[]{this, pMMessageResponse});
            return;
        }
        a(PMInstanceState.Unsubscribed);
        if (!d(pMMessageResponse) || (list = this.h) == null) {
            return;
        }
        for (tqy tqyVar : list) {
            if (pMMessageResponse != null) {
                tqyVar.c(pMMessageResponse);
            }
        }
    }

    private final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append('@');
        sb.append(hashCode());
        return sb.toString();
    }
}
