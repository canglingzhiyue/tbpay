package com.taobao.oversea.homepage.litetao.service.biz.sceneservice;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.infoflow.protocol.view.item.b;
import tb.ljs;
import tb.lln;
import tb.lmq;
import tb.ndb;
import tb.ndc;
import tb.ndd;

/* loaded from: classes7.dex */
public class LiteTaoSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_BIZ_TYPE = "HomeTaoTe";
    private static final String TAG = "LiteTaoSceneService";
    private Context context;
    private ljs mInfoFlowContext;
    private a mLiteTaoPullDownRefreshInvoker;
    private l mUtInvoker;
    private ndb naviBarInvoker;
    private FrameLayout rootView;
    private View taoteView;

    public static /* synthetic */ Object ipc$super(LiteTaoSceneService liteTaoSceneService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -827603812) {
            super.onCreateService((ljs) objArr[0]);
            return null;
        } else if (hashCode == 151698896) {
            super.onPageSelected();
            return null;
        } else if (hashCode != 1997193377) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroyService();
            return null;
        }
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
        initBiz(ljsVar);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.context = context;
        if (this.rootView == null) {
            this.rootView = new FrameLayout(context);
        }
        return this.rootView;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lld
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        if (this.taoteView != null) {
            return;
        }
        this.taoteView = createTaoTeView();
        this.rootView.addView(this.taoteView);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            super.onDestroyService();
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public h getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("cb98e77", new Object[]{this});
        }
        if (this.mLiteTaoPullDownRefreshInvoker == null) {
            this.mLiteTaoPullDownRefreshInvoker = new a(this.mInfoFlowContext);
        }
        return this.mLiteTaoPullDownRefreshInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public e getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3391ad3", new Object[]{this});
        }
        ndb ndbVar = this.naviBarInvoker;
        return ndbVar == null ? new ndb(this.mInfoFlowContext) : ndbVar;
    }

    private void initBiz(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2995e685", new Object[]{this, ljsVar});
            return;
        }
        initMainFeedsConfig(ljsVar);
        initDxRegister(ljsVar);
        initRegisterItemRenderFactory(ljsVar);
        initLifeCycleListener(ljsVar);
    }

    private void initLifeCycleListener(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3822bb10", new Object[]{this, ljsVar});
            return;
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService == null) {
            return;
        }
        ndd nddVar = new ndd(ljsVar);
        iMainLifecycleService.getPageLifeCycleRegister().a(nddVar);
        iMainLifecycleService.getTabLifeCycleRegister().a(nddVar);
    }

    private void initMainFeedsConfig(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6aec7b0", new Object[]{this, ljsVar});
            return;
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return;
        }
        iMainFeedsViewService.setInitConfig(new lln.a().a(-1).a());
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
        iDxItemRenderService.setDxEngineConfigBuilder(new DXEngineConfig.a(DX_BIZ_TYPE));
        iDxItemRenderService.setOnDxRegisterListener(new IDxItemRenderService.a() { // from class: com.taobao.oversea.homepage.litetao.service.biz.sceneservice.LiteTaoSceneService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.a
            public void a(DinamicXEngine dinamicXEngine) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
                }
            }
        });
    }

    private void initRegisterItemRenderFactory(final ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a71ed0", new Object[]{this, ljsVar});
        } else {
            ((IItemRenderService) ljsVar.a(IItemRenderService.class)).setItemRenderFactory(new IItemRenderService.a() { // from class: com.taobao.oversea.homepage.litetao.service.biz.sceneservice.LiteTaoSceneService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.base.IItemRenderService.a
                public b a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (b) ipChange2.ipc$dispatch("9e4cae1a", new Object[]{this, str});
                    }
                    if (!"error".equals(str)) {
                        return null;
                    }
                    return new lmq(ljsVar);
                }
            });
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public l getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("6541bcea", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new ndc(this.mInfoFlowContext);
        }
        return this.mUtInvoker;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, android.view.ViewGroup] */
    private View createTaoTeView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("417bdd65", new Object[]{this}) : ((IContainerService) this.mInfoFlowContext.a(IContainerService.class)).mo1092createContainer(this.context);
    }
}
