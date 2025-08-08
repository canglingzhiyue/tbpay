package com.taobao.android.fluid.business.globalinteraction.render;

import android.net.Uri;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.intelligence.IIntelligenceService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.d;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.player.videoquickopen.GlobalConfigRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.iqw;
import tb.iqy;
import tb.jbh;
import tb.jbi;
import tb.jck;
import tb.jcq;
import tb.kge;
import tb.obu;
import tb.obw;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.ohd;
import tb.psw;
import tb.ska;
import tb.skl;
import tb.skt;
import tb.smk;
import tb.snd;
import tb.spj;
import tb.sps;
import tb.spy;
import tb.spz;

/* loaded from: classes5.dex */
public class a implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG_COLLECTION = "guangguang_collection";

    /* renamed from: a */
    private final FluidContext f12392a;
    private jbh f;
    private jck i;
    private jbi l;
    private String m;
    private boolean n;
    private boolean o;
    private boolean c = false;
    private boolean e = false;
    private long g = -1;

    static {
        kge.a(677265727);
        kge.a(1755210026);
    }

    private String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : "./bridge_0.0.1.png?localVersion=1";
    }

    @Override // tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
        }
    }

    @Override // tb.snd
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public static /* synthetic */ FluidContext a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("58ab7ef0", new Object[]{aVar}) : aVar.f12392a;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98af8d80", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.e = z;
        return z;
    }

    public static /* synthetic */ boolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f8ac1d", new Object[]{aVar})).booleanValue() : aVar.e;
    }

    public static /* synthetic */ jbi c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jbi) ipChange.ipc$dispatch("6c26315b", new Object[]{aVar}) : aVar.l;
    }

    public a(FluidContext fluidContext) {
        this.f12392a = fluidContext;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.c) {
        } else {
            this.c = true;
            spz.c("InteractRenderManager", "attachGlobalVCH5 preRequestConfig start,hashcode=" + this.f12392a.hashCode());
            d.a(this.f12392a, "vc_h5_config_load", "load_start", "false", "false", (String) null);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final sps sessionParams = ((ISceneConfigService) this.f12392a.getService(ISceneConfigService.class)).getSessionParams();
            a(new IRemoteBaseListener() { // from class: com.taobao.android.fluid.business.globalinteraction.render.InteractRenderManager$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        JSONObject jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getJSONObject(sessionParams != null ? sessionParams.b : "guangguang_pick");
                        String a2 = oec.a(jSONObject.get("openVCGlobalH5DSL"), (String) null);
                        d.a(a.a(a.this), "vc_h5_config_load", "load_success", "openVCGlobalH5DSL=" + a2, "load_time=" + (SystemClock.elapsedRealtime() - elapsedRealtime), (String) null);
                        a.this.a(a2, jSONObject);
                    } catch (Throwable th) {
                        d.a(a.a(a.this), "vc_h5_config_load", "load_failed", "crash=" + th.getMessage(), "false", (String) null);
                        spz.c("InteractRenderManager", "attachGlobalVCH5 failed" + th.getMessage() + ",hashcode=" + a.a(a.this).hashCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    FluidContext a2 = a.a(a.this);
                    d.a(a2, "vc_h5_config_load", "load_failed", "onError=" + mtopResponse.getRetMsg(), "false", (String) null);
                    spz.c("InteractRenderManager", "attachGlobalVCH5 onError failed=" + mtopResponse.getRetMsg() + ",hashcode=" + a.a(a.this).hashCode());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    FluidContext a2 = a.a(a.this);
                    d.a(a2, "vc_h5_config_load", "load_failed", "onSystemError=" + mtopResponse.getRetMsg(), "false", (String) null);
                    spz.c("InteractRenderManager", "attachGlobalVCH5 onSystemError failed=" + mtopResponse.getRetMsg() + ",hashcode=" + a.a(a.this).hashCode());
                }
            }, sessionParams != null ? sessionParams.b : "guangguang_pick");
        }
    }

    public void a(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (StringUtils.isEmpty(str) || this.l != null || ((ILifecycleService) this.f12392a.getService(ILifecycleService.class)).getPageState() == 5) {
        } else {
            spz.c("InteractRenderManager", "IdleTaskHelper globalVCH5 开始执行 attachGlobalVCH5Internal --- ");
            TNodeView c = c();
            if (c == null) {
                return;
            }
            FrameLayout frameLayout = new FrameLayout(this.f12392a.getContext());
            int g = ohd.g(this.f12392a.getContext());
            if (l()) {
                int c2 = obu.c();
                spz.c("InteractRenderManager", "attachGlobalVCH5Internal enableAdaptVirtualNavigationBar,tabBarParentHeight=" + c2);
                if (c2 > 0) {
                    g = c2;
                }
            }
            spz.c("InteractRenderManager", "globalVCH5LoadWaitingTime add VC H5 URL=" + str + ",h5ToVCHeight=" + g + ",hashcode=" + this.f12392a.hashCode());
            c.addUpperView(frameLayout, new FrameLayout.LayoutParams(-1, g), 100, null);
            this.l = new jbi(this.f12392a, frameLayout, map, this.g);
            this.m = str;
            this.l.a((com.taobao.android.fluid.framework.data.datamodel.a) null);
            ((IMessageService) this.f12392a.getService(IMessageService.class)).registerMessageHandler(this.l);
            List<com.taobao.android.fluid.framework.data.datamodel.a> detailMediaSetDataList = ((IDataService) this.f12392a.getService(IDataService.class)).getDetailMediaSetDataList();
            if (com.taobao.android.fluid.framework.data.datamodel.a.a(detailMediaSetDataList) == null) {
                return;
            }
            a.c a2 = com.taobao.android.fluid.framework.data.datamodel.a.a(detailMediaSetDataList).a();
            Map a3 = a2.a(this.f12392a);
            a3.put(obw.UPDATE_DATA_MSG_FOR_GLOBAL_H5, true);
            a3.put("modelIndex", 0);
            ((IMessageService) this.f12392a.getService(IMessageService.class)).sendMessage(new spy(spy.MSG_DATA_CHANGE, a2.c, a3));
        }
    }

    public TNodeView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TNodeView) ipChange.ipc$dispatch("9f369ec7", new Object[]{this});
        }
        aa tNode = ((IHostTNodeService) this.f12392a.getService(IHostTNodeService.class)).getTNode();
        if (tNode != null && tNode.M() != null && tNode.M().x() != null) {
            ViewGroup viewGroup = (ViewGroup) tNode.M().x().getParent();
            while (viewGroup != null && !(viewGroup instanceof TNodeView) && (viewGroup.getParent() instanceof ViewGroup)) {
                viewGroup = (ViewGroup) viewGroup.getParent();
            }
            if (viewGroup instanceof TNodeView) {
                return (TNodeView) viewGroup;
            }
        }
        return null;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.m;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        try {
            ((IContainerService) this.f12392a.getService(IContainerService.class)).getContentView().post(new Runnable() { // from class: com.taobao.android.fluid.business.globalinteraction.render.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Uri fluidUrl = a.a(a.this).getInstanceConfig().getFluidUrl();
                    if (fluidUrl == null) {
                        return;
                    }
                    String queryParameter = fluidUrl.getQueryParameter("dxShareData");
                    if (!StringUtils.equals(fluidUrl.getQueryParameter("type"), a.GUANGGUANG_COLLECTION)) {
                        return;
                    }
                    com.taobao.android.fluid.framework.data.datamodel.a aVar = iqy.a().b().get(queryParameter);
                    spz.c("InteractRenderManager", "合集打开了" + queryParameter + " " + aVar);
                    if (aVar == null || !com.taobao.android.fluid.business.videocollection.poplayer.a.a(a.a(a.this)) || a.a(a.this).getService(INativeCollectionPoplayerService.class) == null) {
                        return;
                    }
                    ((INativeCollectionPoplayerService) a.a(a.this).getService(INativeCollectionPoplayerService.class)).constructNativePoplayer(aVar, a.a(a.this), a.a(a.this).getContext());
                }
            });
        } catch (Exception e) {
            spz.c("DXCollection", e + "--e");
        }
    }

    public void a(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e800264", new Object[]{this, aVar});
        } else if (this.f != null) {
        } else {
            FluidContext fluidContext = this.f12392a;
            this.f = new jbh(fluidContext, (ViewGroup) ((IContainerService) fluidContext.getService(IContainerService.class)).getContentView().findViewById(R.id.global_h5));
            this.f.a(aVar);
            ((IMessageService) this.f12392a.getService(IMessageService.class)).registerMessageHandler(this.f);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ogh.a("initGlobalInteractHandler");
        skl j = ((IDataService) this.f12392a.getService(IDataService.class)).getConfig().j();
        if (iqw.f() && !StringUtils.isEmpty(j.g) && !((IQuickOpenService) this.f12392a.getService(IQuickOpenService.class)).isInQuickOpenMode()) {
            z = true;
        }
        this.n = z;
        if (z) {
            if (!StringUtils.isEmpty(j.i) && this.i == null) {
                ogh.a("initGlobalTNodeMessageHandler");
                this.i = new jck(((IContainerService) this.f12392a.getService(IContainerService.class)).getMainContentView(), this.f12392a);
                this.i.a(j.i, 1, -1, o());
                ((IMessageService) this.f12392a.getService(IMessageService.class)).registerMessageHandler(this.i);
                ogh.b();
            }
        } else {
            jck jckVar = this.i;
            if (jckVar != null) {
                jckVar.cI_();
                ((IMessageService) this.f12392a.getService(IMessageService.class)).unRegisterMessageHandler(this.i);
                this.i = null;
            }
            jcq behaviorManager = ((IIntelligenceService) this.f12392a.getService(IIntelligenceService.class)).getBehaviorManager();
            FluidContext fluidContext = this.f12392a;
            behaviorManager.a(fluidContext, ((IHostTNodeService) fluidContext.getService(IHostTNodeService.class)).getSharedTNodeEngine(), j.G, j.F);
        }
        ogh.b();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.n;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            jbh jbhVar = this.f;
            if (jbhVar != null) {
                jbhVar.j();
            }
            jck jckVar = this.i;
            if (jckVar != null) {
                jckVar.j();
            }
            jbi jbiVar = this.l;
            if (jbiVar != null) {
                jbiVar.j();
            }
            if (!this.o) {
                return;
            }
            this.o = false;
            boolean g = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().g();
            if (oeb.a("ShortVideo.checkMainActivity", true)) {
                if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a() == this.f12392a.getContext()) {
                    z2 = true;
                }
                g &= z2;
            }
            if (!g) {
                return;
            }
            smk.a(this.f12392a, "5", null, null, null, null);
        } else {
            jbh jbhVar2 = this.f;
            if (jbhVar2 != null) {
                jbhVar2.i();
            }
            jck jckVar2 = this.i;
            if (jckVar2 != null) {
                jckVar2.i();
            }
            jbi jbiVar2 = this.l;
            if (jbiVar2 != null) {
                jbiVar2.i();
            }
            this.o = true;
        }
    }

    public void c(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!i()) {
        } else {
            oec.a(new Runnable() { // from class: com.taobao.android.fluid.business.globalinteraction.render.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean isDetailRequestSuccess = ((IDataService) a.a(a.this).getService(IDataService.class)).isDetailRequestSuccess();
                    boolean b = a.b(a.this);
                    boolean q = iqw.q();
                    spz.c("InteractRenderManager", "initGlobalVCH5MessageHandler fromFirstFrame=" + z + ",mGlobalVCH5MessageHandler=" + a.c(a.this) + ",detailSuccess=" + isDetailRequestSuccess + ",globalWaitingDone=" + b + ",enableTab2GlobalInteract=" + q + ",hashcode=" + a.a(a.this).hashCode());
                    if (a.c(a.this) == null && isDetailRequestSuccess && !q) {
                        a.this.f();
                    }
                    a.a(a.this, true);
                }
            }, z ? 0L : iqw.c());
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (iqw.a(this.f12392a) && (this.f12392a.getContext() instanceof AppCompatActivity) && this.l == null) {
            z = true;
        }
        spz.c("InteractRenderManager", "checkInitGlobalVCH5MessageHandler enable=" + z + ",hashcode=" + this.f12392a.hashCode());
        return z;
    }

    @Override // tb.snd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            p();
        }
    }

    @Override // tb.snd
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        if (this.g < 0) {
            this.g = SystemClock.elapsedRealtime();
        }
        j();
    }

    @Override // tb.snd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        jbh jbhVar = this.f;
        if (jbhVar != null) {
            jbhVar.b();
        }
        jbi jbiVar = this.l;
        if (jbiVar == null) {
            return;
        }
        jbiVar.b();
    }

    @Override // tb.snd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        jbh jbhVar = this.f;
        if (jbhVar != null) {
            jbhVar.c();
        }
        jbi jbiVar = this.l;
        if (jbiVar == null) {
            return;
        }
        jbiVar.c();
    }

    public void a(final IRemoteBaseListener iRemoteBaseListener, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4100e258", new Object[]{this, iRemoteBaseListener, str});
            return;
        }
        GlobalConfigRequest globalConfigRequest = new GlobalConfigRequest();
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(str);
        globalConfigRequest.sourceList = jSONArray;
        ogg.d("InteractRenderManager", "开始请求");
        MtopModule.requestWithParser(new g.c(null, globalConfigRequest.toJsonObject(), null), new IRemoteBaseListener() { // from class: com.taobao.android.fluid.business.globalinteraction.render.InteractRenderManager$4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    if (iRemoteBaseListener == null) {
                        return;
                    }
                    iRemoteBaseListener.onSuccess(i, mtopResponse, baseOutDo, obj);
                } catch (Throwable th) {
                    ogg.a("InteractRenderManager", "requestVideoInfo failed: " + th);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                IRemoteBaseListener iRemoteBaseListener2 = iRemoteBaseListener;
                if (iRemoteBaseListener2 == null) {
                    return;
                }
                iRemoteBaseListener2.onSystemError(i, mtopResponse, obj);
            }
        }, null);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!iqw.a(this.f12392a)) {
        } else {
            c(false);
        }
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableAdaptVirtualNavigationBar", true);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (!iqw.a(this.f12392a)) {
        } else {
            ((IContainerService) this.f12392a.getService(IContainerService.class)).addFirstCardRenderListener(new ska() { // from class: com.taobao.android.fluid.business.globalinteraction.render.InteractRenderManager$5
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
                    } else {
                        a.this.c(true);
                    }
                }
            });
            ((IDataService) this.f12392a.getService(IDataService.class)).addDetailRequestSuccessListener(new skt() { // from class: com.taobao.android.fluid.business.globalinteraction.render.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // tb.skt
                public void onDetailRequestSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91cae82b", new Object[]{this});
                        return;
                    }
                    boolean q = iqw.q();
                    spz.c("InteractRenderManager", "DETAIL_SUCCESS mGlobalVCH5MessageHandler:" + a.c(a.this) + ",watingDone=" + a.b(a.this) + ",enableTab2GlobalInteract=" + q + ",hashcode=" + a.a(a.this).hashCode());
                    if (a.c(a.this) != null || !a.b(a.this) || q) {
                        return;
                    }
                    a.this.f();
                }
            });
            if (!iqw.a(this.f12392a.getContext(), spj.f(this.f12392a))) {
                return;
            }
            com.taobao.android.fluid.framework.data.remote.d.a(true, new IRemoteBaseListener() { // from class: com.taobao.android.fluid.business.globalinteraction.render.InteractRenderManager$7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else {
                        spz.c("InteractRenderManager", "DETAIL_SUCCESS requestGlobalH5InteractInfo onSuccess");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        spz.c("InteractRenderManager", "DETAIL_SUCCESS requestGlobalH5InteractInfo onError");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        spz.c("InteractRenderManager", "DETAIL_SUCCESS requestGlobalH5InteractInfo onSystemError");
                    }
                }
            });
        }
    }
}
