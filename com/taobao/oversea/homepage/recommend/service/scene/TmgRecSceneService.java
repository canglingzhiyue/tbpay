package com.taobao.oversea.homepage.recommend.service.scene;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import com.alibaba.android.split.core.splitinstall.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.oversea.baobao.view.DXProgress;
import com.taobao.oversea.category.a;
import com.taobao.tao.homepage.f;
import tb.bhd;
import tb.iqs;
import tb.kzc;
import tb.kzm;
import tb.lje;
import tb.ljs;
import tb.lpo;
import tb.lqr;
import tb.lrf;
import tb.ncw;
import tb.ndi;
import tb.rhl;
import tb.rhn;
import tb.tjp;
import tb.tjq;
import tb.tqm;
import tb.xku;

/* loaded from: classes7.dex */
public class TmgRecSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_BIZ_TYPE = "HomeRec";
    private Context mContext;
    private ljs mInfoFlowContext;
    private l mUtInvoker;
    private ndi pullDownRefreshInvoker;

    public static /* synthetic */ Object ipc$super(TmgRecSceneService tmgRecSceneService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -827603812) {
            super.onCreateService((ljs) objArr[0]);
            return null;
        } else if (hashCode != 2040710978) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.createView((Context) objArr[0]);
        }
    }

    public static /* synthetic */ void access$000(TmgRecSceneService tmgRecSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c51491", new Object[]{tmgRecSceneService});
        } else {
            tmgRecSceneService.forceRefresh();
        }
    }

    public static /* synthetic */ ljs access$100(TmgRecSceneService tmgRecSceneService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ljs) ipChange.ipc$dispatch("fad3235f", new Object[]{tmgRecSceneService}) : tmgRecSceneService.mInfoFlowContext;
    }

    public static /* synthetic */ void access$200(TmgRecSceneService tmgRecSceneService, ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1fe5ae", new Object[]{tmgRecSceneService, ljsVar});
        } else {
            tmgRecSceneService.initBroadcastListener(ljsVar);
        }
    }

    public static /* synthetic */ boolean access$300(TmgRecSceneService tmgRecSceneService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a3fbb58", new Object[]{tmgRecSceneService})).booleanValue() : tmgRecSceneService.checkRemoteModuleIsInstalled();
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        super.onCreateService(ljsVar);
        this.mInfoFlowContext = ljsVar;
        initDxRegister(ljsVar);
        IThemeService iThemeService = (IThemeService) ljsVar.a(IThemeService.class);
        if (iThemeService == null) {
            return;
        }
        iThemeService.setEnableCreateGlobalTheme("homepagehtao");
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.mContext = context;
        try {
            requestIfNeed();
            doAtIdle();
        } catch (Exception unused) {
        }
        return super.createView(context);
    }

    private void requestIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81efe49", new Object[]{this});
        } else if (!tjp.a("isOvsFirstStart", true)) {
        } else {
            forceRefresh();
            tjp.b("isOvsFirstStart", false);
        }
    }

    private void forceRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16dddf7", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        iContainerDataService.triggerEvent("PullToRefresh", null, new lje("PullToRefresh" + SystemClock.uptimeMillis()));
    }

    private void initDxRegister(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b94329", new Object[]{this, ljsVar});
            return;
        }
        IDxItemRenderService iDxItemRenderService = (IDxItemRenderService) ljsVar.a(IDxItemRenderService.class);
        if (iDxItemRenderService == null) {
            return;
        }
        iDxItemRenderService.setOnDxRegisterListener(new IDxItemRenderService.a() { // from class: com.taobao.oversea.homepage.recommend.service.scene.TmgRecSceneService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.a
            public void a(DinamicXEngine dinamicXEngine) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
                    return;
                }
                lpo.a(dinamicXEngine);
                lrf.a(dinamicXEngine);
                dinamicXEngine.a(ncw.DX_PARSER_HLOGIN, new ncw());
                dinamicXEngine.a(iqs.DX_PARSER_PLUSRENDERBUCKET, new iqs());
                dinamicXEngine.a(tjq.DX_EVENT_OPENRECSKU, new tjq());
                dinamicXEngine.a(rhn.DX_PARSER_HGETDATA, new rhn());
                dinamicXEngine.a(rhl.DX_EVENT_HSAVEDATA, new rhl());
                dinamicXEngine.a(tqm.DX_EVENT_POSTHEIGHTANIM, new tqm());
                dinamicXEngine.a(lqr.DX_EVENT_GATEWAYREQUEST, new lqr());
                f.a().b().a(kzm.DX_PARSER_HGETFROMSTATICCACHE, new kzm());
                f.a().b().a(kzc.DX_EVENT_HSETTOSTATICCACHE, new kzc());
                dinamicXEngine.a(DXProgress.DXTMGBAOBAOPROGRESS_TMGBAOBAOPROGRESS, new DXProgress());
                try {
                    BaobaoManager.a().b();
                } catch (Exception unused) {
                }
            }
        });
        iDxItemRenderService.setDxEngineConfigBuilder(new DXEngineConfig.a(DX_BIZ_TYPE));
    }

    private void initBroadcastListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47244b07", new Object[]{this, ljsVar});
        } else {
            LocalBroadcastManager.getInstance(this.mContext).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.oversea.homepage.recommend.service.scene.TmgRecSceneService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else {
                        TmgRecSceneService.access$000(TmgRecSceneService.this);
                    }
                }
            }, new IntentFilter("CURRENCY_CHANGE"));
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public h getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("cb98e77", new Object[]{this});
        }
        if (this.pullDownRefreshInvoker == null) {
            this.pullDownRefreshInvoker = new ndi(this.mInfoFlowContext);
        }
        return this.pullDownRefreshInvoker;
    }

    private boolean checkRemoteModuleIsInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0512f21", new Object[]{this})).booleanValue();
        }
        com.alibaba.android.split.core.splitinstall.h.a(this.mContext).a(j.a().a(bhd.a(this.mContext, "com.taobao.android.tmgdelivery.TMGDeliveryPurchaseFragment").a()).a(bhd.a(this.mContext, "com.taobao.oversea.live.homepage.ContainerFragment").a()).a());
        return true;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public l getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("6541bcea", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new xku(this.mInfoFlowContext);
        }
        return this.mUtInvoker;
    }

    private void doAtIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4b3e99", new Object[]{this});
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.oversea.homepage.recommend.service.scene.TmgRecSceneService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    TmgRecSceneService tmgRecSceneService = TmgRecSceneService.this;
                    TmgRecSceneService.access$200(tmgRecSceneService, TmgRecSceneService.access$100(tmgRecSceneService));
                    a.b();
                    TmgRecSceneService.access$300(TmgRecSceneService.this);
                    return false;
                }
            });
        }
    }
}
