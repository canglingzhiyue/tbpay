package com.taobao.oversea.homepage.dynamictab.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.protocol.b;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.infoflow.protocol.engine.invoke.biz.e;
import com.taobao.infoflow.protocol.engine.invoke.biz.j;
import com.taobao.infoflow.protocol.engine.invoke.biz.l;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.uikit.extend.component.TBErrorView;
import mtopsdk.mtop.util.ErrorConstant;
import tb.cvd;
import tb.fft;
import tb.lbq;
import tb.ldf;
import tb.ljs;
import tb.lkb;
import tb.nde;
import tb.oiy;
import tb.pro;

/* loaded from: classes7.dex */
public class DynamicSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_BIZ_TYPE = "HomeDynamic";
    private static final String TAG = "DynamicSceneService";
    private ljs mInfoFlowContext;
    private l mUtInvoker;
    private e naviBarInvoker;
    private cvd rocketInvoker;
    private FrameLayout rootView;
    private TMSEmbed themisIns;
    private String currentUrl = "";
    private final int THEMIS_ID = 999;
    private boolean isPageSelected = false;
    private BroadcastReceiver loginReceiver = new BroadcastReceiver() { // from class: com.taobao.oversea.homepage.dynamictab.service.DynamicSceneService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || pro.e(intent.getAction())) {
            } else {
                try {
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    if (valueOf != LoginAction.NOTIFY_LOGIN_SUCCESS && valueOf != LoginAction.NOTIFY_LOGOUT) {
                        return;
                    }
                    DynamicSceneService.access$000(DynamicSceneService.this);
                } catch (Exception e) {
                    Log.e(DynamicSceneService.TAG, "mReceiver exp. Action: " + intent.getAction(), e);
                }
            }
        }
    };

    public static /* synthetic */ Object ipc$super(DynamicSceneService dynamicSceneService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -827603812:
                super.onCreateService((ljs) objArr[0]);
                return null;
            case 151698896:
                super.onPageSelected();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 497921929:
                super.onPageUnSelected();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1997193377:
                super.onDestroyService();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(DynamicSceneService dynamicSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccce4dd7", new Object[]{dynamicSceneService});
        } else {
            dynamicSceneService.reloadPage();
        }
    }

    public static /* synthetic */ boolean access$100(DynamicSceneService dynamicSceneService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c789c", new Object[]{dynamicSceneService})).booleanValue() : dynamicSceneService.isPageSelected;
    }

    public static /* synthetic */ void access$200(DynamicSceneService dynamicSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342aa359", new Object[]{dynamicSceneService});
        } else {
            dynamicSceneService.dataProcess();
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
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.loginReceiver);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        if (this.rootView == null) {
            this.rootView = new FrameLayout(context);
        }
        initThemis();
        return this.rootView;
    }

    private void initThemis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1d62fd", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed != null) {
            tMSEmbed.c();
        }
        lbq b = oiy.a().b();
        if (b == null) {
            return;
        }
        this.themisIns = new TMSEmbed(b.getCurActivity(), TMSEmbedSolutionType.WEB_SINGLE_PAGE);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.llb
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed != null) {
            tMSEmbed.f();
        }
        this.isPageSelected = true;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.llb
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.g();
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.llb
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.isPageSelected = false;
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.e();
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lld
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        this.isPageSelected = true;
        dataProcess();
        if (!StringUtils.isEmpty(this.currentUrl) && this.themisIns != null) {
            if (this.rootView.findViewById(999) != null) {
                this.themisIns.h();
                return;
            } else {
                addThemisVIew();
                return;
            }
        }
        this.rootView.removeAllViews();
        FrameLayout frameLayout = this.rootView;
        frameLayout.addView(createErrorView(frameLayout));
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lld
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        super.onPageUnSelected();
        this.isPageSelected = false;
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed == null) {
            return;
        }
        tMSEmbed.i();
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        super.onDestroyService();
        this.isPageSelected = false;
        LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.loginReceiver);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public j getRocketInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("f071c461", new Object[]{this});
        }
        if (this.rocketInvoker == null) {
            this.rocketInvoker = new cvd(this.mInfoFlowContext);
            this.rocketInvoker.a(new cvd.a() { // from class: com.taobao.oversea.homepage.dynamictab.service.DynamicSceneService.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.cvd.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        DynamicSceneService.access$000(DynamicSceneService.this);
                    }
                }
            });
        }
        return this.rocketInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public e getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3391ad3", new Object[]{this});
        }
        if (this.naviBarInvoker == null) {
            this.naviBarInvoker = new e() { // from class: com.taobao.oversea.homepage.dynamictab.service.DynamicSceneService.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.engine.invoke.biz.e
                public JSONObject a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this});
                    }
                    if (!DynamicSceneService.access$100(DynamicSceneService.this)) {
                        return null;
                    }
                    DynamicSceneService.access$200(DynamicSceneService.this);
                    return null;
                }
            };
        }
        return this.naviBarInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, tb.lkj
    public l getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("6541bcea", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new fft(this.mInfoFlowContext);
        }
        return this.mUtInvoker;
    }

    private void dataProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd6fd6c", new Object[]{this});
            return;
        }
        lkb a2 = nde.a(this.mInfoFlowContext);
        if (a2 == null) {
            ldf.d(TAG, "naviBarCallback == null");
            return;
        }
        JSONObject c = a2.c();
        if (c == null) {
            return;
        }
        JSONObject jSONObject = c.getJSONObject("ext");
        String string = jSONObject.getString("innerPageUrl");
        String string2 = jSONObject.getString("tabType");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        if ((!TMSCalendarBridge.namespace.equals(string2) && !b.PROTOCOL_BIZ_CODE_PHA.equals(string2)) || string.equals(this.currentUrl)) {
            return;
        }
        initThemis();
        this.currentUrl = string;
        WebStartParams webStartParams = new WebStartParams();
        webStartParams.setUrl(this.currentUrl);
        this.themisIns.a(webStartParams);
        addThemisVIew();
    }

    private void addThemisVIew() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a995f3", new Object[]{this});
        } else if (this.themisIns == null || (frameLayout = this.rootView) == null) {
        } else {
            View findViewById = frameLayout.findViewById(999);
            if (findViewById != null) {
                this.rootView.removeView(findViewById);
            }
            View b = this.themisIns.b();
            b.setId(999);
            this.themisIns.a();
            this.rootView.addView(b);
        }
    }

    private void reloadPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e22444f", new Object[]{this});
        } else if (this.themisIns == null || StringUtils.isEmpty(this.currentUrl)) {
        } else {
            WebStartParams webStartParams = new WebStartParams();
            webStartParams.setUrl(this.currentUrl);
            this.themisIns.a(webStartParams, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        }
    }

    private TBErrorView createErrorView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("ea8dc90", new Object[]{this, viewGroup});
        }
        TBErrorView tBErrorView = new TBErrorView(viewGroup.getContext());
        tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
        tBErrorView.setSubTitle("别紧张，试试看刷新页面~");
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return tBErrorView;
    }
}
