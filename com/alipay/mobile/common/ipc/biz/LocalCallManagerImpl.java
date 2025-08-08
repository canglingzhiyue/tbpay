package com.alipay.mobile.common.ipc.biz;

import android.os.Parcelable;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.ipc.api.LocalCallManager;
import com.alipay.mobile.common.ipc.api.LocalCallRetryHandler;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.ipc.api.aidl.IPCParameter;
import com.alipay.mobile.common.ipc.api.aidl.IPCResult;
import com.alipay.mobile.common.ipc.biz.util.ObjSerializUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import tb.riy;

/* loaded from: classes3.dex */
public class LocalCallManagerImpl implements LocalCallManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ServiceBeanManager f5396a;
    private LocalCallRetryHandler b;

    public LocalCallManagerImpl(ServiceBeanManager serviceBeanManager) {
        this.f5396a = serviceBeanManager;
    }

    @Override // com.alipay.mobile.common.ipc.api.LocalCallManager
    public IPCResult call(IPCParameter iPCParameter) {
        LogCatUtil.debugOrLose("IPC_LocalCallManager", "start local call");
        Object serviceBean = this.f5396a.getServiceBean(iPCParameter.className);
        if (serviceBean == null) {
            LogCatUtil.warn("IPC_LocalCallManager", "Service not found,className=[" + iPCParameter.className + "] serviceBeanManager hashcode=[" + this.f5396a.hashCode() + "] service bean count=[" + this.f5396a.getServiceBeanCount() + riy.ARRAY_END_STR);
            IPCResult iPCResult = new IPCResult();
            iPCResult.resultCode = 100;
            iPCResult.resultMsg = "Service bean not found";
            LocalCallRetryHandler localCallRetryHandler = this.b;
            if (localCallRetryHandler == null) {
                LogCatUtil.warn("IPC_LocalCallManager", "Service not found,localCallRetryHandler is null,no retry!");
                return iPCResult;
            } else if (!localCallRetryHandler.retryLocalCall(iPCParameter, iPCResult, this.f5396a, 1)) {
                LogCatUtil.warn("IPC_LocalCallManager", "Service not found. no retry!");
                return iPCResult;
            } else {
                LogCatUtil.info("IPC_LocalCallManager", "Service not found. ye retry!");
                Object serviceBean2 = this.f5396a.getServiceBean(iPCParameter.className);
                if (serviceBean2 == null) {
                    LogCatUtil.info("IPC_LocalCallManager", "Service not found. retry fail!");
                    return iPCResult;
                }
                serviceBean = serviceBean2;
            }
        }
        Method a2 = a(iPCParameter, serviceBean);
        if (a2 == null) {
            LogCatUtil.warn("IPC_LocalCallManager", "serviceBean=[" + serviceBean.getClass().getName() + "],Method not found,className=[" + iPCParameter.className + riy.ARRAY_END_STR);
            IPCResult iPCResult2 = new IPCResult();
            iPCResult2.resultCode = 101;
            iPCResult2.resultMsg = "Method not found";
            return iPCResult2;
        }
        LogCatUtil.info("IPC_LocalCallManager", "serviceBean=[" + serviceBean.getClass().getName() + "],method=[" + a2.getName() + riy.ARRAY_END_STR);
        if (!StringUtils.equals(iPCParameter.returnType, a2.getReturnType().getName())) {
            LogCatUtil.info("IPC_LocalCallManager", "Not the same returnType, peer returnType=[" + iPCParameter.returnType + "] local returnType=[" + a2.getReturnType().getName() + riy.ARRAY_END_STR);
            IPCResult iPCResult3 = new IPCResult();
            iPCResult3.resultCode = 105;
            iPCResult3.resultMsg = "Method not found";
            return iPCResult3;
        }
        List<byte[]> list = iPCParameter.paramValues;
        Class<?>[] parameterTypes = a2.getParameterTypes();
        if (list != null && parameterTypes.length != list.size()) {
            IPCResult iPCResult4 = new IPCResult();
            iPCResult4.resultCode = 102;
            iPCResult4.resultMsg = "The number of parameters does not match";
            return iPCResult4;
        }
        Object[] objArr = new Object[parameterTypes.length];
        if (parameterTypes.length > 0) {
            try {
                if (iPCParameter.serType == 2) {
                    objArr[0] = iPCParameter.parcelable;
                } else {
                    for (int i = 0; i < parameterTypes.length; i++) {
                        objArr[i] = ObjSerializUtil.deserializ(list.get(i), parameterTypes[i].getClassLoader());
                    }
                }
            } catch (Exception e) {
                LogCatUtil.error("IPC_LocalCallManager", "call Exception", e);
                IPCResult iPCResult5 = new IPCResult();
                iPCResult5.resultCode = 103;
                iPCResult5.resultMsg = "Param deserializ error. exception: " + e.getMessage();
                return iPCResult5;
            }
        }
        try {
            Object invoke = a2.invoke(serviceBean, objArr);
            if (invoke == null) {
                LogCatUtil.info("IPC_LocalCallManager", "invoke success, result is void");
                return new IPCResult();
            }
            IPCResult iPCResult6 = new IPCResult();
            iPCResult6.resultType = invoke.getClass().getName();
            if (invoke instanceof Parcelable) {
                iPCResult6.serType = (byte) 2;
                iPCResult6.parcelable = (Parcelable) invoke;
            } else {
                iPCResult6.resultValue = ObjSerializUtil.serializ((Serializable) invoke);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invoke success, result type = ");
            sb.append(iPCResult6.resultType != null ? iPCResult6.resultType : "is null");
            LogCatUtil.info("IPC_LocalCallManager", sb.toString());
            return iPCResult6;
        } catch (Throwable th) {
            LogCatUtil.error("IPC_LocalCallManager", "LocalCallManager Exception", th);
            IPCResult iPCResult7 = new IPCResult();
            iPCResult7.resultCode = 104;
            iPCResult7.resultMsg = "Invoke method error. exception: " + th.getMessage();
            return iPCResult7;
        }
    }

    @Override // com.alipay.mobile.common.ipc.api.LocalCallManager
    public void setLocalCallRetryHandler(LocalCallRetryHandler localCallRetryHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d07c1aa", new Object[]{this, localCallRetryHandler});
        } else {
            this.b = localCallRetryHandler;
        }
    }

    private Method a(IPCParameter iPCParameter, Object obj) {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("1294d781", new Object[]{this, iPCParameter, obj});
        }
        for (Method method : obj.getClass().getMethods()) {
            if (StringUtils.equals(iPCParameter.methodName, method.getName())) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                String[] strArr = iPCParameter.paramTypes;
                if (parameterTypes.length == strArr.length && a(parameterTypes, strArr)) {
                    return method;
                }
            }
        }
        return null;
    }

    private boolean a(Class<?>[] clsArr, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f73f2773", new Object[]{this, clsArr, strArr})).booleanValue();
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!StringUtils.equals(clsArr[i].getName(), strArr[i])) {
                return false;
            }
        }
        return true;
    }
}
