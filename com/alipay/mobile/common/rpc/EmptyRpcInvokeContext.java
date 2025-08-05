package com.alipay.mobile.common.rpc;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class EmptyRpcInvokeContext implements RpcInvokeContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static EmptyRpcInvokeContext f5499a;

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void addExtParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc7c8", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public Map<String, String> getExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public String getGwUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be62e1f0", new Object[]{this}) : "";
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public RpcMgwEnvConfig getRpcMgwEnvConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcMgwEnvConfig) ipChange.ipc$dispatch("3842cebe", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public String getWorkspaceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5aca3fdf", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean isCustomGwUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e6c6f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void removeExtParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4459221", new Object[]{this, str});
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setBizLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e4a84", new Object[]{this, str});
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcMgwEnvConfig(RpcMgwEnvConfig rpcMgwEnvConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1238ec", new Object[]{this, rpcMgwEnvConfig});
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setWorkspaceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1634eadf", new Object[]{this, str});
        }
    }

    public static final EmptyRpcInvokeContext getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EmptyRpcInvokeContext) ipChange.ipc$dispatch("a8ebe00c", new Object[0]);
        }
        EmptyRpcInvokeContext emptyRpcInvokeContext = f5499a;
        if (emptyRpcInvokeContext != null) {
            return emptyRpcInvokeContext;
        }
        synchronized (EmptyRpcInvokeContext.class) {
            if (f5499a != null) {
                return f5499a;
            }
            f5499a = new EmptyRpcInvokeContext();
            return f5499a;
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setTimeout(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a835f7de", new Object[]{this, new Long(j)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setTimeout");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setGwUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad1f1ee", new Object[]{this, str});
            return;
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "setGwUrl, url= " + str);
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRequestHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbec0085", new Object[]{this, map});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setRequestHeaders");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public Map<String, String> getRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a1965029", new Object[]{this});
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "getRequestHeaders");
        return Collections.EMPTY_MAP;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void addRequestHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1518e9f6", new Object[]{this, str, str2});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "addRequestHeader");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void clearRequestHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995ff02b", new Object[]{this});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "clearRequestHeaders");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void removeRequestHeaders(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6237ec", new Object[]{this, str});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "removeRequestHeaders");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public Map<String, String> getResponseHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1aeb128b", new Object[]{this});
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "getResponseHeaders");
        return Collections.EMPTY_MAP;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setCompress(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ffc3c9", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setCompress");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAppKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
            return;
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "setAppKey, appKey= " + str);
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9945baeb", new Object[]{this, str});
            return;
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "setAppId, appId= " + str);
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setResetCookie(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390d02fc", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setResetCookie");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setBgRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e70cdcf", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setBgRpc");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAllowRetry(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccb428ec", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setAllowRetry");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setUrgent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c5086ca", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setUrgent");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcV2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64468e", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setRpcV2");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAllowBgLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef70530", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setAllowBgLogin");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean isAllowBgLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("101bb2f0", new Object[]{this})).booleanValue();
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "isAllowBgLogin");
        return false;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setAllowNonNet(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418ccb16", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "allowNonNet");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean isAllowNonNet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbdbddba", new Object[]{this})).booleanValue();
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "isAllowNonNet");
        return false;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void addRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f5d9a1", new Object[]{this, rpcInterceptor});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "addRpcInterceptor");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public boolean removeRpcInterceptor(RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("397ee962", new Object[]{this, rpcInterceptor})).booleanValue();
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "rpcInterceptor");
        return false;
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setSwitchUserLoginRpc(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76faf150", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "isSwitchUserLoginRpc");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setGetMethod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eceb8", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "getMethod");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setDisableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6a3b2e", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "disableEncrypt");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setEnableEncrypt(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b556750d", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setEnableEncrypt");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcLoggerLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ec44b", new Object[]{this, new Integer(i)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setRpcLoggerLevel");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setRpcProtocol(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcf462c", new Object[]{this, str});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setRpcProtocol");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setExtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setExtParams");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setShortLinkOnly(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79570d0d", new Object[]{this, new Boolean(z)});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setShortLinkOnly");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setShortLinkIPList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8beda98a", new Object[]{this, str});
        } else {
            LogCatUtil.info("EmptyRpcInvokeContext", "setShortLinkIPList");
        }
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public String getShortLinkIPList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5116e5d4", new Object[]{this});
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "setShortLinkIPList");
        return "";
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setNeedSignature(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41d53ad", new Object[]{this, new Boolean(z)});
            return;
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "[setNeedSignature] needSignature = " + z);
    }

    @Override // com.alipay.mobile.common.rpc.RpcInvokeContext
    public void setUseMultiplexLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebbc690", new Object[]{this, new Boolean(z)});
            return;
        }
        LogCatUtil.info("EmptyRpcInvokeContext", "[setUseMultiplexLink] useMultiplexLink = " + z);
    }
}
