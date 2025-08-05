package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.detail.core.detail.widget.listview.TRecyclerView;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.dxng.kmp_api_exporter.r;
import com.taobao.dxng.kmp_api_exporter.s;
import com.taobao.dxng.kmp_api_exporter.t;
import com.taobao.dxng.kmp_api_exporter.v;
import com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do.PMMessageResponse;
import com.taobao.uniinfra_kmp.common_utils.serialization.b;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.tqx;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003J\u0010\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cJ\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u0012\u0010 \u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010!H\u0002J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003J\u0010\u0010&\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010(\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000bJ\u001a\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010.\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020-2\u0006\u0010*\u001a\u00020\u000bJ\u000e\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u000201R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMService;", "Lcom/taobao/uniinfra_kmp/common_utils/KMPNativeCommuBase;", "uuid", "", "<init>", "(Ljava/lang/String;)V", "getUuid", "()Ljava/lang/String;", "setUuid", "instanceMap", "", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMInstance;", "pmClient", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsg;", TBPlayerConst.TBPlayerMethodSetup, "", "context", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMContext;", "createPMMessage", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse;", "message", "onTextMessageArrived", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgTextMessage;", "onCountMessageArrived", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgCountMessage;", "onJoinMessageArrived", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgJoinMessage;", "onMessageArrived", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgPowerMessage;", "onSubscribed", "result", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgSubscribeResult;", "onUnSubscribed", "Lcom/taobao/dxng/kmp_api_exporter/PowerMsgUnSubscribeResult;", "onErrorArrived", "errorCode", "", "errorMsg", "fetchPMClient", "shutdown", "createInstance", "removeInstance", "instance", "addListener", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/message/listener/IOpenArchPMInstanceListener;", "removeListener", "buildExtParams", "entity", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/entity/OpenArchEntity;", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c implements com.taobao.uniinfra_kmp.common_utils.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private String f21407a;
    private final Map<String, b> b;

    static {
        kge.a(-1975463469);
        kge.a(239485178);
        Companion = new a(null);
    }

    public c() {
        this(null, 1, null);
    }

    public c(String str) {
        this.f21407a = str;
        this.b = new LinkedHashMap();
    }

    public /* synthetic */ c(String str, int i, o oVar) {
        this((i & 1) != 0 ? null : str);
    }

    public static final /* synthetic */ void a(c cVar, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb575e0", new Object[]{cVar, sVar});
        } else {
            cVar.a(sVar);
        }
    }

    public static final /* synthetic */ void a(c cVar, v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb6d2fd", new Object[]{cVar, vVar});
        } else {
            cVar.a(vVar);
        }
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public String getUuid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a2f0b68", new Object[]{this}) : this.f21407a;
    }

    @Override // com.taobao.uniinfra_kmp.common_utils.c
    public void setUuid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031a20e", new Object[]{this, str});
        } else {
            this.f21407a = str;
        }
    }

    public final PMMessageResponse a(String message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PMMessageResponse) ipChange.ipc$dispatch("1ea471c0", new Object[]{this, message});
        }
        q.d(message, "message");
        b.a aVar = com.taobao.uniinfra_kmp.common_utils.serialization.b.Companion;
        PMMessageResponse pMMessageResponse = (PMMessageResponse) ((Serializable) JSONObject.parseObject(message, PMMessageResponse.class));
        return pMMessageResponse == null ? new PMMessageResponse(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TRecyclerView.ITEM_POSITION_MASK, null) : pMMessageResponse;
    }

    public final void a(t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4745ac", new Object[]{this, tVar});
            return;
        }
        PMMessageResponse pMMessageResponse = new PMMessageResponse(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TRecyclerView.ITEM_POSITION_MASK, null);
        b bVar = this.b.get(pMMessageResponse.getTopic());
        if (bVar == null) {
            return;
        }
        bVar.a(pMMessageResponse);
    }

    public final void a(com.taobao.dxng.kmp_api_exporter.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f44ffd1", new Object[]{this, oVar});
            return;
        }
        PMMessageResponse pMMessageResponse = new PMMessageResponse(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TRecyclerView.ITEM_POSITION_MASK, null);
        b bVar = this.b.get(pMMessageResponse.getTopic());
        if (bVar == null) {
            return;
        }
        bVar.a(pMMessageResponse);
    }

    public final void a(com.taobao.dxng.kmp_api_exporter.q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f45e88f", new Object[]{this, qVar});
            return;
        }
        PMMessageResponse pMMessageResponse = new PMMessageResponse(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, TRecyclerView.ITEM_POSITION_MASK, null);
        b bVar = this.b.get(pMMessageResponse.getTopic());
        if (bVar == null) {
            return;
        }
        bVar.a(pMMessageResponse);
    }

    public final void a(r rVar) {
        b bVar;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f465cee", new Object[]{this, rVar});
            return;
        }
        PMMessageResponse a3 = (rVar == null || (a2 = rVar.a()) == null) ? null : a(a2);
        if (a3 == null || (bVar = this.b.get(a3.getTopic())) == null) {
            return;
        }
        bVar.a(a3);
    }

    private final void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f46d14d", new Object[]{this, sVar});
            return;
        }
        b bVar = this.b.get(sVar != null ? sVar.a() : null);
        if (bVar == null || sVar == null) {
            return;
        }
        if (sVar.b() == 1000) {
            tqx.Companion.a().a("订阅成功", bVar.a());
            PMMessageResponse a2 = a("{}");
            a2.setData((Map<String, ? extends Object>) sVar.c());
            a2.setTopic(sVar.a());
            bVar.b(a2);
            bVar.b();
            return;
        }
        tqx.Companion.a().a("订阅失败", bVar.a());
        bVar.c();
    }

    private final void a(v vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f482e6a", new Object[]{this, vVar});
            return;
        }
        b bVar = this.b.get(vVar != null ? vVar.a() : null);
        if (bVar == null || vVar == null) {
            return;
        }
        if (vVar.b() == 1000) {
            tqx.Companion.a().a("解除订阅成功", bVar.a());
            PMMessageResponse a2 = a("{}");
            a2.setData((Map<String, ? extends Object>) vVar.c());
            a2.setTopic(vVar.a());
            bVar.c(a2);
            return;
        }
        tqx.Companion.a().a("解除订阅失败", bVar.a());
        bVar.c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMService$Companion;", "", "<init>", "()V", "serviceSingleton", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/OpenArchPMService;", "getService", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1505832613);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
