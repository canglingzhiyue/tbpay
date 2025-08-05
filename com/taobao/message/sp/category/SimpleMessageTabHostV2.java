package com.taobao.message.sp.category;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.artc.api.ArtcStats;
import com.taobao.login4android.api.Login;
import com.taobao.message.SimpleFrameworkModule;
import com.taobao.message.conversation.IMessageTabHost;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.IdentifierUtil;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Container;
import com.taobao.message.lab.comfrm.inner2.ExecuteService;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.message_open_api_adapter.OpenApiService;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.search.common.util.i;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.uc.webview.export.media.MessageID;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\rH\u0002J-\u0010'\u001a\u00020\"2#\u0010(\u001a\u001f\u0012\u0013\u0012\u00110$¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\"\u0018\u00010)H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u00100\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00103\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u00010\u0013H\u0016J$\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\u00172\b\u00104\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u00109\u001a\u0002062\u0006\u00107\u001a\u00020\u00192\b\u00108\u001a\u0004\u0018\u00010\u00172\b\u00104\u001a\u0004\u0018\u00010\u0013J\b\u0010:\u001a\u00020\"H\u0016J\b\u0010;\u001a\u00020\"H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\u001a\u0010=\u001a\u00020\"2\u0006\u0010>\u001a\u0002062\b\u00104\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010?\u001a\u00020\"H\u0002J\b\u0010@\u001a\u000206H\u0002J\b\u0010A\u001a\u000206H\u0002J\u0010\u0010B\u001a\u00020\"2\u0006\u0010>\u001a\u000206H\u0002J\b\u0010C\u001a\u00020\"H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/taobao/message/sp/category/SimpleMessageTabHostV2;", "Lcom/taobao/message/conversation/IMessageTabHost;", "()V", "MAX_COUNT", "", "getMAX_COUNT", "()I", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "hostOnCreateTime", "", "hostOnCreateViewTime", "isLoading", "", "isRealHost", "loadingStartTime", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "mArgs", "Landroid/os/Bundle;", "mContainer", "Lcom/taobao/message/lab/comfrm/inner2/Container;", "mContainerView", "Landroid/view/ViewGroup;", "mInflate", "Landroid/view/LayoutInflater;", "mSavedState", "mTargetHost", "needCreateView", "needResume", "needViewCreated", "pageStartTime", ArtcStats.STAT_RETRYCOUNT, "addTimeLine", "", "key", "", "createHost", "needMakeUp", "downloadBundle", "onError", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "errorMsg", "getInner", "onArguments", "bundle", "onAttach", "context", "Landroid/content/Context;", i.b.MEASURE_ONCREATE, "savedInstanceState", "onCreateView", "Landroid/view/View;", "inflater", "container", "onCreateViewTabHost", MessageID.onDestroy, "onPause", "onResume", "onViewCreated", "view", "registerLogin", "renderEmptyLayout", "renderLoadingLayout", "replaceContentView", "unRegisterLogin", "Companion", "message_sp_category_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class SimpleMessageTabHostV2 implements IMessageTabHost {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    public static final String SOURCE = "category";
    public static final String TAG = "SimpleMessageTabHost";
    private static String targetHostClass;
    private BroadcastReceiver broadcastReceiver;
    private boolean isLoading;
    private boolean isRealHost;
    private long loadingStartTime;
    private FragmentActivity mActivity;
    private Bundle mArgs;
    private Container mContainer;
    private ViewGroup mContainerView;
    private LayoutInflater mInflate;
    private Bundle mSavedState;
    private IMessageTabHost mTargetHost;
    private boolean needCreateView;
    private boolean needResume;
    private boolean needViewCreated;
    private int retryCount;
    private final int MAX_COUNT = 3;
    private long pageStartTime = -1;
    private long hostOnCreateTime = -1;
    private long hostOnCreateViewTime = -1;

    public static final /* synthetic */ void access$downloadBundle(SimpleMessageTabHostV2 simpleMessageTabHostV2, rul rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767aa499", new Object[]{simpleMessageTabHostV2, rulVar});
        } else {
            simpleMessageTabHostV2.downloadBundle(rulVar);
        }
    }

    public static final /* synthetic */ String access$getTargetHostClass$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c770ec31", new Object[0]) : targetHostClass;
    }

    public static final /* synthetic */ void access$setLoading$p(SimpleMessageTabHostV2 simpleMessageTabHostV2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f172b55e", new Object[]{simpleMessageTabHostV2, new Boolean(z)});
        } else {
            simpleMessageTabHostV2.isLoading = z;
        }
    }

    public static final /* synthetic */ void access$setMContainer$p(SimpleMessageTabHostV2 simpleMessageTabHostV2, Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b687189", new Object[]{simpleMessageTabHostV2, container});
        } else {
            simpleMessageTabHostV2.mContainer = container;
        }
    }

    public static final /* synthetic */ void access$setRetryCount$p(SimpleMessageTabHostV2 simpleMessageTabHostV2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef68719c", new Object[]{simpleMessageTabHostV2, new Integer(i)});
        } else {
            simpleMessageTabHostV2.retryCount = i;
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

    public final int getMAX_COUNT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bc9b918", new Object[]{this})).intValue() : this.MAX_COUNT;
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.hostOnCreateTime = System.currentTimeMillis();
        this.mSavedState = bundle;
        if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            TLog.loge(BundleSplitUtil.TAG, "feature ready");
            createHost(false);
            String userId = Login.getUserId();
            q.a((Object) userId, "Login.getUserId()");
            if (FeatureInitHelper.isInit(userId)) {
                return;
            }
            try {
                Schedules.lowBackground(SimpleMessageTabHostV2$onCreate$1.INSTANCE);
                return;
            } catch (Throwable th) {
                TLog.loge(BundleSplitUtil.TAG, Log.getStackTraceString(th));
                return;
            }
        }
        AppMonitor.Alarm.commitFail(RemoteMonitorUtil.MODULE, "spCategoryAlarm", null, null);
        TLog.loge(BundleSplitUtil.TAG, "feature not ready");
        downloadBundle(new SimpleMessageTabHostV2$onCreate$2(this));
    }

    private final void registerLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea0500d", new Object[]{this});
        } else if (this.broadcastReceiver != null || this.isRealHost) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
            this.broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.SimpleMessageTabHostV2$registerLogin$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    q.c(context, "context");
                    q.c(intent, "intent");
                    SimpleMessageTabHostV2 simpleMessageTabHostV2 = SimpleMessageTabHostV2.this;
                    if (SimpleMessageTabHostV2.$ipChange == null) {
                        return;
                    }
                    SimpleMessageTabHostV2.access$setMContainer$p(SimpleMessageTabHostV2.this, null);
                }
            };
            ApplicationUtil.getApplication().registerReceiver(this.broadcastReceiver, intentFilter);
        }
    }

    private final void unRegisterLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef26674", new Object[]{this});
        } else if (this.broadcastReceiver == null) {
        } else {
            try {
                ApplicationUtil.getApplication().unregisterReceiver(this.broadcastReceiver);
            } catch (Throwable th) {
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
        }
    }

    private final void downloadBundle(rul<? super String, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47bb4f8", new Object[]{this, rulVar});
            return;
        }
        this.isLoading = true;
        BundleSplitUtil.INSTANCE.checkMsgBundleReady("category", 20, new SimpleMessageTabHostV2$downloadBundle$1(this), new SimpleMessageTabHostV2$downloadBundle$2(this, rulVar), true, new SimpleMessageTabHostV2$downloadBundle$3(this));
    }

    private final void createHost(boolean z) {
        IMessageTabHost iMessageTabHost;
        IMessageTabHost iMessageTabHost2;
        this.isLoading = false;
        if (this.mTargetHost == null) {
            Container container = this.mContainer;
            if (container != null) {
                container.dispose();
            }
            this.mContainer = null;
            Object newInstance = Class.forName(targetHostClass).newInstance();
            if (newInstance instanceof IMessageTabHost) {
                this.isRealHost = true;
                unRegisterLogin();
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
        addTimeLine("onCreateView");
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
            return;
        }
        this.pageStartTime = SystemClock.uptimeMillis();
        if (!(context instanceof FragmentActivity)) {
            return;
        }
        this.mActivity = (FragmentActivity) context;
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
        this.mInflate = inflater;
        this.mSavedState = bundle;
        this.mContainerView = viewGroup;
        if (this.mTargetHost == null) {
            if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
                TLog.loge(BundleSplitUtil.TAG, "make up tabHost");
                String userId = Login.getUserId();
                q.a((Object) userId, "Login.getUserId()");
                if (FeatureInitHelper.isInit(userId)) {
                    RemoteMonitorUtil.INSTANCE.remoteLoadTimeoutCount("category");
                    createHost(false);
                    LayoutInflater layoutInflater = this.mInflate;
                    if (layoutInflater == null) {
                        q.a();
                    }
                    return onCreateViewTabHost(layoutInflater, viewGroup, this.mSavedState);
                }
                TLog.loge(BundleSplitUtil.TAG, "render empty");
                this.needCreateView = true;
                return renderEmptyLayout();
            }
            TLog.loge(BundleSplitUtil.TAG, "render loading");
            this.needCreateView = true;
            return renderLoadingLayout();
        }
        TLog.loge(BundleSplitUtil.TAG, "render tabHost");
        return onCreateViewTabHost(inflater, viewGroup, bundle);
    }

    private final View renderLoadingLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7beaba99", new Object[]{this});
        }
        addTimeLine("onShowLoading");
        AppMonitor.Counter.commit(RemoteMonitorUtil.MODULE, "spCategoryCount", 1.0d);
        registerLogin();
        if (this.mContainer == null) {
            SimpleCategoryModule.injectDependencies(IdentifierUtil.getCurrentIdentifier());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String userId = Login.getUserId();
            q.a((Object) userId, "Login.getUserId()");
            linkedHashMap.put("accountId", userId);
            linkedHashMap.put("mpm_pageTag", "mpm_home");
            this.mContainer = new Container(this.mActivity, "conversationTabSimple", null, IdentifierUtil.getCurrentIdentifier(), linkedHashMap, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
            Container container = this.mContainer;
            if (container == null) {
                q.a();
            }
            container.registerService(ExecuteService.class, new OpenApiService(this.mActivity));
            Container container2 = this.mContainer;
            if (container2 == null) {
                q.a();
            }
            container2.addPlugin(new SimpleMessageTabLoadMonitorPlugin(this.mActivity, System.currentTimeMillis(), this.pageStartTime, this.mArgs));
            WidgetRenderImpl.RenderConfig renderConfig = new WidgetRenderImpl.RenderConfig();
            renderConfig.dxEngineBizType = "alimp_message_simple";
            renderConfig.reUseKey = "alimp_message_simple";
            Container container3 = this.mContainer;
            if (container3 == null) {
                q.a();
            }
            container3.setRenderConfig(renderConfig);
            if (!ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "msgTabSimpleCloseSnapshot")) {
                Container container4 = this.mContainer;
                if (container4 == null) {
                    q.a();
                }
                container4.enableSnapshot();
            }
            Container container5 = this.mContainer;
            if (container5 == null) {
                q.a();
            }
            container5.start();
        }
        Container container6 = this.mContainer;
        if (container6 == null) {
            q.a();
        }
        Object view = container6.getView(View.class);
        q.a(view, "mContainer!!.getView(View::class.java)");
        return (View) view;
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
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost == null) {
            this.needResume = true;
        } else if (iMessageTabHost != null) {
            iMessageTabHost.onResume();
        }
        if (!BundleSplitUtil.INSTANCE.isMsgBundleReady() && !this.isLoading && (i = this.retryCount) < this.MAX_COUNT) {
            this.retryCount = i + 1;
            downloadBundle(new SimpleMessageTabHostV2$onResume$1(this));
        }
        if (this.mTargetHost != null || !BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            return;
        }
        TLog.loge(BundleSplitUtil.TAG, "make up tabHost when resume");
        createHost(true);
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
        if (iMessageTabHost != null) {
            iMessageTabHost.onDestroy();
        }
        Container container = this.mContainer;
        if (container != null) {
            container.dispose();
        }
        this.mContainer = null;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/message/sp/category/SimpleMessageTabHostV2$Companion;", "", "()V", "SOURCE", "", RPCDataItems.SWITCH_TAG_LOG, "targetHostClass", "getTargetHostClass", "()Ljava/lang/String;", "setTargetHostClass", "(Ljava/lang/String;)V", "message_sp_category_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-213885018);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final String getTargetHostClass() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfb0aab0", new Object[]{this}) : SimpleMessageTabHostV2.access$getTargetHostClass$cp();
        }

        public final void setTargetHostClass(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08c802e", new Object[]{this, str});
                return;
            }
            q.c(str, "<set-?>");
            SimpleMessageTabHostV2.access$setTargetHostClass$cp(str);
        }
    }

    static {
        kge.a(390509022);
        kge.a(-1743385170);
        Companion = new Companion(null);
        targetHostClass = "com.taobao.message.conversation.DefaultMessageTabHost";
    }

    private final View renderEmptyLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9f3aa5aa", new Object[]{this});
        }
        registerLogin();
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity == null) {
            q.a();
        }
        LinearLayout linearLayout = new LinearLayout(fragmentActivity);
        linearLayout.setOrientation(1);
        FragmentActivity fragmentActivity2 = this.mActivity;
        if (fragmentActivity2 == null) {
            q.a();
        }
        TextView textView = new TextView(fragmentActivity2);
        textView.setText(DisplayUtil.localizedString(R.string.mp_loading_2));
        textView.setTextSize(1, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = 200;
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }
}
