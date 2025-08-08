package com.taobao.weex;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.ClassLoaderAdapter;
import com.taobao.weex.adapter.DefaultUriAdapter;
import com.taobao.weex.adapter.DefaultWXHttpAdapter;
import com.taobao.weex.adapter.ICrashInfoReporter;
import com.taobao.weex.adapter.IDrawableLoader;
import com.taobao.weex.adapter.ITracingAdapter;
import com.taobao.weex.adapter.IWXAccessibilityRoleAdapter;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.adapter.IWXCoreLoader;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.adapter.IWXInitTaskAdapter;
import com.taobao.weex.adapter.IWXJSEngineManager;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.adapter.IWXJsFileLoaderAdapter;
import com.taobao.weex.adapter.IWXJscProcessManager;
import com.taobao.weex.adapter.IWXSoLoaderAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.taobao.weex.adapter.URIAdapter;
import com.taobao.weex.common.WXRefreshData;
import com.taobao.weex.common.WXRuntimeException;
import com.taobao.weex.common.WXThread;
import com.taobao.weex.common.WXWorkThreadManager;
import com.taobao.weex.remote.IWXBridgeManager;
import com.taobao.weex.ui.WXRenderManager;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.rjc;

/* loaded from: classes.dex */
public class WXSDKManager implements com.taobao.weex.remote.a<IWXBridgeManager> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_VIEWPORT_WIDTH = 750;
    private static volatile boolean isUseSingleProcess;
    private static AtomicInteger sInstanceId;
    private static volatile WXSDKManager sManager;
    private com.taobao.weex.appfram.navigator.a mActivityNavBarSetter;
    private Map<String, WXSDKInstance> mAllInstanceMap;
    private com.taobao.weex.performance.a mApmGenerater;
    private IWXBridgeManager mBridgeManager;
    private ClassLoaderAdapter mClassLoaderAdapter;
    private IWXConfigAdapter mConfigAdapter;
    private ICrashInfoReporter mCrashInfo;
    private IDrawableLoader mDrawableLoader;
    private rjc mFontAdapter;
    private IWXHttpAdapter mIWXHttpAdapter;
    private IWXImgLoaderAdapter mIWXImgLoaderAdapter;
    private IWXJSExceptionAdapter mIWXJSExceptionAdapter;
    private IWXSoLoaderAdapter mIWXSoLoaderAdapter;
    private com.taobao.weex.appfram.storage.b mIWXStorageAdapter;
    private IWXUserTrackAdapter mIWXUserTrackAdapter;
    private com.taobao.weex.appfram.websocket.b mIWebSocketAdapterFactory;
    private List<a> mInitListeners;
    private volatile int mJsEngineType;
    private List<b> mLifeCycleCallbacks;
    private com.taobao.weex.appfram.navigator.b mNavigator;
    private boolean mNeedInitV8;
    private com.taobao.weex.performance.d mRecorderGenerator;
    private IWXAccessibilityRoleAdapter mRoleAdapter;
    private e mStatisticsListener;
    private ITracingAdapter mTracingAdapter;
    private URIAdapter mURIAdapter;
    private List<com.taobao.weex.performance.b> mWXAnalyzerList;
    private IWXCoreLoader mWXCoreLoader;
    private IWXFoldDeviceAdapter mWXFoldDeviceAdapter;
    private IWXInitTaskAdapter mWXInitTaskAdapter;
    private IWXJSEngineManager mWXJSEngineManager;
    private IWXJsFileLoaderAdapter mWXJsFileLoaderAdapter;
    private IWXJscProcessManager mWXJscProcessManager;
    public WXRenderManager mWXRenderManager;
    private final WXWorkThreadManager mWXWorkThreadManager;

    /* loaded from: classes9.dex */
    public interface a {
        void a(String str, String str2);

        void onInitSuccess();
    }

    /* loaded from: classes9.dex */
    public interface b {
    }

    public void onSDKEngineInitialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adcfdd74", new Object[]{this});
        }
    }

    static {
        kge.a(-2039254705);
        kge.a(-498835886);
        sInstanceId = new AtomicInteger(0);
        isUseSingleProcess = false;
    }

    public IWXInitTaskAdapter getWXInitTaskAdapter() {
        if (this.mWXInitTaskAdapter == null) {
            try {
                this.mWXInitTaskAdapter = (IWXInitTaskAdapter) Class.forName("com.taobao.weex.adapter.WXInitAdapter").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
            }
        }
        return this.mWXInitTaskAdapter;
    }

    public void setWXInitTaskAdapter(IWXInitTaskAdapter iWXInitTaskAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f18462", new Object[]{this, iWXInitTaskAdapter});
        } else {
            this.mWXInitTaskAdapter = iWXInitTaskAdapter;
        }
    }

    private WXSDKManager() {
        this(new WXRenderManager());
    }

    private WXSDKManager(WXRenderManager wXRenderManager) {
        this.mWXFoldDeviceAdapter = null;
        this.mNeedInitV8 = true;
        this.mJsEngineType = 0;
        this.mWXRenderManager = wXRenderManager;
        this.mWXWorkThreadManager = new WXWorkThreadManager();
        this.mWXAnalyzerList = new CopyOnWriteArrayList();
        this.mAllInstanceMap = new HashMap();
        this.mInitListeners = new CopyOnWriteArrayList();
    }

    public static void initInstance(WXRenderManager wXRenderManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920225a5", new Object[]{wXRenderManager});
        } else {
            sManager = new WXSDKManager(wXRenderManager);
        }
    }

    public void registerStatisticsListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49abf956", new Object[]{this, eVar});
        } else {
            this.mStatisticsListener = eVar;
        }
    }

    public e getWXStatisticsListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9668d07c", new Object[]{this}) : this.mStatisticsListener;
    }

    public void setInitListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673571d0", new Object[]{this, aVar});
        } else if (WXSDKEngine.isInitialized()) {
            WXLogUtils.e("onInitSuccess");
            aVar.onInitSuccess();
        } else {
            WXLogUtils.e("wait init success");
            this.mInitListeners.add(aVar);
        }
    }

    public void removeInitListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49dd21f2", new Object[]{this, aVar});
        } else if (!this.mInitListeners.contains(aVar)) {
        } else {
            this.mInitListeners.remove(aVar);
        }
    }

    public void notifyInitSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80690951", new Object[]{this});
            return;
        }
        WXLogUtils.e("notifyInitSuccess");
        for (a aVar : this.mInitListeners) {
            aVar.onInitSuccess();
        }
        this.mInitListeners.clear();
    }

    public void setNeedInitV8(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65794383", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedInitV8 = z;
        }
    }

    public boolean needInitV8() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e15ce873", new Object[]{this})).booleanValue() : this.mNeedInitV8;
    }

    public static WXSDKManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKManager) ipChange.ipc$dispatch("29225cc4", new Object[0]);
        }
        if (sManager == null) {
            synchronized (WXSDKManager.class) {
                if (sManager == null) {
                    sManager = new WXSDKManager();
                }
            }
        }
        return sManager;
    }

    public static int getInstanceViewPortWidth(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e944119", new Object[]{str})).intValue();
        }
        WXSDKInstance sDKInstance = getInstance().getSDKInstance(str);
        if (sDKInstance != null) {
            return sDKInstance.y();
        }
        return 750;
    }

    public int getJsEngineType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4530b035", new Object[]{this})).intValue() : IWXJSEngineManager.EngineType.QuickJS.engineValue();
    }

    public void setJsEngineType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7bd775", new Object[]{this, new Integer(i)});
        } else if (this.mJsEngineType != 0) {
        } else {
            synchronized (WXSDKManager.class) {
                if (this.mJsEngineType != 0) {
                    return;
                }
                this.mJsEngineType = i;
            }
        }
    }

    public static void setInstance(WXSDKManager wXSDKManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2102fc5e", new Object[]{wXSDKManager});
        } else {
            sManager = wXSDKManager;
        }
    }

    public com.taobao.weex.appfram.navigator.a getActivityNavBarSetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.appfram.navigator.a) ipChange.ipc$dispatch("37f75b94", new Object[]{this}) : this.mActivityNavBarSetter;
    }

    public void setActivityNavBarSetter(com.taobao.weex.appfram.navigator.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a15ab802", new Object[]{this, aVar});
        } else {
            this.mActivityNavBarSetter = aVar;
        }
    }

    public void restartBridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0beaeff", new Object[]{this});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.restart();
    }

    public synchronized void setUseSingleProcess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95894d2b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z != isUseSingleProcess) {
            isUseSingleProcess = z;
        }
    }

    public synchronized boolean getUseSingleProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc0c0fc1", new Object[]{this})).booleanValue();
        }
        return isUseSingleProcess;
    }

    public IWXBridgeManager getWXBridgeManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXBridgeManager) ipChange.ipc$dispatch("86cfb83d", new Object[]{this}) : this.mBridgeManager;
    }

    public WXRenderManager getWXRenderManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXRenderManager) ipChange.ipc$dispatch("d24adc08", new Object[]{this}) : this.mWXRenderManager;
    }

    public IWXJscProcessManager getWXJscProcessManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXJscProcessManager) ipChange.ipc$dispatch("6afda974", new Object[]{this}) : this.mWXJscProcessManager;
    }

    public WXWorkThreadManager getWXWorkThreadManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXWorkThreadManager) ipChange.ipc$dispatch("3d001e9b", new Object[]{this}) : this.mWXWorkThreadManager;
    }

    public void setWxConfigAdapter(IWXConfigAdapter iWXConfigAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fed09a62", new Object[]{this, iWXConfigAdapter});
        } else {
            this.mConfigAdapter = iWXConfigAdapter;
        }
    }

    public IWXConfigAdapter getWxConfigAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXConfigAdapter) ipChange.ipc$dispatch("b34f952a", new Object[]{this}) : this.mConfigAdapter;
    }

    public WXSDKInstance getSDKInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("24a7b6e8", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        WXSDKInstance wXSDKInstance = this.mWXRenderManager.getWXSDKInstance(str);
        return wXSDKInstance == null ? getAllInstanceMap().get(str) : wXSDKInstance;
    }

    public void postOnUiThread(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa4df02", new Object[]{this, runnable, new Long(j)});
        } else {
            this.mWXRenderManager.postOnUiThread(WXThread.secure(runnable), j);
        }
    }

    public Map<String, WXSDKInstance> getAllInstanceMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("69974098", new Object[]{this}) : this.mAllInstanceMap;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WXWorkThreadManager wXWorkThreadManager = this.mWXWorkThreadManager;
        if (wXWorkThreadManager != null) {
            wXWorkThreadManager.destroy();
        }
        this.mAllInstanceMap.clear();
    }

    @Deprecated
    public void callback(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7344f625", new Object[]{this, str, str2, map});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.callback(str, str2, map, false);
    }

    @Deprecated
    public void callback(String str, String str2, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55a814f", new Object[]{this, str, str2, map, new Boolean(z)});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.callback(str, str2, map, z);
    }

    public void initScriptsFramework(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62298d17", new Object[]{this, str});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.initScriptsFramework(str);
    }

    public void registerComponents(List<Map<String, Object>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba3fb11", new Object[]{this, list});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.registerComponents(list);
    }

    public void registerModules(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6079523a", new Object[]{this, map});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.registerModules(map);
    }

    @Deprecated
    public void fireEvent(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88b8ec29", new Object[]{this, str, str2, str3});
        } else {
            fireEvent(str, str2, str3, new HashMap());
        }
    }

    @Deprecated
    public void fireEvent(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17ff83c", new Object[]{this, str, str2, str3, map});
        } else {
            fireEvent(str, str2, str3, map, null);
        }
    }

    @Deprecated
    public void fireEvent(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9612e3c9", new Object[]{this, str, str2, str3, map, map2});
        } else if (WXEnvironment.isApkDebugable() && Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            throw new WXRuntimeException("[WXSDKManager]  fireEvent error");
        } else {
            IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
            if (iWXBridgeManager == null) {
                return;
            }
            iWXBridgeManager.fireEventOnNode(str, str2, str3, map, map2);
        }
    }

    public void createInstance(WXSDKInstance wXSDKInstance, h hVar, Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30c1c31", new Object[]{this, wXSDKInstance, hVar, map, str});
            return;
        }
        this.mWXRenderManager.registerInstance(wXSDKInstance);
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager != null) {
            iWXBridgeManager.createInstance(wXSDKInstance.N(), hVar, map, str);
        }
        List<b> list = this.mLifeCycleCallbacks;
        if (list == null) {
            return;
        }
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            wXSDKInstance.N();
        }
    }

    public void refreshInstance(String str, WXRefreshData wXRefreshData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a6f515", new Object[]{this, str, wXRefreshData});
            return;
        }
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.refreshInstance(str, wXRefreshData);
    }

    public void destroyInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929a7c00", new Object[]{this, str});
            return;
        }
        setCrashInfo(WXEnvironment.WEEX_CURRENT_KEY, "");
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!WXUtils.isUiThread()) {
            throw new WXRuntimeException("[WXSDKManager] destroyInstance error");
        }
        List<b> list = this.mLifeCycleCallbacks;
        if (list != null) {
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.mWXRenderManager.removeRenderStatement(str);
        IWXBridgeManager iWXBridgeManager = this.mBridgeManager;
        if (iWXBridgeManager == null) {
            return;
        }
        iWXBridgeManager.destroyInstance(str);
    }

    public String generateInstanceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b2a15034", new Object[]{this}) : String.valueOf(sInstanceId.incrementAndGet());
    }

    public com.taobao.weex.performance.d getRecorderGenerator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.performance.d) ipChange.ipc$dispatch("86013c4d", new Object[]{this}) : this.mRecorderGenerator;
    }

    public IWXUserTrackAdapter getIWXUserTrackAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXUserTrackAdapter) ipChange.ipc$dispatch("ab33057d", new Object[]{this}) : this.mIWXUserTrackAdapter;
    }

    public IWXImgLoaderAdapter getIWXImgLoaderAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXImgLoaderAdapter) ipChange.ipc$dispatch("7a9f42bd", new Object[]{this}) : this.mIWXImgLoaderAdapter;
    }

    public IWXJsFileLoaderAdapter getIWXJsFileLoaderAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXJsFileLoaderAdapter) ipChange.ipc$dispatch("10baebd3", new Object[]{this}) : this.mWXJsFileLoaderAdapter;
    }

    public IDrawableLoader getDrawableLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDrawableLoader) ipChange.ipc$dispatch("e8074480", new Object[]{this}) : this.mDrawableLoader;
    }

    public IWXJSExceptionAdapter getIWXJSExceptionAdapter() {
        if (this.mIWXJSExceptionAdapter == null) {
            try {
                this.mIWXJSExceptionAdapter = (IWXJSExceptionAdapter) Class.forName("com.alibaba.aliweex.adapter.adapter.WXExceptionAdapter").newInstance();
            } catch (Throwable th) {
                WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
            }
        }
        return this.mIWXJSExceptionAdapter;
    }

    public void setIWXJSExceptionAdapter(IWXJSExceptionAdapter iWXJSExceptionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7592051", new Object[]{this, iWXJSExceptionAdapter});
        } else {
            this.mIWXJSExceptionAdapter = iWXJSExceptionAdapter;
        }
    }

    public IWXHttpAdapter getIWXHttpAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXHttpAdapter) ipChange.ipc$dispatch("7691e633", new Object[]{this});
        }
        if (this.mIWXHttpAdapter == null) {
            this.mIWXHttpAdapter = new DefaultWXHttpAdapter();
        }
        return this.mIWXHttpAdapter;
    }

    public IWXJSEngineManager getWXJSEngineManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXJSEngineManager) ipChange.ipc$dispatch("4548c0e0", new Object[]{this}) : this.mWXJSEngineManager;
    }

    public void setWXJSEngineManager(IWXJSEngineManager iWXJSEngineManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47020762", new Object[]{this, iWXJSEngineManager});
        } else if (this.mWXJSEngineManager != null) {
        } else {
            synchronized (WXSDKManager.class) {
                if (this.mWXJSEngineManager == null) {
                    this.mWXJSEngineManager = iWXJSEngineManager;
                }
            }
        }
    }

    public com.taobao.weex.performance.a getApmGenerater() {
        if (this.mApmGenerater == null) {
            try {
                this.mApmGenerater = (com.taobao.weex.performance.a) Class.forName("com.alibaba.aliweex.adapter.adapter.WXAPMGeneratorAdapter").newInstance();
            } catch (Throwable th) {
                WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
            }
        }
        return this.mApmGenerater;
    }

    public URIAdapter getURIAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URIAdapter) ipChange.ipc$dispatch("348c27a7", new Object[]{this});
        }
        if (this.mURIAdapter == null) {
            this.mURIAdapter = new DefaultUriAdapter();
        }
        return this.mURIAdapter;
    }

    public ClassLoaderAdapter getClassLoaderAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoaderAdapter) ipChange.ipc$dispatch("85275ee5", new Object[]{this});
        }
        if (this.mClassLoaderAdapter == null) {
            this.mClassLoaderAdapter = new ClassLoaderAdapter();
        }
        return this.mClassLoaderAdapter;
    }

    public IWXSoLoaderAdapter getIWXSoLoaderAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXSoLoaderAdapter) ipChange.ipc$dispatch("3a634c81", new Object[]{this}) : this.mIWXSoLoaderAdapter;
    }

    public List<com.taobao.weex.performance.b> getWXAnalyzerList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("41652245", new Object[]{this}) : this.mWXAnalyzerList;
    }

    public void addWXAnalyzer(com.taobao.weex.performance.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684fac6a", new Object[]{this, bVar});
        } else if (this.mWXAnalyzerList.contains(bVar)) {
        } else {
            this.mWXAnalyzerList.add(bVar);
        }
    }

    public void rmWXAnalyzer(com.taobao.weex.performance.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("746a6910", new Object[]{this, bVar});
        } else {
            this.mWXAnalyzerList.remove(bVar);
        }
    }

    public void setInitConfig(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3384fb", new Object[]{this, fVar});
            return;
        }
        this.mIWXHttpAdapter = fVar.a();
        this.mIWXImgLoaderAdapter = fVar.c();
        this.mDrawableLoader = fVar.d();
        this.mIWXStorageAdapter = fVar.h();
        this.mIWXUserTrackAdapter = fVar.e();
        this.mURIAdapter = fVar.i();
        this.mIWebSocketAdapterFactory = fVar.j();
        this.mIWXJSExceptionAdapter = fVar.n();
        this.mIWXSoLoaderAdapter = fVar.f();
        this.mClassLoaderAdapter = fVar.k();
        this.mApmGenerater = fVar.l();
        this.mWXJsFileLoaderAdapter = fVar.m();
        this.mWXJscProcessManager = fVar.o();
        this.mWXFoldDeviceAdapter = fVar.b();
        this.mRecorderGenerator = fVar.q();
    }

    public com.taobao.weex.appfram.storage.b getIWXStorageAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.appfram.storage.b) ipChange.ipc$dispatch("fe566823", new Object[]{this}) : this.mIWXStorageAdapter;
    }

    public com.taobao.weex.appfram.websocket.a getIWXWebSocketAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.websocket.a) ipChange.ipc$dispatch("747d4dcc", new Object[]{this});
        }
        com.taobao.weex.appfram.websocket.b bVar = this.mIWebSocketAdapterFactory;
        if (bVar == null) {
            return null;
        }
        return bVar.a();
    }

    public void setCrashInfoReporter(ICrashInfoReporter iCrashInfoReporter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5cbc542", new Object[]{this, iCrashInfoReporter});
        } else {
            this.mCrashInfo = iCrashInfoReporter;
        }
    }

    public void setCrashInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("956f95ce", new Object[]{this, str, str2});
            return;
        }
        ICrashInfoReporter iCrashInfoReporter = this.mCrashInfo;
        if (iCrashInfoReporter == null) {
            return;
        }
        iCrashInfoReporter.addCrashInfo(str, str2);
    }

    @Override // com.taobao.weex.remote.a
    public void setImpl(IWXBridgeManager iWXBridgeManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abb25d50", new Object[]{this, iWXBridgeManager});
        } else {
            this.mBridgeManager = iWXBridgeManager;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.weex.remote.a
    /* renamed from: getImpl */
    public IWXBridgeManager mo1589getImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXBridgeManager) ipChange.ipc$dispatch("7cc34ce6", new Object[]{this}) : this.mBridgeManager;
    }

    public void setTracingAdapter(ITracingAdapter iTracingAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92429b0", new Object[]{this, iTracingAdapter});
        } else {
            this.mTracingAdapter = iTracingAdapter;
        }
    }

    public ITracingAdapter getTracingAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITracingAdapter) ipChange.ipc$dispatch("6beea600", new Object[]{this}) : this.mTracingAdapter;
    }

    public void registerInstanceLifeCycleCallbacks(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba786e5", new Object[]{this, bVar});
            return;
        }
        if (this.mLifeCycleCallbacks == null) {
            this.mLifeCycleCallbacks = new ArrayList();
        }
        this.mLifeCycleCallbacks.add(bVar);
    }

    public void setAccessibilityRoleAdapter(IWXAccessibilityRoleAdapter iWXAccessibilityRoleAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78987ef3", new Object[]{this, iWXAccessibilityRoleAdapter});
        } else {
            this.mRoleAdapter = iWXAccessibilityRoleAdapter;
        }
    }

    public IWXAccessibilityRoleAdapter getAccessibilityRoleAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXAccessibilityRoleAdapter) ipChange.ipc$dispatch("f3dd3d7f", new Object[]{this}) : this.mRoleAdapter;
    }

    public com.taobao.weex.appfram.navigator.b getNavigator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.appfram.navigator.b) ipChange.ipc$dispatch("5256f4a0", new Object[]{this}) : this.mNavigator;
    }

    public void setNavigator(com.taobao.weex.appfram.navigator.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8522d4ac", new Object[]{this, bVar});
        } else {
            this.mNavigator = bVar;
        }
    }

    public void setWXCoreLoader(IWXCoreLoader iWXCoreLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91108e4", new Object[]{this, iWXCoreLoader});
        } else {
            this.mWXCoreLoader = iWXCoreLoader;
        }
    }

    public IWXCoreLoader getWXCoreLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXCoreLoader) ipChange.ipc$dispatch("bba0d140", new Object[]{this}) : this.mWXCoreLoader;
    }

    public IWXFoldDeviceAdapter getWXFoldDeviceAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXFoldDeviceAdapter) ipChange.ipc$dispatch("8c5b8074", new Object[]{this}) : this.mWXFoldDeviceAdapter;
    }

    public void setWXFoldDeviceAdapter(IWXFoldDeviceAdapter iWXFoldDeviceAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee6fe2", new Object[]{this, iWXFoldDeviceAdapter});
        } else {
            this.mWXFoldDeviceAdapter = iWXFoldDeviceAdapter;
        }
    }

    public rjc getFontAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjc) ipChange.ipc$dispatch("69d7574a", new Object[]{this});
        }
        if (this.mFontAdapter == null) {
            synchronized (this) {
                if (this.mFontAdapter == null) {
                    this.mFontAdapter = new rjc();
                }
            }
        }
        return this.mFontAdapter;
    }
}
