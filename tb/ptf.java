package tb;

import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.publishinsert.helper.PublishInsertHelper;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.cards.base.layer.interactive.eventhandler.nativ.b;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.sia;

/* loaded from: classes5.dex */
public final class ptf implements shm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "InteractiveMediaCardList";

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f32876a;
    private final ISceneConfigService b;
    private final IMessageService c;
    private final psw d;
    private final ViewGroup e;
    private a f;
    private a.c g;
    private qmq i;
    private sgx k;
    private b l;
    private rgc m;

    static {
        kge.a(883904823);
        kge.a(267465044);
    }

    @Override // tb.shm
    public void onCreateView(psw pswVar, snp snpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af379f7e", new Object[]{this, pswVar, snpVar});
        }
    }

    @Override // tb.shm
    public void onRecycle(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9576a57", new Object[]{this, pswVar});
        }
    }

    public static /* synthetic */ sgx a(ptf ptfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sgx) ipChange.ipc$dispatch("23ff5cec", new Object[]{ptfVar}) : ptfVar.k;
    }

    public static /* synthetic */ qmq b(ptf ptfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmq) ipChange.ipc$dispatch("ba0603a", new Object[]{ptfVar}) : ptfVar.i;
    }

    public ptf(psw pswVar, snp snpVar) {
        this.f32876a = pswVar.z();
        this.b = (ISceneConfigService) this.f32876a.getService(ISceneConfigService.class);
        this.c = (IMessageService) this.f32876a.getService(IMessageService.class);
        this.d = pswVar;
        this.e = (ViewGroup) snpVar.itemView;
        a(pswVar);
    }

    public rgc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rgc) ipChange.ipc$dispatch("f0a0610", new Object[]{this}) : this.m;
    }

    public b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d97816f1", new Object[]{this}) : this.l;
    }

    public qmq c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmq) ipChange.ipc$dispatch("1e6cf4a7", new Object[]{this}) : this.i;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.g == null) {
        } else {
            qmq qmqVar = this.i;
            if (qmqVar != null) {
                qmqVar.j();
            }
            rgc rgcVar = this.m;
            if (rgcVar != null) {
                rgcVar.j();
            }
            sgx sgxVar = this.k;
            if (sgxVar == null) {
                return;
            }
            sgxVar.j();
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        qmq qmqVar = this.i;
        if (qmqVar != null) {
            qmqVar.a(f);
        }
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.a(f);
        }
        sgx sgxVar = this.k;
        if (sgxVar == null) {
            return;
        }
        sgxVar.a(f);
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e0be620", new Object[]{this, pswVar, aVar, new Integer(i)});
            return;
        }
        this.f = aVar;
        this.g = aVar.a();
        if (((IQuickOpenService) this.f32876a.getService(IQuickOpenService.class)).isQuickOpenMode()) {
            spy spyVar = new spy(spy.MSG_DATA_CHANGE, this.g.c, this.g.a(this.f32876a));
            qmq qmqVar = this.i;
            if (qmqVar != null) {
                qmqVar.b(spyVar);
            }
        } else {
            r();
            a(aVar, aVar.a());
        }
        e();
        l();
    }

    @Override // tb.shm
    public void onBindData(psw pswVar, a aVar, int i, List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa3311", new Object[]{this, pswVar, aVar, new Integer(i), list});
        } else if (!((IQuickOpenService) this.f32876a.getService(IQuickOpenService.class)).isInQuickOpenMode() || list == null || list.size() != 1 || !(list.get(0) instanceof Long) || !Long.valueOf(((IDataService) this.f32876a.getService(IDataService.class)).getQuickSecondRefreshMd5()).equals((Long) list.get(0))) {
        } else {
            this.f = aVar;
            j();
            r();
            a(aVar, aVar.a());
        }
    }

    @Override // tb.shm
    public void onAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1baaf7", new Object[]{this, pswVar});
        } else {
            m();
        }
    }

    @Override // tb.shm
    public void onDisAppear(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733d6747", new Object[]{this, pswVar});
        } else {
            n();
        }
    }

    @Override // tb.shm
    public void onWillActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac5eda", new Object[]{this, pswVar});
        } else {
            o();
        }
    }

    @Override // tb.shm
    public void onWillDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d1f606", new Object[]{this, pswVar});
        } else {
            b("willDisActive");
        }
    }

    @Override // tb.shm
    public void onActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cababae8", new Object[]{this, pswVar});
            return;
        }
        if (this.d.L()) {
            q();
        }
        b("active");
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.c();
        }
        qmq qmqVar = this.i;
        if (qmqVar != null) {
            qmqVar.e();
        }
        p();
        s();
    }

    @Override // tb.shm
    public void onDisActive(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2dc7738", new Object[]{this, pswVar});
            return;
        }
        b("disactive");
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.d();
        }
        qmq qmqVar = this.i;
        if (qmqVar == null) {
            return;
        }
        qmqVar.d();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            rgc rgcVar = this.m;
            if (rgcVar != null) {
                rgcVar.j();
            }
            qmq qmqVar = this.i;
            if (qmqVar != null) {
                qmqVar.j();
            }
            sgx sgxVar = this.k;
            if (sgxVar == null) {
                return;
            }
            sgxVar.j();
        } else {
            rgc rgcVar2 = this.m;
            if (rgcVar2 != null) {
                rgcVar2.i();
            }
            qmq qmqVar2 = this.i;
            if (qmqVar2 != null) {
                qmqVar2.i();
            }
            sgx sgxVar2 = this.k;
            if (sgxVar2 == null) {
                return;
            }
            sgxVar2.i();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.e();
        }
        c(true);
        qmq qmqVar = this.i;
        if (qmqVar != null) {
            qmqVar.g();
        }
        sgx sgxVar = this.k;
        if (sgxVar == null) {
            return;
        }
        sgxVar.a();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.g();
        }
        c(false);
        qmq qmqVar = this.i;
        if (qmqVar != null) {
            qmqVar.l();
        }
        sgx sgxVar = this.k;
        if (sgxVar == null) {
            return;
        }
        sgxVar.b();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        q();
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.e();
        }
        c(true);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.g();
        }
        c(false);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            qmq qmqVar = this.i;
            if (qmqVar != null) {
                qmqVar.j();
            }
            sgx sgxVar = this.k;
            if (sgxVar == null) {
                return;
            }
            sgxVar.j();
        } else {
            qmq qmqVar2 = this.i;
            if (qmqVar2 != null) {
                qmqVar2.i();
            }
            sgx sgxVar2 = this.k;
            if (sgxVar2 == null) {
                return;
            }
            sgxVar2.i();
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        spz.c(TAG, "更新卡片消息 Handler 中当前卡片的 ID：" + str);
        rgc rgcVar = this.m;
        if (rgcVar != null) {
            rgcVar.a(str);
        }
        qmq qmqVar = this.i;
        if (qmqVar != null) {
            qmqVar.a(str);
        }
        sgx sgxVar = this.k;
        if (sgxVar != null) {
            sgxVar.a(str);
        }
        b bVar = this.l;
        if (bVar == null) {
            return;
        }
        bVar.a(str);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableCardH5", false)) {
        } else {
            skl j = ((IDataService) this.d.z().getService(IDataService.class)).getConfig().j();
            if ((!StringUtils.isEmpty(iqw.b(this.d.z()) ? j.l : j.k)) && this.m == null) {
                this.m = new rgc(this.e, this.d);
            }
            this.c.registerMessageHandler(this.m);
        }
    }

    private void a(psw pswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3f5b84", new Object[]{this, pswVar});
            return;
        }
        if (!((IQuickOpenService) this.f32876a.getService(IQuickOpenService.class)).isQuickOpenMode()) {
            j();
        }
        r();
        this.l = new b(this, pswVar, this.e, this.i);
        ((IMessageService) this.f32876a.getService(IMessageService.class)).registerMessageHandler(this.l);
    }

    private void l() {
        sia a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!iqw.j() || (a2 = this.d.F().a()) == null || a2.h()) {
        } else {
            spz.c(TAG, "resestCardVideoView,需要重置，收到VSMSG_screenMove消息,SlideDownParam:" + a2.toString());
            int b = a2.b();
            shy.a(new sia.a().a(this.e).c(a2.c()).a(b).a(a2.d()).b(a2.e()).b(-b).d(true).c(true).a(a2.i()).a());
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", str);
        hashMap.put("index", String.valueOf(this.d.v().a()));
        ((IMessageService) this.f32876a.getService(IMessageService.class)).sendMessage(new spy("VSMSG_stateChanged", this.f.a().c, hashMap));
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            b("appear");
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            b("disappear");
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            b("willActive");
        }
    }

    private void a(a aVar, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa138c9", new Object[]{this, aVar, cVar});
            return;
        }
        spy spyVar = new spy(spy.MSG_DATA_CHANGE, cVar.c, PublishInsertHelper.a(this.f32876a, aVar, cVar.a(this.f32876a), cVar.c));
        spz.c(TAG, "weexDelay，InteractiveMediaCardList updateMediaDetail 调用messageCenter发送消息");
        a(cVar.c);
        ((IMessageService) this.f32876a.getService(IMessageService.class)).sendMessage(spyVar);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!iqw.a()) {
        } else {
            a.c a2 = this.f.a();
            Map a3 = a2.a(this.f32876a);
            a3.put(obw.UPDATE_DATA_MSG_FOR_GLOBAL_H5, true);
            a3.put("modelIndex", Integer.valueOf(this.d.v().a()));
            spy spyVar = new spy(spy.MSG_DATA_CHANGE, a2.c, a3);
            a(a2.c);
            ((IMessageService) this.f32876a.getService(IMessageService.class)).sendMessage(spyVar);
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        a aVar = this.f;
        if (aVar == null) {
            spz.c(TAG, "发送当前Active卡片数据发生变化的消息，mMediaSetData为空");
            return;
        }
        a.c a2 = aVar.a();
        if (a2 == null) {
            spz.c(TAG, "发送当前Active卡片数据发生变化的消息，mediaDetail为空");
            return;
        }
        Map a3 = a2.a(this.f32876a);
        a3.put("modelIndex", Integer.valueOf(this.d.v().a()));
        Object json = JSON.toJSON(a3);
        if (json == null) {
            spz.c(TAG, "发送当前Active卡片数据发生变化的消息，mediaDetailObject为空");
            return;
        }
        JSONObject a4 = jum.a(this.f32876a);
        obz.a(a4, (JSONObject) json);
        ((IMessageService) this.f32876a.getService(IMessageService.class)).sendMessage(new spy(suz.CARD_DATA_CHANGE_NAME, a2.c, a4));
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        spz.c(TAG, "发送页面状态发生改变的消息，appear: " + z);
        a.c cVar = null;
        a aVar = this.f;
        if (aVar != null) {
            cVar = aVar.a();
        }
        if (cVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", z ? "appear" : "disappear");
        String a2 = ((ILifecycleService) this.f32876a.getService(ILifecycleService.class)).getConfig().a();
        if (!StringUtils.isEmpty(a2)) {
            hashMap.put("type", a2);
        }
        spz.c(TAG, "发送页面状态发生改变的消息到消息中心，args: " + hashMap);
        ((IMessageService) this.f32876a.getService(IMessageService.class)).sendMessage(new spy("VSMSG_pageStateChanged", cVar.c, hashMap));
    }

    private void d(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (!iqw.h()) {
        } else {
            ((IContainerService) this.f32876a.getService(IContainerService.class)).addFirstCardRenderListener(new ska() { // from class: tb.ptf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ska
                public void onFirstCardRenderFailed(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9d76177", new Object[]{this, pswVar});
                    }
                }

                @Override // tb.ska
                public void onFirstCardRenderSuccess(psw pswVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7ed75eef", new Object[]{this, pswVar});
                        return;
                    }
                    spz.c(ptf.TAG, "PickPreloadController，InteractiveMediaCardList,收到首帧回调,updateGraymaskVisible:,enableWeexDSLV2:" + z);
                    if (z) {
                        if (ptf.a(ptf.this) == null) {
                            return;
                        }
                        ptf.a(ptf.this).c();
                    } else if (ptf.b(ptf.this) == null) {
                    } else {
                        ptf.b(ptf.this).m();
                    }
                }
            });
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            ((IDataService) this.f32876a.getService(IDataService.class)).onDataChanged(this.f);
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        boolean z = iqw.f() && !StringUtils.isEmpty(((IDataService) this.f32876a.getService(IDataService.class)).getConfig().j().g) && !((IQuickOpenService) this.f32876a.getService(IQuickOpenService.class)).isInQuickOpenMode();
        if (z) {
            ((IInteractionService) this.d.z().getService(IInteractionService.class)).getConfig().b(true);
            if (this.k == null) {
                this.k = new sgx(this.e, this.d);
                ((IMessageService) this.f32876a.getService(IMessageService.class)).registerMessageHandler(this.k);
            }
            qmq qmqVar = this.i;
            if (qmqVar != null) {
                qmqVar.cI_();
                ((IMessageService) this.f32876a.getService(IMessageService.class)).unRegisterMessageHandler(this.i);
                this.i = null;
            }
        } else {
            ((IInteractionService) this.d.z().getService(IInteractionService.class)).getConfig().b(false);
            if (this.i == null) {
                this.i = new qmq(this.e, this.d);
                this.c.registerMessageHandler(this.i);
            }
            sgx sgxVar = this.k;
            if (sgxVar != null) {
                sgxVar.cI_();
                this.c.unRegisterMessageHandler(this.k);
                this.k = null;
            }
        }
        d(z);
    }
}
