package mtopsdk.xstate;

import android.content.Context;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.AsyncServiceBinder;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.xstate.aidl.IXState;
import tb.kge;
import tb.saa;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile AtomicBoolean f25043a;
    private static final ConcurrentHashMap<String, String> b;
    private static AsyncServiceBinder<IXState> c;
    private static AtomicBoolean d;
    private static Context e;
    private static c f;

    static {
        kge.a(-1533203214);
        b = new ConcurrentHashMap<>();
        d = new AtomicBoolean(false);
        f25043a = new AtomicBoolean(false);
        e = null;
    }

    public static void a(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{context, hashMap});
            return;
        }
        if (hashMap != null) {
            try {
                String str = (String) hashMap.get("deviceId");
                if (str != null) {
                    b.put("utdid", str);
                }
            } catch (Throwable unused) {
                TBSdkLog.e("mtopsdk.XState", "[init]init error, params get exception");
                return;
            }
        }
        RemoteConfig.getInstance().loadLocalChannelLazyConfig(context.getApplicationContext());
        if (SwitchConfig.getInstance().getEnableChannelLazy() && "com.taobao.taobao:channel".equals(MtopUtils.getCurrentProcessName(context))) {
            TBSdkLog.e("mtopsdk.XState", "[init]channel process init, Don't init XState");
        } else {
            a(context);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
            TBSdkLog.e("mtopsdk.XState", "[init]init error,context is null");
        } else if (d.compareAndSet(false, true)) {
            e = context.getApplicationContext();
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.XState", "[init]XState init called");
            }
            try {
                RemoteConfig.getInstance().loadLocalUserAgentConfig(context.getApplicationContext());
                b(context);
            } catch (Throwable unused) {
            }
            String currentProcessName = MtopUtils.getCurrentProcessName(context);
            try {
                RemoteConfig.getInstance().loadLocalWidgetConfig(context.getApplicationContext());
                if (SwitchConfig.getInstance().isWidgetUseLocalData() && (Mtop.WIDGET_PROCESS_NAME.equals(currentProcessName) || Mtop.XIAOMI_WIDGET_PROCESS_NAME.equals(currentProcessName))) {
                    TBSdkLog.e("mtopsdk.XState", "[widgetProcess] use local data, process=" + currentProcessName);
                    return;
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.XState", "[widgetProcess] use local data error: " + th.getMessage());
            }
            if (SwitchConfig.getInstance().isSimpleLinkEnable(context) && "com.taobao.taobao".equals(currentProcessName)) {
                if (f == null) {
                    f = new c(context);
                }
                TBSdkLog.e("mtopsdk.XState", "[init]main process use local proxy.");
                f.a();
                for (Map.Entry<String, String> entry : b.entrySet()) {
                    f.a(entry.getKey(), entry.getValue());
                }
            } else if (c == null) {
                AsyncServiceBinder<IXState> asyncServiceBinder = new AsyncServiceBinder<IXState>(IXState.class, XStateService.class) { // from class: mtopsdk.xstate.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // mtopsdk.common.util.AsyncServiceBinder
                    public void afterAsyncBind() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cb59fc64", new Object[]{this});
                            return;
                        }
                        a.f25043a.compareAndSet(true, false);
                        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.xstate.a.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    a.c();
                                }
                            }
                        });
                    }
                };
                c = asyncServiceBinder;
                asyncServiceBinder.asyncBind(context);
            } else {
                c();
            }
        }
    }

    private static void b(Context context) {
        String utdid;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        try {
            String b2 = saa.b(context);
            if (b2 != null) {
                b.put(MspGlobalDefine.UA, b2);
            }
            if (b.get("utdid") == null && (utdid = UTDevice.getUtdid(context)) != null) {
                b.put("utdid", utdid);
            }
            b.put("t_offset", "0");
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.XState", "[initPhoneInfo]initPhoneInfo error", th);
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : a("t_offset");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        String a2 = a("AppBackground");
        if (a2 == null) {
            return false;
        }
        try {
            return Boolean.valueOf(a2).booleanValue();
        } catch (Exception unused) {
            TBSdkLog.e("mtopsdk.XState", "[isAppBackground] parse KEY_APP_BACKGROUND error");
            return false;
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            c("AppBackground", String.valueOf(z));
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : a((String) null, str);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        if (StringUtils.isNotBlank(str)) {
            str2 = StringUtils.concatStr(str, str2);
        }
        c cVar = f;
        if (cVar != null) {
            return cVar.b(str2);
        }
        if (d() && f25043a.get()) {
            try {
                return c.getService().getValue(str2);
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.XState", "[getValue] IXState.getValue(Key) failed,key:" + str2, e2);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.XState", "[getValue]Attention :Use XState Local Mode: key:" + str2);
                }
                return b.get(str2);
            }
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.XState", "[getValue]Attention :Use XState Local Mode: key:" + str2);
        }
        return b.get(str2);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        if (StringUtils.isNotBlank(str)) {
            str2 = StringUtils.concatStr(str, str2);
        }
        c cVar = f;
        if (cVar != null) {
            return cVar.a(str2);
        }
        if (d() && f25043a.get()) {
            try {
                return c.getService().removeKey(str2);
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.XState", "[removeKey] IXState.removeKey(key) failed,key:" + str2, e2);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.XState", "[removeKey]Attention :Use XState Local Mode: key:" + str2);
                }
                b.remove(str2);
            }
        } else {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.XState", "[removeKey]Attention :Use XState Local Mode: key:" + str2);
            }
            b.remove(str2);
        }
        return null;
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            a(null, str, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (StringUtils.isBlank(str2) || StringUtils.isBlank(str3)) {
        } else {
            if (StringUtils.isNotBlank(str)) {
                str2 = StringUtils.concatStr(str, str2);
            }
            c cVar = f;
            if (cVar != null) {
                cVar.a(str2, str3);
            } else if (d() && f25043a.get()) {
                try {
                    c.getService().setValue(str2, str3);
                } catch (Exception e2) {
                    TBSdkLog.e("mtopsdk.XState", "[setValue] IXState.setValue(key,value) failed,key:" + str2 + ",value:" + str3, e2);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.XState", "[setValue]Attention :Use XState Local Mode: key:" + str2 + ",value:" + str3);
                    }
                    b.put(str2, str3);
                }
            } else {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                    TBSdkLog.i("mtopsdk.XState", "[setValue]Attention :Use XState Local Mode: key:" + str2 + ",value:" + str3);
                }
                b.put(str2, str3);
            }
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (d()) {
            IXState service = c.getService();
            try {
                service.init();
                for (Map.Entry<String, String> entry : b.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    try {
                        service.setValue(key, value);
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            TBSdkLog.i("mtopsdk.XState", "[syncToRemote] sync succeed, key:" + key + ",value:" + value);
                        }
                    } catch (Exception e2) {
                        TBSdkLog.e("mtopsdk.XState", "[syncToRemote] sync error, key:" + key + ",value:" + value, e2);
                    }
                }
                f25043a.compareAndSet(false, true);
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.XState", "syncToRemote error.", th);
            }
        }
    }

    private static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        AsyncServiceBinder<IXState> asyncServiceBinder = c;
        if (asyncServiceBinder == null) {
            return false;
        }
        if (asyncServiceBinder.getService() != null) {
            return true;
        }
        c.asyncBind(e);
        return false;
    }
}
