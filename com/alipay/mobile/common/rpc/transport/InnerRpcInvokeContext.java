package com.alipay.mobile.common.rpc.transport;

import android.text.TextUtils;
import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.rpc.RpcMgwEnvConfig;
import com.alipay.mobile.common.transport.http.HeaderMap;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.ReadSettingServerUrl;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class InnerRpcInvokeContext implements RpcInvokeContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final List<RpcInterceptor> b = Collections.emptyList();
    public String appKey;
    public Boolean bgRpc;
    private RpcMgwEnvConfig c;
    public Boolean compress;
    public String gwUrl;
    public String protocolVersion;
    public Boolean resetCookie;
    public Map<String, String> responseHeader;
    public long timeout;
    public Map<String, String> requestHeaders = new HeaderMap(5);
    public Boolean allowRetry = null;
    public boolean isUrgent = false;
    public boolean isRpcV2 = false;
    public boolean allowBgLogin = false;
    public boolean allowNonNet = false;
    public boolean switchUserLoginRpc = false;
    public boolean isGetMethod = false;
    public boolean disableEnctypt = false;
    public boolean enableEncrypt = false;
    public boolean shortOnly = false;

    /* renamed from: a  reason: collision with root package name */
    private String f5511a = "";
    public boolean useMultiplexLink = false;
    public List<RpcInterceptor> rpcInterceptorList = b;
    public String appId = null;
    public int loggerLevel = -1;
    public Boolean needSignature = null;
    public boolean isCustGwUrl = false;
    public String mgwEnvConfigKey = "";
    public String workspaceId = "";
    public String bizLog = "";
    private Map<String, String> d = new HashMap(4);

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setTimeout(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f7de", new Object[]{this, new Long(j)});
            return;
        }
        if (j < 3000) {
            LogCatUtil.warn("RpcInvokeContext", "setTimeout,timeoutMs: " + j + " too small,reset to 5s");
            j = 5000;
        }
        if (j > 300000) {
            LogCatUtil.warn("RpcInvokeContext", "setTimeout,timeoutMs: " + j + " too big,reset to 300s");
            j = 300000L;
        }
        this.timeout = j;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setGwUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad1f1ee", new Object[]{this, str});
            return;
        }
        LogCatUtil.info("RpcInvokeContext", "setGwUrl: " + str);
        this.gwUrl = str;
        this.isCustGwUrl = true;
        if (str.equals("https://mgwapi-tb.alipay.com/mgw.htm")) {
            return;
        }
        if (TextUtils.isEmpty(this.protocolVersion) && !TextUtils.equals(str, ReadSettingServerUrl.getInstance().getGWFURL(TransportEnvUtil.getContext()))) {
            setRpcProtocol(ProtocolVersions.HTTP_1_1);
        }
        if (!this.useMultiplexLink) {
            return;
        }
        setRpcProtocol(ProtocolVersions.HTTP_2_0);
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public String getGwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be62e1f0", new Object[]{this}) : this.gwUrl;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRequestHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec0085", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (this.requestHeaders.containsKey(entry.getKey())) {
                    LogCatUtil.warn("RpcInvokeContext", "setRequestHeaders. Find duplicate key : " + entry.getKey() + " , ignore them.");
                } else {
                    this.requestHeaders.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public Map<String, String> getRequestHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a1965029", new Object[]{this}) : this.requestHeaders;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void addRequestHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1518e9f6", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn("RpcInvokeContext", "addRequestHeader. key is empty.");
        } else if (TextUtils.isEmpty(str2)) {
            LogCatUtil.warn("RpcInvokeContext", "addRequestHeader. value is null, key= " + str);
        } else if (this.requestHeaders.containsKey(str)) {
            LogCatUtil.warn("RpcInvokeContext", "addRequestHeader. Find duplicate key : " + str + " , ignore them.");
        } else {
            this.requestHeaders.put(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void clearRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995ff02b", new Object[]{this});
        } else {
            this.requestHeaders.clear();
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void removeRequestHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6237ec", new Object[]{this, str});
        } else {
            this.requestHeaders.remove(str);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public Map<String, String> getResponseHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1aeb128b", new Object[]{this}) : this.responseHeader;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setCompress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ffc3c9", new Object[]{this, new Boolean(z)});
        } else {
            this.compress = Boolean.valueOf(z);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.appKey = str;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
        } else {
            this.appId = str;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setResetCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d02fc", new Object[]{this, new Boolean(z)});
        } else {
            this.resetCookie = Boolean.valueOf(z);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setBgRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e70cdcf", new Object[]{this, new Boolean(z)});
        } else {
            this.bgRpc = Boolean.valueOf(z);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAllowRetry(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb428ec", new Object[]{this, new Boolean(z)});
        } else {
            this.allowRetry = Boolean.valueOf(z);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setUrgent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5086ca", new Object[]{this, new Boolean(z)});
        } else {
            this.isUrgent = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcV2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64468e", new Object[]{this, new Boolean(z)});
        } else {
            this.isRpcV2 = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAllowBgLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef70530", new Object[]{this, new Boolean(z)});
        } else {
            this.allowBgLogin = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean isAllowBgLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("101bb2f0", new Object[]{this})).booleanValue() : this.allowBgLogin;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAllowNonNet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418ccb16", new Object[]{this, new Boolean(z)});
        } else {
            this.allowNonNet = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean isAllowNonNet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbdbddba", new Object[]{this})).booleanValue() : this.allowNonNet;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void addRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5d9a1", new Object[]{this, rpcInterceptor});
            return;
        }
        List<RpcInterceptor> list = this.rpcInterceptorList;
        if (list == null || list == b) {
            this.rpcInterceptorList = new ArrayList(1);
        }
        this.rpcInterceptorList.add(rpcInterceptor);
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean removeRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("397ee962", new Object[]{this, rpcInterceptor})).booleanValue();
        }
        List<RpcInterceptor> list = this.rpcInterceptorList;
        if (list != b && !list.isEmpty()) {
            return this.rpcInterceptorList.remove(rpcInterceptor);
        }
        return true;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setSwitchUserLoginRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76faf150", new Object[]{this, new Boolean(z)});
        } else {
            this.switchUserLoginRpc = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setGetMethod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eceb8", new Object[]{this, new Boolean(z)});
        } else {
            this.isGetMethod = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setDisableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6a3b2e", new Object[]{this, new Boolean(z)});
        } else {
            this.disableEnctypt = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setEnableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b556750d", new Object[]{this, new Boolean(z)});
        } else {
            this.enableEncrypt = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcLoggerLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ec44b", new Object[]{this, new Integer(i)});
        } else {
            this.loggerLevel = i;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcProtocol(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcf462c", new Object[]{this, str});
        } else if (!ProtocolVersions.HTTP_1_1.equals(str) && !ProtocolVersions.HTTP_2_0.equals(str)) {
            LogCatUtil.info("RpcInvokeContext", "failed! protocol must be ProtocolVersions.HTTP_1_1 or ProtocolVersions.HTTP_2_0! " + this.protocolVersion);
        } else {
            this.protocolVersion = str;
            LogCatUtil.info("RpcInvokeContext", "setRpcProtocol done: " + this.protocolVersion);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setShortLinkOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79570d0d", new Object[]{this, new Boolean(z)});
        } else {
            this.shortOnly = z;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setShortLinkIPList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8beda98a", new Object[]{this, str});
        } else {
            this.f5511a = str;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public String getShortLinkIPList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5116e5d4", new Object[]{this}) : this.f5511a;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setNeedSignature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41d53ad", new Object[]{this, new Boolean(z)});
        } else {
            this.needSignature = z ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setUseMultiplexLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebbc690", new Object[]{this, new Boolean(z)});
            return;
        }
        this.useMultiplexLink = z;
        if (!this.useMultiplexLink) {
            return;
        }
        LogCatUtil.debug("RpcInvokeContext", "setUseMultiplexLink");
        setRpcProtocol(ProtocolVersions.HTTP_2_0);
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setBizLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e4a84", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            LogCatUtil.warn("RpcInvokeContext", "[setBizLog] ");
        } else {
            this.bizLog = str;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean isCustomGwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1e6e6c6f", new Object[]{this})).booleanValue() : this.isCustGwUrl;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcMgwEnvConfig(RpcMgwEnvConfig rpcMgwEnvConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1238ec", new Object[]{this, rpcMgwEnvConfig});
        } else if (rpcMgwEnvConfig == null) {
        } else {
            this.c = rpcMgwEnvConfig;
            if (!TextUtils.isEmpty(this.c.getAppId())) {
                setAppId(this.c.getAppId());
            }
            if (!TextUtils.isEmpty(this.c.getAppKey())) {
                setAppKey(this.c.getAppKey());
            }
            if (TextUtils.isEmpty(this.c.getMgwUrl())) {
                return;
            }
            setGwUrl(this.c.getMgwUrl());
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public RpcMgwEnvConfig getRpcMgwEnvConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcMgwEnvConfig) ipChange.ipc$dispatch("3842cebe", new Object[]{this}) : this.c;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setExtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
        } else {
            this.d.clear();
            this.d.putAll(map);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this}) : this.d;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void addExtParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc7c8", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.d.put(str, str2);
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void removeExtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4459221", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.d.remove(str);
        } catch (Throwable unused) {
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setWorkspaceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1634eadf", new Object[]{this, str});
        } else {
            this.workspaceId = str;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public String getWorkspaceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5aca3fdf", new Object[]{this}) : this.workspaceId;
    }

    public List<RpcInterceptor> getRpcInterceptorList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("426a0ac", new Object[]{this}) : this.rpcInterceptorList;
    }
}
