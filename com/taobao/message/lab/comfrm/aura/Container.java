package com.taobao.message.lab.comfrm.aura;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.message.kit.core.GlobalContainer;
import com.taobao.message.kit.util.ApplicationBuildInfo;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.MonitorUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.aura.DojoRenderService;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.message.lab.comfrm.devtools.MessageLogPlugin;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.ClassPool;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventManager;
import com.taobao.message.lab.comfrm.inner2.LayoutProtocol;
import com.taobao.message.lab.comfrm.inner2.Plugin;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.inner2.Plugins;
import com.taobao.message.lab.comfrm.inner2.SharedState;
import com.taobao.message.lab.comfrm.inner2.Snapshot;
import com.taobao.message.lab.comfrm.inner2.StateManager;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.config.ConfigManager;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.lazy.LazyInitObjectRef;
import com.taobao.message.lab.comfrm.inner2.plugin.ISnapshotCenter;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.inner2.resource.ResourceManager;
import com.taobao.message.lab.comfrm.render.ViewQueryService;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.verifier.ObjectVerifier;
import com.taobao.message.lab.comfrm.util.BlockingQueueSync;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class Container implements IResourceChangePublisher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int END_STEP_FULL = 0;
    public static int END_STEP_SNAPSHOT = 0;
    private static final String TAG = "AURAContainer";
    private final DojoEventService eventService;
    private Activity mActivity;
    private final String mBizConfigCode;
    private final String mClassNamespace;
    private int mCntStep;
    private final ConfigInfo mConfigInfo;
    private final String mContainerKey;
    private final LazyInitObjectRef<DojoPageContext> mDojoPageContextRef;
    private EventManager mEventManager;
    private boolean mFinishLoadStateAndObject;
    private boolean mFinishSendFirsstAction;
    private final String mIdentifier;
    private final Map<Class, Object> mInjectServicePool;
    private LockOnGlobalLayoutListener mLockOnGlobalLayoutListener;
    private final Plugins mPlugins;
    private final Map<String, Object> mProps;
    private WidgetRenderImpl mRender;
    private WidgetRenderImpl.RenderConfig mRenderConfig;
    private Map<String, Object> mRenderContext;
    private final IResourceManager mResourceManager;
    private Snapshot mSnapshot;
    private boolean mUseRemote;
    private Snapshot.SnapshotData mUseSuccessSnapshotData;
    private final String mVersion;
    private final BlockingQueueSync mViewFirstLock;
    private final DojoRenderService renderService;
    private final DojoSourceService sourceService;
    private final DojoStateService stateService;
    private final DojoTemplateService templateService;

    public static /* synthetic */ DojoStateService access$000(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DojoStateService) ipChange.ipc$dispatch("4996dbe2", new Object[]{container}) : container.stateService;
    }

    public static /* synthetic */ DojoTemplateService access$100(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DojoTemplateService) ipChange.ipc$dispatch("204dd434", new Object[]{container}) : container.templateService;
    }

    public static /* synthetic */ WidgetRenderImpl access$1000(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetRenderImpl) ipChange.ipc$dispatch("f39df7de", new Object[]{container}) : container.mRender;
    }

    public static /* synthetic */ void access$1100(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc8ceef", new Object[]{container});
        } else {
            container.tryDisposeLockGlobalListener();
        }
    }

    public static /* synthetic */ Activity access$1200(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("28ee0038", new Object[]{container}) : container.mActivity;
    }

    public static /* synthetic */ BlockingQueueSync access$1300(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueueSync) ipChange.ipc$dispatch("9bb33578", new Object[]{container}) : container.mViewFirstLock;
    }

    public static /* synthetic */ Plugins access$1400(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Plugins) ipChange.ipc$dispatch("49646594", new Object[]{container}) : container.mPlugins;
    }

    public static /* synthetic */ DojoRenderService access$200(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DojoRenderService) ipChange.ipc$dispatch("eef6f76f", new Object[]{container}) : container.renderService;
    }

    public static /* synthetic */ DojoEventService access$300(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DojoEventService) ipChange.ipc$dispatch("a24359ee", new Object[]{container}) : container.eventService;
    }

    public static /* synthetic */ DojoSourceService access$400(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DojoSourceService) ipChange.ipc$dispatch("e71d4332", new Object[]{container}) : container.sourceService;
    }

    public static /* synthetic */ Snapshot access$500(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Snapshot) ipChange.ipc$dispatch("6a2de830", new Object[]{container}) : container.mSnapshot;
    }

    public static /* synthetic */ String access$600(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a229bbbb", new Object[]{container}) : container.mVersion;
    }

    public static /* synthetic */ Snapshot.SnapshotData access$700(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Snapshot.SnapshotData) ipChange.ipc$dispatch("e5ef8692", new Object[]{container}) : container.mUseSuccessSnapshotData;
    }

    public static /* synthetic */ String access$800(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13ea7cf9", new Object[]{container}) : container.mBizConfigCode;
    }

    public static /* synthetic */ ConfigInfo access$900(Container container) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigInfo) ipChange.ipc$dispatch("a63a0001", new Object[]{container}) : container.mConfigInfo;
    }

    static {
        kge.a(603923911);
        kge.a(-1291622795);
        END_STEP_SNAPSHOT = 1;
        END_STEP_FULL = Integer.MAX_VALUE;
    }

    public Container(Activity activity, String str, String str2, Map<String, Object> map) {
        this(activity.getIntent(), str, (String) null, str2, map, (String) null);
        attachPage(activity);
    }

    public Container(Activity activity, String str, String str2, String str3, Map<String, Object> map) {
        this(activity.getIntent(), str, str2, str3, map, (String) null);
        attachPage(activity);
    }

    public Container(Activity activity, String str, String str2) {
        this(activity.getIntent(), str, (String) null, str2, (Map<String, Object>) null, (String) null);
        attachPage(activity);
    }

    public Container(Activity activity, String str, String str2, String str3, Map<String, Object> map, String str4) {
        this(activity.getIntent(), str, str2, str3, map, str4);
        attachPage(activity);
    }

    public Container(Intent intent, String str, String str2, String str3, Map<String, Object> map, String str4) {
        Set<String> queryParameterNames;
        this.mInjectServicePool = new HashMap(0);
        this.mUseRemote = false;
        this.mCntStep = 0;
        this.mFinishSendFirsstAction = false;
        this.mFinishLoadStateAndObject = false;
        this.mResourceManager = new ResourceManager();
        this.mClassNamespace = str4;
        this.mIdentifier = str3;
        this.mBizConfigCode = str;
        this.mVersion = str2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.mBizConfigCode);
        sb.append(".");
        String str5 = this.mVersion;
        sb.append(str5 == null ? "" : str5);
        sb.append(".aura.");
        sb.append(ComponentFrmModule.uniqueKey());
        this.mContainerKey = sb.toString();
        this.mConfigInfo = new ConfigManager(this.mResourceManager).getConfig(str, this.mVersion);
        this.mPlugins = new Plugins(this.mContainerKey, this.mIdentifier, this.mBizConfigCode, this.mVersion, this.mConfigInfo);
        this.mPlugins.addPlugin(new MessageLogPlugin(this.mContainerKey));
        try {
            if (ApplicationUtil.isDebug()) {
                Class.forName("com.taobao.android.dinamicx.devtools.jsonrpc.mapping.ObjectMapper");
                Plugin plugin = (Plugin) Class.forName("com.taobao.message.lab.comfrm.inner2.DevToolsPlugin").newInstance();
                if (plugin != null) {
                    this.mPlugins.addPlugin(plugin);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
        this.mProps = new HashMap(this.mConfigInfo.props);
        Uri data = intent != null ? intent.getData() : null;
        if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str6 : queryParameterNames) {
                this.mProps.put(str6, data.getQueryParameter(str6));
            }
        }
        if (map != null) {
            this.mProps.putAll(map);
        }
        this.mProps.put("auraContainerKey", this.mContainerKey);
        TraceUtil.beginSection("pipeInit");
        Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1201);
        String[] strArr = new String[4];
        strArr[0] = MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE;
        strArr[1] = this.mBizConfigCode;
        strArr[2] = "snapshot";
        strArr[3] = this.mSnapshot == null ? "0" : "1";
        Logger.ftl(point.ext(strArr).build());
        DojoContext dojoContext = new DojoContext();
        dojoContext.containerKey = this.mContainerKey;
        dojoContext.props = this.mProps;
        dojoContext.bizConfigCode = this.mBizConfigCode;
        dojoContext.version = this.mVersion;
        dojoContext.configInfo = this.mConfigInfo;
        dojoContext.plugin = this.mPlugins;
        dojoContext.identifier = this.mIdentifier;
        dojoContext.useRemote = this.mUseRemote;
        dojoContext.resourceManager = this.mResourceManager;
        dojoContext.classNamespace = this.mClassNamespace;
        this.mDojoPageContextRef = new LazyInitObjectRef<>();
        this.mViewFirstLock = new BlockingQueueSync();
        this.sourceService = new DojoSourceService(dojoContext, this.mPlugins, new ActionDispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
            public void dispatch(Action action) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                } else {
                    Container.access$000(Container.this).dispatch(action);
                }
            }
        });
        this.stateService = new DojoStateService(dojoContext, this.mPlugins, new StateManager.StateListener() { // from class: com.taobao.message.lab.comfrm.aura.Container.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.StateManager.StateListener
            public void onChanged(Action action, SharedState sharedState) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("587fd455", new Object[]{this, action, sharedState});
                } else {
                    Container.access$200(Container.this).renderConsume(Container.access$100(Container.this).onExecute(sharedState, ValueUtil.getString(action.getContext(), "stateSubTraceId")));
                }
            }
        });
        this.templateService = new DojoTemplateService(dojoContext, this.mPlugins);
        this.renderService = new DojoRenderService(dojoContext, this.mDojoPageContextRef, this.mViewFirstLock, new DojoRenderService.Dispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.aura.DojoRenderService.Dispatcher
            public void dispatch(ViewObject viewObject, Event event) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f86f7b71", new Object[]{this, viewObject, event});
                } else {
                    Container.access$300(Container.this).onExecute(viewObject.sharedState, event);
                }
            }
        });
        this.eventService = new DojoEventService(dojoContext, this.mDojoPageContextRef, new ActionDispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
            public void dispatch(Action action) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("865d606c", new Object[]{this, action});
                } else {
                    Container.access$000(Container.this).dispatch(action);
                }
            }
        }, new CommandHandler() { // from class: com.taobao.message.lab.comfrm.aura.Container.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.CommandHandler
            public void handle(Command command) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("db6b56d4", new Object[]{this, command});
                } else {
                    Container.access$400(Container.this).onExecute(command);
                }
            }
        });
        TraceUtil.endTrace();
    }

    public void setUseRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4262fa2", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseRemote = z;
        }
    }

    public boolean isResourceChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ddea2c7", new Object[]{this})).booleanValue();
        }
        IResourceManager iResourceManager = this.mResourceManager;
        if (iResourceManager == null) {
            return false;
        }
        return iResourceManager.isResourceChanged();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f0d3f5", new Object[]{this, iResourceChangeObserver});
            return;
        }
        IResourceManager iResourceManager = this.mResourceManager;
        if (iResourceManager == null) {
            return;
        }
        iResourceManager.subscribeResourceChange(iResourceChangeObserver);
    }

    public void attachPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddabfe0d", new Object[]{this, activity});
        } else if (ApplicationUtil.isDebug() && VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("非主线程调用Container.attachPage");
        } else {
            Activity activity2 = this.mActivity;
            if (activity2 == null) {
                this.mActivity = activity;
            } else if (activity2 != activity) {
                throw new IllegalArgumentException("重复使用不同Activity初始化");
            }
        }
    }

    public void enableSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a45256e", new Object[]{this});
            return;
        }
        ISnapshotCenter iSnapshotCenter = (ISnapshotCenter) GlobalContainer.getInstance().get(ISnapshotCenter.class, this.mIdentifier, "");
        if (iSnapshotCenter == null) {
            return;
        }
        this.mSnapshot = iSnapshotCenter.getSnapshot(this.mBizConfigCode);
        addPlugin(new PluginAdapter() { // from class: com.taobao.message.lab.comfrm.aura.Container.6
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private SharedState buildSharedState;

            @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
            public void onBuildViewObjectStart(LayoutInfo layoutInfo, SharedState sharedState) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("28490da5", new Object[]{this, layoutInfo, sharedState});
                } else {
                    this.buildSharedState = sharedState;
                }
            }

            @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
            public void onBuildViewObjectEnd(ViewObject viewObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b66a91f0", new Object[]{this, viewObject});
                    return;
                }
                if (Container.access$500(Container.this) != null && viewObject != null && viewObject.isStateLoadSourceReady) {
                    Container.access$500(Container.this).saveSnapshot(Container.access$600(Container.this), viewObject, this.buildSharedState);
                }
                this.buildSharedState = null;
            }
        });
    }

    public void saveSnapshotToDiskForce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2355179", new Object[]{this});
            return;
        }
        Snapshot snapshot = this.mSnapshot;
        if (snapshot == null) {
            return;
        }
        snapshot.saveSnapshotToDiskForce();
    }

    public void addPlugin(Plugin plugin) {
        LazyInitObjectRef<DojoPageContext> lazyInitObjectRef;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8e2512", new Object[]{this, plugin});
        } else if (ApplicationUtil.isDebug() && (lazyInitObjectRef = this.mDojoPageContextRef) != null && lazyInitObjectRef.isInit()) {
            throw new RuntimeException("registerService must precede call start()");
        } else {
            this.mPlugins.addPlugin(plugin);
        }
    }

    public <T> void registerService(Class<T> cls, T t) {
        LazyInitObjectRef<DojoPageContext> lazyInitObjectRef;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aaa520", new Object[]{this, cls, t});
        } else if (ApplicationUtil.isDebug() && (lazyInitObjectRef = this.mDojoPageContextRef) != null && lazyInitObjectRef.isInit()) {
            throw new RuntimeException("registerService must precede call start()");
        } else {
            this.mInjectServicePool.put(cls, t);
        }
    }

    public void setRenderContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("659d34c7", new Object[]{this, map});
        } else {
            this.mRenderContext = map;
        }
    }

    public void setRenderConfig(WidgetRenderImpl.RenderConfig renderConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e835cd5", new Object[]{this, renderConfig});
        } else {
            this.mRenderConfig = renderConfig;
        }
    }

    public EventManager preCreateEventMananger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventManager) ipChange.ipc$dispatch("bf07d5cc", new Object[]{this});
        }
        this.mEventManager = new EventManager(this.mIdentifier, this.mContainerKey, this.mResourceManager, this.mUseRemote, this.mConfigInfo.event == null ? null : this.mConfigInfo.event.jsFiles, this.mPlugins, this.mClassNamespace);
        return this.mEventManager;
    }

    public ViewQueryService getViewQueryService() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewQueryService) ipChange.ipc$dispatch("c4a428e7", new Object[]{this}) : this.mRender;
    }

    public void initSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4429452", new Object[]{this});
        } else if (this.mFinishLoadStateAndObject) {
        } else {
            TraceUtil.beginSection(StdActions.COMMAND_INIT_SOURCE);
            this.sourceService.onExecute(new Command.Build(null, StdActions.COMMAND_INIT_SOURCE).build());
            TraceUtil.endTrace();
            this.mFinishLoadStateAndObject = true;
        }
    }

    public void sendFirstAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4eef1e5", new Object[]{this});
        } else if (this.mFinishSendFirsstAction) {
        } else {
            TraceUtil.beginSection("sendFirstAction");
            this.stateService.dispatch(new Action.Build(StdActions.COMPONENT_FIRST).build());
            TraceUtil.endTrace();
            this.mFinishSendFirsstAction = true;
        }
    }

    public void start(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e50928", new Object[]{this, viewGroup});
        } else {
            stepStart(viewGroup, false, END_STEP_FULL, null);
        }
    }

    public void start(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abcceac", new Object[]{this, viewGroup, new Boolean(z)});
        } else {
            stepStart(viewGroup, z, END_STEP_FULL, null);
        }
    }

    public void stepStart(ViewGroup viewGroup, boolean z, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904410ba", new Object[]{this, viewGroup, new Boolean(z), new Integer(i), map});
        } else if (ApplicationUtil.isDebug() && VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("非主线程调用start或stepStart");
        } else {
            if (this.mCntStep == END_STEP_FULL) {
                if (ApplicationUtil.isDebug()) {
                    throw new RuntimeException("Container重复初始化");
                }
            } else if (this.mActivity == null) {
                throw new IllegalStateException("调用stepStart之前，需要先绑定Activity");
            } else {
                Logger.FormatLog.Builder point = new Logger.FormatLog.Builder().type(0).module(16).point(1001);
                String[] strArr = new String[6];
                strArr[0] = MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE;
                strArr[1] = this.mBizConfigCode;
                strArr[2] = "snapshot";
                strArr[3] = this.mSnapshot == null ? "0" : "1";
                strArr[4] = "endStep";
                strArr[5] = String.valueOf(i);
                Logger.ftl(point.ext(strArr).build());
                if (map != null) {
                    if (ApplicationUtil.isDebug()) {
                        if (this.mFinishLoadStateAndObject) {
                            throw new RuntimeException("loadStateAndObject已经执行，source开始访问props后不允许修改");
                        }
                        if (this.mFinishSendFirsstAction) {
                            throw new RuntimeException("sendFirsstAction，state.props对外暴露后不允许修改");
                        }
                    }
                    this.mProps.putAll(map);
                }
                int i2 = this.mCntStep;
                int i3 = END_STEP_SNAPSHOT;
                if (i2 < i3 && i >= i3) {
                    this.mPlugins.onContainerStartStart(this.mContainerKey, this.mBizConfigCode, this.mVersion);
                    if (viewGroup.getChildCount() > 0) {
                        throw new IllegalArgumentException("container|start|containerView has childView");
                    }
                    this.mRender = new WidgetRenderImpl(this.mIdentifier, this.mActivity, this.mClassNamespace);
                    if (viewGroup.getChildCount() == 0) {
                        Map<String, Object> map2 = this.mRenderContext;
                        if (map2 != null) {
                            this.mRender.setRenderContext(Collections.unmodifiableMap(new HashMap(map2)));
                        }
                        WidgetRenderImpl.RenderConfig renderConfig = this.mRenderConfig;
                        if (renderConfig != null) {
                            this.mRender.setRenderConfig(renderConfig);
                        }
                        this.mRender.setPlugin(this.mPlugins);
                        this.mRender.setUseRemote(this.mUseRemote);
                        viewGroup.addView(this.mRender.mo1139getView(), -1, -1);
                    }
                    DojoPageContext dojoPageContext = new DojoPageContext();
                    dojoPageContext.mainRender = this.mRender;
                    if (this.mEventManager == null) {
                        preCreateEventMananger();
                        if (i == END_STEP_SNAPSHOT) {
                            this.mEventManager.enterOnlyWeakDependence();
                        }
                    }
                    this.mInjectServicePool.put(ViewQueryService.class, this.mRender);
                    dojoPageContext.activity = this.mActivity;
                    dojoPageContext.eventManager = this.mEventManager;
                    dojoPageContext.injectServicePool = this.mInjectServicePool;
                    this.mDojoPageContextRef.initObject(dojoPageContext);
                    final EventDispatcher eventDispatcher = new EventDispatcher() { // from class: com.taobao.message.lab.comfrm.aura.Container.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.message.lab.comfrm.core.EventDispatcher
                        public void dispatch(Event event) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("4e55a714", new Object[]{this, event});
                                return;
                            }
                            TraceUtil.beginSection("Snapshot-Event-", event.getName());
                            Container.access$300(Container.this).executeSnapshotEvent((WrapperEvent) event, Container.access$700(Container.this) != null ? Container.access$700(Container.this).preBindData : new HashMap<>());
                            TraceUtil.endTrace();
                        }
                    };
                    this.mUseSuccessSnapshotData = renderSnapshot(eventDispatcher);
                    if (this.mUseSuccessSnapshotData == null && i == END_STEP_SNAPSHOT) {
                        Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.Container.8
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1002).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$800(Container.this)).build());
                                Container.access$1000(Container.this).render(LayoutProtocol.buildViewObject(Container.access$900(Container.this).layout, new HashMap(), null, true), eventDispatcher);
                            }
                        });
                    }
                    this.mCntStep = END_STEP_SNAPSHOT;
                }
                int i4 = this.mCntStep;
                int i5 = END_STEP_FULL;
                if (i4 < i5 && i >= i5) {
                    initSource();
                    if (this.mUseSuccessSnapshotData == null) {
                        sendFirstAction();
                    }
                    boolean isFeatureOpened = ABGlobal.isFeatureOpened(this.mActivity, "messageDelayVSyncResume");
                    if (!isFeatureOpened) {
                        if (ABGlobal.isFeatureOpened(this.mActivity, "postRESUME_RENDER")) {
                            UIHandler.postFront(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.Container.9
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        Container.this.postEvent(new Event.Build(StdActions.RESUME_RENDER).build());
                                    }
                                }
                            });
                        } else {
                            postEvent(new Event.Build(StdActions.RESUME_RENDER).build());
                        }
                    }
                    TraceUtil.beginSection("awaitRender");
                    this.mLockOnGlobalLayoutListener = new LockOnGlobalLayoutListener(this.mViewFirstLock, z, isFeatureOpened);
                    this.mActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.mLockOnGlobalLayoutListener);
                    TraceUtil.endTrace();
                    this.mEventManager.tryExitOnlyWeakDependence();
                    this.mCntStep = END_STEP_FULL;
                }
                this.mPlugins.onContainerStartEnd(this.mConfigInfo);
            }
        }
    }

    private Snapshot.SnapshotData renderSnapshot(final EventDispatcher eventDispatcher) {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Snapshot.SnapshotData) ipChange.ipc$dispatch("fdd5364b", new Object[]{this, eventDispatcher});
        }
        Snapshot snapshot = this.mSnapshot;
        if (snapshot != null) {
            final Snapshot.SnapshotData snapshotData = snapshot.getSnapshotData();
            if (snapshotData != null) {
                if (!TextUtils.equals(snapshotData.version, this.mVersion) || !TextUtils.equals(snapshotData.viewObject.info.uniqueId, this.mConfigInfo.layout.uniqueId)) {
                    z = false;
                }
                if (!TextUtils.equals(snapshotData.appVersion, ApplicationBuildInfo.getAppVersionName())) {
                    String value = ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "disableSnapshotAppVers", null);
                    if (!TextUtils.isEmpty(value)) {
                        try {
                            parseArray = JSON.parseArray(value);
                        } catch (Throwable unused) {
                        }
                        if (parseArray != null && parseArray.contains(ApplicationBuildInfo.getAppVersionName())) {
                            Logger.e(TAG, "disableSnapshotAppVers|snapshotDataVersion|" + snapshotData.version + "|version|" + this.mVersion + "|snapshotDataAppVersion|" + snapshotData.appVersion + "|appVersion|" + ApplicationBuildInfo.getAppVersionName() + "|config|" + value);
                            z = false;
                        }
                    }
                    parseArray = null;
                    if (parseArray != null) {
                        Logger.e(TAG, "disableSnapshotAppVers|snapshotDataVersion|" + snapshotData.version + "|version|" + this.mVersion + "|snapshotDataAppVersion|" + snapshotData.appVersion + "|appVersion|" + ApplicationBuildInfo.getAppVersionName() + "|config|" + value);
                        z = false;
                    }
                }
                if (z) {
                    Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.Container.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1002).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, Container.access$800(Container.this)).build());
                            Container.access$1000(Container.this).render(snapshotData.viewObject, eventDispatcher);
                        }
                    });
                    return snapshotData;
                }
                this.mSnapshot.clear();
                Logger.e(TAG, "SnapshotClear|");
            } else {
                Logger.ftl(new Logger.FormatLog.Builder().type(0).module(16).point(1014).ext(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE, this.mBizConfigCode).build());
            }
        }
        return null;
    }

    public void postEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3784874", new Object[]{this, event});
            return;
        }
        DojoRenderService dojoRenderService = this.renderService;
        if (dojoRenderService == null) {
            return;
        }
        dojoRenderService.dispatch(event);
    }

    public void updateState(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa6b5de", new Object[]{this, action});
            return;
        }
        DojoStateService dojoStateService = this.stateService;
        if (dojoStateService == null) {
            return;
        }
        dojoStateService.dispatch(action);
    }

    public void notifyCommand(Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280c59ee", new Object[]{this, command});
            return;
        }
        DojoSourceService dojoSourceService = this.sourceService;
        if (dojoSourceService == null) {
            return;
        }
        dojoSourceService.onExecute(command);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else if (ApplicationUtil.isDebug() && VExecutors.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("非主线程调用dispose");
        } else {
            tryDisposeLockGlobalListener();
            DojoSourceService dojoSourceService = this.sourceService;
            if (dojoSourceService != null) {
                dojoSourceService.onDestroy();
            }
            DojoStateService dojoStateService = this.stateService;
            if (dojoStateService != null) {
                dojoStateService.onDestroy();
            }
            DojoEventService dojoEventService = this.eventService;
            if (dojoEventService != null) {
                dojoEventService.onDestroy();
            }
            if (this.mRender != null) {
                Logger.e("EventManager", "dispose Container mRender");
                Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.aura.Container.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Logger.e("EventManager", "dispose Container mRender2222");
                        if (Container.access$1000(Container.this) == null) {
                            return;
                        }
                        Container.access$1000(Container.this).dispose();
                    }
                });
            } else {
                Logger.e("EventManager", "skip dispose Container mRender");
            }
            if (this.mEventManager != null) {
                Logger.e("EventManager", "dispose Container mEventManager");
                this.mEventManager.dispose();
            } else {
                Logger.e("EventManager", "skip dispose Container mEventManager");
            }
            this.mResourceManager.dispose();
            Plugins plugins = this.mPlugins;
            if (plugins != null) {
                plugins.onContainerDisposeFinished();
            }
            ObjectVerifier.check();
            ClassPool.instance().check();
        }
    }

    private void tryDisposeLockGlobalListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("451040d", new Object[]{this});
            return;
        }
        Activity activity = this.mActivity;
        if (activity == null || this.mLockOnGlobalLayoutListener == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
        if (Build.VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.mLockOnGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mLockOnGlobalLayoutListener);
        }
        this.mLockOnGlobalLayoutListener = null;
    }

    /* loaded from: classes7.dex */
    public class LockOnGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final boolean awaitViewFirstLock;
        private final BlockingQueueSync finalViewFirstLock;
        private final boolean messageDelayVSyncResume;

        static {
            kge.a(1434978600);
            kge.a(300785761);
        }

        public LockOnGlobalLayoutListener(BlockingQueueSync blockingQueueSync, boolean z, boolean z2) {
            this.finalViewFirstLock = blockingQueueSync;
            this.awaitViewFirstLock = z;
            this.messageDelayVSyncResume = z2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            Container.access$1100(Container.this);
            if (this.messageDelayVSyncResume) {
                Container.this.postEvent(new Event.Build(StdActions.RESUME_RENDER).build());
            }
            if (this.awaitViewFirstLock) {
                if (ABGlobal.isFeatureOpened(Container.access$1200(Container.this), "auraNeedWait")) {
                    Container.access$1300(Container.this).noUse();
                    return;
                }
                boolean await = this.finalViewFirstLock.await(500L);
                if (!await) {
                    Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-503").errMsg("viewFirstLock timeout").build());
                    MonitorUtil.commitCount(Constants.Monitor.MODULE_MONITOR, "viewFirstLock", 1.0d);
                }
                Container.access$1400(Container.this).onAwaitFinished(await);
                return;
            }
            Container.access$1300(Container.this).noUse();
        }
    }

    public String getContainerKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e9b82e5", new Object[]{this}) : this.mContainerKey;
    }
}
