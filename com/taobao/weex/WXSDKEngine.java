package com.taobao.weex;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.bridge.ModuleFactory;
import com.taobao.weex.bridge.WXInitDelayTask;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.common.TypeModuleFactory;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.remote.a;
import com.taobao.weex.remote.b;
import com.taobao.weex.ui.ExternalLoaderComponentHolder;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.IFComponentHolder;
import com.taobao.weex.ui.SimpleComponentHolder;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class WXSDKEngine implements a<b>, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b mRemoteImpl;
    private static WXSDKEngine sManager;

    /* loaded from: classes9.dex */
    public static abstract class DestroyableModule extends WXModule implements Destroyable {
        static {
            kge.a(-2079179652);
            kge.a(-1927357621);
        }
    }

    public static /* synthetic */ b access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7de0681a", new Object[0]) : mRemoteImpl;
    }

    static {
        kge.a(271178848);
        kge.a(1028243835);
        kge.a(-498835886);
        mRemoteImpl = null;
    }

    public static boolean isInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
        }
        b bVar = mRemoteImpl;
        if (bVar == null) {
            WXLogUtils.e("WXSDKEngine remote impl is null. isInitialized:false");
            return false;
        }
        boolean isInitializedImpl = bVar.isInitializedImpl();
        WXLogUtils.e("WXSDKEngine isInitialized:" + isInitializedImpl);
        return isInitializedImpl;
    }

    public static boolean isRemoteInstalled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8ac48ed5", new Object[0])).booleanValue() : mRemoteImpl != null;
    }

    public static WXSDKEngine getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKEngine) ipChange.ipc$dispatch("4ee9ace3", new Object[0]);
        }
        if (sManager == null) {
            synchronized (WXSDKEngine.class) {
                if (sManager == null) {
                    sManager = new WXSDKEngine();
                }
            }
        }
        return sManager;
    }

    public static com.taobao.weex.appfram.navigator.a getActivityNavBarSetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.appfram.navigator.a) ipChange.ipc$dispatch("37f75b94", new Object[0]) : WXSDKManager.getInstance().getActivityNavBarSetter();
    }

    public static void setActivityNavBarSetter(com.taobao.weex.appfram.navigator.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a15ab802", new Object[]{aVar});
        } else {
            WXSDKManager.getInstance().setActivityNavBarSetter(aVar);
        }
    }

    public static IWXImgLoaderAdapter getIWXImgLoaderAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWXImgLoaderAdapter) ipChange.ipc$dispatch("7a9f42bd", new Object[0]) : WXSDKManager.getInstance().getIWXImgLoaderAdapter();
    }

    public static com.taobao.weex.appfram.storage.b getIWXStorageAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.weex.appfram.storage.b) ipChange.ipc$dispatch("fe566823", new Object[0]) : WXSDKManager.getInstance().getIWXStorageAdapter();
    }

    public static <T extends WXModule> boolean registerModule(final String str, final ModuleFactory moduleFactory, final boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fcd9cdc", new Object[]{str, moduleFactory, new Boolean(z)})).booleanValue();
        }
        b bVar = mRemoteImpl;
        if (bVar == null) {
            WXInitDelayTask.getInstance().addDelayTask(new Runnable() { // from class: com.taobao.weex.WXSDKEngine.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        WXSDKEngine.access$000().registerModuleImpl(str, moduleFactory, z);
                    } catch (Throwable th) {
                        WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
                    }
                }
            });
            return true;
        }
        return bVar.registerModuleImpl(str, moduleFactory, z);
    }

    public static boolean registerService(final String str, final String str2, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc91c13c", new Object[]{str, str2, map})).booleanValue();
        }
        b bVar = mRemoteImpl;
        if (bVar == null) {
            WXInitDelayTask.getInstance().addDelayTask(new Runnable() { // from class: com.taobao.weex.WXSDKEngine.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        WXSDKEngine.access$000().registerServiceImpl(str, str2, map);
                    } catch (Throwable th) {
                        WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
                    }
                }
            });
            return true;
        }
        return bVar.registerServiceImpl(str, str2, map);
    }

    public static void callback(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7344f625", new Object[]{str, str2, map});
        } else {
            WXSDKManager.getInstance().callback(str, str2, map);
        }
    }

    public static void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[0]);
            return;
        }
        b bVar = mRemoteImpl;
        if (bVar == null) {
            return;
        }
        bVar.reloadImpl();
    }

    public static boolean registerModule(String str, Class<? extends WXModule> cls) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("51e31701", new Object[]{str, cls})).booleanValue() : registerModule(str, (Class) cls, false);
    }

    public static <T extends WXModule> boolean registerModule(String str, Class<T> cls, boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea807b7b", new Object[]{str, cls, new Boolean(z)})).booleanValue() : cls != null && registerModule(str, new TypeModuleFactory(cls), z);
    }

    public static boolean registerComponent(String str, Class<? extends WXComponent> cls) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9befe1f6", new Object[]{str, cls})).booleanValue() : registerComponent(str, new SimpleComponentHolder(cls), new HashMap());
    }

    public static boolean registerComponent(Map<String, Object> map, Class<? extends WXComponent> cls) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("763b8f7d", new Object[]{map, cls})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        String str = (String) map.get("type");
        if (!TextUtils.isEmpty(str)) {
            return registerComponent(str, new SimpleComponentHolder(cls), map);
        }
        return false;
    }

    public static boolean registerComponent(final String str, final IFComponentHolder iFComponentHolder, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2b7f55b", new Object[]{str, iFComponentHolder, map})).booleanValue();
        }
        b bVar = mRemoteImpl;
        if (bVar == null) {
            WXInitDelayTask.getInstance().addDelayTask(new Runnable() { // from class: com.taobao.weex.WXSDKEngine.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        WXSDKEngine.access$000().registerComponent(str, iFComponentHolder, map);
                    } catch (Throwable th) {
                        WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
                    }
                }
            });
            return true;
        }
        return bVar.registerComponent(str, iFComponentHolder, map);
    }

    public static boolean registerComponent(String str, Class<? extends WXComponent> cls, boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e20d0f26", new Object[]{str, cls, new Boolean(z)})).booleanValue() : registerComponent(cls, z, str);
    }

    public static boolean registerComponent(String str, IExternalComponentGetter iExternalComponentGetter, boolean z) throws WXException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4318f6f6", new Object[]{str, iExternalComponentGetter, new Boolean(z)})).booleanValue() : registerComponent(new ExternalLoaderComponentHolder(str, iExternalComponentGetter), z, str);
    }

    public static boolean registerComponent(Class<? extends WXComponent> cls, boolean z, String... strArr) throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4038840b", new Object[]{cls, new Boolean(z), strArr})).booleanValue();
        }
        if (cls != null) {
            return registerComponent(new SimpleComponentHolder(cls), z, strArr);
        }
        return false;
    }

    public static boolean registerComponent(IFComponentHolder iFComponentHolder, boolean z, String... strArr) throws WXException {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1c0f033", new Object[]{iFComponentHolder, new Boolean(z), strArr})).booleanValue();
        }
        try {
            z2 = true;
            for (String str : strArr) {
                try {
                    HashMap hashMap = new HashMap();
                    if (z) {
                        hashMap.put("append", "tree");
                    }
                    z2 = z2 && registerComponent(str, iFComponentHolder, hashMap);
                } catch (Throwable th) {
                    th = th;
                    th.printStackTrace();
                    return z2;
                }
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
            z2 = true;
        }
    }

    @Override // com.taobao.weex.remote.a
    public void setImpl(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21205784", new Object[]{this, bVar});
        } else {
            mRemoteImpl = bVar;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.weex.remote.a
    /* renamed from: getImpl */
    public b mo1589getImpl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a3c4c234", new Object[]{this}) : mRemoteImpl;
    }
}
