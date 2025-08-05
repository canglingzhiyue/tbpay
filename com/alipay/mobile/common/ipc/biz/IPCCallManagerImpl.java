package com.alipay.mobile.common.ipc.biz;

import android.os.Parcelable;
import com.alipay.mobile.common.ipc.api.IPCCallManager;
import com.alipay.mobile.common.ipc.api.IPCException;
import com.alipay.mobile.common.ipc.api.IPCRetryHandler;
import com.alipay.mobile.common.ipc.api.aidl.IIPCManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.ipc.biz.util.ObjSerializUtil;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import tb.riy;

/* loaded from: classes3.dex */
public class IPCCallManagerImpl implements IPCCallManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IPCRetryHandler f5393a;
    private IIPCManager b;

    public static /* synthetic */ IIPCManager access$100(IPCCallManagerImpl iPCCallManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IIPCManager) ipChange.ipc$dispatch("854f2c79", new Object[]{iPCCallManagerImpl}) : iPCCallManagerImpl.b;
    }

    public static /* synthetic */ MMTPException access$200(IPCCallManagerImpl iPCCallManagerImpl, IPCException iPCException) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MMTPException) ipChange.ipc$dispatch("fcafd74", new Object[]{iPCCallManagerImpl, iPCException}) : iPCCallManagerImpl.a(iPCException);
    }

    public static /* synthetic */ IPCRetryHandler access$300(IPCCallManagerImpl iPCCallManagerImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPCRetryHandler) ipChange.ipc$dispatch("7cd95326", new Object[]{iPCCallManagerImpl}) : iPCCallManagerImpl.f5393a;
    }

    public static /* synthetic */ boolean access$400(IPCCallManagerImpl iPCCallManagerImpl, Class[] clsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac588b02", new Object[]{iPCCallManagerImpl, clsArr})).booleanValue() : iPCCallManagerImpl.a(clsArr);
    }

    public static /* synthetic */ void access$500(IPCCallManagerImpl iPCCallManagerImpl, Object[] objArr, Class[] clsArr, IPCParameter iPCParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b930a5d", new Object[]{iPCCallManagerImpl, objArr, clsArr, iPCParameter});
        } else {
            iPCCallManagerImpl.a(objArr, clsArr, iPCParameter);
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCCallManager
    public <T> T getIpcProxy(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("666d3784", new Object[]{this, cls}) : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new IPCCallProxyHandler());
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCCallManager
    public synchronized void setIIPCManager(IIPCManager iIPCManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f5a651", new Object[]{this, iIPCManager});
            return;
        }
        this.b = iIPCManager;
        StringBuilder sb = new StringBuilder();
        sb.append("[setIIPCManager] Finished. ");
        sb.append(iIPCManager == null ? " ipcManager is null" : "");
        LogCatUtil.info("IPCCallManager", sb.toString());
    }

    @Override // com.alipay.mobile.common.ipc.api.IPCCallManager
    public void setIPCCallRetryHandler(IPCRetryHandler iPCRetryHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36a6ac8", new Object[]{this, iPCRetryHandler});
        } else {
            this.f5393a = iPCRetryHandler;
        }
    }

    /* loaded from: classes3.dex */
    public class IPCCallProxyHandler implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private IPCCallProxyHandler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr}) : a(method, objArr, 0);
        }

        private Object a(Method method, Object[] objArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("76e853f0", new Object[]{this, method, objArr, new Integer(i)});
            }
            LogCatUtil.info("IPCCallManager", "IPCCallProxyHandler#invoke");
            if (IPCCallManagerImpl.access$100(IPCCallManagerImpl.this) == null) {
                LogCatUtil.info("IPCCallManager", "IPCCallProxyHandler#invoke, ipcManager==null.");
                IPCException iPCException = new IPCException("You must set IIPCManager. example: IPCCallManager#setIIPCManager");
                iPCException.errorCode = 2;
                iPCException.errorMsg = "IPC no bind， Please try again later";
                MMTPException access$200 = IPCCallManagerImpl.access$200(IPCCallManagerImpl.this, iPCException);
                if (IPCCallManagerImpl.access$300(IPCCallManagerImpl.this) == null) {
                    throw access$200;
                }
                if (IPCCallManagerImpl.access$300(IPCCallManagerImpl.this).retryIPCCall(method, objArr, iPCException, i)) {
                    if (IPCCallManagerImpl.access$100(IPCCallManagerImpl.this) == null) {
                        LogCatUtil.warn("IPCCallManager", "IPCCallProxyHandler#invoke, retry later, ipcManager still is null.");
                        throw access$200;
                    }
                } else {
                    throw access$200;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Class<?>[] parameterTypes = method.getParameterTypes();
            IPCParameter iPCParameter = new IPCParameter();
            iPCParameter.className = declaringClass.getName();
            iPCParameter.methodName = method.getName();
            iPCParameter.returnType = method.getReturnType().getName();
            iPCParameter.paramTypes = new String[parameterTypes.length];
            if (IPCCallManagerImpl.access$400(IPCCallManagerImpl.this, parameterTypes)) {
                iPCParameter.serType = (byte) 2;
                iPCParameter.paramTypes[0] = parameterTypes[0].getName();
                iPCParameter.paramValues = new ArrayList(iPCParameter.paramTypes.length);
                iPCParameter.parcelable = (Parcelable) objArr[0];
            } else {
                IPCCallManagerImpl.access$500(IPCCallManagerImpl.this, objArr, parameterTypes, iPCParameter);
            }
            LogCatUtil.info("IPCCallManager", "start ipc call. ipcParameter=[" + iPCParameter.toString() + riy.ARRAY_END_STR);
            IPCResult call = new IPCCallable(IPCCallManagerImpl.access$100(IPCCallManagerImpl.this)).call(iPCParameter);
            try {
                if (call == null) {
                    throw new IPCException(106, "Returns the ipcResult is null");
                }
                if (call.resultCode != 0) {
                    throw new IPCException(call.resultCode, call.resultMsg);
                }
                if (method.getGenericReturnType() == Void.TYPE) {
                    return null;
                }
                if (call.serType == 2) {
                    return call.parcelable;
                }
                if (call.resultValue == null) {
                    LogCatUtil.warn("IPCCallManager", "[doInvoke] ipcResult.resultValue is null.");
                    return null;
                }
                return ObjSerializUtil.deserializ(call.resultValue, method.getReturnType().getClassLoader());
            } catch (IPCException e) {
                if (IPCCallManagerImpl.access$300(IPCCallManagerImpl.this) == null) {
                    throw e;
                }
                if (IPCCallManagerImpl.access$300(IPCCallManagerImpl.this).retryIPCCall(method, objArr, e, i)) {
                    return a(method, objArr, i);
                }
                throw e;
            }
        }
    }

    private boolean a(Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ac91fb4", new Object[]{this, clsArr})).booleanValue();
        }
        int length = clsArr.length;
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            return Parcelable.class.isAssignableFrom(clsArr[0]);
        }
        int i = 0;
        for (Class<?> cls : clsArr) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                i++;
            }
        }
        if (i == 0) {
            return false;
        }
        IPCException iPCException = new IPCException("parameter more than one,and not all Serialize,not support");
        iPCException.errorCode = 3;
        iPCException.errorMsg = "Parameter more than one,and not all Serialize,please check it";
        throw iPCException;
    }

    private void a(Object[] objArr, Class<?>[] clsArr, IPCParameter iPCParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25d3ea", new Object[]{this, objArr, clsArr, iPCParameter});
            return;
        }
        for (int i = 0; i < clsArr.length; i++) {
            iPCParameter.paramTypes[i] = clsArr[i].getName();
        }
        if (iPCParameter.paramTypes.length <= 0) {
            return;
        }
        iPCParameter.paramValues = new ArrayList(iPCParameter.paramTypes.length);
        for (int i2 = 0; i2 < iPCParameter.paramTypes.length; i2++) {
            iPCParameter.paramValues.add(ObjSerializUtil.serializ((Serializable) objArr[i2]));
        }
    }

    private MMTPException a(IPCException iPCException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MMTPException) ipChange.ipc$dispatch("51629964", new Object[]{this, iPCException});
        }
        try {
            MMTPException mMTPException = new MMTPException();
            mMTPException.errorCode = 1004;
            mMTPException.errorMesage = iPCException.errorMsg;
            return mMTPException;
        } catch (Throwable th) {
            LogCatUtil.error("IPCCallManager", "convertToMMTPException ex:" + th.toString());
            return null;
        }
    }
}
