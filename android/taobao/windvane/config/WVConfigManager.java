package android.taobao.windvane.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class WVConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIGNAME_COMMON = "common";
    public static final String CONFIGNAME_COOKIE = "cookie_black_list";
    public static final String CONFIGNAME_DOMAIN = "domain";
    public static final String CONFIGNAME_LOCALE = "locale";
    public static final String CONFIGNAME_UC_CORE = "uc_core";
    public static final String CONFIGNAME_URL_CONFIG = "WindVane_URL_config";
    public static final String SPNAME_CONFIG = "wv_main_config";
    private static volatile WVConfigManager b;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, b> f1555a = new ConcurrentHashMap<>();

    /* loaded from: classes2.dex */
    public enum WVConfigUpdateFromType {
        WVConfigUpdateFromTypeCustom,
        WVConfigUpdateFromTypeActive,
        WVConfigUpdateFromTypeFinish,
        WVConfigUpdateFromTypePush,
        WVConfigUpdateFromTypeLaunch,
        WVConfigUpdateFromTypeAppActive,
        WVConfigUpdateFromTypeLocaleChange,
        WVConfigUpdateFromZCache3_0
    }

    static {
        kge.a(-1184918173);
        b = null;
    }

    private WVConfigManager() {
    }

    public static WVConfigManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVConfigManager) ipChange.ipc$dispatch("cc589b1a", new Object[0]);
        }
        if (b == null) {
            synchronized (WVConfigManager.class) {
                if (b == null) {
                    b = new WVConfigManager();
                }
            }
        }
        return b;
    }

    public void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7169568", new Object[]{this, str, bVar});
        } else {
            this.f1555a.put(str, bVar);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        b bVar = this.f1555a.get(str);
        if (bVar == null) {
            return;
        }
        bVar.a(str2);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ConcurrentHashMap<String, b> concurrentHashMap = this.f1555a;
        if (concurrentHashMap == null) {
            return;
        }
        for (Map.Entry<String, b> entry : concurrentHashMap.entrySet()) {
            entry.getValue().a("");
        }
    }
}
