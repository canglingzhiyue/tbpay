package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.http.model.ConfigVersion;
import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.wukong.config.WuKongBizConfigData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    public static final String f3288a = "RuleUpdateManager";
    public static Z b;
    public final Map<String, InterfaceC1194aa> c = new HashMap();

    public Z() {
        C1261x.a(new C1264y(this));
    }

    public static synchronized Z a() {
        synchronized (Z.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Z) ipChange.ipc$dispatch("30a07eea", new Object[0]);
            }
            if (b == null) {
                b = new Z();
            }
            return b;
        }
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        InterfaceC1194aa interfaceC1194aa = this.c.get(str);
        return interfaceC1194aa != null ? interfaceC1194aa.c() : "{}";
    }

    public void a(String str, InterfaceC1194aa interfaceC1194aa) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aee2876", new Object[]{this, str, interfaceC1194aa});
        } else {
            this.c.put(str, interfaceC1194aa);
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        InterfaceC1194aa interfaceC1194aa = this.c.get(str);
        return interfaceC1194aa != null ? interfaceC1194aa.a() : "{}";
    }

    public void a(ConfigVersion configVersion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef0ff3c", new Object[]{this, configVersion});
            return;
        }
        try {
            final VersionInfo versionInfo = (VersionInfo) JsonUtils.parseObject(b(configVersion.ccrcCode), (Class<Object>) VersionInfo.class);
            final VersionInfo versionInfo2 = (VersionInfo) JsonUtils.parseObject(configVersion.versionInfo, (Class<Object>) VersionInfo.class);
            if (versionInfo2 == null) {
                Logging.w(f3288a, "server version info parse null");
            } else if (versionInfo2.compare(versionInfo)) {
                Logging.w(f3288a, "local version equals server version");
            } else {
                final InterfaceC1194aa interfaceC1194aa = this.c.get(configVersion.ccrcCode);
                if (interfaceC1194aa == null) {
                    Logging.w(f3288a, "config update is null");
                    return;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                interfaceC1194aa.a(new InterfaceC1248sb() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$NnAFc28F20SkNwZHx6pBuv-t5eE
                    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1248sb
                    public final void a(boolean z, String str, WuKongBizConfigData wuKongBizConfigData) {
                        Z.a(VersionInfo.this, versionInfo, interfaceC1194aa, countDownLatch, z, str, wuKongBizConfigData);
                    }
                });
                countDownLatch.await(30L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            Logging.e(f3288a, "forceUpdateConfig fail", th);
        }
    }

    public static /* synthetic */ void a(VersionInfo versionInfo, VersionInfo versionInfo2, InterfaceC1194aa interfaceC1194aa, CountDownLatch countDownLatch, boolean z, String str, WuKongBizConfigData wuKongBizConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("538ed8c6", new Object[]{versionInfo, versionInfo2, interfaceC1194aa, countDownLatch, new Boolean(z), str, wuKongBizConfigData});
            return;
        }
        if (z && versionInfo.needUpdate(versionInfo2)) {
            interfaceC1194aa.b(wuKongBizConfigData.eventConf.event);
            interfaceC1194aa.a(versionInfo.ruleSet);
        }
        countDownLatch.countDown();
    }
}
