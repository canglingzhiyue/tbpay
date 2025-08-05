package com.alibaba.poplayer;

import android.app.Activity;
import android.app.Application;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.manager.ConfigManager;
import com.alibaba.poplayer.factory.a;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.c;
import com.alibaba.poplayer.layermanager.f;
import com.alibaba.poplayer.norm.IConfigAdapter;
import com.alibaba.poplayer.norm.IFaceAdapter;
import com.alibaba.poplayer.norm.INewConfigAdapter;
import com.alibaba.poplayer.norm.IPopLayerViewAdapter;
import com.alibaba.poplayer.norm.IPopLayerViewFactoryAdapter;
import com.alibaba.poplayer.norm.ITriggerAdapter;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.Monitor;
import com.alibaba.poplayer.utils.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bzs;
import tb.cag;
import tb.kge;

/* loaded from: classes.dex */
public class PopLayer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_BROADCAST_ACTION_FIRST_PAGE_READY = "PopFirstPageReady";
    public static final String ACTION_BROADCAST_ACTION_UCPTRACKER = "UCPTracker";
    public static final String ACTION_FRAGMENT_SWITCH = "com.alibaba.poplayer.PopLayer.action.FRAGMENT_SWITCH";
    public static final String ACTION_OUT_CONFIG_UPDATED = "com.alibaba.poplayer.PopLayer.action.out.CONFIG_UPDATED";
    public static final String ACTION_OUT_DISMISS = "com.alibaba.poplayer.PopLayer.action.out.CLOSE";
    public static final String ACTION_OUT_DISPLAY = "com.alibaba.poplayer.PopLayer.action.out.DISPLAY";
    public static final String ACTION_OUT_VIEW_ADDED = "com.alibaba.poplayer.PopLayer.action.out.VIEW_ADDED";
    public static final String ACTION_OUT_VIEW_REMOVED = "com.alibaba.poplayer.PopLayer.action.out.VIEW_REMOVED";
    public static final String ACTION_POP = "com.alibaba.poplayer.PopLayer.action.POP";
    public static final String ACTION_PRE_DEAL_CUSTOM_TRIGGER = "com.alibaba.poplayer.PopLayer.action.PRE_DEAL_CUSTOM_EVENT";
    public static boolean DEBUG = false;
    public static final String EXTRA_KEY_EVENT = "event";
    public static final String EXTRA_KEY_EXTRA_PARAMS = "extra_params";
    public static final String EXTRA_KEY_FRAGMENT_NAME = "fragment_name";
    public static final String EXTRA_KEY_FRAGMENT_NEED_ACTIVITY_PARAM = "fragment_need_activity_param";
    public static final String EXTRA_KEY_FRAGMENT_PARAM = "fragment_param";
    public static final String EXTRA_KEY_PARAM = "param";
    public static final String EXTRA_KEY_TRIGGER_SROUCE = "triggetSrouce";
    public static final String SCHEMA = "poplayer";
    private static PopLayer sPopLayer;
    private static final AtomicBoolean sSetupDone;
    private static final AtomicBoolean sSetupStarted;
    @Monitor.TargetField(name = b.MONITOR_ADAPTER_VERSION)
    private String mAdapterVersion;
    public IConfigAdapter mConfigAdapter;
    @Monitor.TargetField
    private ConfigManager mConfigMgr;
    private Application mContext;
    public final IFaceAdapter mFaceAdapter;
    private ITriggerAdapter mITriggerAdapter;
    @Monitor.TargetField
    private c mLayerMgrAdapter;
    public INewConfigAdapter mNewConfigAdapter;
    @Monitor.TargetField
    private cag mPageTriggerService;
    private IPopLayerViewAdapter mPopLayerViewAdapter;
    private IPopLayerViewFactoryAdapter mPopLayerViewFactoryAdapter;
    @Monitor.TargetField(name = b.MONITOR_TIMEZONE)
    private String mTimeZoneId;
    @Monitor.TargetField
    private InternalTriggerController mTriggerController;
    public final CopyOnWriteArraySet<String> mManualPopPages = new CopyOnWriteArraySet<>();
    @Monitor.TargetField(name = "version")
    private String mVersion = "";

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface PopupAllowedFromFragment {
        String tag() default "";
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface PopupOnlyManually {
        String tag() default "";
    }

    public static /* synthetic */ void lambda$oL6w4xZPZjJ_qARobE6cRd2kLEU(PopLayer popLayer) {
        popLayer.doRelease();
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : "";
    }

    public boolean isValidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b37f77e", new Object[]{this, activity})).booleanValue();
        }
        return true;
    }

    public boolean isValidConfig(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fb6545f", new Object[]{this, baseConfigItem})).booleanValue();
        }
        return true;
    }

    public boolean isValidConfigBeforeMonitor(BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb0152c", new Object[]{this, baseConfigItem})).booleanValue();
        }
        return true;
    }

    public void onPageClean(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fafc2b4", new Object[]{this, activity});
        }
    }

    public void onSwitchedNewPage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62422f38", new Object[]{this, str, str2});
        }
    }

    public List<d> tryOpenRequestControl(List<d> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("234f7d1c", new Object[]{this, list}) : list;
    }

    public static PopLayer getReference() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopLayer) ipChange.ipc$dispatch("283a5adf", new Object[0]) : sPopLayer;
    }

    static {
        kge.a(-1952808402);
        DEBUG = true;
        sSetupStarted = new AtomicBoolean(false);
        sSetupDone = new AtomicBoolean(false);
    }

    public long getCurrentTimeStamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c918edee", new Object[]{this})).longValue() : getCurrentTimeStamp(true);
    }

    public long getCurrentTimeStamp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a05840e", new Object[]{this, new Boolean(z)})).longValue();
        }
        if (z) {
            return this.mFaceAdapter.getCurrentTimeStamp(this.mContext) + (bzs.a().d() * 1000);
        }
        return this.mFaceAdapter.getCurrentTimeStamp(this.mContext);
    }

    public PopLayer(IFaceAdapter iFaceAdapter, IConfigAdapter iConfigAdapter, INewConfigAdapter iNewConfigAdapter, c cVar) {
        this.mFaceAdapter = iFaceAdapter;
        this.mConfigAdapter = iConfigAdapter;
        this.mNewConfigAdapter = iNewConfigAdapter;
        this.mLayerMgrAdapter = cVar;
        if (sPopLayer == null) {
            sPopLayer = this;
        }
    }

    public void setupNew(Application application, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cac3f", new Object[]{this, application, new Boolean(z)});
            return;
        }
        try {
            if (sSetupStarted.getAndSet(true)) {
                com.alibaba.poplayer.utils.c.a("sdkLifeCycle", "", "PopLayer.setup.alreadySetup");
                return;
            }
            this.mContext = application;
            DEBUG = z;
            this.mTriggerController = new InternalTriggerController(application);
            this.mPageTriggerService = cag.i();
            this.mConfigMgr = new ConfigManager(this.mConfigAdapter, this.mNewConfigAdapter);
            this.mConfigMgr.startFetchConfig(false);
            new f(this.mLayerMgrAdapter).b();
            this.mFaceAdapter.registerTrackViewTypes(application);
            sSetupDone.set(true);
        } catch (Throwable th) {
            sSetupStarted.set(false);
            com.alibaba.poplayer.utils.c.a("PopLayer.setupNew.fail.", th);
        }
    }

    public static boolean isSetup() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a30b7a7e", new Object[0])).booleanValue() : sSetupDone.get();
    }

    public void setTriggerAdapter(ITriggerAdapter iTriggerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece0d8c6", new Object[]{this, iTriggerAdapter});
        } else {
            this.mITriggerAdapter = iTriggerAdapter;
        }
    }

    public ITriggerAdapter getTriggerAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITriggerAdapter) ipChange.ipc$dispatch("aa9ef22a", new Object[]{this}) : this.mITriggerAdapter;
    }

    public Activity internalGetCurrentActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2760f452", new Object[]{this}) : this.mTriggerController.e();
    }

    public boolean registerManualPopPage(Class<Activity> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d216203", new Object[]{this, cls})).booleanValue();
        }
        String name = cls.getName();
        boolean add = this.mManualPopPages.add(name);
        com.alibaba.poplayer.utils.c.a("PopLayer.registerManualPopPage?activityClazz=%s.return?add=%s", name, Boolean.valueOf(add));
        return add;
    }

    public boolean isMunualPopPageContains(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebffad0", new Object[]{this, str})).booleanValue() : this.mManualPopPages.contains(str);
    }

    public boolean unregisterManualPopPage(Class<Activity> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c54b215c", new Object[]{this, cls})).booleanValue();
        }
        String name = cls.getName();
        boolean remove = this.mManualPopPages.remove(name);
        com.alibaba.poplayer.utils.c.a("PopLayer.unregisterManualPopPage?activityClazz=%s.return?remove=%s", name, Boolean.valueOf(remove));
        return remove;
    }

    public Application getApp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("f3384fc1", new Object[]{this}) : this.mContext;
    }

    public IFaceAdapter getFaceAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IFaceAdapter) ipChange.ipc$dispatch("6f55f94", new Object[]{this}) : this.mFaceAdapter;
    }

    public ConfigManager getConfigMgr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConfigManager) ipChange.ipc$dispatch("dda06bee", new Object[]{this}) : this.mConfigMgr;
    }

    public final void registerViewType(IPopLayerViewFactoryAdapter iPopLayerViewFactoryAdapter, List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cccce5", new Object[]{this, iPopLayerViewFactoryAdapter, list, str});
            return;
        }
        try {
            this.mPopLayerViewFactoryAdapter = iPopLayerViewFactoryAdapter;
            a.a().a(list, str);
            com.alibaba.poplayer.utils.c.a("PopLayerAction.registerViewType success!", new Object[0]);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerAction.registerViewType fail!", th);
        }
    }

    public void removeRequest(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed71acfe", new Object[]{this, popRequest});
        } else if (popRequest == null) {
        } else {
            cag.i().f(popRequest);
        }
    }

    public void registerPopLayerViewAdapter(IPopLayerViewAdapter iPopLayerViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a526a1b7", new Object[]{this, iPopLayerViewAdapter});
        } else {
            this.mPopLayerViewAdapter = iPopLayerViewAdapter;
        }
    }

    public IPopLayerViewAdapter getPopLayerViewAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopLayerViewAdapter) ipChange.ipc$dispatch("d5d0a064", new Object[]{this}) : this.mPopLayerViewAdapter;
    }

    public IPopLayerViewFactoryAdapter getPopLayerViewFactoryAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopLayerViewFactoryAdapter) ipChange.ipc$dispatch("1ca68cca", new Object[]{this}) : this.mPopLayerViewFactoryAdapter;
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            com.alibaba.poplayer.utils.f.a(new Runnable() { // from class: com.alibaba.poplayer.-$$Lambda$PopLayer$oL6w4xZPZjJ_qARobE6cRd2kLEU
                {
                    PopLayer.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PopLayer.lambda$oL6w4xZPZjJ_qARobE6cRd2kLEU(PopLayer.this);
                }
            });
        }
    }

    public void doRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1443783", new Object[]{this});
            return;
        }
        try {
            String a2 = InternalTriggerController.a();
            cag.i().a(a2, a2, true);
            getReference().onPageClean(internalGetCurrentActivity());
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayer.release.error.", th);
        }
    }

    public Pair<Boolean, String> isValidConfigWithReason(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("19e79c7f", new Object[]{this, dVar}) : new Pair<>(true, "");
    }

    public void setTimeZoneFromGMT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9a12fa", new Object[]{this, str});
        } else {
            this.mTimeZoneId = str;
        }
    }

    public String getTimeZoneFromGMT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3b7f8e64", new Object[]{this}) : this.mTimeZoneId;
    }

    public synchronized Map<String, String> filterFatigue(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b910101c", new Object[]{this, list});
        } else if (!isSetup()) {
            return new HashMap();
        } else {
            return this.mConfigMgr.filterFatigue(list);
        }
    }

    public static synchronized JSONObject queryNowPopCount() {
        synchronized (PopLayer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("5c6731f3", new Object[0]);
            } else if (!isSetup()) {
                return new JSONObject();
            } else {
                return cag.i().b();
            }
        }
    }
}
