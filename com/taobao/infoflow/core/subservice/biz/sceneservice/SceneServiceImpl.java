package com.taobao.infoflow.core.subservice.biz.sceneservice;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.b;
import com.taobao.infoflow.protocol.engine.invoke.biz.c;
import com.taobao.infoflow.protocol.engine.invoke.biz.d;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.infoflow.protocol.engine.invoke.biz.f;
import com.taobao.infoflow.protocol.engine.invoke.biz.g;
import com.taobao.infoflow.protocol.engine.invoke.biz.h;
import com.taobao.infoflow.protocol.engine.invoke.biz.i;
import com.taobao.infoflow.protocol.engine.invoke.biz.j;
import com.taobao.infoflow.protocol.engine.invoke.biz.k;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.infoflow.protocol.subservice.biz.ISceneService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.uc.webview.export.media.MessageID;
import tb.ept;
import tb.kge;
import tb.krs;
import tb.ldf;
import tb.lgu;
import tb.lgv;
import tb.lgw;
import tb.lgx;
import tb.lgy;
import tb.lgz;
import tb.lha;
import tb.lhb;
import tb.lhc;
import tb.ljs;
import tb.ljy;
import tb.tmu;

/* loaded from: classes.dex */
public class SceneServiceImpl implements ISceneService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SceneService";
    private lgu mContainerInvoker;
    private c mGlobalThemeInvoker;
    private ljs mInfoFlowContext;
    private IMainLifecycleService mMainLifecycleService;
    private d mMulticlassTabInvoker;
    private f mOutLinkInvoker;
    private tmu mPassParamsInvoker;
    private g mPopInvoker;
    private h mPullDownRefreshInvoker;
    private j mRocketInvoker;
    private k mTopViewInvoker;
    private l mUtInvoker;

    static {
        kge.a(-1913128855);
        kge.a(1805872243);
    }

    @Override // tb.lkj
    public e getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3391ad3", new Object[]{this});
        }
        return null;
    }

    public i getRequestParamsInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("b6e76237", new Object[]{this});
        }
        return null;
    }

    @Override // tb.lld
    public void onPageScrolled(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        ldf.d("SceneService", "onCreateService");
        this.mInfoFlowContext = ljsVar;
        this.mMainLifecycleService = (IMainLifecycleService) ljsVar.a(IMainLifecycleService.class);
        this.mContainerInvoker = new lgu(ljsVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            ldf.d("SceneService", "onDestroyService");
        }
    }

    @Override // tb.llb
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        ldf.d("SceneService", "onNewIntent");
        this.mMainLifecycleService.onNewIntent(intent);
    }

    @Override // tb.llb
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onStart");
        this.mMainLifecycleService.onStart();
    }

    @Override // tb.llb
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onRestart");
        this.mMainLifecycleService.onRestart();
    }

    @Override // tb.llb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onResume");
        this.mMainLifecycleService.onResume();
    }

    @Override // tb.llb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onPause");
        this.mMainLifecycleService.onPause();
    }

    @Override // tb.llb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        ldf.d("SceneService", MessageID.onStop);
        this.mMainLifecycleService.onStop();
    }

    @Override // tb.llb
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onColdStartResume");
        this.mMainLifecycleService.onColdStartResume();
    }

    @Override // tb.llb
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onWillExit");
        this.mMainLifecycleService.onWillExit();
    }

    @Override // tb.llb
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onDestroyView");
        this.mMainLifecycleService.onDestroyView();
        IContainerService iContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        if (iContainerService == null) {
            return;
        }
        iContainerService.destroyContainer();
    }

    @Override // tb.llb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ldf.d("SceneService", MessageID.onDestroy);
        this.mMainLifecycleService.onDestroy();
    }

    @Override // tb.llb
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.mMainLifecycleService.onActivityResult(i, i2, intent);
        }
    }

    @Override // tb.lko
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onAppToBackground");
        this.mMainLifecycleService.onAppToBackground();
    }

    @Override // tb.lko
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onAppToFront");
        this.mMainLifecycleService.onAppToFront();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, android.view.ViewGroup] */
    @Override // com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        ldf.d("SceneService", ept.SUB_CREATE_VIEW);
        IContainerService iContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        if (iContainerService == null) {
            throw new IllegalArgumentException("SceneService, createView containerService is null");
        }
        return iContainerService.mo1092createContainer(context);
    }

    @Override // tb.lld
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onPageSelected");
        this.mMainLifecycleService.onPageSelected();
        syncStatusToHost(this.mInfoFlowContext);
    }

    @Override // tb.lld
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        ldf.d("SceneService", "onPageUnSelected");
        this.mMainLifecycleService.onPageUnSelected();
    }

    @Override // tb.lkj
    public b getContainerInvoker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fe95b7ea", new Object[]{this}) : this.mContainerInvoker;
    }

    @Override // tb.lkj
    public h getPullDownRefreshInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("cb98e77", new Object[]{this});
        }
        if (this.mPullDownRefreshInvoker == null) {
            this.mPullDownRefreshInvoker = new lgz(this.mInfoFlowContext);
        }
        return this.mPullDownRefreshInvoker;
    }

    @Override // tb.lkj
    public j getRocketInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("f071c461", new Object[]{this});
        }
        if (this.mRocketInvoker == null) {
            this.mRocketInvoker = new lha(this.mInfoFlowContext);
        }
        return this.mRocketInvoker;
    }

    @Override // tb.lkj
    public l getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("6541bcea", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new lhc(this.mInfoFlowContext);
        }
        return this.mUtInvoker;
    }

    @Override // tb.lkj
    public c getGlobalThemeInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9859236e", new Object[]{this});
        }
        if (this.mGlobalThemeInvoker == null) {
            this.mGlobalThemeInvoker = new lgv(this.mInfoFlowContext);
        }
        return this.mGlobalThemeInvoker;
    }

    @Override // tb.lkj
    public d getMulticlassTabInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("bfefc85d", new Object[]{this});
        }
        if (this.mMulticlassTabInvoker == null) {
            this.mMulticlassTabInvoker = new lgw(this.mInfoFlowContext);
        }
        return this.mMulticlassTabInvoker;
    }

    @Override // tb.lkj
    public f getOutLinkInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("c706464d", new Object[]{this});
        }
        if (this.mOutLinkInvoker == null) {
            this.mOutLinkInvoker = new lgx(this.mInfoFlowContext);
        }
        return this.mOutLinkInvoker;
    }

    @Override // tb.lkj
    public g getPopInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("cee405d5", new Object[]{this});
        }
        if (this.mPopInvoker == null) {
            this.mPopInvoker = new lgy(this.mInfoFlowContext);
        }
        return this.mPopInvoker;
    }

    @Override // tb.lkj
    public k getTopViewInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("d4ce611a", new Object[]{this});
        }
        if (this.mTopViewInvoker == null) {
            this.mTopViewInvoker = new lhb(this.mInfoFlowContext);
        }
        return this.mTopViewInvoker;
    }

    @Override // tb.lkj
    public tmu getPassParamsInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tmu) ipChange.ipc$dispatch("dcc67f16", new Object[]{this});
        }
        if (this.mPassParamsInvoker == null) {
            this.mPassParamsInvoker = new krs(this.mInfoFlowContext);
        }
        return this.mPassParamsInvoker;
    }

    public JSONObject invoke(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f3213a27", new Object[]{this, str, jSONObject});
        }
        ldf.d("SceneService", "invoke, action : " + str);
        return null;
    }

    private void syncStatusToHost(ljs ljsVar) {
        ljy f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb2a4b2", new Object[]{this, ljsVar});
            return;
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService == null || (f = iHostService.getInvokeCallback().f()) == null) {
            return;
        }
        f.a(isReachTop(ljsVar));
    }

    private boolean isReachTop(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39ab952", new Object[]{this, ljsVar})).booleanValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.isReachTopEdge();
        }
        return true;
    }
}
