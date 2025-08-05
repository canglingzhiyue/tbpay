package com.alipay.android.msp.ui.views;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.msp.core.component.JsExceptionReceiver;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.NavBarClickAction;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.contracts.MspMainContract;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.utils.H5Utils;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes3.dex */
public class MspProxyActivity implements MspBaseContract.IView, MspMainContract.View {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public OnResultReceived f5012a;
    private Activity c;
    private int d;
    private MspExtSceneManager e;
    private MspDialogHelper f;
    private MspContainerContext g;
    private View j;
    private MspContext k;
    private Stack<View> h = new Stack<>();
    private boolean i = false;
    private boolean l = false;
    private ComponentCallbacks m = new ComponentCallbacks() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                return;
            }
            if (MspProxyActivity.a(MspProxyActivity.this) != null) {
                MspProxyActivity.a(MspProxyActivity.this).updateScreenSizeInfo(configuration, MspProxyActivity.b(MspProxyActivity.this));
            }
            Iterator it = MspProxyActivity.c(MspProxyActivity.this).iterator();
            while (it.hasNext()) {
                MspProxyActivity.a(MspProxyActivity.this, (View) it.next(), configuration);
            }
        }
    };
    private Application.ActivityLifecycleCallbacks n = new Application.ActivityLifecycleCallbacks() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (MspProxyActivity.b(MspProxyActivity.this) == null || MspProxyActivity.b(MspProxyActivity.this) != activity || MspProxyActivity.this.f5012a == null) {
            } else {
                MspProxyActivity.this.f5012a.onReceiveResult("");
                MspProxyActivity.this.f5012a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else if (MspProxyActivity.b(MspProxyActivity.this) == null || MspProxyActivity.b(MspProxyActivity.this) != activity) {
            } else {
                MspProxyActivity.this.onDestroy();
            }
        }
    };
    private MspContainerPresenter b = new MspContainerPresenter();

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showNavButton(String str, NavBarClickAction navBarClickAction, String str2, NavBarClickAction navBarClickAction2, String str3, NavBarPlugin.OnNavBarShownListener onNavBarShownListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcd3a9a", new Object[]{this, str, navBarClickAction, str2, navBarClickAction2, str3, onNavBarShownListener});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4ad2bd", new Object[]{this});
        }
    }

    public static /* synthetic */ MspExtSceneManager a(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspExtSceneManager) ipChange.ipc$dispatch("b6a7c282", new Object[]{mspProxyActivity}) : mspProxyActivity.e;
    }

    public static /* synthetic */ Activity b(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4c960da3", new Object[]{mspProxyActivity}) : mspProxyActivity.c;
    }

    public static /* synthetic */ Stack c(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Stack) ipChange.ipc$dispatch("e9734c6f", new Object[]{mspProxyActivity}) : mspProxyActivity.h;
    }

    public static /* synthetic */ View d(MspProxyActivity mspProxyActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("36ee8d29", new Object[]{mspProxyActivity}) : mspProxyActivity.j;
    }

    private int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : (int) (UIUtil.getDp(this.c) * 16.0f);
    }

    public MspProxyActivity(Activity activity, int i) {
        this.c = activity;
        this.d = i;
        this.b.attachIView(this);
        this.g = MspContextManager.getInstance().getRenderContextByBizId(i);
        MspContainerContext mspContainerContext = this.g;
        if (mspContainerContext != null) {
            this.f = new MspDialogHelper(this.c, mspContainerContext);
        }
        this.c.getApplication().registerActivityLifecycleCallbacks(this.n);
        this.k = MspContextManager.getInstance().getMspContextByBizId(this.d);
        if (this.k.getGrayUnifiedReadPadConfig()) {
            this.e = this.k.getMspExtSceneManager();
        } else {
            this.e = new MspExtSceneManager(this.c);
        }
        if (this.k.getGrayOnPadAdaptMode()) {
            this.c.getApplication().registerComponentCallbacks(this.m);
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.c == null) {
        } else {
            LogUtil.record(4, "phonecashiermsp#flybird", "MspProxyActivity.onDestroy", "has been executed, ctx=" + this.c);
            FrameLayout frameLayout = (FrameLayout) this.c.findViewById(16908290);
            while (!this.h.empty()) {
                try {
                    frameLayout.removeView((ViewGroup) this.h.pop().getParent());
                } catch (Throwable th) {
                    LogUtil.record(2, "MspProxyActivity::onDestroy", "如果现在鸟巢栈没了，那么下面的相关错误可以忽略。 size:" + this.h.size());
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            MspHardwarePayUtil.getInstance().cancel(this.c);
            JsExceptionReceiver.unregisterReceiver();
            MspDialogHelper mspDialogHelper = this.f;
            if (mspDialogHelper != null) {
                mspDialogHelper.clear();
                this.f = null;
            }
            MspContainerContext mspContainerContext = this.g;
            if (mspContainerContext != null) {
                StatisticInfo statisticInfo = mspContainerContext.getStatisticInfo();
                StringBuilder sb = new StringBuilder();
                sb.append(this.h.size());
                statisticInfo.addEvent(new StEvent(CountValue.T_TPL, "destroy", sb.toString()));
                LogUtil.record(4, "MspProxyActivity:onDestroy", "mIsFinished false");
                this.g.exit(0);
            }
            MspContainerContext mspContainerContext2 = this.g;
            if (mspContainerContext2 != null && mspContainerContext2.getMspUIClient() != null && this.g.getMspUIClient().getFrameStack() != null) {
                this.g.getMspUIClient().getFrameStack().clearWin();
            }
            PreRendManager.getInstance().removeContext();
            JSPluginManager.getInstanse().cleanUpContextHandlePlugin(this.c);
            PluginManager.getRender().destroy(this.d, this.c.hashCode(), this.c);
            this.c.getApplication().unregisterActivityLifecycleCallbacks(this.n);
            if (this.k.getGrayOnPadAdaptMode()) {
                this.c.getApplication().unregisterComponentCallbacks(this.m);
            }
            this.c = null;
        }
    }

    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : this.c;
    }

    public MspContainerPresenter getPresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContainerPresenter) ipChange.ipc$dispatch("494d8600", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showDefaultLoading(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ae4220", new Object[]{this, strArr});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showDefaultLoading");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void stopDefaultLoadingCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08d3cfb", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "stopDefaultLoadingCountDown");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void dismissDefaultLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86216ec", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "dismissDefaultLoading");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showAdWebView(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f632d1de", new Object[]{this, str, str2, str3});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showAdWebView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void showH5WebView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6287549a", new Object[]{this, jSONObject});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showH5WebView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void preloadAdWebView(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1194cce7", new Object[]{this, jSONArray, new Integer(i)});
        } else {
            LogUtil.record(2, "MspProxyActivity", "preloadAdWebView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        LogUtil.record(2, "MspProxyActivity", "getBizId" + this.d);
        return this.d;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public View getCurFlybirdView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23d6dcd0", new Object[]{this});
        }
        LogUtil.record(2, "MspProxyActivity", "getCurFlybirdView");
        if (!this.h.empty()) {
            return this.h.peek();
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public String getCurTplId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebcf1fd8", new Object[]{this});
        }
        LogUtil.record(2, "MspProxyActivity", "getCurTplId");
        return null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showLoadingView(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272661f4", new Object[]{this, strArr});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showLoadingView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186899a6", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "stopLoadingView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCusLoadingView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb7c42e", new Object[]{this, str});
            return;
        }
        MspDialogHelper mspDialogHelper = this.f;
        if (mspDialogHelper == null) {
            return;
        }
        mspDialogHelper.showWalletLoading(this.c, str);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopCusLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abc0129", new Object[]{this});
            return;
        }
        MspDialogHelper mspDialogHelper = this.f;
        if (mspDialogHelper == null) {
            return;
        }
        mspDialogHelper.dismissDefaultLoading();
        this.f.dismissWalletLoading();
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showDialogView(String str, String str2, List<MspDialogButton> list) {
        MspDialogHelper mspDialogHelper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243919f6", new Object[]{this, str, str2, list});
            return;
        }
        Activity activity = this.c;
        if ((activity != null && activity.isFinishing()) || (mspDialogHelper = this.f) == null) {
            return;
        }
        mspDialogHelper.showDialog(str, str2, list);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showToastView(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772525fa", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        LogUtil.d("MspProxyActivity", "showToastView", str);
        MspDialogHelper mspDialogHelper = this.f;
        if (mspDialogHelper == null) {
            return;
        }
        mspDialogHelper.showToast(str, str2, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x017e A[Catch: Throwable -> 0x020a, TryCatch #0 {Throwable -> 0x020a, blocks: (B:16:0x0046, B:19:0x0059, B:21:0x0070, B:23:0x0078, B:27:0x0083, B:29:0x0091, B:32:0x00a8, B:34:0x00be, B:36:0x00c6, B:38:0x00ce, B:40:0x00e2, B:42:0x00e6, B:44:0x00ec, B:49:0x0102, B:50:0x0105, B:52:0x0162, B:54:0x0172, B:56:0x0178, B:58:0x017e, B:61:0x0186, B:63:0x018c, B:45:0x00f3, B:48:0x00fc, B:39:0x00dd, B:33:0x00b9, B:35:0x00c4, B:64:0x018f, B:66:0x01db, B:68:0x01ef, B:67:0x01ea), top: B:83:0x0046 }] */
    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showContentView(final android.view.View r18, int r19, com.alipay.android.msp.core.frame.MspWindowFrame r20) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspProxyActivity.showContentView(android.view.View, int, com.alipay.android.msp.core.frame.MspWindowFrame):void");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        View pop = this.h.pop();
        LogUtil.record(2, "MspProxyActivity::removeMspView", String.valueOf(pop));
        ViewGroup viewGroup = (ViewGroup) pop.getParent();
        pop.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, H5Utils.getScreenHeight(this.c));
        translateAnimation.setDuration(100L);
        viewGroup.setAnimation(translateAnimation);
        FrameLayout frameLayout = (FrameLayout) this.c.findViewById(16908290);
        frameLayout.removeView(viewGroup);
        if (this.k.getGrayOnPadAdaptMode() && this.h.size() > 0) {
            this.j = this.h.peek();
        }
        if (this.l || !Boolean.parseBoolean(MspExtSceneManager.getInstance(this.c).isAccessibilityEnabled()) || Build.VERSION.SDK_INT < 19) {
            return;
        }
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayout.getChildAt(i);
            if (childAt != null) {
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void addMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db286f9", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "addMaskView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void removeMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee44a5c", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "removeMaskView");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public View getCurrentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("518ce191", new Object[]{this});
        }
        LogUtil.record(2, "MspProxyActivity", "getCurrentView");
        if (!this.h.empty()) {
            return this.h.peek();
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void disposeActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c89bd5", new Object[]{this});
        } else {
            LogUtil.record(2, "MspProxyActivity", "disposeActivity");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public boolean openUrl(String str, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a04f493", new Object[]{this, str, onResultReceived})).booleanValue();
        }
        this.f5012a = onResultReceived;
        LogUtil.record(2, "MspProxyActivity:openUrl", "url=".concat(String.valueOf(str)));
        try {
            return PhoneCashierMspEngine.getMspJump().processUrl(this.c, str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.d);
            if (mspContextByBizId == null) {
                return false;
            }
            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "openUrlFail", e);
            return false;
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void openActivity(final Intent intent, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67402bc8", new Object[]{this, intent, onResultReceived});
            return;
        }
        try {
            if (onResultReceived != null) {
                this.f5012a = onResultReceived;
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspProxyActivity.b(MspProxyActivity.this).startActivityForResult(intent, 0);
                        }
                    }
                });
                return;
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspProxyActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspProxyActivity.b(MspProxyActivity.this).startActivity(intent);
                    }
                }
            });
        } catch (Throwable th) {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.d);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, th.getClass().getName(), th);
            }
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCustomOptDialog(String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81c9ab9", new Object[]{this, str, str2, list});
        } else {
            LogUtil.record(2, "MspProxyActivity", "showCustomOptDialog");
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspMainContract.View
    public void addViewToMainLayout(View view, MspWindowFrame mspWindowFrame, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc2b996", new Object[]{this, view, mspWindowFrame, new Integer(i)});
        } else {
            LogUtil.record(2, "MspProxyActivity", "addViewToMainLayout");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f A[Catch: Throwable -> 0x0029, TryCatch #0 {Throwable -> 0x0029, blocks: (B:9:0x001d, B:11:0x0021, B:16:0x002f, B:19:0x0045, B:21:0x0073, B:23:0x0083, B:25:0x0094, B:27:0x009d, B:29:0x00a9, B:32:0x00b9, B:36:0x00c0, B:41:0x00d7, B:43:0x00dd, B:46:0x00e7, B:48:0x0100, B:49:0x0106, B:51:0x010c, B:53:0x0110, B:55:0x011c, B:57:0x0122, B:59:0x0128, B:61:0x0165, B:67:0x0194, B:60:0x0151, B:62:0x0169, B:64:0x016d, B:66:0x0173, B:68:0x0196, B:69:0x019b), top: B:73:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.alipay.android.msp.ui.views.MspProxyActivity r10, android.view.View r11, android.content.res.Configuration r12) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspProxyActivity.a(com.alipay.android.msp.ui.views.MspProxyActivity, android.view.View, android.content.res.Configuration):void");
    }
}
