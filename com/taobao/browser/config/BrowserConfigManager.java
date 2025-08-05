package com.taobao.browser.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class BrowserConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIGNAME_LOADING = "loading";
    public static final String KEY_DATA = "-wv-data";
    public static final String SPNAME_CONFIG = "browser_config_";
    private static volatile BrowserConfigManager b;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, android.taobao.windvane.config.b> f16769a = new ConcurrentHashMap<>();

    /* loaded from: classes6.dex */
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
        kge.a(1615683350);
        b = null;
    }

    private BrowserConfigManager() {
    }

    public static BrowserConfigManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserConfigManager) ipChange.ipc$dispatch("32407c7", new Object[0]);
        }
        if (b == null) {
            synchronized (BrowserConfigManager.class) {
                if (b == null) {
                    b = new BrowserConfigManager();
                }
            }
        }
        return b;
    }

    public void a(String str, android.taobao.windvane.config.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7169568", new Object[]{this, str, bVar});
        } else {
            this.f16769a.put(str, bVar);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        android.taobao.windvane.config.b bVar = this.f16769a.get(str);
        if (bVar == null) {
            return;
        }
        bVar.a(str2);
    }
}
