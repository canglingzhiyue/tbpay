package com.alipay.mobile.common.rpc;

import java.util.Map;

/* loaded from: classes3.dex */
public interface RpcInvokeContext {
    void addExtParam(String str, String str2);

    void addRequestHeader(String str, String str2);

    void addRpcInterceptor(RpcInterceptor rpcInterceptor);

    void clearRequestHeaders();

    Map<String, String> getExtParams();

    String getGwUrl();

    Map<String, String> getRequestHeaders();

    Map<String, String> getResponseHeaders();

    RpcMgwEnvConfig getRpcMgwEnvConfig();

    String getShortLinkIPList();

    String getWorkspaceId();

    boolean isAllowBgLogin();

    boolean isAllowNonNet();

    boolean isCustomGwUrl();

    void removeExtParam(String str);

    void removeRequestHeaders(String str);

    boolean removeRpcInterceptor(RpcInterceptor rpcInterceptor);

    void setAllowBgLogin(boolean z);

    void setAllowNonNet(boolean z);

    void setAllowRetry(boolean z);

    void setAppId(String str);

    void setAppKey(String str);

    void setBgRpc(boolean z);

    void setBizLog(String str);

    void setCompress(boolean z);

    void setDisableEncrypt(boolean z);

    void setEnableEncrypt(boolean z);

    void setExtParams(Map<String, String> map);

    void setGetMethod(boolean z);

    void setGwUrl(String str);

    void setNeedSignature(boolean z);

    void setRequestHeaders(Map<String, String> map);

    void setResetCookie(boolean z);

    void setRpcLoggerLevel(int i);

    void setRpcMgwEnvConfig(RpcMgwEnvConfig rpcMgwEnvConfig);

    void setRpcProtocol(String str);

    void setRpcV2(boolean z);

    void setShortLinkIPList(String str);

    void setShortLinkOnly(boolean z);

    void setSwitchUserLoginRpc(boolean z);

    void setTimeout(long j);

    void setUrgent(boolean z);

    void setUseMultiplexLink(boolean z);

    void setWorkspaceId(String str);
}
