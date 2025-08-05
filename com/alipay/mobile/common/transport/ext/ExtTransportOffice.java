package com.alipay.mobile.common.transport.ext;

import android.content.Context;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService;
import com.alipay.mobile.common.transport.ext.diagnose.eastereggs.DiagnoseResult;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.powermsg.outter.PowerMsgAbility;
import java.lang.reflect.InvocationTargetException;
import tb.riy;

/* loaded from: classes3.dex */
public class ExtTransportOffice {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AMNET_HELPER = "com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper";
    public static final String BIND_EVENT_LISTENER_MANGER = "com.alipay.mobile.common.transportext.biz.mmtp.BindEventListenerManger";
    public static final String DIAGNOSE_BY_SYSTEMCALL = "com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall";
    public static final String DIAGNOSE_BY_USERCALL = "com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseByUserCall";
    public static final String DIAGNOSE_LAUNCH = "launch";
    public static final String DIAGNOSE_NOTIFY = "diagnoseNotify";
    public static final String EXT_TRANSPORT_MANAGER_IMPL = "com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerImpl";
    public static final String METHOD_SETSCENE = "setScene";
    public static final String MMTPSCENEMANAGER = "com.alipay.mobile.common.transportext.biz.mmtp.MMTPSceneManager";
    public static final String NETWORK_CHECK_CLASS_NAME = "com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkCheck";
    public static final String NETWORK_DIAGONAL_SERVICE = "com.alipay.mobile.common.transportext.biz.diagnose.NetworkDiagnoseServiceImpl";
    public static final String SPEED_TEST_IMPL = "com.alipay.mobile.common.transportext.biz.iprank.SpeeTestImpl";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5533a = false;
    private static ExtTransportOffice b;
    private Context c;
    private Object d;

    private ExtTransportOffice() {
    }

    public static final ExtTransportOffice getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportOffice) ipChange.ipc$dispatch("bc9ea11d", new Object[0]);
        }
        ExtTransportOffice extTransportOffice = b;
        if (extTransportOffice != null) {
            return extTransportOffice;
        }
        synchronized (ExtTransportOffice.class) {
            if (b == null) {
                b = new ExtTransportOffice();
            }
        }
        return b;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.c = context;
        if (f5533a) {
            return;
        }
        f5533a = true;
        try {
            MiscUtils.invokeMethod(getExtTransportManager(), "init", new Class[]{Context.class}, new Object[]{this.c});
        } catch (Throwable th) {
            if (th instanceof InvocationTargetException) {
                LogCatUtil.info("ExtTransportOffice", "[init] " + ((InvocationTargetException) th).getTargetException().toString());
            } else {
                LogCatUtil.info("ExtTransportOffice", "[init] " + th.toString());
            }
            if (MiscUtils.isDebugger(this.c)) {
                return;
            }
            if (th.getClass().getName().contains("MMTPException")) {
                TransportConfigureManager.getInstance().setValue(TransportConfigureItem.AMNET_SWITCH, "0,0,0");
            } else if (th.getCause() == null || !th.getCause().getClass().getName().contains("MMTPException")) {
            } else {
                TransportConfigureManager.getInstance().setValue(TransportConfigureItem.AMNET_SWITCH, "0,0,0");
            }
        }
    }

    public boolean isEnableExtTransport(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4271fb50", new Object[]{this, context})).booleanValue();
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.info("ExtTransportOffice", "isEnableExtTransport: " + th.toString());
        }
        if (!MiscUtils.isEnableExtTransport(context)) {
            return false;
        }
        return getExtTransportManager() != null;
    }

    public ExtTransportClient getExtTransportClient(Context context, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportClient) ipChange.ipc$dispatch("a5b8e4cb", new Object[]{this, context, transportContext});
        }
        if (!isEnableExtTransport(context)) {
            return null;
        }
        try {
            return (ExtTransportClient) MiscUtils.invokeMethod(getExtTransportManager(), "getExtTransportClient", new Class[]{Context.class, TransportContext.class}, new Object[]{this.c, transportContext});
        } catch (Throwable th) {
            if (MiscUtils.isDebugger(this.c)) {
                LogCatUtil.error("ExtTransportOffice", "No enable extTransport. ", th);
            }
            return null;
        }
    }

    public Object getExtTransportManager() {
        Object obj = this.d;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            if (this.d != null) {
                return this.d;
            }
            this.d = Class.forName(EXT_TRANSPORT_MANAGER_IMPL).newInstance();
            return this.d;
        }
    }

    @Deprecated
    public ProtobufCodec getProtobufCodec() {
        try {
            return (ProtobufCodec) Class.forName("com.alipay.mobile.common.transportext.biz.shared.ProtobufCodecImpl").newInstance();
        } catch (Throwable th) {
            LogCatUtil.debug("ExtTransportOffice", "com.alipay.mobile.common.transportext.biz.shared.ProtobufCodecImpl not found." + th.toString());
            return null;
        }
    }

    public NetworkDiagnoseService getNetworkDiagnoseService() {
        try {
            return (NetworkDiagnoseService) Class.forName(NETWORK_DIAGONAL_SERVICE).newInstance();
        } catch (Throwable th) {
            LogCatUtil.debug("ExtTransportOffice", "com.alipay.mobile.common.transportext.biz.diagnose.NetworkDiagnoseServiceImpl not found." + th.toString());
            return null;
        }
    }

    public boolean isInvokedMMTPInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d221a539", new Object[]{this})).booleanValue() : f5533a;
    }

    public void setInvokedMMTPInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8dd9777", new Object[]{this, new Boolean(z)});
        } else {
            f5533a = z;
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    public void notifyPush2UpdateInfo(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44b57859", new Object[]{this, context, new Boolean(z)});
            return;
        }
        if (context != null) {
            try {
                if (!MiscUtils.isInAlipayClient(context) && !TransportStrategy.isEnabledEnhanceNetworkModule()) {
                    return;
                }
            } catch (Throwable th) {
                LogCatUtil.info("ExtTransportOffice", "requestHttpDnsFromPush: " + th.toString());
                return;
            }
        }
        ((ExtHttpDnsManager) NetBeanFactory.getBean(Class.forName("com.alipay.mobile.common.transportext.biz.httpdns.ExtHttpDnsManagerImpl"))).ayncNotifyUpdateDnsInfo(z);
    }

    public void networkStateNotify(boolean z) {
        try {
            Class<?> cls = Class.forName(NETWORK_CHECK_CLASS_NAME);
            cls.getMethod("networkStateNotify", Boolean.TYPE).invoke(cls.getClass(), Boolean.valueOf(z));
            LogCatUtil.info("ExtTransportOffice", "ExtTPOffice , networkStateNotify " + z);
        } catch (Throwable th) {
            LogCatUtil.warn("ExtTransportOffice", "networkStateNotify: " + th.toString());
        }
    }

    public static boolean isFakeWifi() {
        try {
            Class<?> cls = Class.forName(NETWORK_CHECK_CLASS_NAME);
            Object invoke = cls.getMethod("isFakeWifi", new Class[0]).invoke(cls.getClass(), new Object[0]);
            if (invoke == null) {
                return false;
            }
            Boolean bool = (Boolean) invoke;
            LogCatUtil.info("ExtTransportOffice", "ExtTPOffice , isFakeWifi " + bool);
            return bool.booleanValue();
        } catch (Throwable th) {
            LogCatUtil.warn("ExtTransportOffice", "isFakeWifi: " + th.toString());
            return false;
        }
    }

    public void diagnoseNotify() {
        try {
            Class<?> cls = Class.forName(DIAGNOSE_BY_SYSTEMCALL);
            cls.getMethod(DIAGNOSE_NOTIFY, new Class[0]).invoke(cls.getClass(), new Object[0]);
            LogCatUtil.info("ExtTransportOffice", "ExtTPOffice , diagnoseNotify");
        } catch (Throwable th) {
            LogCatUtil.warn("ExtTransportOffice", "diagnoseNotify: " + th.toString());
        }
    }

    public void diagnoseForEasterEggs(DiagnoseResult diagnoseResult) {
        try {
            LogCatUtil.info("ExtTransportOffice", "ExtTPOffice, diagnoseForEasterEggs");
            Class.forName(DIAGNOSE_BY_USERCALL).getMethod("launch", DiagnoseResult.class).invoke(null, diagnoseResult);
        } catch (Throwable th) {
            LogCatUtil.error("ExtTransportOffice", th);
        }
    }

    public void setScene(String str, boolean z) {
        try {
            Class<?> cls = Class.forName(MMTPSCENEMANAGER);
            cls.getMethod(METHOD_SETSCENE, String.class, Boolean.TYPE).invoke(cls.getClass(), str, Boolean.valueOf(z));
        } catch (Throwable th) {
            LogCatUtil.error("ExtTransportOffice", "setScene exception", th);
        }
    }

    public int getConnState() {
        try {
            Class<?> cls = Class.forName(AMNET_HELPER);
            int intValue = ((Integer) cls.getMethod("getConnState", new Class[0]).invoke(cls.getClass(), new Object[0])).intValue();
            LogCatUtil.info("ExtTransportOffice", "getConnState,state=[" + intValue + riy.ARRAY_END_STR);
            return intValue;
        } catch (Throwable th) {
            LogCatUtil.error("ExtTransportOffice", th);
            return -1;
        }
    }

    public boolean isBindedPushProcess() {
        try {
            Class<?> cls = Class.forName(BIND_EVENT_LISTENER_MANGER);
            Boolean bool = (Boolean) cls.getDeclaredMethod("isBinded", new Class[0]).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(cls.getClass(), new Object[0]), new Object[0]);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            LogCatUtil.error("ExtTransportOffice", "isBindedPushProcess ex: " + th.toString());
            return false;
        }
    }

    public String getSwitchFromOriginal(String str) {
        try {
            Class<?> cls = Class.forName("com.alipay.mobile.common.transportext.biz.util.SwitchBridge");
            String str2 = (String) cls.getMethod("getSwitchFromOriginal", String.class).invoke(cls, str);
            LogCatUtil.debug("ExtTransportOffice", "key=[" + str + "] value=[" + str2 + riy.ARRAY_END_STR);
            return str2;
        } catch (Throwable th) {
            LogCatUtil.error("ExtTransportOffice", th);
            return null;
        }
    }

    public void netLinkPreConnect() {
        try {
            Class<?> cls = Class.forName(AMNET_HELPER);
            cls.getMethod(PowerMsgAbility.API_PRE_CONNECT, new Class[0]).invoke(cls.getClass(), new Object[0]);
        } catch (Throwable th) {
            LogCatUtil.error("ExtTransportOffice", "netLinkPreConnect ex=" + th.toString());
        }
    }
}
