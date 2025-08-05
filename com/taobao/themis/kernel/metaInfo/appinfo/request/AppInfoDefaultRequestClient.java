package com.taobao.themis.kernel.metaInfo.appinfo.request;

import com.alibaba.ariver.resource.api.models.AppInfoRequestModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.network.RequestParams;
import com.taobao.themis.kernel.network.c;
import com.taobao.themis.kernel.network.d;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class AppInfoDefaultRequestClient extends d<AppInfoRequestParams, List<AppInfoRequestModel>, JSONObject> implements IAppInfoRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class DataDO implements Serializable {
        public ResultDO data;

        static {
            kge.a(-1176114223);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes9.dex */
    public static class ResultDO implements Serializable {
        public List<AppInfoRequestModel> result;

        static {
            kge.a(1501256836);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1433161256);
        kge.a(1958273460);
    }

    @Override // com.taobao.themis.kernel.network.d
    public List<AppInfoRequestModel> configSuccessResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("98931077", new Object[]{this, bArr});
        }
        TMSLogger.b("AppInfoDefaultRequestClient", new String(bArr));
        DataDO dataDO = (DataDO) JSONObject.parseObject(bArr, DataDO.class, new Feature[0]);
        if (dataDO != null && dataDO.data != null) {
            return dataDO.data.result;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.themis.kernel.network.d
    /* renamed from: configFailureResponse */
    public JSONObject mo1502configFailureResponse(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f162f037", new Object[]{this, bArr});
        }
        JSONObject parseObject = JSONObject.parseObject(new String(bArr));
        if (parseObject == null) {
            return null;
        }
        return parseObject.getJSONObject("data");
    }

    @Override // com.taobao.themis.kernel.metaInfo.appinfo.request.IAppInfoRequestClient
    public c<List<AppInfoRequestModel>, JSONObject> requestAppInfo(AbsAppInfoRequestConfig absAppInfoRequestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("dbd130cf", new Object[]{this, absAppInfoRequestConfig});
        }
        this.b = new AppInfoRequestParams(absAppInfoRequestConfig);
        return execute(this.b);
    }

    /* loaded from: classes9.dex */
    public static class AppInfoRequestParams extends RequestParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public AbsAppInfoRequestConfig mParams;

        static {
            kge.a(10307554);
        }

        public AppInfoRequestParams(AbsAppInfoRequestConfig absAppInfoRequestConfig) {
            super(null);
            this.mParams = absAppInfoRequestConfig;
            if (absAppInfoRequestConfig != null && absAppInfoRequestConfig.c == AbsAppInfoRequestConfig.AppInfoRequestScene.PRELOAD) {
                this.api = "mtop.taobao.miniapp.fusion.appinfo.preload.get";
            } else {
                this.api = "mtop.taobao.miniapp.fusion.appinfo.get";
            }
            this.version = "1.0";
            TMSLogger.d("AppInfoDefaultRequestClient", "AppInfoRequestParams mtop api: " + this.api);
        }

        @Override // com.taobao.themis.kernel.network.RequestParams
        public Map<String, Object> toMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("apps", JSON.toJSONString(this.mParams.a()));
            hashMap.put("sdk_version", i.REQUEST_SDK_VERSION);
            return hashMap;
        }
    }
}
