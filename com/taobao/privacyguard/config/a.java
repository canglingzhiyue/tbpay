package com.taobao.privacyguard.config;

import android.app.Application;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.wireless.security.aopsdk.AopEntry;
import com.alibaba.wireless.security.aopsdk.AopManager;
import com.alibaba.wireless.security.aopsdk.config.ConfigManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.privacyguard.PGBridge;
import java.util.Map;
import tb.kge;
import tb.nkb;
import tb.nkg;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f18945a;
    private static a c;
    private Application b;
    private boolean d;

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "privacy_config";
    }

    static {
        kge.a(1767812006);
        f18945a = "ConfigManager";
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("303fca", new Object[0]);
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.b = application;
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b == null) {
            Log.e(f18945a, "registerOrangeListener: register Orange listener with a null context!");
        } else {
            String b = b();
            if (StringUtils.isEmpty(b)) {
                Log.e(f18945a, "registerOrangeListener: Orange namespace is null!");
                return;
            }
            try {
                OrangeConfig.getInstance().registerListener(new String[]{b}, new d() { // from class: com.taobao.privacyguard.config.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.orange.d
                    public void onConfigUpdate(String str, Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        } else {
                            a.this.a(OrangeConfig.getInstance().getConfigs(str));
                        }
                    }
                }, true);
            } catch (Throwable th) {
                Log.e(f18945a, "registerOrangeListener: occur exception ,maybe orange is not initialized!");
                th.printStackTrace();
            }
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
            Log.e(f18945a, "updateConfigs: configs is null, can not update");
        } else {
            b.a().a(map.get("private_guard_rule_config"));
            new nkg().a();
            this.d = e();
            if (this.d) {
                nkb.e().f();
                try {
                    AopEntry.init(this.b);
                    ConfigManager.getInstance().onConfigChanged(map);
                } catch (Throwable th) {
                    Log.e(f18945a, "updateConfigs: occur error when update config.");
                    th.printStackTrace();
                }
                AopManager.getInstance().setDelegate(new PGBridge());
                ConfigManager.getInstance().forceEnable();
                return;
            }
            ConfigManager.getInstance().forceDisable();
        }
    }

    private static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        RuleConfig b = b.a().b();
        boolean isEnable = b.isEnable();
        if (com.taobao.privacyguard.a.a().e()) {
            Log.e(f18945a, "PGBridge: package is google play ttid, shut down secaop.");
            return false;
        } else if (!com.taobao.privacyguard.a.a().d() && !com.taobao.privacyguard.a.a().f()) {
            return isEnable && (!StringUtils.isEmpty(b.abComponent) ? ABGlobal.isFeatureOpened(com.taobao.privacyguard.a.a().b(), b.abComponent) : false);
        } else {
            String str = f18945a;
            Log.e(str, "PGBridge: package is debuggable or gray scale, open secaop: " + isEnable);
            return isEnable;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }
}
