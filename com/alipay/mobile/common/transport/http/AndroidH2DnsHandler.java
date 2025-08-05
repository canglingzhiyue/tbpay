package com.alipay.mobile.common.transport.http;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.httpdns.AlipayHttpDnsClient;
import com.alipay.mobile.common.transport.httpdns.DnsUtil;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import tb.riy;

/* loaded from: classes3.dex */
public class AndroidH2DnsHandler implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AndroidH2DnsHandler f5544a;
    private static final String[] b = {"resolveInetAddresses", "lookup"};
    private static final Class<?>[] c = {InetAddress[].class, List.class};
    private Object d;

    /* loaded from: classes3.dex */
    public class MethodDesc {
        public String dnsMethodName = null;
        public Class<?> dnsMethodReturnType = null;

        public MethodDesc() {
        }
    }

    /* loaded from: classes3.dex */
    public class ResolveDnsResult {
        public Object addresses;
        public String dnsFrom = "";

        public ResolveDnsResult() {
        }
    }

    public static final AndroidH2DnsHandler getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidH2DnsHandler) ipChange.ipc$dispatch("e39af7bc", new Object[0]);
        }
        AndroidH2DnsHandler androidH2DnsHandler = f5544a;
        if (androidH2DnsHandler != null) {
            return androidH2DnsHandler;
        }
        synchronized (AndroidH2DnsHandler.class) {
            if (f5544a != null) {
                return f5544a;
            }
            f5544a = new AndroidH2DnsHandler();
            return f5544a;
        }
    }

    private AndroidH2DnsHandler() {
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String str;
        String str2;
        String str3 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
        }
        MethodDesc methodDesc = new MethodDesc();
        if (!a(method, objArr, methodDesc)) {
            return a(method, objArr);
        }
        try {
            try {
                str2 = (String) objArr[0];
                try {
                    if (!TextUtils.equals(methodDesc.dnsMethodName, method.getName())) {
                        LogCatUtil.warn("AndroidH2DnsHandler", "Invoke method name it's " + method.getName() + ", method name not " + methodDesc.dnsMethodName);
                        try {
                            Object a2 = a(method, objArr);
                            a(a2, str2, "rawdns");
                            return a2;
                        } catch (HttpException e) {
                            e = e;
                            LogCatUtil.warn("AndroidH2DnsHandler", "[invoke] http exception ");
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            str = "rawdns";
                        }
                    } else if (DnsUtil.isLogicIP(str2)) {
                        Object a3 = a(new InetAddress[]{InetAddress.getByAddress(DnsUtil.ipToBytesByReg(str2))}, methodDesc);
                        a(a3, str2, str3);
                        return a3;
                    } else {
                        TransportContext value = TransportContextThreadLocalUtils.getValue();
                        boolean z = value != null && value.isFastReturnFailure() && value.taskRetryedCount == 0;
                        long currentTimeMillis = System.currentTimeMillis();
                        int i = 0;
                        while (true) {
                            try {
                                ResolveDnsResult a4 = a(str2, methodDesc);
                                str3 = a4.dnsFrom;
                                Object obj2 = a4.addresses;
                                a(obj2, str2, str3);
                                return obj2;
                            } catch (UnknownHostException e2) {
                                str = str3;
                                try {
                                    if (!a(currentTimeMillis, i, e2, 10)) {
                                        if (!z) {
                                            throw e2;
                                        }
                                        LogCatUtil.warn("AndroidH2DnsHandler", "[invoke] Hin fast return failure.");
                                        HttpException httpException = new HttpException(9, e2.toString(), e2);
                                        httpException.setCanRetry(false);
                                        throw httpException;
                                    }
                                    i++;
                                    str3 = str;
                                } catch (HttpException e3) {
                                    e = e3;
                                    LogCatUtil.warn("AndroidH2DnsHandler", "[invoke] http exception ");
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                } catch (HttpException e4) {
                    e = e4;
                } catch (Throwable th3) {
                    th = th3;
                    a((Object) null, str2, str3);
                    throw th;
                }
                str3 = str2;
            } catch (HttpException e5) {
                e = e5;
            } catch (Throwable th4) {
                th = th4;
                str = str3;
            }
            try {
                LogCatUtil.warn("AndroidH2DnsHandler", "[invoke] error. ", th);
                Object a5 = a(method, objArr);
                if (a5 == null) {
                    throw th;
                }
                a((Object) null, str3, "rawdns");
                return a5;
            } catch (Throwable th5) {
                th = th5;
                str2 = str3;
                str3 = str;
                a((Object) null, str2, str3);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            str2 = str3;
        }
    }

    public void setRawAndroidH2DnsHandler(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d0e5b7", new Object[]{this, obj});
        } else {
            this.d = obj;
        }
    }

    private Object a(InetAddress[] inetAddressArr, MethodDesc methodDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("873eb9d7", new Object[]{this, inetAddressArr, methodDesc});
        }
        if (inetAddressArr == null) {
            throw new IllegalArgumentException("adapteReturnValue.  returnValue maybe null.");
        }
        if (methodDesc.dnsMethodReturnType == inetAddressArr.getClass()) {
            return inetAddressArr;
        }
        List asList = Arrays.asList(inetAddressArr);
        LogCatUtil.info("AndroidH2DnsHandler", "adapteReturnValue. returnValue=[" + asList.toString() + riy.ARRAY_END_STR);
        return asList;
    }

    private void a(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7b7558", new Object[]{this, obj, str, str2});
            return;
        }
        try {
            if (obj == null) {
                LogCatUtil.info("AndroidH2DnsHandler", "printLog. DNS resolution failed. hostName = " + str);
                return;
            }
            String str3 = "";
            if (obj.getClass() == InetAddress[].class) {
                InetAddress[] inetAddressArr = (InetAddress[]) obj;
                str3 = Arrays.toString(inetAddressArr);
                i = inetAddressArr.length;
            } else if (List.class.isAssignableFrom(obj.getClass())) {
                List list = (List) obj;
                str3 = list.toString();
                i = list.size();
            } else {
                LogCatUtil.warn("AndroidH2DnsHandler", "printLog. Unknown address object type it's = " + obj.getClass().getName());
            }
            LogCatUtil.info("AndroidH2DnsHandler", "printLog. DNS resolution is complete. dnsFrom = " + str2 + ", hostName = " + str + ", addresses len = " + i + ",ips = [" + str3 + riy.ARRAY_END_STR);
        } catch (Throwable th) {
            LogCatUtil.warn("AndroidH2DnsHandler", "printLog. finally process exception ", th);
        }
    }

    private Object a(Method method, Object[] objArr) {
        if (this.d == null) {
            throw new IllegalArgumentException("rawAndroidH2DnsHandler field is null, you must first call this 'setRawAndroidH2DnsHandler' to set the field");
        }
        if (TextUtils.equals(method.getName(), b[0]) || TextUtils.equals(method.getName(), b[1])) {
            TransportContextThreadLocalUtils.addDnsType(RPCDataItems.VALUE_DT_LOCALDNS);
        }
        try {
            Object invoke = method.invoke(this.d, objArr);
            StringBuilder sb = new StringBuilder("invokeFromRawObj execution finish. raw class = [" + this.d.getClass().getName() + "], methodName=[" + method.getName() + "] ");
            if (invoke != null) {
                sb.append(", value = [" + JSON.toJSONString(invoke) + riy.ARRAY_END_STR);
            }
            LogCatUtil.printInfo("AndroidH2DnsHandler", sb.toString());
            return invoke;
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            LogCatUtil.error("AndroidH2DnsHandler", "[invokeFromRawObj] Exception = " + targetException.toString(), targetException);
            return null;
        } catch (Throwable th) {
            LogCatUtil.error("AndroidH2DnsHandler", "[invokeFromRawObj] Exception = " + th.toString(), th);
            return null;
        }
    }

    private boolean a(Method method, Object[] objArr, MethodDesc methodDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a316ee65", new Object[]{this, method, objArr, methodDesc})).booleanValue();
        }
        if (methodDesc == null) {
            LogCatUtil.info("AndroidH2DnsHandler", "preCheck. methodDesc is null,  hell.");
            return false;
        } else if (objArr == null || objArr.length <= 0) {
            LogCatUtil.info("AndroidH2DnsHandler", "preCheck. args count < 1 ");
            return false;
        } else {
            Class<?> returnType = method.getReturnType();
            Class<?>[] clsArr = c;
            int length = clsArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (returnType == clsArr[i]) {
                    methodDesc.dnsMethodReturnType = returnType;
                    LogCatUtil.warn("AndroidH2DnsHandler", "preCheck. dnsMethodReturnType is " + returnType.getName());
                    break;
                } else {
                    i++;
                }
            }
            if (methodDesc.dnsMethodReturnType == null) {
                return false;
            }
            String name = method.getName();
            String[] strArr = b;
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    break;
                } else if (strArr[i2].equals(name)) {
                    LogCatUtil.warn("AndroidH2DnsHandler", "preCheck. dnsMethodName is " + name);
                    methodDesc.dnsMethodName = name;
                    break;
                } else {
                    i2++;
                }
            }
            return !TextUtils.isEmpty(methodDesc.dnsMethodName);
        }
    }

    private ResolveDnsResult a(String str, MethodDesc methodDesc) {
        InetAddress[] allByName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveDnsResult) ipChange.ipc$dispatch("d0f54f5c", new Object[]{this, str, methodDesc});
        }
        ResolveDnsResult resolveDnsResult = new ResolveDnsResult();
        AlipayHttpDnsClient dnsClient = AlipayHttpDnsClient.getDnsClient();
        if (dnsClient != null) {
            TransportContext value = TransportContextThreadLocalUtils.getValue();
            if (value != null) {
                allByName = dnsClient.getAllByName(str, value);
            } else {
                allByName = dnsClient.getAllByName(str);
            }
            if (allByName != null && allByName.length > 0) {
                resolveDnsResult.dnsFrom = "dnsClient";
                resolveDnsResult.addresses = a(allByName, methodDesc);
                return resolveDnsResult;
            }
        }
        resolveDnsResult.dnsFrom = RPCDataItems.VALUE_DT_LOCALDNS;
        resolveDnsResult.addresses = a(DnsUtil.getAllByName(str), methodDesc);
        return resolveDnsResult;
    }

    private boolean a(long j, int i, Throwable th, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df87dd99", new Object[]{this, new Long(j), new Integer(i), th, new Integer(i2)})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis < 0 || currentTimeMillis > 12000) {
            LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] Can not redns， dnsCost = " + currentTimeMillis + ",  Exception: " + th.toString());
            return false;
        } else if (i >= i2) {
            LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] Can not redns. retryCount = " + i + ", Exception: " + th.toString());
            return false;
        } else {
            LogCatUtil.debug("AndroidH2DnsHandler", "[isCanRetryDns] Will sleep 1s.");
            try {
                Thread.sleep(1000L);
                LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] Can redns. Exception: " + th.toString());
                return true;
            } catch (Throwable th2) {
                LogCatUtil.warn("AndroidH2DnsHandler", "[isCanRetryDns] sleep exception = " + th2.toString());
                return false;
            }
        }
    }
}
