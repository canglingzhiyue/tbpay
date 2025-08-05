package com.taobao.zcache.core;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.zcache.Environment;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackRequest;
import com.taobao.zcache.PackUpdateFinishedCallback;
import com.taobao.zcache.ResourceRequest;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.taobao.zcache.ZCacheConfig;
import com.taobao.zcache.core.c;
import com.taobao.zcache.l;
import com.taobao.zcache.m;
import com.taobao.zcache.n;
import com.taobao.zcache.network.DownloadRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes9.dex */
public class ZCacheCoreProxy implements IZCacheCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ResourceResponse NotZCacheResourceResponse;
    private static final Error invalidArgumentError;
    private final AssetManager _assetManager;
    private final ConcurrentHashMap<Integer, l> packProgressListeners = new ConcurrentHashMap<>();
    private final AtomicInteger progressId = new AtomicInteger(1);
    private a downloadFactory = new a();

    private native void autoFetchNative(JSONObject jSONObject);

    private native void cleanupNative();

    private native void clearNative(String str);

    private native void clientActivedNative();

    private native void clientDeactivedNative();

    private native String getACacheRootPathNative(String str, String str2);

    private native long getAccessAPINative();

    private native ResourceResponse getResourceNative(ResourceRequest resourceRequest);

    private native void getResourceNative(ResourceRequest resourceRequest, ResourceResponseCallback resourceResponseCallback);

    private native void installPreloadNative(String str);

    private native boolean isInstalledNative(PackRequest packRequest);

    private native boolean isResourceInstalledNative(ResourceRequest resourceRequest);

    private native void onPushMessageNative(long j, List<String> list);

    private native void onSendRequestFinishedNative(long j, int i, Map<String, String> map, Error error, byte[] bArr);

    private native void prefetchNative(List<String> list, String str);

    private native void registerAcceptNative(String str, String str2, String str3);

    private native void removePackNative(PackRequest packRequest);

    private native void setConfigNative(JSONObject jSONObject);

    private native void setDefaultConfigNative(ZCacheConfig zCacheConfig);

    private native void setEnvNative(int i);

    private native void setLocaleNative(String str);

    private native void setNetworkStatusNative(int i);

    public static native boolean setProxyNative(ZCacheCoreProxy zCacheCoreProxy, AssetManager assetManager, String str);

    private native void setupNative(String str, String str2, int i);

    private native void setupSubProcessNative();

    private native void startUpdateNative();

    private native void syncSubProcessConfigNative();

    private native void updatePackNative(PackRequest packRequest, PackUpdateFinishedCallback packUpdateFinishedCallback);

    public static /* synthetic */ void access$000(ZCacheCoreProxy zCacheCoreProxy, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647339a8", new Object[]{zCacheCoreProxy, new Integer(i)});
        } else {
            zCacheCoreProxy.setNetworkStatusNative(i);
        }
    }

    public static /* synthetic */ void access$100(ZCacheCoreProxy zCacheCoreProxy, long j, int i, Map map, Error error, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1064180a", new Object[]{zCacheCoreProxy, new Long(j), new Integer(i), map, error, bArr});
        } else {
            zCacheCoreProxy.onSendRequestFinishedNative(j, i, map, error, bArr);
        }
    }

    public static /* synthetic */ void access$200(ZCacheCoreProxy zCacheCoreProxy, long j, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b5e018", new Object[]{zCacheCoreProxy, new Long(j), list});
        } else {
            zCacheCoreProxy.onPushMessageNative(j, list);
        }
    }

    public static /* synthetic */ ConcurrentHashMap access$300(ZCacheCoreProxy zCacheCoreProxy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("954f5aa8", new Object[]{zCacheCoreProxy}) : zCacheCoreProxy.packProgressListeners;
    }

    static {
        kge.a(-45598837);
        kge.a(1019865588);
        invalidArgumentError = new Error(-1, "invalid argument");
        NotZCacheResourceResponse = ResourceResponse.getErrorResponse(new Error(3001, "Not ZCache resource"));
    }

    public ZCacheCoreProxy(AssetManager assetManager) {
        this._assetManager = assetManager;
        setNetworkStatusNative(c.a());
        c.a(new c.a() { // from class: com.taobao.zcache.core.ZCacheCoreProxy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.zcache.core.c.a
            public void a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Verbose, "ZCache/Info").a("NetworkStatus").a("status", Integer.valueOf(i)).a();
                ZCacheCoreProxy.access$000(ZCacheCoreProxy.this, i);
            }
        });
    }

    public void setDownloadFactory(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e96ef1", new Object[]{this, aVar});
        } else if (aVar == null) {
            this.downloadFactory = new a();
        } else {
            this.downloadFactory = aVar;
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void registerAccept(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc730f0", new Object[]{this, str, str2, str3});
        } else {
            registerAcceptNative(str, str2, str3);
        }
    }

    private void sendRequest(DownloadRequest downloadRequest, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35bfa763", new Object[]{this, downloadRequest, new Long(j)});
            return;
        }
        l lVar = null;
        if (downloadRequest.progressId > 0) {
            lVar = this.packProgressListeners.get(Integer.valueOf(downloadRequest.progressId));
            this.packProgressListeners.remove(Integer.valueOf(downloadRequest.progressId));
        }
        this.downloadFactory.a(downloadRequest, lVar, new com.taobao.zcache.network.c() { // from class: com.taobao.zcache.core.ZCacheCoreProxy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.zcache.network.c
            public void a(int i, Map<String, String> map, Error error, byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc0c96ea", new Object[]{this, new Integer(i), map, error, bArr});
                } else {
                    ZCacheCoreProxy.access$100(ZCacheCoreProxy.this, j, i, map, error, bArr);
                }
            }
        });
    }

    private boolean verifySign(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93617caf", new Object[]{this, bArr, bArr2})).booleanValue() : d.a(bArr, bArr2);
    }

    private void onUpdateFinished(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc30d382", new Object[]{this, new Integer(i)});
        } else {
            f.a(i);
        }
    }

    private void commitMonitor(String str, HashMap<String, String> hashMap, HashMap<String, Double> hashMap2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f88ac94", new Object[]{this, str, hashMap, hashMap2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            b.a(str, hashMap, hashMap2);
        }
    }

    private void onPackUpdated(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763e0754", new Object[]{this, str});
        } else if (str == null) {
        } else {
            f.a(str);
        }
    }

    private boolean subscribePushMessage(String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("969b4f14", new Object[]{this, str, new Long(j)})).booleanValue();
        }
        com.taobao.zcache.i d = n.d();
        if (d == null) {
            return false;
        }
        d.a(str, new m() { // from class: com.taobao.zcache.core.ZCacheCoreProxy.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.zcache.m
            public void a(List<String> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c7052959", new Object[]{this, list});
                } else {
                    ZCacheCoreProxy.access$200(ZCacheCoreProxy.this, j, list);
                }
            }
        });
        return true;
    }

    private String[] enumerateAssetPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("eaad0c51", new Object[]{this, str});
        }
        try {
            String[] proxy_list = AssetsDelegate.proxy_list(this._assetManager, str);
            for (int i = 0; i < proxy_list.length; i++) {
                AssetManager assetManager = this._assetManager;
                if (AssetsDelegate.proxy_list(assetManager, str + proxy_list[i]).length > 0) {
                    proxy_list[i] = proxy_list[i] + "/";
                }
            }
            return proxy_list;
        } catch (IOException unused) {
            return new String[0];
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setEnv(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b177a10", new Object[]{this, environment});
        } else if (environment == null) {
        } else {
            setEnvNative(environment.value);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setLocale(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f386f2ed", new Object[]{this, str});
        } else {
            setLocaleNative(str);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setDefaultConfig(ZCacheConfig zCacheConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b12299", new Object[]{this, zCacheConfig});
        } else {
            setDefaultConfigNative(zCacheConfig);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88511d3", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            setConfigNative(jSONObject);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setup(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28d16a6b", new Object[]{this, str, str2, new Integer(i)});
        } else {
            setupNative(str, str2, i);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void startUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f8e3ed2", new Object[]{this});
        } else {
            startUpdateNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void setupSubProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83eebcf3", new Object[]{this});
        } else {
            setupSubProcessNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void syncSubProcessConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6e4f73", new Object[]{this});
        } else {
            syncSubProcessConfigNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore, com.taobao.zcache.IZCacheClientListener
    public void clientActived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706a9eda", new Object[]{this});
        } else {
            clientActivedNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore, com.taobao.zcache.IZCacheClientListener
    public void clientDeactived() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4ce6e79", new Object[]{this});
        } else {
            clientDeactivedNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public long getAccessAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c1ae3db", new Object[]{this})).longValue() : getAccessAPINative();
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void installPreload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e6dfff", new Object[]{this, str});
        } else {
            installPreloadNative(str);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public boolean isInstalled(PackRequest packRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b67064ac", new Object[]{this, packRequest})).booleanValue();
        }
        if (packRequest != null) {
            return isInstalledNative(packRequest);
        }
        return false;
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public boolean isResourceInstalled(ResourceRequest resourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c45ac78f", new Object[]{this, resourceRequest})).booleanValue();
        }
        if (resourceRequest != null) {
            return isResourceInstalledNative(resourceRequest);
        }
        return false;
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public ResourceResponse getResource(ResourceRequest resourceRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceResponse) ipChange.ipc$dispatch("c4515e99", new Object[]{this, resourceRequest});
        }
        if (resourceRequest == null) {
            return NotZCacheResourceResponse;
        }
        return getResourceNative(resourceRequest);
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void getResource(ResourceRequest resourceRequest, ResourceResponseCallback resourceResponseCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985a830", new Object[]{this, resourceRequest, resourceResponseCallback});
        } else if (resourceResponseCallback == null) {
        } else {
            if (resourceRequest == null) {
                resourceResponseCallback.finish(NotZCacheResourceResponse);
            } else {
                getResourceNative(resourceRequest, resourceResponseCallback);
            }
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void autoFetch(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77b243ac", new Object[]{this, jSONObject});
        } else {
            autoFetchNative(jSONObject);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public String getACacheRootPath(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ad4dc7", new Object[]{this, str, str2}) : getACacheRootPathNative(str, str2);
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void prefetch(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec6aff9", new Object[]{this, list, str});
        } else {
            prefetchNative(list, str);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void updatePack(PackRequest packRequest, final PackUpdateFinishedCallback packUpdateFinishedCallback, l lVar) {
        IpChange ipChange = $ipChange;
        final int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9269aa31", new Object[]{this, packRequest, packUpdateFinishedCallback, lVar});
        } else if (packRequest == null) {
            if (packUpdateFinishedCallback == null) {
                return;
            }
            packUpdateFinishedCallback.finish(null, invalidArgumentError);
        } else {
            if (lVar != null) {
                i = this.progressId.addAndGet(1);
            }
            if (i > 0) {
                this.packProgressListeners.put(Integer.valueOf(i), lVar);
                packRequest.setProgressId(i);
            }
            updatePackNative(packRequest, new PackUpdateFinishedCallback() { // from class: com.taobao.zcache.core.ZCacheCoreProxy.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.zcache.PackUpdateFinishedCallback
                public void finish(String str, Error error) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("abd8ffc9", new Object[]{this, str, error});
                        return;
                    }
                    ZCacheCoreProxy.access$300(ZCacheCoreProxy.this).remove(Integer.valueOf(i));
                    PackUpdateFinishedCallback packUpdateFinishedCallback2 = packUpdateFinishedCallback;
                    if (packUpdateFinishedCallback2 == null) {
                        return;
                    }
                    packUpdateFinishedCallback2.finish(str, error);
                }
            });
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void removePack(PackRequest packRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa47063b", new Object[]{this, packRequest});
        } else {
            removePackNative(packRequest);
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void cleanup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792e92b", new Object[]{this});
        } else {
            cleanupNative();
        }
    }

    @Override // com.taobao.zcache.core.IZCacheCore
    public void clear(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f891e", new Object[]{this, str});
        } else {
            clearNative(str);
        }
    }
}
