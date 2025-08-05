package com.alipay.mobile.common.rpc.util;

import com.alipay.mobile.common.rpc.RpcInterceptor;
import com.alipay.mobile.common.rpc.RpcInvocationHandler;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.common.rpc.RpcMgwEnvConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Proxy;
import java.util.Map;

/* loaded from: classes3.dex */
public class RpcInvokeContextUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setTimeout(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16bfb102", new Object[]{obj, new Long(j)});
        } else {
            getRpcInvokeContext(obj).setTimeout(j);
        }
    }

    public static void setGwUrl(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b257e1ca", new Object[]{obj, str});
        } else {
            getRpcInvokeContext(obj).setGwUrl(str);
        }
    }

    public static void setRequestHeaders(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed679d29", new Object[]{obj, map});
        } else {
            getRpcInvokeContext(obj).setRequestHeaders(map);
        }
    }

    public static Map<String, String> getRequestHeaders(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e50b3a05", new Object[]{obj}) : getRpcInvokeContext(obj).getRequestHeaders();
    }

    public static void addRequestHeader(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31706752", new Object[]{obj, str, str2});
        } else {
            getRpcInvokeContext(obj).addRequestHeader(str, str2);
        }
    }

    public static void clearRequestHeaders(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c264b47", new Object[]{obj});
        } else {
            getRpcInvokeContext(obj).clearRequestHeaders();
        }
    }

    public static void removeRequestHeaders(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4de448", new Object[]{obj, str});
        } else {
            getRpcInvokeContext(obj).removeRequestHeaders(str);
        }
    }

    public static Map<String, String> getResponseHeaders(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("aace7e7", new Object[]{obj}) : getRpcInvokeContext(obj).getResponseHeaders();
    }

    public static void setCompress(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a55c2d", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setCompress(z);
        }
    }

    public static void setAppKey(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8222ab2d", new Object[]{obj, str});
        } else {
            getRpcInvokeContext(obj).setAppKey(str);
        }
    }

    public static void setAppId(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cc4587", new Object[]{obj, str});
        } else {
            getRpcInvokeContext(obj).setAppId(str);
        }
    }

    public static void setResetCookie(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627254a0", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setResetCookie(z);
        }
    }

    public static void setBgRpc(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a630b3", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setBgRpc(z);
        }
    }

    public static void setAllowRetry(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a35de90", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setAllowRetry(z);
        }
    }

    public static void setUrgent(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a15c0ee", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setUrgent(z);
        }
    }

    public static void setRpcV2(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ca97b2", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setRpcV2(z);
        }
    }

    public static void setAllowBgLogin(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3bb1d4", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setAllowBgLogin(z);
        }
    }

    public static boolean isAllowBgLogin(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5a93fcc", new Object[]{obj})).booleanValue() : getRpcInvokeContext(obj).isAllowBgLogin();
    }

    public static void setAllowNonNet(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8de0a3a", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setAllowNonNet(z);
        }
    }

    public static boolean isAllowNonNet(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3de40c16", new Object[]{obj})).booleanValue() : getRpcInvokeContext(obj).isAllowNonNet();
    }

    public static void addRpcInterceptor(Object obj, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef753145", new Object[]{obj, rpcInterceptor});
        } else {
            getRpcInvokeContext(obj).addRpcInterceptor(rpcInterceptor);
        }
    }

    public static boolean removeRpcInterceptor(Object obj, RpcInterceptor rpcInterceptor) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d542abc6", new Object[]{obj, rpcInterceptor})).booleanValue() : getRpcInvokeContext(obj).removeRpcInterceptor(rpcInterceptor);
    }

    public static void setSwitchUserLoginRpc(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e8d5f4", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setSwitchUserLoginRpc(z);
        }
    }

    public static void setGetMethod(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3617295c", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setGetMethod(z);
        }
    }

    public static void setDisableEncrypt(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca38a452", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setDisableEncrypt(z);
        }
    }

    public static void setEnableEncrypt(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4653c471", new Object[]{obj, new Boolean(z)});
        } else {
            getRpcInvokeContext(obj).setEnableEncrypt(z);
        }
    }

    public static void setRpcLoggerLevel(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a120def", new Object[]{obj, new Integer(i)});
        } else {
            getRpcInvokeContext(obj).setRpcLoggerLevel(i);
        }
    }

    public static final void setRpcProtocol(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156be288", new Object[]{obj, str});
        } else {
            getRpcInvokeContext(obj).setRpcProtocol(str);
        }
    }

    public static void setMgwEnvConfig(Object obj, RpcMgwEnvConfig rpcMgwEnvConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63c22507", new Object[]{obj, rpcMgwEnvConfig});
        } else {
            getRpcInvokeContext(obj).setRpcMgwEnvConfig(rpcMgwEnvConfig);
        }
    }

    public static RpcMgwEnvConfig getMgwEnvConfig(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RpcMgwEnvConfig) ipChange.ipc$dispatch("b9e846db", new Object[]{obj}) : getRpcInvokeContext(obj).getRpcMgwEnvConfig();
    }

    public static void setWorkspaceId(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6552e07b", new Object[]{obj, str});
        } else {
            getRpcInvokeContext(obj).setWorkspaceId(str);
        }
    }

    public static String getWorkspaceId(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("56f1d1c3", new Object[]{obj}) : getRpcInvokeContext(obj).getWorkspaceId();
    }

    public static final RpcInvokeContext getRpcInvokeContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcInvokeContext) ipChange.ipc$dispatch("a105b232", new Object[]{obj});
        }
        if (!Proxy.isProxyClass(obj.getClass())) {
            throw new IllegalArgumentException(obj.getClass().getName() + " class is not a proxy class ");
        }
        return ((RpcInvocationHandler) Proxy.getInvocationHandler(obj)).getRpcInvokeContext();
    }
}
