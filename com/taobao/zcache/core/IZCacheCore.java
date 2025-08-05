package com.taobao.zcache.core;

import com.taobao.zcache.Environment;
import com.taobao.zcache.IZCacheClientListener;
import com.taobao.zcache.PackRequest;
import com.taobao.zcache.PackUpdateFinishedCallback;
import com.taobao.zcache.ResourceRequest;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.ResourceResponseCallback;
import com.taobao.zcache.ZCacheConfig;
import com.taobao.zcache.l;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface IZCacheCore extends IZCacheClientListener {
    void autoFetch(JSONObject jSONObject);

    void cleanup();

    void clear(String str);

    @Override // com.taobao.zcache.IZCacheClientListener
    void clientActived();

    @Override // com.taobao.zcache.IZCacheClientListener
    void clientDeactived();

    String getACacheRootPath(String str, String str2);

    long getAccessAPI();

    ResourceResponse getResource(ResourceRequest resourceRequest);

    void getResource(ResourceRequest resourceRequest, ResourceResponseCallback resourceResponseCallback);

    void installPreload(String str);

    boolean isInstalled(PackRequest packRequest);

    boolean isResourceInstalled(ResourceRequest resourceRequest);

    void prefetch(List<String> list, String str);

    void registerAccept(String str, String str2, String str3);

    void removePack(PackRequest packRequest);

    void setConfig(JSONObject jSONObject);

    void setDefaultConfig(ZCacheConfig zCacheConfig);

    void setEnv(Environment environment);

    void setLocale(String str);

    void setup(String str, String str2, int i);

    void setupSubProcess();

    void startUpdate();

    void syncSubProcessConfig();

    void updatePack(PackRequest packRequest, PackUpdateFinishedCallback packUpdateFinishedCallback, l lVar);
}
