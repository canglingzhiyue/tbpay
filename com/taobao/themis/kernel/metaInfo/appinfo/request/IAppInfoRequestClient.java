package com.taobao.themis.kernel.metaInfo.appinfo.request;

import com.alibaba.ariver.resource.api.models.AppInfoRequestModel;
import com.alibaba.fastjson.JSONObject;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import com.taobao.themis.kernel.basic.a;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.network.c;
import java.util.List;

@DefaultAdapterImpl("com.taobao.themis.kernel.metaInfo.appinfo.request.AppInfoDefaultRequestClient")
/* loaded from: classes9.dex */
public interface IAppInfoRequestClient extends a {
    c<List<AppInfoRequestModel>, JSONObject> requestAppInfo(AbsAppInfoRequestConfig absAppInfoRequestConfig);
}
