package com.alibaba.ut.abtest.push;

import android.text.TextUtils;
import com.alibaba.ut.abtest.event.EventType;
import com.alibaba.ut.abtest.event.a;
import com.alibaba.ut.abtest.internal.util.g;
import com.alibaba.ut.abtest.internal.util.h;
import com.alibaba.ut.abtest.internal.util.p;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cex;

/* loaded from: classes3.dex */
public class c implements com.taobao.orange.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f4216a;
    private boolean b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public static /* synthetic */ AtomicBoolean a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("929aff7c", new Object[]{cVar}) : cVar.c;
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("29bf2442", new Object[0]);
        }
        if (f4216a == null) {
            synchronized (c.class) {
                if (f4216a == null) {
                    f4216a = new c();
                }
            }
        }
        return f4216a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        h.a("ABOrangeService", "initialize");
        synchronized (this) {
            if (this.b) {
                h.c("ABOrangeService", "The ABOrangeService has been initialized.");
                return;
            }
            OrangeConfig.getInstance().registerListener(new String[]{"v4_abtest_config"}, this, true);
            this.b = true;
            a("initialize_v5");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h.a("ABOrangeService", "destory");
        synchronized (this) {
            if (!this.b) {
                h.c("ABOrangeService", "The ABOrangeService is not bind.");
                return;
            }
            try {
                OrangeConfig.getInstance().unregisterListener(new String[]{"v4_abtest_config"}, this);
            } catch (Exception e) {
                h.c("ABOrangeService", "v4_abtest_config/v31_beta_abtest_config destroy fail ", e);
            }
            this.b = false;
        }
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        h.a("ABOrangeService", "checkExperimentUpdate, monitorPoint=" + str + ", isExperimentChecking=" + this.c);
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean != null && !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        p.a(new Runnable() { // from class: com.alibaba.ut.abtest.push.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                AtomicBoolean a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs("v4_abtest_config");
                    if (configs == null) {
                        h.d("ABOrangeService", "【实验数据】数据文件配置为空。");
                        if (a2 == null) {
                            return;
                        }
                        return;
                    }
                    String str2 = configs.get("abtest_config");
                    if (TextUtils.isEmpty(str2)) {
                        h.d("ABOrangeService", "【实验数据】数据文件配置为空。");
                        if (c.a(c.this) == null) {
                            return;
                        }
                        c.a(c.this).set(false);
                        return;
                    }
                    com.alibaba.evo.internal.event.e eVar = (com.alibaba.evo.internal.event.e) g.a(str2, (Class<Object>) com.alibaba.evo.internal.event.e.class);
                    if (eVar != null && eVar.f2930a != null) {
                        cex.a().o().a(new a(EventType.ExperimentV5Data, eVar.f2930a, str));
                        if (c.a(c.this) == null) {
                            return;
                        }
                        c.a(c.this).set(false);
                        return;
                    }
                    h.f("ABOrangeService", "实验数据索引数据为空或格式错误。");
                    com.alibaba.ut.abtest.internal.util.b.a(com.alibaba.ut.abtest.internal.util.b.SERVICE_ALARM, "experiment_index_json_illegal", "0", "", false);
                    if (c.a(c.this) == null) {
                        return;
                    }
                    c.a(c.this).set(false);
                } catch (Throwable th) {
                    try {
                        com.alibaba.ut.abtest.internal.util.b.a("ABOrangeService.checkExperimentUpdate", th);
                        if (c.a(c.this) == null) {
                            return;
                        }
                        c.a(c.this).set(false);
                    } finally {
                        if (c.a(c.this) != null) {
                            c.a(c.this).set(false);
                        }
                    }
                }
            }
        });
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        h.a("ABOrangeService", "onConfigUpdate. namespace=" + str + ", map=" + map);
        if (!TextUtils.equals(str, "v4_abtest_config")) {
            return;
        }
        a("notify_v5");
    }
}
