package com.alipay.mobile.common.transportext.biz.sync;

import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.amnet.api.model.AmnetPost;
import com.alipay.mobile.common.transport.ext.MMTPException;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class SyncManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Method> f5703a = new ConcurrentHashMap();

    public static void onInitialize() {
        try {
            Class.forName("com.alipay.mobile.rome.syncservice.control.ReflectInvoke").getMethod("init", new Class[0]).invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "onInitialize: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.d("SyncManager", "onInitialize: [ TException=" + th + " ]");
        }
    }

    public static void onAcceptedDataEvent(AcceptedData acceptedData) {
        try {
            Method method = f5703a.get("onAcceptedDataEvent");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("onAcceptedDataEvent", Byte.TYPE, Map.class, byte[].class, Double.TYPE);
                f5703a.put("onAcceptedDataEvent", method);
            }
            method.invoke(null, Byte.valueOf(acceptedData.channel), acceptedData.headers, acceptedData.data, Double.valueOf(acceptedData.readTiming));
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "onAcceptedDataEvent: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "onAcceptedDataEvent: [ TException=" + th + " ]");
        }
    }

    public static void change(int i) {
        try {
            Method method = f5703a.get("change");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("change", Integer.TYPE);
                f5703a.put("change", method);
            }
            method.invoke(null, Integer.valueOf(i));
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "change: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "change: [ TException=" + th + " ]");
        }
    }

    public static void panic(int i, String str) {
        try {
            Method method = f5703a.get("panic");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("panic", Integer.TYPE, String.class);
                f5703a.put("panic", method);
            }
            method.invoke(null, Integer.valueOf(i), str);
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "panic: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "panic: [ TException=" + th + " ]");
        }
    }

    public static void collectSyncChannel(Map<String, String> map) {
        try {
            Method method = f5703a.get("collectSyncChannel");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("collectSyncChannel", Map.class);
                f5703a.put("collectSyncChannel", method);
            }
            method.invoke(null, map);
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "collectSyncChannel: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "collectSyncChannel: [ TException=" + th + " ]");
        }
    }

    public static void collectCommonChannel(Map<String, String> map) {
        try {
            Method method = f5703a.get("collectCommonChannel");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("collectCommonChannel", Map.class);
                f5703a.put("collectCommonChannel", method);
            }
            method.invoke(null, map);
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "collectCommonChannel: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "collectCommonChannel: [ TException=" + th + " ]");
        }
    }

    public static void report(String str, double d) {
        try {
            Method method = f5703a.get("report");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("report", String.class, Double.TYPE);
                f5703a.put("report", method);
            }
            method.invoke(null, str, Double.valueOf(d));
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "report: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "report: [ TException=" + th + " ]");
        }
    }

    public static void notifyInitOk() {
        try {
            Method method = f5703a.get("notifyInitOk");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("notifyInitOk", new Class[0]);
                f5703a.put("notifyInitOk", method);
            }
            method.invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "report: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "notifyInitOk: [ TException=" + th + " ]");
        }
    }

    public static void checkLinkState(int i) {
        try {
            Method method = f5703a.get("checkLinkState");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("checkLinkState", Integer.TYPE);
                f5703a.put("checkLinkState", method);
            }
            method.invoke(null, Integer.valueOf(i));
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "checkLinkState: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "checkLinkState: [ TException=" + th + " ]");
        }
    }

    public static void sendData(byte[] bArr, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441f9225", new Object[]{bArr, map});
            return;
        }
        LogUtilAmnet.d("SyncManager", "sendData: [ syncData len=" + bArr.length + " ]");
        AmnetPost amnetPost = new AmnetPost();
        amnetPost.body = bArr;
        amnetPost.channel = (byte) 2;
        amnetPost.header = map;
        amnetPost.toBizSys = true;
        try {
            AmnetHelper.post(amnetPost);
        } catch (MMTPException e) {
            LogUtilAmnet.d("SyncManager", "Exception occur" + e.getErrorInfo());
        }
    }

    public static void sendData(AmnetPost amnetPost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12b2d7e", new Object[]{amnetPost});
            return;
        }
        try {
            LogUtilAmnet.d("SyncManager", "sendData amnetPost: [ syncData len=" + amnetPost.body.length + " ]");
        } catch (Exception unused) {
        }
        try {
            AmnetHelper.post(amnetPost);
        } catch (MMTPException e) {
            LogUtilAmnet.d("SyncManager", "sendData amnetPost.  Exception occur" + e.getErrorInfo());
        }
    }

    public static boolean isMmtpSwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5daf2c4", new Object[0])).booleanValue();
        }
        boolean isCanUseAmnet = NetworkTunnelStrategy.getInstance().isCanUseAmnet();
        LogUtilAmnet.d("SyncManager", "isMmtpSwitchOn: " + isCanUseAmnet);
        return isCanUseAmnet;
    }

    public static void notifyShortLinkStart() {
        try {
            Method method = f5703a.get("openShortLinkMode");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("openShortLinkMode", new Class[0]);
                f5703a.put("openShortLinkMode", method);
            }
            method.invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "notifyShortLinkStart: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "closeShortLinkMode: [ TException=" + th + " ]");
        }
    }

    public static void notifyShortLinkStop() {
        try {
            Method method = f5703a.get("closeShortLinkMode");
            if (method == null) {
                method = Class.forName("com.alipay.mobile.rome.syncsdk.zlink2.adaptor.AmnetCallbackImpl").getMethod("closeShortLinkMode", new Class[0]);
                f5703a.put("closeShortLinkMode", method);
            }
            method.invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            LogUtilAmnet.e("SyncManager", "notifyShortLinkStop: InvocationTargetException", e.getTargetException());
        } catch (Throwable th) {
            LogUtilAmnet.e("SyncManager", "closeShortLinkMode: [ TException=" + th + " ]");
        }
    }
}
