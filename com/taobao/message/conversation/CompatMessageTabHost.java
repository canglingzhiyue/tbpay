package com.taobao.message.conversation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.util.i;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.gbg;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J-\u0010\u001c\u001a\u00020\u00172#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001eH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010\nH\u0016J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010\nJ\b\u0010/\u001a\u00020\u0017H\u0016J\b\u00100\u001a\u00020\u0017H\u0016J\b\u00101\u001a\u00020\u0017H\u0016J\u001a\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020+2\b\u0010)\u001a\u0004\u0018\u00010\nH\u0016J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J\b\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020\u00172\u0006\u00103\u001a\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/taobao/message/conversation/CompatMessageTabHost;", "Lcom/taobao/message/conversation/IMessageTabHost;", "()V", "isLoading", "", "loadingStartTime", "", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "mArgs", "Landroid/os/Bundle;", "mContainerView", "Landroid/view/ViewGroup;", "mInflate", "Landroid/view/LayoutInflater;", "mLoadingView", "Lcom/taobao/appbundle/remote/view/RemoteLoadingView;", "mSavedState", "mTargetHost", "needCreateView", "needResume", "needViewCreated", "addTimeLine", "", "key", "", "createHost", "needMakeUp", "downloadBundle", "onError", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "errorMsg", "getInner", "onArguments", "bundle", "onAttach", "context", "Landroid/content/Context;", i.b.MEASURE_ONCREATE, "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "container", "onCreateViewTabHost", MessageID.onDestroy, "onPause", "onResume", "onViewCreated", "view", "renderHeaderView", "renderLoadingLayout", "renderLoadingView", "renderNativeHeaderView", "replaceContentView", "Companion", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class CompatMessageTabHost implements IMessageTabHost {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    public static final String SOURCE = "category";
    private static String targetHostClass;
    private boolean isLoading;
    private long loadingStartTime;
    private FragmentActivity mActivity;
    private Bundle mArgs;
    private ViewGroup mContainerView;
    private LayoutInflater mInflate;
    private RemoteLoadingView mLoadingView;
    private Bundle mSavedState;
    private IMessageTabHost mTargetHost;
    private boolean needCreateView;
    private boolean needResume;
    private boolean needViewCreated;

    public static final /* synthetic */ void access$createHost(CompatMessageTabHost compatMessageTabHost, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a11423", new Object[]{compatMessageTabHost, new Boolean(z)});
        } else {
            compatMessageTabHost.createHost(z);
        }
    }

    public static final /* synthetic */ void access$downloadBundle(CompatMessageTabHost compatMessageTabHost, rul rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b166ffe", new Object[]{compatMessageTabHost, rulVar});
        } else {
            compatMessageTabHost.downloadBundle(rulVar);
        }
    }

    public static final /* synthetic */ String access$getTargetHostClass$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c770ec31", new Object[0]) : targetHostClass;
    }

    public static final /* synthetic */ void access$replaceContentView(CompatMessageTabHost compatMessageTabHost, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d0237b", new Object[]{compatMessageTabHost, view});
        } else {
            compatMessageTabHost.replaceContentView(view);
        }
    }

    public static final /* synthetic */ void access$setLoading$p(CompatMessageTabHost compatMessageTabHost, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78586ee1", new Object[]{compatMessageTabHost, new Boolean(z)});
        } else {
            compatMessageTabHost.isLoading = z;
        }
    }

    public static final /* synthetic */ void access$setMActivity$p(CompatMessageTabHost compatMessageTabHost, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cd1b250", new Object[]{compatMessageTabHost, fragmentActivity});
        } else {
            compatMessageTabHost.mActivity = fragmentActivity;
        }
    }

    public static final /* synthetic */ void access$setMLoadingView$p(CompatMessageTabHost compatMessageTabHost, RemoteLoadingView remoteLoadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309e03", new Object[]{compatMessageTabHost, remoteLoadingView});
        } else {
            compatMessageTabHost.mLoadingView = remoteLoadingView;
        }
    }

    public static final /* synthetic */ void access$setTargetHostClass$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7e5565", new Object[]{str});
        } else {
            targetHostClass = str;
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TLog.loge(BundleSplitUtil.TAG, i.b.MEASURE_ONCREATE);
        addTimeLine(i.b.MEASURE_ONCREATE);
        this.mSavedState = bundle;
        boolean isMsgBundleReady = BundleSplitUtil.INSTANCE.isMsgBundleReady();
        addTimeLine("onAfterLoad");
        RemoteMonitorUtil.INSTANCE.directLoadAlarm4Source(this.mActivity, "category", isMsgBundleReady);
        if (isMsgBundleReady) {
            TLog.loge(BundleSplitUtil.TAG, "feature ready");
            FeatureInitHelper.directInit(new CompatMessageTabHost$onCreate$1(this));
            return;
        }
        this.isLoading = true;
        RemoteMonitorUtil.INSTANCE.remoteLoadCount("category");
        TLog.loge(BundleSplitUtil.TAG, "feature not ready");
        downloadBundle(new CompatMessageTabHost$onCreate$2(this));
    }

    private final void downloadBundle(rul<? super String, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47bb4f8", new Object[]{this, rulVar});
        } else {
            BundleSplitUtil.INSTANCE.checkMsgBundleReady("category", 20, new CompatMessageTabHost$downloadBundle$1(this), new CompatMessageTabHost$downloadBundle$2(rulVar), true, new CompatMessageTabHost$downloadBundle$3(this));
        }
    }

    private final void createHost(boolean z) {
        IMessageTabHost iMessageTabHost;
        IMessageTabHost iMessageTabHost2;
        TLog.loge(BundleSplitUtil.TAG, "createHost");
        if (this.mTargetHost == null) {
            q.a((Object) "1", (Object) OrangeConfig.getInstance().getConfig("mpm_data_switch", "enableMessageTab", "1"));
            Object newInstance = Class.forName(targetHostClass).newInstance();
            if (newInstance instanceof IMessageTabHost) {
                this.mTargetHost = (IMessageTabHost) newInstance;
                IMessageTabHost iMessageTabHost3 = this.mTargetHost;
                if (iMessageTabHost3 != null) {
                    iMessageTabHost3.onAttach(this.mActivity);
                }
                IMessageTabHost iMessageTabHost4 = this.mTargetHost;
                if (iMessageTabHost4 != null) {
                    iMessageTabHost4.onArguments(this.mArgs);
                }
                IMessageTabHost iMessageTabHost5 = this.mTargetHost;
                if (iMessageTabHost5 != null) {
                    iMessageTabHost5.onCreate(this.mSavedState);
                }
            }
            if (!z) {
                return;
            }
            if (this.needCreateView) {
                LayoutInflater layoutInflater = this.mInflate;
                if (layoutInflater == null) {
                    q.a();
                }
                replaceContentView(onCreateViewTabHost(layoutInflater, this.mContainerView, this.mSavedState));
                if (this.loadingStartTime > 0) {
                    RemoteMonitorUtil.INSTANCE.loadingDurationStat(System.currentTimeMillis() - this.loadingStartTime, "category");
                }
            }
            if (this.needViewCreated && (iMessageTabHost2 = this.mTargetHost) != null) {
                iMessageTabHost2.onViewCreated(this.mContainerView, this.mSavedState);
            }
            if (!this.needResume || (iMessageTabHost = this.mTargetHost) == null) {
                return;
            }
            iMessageTabHost.onResume();
        }
    }

    public final View onCreateViewTabHost(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b2c3bf19", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.c(inflater, "inflater");
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        View onCreateView = iMessageTabHost != null ? iMessageTabHost.onCreateView(inflater, viewGroup, bundle) : null;
        if (onCreateView == null) {
            q.a();
        }
        return onCreateView;
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else if (!(context instanceof FragmentActivity)) {
        } else {
            this.mActivity = (FragmentActivity) context;
        }
    }

    private final void replaceContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c48e41", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.mContainerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.mContainerView;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.addView(view, -1, -1);
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.c(inflater, "inflater");
        TLog.loge(BundleSplitUtil.TAG, "onCreateView");
        addTimeLine("onCreateView");
        TraceUtil.beginSection("installActivity");
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity == null) {
            q.a();
        }
        j.b(fragmentActivity);
        TraceUtil.endTrace();
        addTimeLine("onAfterResInject");
        this.mInflate = inflater;
        this.mSavedState = bundle;
        this.mContainerView = viewGroup;
        if (this.mTargetHost == null) {
            if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
                TLog.loge(BundleSplitUtil.TAG, "make up tabHost");
                this.isLoading = false;
                RemoteMonitorUtil.INSTANCE.remoteLoadTimeoutCount("category");
                createHost(false);
                LayoutInflater layoutInflater = this.mInflate;
                if (layoutInflater == null) {
                    q.a();
                }
                return onCreateViewTabHost(layoutInflater, viewGroup, this.mSavedState);
            }
            TLog.loge(BundleSplitUtil.TAG, "render loading");
            this.needCreateView = true;
            return renderLoadingLayout();
        }
        TLog.loge(BundleSplitUtil.TAG, "render tabHost");
        return onCreateViewTabHost(inflater, viewGroup, bundle);
    }

    private final View renderNativeHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3d2267c8", new Object[]{this});
        }
        TextView textView = new TextView(this.mActivity);
        textView.setText(DisplayUtil.localizedString(R.string.mp_loading_2));
        FragmentActivity fragmentActivity = this.mActivity;
        textView.setTextSize(gbg.d(fragmentActivity, DisplayUtil.ap2DesignScalePx(fragmentActivity, 21.0f)));
        textView.setGravity(16);
        textView.setTextColor(Color.parseColor("#111111"));
        textView.setPadding(DisplayUtil.ap2DesignScalePx(this.mActivity, 12.0f), 0, 0, 0);
        textView.setTypeface(null, 1);
        return textView;
    }

    private final View renderHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("971dd011", new Object[]{this});
        }
        DXEngineConfig.a aVar = new DXEngineConfig.a("alimp_message");
        BizTagUtil.BizTag bizTag = BizTagUtil.getBizTag(this.mActivity);
        if (bizTag != null) {
            aVar.d(bizTag.bizId());
            aVar.a(bizTag.bizName());
        }
        try {
            aVar.h(true);
        } catch (Throwable unused) {
        }
        FragmentActivity fragmentActivity = this.mActivity;
        Context context = null;
        if (DisplayUtil.isLargeScreen(fragmentActivity != null ? fragmentActivity.getApplicationContext() : null)) {
            aVar.a(true, true);
        }
        DinamicXEngine dinamicXEngine = new DinamicXEngine(aVar.a());
        FragmentActivity fragmentActivity2 = this.mActivity;
        if (fragmentActivity2 != null) {
            context = fragmentActivity2.getApplicationContext();
        }
        if (DisplayUtil.isLargeScreen(context)) {
            dinamicXEngine.a((Activity) this.mActivity);
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f11925a = "alimp_category_main_titlebar";
        dXTemplateItem.c = "https://dinamicx.alibabausercontent.com/pub/alimp_category_main_titlebar/1651131218083/alimp_category_main_titlebar.zip";
        dXTemplateItem.b = 1651131218083L;
        DXRootView view = dinamicXEngine.b(this.mActivity, dinamicXEngine.a(dXTemplateItem)).f11780a;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "title", DisplayUtil.localizedString(R.string.mp_loading_2));
        jSONObject2.put((JSONObject) "disableFunc", "1");
        jSONObject2.put((JSONObject) "disableClearAll", "1");
        dinamicXEngine.a(view, jSONObject);
        q.a((Object) view, "view");
        return view;
    }

    private final View renderLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5f619d54", new Object[]{this});
        }
        this.mLoadingView = new RemoteLoadingView(this.mActivity, new LoadConfig.a().a("message").a());
        RemoteLoadingView remoteLoadingView = this.mLoadingView;
        if (remoteLoadingView == null) {
            q.a();
        }
        remoteLoadingView.setBackgroundColor(0);
        RemoteLoadingView remoteLoadingView2 = this.mLoadingView;
        if (remoteLoadingView2 == null) {
            q.a();
        }
        return remoteLoadingView2;
    }

    private final View renderLoadingLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7beaba99", new Object[]{this});
        }
        addTimeLine("onShowLoading");
        this.loadingStartTime = System.currentTimeMillis();
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity == null) {
            q.a();
        }
        FrameLayout frameLayout = new FrameLayout(fragmentActivity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, DisplayUtil.ap2DesignScalePx(this.mActivity, 48.0f));
        FragmentActivity fragmentActivity2 = this.mActivity;
        if (fragmentActivity2 == null) {
            q.a();
        }
        layoutParams.topMargin = DisplayUtil.getStatusBarHeight(fragmentActivity2);
        frameLayout.addView(renderNativeHeaderView(), layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(renderLoadingView(), layoutParams2);
        return frameLayout;
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        q.c(view, "view");
        TLog.loge(BundleSplitUtil.TAG, "onViewCreated");
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost == null) {
            this.needViewCreated = true;
        } else if (iMessageTabHost == null) {
        } else {
            iMessageTabHost.onViewCreated(view, bundle);
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost == null) {
            this.needResume = true;
        } else if (iMessageTabHost == null) {
        } else {
            iMessageTabHost.onResume();
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        if (this.isLoading) {
            RemoteMonitorUtil.INSTANCE.remoteLoadBackCount("category");
        }
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost == null) {
            return;
        }
        iMessageTabHost.onPause();
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost == null) {
            return;
        }
        iMessageTabHost.onDestroy();
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onArguments(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7921a8d6", new Object[]{this, bundle});
            return;
        }
        this.mArgs = bundle;
        if (this.mArgs != null) {
            return;
        }
        this.mArgs = new Bundle();
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public IMessageTabHost getInner() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMessageTabHost) ipChange.ipc$dispatch("d4cf436a", new Object[]{this}) : this.mTargetHost;
    }

    public final void addTimeLine(String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865a8933", new Object[]{this, key});
            return;
        }
        q.c(key, "key");
        Bundle bundle = this.mArgs;
        if (bundle == null) {
            return;
        }
        bundle.putLong("mptl_" + key, SystemClock.uptimeMillis());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/message/conversation/CompatMessageTabHost$Companion;", "", "()V", "SOURCE", "", "targetHostClass", "getTargetHostClass", "()Ljava/lang/String;", "setTargetHostClass", "(Ljava/lang/String;)V", "message_base_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1508240977);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final String getTargetHostClass() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfb0aab0", new Object[]{this}) : CompatMessageTabHost.access$getTargetHostClass$cp();
        }

        public final void setTargetHostClass(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08c802e", new Object[]{this, str});
                return;
            }
            q.c(str, "<set-?>");
            CompatMessageTabHost.access$setTargetHostClass$cp(str);
        }
    }

    static {
        kge.a(646154825);
        kge.a(-1743385170);
        Companion = new Companion(null);
        targetHostClass = "com.taobao.message.conversation.DefaultMessageTabHost";
    }
}
