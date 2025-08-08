package com.alipay.android.msp.core.clients;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.v4.util.Pair;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.app.birdnest.api.OnFrameTplEventListener;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.render.api.result.MspPrepareResult;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.drm.TemplateChangeMonitor;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter;
import com.alipay.android.msp.framework.perf.ThreadController;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.ClientEndCode;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.model.StEventForRenderFinish;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.plugin.ITemplateLoadedCallback;
import com.alipay.android.msp.plugin.RenderConfig;
import com.alipay.android.msp.plugin.RenderTime;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.ui.base.keyboard.KeyboardManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.contracts.MspMainContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.ui.views.MspContainerActivity;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogAgent;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.session.standalone.model.PrepareResult;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.taobao.android.dinamicx.s;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.nom;
import tb.tbt;

/* loaded from: classes3.dex */
public class MspWindowClient extends MspUIClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f4509a;
    private Context b;
    private boolean c;
    private MspContainerPresenter d;
    private MspWindowFrame e;
    private MspWindowFrame f;
    private Activity g;
    private Activity h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private final Object o;
    private final FlybirdRenderIntercepter p;
    private boolean q;
    private volatile boolean r;
    private OnFrameTplEventListener s;
    private boolean t;
    private boolean u;
    private final StEvent v;
    private volatile long w;

    public static /* synthetic */ Object ipc$super(MspWindowClient mspWindowClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(MspWindowClient mspWindowClient, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e00e64", new Object[]{mspWindowClient, new Long(j)});
        } else {
            mspWindowClient.a(j);
        }
    }

    public static /* synthetic */ void access$100(MspWindowClient mspWindowClient, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874e545a", new Object[]{mspWindowClient, str, new Integer(i)});
        } else {
            mspWindowClient.b(str, i);
        }
    }

    public static /* synthetic */ void access$1000(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b06691", new Object[]{mspWindowClient});
        } else {
            mspWindowClient.a();
        }
    }

    public static /* synthetic */ void access$1200(MspContext mspContext, PreparedResult preparedResult, RenderTime renderTime, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d89da8", new Object[]{mspContext, preparedResult, renderTime, new Boolean(z)});
        } else {
            a(mspContext, preparedResult, renderTime, z);
        }
    }

    public static /* synthetic */ boolean access$1500(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5ec35f70", new Object[]{mspWindowClient})).booleanValue() : mspWindowClient.q;
    }

    public static /* synthetic */ boolean access$1602(MspWindowClient mspWindowClient, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("558a7aef", new Object[]{mspWindowClient, new Boolean(z)})).booleanValue();
        }
        mspWindowClient.r = z;
        return z;
    }

    public static /* synthetic */ long access$1700(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6acaf61e", new Object[]{mspWindowClient})).longValue() : mspWindowClient.w;
    }

    public static /* synthetic */ MspWindowFrame access$200(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWindowFrame) ipChange.ipc$dispatch("a977d1fe", new Object[]{mspWindowClient}) : mspWindowClient.f;
    }

    public static /* synthetic */ MspWindowFrame access$202(MspWindowClient mspWindowClient, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("851e5bba", new Object[]{mspWindowClient, mspWindowFrame});
        }
        mspWindowClient.f = mspWindowFrame;
        return mspWindowFrame;
    }

    public static /* synthetic */ void access$300(MspWindowClient mspWindowClient, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2b24c3", new Object[]{mspWindowClient, mspWindowFrame});
        } else {
            mspWindowClient.c(mspWindowFrame);
        }
    }

    public static /* synthetic */ OnFrameTplEventListener access$400(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnFrameTplEventListener) ipChange.ipc$dispatch("cdb71c2f", new Object[]{mspWindowClient}) : mspWindowClient.s;
    }

    public static /* synthetic */ boolean access$602(MspWindowClient mspWindowClient, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0da700", new Object[]{mspWindowClient, new Boolean(z)})).booleanValue();
        }
        mspWindowClient.u = z;
        return z;
    }

    public static /* synthetic */ MspContainerPresenter access$700(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContainerPresenter) ipChange.ipc$dispatch("96dd2180", new Object[]{mspWindowClient}) : mspWindowClient.d;
    }

    public static /* synthetic */ Context access$800(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("27872650", new Object[]{mspWindowClient}) : mspWindowClient.b;
    }

    public static /* synthetic */ void access$900(String str, MspContext mspContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cb0dca", new Object[]{str, mspContext, str2});
        } else {
            a(str, mspContext, str2);
        }
    }

    public MspWindowClient(MspContext mspContext) {
        super(mspContext);
        this.i = 0;
        this.l = false;
        this.m = false;
        this.o = new Object();
        this.r = true;
        this.q = false;
        this.u = true;
        this.t = true;
        this.v = new StEvent();
        this.b = mspContext.getContext();
        Context context = this.b;
        if (context != null) {
            this.f4509a = context.getPackageName();
        }
        this.p = new FlybirdRenderIntercepter();
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public boolean onWindowChanged(MspWindowFrame mspWindowFrame) {
        boolean startContainerPage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b8e9b96", new Object[]{this, mspWindowFrame})).booleanValue();
        }
        LogUtil.i("MspWindowClient", "onWindowChanged", mspWindowFrame.toString());
        UserFeedBackUtil.getInstance().setUserFeedBackTagByWindowFrame(mspWindowFrame);
        mspWindowFrame.setExecuted(false);
        this.e = mspWindowFrame;
        if (this.mMspContext != null && this.mMspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_PUSH");
        }
        try {
            int windowType = mspWindowFrame.getWindowType();
            if (windowType != 10) {
                if (windowType == 11) {
                    if (this.d != null) {
                        this.mCurrentPresenter = this.d;
                    } else {
                        startContainerPage();
                    }
                }
                startContainerPage = true;
            } else {
                startContainerPage = startContainerPage();
            }
            if (this.mCurrentPresenter != null) {
                a(mspWindowFrame);
                return true;
            }
            LogUtil.i("MspWindowClient", "onWindowChanged", "mCurrentPresenter=null");
            return startContainerPage;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    public boolean startContainerPage() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6632f9", new Object[]{this})).booleanValue();
        }
        String canonicalName = MspContainerActivity.class.getCanonicalName();
        if (this.mMspContext instanceof MspContainerContext) {
            canonicalName = (!this.mMspContext.isMspBgTransparent() || this.mMspContext.isBizAppCollectMoneyPage) ? "com.alipay.android.msp.ui.views.MspUniRenderActivity" : MspContainerActivity.class.getCanonicalName();
            if (this.mMspContext.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "ACTIVITY_START");
            }
        } else if (this.mMspContext instanceof MspTradeContext) {
            canonicalName = MspContainerActivity.class.getCanonicalName();
        }
        synchronized (this.o) {
            if (this.m) {
                return false;
            }
            if (!(this.mCurrentPresenter instanceof MspContainerPresenter)) {
                z = a(canonicalName, 0);
            }
            this.m = true;
            return z;
        }
    }

    private boolean a(final String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, str + " " + i);
        if (this.mMspContext == null) {
            return false;
        }
        getStartActivityEvent().onStatistic(StEvent.CURRENT_VIEW, i == 1 ? BizContext.KEY_SETTING_FILTER : "cashier");
        getStartActivityEvent().onStatistic("actionType", "native");
        getStartActivityEvent().onStatistic("action", "startActivity");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        IAlipayCallback alipayCallback = this.mMspContext.getAlipayCallback();
        IRemoteServiceCallback remoteCallback = this.mMspContext instanceof MspTradeContext ? ((MspTradeContext) this.mMspContext).getRemoteCallback() : null;
        if (remoteCallback != null) {
            try {
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                if (e instanceof NullPointerException) {
                    if (this.mMspContext != null) {
                        this.mMspContext.getStatisticInfo().addError(ErrorType.WARNING, "startActivityNPE", e);
                    }
                    return false;
                }
                if (this.mMspContext != null) {
                    this.mMspContext.getStatisticInfo().addError(ErrorType.WARNING, "startActivityEx", e);
                }
                if (remoteCallback != null) {
                    if (i == 0) {
                        this.n = true;
                    } else if (i == 1) {
                        this.j = true;
                    }
                }
                if (StringUtils.equals("Y", PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GRAY_START_ACTIVITY_ON_UI_THREAD))) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            MspWindowClient mspWindowClient = MspWindowClient.this;
                            MspWindowClient.access$100(mspWindowClient, str, mspWindowClient.mBizId);
                        }
                    }, true);
                    LogUtil.record(4, "msp", "MspWindowClient:startPage", "ex runOnUI defaultStart bizId=" + this.mBizId);
                } else {
                    b(str, this.mBizId);
                    LogUtil.record(4, "msp", "MspWindowClient:startPage", "ex  defaultStart bizId=" + this.mBizId);
                }
            }
            if (!this.mMspContext.isFromEntranceActivity()) {
                LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "remoteCallback!=null bizId=" + this.mBizId);
                a(elapsedRealtime);
                if ((Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && StringUtils.equals(str, MspContainerActivity.class.getCanonicalName())) {
                    this.k = true;
                    remoteCallback.startActivity(this.f4509a, "com.alipay.android.msp.ui.views.FullScreenBgActivity", this.mBizId, null);
                } else {
                    remoteCallback.startActivity(this.f4509a, str, this.mBizId, null);
                }
                return true;
            }
        }
        if (alipayCallback != null) {
            LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "alipayCallback!=null, bizId=" + this.mBizId);
            a(elapsedRealtime);
            alipayCallback.startActivity(this.f4509a, str, this.mBizId, null);
        } else if (StringUtils.equals("Y", PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GRAY_START_ACTIVITY_ON_UI_THREAD))) {
            LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "runOnUI defaultStart bizId=" + this.mBizId);
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspWindowClient.access$000(MspWindowClient.this, elapsedRealtime);
                    MspWindowClient mspWindowClient = MspWindowClient.this;
                    MspWindowClient.access$100(mspWindowClient, str, mspWindowClient.mBizId);
                }
            }, true);
        } else {
            LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "defaultStart bizId=" + this.mBizId);
            a(elapsedRealtime);
            b(str, this.mBizId);
        }
        return true;
    }

    private void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.f4509a, str);
        intent.putExtra(MspBaseActivity.KEY_ID, i);
        Activity currentTopActivity = PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity();
        if (currentTopActivity != null && !currentTopActivity.isFinishing()) {
            currentTopActivity.startActivity(intent);
            return;
        }
        if (!(this.b instanceof Activity)) {
            intent.setFlags(268435456);
            LogUtil.record(4, "MspWindowClient:defaultStartPage", "add flag newTask");
        }
        this.b.startActivity(intent);
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void onWindowLoaded(MspContext mspContext, MspBasePresenter mspBasePresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e226791e", new Object[]{this, mspContext, mspBasePresenter});
        } else if (mspContext == null || mspContext.getBizId() != this.mBizId) {
        } else {
            if (this.mCurrentPresenter != null && this.mCurrentPresenter.mo545getIView() != null) {
                this.mCurrentPresenter.mo545getIView().removeMaskView();
            }
            if (mspBasePresenter instanceof MspContainerPresenter) {
                this.d = (MspContainerPresenter) mspBasePresenter;
                this.mCurrentPresenter = mspBasePresenter;
            }
            if (mspContext.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "SET_PRESENTER");
            }
            try {
                if (this.mCurrentPresenter == null) {
                    return;
                }
                this.mMspContext.setContext(this.mCurrentPresenter.getActivity());
                this.b = this.mCurrentPresenter.getActivity();
                InvokeActionPlugin.addInvokeAPIFactory(this.b);
                this.mCurrentPresenter.registerInvokePlugin(this.mMspContext);
                try {
                    if (this.e != null && (this.mCurrentPresenter instanceof MspContainerPresenter) && this.e.getWindowType() != 11 && (this.mMspContext instanceof MspTradeContext)) {
                        if (this.mMspContext != null && this.mMspContext.isUpgradePreRendTpl()) {
                            if (this.mMspTradeContext.getContext() != null) {
                                MspRender.triggerPreRenderQUICKPAY(MspFlybirdDefine.FLYBIRD_HOME_TPL, this.mMspTradeContext.getContext().getApplicationContext());
                            }
                        } else {
                            PreRendManager.getInstance().preRendTpl(this.mCurrentPresenter.getActivity(), this.mBizId, "", null, "network");
                        }
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
                if (this.e != null && this.e.getWindowType() == 11 && this.mCurrentPresenter != null && !this.c && this.mCurrentPresenter.mo545getIView() != null && (this.mMspContext instanceof MspTradeContext)) {
                    this.mCurrentPresenter.mo545getIView().showLoadingView(new String[0]);
                    LogUtil.record(4, "phonecashiermsp#flybird", "MspUIClient.onWindowLoaded", "LauncherApplication startup : loading");
                }
                a(this.e);
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
        }
    }

    public void setPresenter(MspContext mspContext, MspContainerPresenter mspContainerPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf24ea6", new Object[]{this, mspContext, mspContainerPresenter});
        } else if (mspContext == null || mspContext.getBizId() != this.mBizId) {
        } else {
            this.d = mspContainerPresenter;
            this.mCurrentPresenter = mspContainerPresenter;
            this.mMspContext.setContext(this.mCurrentPresenter.getActivity());
            this.b = this.mCurrentPresenter.getActivity();
        }
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        SpmWrapper.onPageEnd(this.f, this.mBizId);
        getFrameStack().clearDataStack(false);
        disposeUI();
        if (this.mMspContext != null && !this.mMspContext.isFromWallet()) {
            LogUtil.record(4, "MspWindowClient.resetVidStartActivity", "setStartActivityContext:NULL");
            PhoneCashierMspEngine.getMspViSec().setStartActivityContext(null);
        }
        if (this.mH5PageItemMap == null) {
            return;
        }
        this.mH5PageItemMap.clear();
    }

    private void a(final MspWindowFrame mspWindowFrame) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53249ee", new Object[]{this, mspWindowFrame});
            return;
        }
        if (this.mMspContext != null && this.mMspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_START");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_CHANGED");
        }
        if (mspWindowFrame == null) {
            return;
        }
        if (mspWindowFrame.getWindowType() == 11 && this.d == null) {
            return;
        }
        synchronized (this) {
            if (mspWindowFrame.isExecuted()) {
                LogUtil.w("MspWindowClient", "onFrameDataChanged", "mspWindowFrame isExecuted: ".concat(String.valueOf(mspWindowFrame)));
                return;
            }
            mspWindowFrame.setExecuted(true);
            LogUtil.i("MspWindowClient", "onFrameDataChanged", mspWindowFrame.toString());
            if (this.mMspContext != null) {
                this.mMspContext.updateCurrentWinTpName(mspWindowFrame.getTplId());
            }
            StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
            if (statisticEvent != null) {
                statisticEvent.onStatistic(StEvent.CONVERT_TIME, "");
            }
            int windowType = mspWindowFrame.getWindowType();
            if (windowType == 10) {
                if (this.mCurrentPresenter != null) {
                    if (this.c || this.mCurrentPresenter.mo545getIView() == null) {
                        return;
                    }
                    this.mCurrentPresenter.mo545getIView().showLoadingView(new String[0]);
                    return;
                }
                this.mMspContext.exit(0);
            } else if (this.mMspContext != null) {
                if (this.mMspContext.getStoreCenter() != null) {
                    this.mMspContext.getStoreCenter().doCleanBeforeWindowChange(windowType);
                }
                this.c = true;
                if (this.mMspContext.isBizAppCollectMoneyPage) {
                    PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_CHANGED");
                }
                try {
                    if (this.mMspContext != null && this.u) {
                        PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "CASHIER_FIRST_LOAD");
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
                switch (windowType) {
                    case 11:
                        try {
                            if (this.mMspContext != null && !this.mMspContext.isFromWallet() && mspWindowFrame.isFirstTplFrame()) {
                                PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "CASHIER_SECOND_LOAD");
                            }
                        } catch (Exception e2) {
                            LogUtil.printExceptionStackTrace(e2);
                        }
                        try {
                            if (this.d == null) {
                                return;
                            }
                        } catch (Exception e3) {
                            LogUtil.printExceptionStackTrace(e3);
                        }
                        if (this.mMspContext != null && this.mMspContext.isBizAppCollectMoneyPage) {
                            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "RECEIVE_TPL");
                        }
                        mspWindowFrame.setFirstTplFrame(this.t);
                        this.t = false;
                        BroadcastUtil.sendFrameChangeBroadcast(this.b);
                        if (mspWindowFrame.getContentView() == null) {
                            final JSONObject templateContentData = mspWindowFrame.getTemplateContentData();
                            final String jSONObject = templateContentData == null ? "{}" : templateContentData.toString();
                            if (templateContentData != null && templateContentData.getBooleanValue(MspFlybirdDefine.FLYBIRD_FINGERPAY)) {
                                this.mMspContext.setFingerPay(true);
                            }
                            if (FlybirdUtil.isShowResultPage(mspWindowFrame.getTplId())) {
                                this.mMspContext.setFingerPay(false);
                                this.mMspContext.setHasShowResultPage(true);
                            }
                            if (!mspWindowFrame.isNoBack()) {
                                hidePrePageLoading();
                            }
                            final String tplId = mspWindowFrame.getTplId();
                            if (mspWindowFrame.isFirstTplFrame()) {
                                PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_REND");
                            }
                            this.e.setTplId(tplId);
                            if (this.p.intercept(this.b, mspWindowFrame, jSONObject, new FlybirdRenderIntercepter.IntercepterCallback() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.7
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter.IntercepterCallback
                                public void onEvent(String str) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("9589844c", new Object[]{this, str});
                                    } else {
                                        ActionsCreator.get(MspWindowClient.this.mMspContext).createDialogEventAction(str);
                                    }
                                }

                                @Override // com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter.IntercepterCallback
                                public void dismissLoading() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8c142d9", new Object[]{this});
                                        return;
                                    }
                                    if (MspWindowClient.this.mMspContext instanceof MspTradeContext) {
                                        ((MspTradeContext) MspWindowClient.this.mMspContext).setSubmitState(false);
                                    }
                                    try {
                                        MspWindowClient.this.getCurrentPresenter().mo545getIView().stopLoadingView();
                                        MspWindowClient.this.getCurrentPresenter().mo545getIView().removeMaskView();
                                    } catch (Exception e4) {
                                        LogUtil.printExceptionStackTrace(e4);
                                    }
                                }
                            })) {
                                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.8
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        try {
                                            MspWindowClient.access$300(MspWindowClient.this, mspWindowFrame);
                                        } catch (Throwable th) {
                                            LogUtil.printExceptionStackTrace(th);
                                        }
                                    }
                                });
                                hidePrePageLoading();
                                getFrameStack().popTopFrame(FlybirdRenderIntercepter.ERROR_TPL);
                                return;
                            }
                            Pair<PreparedResult, View> preloadedTpl = (this.mMspContext == null || !this.mMspContext.isUpgradePreRendTpl()) ? PreRendManager.getInstance().getPreloadedTpl(this.mMspContext, tplId, mspWindowFrame.getTplString()) : null;
                            final PreparedResult preparedResult = preloadedTpl != null ? preloadedTpl.first : null;
                            final View view = preloadedTpl != null ? preloadedTpl.second : null;
                            final IRenderCallback iRenderCallback = new IRenderCallback() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.9
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.alipay.android.msp.core.callback.IRenderCallback
                                public void onEvent(Object obj, String str) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("9d9ed8a8", new Object[]{this, obj, str});
                                        return;
                                    }
                                    EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("renderCallback.onEvent", str);
                                    if (createMspEventWithJsonString != null) {
                                        createMspEventWithJsonString.setSender(obj);
                                        createMspEventWithJsonString.setEventFrom("submit");
                                    }
                                    if (createMspEventWithJsonString != null && createMspEventWithJsonString.getMspEvents().length > 0) {
                                        EventAction.MspEvent mspEvent = createMspEventWithJsonString.getMspEvents()[0];
                                        if (MspWindowClient.access$400(MspWindowClient.this) != null) {
                                            boolean onInterceptTplEvent = MspWindowClient.access$400(MspWindowClient.this).onInterceptTplEvent(obj, str, mspEvent);
                                            LogUtil.i("MspWindowClient", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "mOnFrameTplEventListener: " + MspWindowClient.access$400(MspWindowClient.this).toString() + " intercept: " + onInterceptTplEvent);
                                            if (onInterceptTplEvent) {
                                                return;
                                            }
                                        }
                                    } else {
                                        LogUtil.e("MspWindowClient", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "eventAction null or events null");
                                    }
                                    ActionsCreator.get(MspWindowClient.this.mMspContext).createEventAction(createMspEventWithJsonString);
                                }

                                @Override // com.alipay.android.msp.core.callback.IRenderCallback
                                public void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("ea659cdf", new Object[]{this, iTemplateClickCallback, obj, str});
                                        return;
                                    }
                                    EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("renderCallback.onAsyncEvent", str);
                                    if (createMspEventWithJsonString == null) {
                                        return;
                                    }
                                    createMspEventWithJsonString.setSender(obj);
                                    createMspEventWithJsonString.setEventFrom("submit");
                                    createMspEventWithJsonString.setTemplateClickCallback(iTemplateClickCallback);
                                    ActionsCreator.get(MspWindowClient.this.mMspContext).createEventAction(createMspEventWithJsonString);
                                }
                            };
                            SpmWrapper.onPageEnd(this.f, this.mBizId);
                            try {
                                if (this.mMspContext != null && this.mMspContext.isBizAppCollectMoneyPage && this.mCurrentPresenter != null && this.mCurrentPresenter.mo545getIView() != null && tplId != null && tplId.startsWith("QUICKPAY@")) {
                                    FlybirdUtil.logStubFullLinkId(this.mCurrentPresenter.getActivity(), "flt_msp_load_".concat(String.valueOf(tplId.substring(9).replaceAll("-", ""))), "00000317");
                                }
                            } catch (Exception e4) {
                                LogUtil.printExceptionStackTrace(e4);
                            }
                            if (this.mMspContext != null && this.mMspContext.isBizAppCollectMoneyPage) {
                                PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "RECEIVE_TPL");
                            }
                            if (view != null) {
                                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.10
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        MspWindowClient.access$500(MspWindowClient.this, mspWindowFrame, tplId, view, preparedResult, templateContentData, jSONObject, iRenderCallback);
                                        MspWindowClient.access$602(MspWindowClient.this, false);
                                    }
                                });
                                return;
                            }
                            LogUtil.record(1, "MspWindowClient:onFrameDataChanged", "preload null:".concat(String.valueOf(tplId)));
                            if (this.mMspContext == null || !this.mMspContext.isUpgradePreRendTpl()) {
                                PreRendManager.getInstance().appendPreloadStat(tplId, this.mBizId, false, this.b);
                            }
                            a(mspWindowFrame, jSONObject, iRenderCallback);
                            return;
                        }
                        StEvent statisticEvent2 = mspWindowFrame.getStatisticEvent();
                        if (statisticEvent2 != null) {
                            statisticEvent2.onStatistic(StEvent.PARSE_TIME, "");
                            statisticEvent2.onStatistic(StEvent.FILL_DATE_TIME, "");
                        }
                        LogUtil.record(2, "MspWindowClient:handleBackFrame", "mspContext=" + this.mMspContext + " , mCurrentPresenter=" + this.mCurrentPresenter);
                        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    PluginManager.getRender().callOnreload(mspWindowFrame.getContentView());
                                    LogUtil.record(2, "MspWindowClient:handleBackFrame", "mCurrentPresenter=" + MspWindowClient.this.mCurrentPresenter);
                                    if (MspWindowClient.this.mCurrentPresenter == null || MspWindowClient.this.mCurrentPresenter.mo545getIView() == null) {
                                        return;
                                    }
                                    KeyboardManager.getInstance().hideKeyboard(MspWindowClient.this.mCurrentPresenter.getActivity());
                                    SpmWrapper.onPageEnd(MspWindowClient.access$200(MspWindowClient.this), MspWindowClient.this.mBizId);
                                    SpmWrapper.onPageStart(mspWindowFrame, MspWindowClient.this.mBizId);
                                    if (MspWindowClient.this.mCurrentPresenter == null) {
                                        return;
                                    }
                                    MspBaseContract.IView mo545getIView = MspWindowClient.this.mCurrentPresenter.mo545getIView();
                                    if (mo545getIView != null) {
                                        mo545getIView.showContentView(mspWindowFrame.getContentView(), 0, mspWindowFrame);
                                    }
                                    MspWindowClient.access$202(MspWindowClient.this, mspWindowFrame);
                                } catch (Exception e5) {
                                    LogUtil.printExceptionStackTrace(e5);
                                    ExceptionUtils.sendUiMsgWhenException(MspWindowClient.this.mBizId, e5);
                                }
                            }
                        });
                        return;
                    case 12:
                        JSONObject windowData = mspWindowFrame.getWindowData();
                        if (windowData != null && this.mCurrentPresenter != null && this.mCurrentPresenter.mo545getIView() != null) {
                            final MspBaseContract.IView mo545getIView = this.mCurrentPresenter.mo545getIView();
                            if (!mspWindowFrame.isAjax()) {
                                hidePrePageLoading();
                            }
                            int i = 2000;
                            if (windowData.containsKey("time")) {
                                i = windowData.getIntValue("time");
                            }
                            String string = windowData.getString("msg");
                            String string2 = windowData.getString("img");
                            if ("wnd".equals(mspWindowFrame.getDataChannelValue())) {
                                if (getFrameStack().isMspWindowFrameHasCallback(getFrameStack().getTopTplFrame())) {
                                    EventAction eventAction = new EventAction(MspEventTypes.ACTION_STRING_SENDCHANNELDATA);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("type", (Object) "wnd");
                                    jSONObject2.put("data", (Object) windowData);
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("targetData", (Object) jSONObject2);
                                    eventAction.setActionParamsJson(jSONObject3);
                                    ActionsCreator.get(this.mMspContext).createEventAction(eventAction);
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if ((this.mMspContext instanceof MspTradeContext) && ((MspTradeContext) this.mMspContext).getMspPayResult().isSuccess() && getFrameStack().getTopTplFrame() != null) {
                                    String[] strArr = new String[4];
                                    strArr[0] = "pageId";
                                    strArr[1] = getFrameStack().getTopTplFrame().getTplId();
                                    strArr[2] = "action";
                                    strArr[3] = z ? "toast" : "tpl";
                                    EventLogUtil.logPayEvent("1010887", strArr);
                                }
                                z2 = z;
                            }
                            if (z2 && !StringUtils.isEmpty(string)) {
                                mo545getIView.showToastView(string, string2, i);
                            }
                            if (!mspWindowFrame.isAjax()) {
                                mo545getIView.stopLoadingView();
                            }
                            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.5
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (mspWindowFrame.isAjax()) {
                                    } else {
                                        mo545getIView.removeMaskView();
                                    }
                                }
                            }, i);
                            LogUtil.record(2, "MspWindowClient:onReceiveToast ", "msg=" + string + " ,delayTime=" + i);
                            if (windowData.containsKey("act")) {
                                a(windowData.getJSONObject("act"), mspWindowFrame, i, string);
                            } else if (windowData.containsKey(ActVideoSetting.ACT_VIDEO_SETTING)) {
                                JSONArray jSONArray = windowData.getJSONArray(ActVideoSetting.ACT_VIDEO_SETTING);
                                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                    a(jSONArray.getJSONObject(i2), mspWindowFrame, i, string);
                                }
                            }
                        }
                        try {
                            if (this.mMspContext != null && !this.mMspContext.isFromWallet() && this.u) {
                                FlybirdUtil.endSpider(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
                            }
                            if (this.u) {
                                ThreadController.end(ThreadController.CASHIER_SIGN, ThreadController.CASHIER_TRANS_ACTIVITY, ThreadController.CASHIER_SERVICE_PAY, ThreadController.CASHIER_SCHEME_PAY);
                            }
                        } catch (Exception e5) {
                            LogUtil.printExceptionStackTrace(e5);
                        }
                        this.u = false;
                        return;
                    case 13:
                        b(mspWindowFrame);
                        try {
                            if (this.mMspContext != null && !this.mMspContext.isFromWallet() && this.u) {
                                FlybirdUtil.endSpider(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
                            }
                            if (this.u) {
                                ThreadController.end(ThreadController.CASHIER_SIGN, ThreadController.CASHIER_TRANS_ACTIVITY, ThreadController.CASHIER_SERVICE_PAY, ThreadController.CASHIER_SCHEME_PAY);
                            }
                        } catch (Exception e6) {
                            LogUtil.printExceptionStackTrace(e6);
                        }
                        this.u = false;
                        return;
                    case 14:
                        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    if (MspWindowClient.this.mCurrentPresenter == null || MspWindowClient.this.mCurrentPresenter.mo545getIView() == null) {
                                        return;
                                    }
                                    MspWindowClient.this.mCurrentPresenter.mo545getIView().showContentView(null, 0, mspWindowFrame);
                                } catch (Exception e7) {
                                    LogUtil.printExceptionStackTrace(e7);
                                }
                            }
                        });
                        if (this.u) {
                            ThreadController.end(ThreadController.CASHIER_SIGN, ThreadController.CASHIER_TRANS_ACTIVITY, ThreadController.CASHIER_SERVICE_PAY, ThreadController.CASHIER_SCHEME_PAY);
                        }
                        this.u = false;
                        return;
                    default:
                        return;
                }
            }
        }
    }

    private void a(JSONObject jSONObject, MspWindowFrame mspWindowFrame, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1d4a3f", new Object[]{this, jSONObject, mspWindowFrame, new Integer(i), str});
            return;
        }
        String string = jSONObject != null ? jSONObject.getString("name") : "";
        StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
        if (statisticEvent != null) {
            statisticEvent.onStatistic(StEvent.PARSE_TIME, "");
            statisticEvent.onStatistic(StEvent.FILL_DATE_TIME, "");
            statisticEvent.onStatistic(StEvent.SHOW_TIME, "");
            if (StringUtils.isEmpty(str)) {
                statisticEvent.onStatistic(StEvent.SHOW_WIN, "tst|" + Utils.truncateString(string, 30));
            } else {
                statisticEvent.onStatistic(StEvent.SHOW_WIN, "tst|" + Utils.truncateString(string, 30) + "|" + Utils.truncateString(str, 30));
            }
        }
        if (jSONObject != null && jSONObject.toString().length() > 2) {
            EventAction createMspEvent = MspEventCreator.get().createMspEvent("MspWindowClient.handleTstAction", jSONObject);
            if (createMspEvent != null) {
                createMspEvent.setAjax(mspWindowFrame.isAjax());
                createMspEvent.setDelayTime(i);
                ActionsCreator.get(this.mMspContext).createEventAction(createMspEvent);
                return;
            }
            LogUtil.e("MspWindowClient", "onToast", "toastEventAction = null");
            return;
        }
        LogUtil.e("MspWindowClient", "onToast", "action = null");
    }

    private void b(MspWindowFrame mspWindowFrame) {
        MspBaseContract.IView mo545getIView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de869f2f", new Object[]{this, mspWindowFrame});
            return;
        }
        hidePrePageLoading();
        JSONObject windowData = mspWindowFrame.getWindowData();
        if (windowData == null) {
            return;
        }
        String string = windowData.getString("msg");
        JSONArray jSONArray = windowData.getJSONArray("btns");
        if (jSONArray == null || jSONArray.size() <= 0) {
            return;
        }
        StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
        if (statisticEvent != null) {
            statisticEvent.onStatistic(StEvent.PARSE_TIME, "");
            statisticEvent.onStatistic(StEvent.FILL_DATE_TIME, "");
            statisticEvent.onStatistic(StEvent.SHOW_TIME, "");
            statisticEvent.onStatistic(StEvent.SHOW_WIN, "dlg|" + Utils.truncateString(string, 30));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            MspDialogButton mspDialogButton = new MspDialogButton();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            mspDialogButton.mText = jSONObject.getString("txt");
            mspDialogButton.mEventAction = MspEventCreator.get().createMspEvent("MspWindowClient.onReceiveDialog", jSONObject.getJSONObject("act"));
            arrayList.add(mspDialogButton);
        }
        if (this.mCurrentPresenter == null || (mo545getIView = this.mCurrentPresenter.mo545getIView()) == null) {
            return;
        }
        mo545getIView.showDialogView("", string, arrayList);
    }

    private static void a(String str, MspContext mspContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723bb972", new Object[]{str, mspContext, str2});
        } else if (mspContext == null || StringUtils.isEmpty(str2)) {
        } else {
            if (str2.contains("@")) {
                str = str + "_" + str2.split("@")[0];
            }
            if (str.contains("OPENBOX")) {
                mspContext.getStatisticInfo().addError("np", str, str2);
            } else {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, str, str2);
            }
        }
    }

    private void c(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7daf470", new Object[]{this, mspWindowFrame});
        } else if (isVidActivityVisible()) {
            LogUtil.record(1, "MspWindowClient:finishVidActivity", "sendExitVidBroadcast");
            BroadcastUtil.sendExitVidBroadcast(this.b);
        } else if (mspWindowFrame.getTplId() == null) {
        } else {
            Activity activity = this.h;
            if (activity != null && !activity.isFinishing()) {
                LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isFirstVidActivityVisible", "true");
                z = true;
            } else {
                LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isFirstVidActivityVisible", "false");
            }
            if (!z) {
                return;
            }
            LogUtil.record(1, "MspWindowClient:finishVidActivity", "finishFirstVidActivity");
            Activity activity2 = this.h;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            this.h.finish();
            LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.finishFirstVidActivity", "true");
        }
    }

    /* renamed from: com.alipay.android.msp.core.clients.MspWindowClient$12  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass12 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MspWindowFrame f4512a;
        public final /* synthetic */ String b;
        public final /* synthetic */ IRenderCallback c;
        private RenderTime e = new RenderTime();

        public AnonymousClass12(MspWindowFrame mspWindowFrame, String str, IRenderCallback iRenderCallback) {
            this.f4512a = mspWindowFrame;
            this.b = str;
            this.c = iRenderCallback;
        }

        public static /* synthetic */ RenderTime a(AnonymousClass12 anonymousClass12) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RenderTime) ipChange.ipc$dispatch("ce30fe46", new Object[]{anonymousClass12}) : anonymousClass12.e;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            final String tplId = this.f4512a.getTplId();
            if (MspWindowClient.this.mMspContext != null && MspWindowClient.this.mMspContext.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_REND");
            }
            final MspContainerPresenter access$700 = MspWindowClient.access$700(MspWindowClient.this);
            if (access$700 == null) {
                return;
            }
            try {
                if (MspWindowClient.this.mCurrentPresenter != null && MspWindowClient.this.mCurrentPresenter.mo545getIView() != null) {
                    RenderConfig templateLoadedCallback = new RenderConfig(false).setTemplateLoadedCallback(new ITemplateLoadedCallback() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.12.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.msp.plugin.ITemplateLoadedCallback
                        public void onTemplateLoaded() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e7f9b265", new Object[]{this});
                                return;
                            }
                            try {
                                MspWindowClient.this.hidePrePageLoading();
                                MspWindowClient.access$700(MspWindowClient.this).mo545getIView().stopDefaultLoadingCountDown();
                            } catch (Exception e) {
                                LogUtil.printExceptionStackTrace(e);
                            }
                        }

                        @Override // com.alipay.android.msp.plugin.ITemplateLoadedCallback
                        public boolean onNewBnDeployAskingUserShouldContinue() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ((Boolean) ipChange2.ipc$dispatch("761ff92d", new Object[]{this})).booleanValue();
                            }
                            final MspContext mspContext = MspWindowClient.this.mMspContext;
                            if (mspContext == null) {
                                return false;
                            }
                            final boolean[] zArr = {false};
                            final ConditionVariable conditionVariable = new ConditionVariable();
                            final ArrayList arrayList = new ArrayList(2);
                            arrayList.add(new FlybirdDialogEventDesc(LanguageHelper.localizedStringForKey("mini_cancel", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_cancel), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.12.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    ActionsCreator.get(mspContext).createEventAction(new EventAction("exit"));
                                    zArr[0] = false;
                                    conditionVariable.open();
                                }
                            }));
                            arrayList.add(new FlybirdDialogEventDesc(LanguageHelper.localizedStringForKey("mini_redo", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_redo), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.12.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                        return;
                                    }
                                    zArr[0] = true;
                                    conditionVariable.open();
                                }
                            }));
                            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.12.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    MspContext mspContext2 = mspContext;
                                    String endCode = mspContext2 instanceof MspTradeContext ? ((MspTradeContext) mspContext2).getMspPayResult().getEndCode() : "";
                                    FlybirdDialogImpl.showDialog(MspWindowClient.access$800(MspWindowClient.this), null, ("6001".equals(endCode) || "6002".equals(endCode) || StringUtils.isEmpty(endCode)) ? LanguageHelper.localizedStringForKey("mini_net_error_weak", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_net_error_weak), new Object[0]) : LanguageHelper.localizedStringForKey("mini_net_error", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_net_error), new Object[0]), arrayList);
                                }
                            });
                            conditionVariable.block();
                            return zArr[0];
                        }
                    });
                    templateLoadedCallback.setRenderTime(this.e);
                    if (MspWindowClient.this.mMspContext.isUpgradePreRendTpl()) {
                        obj = PluginManager.getRender().preloadViewNew(access$700.getActivity(), MspWindowClient.this.mBizId, this.f4512a.getTplId(), this.f4512a.getTplString(), this.b, this.f4512a.getStartupParams(), this.f4512a.getSceneParams(), this.c, templateLoadedCallback);
                    } else {
                        obj = PluginManager.getRender().preloadView(access$700.getActivity(), MspWindowClient.this.mBizId, this.f4512a.getTplId(), this.f4512a.getTplString(), this.b, this.f4512a.getStartupParams(), this.f4512a.getSceneParams(), this.c, templateLoadedCallback);
                    }
                } else if (MspWindowClient.this.mMspContext == null || !MspWindowClient.this.mMspContext.isExit()) {
                    throw new AppErrorException("curP is null");
                } else {
                    obj = null;
                }
                if (MspWindowClient.this.mMspContext != null && MspWindowClient.this.mMspContext.isBizAppCollectMoneyPage) {
                    PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_REND");
                }
                LogUtil.record(1, "MspWindowClient:nonPreRendTpl", "buildFBDocumentTime=" + (SystemClock.elapsedRealtime() - elapsedRealtime) + ", threadMillis: " + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                final StEvent statisticEvent = this.f4512a.getStatisticEvent();
                if (statisticEvent != null) {
                    statisticEvent.onStatistic(StEvent.PARSE_TIME, "");
                }
                if (MspWindowClient.this.mMspContext != null && MspWindowClient.this.mMspContext.isBizAppCollectMoneyPage) {
                    PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_START");
                }
                if (obj != null) {
                    final Object obj2 = obj;
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.12.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                if (MspWindowClient.this.mMspContext != null && MspWindowClient.this.mMspContext.isBizAppCollectMoneyPage) {
                                    PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_START");
                                    PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_DO");
                                }
                                MspWindowClient.access$1000(MspWindowClient.this);
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                                MspWindowClient.access$900("renderGenFail", MspWindowClient.this.mMspContext, tplId);
                                if (MspWindowClient.this.mMspWindowLoadListener != null) {
                                    LogUtil.record(4, "onWindowLoadFail", "BIRD_NEST_GENERATE_ERROR，loadListener" + MspWindowClient.this.mMspWindowLoadListener);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("mspBizId", MspWindowClient.this.mBizId);
                                    MspWindowClient.this.mMspWindowLoadListener.onWindowLoadFail(2, bundle);
                                } else {
                                    ExceptionUtils.sendUiMsgWhenException(MspWindowClient.this.mBizId, th);
                                }
                                BroadcastUtil.sendRendPageResultToSource(MspWindowClient.this.mFailNotifyName, MspWindowClient.access$800(MspWindowClient.this), MspWindowClient.this.mBizId);
                            }
                            if (access$700.mo545getIView() == null) {
                                return;
                            }
                            View generateViewWithPrepareResult = MspWindowClient.this.mMspContext.isUpgradePreRendTpl() ? PluginManager.getRender().generateViewWithPrepareResult(access$700.getActivity(), MspWindowClient.this.mBizId, obj2) : PluginManager.getRender().generateView(access$700.getActivity(), MspWindowClient.this.mBizId, obj2);
                            if (generateViewWithPrepareResult == null) {
                                throw new Exception("contentView is null");
                            }
                            if (obj2 instanceof PreparedResult) {
                                MspWindowClient.access$1200(MspWindowClient.this.mMspContext, (PreparedResult) obj2, AnonymousClass12.a(AnonymousClass12.this), false);
                            } else if (obj2 instanceof MspPrepareResult) {
                                if (((MspPrepareResult) obj2).getPrepareResult() != null) {
                                    MspRender.appendPreloadStat(tplId, MspWindowClient.this.mMspContext, ((MspPrepareResult) obj2).getPrepareResult().isReusedFromPrerender());
                                }
                                MspWindowClient.access$1300(MspWindowClient.this.mMspContext, (MspPrepareResult) obj2, AnonymousClass12.a(AnonymousClass12.this));
                            }
                            if (MspWindowClient.this.mMspContext != null && MspWindowClient.this.mMspContext.isBizAppCollectMoneyPage) {
                                PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_DO");
                            }
                            if (statisticEvent != null) {
                                statisticEvent.onStatistic(StEvent.FILL_DATE_TIME, "");
                            }
                            MspWindowClient.access$1400(MspWindowClient.this, generateViewWithPrepareResult, AnonymousClass12.this.f4512a, tplId);
                            AnonymousClass12.this.f4512a.setIsPreLoadView(false);
                            if (!FlybirdUtil.isShowResultPage(AnonymousClass12.this.f4512a.getTplId())) {
                                return;
                            }
                            MspWindowClient.this.mMspContext.onRendResultPage(AnonymousClass12.this.f4512a.getTplId());
                        }
                    }, DrmManager.getInstance(MspWindowClient.access$800(MspWindowClient.this)).isGray(DrmKey.GRAY_POST_AT_FRONT, false, MspWindowClient.access$800(MspWindowClient.this)));
                } else {
                    if (MspWindowClient.this.mMspContext != null) {
                        StatisticInfo statisticInfo = MspWindowClient.this.mMspContext.getStatisticInfo();
                        statisticInfo.addError("ui", "preloadResultNull", "template_error:" + this.f4512a.getTplId());
                        StatisticInfo statisticInfo2 = MspWindowClient.this.mMspContext.getStatisticInfo();
                        Vector vector = Vector.Result;
                        StringBuilder sb = new StringBuilder();
                        sb.append(ClientEndCode.APPERROR_FLYBIRD);
                        statisticInfo2.updateAttr(vector, "clientEndCode", sb.toString());
                    }
                    if (MspWindowClient.this.mMspWindowLoadListener != null) {
                        LogUtil.record(4, "onWindowLoadFail", "BIRD_NEST_DOCUMENT_NULL，loadListener" + MspWindowClient.this.mMspWindowLoadListener);
                        Bundle bundle = new Bundle();
                        bundle.putInt("mspBizId", MspWindowClient.this.mBizId);
                        MspWindowClient.this.mMspWindowLoadListener.onWindowLoadFail(3, bundle);
                    } else if (access$700.mo545getIView() != null) {
                        ExceptionUtils.sendUiMsgWhenException(MspWindowClient.this.mBizId, new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("flybird_system_error", access$700.getActivity().getString(R.string.flybird_system_error), new Object[0]), 6)));
                    }
                    BroadcastUtil.sendRendPageResultToSource(MspWindowClient.this.mFailNotifyName, MspWindowClient.access$800(MspWindowClient.this), MspWindowClient.this.mBizId);
                }
                MspWindowClient.access$602(MspWindowClient.this, false);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                if (MspWindowClient.this.mMspContext != null) {
                    MspWindowClient.access$900("renderExFail", MspWindowClient.this.mMspContext, tplId);
                    StatisticInfo statisticInfo3 = MspWindowClient.this.mMspContext.getStatisticInfo();
                    Vector vector2 = Vector.Result;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ClientEndCode.APPERROR_FLYBIRD);
                    statisticInfo3.updateAttr(vector2, "clientEndCode", sb2.toString());
                }
                if (MspWindowClient.this.mMspWindowLoadListener != null) {
                    LogUtil.record(4, "onWindowLoadFail", "BIRD_NEST_CREATE_ERROR，loadListener" + MspWindowClient.this.mMspWindowLoadListener);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("mspBizId", MspWindowClient.this.mBizId);
                    MspWindowClient.this.mMspWindowLoadListener.onWindowLoadFail(1, bundle2);
                } else if (access$700.mo545getIView() != null) {
                    ExceptionUtils.sendUiMsgWhenException(MspWindowClient.this.mBizId, new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("mini_app_error", access$700.getActivity().getString(R.string.mini_app_error), new Object[0]), 6)));
                }
                BroadcastUtil.sendRendPageResultToSource(MspWindowClient.this.mFailNotifyName, MspWindowClient.access$800(MspWindowClient.this), MspWindowClient.this.mBizId);
                EventLogUtil.logPayEvent("1010546", "pageId", this.f4512a.getTplId(), UTConstant.Args.UT_PROPERTY_SUCCESS, "NO", "context", "res_delete");
            }
        }
    }

    private void a(MspWindowFrame mspWindowFrame, String str, IRenderCallback iRenderCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3105b9", new Object[]{this, mspWindowFrame, str, iRenderCallback});
        } else {
            TaskHelper.execute(new AnonymousClass12(mspWindowFrame, str, iRenderCallback));
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.mCurrentPresenter == null || this.mCurrentPresenter.mo545getIView() == null) {
                return;
            }
            KeyboardManager.getInstance().hideKeyboard(this.mCurrentPresenter.getActivity());
            View currentView = this.mCurrentPresenter.mo545getIView().getCurrentView();
            if (currentView == null) {
                return;
            }
            UIUtil.hideKeyboard(currentView.getWindowToken(), this.mCurrentPresenter.getActivity());
        } catch (Exception unused) {
        }
    }

    private void a(MspWindowFrame mspWindowFrame, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e31c24", new Object[]{this, mspWindowFrame, view});
            return;
        }
        this.f = mspWindowFrame;
        mspWindowFrame.setContentView(view);
        if (this.mMspContext instanceof MspTradeContext) {
            c(mspWindowFrame);
        }
        if (this.mMspContext == null) {
            return;
        }
        this.mMspContext.onRendFrameSuccess();
    }

    public void setFirstVidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bb240b", new Object[]{this, activity});
            return;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.setmFirstVidActivity", "");
        this.h = activity;
    }

    public void setVidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4a4397", new Object[]{this, activity});
            return;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.setVidActivity", "activity=".concat(String.valueOf(activity)));
        this.g = activity;
    }

    public boolean isVidActivityVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6cb67", new Object[]{this})).booleanValue();
        }
        Activity activity = this.g;
        if (activity != null && !activity.isFinishing()) {
            LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isVidActivityVisible", "true");
            return true;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isVidActivityVisible", "false");
        return false;
    }

    public Activity getVidActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("bf5d5ab7", new Object[]{this}) : this.g;
    }

    public boolean isVidExitMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871d5013", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.i);
        return StringUtils.equals(sb.toString(), "1");
    }

    public void setVidExitFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadd3e3", new Object[]{this, new Integer(i)});
            return;
        }
        LogUtil.record(4, "MspWindowClient:setmVidExitFlag", "vidExitFlag:" + i + " ,ctx=" + this.mMspContext);
        this.i = i;
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        LogUtil.record(2, "MspWindowClient:checkActivityStarted", "this=" + this + " , ctx=" + this.mMspContext);
        getStartActivityEvent().onStatistic(StEvent.CONVERT_TIME, String.valueOf(SystemClock.elapsedRealtime() - j));
        this.r = false;
        try {
            if (this.mMspContext instanceof MspTradeContext) {
                PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "ACTIVITY_START");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        Runnable runnable = new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r8 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.core.clients.MspWindowClient.AnonymousClass13.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L12
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    r1[r2] = r8
                    java.lang.String r2 = "5c510192"
                    r0.ipc$dispatch(r2, r1)
                    return
                L12:
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    boolean r0 = r0.hasActivityCreated
                    if (r0 != 0) goto Lcf
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspContext r0 = r0.mMspContext
                    if (r0 == 0) goto Lcf
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    boolean r0 = com.alipay.android.msp.core.clients.MspWindowClient.access$1500(r0)
                    if (r0 != 0) goto Lcf
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.clients.MspWindowClient.access$1602(r0, r3)
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.framework.statisticsv2.model.StEvent r0 = r0.getStartActivityEvent()
                    long r4 = android.os.SystemClock.elapsedRealtime()
                    com.alipay.android.msp.core.clients.MspWindowClient r1 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    long r6 = com.alipay.android.msp.core.clients.MspWindowClient.access$1700(r1)
                    long r4 = r4 - r6
                    java.lang.String r1 = java.lang.String.valueOf(r4)
                    java.lang.String r4 = "parseTime"
                    r0.onStatistic(r4, r1)
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspContext r0 = r0.mMspContext
                    com.alipay.android.msp.framework.statisticsv2.StatisticInfo r0 = r0.getStatisticInfo()
                    com.alipay.android.msp.core.clients.MspWindowClient r1 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.framework.statisticsv2.model.StEvent r1 = r1.getStartActivityEvent()
                    r0.addEvent(r1)
                    r0 = 8
                    java.lang.String r1 = "MspWindowClient:checkActivityStarted"
                    java.lang.String r4 = "mCurrentPresenter==null"
                    com.alipay.android.msp.utils.LogUtil.record(r0, r1, r4)
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspTradeContext r0 = r0.mMspTradeContext
                    java.lang.String r1 = "ActivityNotStartExit"
                    java.lang.String r4 = "ex"
                    if (r0 == 0) goto L84
                    com.alipay.android.msp.plugin.engine.IWalletEngine r0 = com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine.getMspWallet()
                    java.lang.String r5 = "BIZ_MSP_START_CASHIER"
                    java.lang.String r6 = "ACTIVITY_START"
                    r0.endSpiderSection(r5, r6)
                    com.alipay.android.msp.utils.FlybirdUtil.justEndSpider(r5)
                    com.alipay.android.msp.utils.FlybirdUtil.dumpSpiderwebSpiderForCashier()
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspTradeContext r0 = r0.mMspTradeContext
                    r5 = 0
                    r0.sendDataToSdk(r4, r1, r5)
                L84:
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspContext r0 = r0.mMspContext
                    boolean r0 = r0 instanceof com.alipay.android.msp.core.context.MspTradeContext
                    if (r0 == 0) goto Lb8
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspContext r0 = r0.mMspContext
                    com.alipay.android.msp.core.context.MspTradeContext r0 = (com.alipay.android.msp.core.context.MspTradeContext) r0
                    int r5 = r0.getRemoteCallbackVersion()
                    r6 = 4
                    if (r5 < r6) goto Lb8
                    com.alipay.android.msp.pay.results.MspPayResult r5 = r0.getMspPayResult()
                    if (r5 == 0) goto Lb8
                    boolean r5 = r0.isFromEntranceActivity()
                    if (r5 != 0) goto Lb8
                    com.alipay.android.msp.pay.results.MspPayResult r0 = r0.getMspPayResult()
                    com.alipay.android.msp.pay.results.ResultStatus r5 = com.alipay.android.msp.pay.results.ResultStatus.ACTIVITY_NOT_START_EXIT
                    int r5 = r5.getStatus()
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    r0.setEndCode(r5)
                    r0 = 0
                    goto Lb9
                Lb8:
                    r0 = 1
                Lb9:
                    if (r0 == 0) goto Lc8
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspContext r0 = r0.mMspContext
                    com.alipay.android.msp.framework.statisticsv2.StatisticInfo r0 = r0.getStatisticInfo()
                    java.lang.String r5 = ""
                    r0.addError(r4, r1, r5)
                Lc8:
                    com.alipay.android.msp.core.clients.MspWindowClient r0 = com.alipay.android.msp.core.clients.MspWindowClient.this
                    com.alipay.android.msp.core.context.MspContext r0 = r0.mMspContext
                    r0.exit(r2, r3)
                Lcf:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.clients.MspWindowClient.AnonymousClass13.run():void");
            }
        };
        int i = 10000;
        try {
            String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.START_ACTIVITY_DELAY_TIME);
            int parseInt = (walletConfig == null || walletConfig.length() <= 0) ? 10000 : Integer.parseInt(walletConfig);
            if (!this.mMspContext.isFromWallet() && !GlobalSdkConstant.getSdkType() && Build.VERSION.SDK_INT >= 29 && (Build.BRAND.contains("HUAWEI") || Build.BRAND.contains("HONOR"))) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                LogUtil.record(2, "MspWindowClient:checkActivityStarted", "app_lock_list start");
                String string = Settings.Secure.getString(this.b.getContentResolver(), "app_lock_list");
                if (string != null) {
                    if ((";" + string + ";").contains(";com.eg.android.AlipayGphone;")) {
                        parseInt = s.DX_ERROR_BIZ_CODE;
                    }
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                LogUtil.record(2, "MspWindowClient:checkActivityStarted", "app_lock_list end");
                long j2 = elapsedRealtime2 - elapsedRealtime;
                if (j2 > 10) {
                    StatisticInfo statisticInfo = this.mMspContext.getStatisticInfo();
                    StringBuilder sb = new StringBuilder();
                    sb.append(j2);
                    statisticInfo.addError(ErrorType.WARNING, "AppLock", sb.toString());
                }
            }
            if (this.mMspTradeContext != null && this.mMspTradeContext.getRemoteCallbackVersion() >= 4 && !this.mMspContext.isFromEntranceActivity()) {
                parseInt = 6000;
            }
            if (parseInt <= 0) {
                parseInt = 6000;
            }
            LogUtil.record(2, "MspWindowClient:checkActivityStarted", "checkTimeInt=".concat(String.valueOf(parseInt)));
            i = parseInt;
        } catch (Throwable th2) {
            LogUtil.printExceptionStackTrace(th2);
        }
        long j3 = i;
        MonitorRunnable monitorRunnable = new MonitorRunnable(runnable, j3);
        Context context = this.b;
        if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
            TaskHelper.getInstance().executeDelayed(monitorRunnable, j3, TaskHelper.ThreadName.UI_CONTEXT);
        } else {
            TaskHelper.execute(monitorRunnable, j3);
        }
        this.w = SystemClock.elapsedRealtime();
    }

    public boolean isNoPresenterSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("550b0ad0", new Object[]{this})).booleanValue() : this.r;
    }

    public boolean isStartCashierActivityAT_VERSION_O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1062f281", new Object[]{this})).booleanValue();
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isStartCashierActivityAT_VERSION_O", "mStartCashierActivityAt_VERSION_O:" + this.k);
        return this.k;
    }

    public void setOnFrameTplEventListener(OnFrameTplEventListener onFrameTplEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838e98f2", new Object[]{this, onFrameTplEventListener});
        } else {
            this.s = onFrameTplEventListener;
        }
    }

    public boolean isStartCashierActivityFromOutAppFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6297ff", new Object[]{this})).booleanValue();
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isStartCashierActivityFromOutAppFailed", "mStartCashierActivityFromOutAppFailed:" + this.n);
        return this.n;
    }

    public boolean isStartSettingsActivityFromOutAppFailed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88f95b4f", new Object[]{this})).booleanValue() : this.j;
    }

    public boolean isCurrentPageResultPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b39d295", new Object[]{this})).booleanValue() : StringUtils.equals(this.e.getTplId(), MspFlybirdDefine.FLYBIRD_PAYEND_TPL) || StringUtils.equals(this.e.getTplId(), MspFlybirdDefine.FLYBIRD_RESULT_TPL) || StringUtils.equals(this.e.getTplId(), MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL);
    }

    public MspWindowFrame getCurrentWindowFrame() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWindowFrame) ipChange.ipc$dispatch("69fb0ddb", new Object[]{this}) : this.e;
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void doDisposeWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f68aab", new Object[]{this});
            return;
        }
        this.g = null;
        this.h = null;
        this.c = false;
    }

    public boolean isPreSubmitPageLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abc296e7", new Object[]{this})).booleanValue() : this.l;
    }

    public void setPreSubmitPageLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170c5819", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public MspContainerPresenter getContainerPresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContainerPresenter) ipChange.ipc$dispatch("272d4775", new Object[]{this}) : this.d;
    }

    public void finishCashierActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f96dee6", new Object[]{this});
            return;
        }
        MspContainerPresenter mspContainerPresenter = this.d;
        if (mspContainerPresenter == null) {
            return;
        }
        MspMainContract.View iView = mspContainerPresenter.mo545getIView();
        if (iView != null) {
            iView.dismissDefaultLoading();
            iView.disposeActivity();
        }
        this.d = null;
        this.m = false;
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void disposeUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db7f7fa", new Object[]{this});
            return;
        }
        try {
            if (this.d != null) {
                this.d.exit();
                this.d = null;
                this.m = false;
            }
        } catch (Exception unused) {
        }
        try {
            if (this.mCurrentPresenter == null) {
                return;
            }
            this.q = true;
            this.mCurrentPresenter = null;
        } catch (Exception unused2) {
        }
    }

    public StEvent getStartActivityEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("e95405e7", new Object[]{this}) : this.v;
    }

    public long getStartActivityTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca9b57c3", new Object[]{this})).longValue() : this.w;
    }

    @Deprecated
    private static void a(MspContext mspContext, PreparedResult preparedResult, RenderTime renderTime, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdec7ee8", new Object[]{mspContext, preparedResult, renderTime, new Boolean(z)});
            return;
        }
        if (mspContext != null && preparedResult != null) {
            try {
                Template template = preparedResult.mRenderedTpl;
                String str = template.tplId;
                StEventForRenderFinish stEventForRenderFinish = new StEventForRenderFinish(str, "finshRender", template.tplVersion + "|" + template.time);
                stEventForRenderFinish.setTemplateDownLoadTime(renderTime.getDownloadTime());
                stEventForRenderFinish.setParseTime(renderTime.getParseTime());
                stEventForRenderFinish.setRenderTime(renderTime.getRenderTime());
                mspContext.getStatisticInfo().addEvent(stEventForRenderFinish);
                JSONObject drmValueFromKey = DrmManager.getInstance(mspContext.getContext()).getDrmValueFromKey(DrmKey.BYPASS_TPL_ASSETS_BLACK_LIST);
                boolean z2 = drmValueFromKey != null && drmValueFromKey.containsKey("tplList") && drmValueFromKey.getJSONArray("tplList").contains(template.tplId);
                String str2 = tbt.PRE_RENDER;
                String str3 = nom.VALUE_YES;
                if (z2) {
                    String[] strArr = new String[10];
                    strArr[0] = "pageId";
                    strArr[1] = template.tplId;
                    strArr[2] = UTConstant.Args.UT_PROPERTY_SUCCESS;
                    strArr[3] = str3;
                    strArr[4] = "context";
                    strArr[5] = "res_delete";
                    strArr[6] = "renderMode";
                    if (!z) {
                        str2 = "normal";
                    }
                    strArr[7] = str2;
                    strArr[8] = "upgradePreRendTpl";
                    if (!mspContext.isUpgradePreRendTpl()) {
                        str3 = "NO";
                    }
                    strArr[9] = str3;
                    EventLogUtil.logPayEvent("1010546", strArr);
                } else {
                    String[] strArr2 = new String[8];
                    strArr2[0] = "pageId";
                    strArr2[1] = template.tplId;
                    strArr2[2] = UTConstant.Args.UT_PROPERTY_SUCCESS;
                    strArr2[3] = str3;
                    strArr2[4] = "renderMode";
                    if (!z) {
                        str2 = "normal";
                    }
                    strArr2[5] = str2;
                    strArr2[6] = "upgradePreRendTpl";
                    if (!mspContext.isUpgradePreRendTpl()) {
                        str3 = "NO";
                    }
                    strArr2[7] = str3;
                    EventLogUtil.logPayEvent("1010546", strArr2);
                }
            } catch (Throwable th) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "cantLogRender", th);
            }
        }
        if (preparedResult.mRenderedTpl == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tplVersion", (Object) preparedResult.mRenderedTpl.tplVersion);
        jSONObject.put("time", (Object) preparedResult.mRenderedTpl.time);
        TemplateChangeMonitor.getInstance().hitKey(preparedResult.mRenderedTpl.tplId, jSONObject.toString(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void access$500(com.alipay.android.msp.core.clients.MspWindowClient r20, com.alipay.android.msp.core.frame.MspWindowFrame r21, java.lang.String r22, android.view.View r23, com.alipay.android.app.render.api.result.PreparedResult r24, com.alibaba.fastjson.JSONObject r25, java.lang.String r26, com.alipay.android.msp.core.callback.IRenderCallback r27) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.clients.MspWindowClient.access$500(com.alipay.android.msp.core.clients.MspWindowClient, com.alipay.android.msp.core.frame.MspWindowFrame, java.lang.String, android.view.View, com.alipay.android.app.render.api.result.PreparedResult, com.alibaba.fastjson.JSONObject, java.lang.String, com.alipay.android.msp.core.callback.IRenderCallback):void");
    }

    public static /* synthetic */ void access$1300(MspContext mspContext, MspPrepareResult mspPrepareResult, RenderTime renderTime) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f206b7ab", new Object[]{mspContext, mspPrepareResult, renderTime});
        } else if (mspPrepareResult == null) {
        } else {
            if (mspContext != null && mspPrepareResult != null && mspPrepareResult.getPrepareResult() != null && mspPrepareResult.getPrepareResult().getTemplate() != null) {
                PrepareResult prepareResult = mspPrepareResult.getPrepareResult();
                try {
                    FBTemplateContent template = prepareResult.getTemplate();
                    String tplId = template.getTplId();
                    StEventForRenderFinish stEventForRenderFinish = new StEventForRenderFinish(tplId, "finshRender", template.getTplVersion() + "|" + template.getTime());
                    stEventForRenderFinish.setTemplateDownLoadTime(renderTime.getDownloadTime());
                    stEventForRenderFinish.setParseTime(renderTime.getParseTime());
                    stEventForRenderFinish.setRenderTime(renderTime.getRenderTime());
                    mspContext.getStatisticInfo().addEvent(stEventForRenderFinish);
                    JSONObject drmValueFromKey = DrmManager.getInstance(mspContext.getContext()).getDrmValueFromKey(DrmKey.BYPASS_TPL_ASSETS_BLACK_LIST);
                    boolean z = drmValueFromKey != null && drmValueFromKey.containsKey("tplList") && drmValueFromKey.getJSONArray("tplList").contains(template.getTplId());
                    String str = tbt.PRE_RENDER;
                    String str2 = nom.VALUE_YES;
                    if (z) {
                        String[] strArr = new String[10];
                        strArr[0] = "pageId";
                        strArr[1] = template.getTplId();
                        strArr[2] = UTConstant.Args.UT_PROPERTY_SUCCESS;
                        strArr[3] = str2;
                        strArr[4] = "context";
                        strArr[5] = "res_delete";
                        strArr[6] = "renderMode";
                        if (!prepareResult.isReusedFromPrerender()) {
                            str = "normal";
                        }
                        strArr[7] = str;
                        strArr[8] = "upgradePreRendTpl";
                        if (!mspContext.isUpgradePreRendTpl()) {
                            str2 = "NO";
                        }
                        strArr[9] = str2;
                        EventLogUtil.logPayEvent("1010546", strArr);
                    } else {
                        String[] strArr2 = new String[8];
                        strArr2[0] = "pageId";
                        strArr2[1] = template.getTplId();
                        strArr2[2] = UTConstant.Args.UT_PROPERTY_SUCCESS;
                        strArr2[3] = str2;
                        strArr2[4] = "renderMode";
                        if (!prepareResult.isReusedFromPrerender()) {
                            str = "normal";
                        }
                        strArr2[5] = str;
                        strArr2[6] = "upgradePreRendTpl";
                        if (!mspContext.isUpgradePreRendTpl()) {
                            str2 = "NO";
                        }
                        strArr2[7] = str2;
                        EventLogUtil.logPayEvent("1010546", strArr2);
                    }
                } catch (Throwable th) {
                    mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "cantLogRender", th);
                }
            }
            PrepareResult prepareResult2 = mspPrepareResult.getPrepareResult();
            if (prepareResult2 == null || prepareResult2.getTemplate() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tplVersion", (Object) prepareResult2.getTemplate().getTplVersion());
            jSONObject.put("time", (Object) prepareResult2.getTemplate().getTime());
            TemplateChangeMonitor.getInstance().hitKey(prepareResult2.getTemplate().getTplId(), jSONObject.toString(), true);
        }
    }

    public static /* synthetic */ void access$1400(MspWindowClient mspWindowClient, View view, MspWindowFrame mspWindowFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a9e0f5", new Object[]{mspWindowClient, view, mspWindowFrame, str});
            return;
        }
        MspContainerPresenter mspContainerPresenter = mspWindowClient.d;
        if (view == null || mspWindowFrame == null || mspContainerPresenter == null || mspContainerPresenter.mo545getIView() == null) {
            LogUtil.w("MspWindowClient", "showContentView", "contentView=" + view + " , windowFrame=" + mspWindowFrame + " , containerPresenter=" + mspContainerPresenter);
            a("renderShowFail", mspWindowClient.mMspContext, str);
            return;
        }
        LogAgent.onFinishRender();
        SpmWrapper.onPageStart(mspWindowFrame, mspWindowClient.mBizId);
        mspContainerPresenter.mo545getIView().showContentView(view, !mspWindowFrame.getBackAnim(), mspWindowFrame);
        mspWindowFrame.setBackAnim(false);
        mspWindowFrame.setIsPreLoadView(false);
        if (mspWindowClient.mMspWindowLoadListener != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("mspBizId", mspWindowClient.mBizId);
            mspWindowClient.mMspWindowLoadListener.onWindowLoadSuccess(view, bundle);
        }
        mspWindowClient.a(mspWindowFrame, view);
        BroadcastUtil.sendRendPageResultToSource(mspWindowClient.mSuccNotifyName, mspWindowClient.b, mspWindowClient.mBizId);
    }
}
