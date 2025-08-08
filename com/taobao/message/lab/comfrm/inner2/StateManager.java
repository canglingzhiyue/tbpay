package com.taobao.message.lab.comfrm.inner2;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import anet.channel.Constants;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.weex_framework.util.a;
import com.taobao.message.kit.threadpool.Coordinator;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.config.TransformerInfo;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.support.TransformerItemAware;
import com.taobao.message.lab.comfrm.support.model.Function2;
import com.taobao.message.lab.comfrm.util.ExecuteLimiter;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes7.dex */
public class StateManager implements ActionDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIRST_DISPATCH_MODE_ALL = 0;
    public static final int FIRST_DISPATCH_MODE_ONLY_IMM = 1;
    private int firstDispatchMode;
    private boolean immediateOpt;
    private final String mClassNamespace;
    private final String mContainerKey;
    private TransformDispatcher mFinalTransformDispatcher;
    private final String mIdentifier;
    private volatile SharedState mImmediateState;
    private TransformDispatcher mImmediateTransformDispatcher;
    private volatile JSTransformDispatcher mJSTransformDispatcher;
    private final ExecuteLimiter<Action> mLimiter;
    private TransformDispatcher mNativeTransformDispatcher;
    private final Plugin mPlugin;
    private volatile SharedState mState;
    private StateListener mStateListener;
    private final TransformerInfo mTransformerInfo;
    private final boolean mUseRemote;
    private volatile boolean mIsFirst = true;
    private boolean strictMerge = false;
    private boolean strictImmediate = false;
    private final StateRuntimeInfo mStateRuntimeInfo = new StateRuntimeInfo();
    private final ExecutorService mTrans = Coordinator.createSaturateExecutorService(1, 1, "MessageS-trans");

    /* loaded from: classes7.dex */
    public interface StateListener {
        void onChanged(Action action, SharedState sharedState);
    }

    /* loaded from: classes7.dex */
    public static class StateRuntimeInfo {
        public int callOnChangedCount = 0;
        public int silentCount = 0;
        public int immCallOnChangedCount = 0;
        public int asyncCallOnChangedCount = 0;

        static {
            kge.a(-1185292164);
        }
    }

    static {
        kge.a(186161341);
        kge.a(341861051);
    }

    public static /* synthetic */ JSTransformDispatcher access$000(StateManager stateManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSTransformDispatcher) ipChange.ipc$dispatch("94a6c52f", new Object[]{stateManager}) : stateManager.mJSTransformDispatcher;
    }

    public static /* synthetic */ String access$100(StateManager stateManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("553d3a34", new Object[]{stateManager}) : stateManager.mContainerKey;
    }

    public static /* synthetic */ boolean access$200(StateManager stateManager, Action action) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ca7326", new Object[]{stateManager, action})).booleanValue() : stateManager.handleActionImmediate(action);
    }

    public static /* synthetic */ void access$300(StateManager stateManager, Action action, List list, boolean z, boolean z2, boolean z3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46fb9484", new Object[]{stateManager, action, list, new Boolean(z), new Boolean(z2), new Boolean(z3), new Long(j)});
        } else {
            stateManager.mergeStateAndCallback(action, list, z, z2, z3, j);
        }
    }

    public static /* synthetic */ boolean access$400(StateManager stateManager, Action action) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6e10a28", new Object[]{stateManager, action})).booleanValue() : stateManager.handleAction(action);
    }

    public static /* synthetic */ boolean access$500(StateManager stateManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f78d6c6c", new Object[]{stateManager})).booleanValue() : stateManager.strictImmediate;
    }

    public void strictMerge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32589ff6", new Object[]{this});
        } else {
            this.strictMerge = true;
        }
    }

    public void strictImmediate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbadb6f", new Object[]{this});
        } else {
            this.strictImmediate = true;
        }
    }

    @IgnoreVirtualThread
    public StateManager(final String str, String str2, TransformerInfo transformerInfo, Map<String, Object> map, final boolean z, Plugin plugin, String str3) {
        this.immediateOpt = false;
        this.firstDispatchMode = 0;
        this.mIdentifier = str;
        this.mContainerKey = str2;
        this.mUseRemote = z;
        this.mPlugin = plugin;
        this.mClassNamespace = str3;
        ((ThreadPoolExecutor) this.mTrans).setKeepAliveTime(Constants.RECV_TIMEOUT, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) this.mTrans).allowCoreThreadTimeOut(true);
        ((ThreadPoolExecutor) this.mTrans).setThreadFactory(new Schedules.HighThreadNameFactory("MessageS-trans"));
        this.mImmediateState = new SharedState(map);
        this.mState = new SharedState(map);
        this.immediateOpt = "1".equals(transformerInfo.immediateOpt);
        this.firstDispatchMode = ValueUtil.getInteger(transformerInfo.firstDispatchMode, 0);
        this.mTransformerInfo = transformerInfo;
        this.mLimiter = new ExecuteLimiter<>(3000, new ExecuteLimiter.DataListCollectFunction(), new ExecuteLimiter.Executor<Action>() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.util.ExecuteLimiter.Executor
            public void execute(List<Action> list, ExecuteLimiter executeLimiter) {
                IpChange ipChange = $ipChange;
                int i = 0;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cf25a2c6", new Object[]{this, list, executeLimiter});
                } else if (list.size() == 1) {
                    StateManager stateManager = StateManager.this;
                    stateManager.asyncTrans(new AsyncTransRunnable(list.get(0), executeLimiter, null));
                } else {
                    List split = ExecuteLimiter.DataListMergeSplit.split(list, new Function2<Action, Action, Boolean>() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.message.lab.comfrm.support.model.Function2
                        public Boolean map(Action action, Action action2) {
                            IpChange ipChange2 = $ipChange;
                            boolean z2 = true;
                            if (ipChange2 instanceof IpChange) {
                                return (Boolean) ipChange2.ipc$dispatch("457d7840", new Object[]{this, action, action2});
                            }
                            if (action == null || action2 == null || !StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName()) || !StdActions.UPDATE_ORIGINAL_DATA.equals(action2.getName())) {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                    });
                    int i2 = 0;
                    while (i2 < split.size()) {
                        List list2 = (List) split.get(i2);
                        Action action = (Action) list2.get(list2.size() - 1);
                        Action action2 = (Action) list2.get(i);
                        HashMap hashMap = (Map) action2.getContext().get("__originalDelta");
                        for (int i3 = 1; i3 < list2.size(); i3++) {
                            Map map2 = (Map) ((Action) list2.get(i3)).getContext().get("__originalDelta");
                            if (map2 != null) {
                                if (hashMap == null) {
                                    hashMap = map2;
                                } else {
                                    HashMap hashMap2 = new HashMap(hashMap);
                                    for (Map.Entry entry : map2.entrySet()) {
                                        Diff.mergeDeltaItem(hashMap2, (String) entry.getKey(), (DeltaItem) entry.getValue(), str, z);
                                    }
                                    hashMap = hashMap2;
                                }
                            }
                        }
                        HashMap hashMap3 = new HashMap();
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            Action action3 = (Action) list2.get(i4);
                            if (action3.getContext() != null) {
                                hashMap3.putAll(action3.getContext());
                            }
                        }
                        hashMap3.put("__originalDelta", hashMap);
                        Action build = new Action.Build(action2.getName()).data(action.getData()).context(hashMap3).build();
                        StateManager stateManager2 = StateManager.this;
                        stateManager2.asyncTrans(new AsyncTransRunnable(build, i2 == split.size() - 1 ? executeLimiter : null, list2));
                        i2++;
                        i = 0;
                    }
                }
            }
        }, false);
    }

    public void initJSEnv(Context context, IResourceManager iResourceManager, Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28cbae7", new Object[]{this, context, iResourceManager, plugin});
        } else if (ApplicationUtil.isDebug() && !StringUtils.isEmpty(this.mTransformerInfo.jsFile) && (this.mTransformerInfo.jsTransformerList == null || this.mTransformerInfo.jsTransformerList.isEmpty())) {
            throw new IllegalStateException("jsTransformerList为空时，不应配置jsFile");
        } else {
            TraceUtil.beginSection("buildJsTransformer");
            if (!StringUtils.isEmpty(this.mTransformerInfo.jsFile)) {
                this.mJSTransformDispatcher = new JSTransformDispatcher(context, this.mContainerKey, this.mTransformerInfo, iResourceManager, this.mTrans, this.mUseRemote, plugin, this.mClassNamespace);
            }
            TraceUtil.endTrace();
        }
    }

    public void setStateListener(StateListener stateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e563f179", new Object[]{this, stateListener});
        } else {
            this.mStateListener = stateListener;
        }
    }

    public SharedState getState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedState) ipChange.ipc$dispatch("d6cbd298", new Object[]{this}) : this.mState;
    }

    @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
    public void dispatch(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
            return;
        }
        if (action.getContext().get("traceId") == null) {
            HashMap hashMap = new HashMap(action.getContext());
            hashMap.put("traceId", Double.valueOf(SystemClock.uptimeMillis() + Math.random()));
            action = new Action.Build(action.getName()).data(action.getData()).context(hashMap).build();
        }
        if (this.strictMerge) {
            if (this.mTransformerInfo.immediateTransformerList == null || this.mTransformerInfo.immediateTransformerList.isEmpty()) {
                asyncTransOrMergePost(action);
            } else if (StdActions.COMPONENT_FIRST.equals(action.getName())) {
                if (VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
                    throw new IllegalArgumentException("firstAction应该运行在mainThread");
                }
                if (this.firstDispatchMode == 1) {
                    Schedules.ui(new ImmediateTransRunnable(action, false, false));
                    return;
                }
                Schedules.ui(new ImmediateTransRunnable(action, true, false));
                asyncTransOrMergePost(action);
            } else if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
                asyncTransOrMergePost(action);
            } else if (action.getContext() != null && action.getContext().containsKey(StdActions.ACTION_OPT_IMMEDIATE)) {
                if (ApplicationUtil.isDebug() && VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
                    throw new IllegalArgumentException("immediate action应该运行在mainThread");
                }
                Schedules.ui(new ImmediateTransRunnable(action, false, !this.immediateOpt));
            } else {
                asyncTransOrMergePost(action);
            }
        } else if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            this.mLimiter.tryExecute(action);
        } else {
            asyncTrans(new AsyncTransRunnable(action, null, null));
        }
    }

    private boolean handleActionImmediate(Action action) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("203400f7", new Object[]{this, action})).booleanValue();
        }
        rebuildImmediateTransformer(this.mTransformerInfo, this.mPlugin);
        SharedState resetDeltaAndInstant = this.mImmediateState.resetDeltaAndInstant();
        SharedState transform = this.mImmediateTransformDispatcher.transform(action, resetDeltaAndInstant);
        if (resetDeltaAndInstant == transform) {
            z = false;
        }
        if (z) {
            this.mImmediateState = transform;
        }
        return z;
    }

    private boolean handleAction(Action action) {
        SharedState sharedState;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43dcd1ec", new Object[]{this, action})).booleanValue();
        }
        rebuildAsyncTransformer(this.mTransformerInfo, this.mPlugin);
        SharedState resetDeltaAndInstant = this.mState.resetDeltaAndInstant();
        if (StdActions.UPDATE_ORIGINAL_DATA.equals(action.getName())) {
            sharedState = resetDeltaAndInstant.updateOriginalData((Map) action.getData(), (Map) action.getContext().get("__originalDelta"));
            HashMap hashMap = new HashMap(action.getContext());
            hashMap.remove("__originalDelta");
            action = new Action.Build(action.getName()).context(hashMap).build();
        } else {
            sharedState = resetDeltaAndInstant;
        }
        SharedState transform = this.mNativeTransformDispatcher.transform(action, sharedState);
        if (this.mJSTransformDispatcher != null) {
            transform = this.mJSTransformDispatcher.transform(action, transform);
        }
        SharedState transform2 = this.mFinalTransformDispatcher.transform(action, transform);
        if (resetDeltaAndInstant == transform2) {
            z = false;
        }
        if (z) {
            this.mState = transform2;
        }
        return z;
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            asyncTrans(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (StateManager.access$000(StateManager.this) == null) {
                    } else {
                        StateManager.access$000(StateManager.this).destory();
                    }
                }
            });
        }
    }

    public boolean isJSAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3db981a1", new Object[]{this})).booleanValue();
        }
        if (this.mJSTransformDispatcher != null) {
            return this.mJSTransformDispatcher.isAvailable();
        }
        return false;
    }

    public void asyncTransOrMergePost(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362f2bdd", new Object[]{this, action});
        } else {
            this.mLimiter.tryExecute(action);
        }
    }

    public void asyncTrans(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe92f11", new Object[]{this, runnable});
        } else if (this.mTrans.isShutdown()) {
        } else {
            this.mTrans.execute(new Schedules.MyRunnable(runnable));
        }
    }

    /* loaded from: classes7.dex */
    public class ImmediateTransRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Action action;
        private final boolean nextAsyncChanged;
        private final boolean silent;

        static {
            kge.a(-311272037);
            kge.a(-1390502639);
        }

        public ImmediateTransRunnable(Action action, boolean z, boolean z2) {
            this.action = action;
            this.silent = z;
            this.nextAsyncChanged = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1006).ext("containerKey", StateManager.access$100(StateManager.this), "action", this.action.getName()).build());
            TraceUtil.beginSection(this.action.getName());
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap(this.action.getContext());
            hashMap.put("stateSubTraceId", hashMap.get("traceId") + StdActions.ACTION_OPT_IMMEDIATE);
            Action build = new Action.Build(this.action.getName()).data(this.action.getData()).context(hashMap).build();
            boolean access$200 = StateManager.access$200(StateManager.this, build);
            TraceUtil.endTrace();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1007).ext("containerKey", StateManager.access$100(StateManager.this), "action", build.getName(), "time", String.valueOf(currentTimeMillis2), StdActions.ACTION_OPT_IMMEDIATE, "1").build());
            if (this.nextAsyncChanged) {
                StateManager stateManager = StateManager.this;
                stateManager.asyncTrans(new AsyncTransRunnable(this.action, null, null));
            }
            StateManager.access$300(StateManager.this, build, null, this.silent, true, access$200, currentTimeMillis2);
        }
    }

    /* loaded from: classes7.dex */
    public class AsyncTransRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Action action;
        private final ExecuteLimiter limiter;
        private final List<Action> mergeBeforeActionList;

        static {
            kge.a(-833535952);
            kge.a(-1390502639);
        }

        public static /* synthetic */ List access$600(AsyncTransRunnable asyncTransRunnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("93b2424b", new Object[]{asyncTransRunnable}) : asyncTransRunnable.mergeBeforeActionList;
        }

        public static /* synthetic */ ExecuteLimiter access$700(AsyncTransRunnable asyncTransRunnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecuteLimiter) ipChange.ipc$dispatch("56a7fbc0", new Object[]{asyncTransRunnable}) : asyncTransRunnable.limiter;
        }

        public AsyncTransRunnable(Action action, ExecuteLimiter executeLimiter, List<Action> list) {
            this.action = action;
            this.limiter = executeLimiter;
            this.mergeBeforeActionList = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecuteLimiter executeLimiter;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1006);
            String[] strArr = new String[6];
            strArr[0] = "containerKey";
            strArr[1] = StateManager.access$100(StateManager.this);
            strArr[2] = "action";
            strArr[3] = this.action.getName();
            strArr[4] = "mergeSize";
            List<Action> list = this.mergeBeforeActionList;
            strArr[5] = list == null ? "0" : String.valueOf(list.size());
            Logger.ftl(point.ext(strArr).build());
            try {
                TraceUtil.beginSection(this.action.getName());
                if (StateManager.access$000(StateManager.this) != null && !StateManager.access$000(StateManager.this).hasInit()) {
                    StateManager.access$000(StateManager.this).init();
                }
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap(this.action.getContext());
                hashMap.put("stateSubTraceId", hashMap.get("traceId"));
                final Action build = new Action.Build(this.action.getName()).data(this.action.getData()).context(hashMap).build();
                final boolean access$400 = StateManager.access$400(StateManager.this, this.action);
                TraceUtil.endTrace();
                final long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1007).ext("containerKey", StateManager.access$100(StateManager.this), "action", build.getName(), "time", String.valueOf(currentTimeMillis2), StdActions.ACTION_OPT_IMMEDIATE, "0").build());
                if (StateManager.access$500(StateManager.this)) {
                    Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.StateManager.AsyncTransRunnable.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            StateManager.access$300(StateManager.this, build, AsyncTransRunnable.access$600(AsyncTransRunnable.this), false, false, access$400, currentTimeMillis2);
                            if (AsyncTransRunnable.access$700(AsyncTransRunnable.this) == null) {
                                return;
                            }
                            AsyncTransRunnable.access$700(AsyncTransRunnable.this).notifyExecuteFinish();
                        }
                    });
                } else {
                    StateManager.access$300(StateManager.this, build, this.mergeBeforeActionList, false, false, access$400, currentTimeMillis2);
                }
            } finally {
                if (!StateManager.access$500(StateManager.this) && (executeLimiter = this.limiter) != null) {
                    executeLimiter.notifyExecuteFinish();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:7:0x0039, B:9:0x0052, B:15:0x005c, B:16:0x005e, B:20:0x0069, B:22:0x0082, B:26:0x0095, B:28:0x00a4, B:27:0x009d, B:30:0x00ad, B:32:0x00b8, B:33:0x00bf, B:35:0x00c1, B:37:0x00c5, B:41:0x00d8, B:42:0x00ea, B:38:0x00cd, B:40:0x00d1, B:21:0x0076, B:17:0x0063), top: B:51:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:7:0x0039, B:9:0x0052, B:15:0x005c, B:16:0x005e, B:20:0x0069, B:22:0x0082, B:26:0x0095, B:28:0x00a4, B:27:0x009d, B:30:0x00ad, B:32:0x00b8, B:33:0x00bf, B:35:0x00c1, B:37:0x00c5, B:41:0x00d8, B:42:0x00ea, B:38:0x00cd, B:40:0x00d1, B:21:0x0076, B:17:0x0063), top: B:51:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:7:0x0039, B:9:0x0052, B:15:0x005c, B:16:0x005e, B:20:0x0069, B:22:0x0082, B:26:0x0095, B:28:0x00a4, B:27:0x009d, B:30:0x00ad, B:32:0x00b8, B:33:0x00bf, B:35:0x00c1, B:37:0x00c5, B:41:0x00d8, B:42:0x00ea, B:38:0x00cd, B:40:0x00d1, B:21:0x0076, B:17:0x0063), top: B:51:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:7:0x0039, B:9:0x0052, B:15:0x005c, B:16:0x005e, B:20:0x0069, B:22:0x0082, B:26:0x0095, B:28:0x00a4, B:27:0x009d, B:30:0x00ad, B:32:0x00b8, B:33:0x00bf, B:35:0x00c1, B:37:0x00c5, B:41:0x00d8, B:42:0x00ea, B:38:0x00cd, B:40:0x00d1, B:21:0x0076, B:17:0x0063), top: B:51:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd A[Catch: all -> 0x00f5, TryCatch #0 {, blocks: (B:7:0x0039, B:9:0x0052, B:15:0x005c, B:16:0x005e, B:20:0x0069, B:22:0x0082, B:26:0x0095, B:28:0x00a4, B:27:0x009d, B:30:0x00ad, B:32:0x00b8, B:33:0x00bf, B:35:0x00c1, B:37:0x00c5, B:41:0x00d8, B:42:0x00ea, B:38:0x00cd, B:40:0x00d1, B:21:0x0076, B:17:0x0063), top: B:51:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void mergeStateAndCallback(com.taobao.message.lab.comfrm.core.Action r6, java.util.List<com.taobao.message.lab.comfrm.core.Action> r7, boolean r8, boolean r9, boolean r10, long r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.StateManager.mergeStateAndCallback(com.taobao.message.lab.comfrm.core.Action, java.util.List, boolean, boolean, boolean, long):void");
    }

    public List<CI<TransformerItem, Transformer>> createObject(List<TransformerItem> list) {
        Iterator<TransformerItem> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ffa7f694", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<TransformerItem> it2 = list.iterator();
            while (it2.hasNext()) {
                TransformerItem next = it2.next();
                if (next.type.equals(a.ATOM_EXT_iterator)) {
                    SplitTransformer splitTransformer = (SplitTransformer) ClassPool.instance().getInstance(next.iterator.split.type, SplitTransformer.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                    boolean z = splitTransformer instanceof TransformerItemAware;
                    if (z) {
                        ((TransformerItemAware) splitTransformer).setTransformerItem(next.iterator.split);
                    }
                    MergeTransformer mergeTransformer = (MergeTransformer) ClassPool.instance().getInstance(next.iterator.merge.type, MergeTransformer.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                    if (z) {
                        ((TransformerItemAware) splitTransformer).setTransformerItem(next.iterator.merge);
                    }
                    HashMap hashMap = new HashMap();
                    Iterator<Map.Entry<String, List<TransformerItem>>> it3 = next.iterator.pool.entrySet().iterator();
                    while (it3.hasNext()) {
                        Map.Entry<String, List<TransformerItem>> next2 = it3.next();
                        ArrayList arrayList2 = new ArrayList();
                        for (TransformerItem transformerItem : next2.getValue()) {
                            Iterator<TransformerItem> it4 = it2;
                            Iterator<Map.Entry<String, List<TransformerItem>>> it5 = it3;
                            IteratorTransformer iteratorTransformer = (IteratorTransformer) ClassPool.instance().getInstance(transformerItem.type, IteratorTransformer.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                            if (iteratorTransformer instanceof TransformerItemAware) {
                                ((TransformerItemAware) iteratorTransformer).setTransformerItem(transformerItem);
                            }
                            arrayList2.add(iteratorTransformer);
                            it2 = it4;
                            it3 = it5;
                        }
                        hashMap.put(next2.getKey(), arrayList2);
                        it2 = it2;
                    }
                    it = it2;
                    arrayList.add(new CI(next, new IteratorDispatchTransformer(next, splitTransformer, mergeTransformer, hashMap)));
                } else {
                    it = it2;
                    Object classPool = ClassPool.instance().getInstance(next.type, Object.class, this.mIdentifier, this.mUseRemote, this.mClassNamespace);
                    if (classPool instanceof TransformerItemAware) {
                        ((TransformerItemAware) classPool).setTransformerItem(next);
                    }
                    if (classPool instanceof DiffTransfomer) {
                        arrayList.add(new CI(next, new DiffDispatchTransfomer((DiffTransfomer) classPool)));
                    } else {
                        arrayList.add(new CI(next, (Transformer) classPool));
                    }
                }
                it2 = it;
            }
        }
        return arrayList;
    }

    /* loaded from: classes7.dex */
    public static class StateTraceSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Action cutAction;
        public long cutDurTime;
        public boolean cutImmediate;
        public List<Action> cutMergeBeforeActionList;
        public boolean cutSilent;
        public SharedState immediateState;
        public SharedState sharedState;

        static {
            kge.a(-587263099);
        }

        public JSONObject toJSON() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("b0ef9c0a", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("immediateState", (Object) this.immediateState.toJSON());
            jSONObject.put("immediateStateDiff", (Object) this.immediateState.getDiff().toJSON());
            jSONObject.put("sharedState", (Object) this.sharedState.toJSON());
            jSONObject.put("sharedStateDiff", (Object) this.sharedState.getDiff().toJSON());
            jSONObject.put("cutAction", (Object) this.cutAction.toJSON());
            JSONArray jSONArray = new JSONArray();
            List<Action> list = this.cutMergeBeforeActionList;
            if (list != null) {
                for (Action action : list) {
                    jSONArray.add(action.toJSON());
                }
            }
            jSONObject.put("cutMergeBeforeActionList", (Object) jSONArray);
            jSONObject.put("cutDurTime", (Object) Long.valueOf(this.cutDurTime));
            jSONObject.put("cutSilent", (Object) Boolean.valueOf(this.cutSilent));
            jSONObject.put("cutImmediate", (Object) Boolean.valueOf(this.cutImmediate));
            return jSONObject;
        }
    }

    public void rebuildImmediateTransformer(TransformerInfo transformerInfo, Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619de031", new Object[]{this, transformerInfo, plugin});
        } else if (!ApplicationUtil.isDebug() && this.mImmediateTransformDispatcher != null) {
        } else {
            TraceUtil.beginSection("buildImmediateTransformer");
            if (transformerInfo.immediateTransformerList != null && transformerInfo.immediateTransformerList.size() > 0) {
                this.mImmediateTransformDispatcher = new TransformDispatcher(createObject(transformerInfo.immediateTransformerList), StdActions.ACTION_OPT_IMMEDIATE, false, plugin);
            } else {
                this.mImmediateTransformDispatcher = null;
            }
            TraceUtil.endTrace();
        }
    }

    public void rebuildAsyncTransformer(TransformerInfo transformerInfo, Plugin plugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daa0f946", new Object[]{this, transformerInfo, plugin});
        } else if (!ApplicationUtil.isDebug() && this.mNativeTransformDispatcher != null) {
        } else {
            TraceUtil.beginSection("buildAsyncTransformer");
            this.mNativeTransformDispatcher = new TransformDispatcher(createObject(transformerInfo.nativeTransformerList), "native", false, plugin);
            this.mFinalTransformDispatcher = new TransformDispatcher(createObject(transformerInfo.finalTransformerList), "finial", true, plugin);
            TraceUtil.endTrace();
        }
    }
}
