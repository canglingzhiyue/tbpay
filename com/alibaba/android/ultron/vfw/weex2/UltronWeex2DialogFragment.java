package com.alibaba.android.ultron.vfw.weex2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.weex2.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.android.weex_framework.p;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.adh;
import tb.bzu;
import tb.cts;
import tb.dsm;
import tb.iro;
import tb.jqg;
import tb.jvq;
import tb.jvs;
import tb.kge;
import tb.ljl;
import tb.mto;
import tb.spk;

/* loaded from: classes2.dex */
public class UltronWeex2DialogFragment extends DialogFragment implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "bizName";
    public static final String CONTAINER_BIZ_NAME = "containerBizName";
    public static final String CONTAINER_RES_ID = "containerResId";
    public static final String EXPECT_HEIGHT = "expectHeight";
    public static final String EXPECT_WIDTH = "expectWidth";
    public static final String FRAGMENT_TAG = "UltronWeex2DialogFragment";
    public static final String IS_INSTANCE_REUSE = "isInstanceReuse";
    public static final String IS_PRE_RENDER = "isPreRender";
    public static final String WEEX2_URL = "weex2Url";
    public String mBizName;
    public String mContainerBizName;
    public int mContainerResId;
    public int mExpectHeight;
    public int mExpectWidth;
    public com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a mFragmentLifeCycleListener;
    public UltronWeex2DataPrefetchCache mPrefetchCache;
    public FrameLayout mRootView;
    public p mWeex2Instance;
    public String mWeex2Url;
    public d mWhiteScreenMonitor;
    public boolean mbPreRender = false;
    public boolean mbInstanceReuse = false;
    public boolean mbRenderReady = false;
    public boolean mbRenderException = false;
    public boolean mbBizReady = false;
    public boolean mbFragmentDisplay = false;
    public long mFragmentLastDisplayTimestamp = 0;
    public JSONObject mBackgroundMessageRecorder = new JSONObject();
    private JSONObject mCachedEarlyMsg = new JSONObject();
    public boolean mbGestureIntercept = false;
    public boolean isFoldDevice = false;

    static {
        kge.a(466712853);
        kge.a(586328833);
        kge.a(-1737820920);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2DialogFragment ultronWeex2DialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1088398452:
                return super.onCreateAnimation(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue());
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void sendMessageToWeex2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c4673e", new Object[]{this});
        }
    }

    public static /* synthetic */ JSONObject access$000(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("cb7d1811", new Object[]{ultronWeex2DialogFragment}) : ultronWeex2DialogFragment.getCachedEarlyMsg();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.mBizName = arguments.getString("bizName");
        this.mContainerBizName = arguments.getString(CONTAINER_BIZ_NAME);
        this.mWeex2Url = arguments.getString(WEEX2_URL);
        this.mbPreRender = arguments.getBoolean("isPreRender", false);
        this.mbInstanceReuse = arguments.getBoolean(IS_INSTANCE_REUSE, false);
        this.mContainerResId = arguments.getInt(CONTAINER_RES_ID);
        this.mExpectWidth = arguments.getInt(EXPECT_WIDTH);
        this.mExpectHeight = arguments.getInt(EXPECT_HEIGHT);
        adh.a();
    }

    public String getWeex2Url() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0b73ea5", new Object[]{this}) : this.mWeex2Url;
    }

    public void setWeex2Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10df071", new Object[]{this, str});
        } else {
            this.mWeex2Url = str;
        }
    }

    public p getWeex2Instance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("cef63ed4", new Object[]{this}) : this.mWeex2Instance;
    }

    public void setWeex2Instance(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5416e622", new Object[]{this, pVar});
            return;
        }
        if (this.mWeex2Instance != null) {
            destroyWeex2Instance();
        }
        this.mbRenderReady = false;
        this.mbRenderException = false;
        this.mbBizReady = false;
        this.mWeex2Instance = pVar;
        bindBizLifecycleListener();
        bindDataPrefetchCache();
    }

    public void setWeex2InstanceByPreRender(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e08408", new Object[]{this, pVar});
            return;
        }
        if (this.mWeex2Instance != null) {
            destroyWeex2Instance();
        }
        if (pVar == null) {
            jqg.a(FRAGMENT_TAG, "setWeex2InstanceByPreRender:", "musInstance is null");
            this.mWeex2Instance = null;
            return;
        }
        initPreRenderInstance(pVar);
    }

    public void setWeex2InstanceByPreRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b63a2f", new Object[]{this, str});
            return;
        }
        if (this.mWeex2Instance != null) {
            destroyWeex2Instance();
        }
        if (StringUtils.isEmpty(str)) {
            jqg.a(FRAGMENT_TAG, "setWeex2InstanceByPreRender:", "instanceId is empty");
            this.mWeex2Instance = null;
            return;
        }
        initPreRenderInstance(f.a().a(str, true));
    }

    private void initPreRenderInstance(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4b9788", new Object[]{this, pVar});
            return;
        }
        this.mbRenderReady = false;
        this.mbRenderException = false;
        this.mbBizReady = false;
        this.mWeex2Instance = pVar;
        registerRenderListener();
        bindBizLifecycleListener();
        bindDataPrefetchCache();
    }

    public boolean hasRenderReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dff279be", new Object[]{this})).booleanValue() : this.mbRenderReady;
    }

    public boolean hasRenderException() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f660326a", new Object[]{this})).booleanValue() : this.mbRenderException;
    }

    public boolean hasBizReady() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea044c95", new Object[]{this})).booleanValue() : this.mbBizReady;
    }

    public boolean hasFragmentDisplay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b2d58ae3", new Object[]{this})).booleanValue() : this.mbFragmentDisplay;
    }

    public UltronWeex2DataPrefetchCache getPrefetchCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronWeex2DataPrefetchCache) ipChange.ipc$dispatch("3aa66c89", new Object[]{this}) : this.mPrefetchCache;
    }

    public void setPrefetchCache(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc1c0ad", new Object[]{this, ultronWeex2DataPrefetchCache});
            return;
        }
        this.mPrefetchCache = ultronWeex2DataPrefetchCache;
        bindDataPrefetchCache();
    }

    public JSONObject getBackgroundMessageRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a872eb48", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(this.mBackgroundMessageRecorder);
        return jSONObject;
    }

    public void setBackgroundMessageRecorder(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69fb9fd4", new Object[]{this, jSONObject});
            return;
        }
        this.mBackgroundMessageRecorder.clear();
        if (jSONObject == null) {
            return;
        }
        this.mBackgroundMessageRecorder.putAll(jSONObject);
    }

    public void setFragmentLifeCycleListener(com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c28a97", new Object[]{this, aVar});
        } else {
            this.mFragmentLifeCycleListener = aVar;
        }
    }

    public boolean isGestureIntercept() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b52edce", new Object[]{this})).booleanValue() : this.mbGestureIntercept;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.mRootView = (FrameLayout) layoutInflater.inflate(R.layout.ultron_weex2_dialog_fragment_layout, viewGroup, false);
        p pVar = this.mWeex2Instance;
        if (pVar != null && pVar.getRenderRoot() != null) {
            View renderRoot = this.mWeex2Instance.getRenderRoot();
            ViewGroup viewGroup2 = (ViewGroup) renderRoot.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(renderRoot);
            }
            this.mRootView.addView(renderRoot);
            setupWeex2GestureListener();
        }
        setDarkStatusBar();
        setTranslucentBackground();
        return this.mRootView;
    }

    private void setTranslucentBackground() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d6042c", new Object[]{this});
        } else if (this.mRootView == null || StringUtils.isEmpty(this.mWeex2Url) || !StringUtils.equals(adh.a(this.mWeex2Url, "pageType"), "pop") || (findViewById = this.mRootView.findViewById(R.id.dialog_fragment_layout_container)) == null) {
        } else {
            findViewById.setBackgroundColor(Color.parseColor("#00000000"));
        }
    }

    private void setDarkStatusBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6736b0", new Object[]{this});
        } else if (this.mRootView == null || StringUtils.isEmpty(this.mWeex2Url)) {
        } else {
            if (!com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a.a(this.mWeex2Url, cts.a.PRE_RENDER_URL_ORDER_DETAIL) || !spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "setDarkStatusBar", true)) {
                jqg.a(FRAGMENT_TAG, "setDarkStatusBar:", "switcher is off: " + this.mWeex2Url);
            } else if (getActivity() == null || getActivity().getWindow() == null || getActivity().getWindow().getDecorView() == null || Build.VERSION.SDK_INT < 23) {
            } else {
                View decorView = getActivity().getWindow().getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        this.isFoldDevice = Build.VERSION.SDK_INT >= 19 && l.d(context);
        showFragmentContainer();
        if (this.mWeex2Instance == null && !this.mbPreRender) {
            String str = this.mBizName;
            dsm.b(false, str, "OnError: mWeex2Instance is null and mbPreRender is false, isFoldDevice: " + this.isFoldDevice);
        }
        this.mbFragmentDisplay = true;
        String str2 = this.mWeex2Url;
        if (str2 == null) {
            str2 = "";
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(bzu.sBizName, 19997, "attachContainer", str2, "", null).build());
        com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a aVar = this.mFragmentLifeCycleListener;
        if (aVar != null) {
            aVar.b(this, this.mWeex2Instance);
        }
        if (!isSkipFragmentContainerUt()) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
        }
        getWhiteScreenMonitor().a();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        dismissFragmentContainer();
        this.mbFragmentDisplay = false;
        String str = this.mWeex2Url;
        String str2 = "";
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(bzu.sBizName, 19997, "detachContainer", str == null ? str2 : str, "", null).build());
        com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a aVar = this.mFragmentLifeCycleListener;
        if (aVar != null) {
            aVar.c(this, this.mWeex2Instance);
        }
        if (isSkipFragmentContainerUt()) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity());
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        FragmentActivity activity = getActivity();
        if (!StringUtils.isEmpty(this.mContainerBizName)) {
            str2 = this.mContainerBizName;
        }
        defaultTracker.updatePageName(activity, str2);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        p pVar = this.mWeex2Instance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStart();
        this.mWeex2Instance.onScreenRendering();
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        p pVar = this.mWeex2Instance;
        if (pVar == null) {
            return;
        }
        pVar.onActivityStop();
        this.mWeex2Instance.offScreenRendering();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        p pVar = this.mWeex2Instance;
        if (pVar != null) {
            pVar.onActivityResume();
        }
        if (!isSkipFragmentContainerUt()) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity());
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), StringUtils.isEmpty(this.mBizName) ? "" : this.mBizName);
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.a aVar = this.mFragmentLifeCycleListener;
        if (aVar == null) {
            return;
        }
        aVar.a(this, this.mWeex2Instance);
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        p pVar = this.mWeex2Instance;
        if (pVar != null) {
            pVar.onActivityPause();
        }
        if (!isSkipFragmentContainerUt()) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
        }
        getWhiteScreenMonitor().b(getWeex2Url());
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        doDestroy();
    }

    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        if (!this.mbInstanceReuse && this.mWeex2Instance != null) {
            destroyWeex2Instance();
        }
        rebuildInstanceByPreRender();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!this.mbFragmentDisplay || i != 4) {
            return false;
        }
        dismissByActivity(getActivity());
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        super.onCreateAnimation(i, z, i2);
        long a2 = spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "transitionAnimDuration", 250L);
        if (z) {
            boolean a3 = spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enableOffsetEnterAnim", false);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            if (a3) {
                translateAnimation.setStartOffset(spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enterAnimStartOffsetDuration", 50L));
                translateAnimation.setDuration(spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enterAnimDuration", 200L));
            } else {
                translateAnimation.setDuration(a2);
            }
            return translateAnimation;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation2.setDuration(a2);
        return translateAnimation2;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.c
    public void onBizReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a730856", new Object[]{this});
            return;
        }
        UnifyLog.b("UltronWeex2DialogFragment.onBizReady", "onBizReady");
        this.mbBizReady = true;
        JSONObject backgroundMessageRecorder = getBackgroundMessageRecorder();
        if (backgroundMessageRecorder.isEmpty()) {
            return;
        }
        sendBackgroundMessageToWeex2(backgroundMessageRecorder);
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.c
    public void onBizFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
            return;
        }
        String[] strArr = new String[1];
        String str3 = "";
        if (("errorCode:" + str) != null) {
            if ((str + ",errorMsg:" + str2) != null) {
                str3 = str2;
            }
        }
        strArr[0] = str3;
        UnifyLog.d("UltronWeex2DialogFragment.onBizFailed", strArr);
        this.mbBizReady = false;
    }

    public void displayByActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f30181", new Object[]{this, activity});
        } else {
            displayByActivity(activity, null);
        }
    }

    public void displayByActivity(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db3c9b3", new Object[]{this, activity, bundle});
        } else if (!(activity instanceof FragmentActivity)) {
            jqg.a(FRAGMENT_TAG, "displayByActivity:", "activity is not a FragmentActivity");
        } else {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG);
            if (isAdded() || this.mbFragmentDisplay || ((bundle == null && findFragmentByTag != null) || System.currentTimeMillis() - this.mFragmentLastDisplayTimestamp < 500)) {
                jqg.a(FRAGMENT_TAG, "displayByActivity:", "fragment already displayed, mbFragmentDisplay: " + this.mbFragmentDisplay);
                return;
            }
            if (spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enableRemovePreviousFragment", true) && bundle != null && findFragmentByTag != null) {
                z = true;
            }
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            if (z) {
                beginTransaction.remove(findFragmentByTag);
            }
            beginTransaction.add(this.mContainerResId, this, FRAGMENT_TAG);
            beginTransaction.commitAllowingStateLoss();
            this.mFragmentLastDisplayTimestamp = System.currentTimeMillis();
        }
    }

    public void dismissByActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab765749", new Object[]{this, activity});
        } else if (!(activity instanceof FragmentActivity)) {
            UnifyLog.d("UltronWeex2DialogFragment.dismissByActivity", "activity is not a FragmentActivity");
        } else {
            Fragment findFragmentByTag = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentByTag(FRAGMENT_TAG);
            if (this != findFragmentByTag) {
                UnifyLog.d("UltronWeex2DialogFragment.dismissByActivity", "fragment is not this fragment");
            } else {
                ((UltronWeex2DialogFragment) findFragmentByTag).dismiss();
            }
        }
    }

    public void sendPreRenderMessageToWeex2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918e40e9", new Object[]{this, jSONObject});
            return;
        }
        if (getContext() != null) {
            this.isFoldDevice = Build.VERSION.SDK_INT >= 19 && l.d(getContext());
        }
        if (!this.mbPreRender) {
            String str = this.mBizName;
            dsm.b(false, str, "OnError: can't send preRenderMessage to a nonPreRender instance, isFoldDevice: " + this.isFoldDevice);
        } else if (this.mWeex2Instance == null) {
            String str2 = this.mBizName;
            dsm.b(false, str2, "OnError: mWeex2Instance is null, isFoldDevice: " + this.isFoldDevice);
        } else if (jSONObject == null) {
            String str3 = this.mBizName;
            dsm.b(false, str3, "OnError: message is null, isFoldDevice: " + this.isFoldDevice);
        } else {
            String str4 = this.mBizName;
            dsm.b(true, str4, "OnSuccess!, isFoldDevice: " + this.isFoldDevice);
            if (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a.a(this.mWeex2Url, cts.a.PRE_RENDER_URL_LOGISTICS) && spk.a(iro.ORANGE_KEY_ORDER_LIST, "enableLogisticsFragmentOpt", false)) {
                jSONObject.put("enableFragmentOpt", "true");
            }
            this.mWeex2Instance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.update", jSONObject);
            getWhiteScreenMonitor().a(jSONObject);
        }
    }

    public void sendBackgroundMessageToWeex2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfad7564", new Object[]{this, jSONObject});
        } else if (!this.mbPreRender) {
            UnifyLog.d("UltronWeex2DialogFragment.sendBackgroundMessageToWeex2", "can't send backgroundMessage to a nonPreRender instance");
        } else if (this.mWeex2Instance == null) {
            UnifyLog.d("UltronWeex2DialogFragment.sendBackgroundMessageToWeex2", "mWeex2Instance is null");
        } else if (jSONObject == null) {
            UnifyLog.d("UltronWeex2DialogFragment.sendBackgroundMessageToWeex2", "message is null");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("backgroundData", (Object) jSONObject);
            this.mWeex2Instance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject2);
            this.mBackgroundMessageRecorder.putAll(jSONObject);
        }
    }

    public void sendEarlyMessageToWeex2(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890d75f", new Object[]{this, jSONObject});
        } else if (!spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enableAsyncCreateInstance", false)) {
            jqg.a(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "switcher is off");
        } else if (!this.mbPreRender) {
            jqg.a(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "can't send backgroundMessage to a nonPreRender instance");
        } else if (this.mWeex2Instance == null) {
            jqg.a(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "mWeex2Instance is null");
        } else if (jSONObject == null) {
            jqg.a(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "earlyMsg is null");
        } else if (this.mbRenderReady) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("earlyMessageData", (Object) jSONObject);
            this.mWeex2Instance.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject2);
        } else {
            setCachedEarlyMsg(jSONObject);
        }
    }

    private void setCachedEarlyMsg(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffee727", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.mCachedEarlyMsg;
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.clear();
        if (jSONObject == null) {
            return;
        }
        this.mCachedEarlyMsg.putAll(jSONObject);
    }

    private JSONObject getCachedEarlyMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83dbc9fd", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.mCachedEarlyMsg;
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            jSONObject.putAll(this.mCachedEarlyMsg);
        }
        return jSONObject;
    }

    public void destroyWeex2Instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449bdcb3", new Object[]{this});
            return;
        }
        p pVar = this.mWeex2Instance;
        if (pVar == null) {
            UnifyLog.d("UltronWeex2DialogFragment.destroyWeex2Instance", "mWeex2Instance is null");
        } else if (pVar.isDestroyed()) {
            UnifyLog.d("UltronWeex2DialogFragment.destroyWeex2Instance", "mWeex2Instance already destroyed");
            this.mWeex2Instance = null;
        } else {
            unbindBizLifecycleListener();
            unbindDataPrefetchCache();
            this.mWeex2Instance.destroy();
            this.mWeex2Instance = null;
        }
    }

    public void registerRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe85bf4", new Object[]{this});
            return;
        }
        p pVar = this.mWeex2Instance;
        if (pVar == null) {
            UnifyLog.d("UltronWeex2DialogFragment.registerRenderListener", "mWeex2Instance is null");
        } else {
            pVar.registerRenderListener(new com.taobao.android.weex_framework.g() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.g
                public void onForeground(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6fafc624", new Object[]{this, pVar2});
                    } else {
                        UnifyLog.b("UltronWeex2DialogFragment.IMUSRenderListener", "onForeground");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onPrepareSuccess(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9635d60b", new Object[]{this, pVar2});
                    } else {
                        UnifyLog.b("UltronWeex2DialogFragment.IMUSRenderListener", "onPrepareSuccess");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderSuccess(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3fdf238", new Object[]{this, pVar2});
                        return;
                    }
                    UnifyLog.b("UltronWeex2DialogFragment.IMUSRenderListener", ljl.RENDER_SUCCESS_TIME);
                    UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
                    ultronWeex2DialogFragment.mbRenderReady = true;
                    ultronWeex2DialogFragment.sendEarlyMessageToWeex2(UltronWeex2DialogFragment.access$000(ultronWeex2DialogFragment));
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRenderFailed(p pVar2, int i, String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4253181b", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    String[] strArr = new String[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRenderFailed,errorType:");
                    sb.append(i);
                    sb.append(" errorMsg:");
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(" fatal:");
                    sb.append(z);
                    strArr[0] = sb.toString();
                    UnifyLog.d("UltronWeex2DialogFragment.IMUSRenderListener", strArr);
                    UltronWeex2DialogFragment.this.mbRenderException = true;
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshSuccess(p pVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cd7e3df", new Object[]{this, pVar2});
                    } else {
                        UnifyLog.b("UltronWeex2DialogFragment.IMUSRenderListener", "onRefreshSuccess");
                    }
                }

                @Override // com.taobao.android.weex_framework.g
                public void onRefreshFailed(p pVar2, int i, String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f63c5f14", new Object[]{this, pVar2, new Integer(i), str, new Boolean(z)});
                        return;
                    }
                    String[] strArr = new String[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRefreshFailed,errorType:");
                    sb.append(i);
                    sb.append(" errorMsg:");
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(" fatal:");
                    sb.append(z);
                    strArr[0] = sb.toString();
                    UnifyLog.d("UltronWeex2DialogFragment.IMUSRenderListener", strArr);
                    UltronWeex2DialogFragment.this.mbRenderException = true;
                }

                @Override // com.taobao.android.weex_framework.g
                public void onJSException(p pVar2, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("831fc52e", new Object[]{this, pVar2, new Integer(i), str});
                        return;
                    }
                    String[] strArr = new String[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("onJSException,errorType:");
                    sb.append(i);
                    sb.append(" errorMsg:");
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    strArr[0] = sb.toString();
                    UnifyLog.d("UltronWeex2DialogFragment.IMUSRenderListener", strArr);
                    UltronWeex2DialogFragment.this.mbRenderException = true;
                }

                @Override // com.taobao.android.weex_framework.g
                public void onFatalException(p pVar2, int i, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bcd71451", new Object[]{this, pVar2, new Integer(i), str});
                        return;
                    }
                    String[] strArr = new String[1];
                    StringBuilder sb = new StringBuilder();
                    sb.append("onFatalException,errorType:");
                    sb.append(i);
                    sb.append(" errorMsg:");
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    strArr[0] = sb.toString();
                    UnifyLog.d("UltronWeex2DialogFragment.IMUSRenderListener", strArr);
                    UltronWeex2DialogFragment.this.mbRenderException = true;
                }

                @Override // com.taobao.android.weex_framework.g
                public void onDestroyed(MUSDKInstance mUSDKInstance) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
                    } else {
                        UnifyLog.b("UltronWeex2DialogFragment.IMUSRenderListener", "onDestroyed");
                    }
                }
            });
        }
    }

    public void bindBizLifecycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fca9cf", new Object[]{this});
            return;
        }
        p pVar = this.mWeex2Instance;
        if (pVar == null) {
            return;
        }
        pVar.setTag("bizLifecycleListener", this);
    }

    public void unbindBizLifecycleListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933b48e8", new Object[]{this});
            return;
        }
        p pVar = this.mWeex2Instance;
        if (pVar == null) {
            return;
        }
        pVar.setTag("bizLifecycleListener", "");
    }

    public void bindDataPrefetchCache() {
        UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee040b", new Object[]{this});
            return;
        }
        p pVar = this.mWeex2Instance;
        if (pVar == null || (ultronWeex2DataPrefetchCache = this.mPrefetchCache) == null) {
            return;
        }
        pVar.setTag("tradePrefetchCache", ultronWeex2DataPrefetchCache);
        UnifyLog.b("UltronWeex2DialogFragment.bindDataPrefetchCache", "do bind");
    }

    public void unbindDataPrefetchCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c6392", new Object[]{this});
            return;
        }
        p pVar = this.mWeex2Instance;
        if (pVar == null) {
            return;
        }
        pVar.setTag("tradePrefetchCache", "");
        UnifyLog.b("UltronWeex2DialogFragment.bindDataPrefetchCache", "do unbind");
    }

    public void rebuildInstanceByPreRender() {
        int i;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79562319", new Object[]{this});
        } else if (!this.mbPreRender) {
            UnifyLog.d("UltronWeex2DialogFragment.rebuildInstanceByPreRender", "can't rebuild instance with nonPreRender");
        } else if (this.mbInstanceReuse) {
            UnifyLog.d("UltronWeex2DialogFragment.rebuildInstanceByPreRender", "can't rebuild instance with instanceReuse");
        } else if (this.mWeex2Instance != null) {
            UnifyLog.d("UltronWeex2DialogFragment.rebuildInstanceByPreRender", "former instance must destroy before rebuild");
        } else {
            Context context = getContext();
            if (context == null) {
                UnifyLog.d("UltronWeex2DialogFragment.rebuildInstanceByPreRender", "context is null");
            } else if (StringUtils.isEmpty(this.mWeex2Url)) {
                UnifyLog.d("UltronWeex2DialogFragment.rebuildInstanceByPreRender", "mWeex2Url is empty");
            } else {
                boolean equals = StringUtils.equals("true", adh.a(this.mWeex2Url, cts.a.QUERY_ASYNC_CREATE_INSTANCE));
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i2 = this.mExpectWidth;
                if (i2 <= 0) {
                    i2 = displayMetrics.widthPixels;
                }
                int i3 = i2;
                int i4 = this.mExpectHeight;
                int i5 = i4 <= 0 ? displayMetrics.heightPixels : i4;
                String str = "default";
                if (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a.a(this.mWeex2Url, cts.a.PRE_RENDER_URL_LOGISTICS)) {
                    f a3 = f.a();
                    if (!StringUtils.isEmpty(this.mBizName)) {
                        str = this.mBizName;
                    }
                    setWeex2InstanceByPreRender(a3.a(context, str, this.mWeex2Url, i3, i5));
                } else if (!equals) {
                    if (iro.b()) {
                        f a4 = f.a();
                        if (!StringUtils.isEmpty(this.mBizName)) {
                            str = this.mBizName;
                        }
                        a2 = a4.a(context, str, this.mWeex2Url, UltronTradeHybridInstanceRenderMode.SURFACE, i3, i5);
                    } else {
                        f a5 = f.a();
                        if (!StringUtils.isEmpty(this.mBizName)) {
                            str = this.mBizName;
                        }
                        a2 = a5.a(context, str, this.mWeex2Url, UltronTradeHybridInstanceRenderMode.TEXTURE, i3, i5);
                    }
                    setWeex2InstanceByPreRender(a2);
                } else {
                    if (spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "useRealDisplayHeight", true)) {
                        int a6 = adh.a(context);
                        if (a6 <= 0) {
                            a6 = i5;
                        }
                        i = a6;
                    } else {
                        i = i5;
                    }
                    a.C0105a c0105a = new a.C0105a();
                    if (!StringUtils.isEmpty(this.mBizName)) {
                        str = this.mBizName;
                    }
                    f.a().a(context, i3, i, c0105a.a(str).b(this.mWeex2Url).g(iro.b() ? UltronTradeHybridInstanceRenderMode.SURFACE : UltronTradeHybridInstanceRenderMode.TEXTURE).a(), (CopyOnWriteArrayList<Pair<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a, Object>>) null, new f.a() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alibaba.android.ultron.vfw.weex2.f.a
                        public void a(String str2, p pVar) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("84edcb9b", new Object[]{this, str2, pVar});
                            } else if (StringUtils.isEmpty(str2) || pVar == null) {
                                jqg.a(UltronWeex2DialogFragment.FRAGMENT_TAG, "onInstanceCreatedInMain", "callback is invalid");
                            } else {
                                UltronWeex2DialogFragment.this.setWeex2InstanceByPreRender(pVar);
                                UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
                                ultronWeex2DialogFragment.sendEarlyMessageToWeex2(UltronWeex2DialogFragment.access$000(ultronWeex2DialogFragment));
                            }
                        }
                    });
                }
            }
        }
    }

    public void showFragmentContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2965d1b", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            UnifyLog.d("UltronWeex2DialogFragment.showFragmentContainer", "activity is null");
            return;
        }
        View findViewById = activity.findViewById(this.mContainerResId);
        if (findViewById == null) {
            UnifyLog.d("UltronWeex2DialogFragment.showFragmentContainer", "container is null");
        } else {
            findViewById.setVisibility(0);
        }
    }

    public void dismissFragmentContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cacafae", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            UnifyLog.d("UltronWeex2DialogFragment.dismissFragmentContainer", "activity is null");
            return;
        }
        View findViewById = activity.findViewById(this.mContainerResId);
        if (findViewById == null) {
            UnifyLog.d("UltronWeex2DialogFragment.dismissFragmentContainer", "container is null");
        } else {
            findViewById.setVisibility(8);
        }
    }

    public void setupWeex2GestureListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ae0eb0", new Object[]{this});
        } else if (this.mWeex2Instance == null) {
            UnifyLog.d("UltronWeex2DialogFragment.setupWeex2GestureListener", "mWeex2Instance is null");
        } else if (!StringUtils.equals(adh.a(this.mWeex2Url, com.taobao.android.detail.wrapper.nav.c.STDPOP_NAV_MODE), com.taobao.android.detail.wrapper.nav.c.STDPOP_MODE_VALUE)) {
            UnifyLog.a("UltronWeex2DialogFragment.setupWeex2GestureListener", "only under std_mega_pop mode can setup gesture intercept");
        } else {
            this.mWeex2Instance.setGestureEventListener(new jvq() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvq
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
                    if (map == null || !"true".equals(String.valueOf(map.get("state")))) {
                        z = false;
                    }
                    ultronWeex2DialogFragment.mbGestureIntercept = z;
                }
            });
            this.mWeex2Instance.setWeexScrollListener(new jvs() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvs
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (map == null || UltronWeex2DialogFragment.this.mRootView == null) {
                    } else {
                        Object obj = map.get(Constants.Name.CONTENT_OFFSET);
                        if (!(obj instanceof org.json.JSONObject)) {
                            return;
                        }
                        UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
                        if (((org.json.JSONObject) obj).optDouble("y") >= mto.a.GEO_NOT_SUPPORT) {
                            z = false;
                        }
                        ultronWeex2DialogFragment.mbGestureIntercept = z;
                    }
                }
            });
        }
    }

    public boolean isFragmentEmbedded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bbda90cf", new Object[]{this})).booleanValue() : !(getActivity() instanceof UltronTradeHybridActivity);
    }

    public boolean isSkipFragmentContainerUt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb194f12", new Object[]{this})).booleanValue();
        }
        if (StringUtils.equals(adh.a(this.mWeex2Url, "skipTradeHybridContainerUt"), "true")) {
            return true;
        }
        return (!(getActivity() instanceof UltronTradeHybridActivity) || !((UltronTradeHybridActivity) getActivity()).c()) && !isFragmentEmbedded();
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2757a;
        public String b;
        public String c;
        public p d;
        public boolean e = false;
        public boolean f = false;
        public int g;
        public int h;
        public int i;

        static {
            kge.a(1233939180);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a28a7ec1", new Object[]{this, str});
            }
            this.f2757a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4e595a0", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6740ac7f", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("76f34c2e", new Object[]{this, pVar});
            }
            this.d = pVar;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f4fcaec7", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d8286208", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("91aeec78", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("74da9fb9", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("580652fa", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public UltronWeex2DialogFragment a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("b0b329a8", new Object[]{this});
            }
            UltronWeex2DialogFragment ultronWeex2DialogFragment = new UltronWeex2DialogFragment();
            ultronWeex2DialogFragment.setWeex2Instance(this.d);
            Bundle bundle = new Bundle();
            bundle.putString("bizName", this.f2757a);
            bundle.putString(UltronWeex2DialogFragment.CONTAINER_BIZ_NAME, this.b);
            bundle.putString(UltronWeex2DialogFragment.WEEX2_URL, this.c);
            bundle.putBoolean("isPreRender", this.e);
            bundle.putBoolean(UltronWeex2DialogFragment.IS_INSTANCE_REUSE, this.f);
            bundle.putInt(UltronWeex2DialogFragment.CONTAINER_RES_ID, this.g);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_WIDTH, this.h);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_HEIGHT, this.i);
            ultronWeex2DialogFragment.setArguments(bundle);
            ultronWeex2DialogFragment.init();
            return ultronWeex2DialogFragment;
        }
    }

    public d getWhiteScreenMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("11cd35f", new Object[]{this});
        }
        if (this.mWhiteScreenMonitor == null) {
            this.mWhiteScreenMonitor = new d();
        }
        return this.mWhiteScreenMonitor;
    }
}
