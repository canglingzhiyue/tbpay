package com.taobao.downgrade;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.rule.AvailableBizRule;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kkq;
import tb.kkt;
import tb.kku;

/* loaded from: classes.dex */
public class Downgrade implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONFIG_KEY_BIZ = "BizConfig";
    private static final String CONFIG_KEY_EFF = "AvailableBiz";
    private static final String CONFIG_KEY_GLOBAL = "GlobalConfig";
    private static final String CONFIG_NAMESPACE_EFF = "android_kite_effective_biz";
    private static final String CONFIG_NAMESPACE_GLOBAL = "android_kite_global_config";
    private static final int MSG_AVAILABLE = 3;
    private static final int MSG_GIZ = 1;
    private static final int MSG_GLOBAL = 2;
    private static final String NULL_BIZ = "nullBiz";
    public static final String TAG = "BYDowngrade";
    private static AtomicBoolean init = new AtomicBoolean(false);
    public static boolean isTest = false;
    private DefaultRule mDefaultRule;
    private g mPerformanceMonitor;
    private final kkt mStorage;
    private Handler mWorkHandler;
    private HandlerThread mWorkHandlerThread;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Downgrade f17068a = new Downgrade();
    }

    public static /* synthetic */ Handler access$000(Downgrade downgrade) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e6e3d708", new Object[]{downgrade}) : downgrade.mWorkHandler;
    }

    private Downgrade() {
        this.mStorage = kku.a(0);
        initWorkHandlerThread();
        if (this.mWorkHandler != null && this.mStorage != null) {
            startPerformanceMonitor();
        }
        q.a(AliHADowngradeSDKBridge.JS_BRIDGE_SDK_NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) AliHADowngradeSDKBridge.class, false);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (c.a() == null || !c.a().equals(c.b())) {
        } else {
            initGlobalListener();
        }
    }

    private void initWorkHandlerThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb4ae3a", new Object[]{this});
            return;
        }
        this.mWorkHandlerThread = new HandlerThread("downgradeThread");
        this.mWorkHandlerThread.start();
        this.mWorkHandler = new Handler(this.mWorkHandlerThread.getLooper(), this);
    }

    private void saveBizConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b94dc9", new Object[]{this, str});
        } else {
            this.mStorage.a(str);
        }
    }

    private void saveGlobalConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8046b3f3", new Object[]{this, str});
        } else {
            this.mStorage.b(str);
        }
    }

    private AvailableBizRule saveAndCleanAvailableConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailableBizRule) ipChange.ipc$dispatch("b9169c6c", new Object[]{this, str});
        }
        AvailableBizRule c = kkq.c(str);
        if (!this.mStorage.c(str)) {
            return null;
        }
        this.mStorage.d(str);
        return c;
    }

    private void initGlobalListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd9c7ae", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{CONFIG_NAMESPACE_EFF, CONFIG_NAMESPACE_GLOBAL}, new com.taobao.orange.d() { // from class: com.taobao.downgrade.Downgrade.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    String config;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    } else if (Downgrade.CONFIG_NAMESPACE_GLOBAL.equals(str)) {
                        String config2 = OrangeConfig.getInstance().getConfig(str, Downgrade.CONFIG_KEY_GLOBAL, null);
                        if (config2 == null) {
                            return;
                        }
                        Message.obtain(Downgrade.access$000(Downgrade.this), 2, config2).sendToTarget();
                    } else if (!Downgrade.CONFIG_NAMESPACE_EFF.equals(str) || (config = OrangeConfig.getInstance().getConfig(str, Downgrade.CONFIG_KEY_EFF, null)) == null) {
                    } else {
                        Message.obtain(Downgrade.access$000(Downgrade.this), 3, config).sendToTarget();
                    }
                }
            }, false);
        }
    }

    private void initBizListener(AvailableBizRule availableBizRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368690a1", new Object[]{this, availableBizRule});
        } else if (availableBizRule == null || availableBizRule.getBizMap() == null) {
        } else {
            Set<String> keySet = availableBizRule.getBizMap().keySet();
            if (keySet.size() == 0) {
                return;
            }
            String[] strArr = new String[keySet.size()];
            keySet.toArray(strArr);
            OrangeConfig.getInstance().registerListener(strArr, new com.taobao.orange.d() { // from class: com.taobao.downgrade.Downgrade.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    String config = OrangeConfig.getInstance().getConfig(str, Downgrade.CONFIG_KEY_BIZ, null);
                    if (config == null) {
                        return;
                    }
                    Message.obtain(Downgrade.access$000(Downgrade.this), 1, config).sendToTarget();
                }
            }, false);
        }
    }

    private void startPerformanceMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f024b993", new Object[]{this});
        } else if (this.mPerformanceMonitor != null) {
        } else {
            this.mPerformanceMonitor = new g(this.mWorkHandler, this.mStorage);
            this.mPerformanceMonitor.a();
        }
    }

    public static Downgrade getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Downgrade) ipChange.ipc$dispatch("1826310b", new Object[0]) : a.f17068a;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AvailableBizRule saveAndCleanAvailableConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            saveBizConfig((String) message.obj);
        } else if (i == 2) {
            saveGlobalConfig((String) message.obj);
        } else if (i == 3 && (saveAndCleanAvailableConfig = saveAndCleanAvailableConfig((String) message.obj)) != null) {
            initBizListener(saveAndCleanAvailableConfig);
        }
        return false;
    }

    public static void init(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48838554", new Object[]{context, map});
        } else if (!init.compareAndSet(false, true)) {
        } else {
            if (map != null) {
                c.d(h.a(map, "appVersion", ""));
                c.e(h.a(map, "userId", "0"));
                c.a(h.a(map, "deviceId", ""));
                c.c(h.a(map, "process", ""));
                c.b(h.a(map, "packageName", ""));
            }
            c.a(context);
            getInstance().init();
        }
    }

    public DowngradeStrategy getDowngradeStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("f5075067", new Object[]{this, str});
        }
        DefaultRule f = this.mStorage.f("default");
        if (f == null || !f.power) {
            return i.a();
        }
        if (f.degrade) {
            return i.b();
        }
        if (StringUtils.isEmpty(str)) {
            return i.a(f, NULL_BIZ);
        }
        BusinessRule e = this.mStorage.e(str);
        if (e == null) {
            return i.a(f, str);
        }
        DowngradeStrategy a2 = i.a(e, f);
        return a2 == null ? i.a(f, str) : a2;
    }
}
