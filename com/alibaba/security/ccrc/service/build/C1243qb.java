package com.alibaba.security.ccrc.service.build;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.security.ccrc.common.http.model.VersionInfo;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.wukong.config.WuKongBizConfigData;
import com.alibaba.security.wukong.config.WuKongConfigData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.security.ccrc.service.build.qb */
/* loaded from: classes3.dex */
public class C1243qb implements InterfaceC1240pb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a */
    public static final String f3322a = "RuleConfigCacheManager";
    public static final String b = "config";
    public static final String c = "config_v2";
    public static final String d = "config_v3";
    public static final String e = "config_v4";
    public static final String f = "valid_timestamp";
    public final String g;
    public WuKongConfigData h;
    public SharedPreferences i;
    public boolean j;
    public VersionInfo k = new VersionInfo();

    public C1243qb(String str) {
        this.g = str;
        h();
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            j().edit().putString(e, str).apply();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!k()) {
        } else {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Ka(f3322a));
            threadPoolExecutor.execute(new Runnable() { // from class: com.alibaba.security.ccrc.service.build.-$$Lambda$qb$vF6nm21Sy-7sY_tWs7Y-t8989ew
                {
                    C1243qb.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1243qb.m249lambda$vF6nm21Sy7sY_tWs7Yt8989ew(C1243qb.this, threadPoolExecutor);
                }
            });
        }
    }

    private String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : j().getString(e, null);
    }

    private synchronized SharedPreferences j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("5019b485", new Object[]{this});
        }
        if (this.i == null) {
            Context context = CcrcContextImpl.getContext();
            StringBuilder a2 = Yb.a("wukong_");
            a2.append(this.g);
            this.i = context.getSharedPreferences(a2.toString(), 0);
        }
        return this.i;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : j().contains("config") || j().contains(c) || j().contains(d);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        c("config");
        c(c);
        c(d);
    }

    /* renamed from: lambda$vF6nm21Sy-7sY_tWs7Y-t8989ew */
    public static /* synthetic */ void m249lambda$vF6nm21Sy7sY_tWs7Yt8989ew(C1243qb c1243qb, ThreadPoolExecutor threadPoolExecutor) {
        c1243qb.a(threadPoolExecutor);
    }

    public void a(WuKongConfigData wuKongConfigData, WuKongBizConfigData wuKongBizConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f464e85d", new Object[]{this, wuKongConfigData, wuKongBizConfigData});
        } else if (wuKongConfigData == null || wuKongBizConfigData == null) {
        } else {
            this.h = wuKongConfigData;
            d(JsonUtils.toJSONString(this.h));
            g();
        }
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public WuKongBizConfigData b() {
        WuKongConfigData wuKongConfigData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WuKongBizConfigData) ipChange.ipc$dispatch("bc0884ff", new Object[]{this});
        }
        WuKongConfigData wuKongConfigData2 = this.h;
        if (wuKongConfigData2 != null) {
            return wuKongConfigData2.content;
        }
        if (!Kb.b().f()) {
            return null;
        }
        String i = i();
        if (TextUtils.isEmpty(i) || (wuKongConfigData = (WuKongConfigData) JsonUtils.parseObject(i, (Class<Object>) WuKongConfigData.class)) == null) {
            return null;
        }
        this.h = wuKongConfigData;
        this.j = true;
        return this.h.content;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : JsonUtils.toJSONString(this.k);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : j().contains(f) && Math.abs(System.currentTimeMillis() - j().getLong(f, 0L)) > Kb.b().e();
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.j;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (j().contains(f)) {
        } else {
            j().edit().putLong(f, System.currentTimeMillis()).apply();
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!j().contains(str)) {
        } else {
            j().edit().remove(str).apply();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c(e);
        c(f);
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        VersionInfo versionInfo = (VersionInfo) JsonUtils.parseObject(str, (Class<Object>) VersionInfo.class);
        if (versionInfo == null) {
            return;
        }
        this.k = versionInfo;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        VersionInfo versionInfo = this.k;
        if (versionInfo == null) {
            return;
        }
        versionInfo.ruleSet = map;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1240pb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        WuKongBizConfigData b2 = b();
        return b2 != null ? b2.eventConf.versionInfo : "{}";
    }

    public /* synthetic */ void a(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("268a848", new Object[]{this, threadPoolExecutor});
            return;
        }
        try {
            l();
            threadPoolExecutor.shutdown();
        } catch (Throwable unused) {
        }
    }
}
