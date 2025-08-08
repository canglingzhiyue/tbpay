package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.b;
import com.taobao.android.ab.api.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class dkb implements d, Runnable, dkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SharedPreferences b;
    private final Map<String, dkl> c = new ConcurrentHashMap();
    private final AtomicReference<a> d = new AtomicReference<>(null);
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final AtomicReference<a> g = new AtomicReference<>(null);
    private final AtomicReference<dkd> h = new AtomicReference<>(null);
    private volatile String i = null;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f26801a = djy.a("ab-o-puller", 1, 1, 3000, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f26806a;
        public final String b;

        public a(boolean z, String str) {
            this.f26806a = z;
            this.b = str;
        }
    }

    public static /* synthetic */ SharedPreferences a(dkb dkbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("c0e74dd1", new Object[]{dkbVar}) : dkbVar.b;
    }

    public dkb(Context context) {
        this.b = context.getSharedPreferences("ab_watcher_indices", 0);
    }

    @Override // tb.dkf
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.e.compareAndSet(false, true)) {
            d(context);
        } else {
            this.b.getBoolean("status", false);
        }
    }

    private void d(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        String string = this.b.getString("ab_config_cdn", "");
        boolean z2 = this.b.getBoolean("status", false);
        String string2 = this.b.getString("ab_config_json", "");
        if (!a(context, this.b)) {
            a();
        } else {
            z = z2;
        }
        a aVar = new a(z, string);
        if (this.d.compareAndSet(null, aVar)) {
            djy.a("OrangeConfigImpl", "index updated");
        }
        if (z) {
            Map<String, dkl> a2 = dko.a(string2);
            this.c.clear();
            this.c.putAll(a2);
        }
        if (this.g.compareAndSet(null, aVar)) {
            return;
        }
        djy.a("OrangeConfigImpl", "::init, something went wrong");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        djy.a("OrangeConfigImpl", "environment check failed, clearing the ab data");
        this.f26801a.submit(new Runnable() { // from class: tb.dkb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                djy.a("OrangeConfigImpl", "environment check failed, clear the ab data");
                dkb.a(dkb.this).edit().clear().commit();
            }
        });
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        a aVar = this.d.get();
        return aVar != null && aVar.f26806a;
    }

    private void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{this, context});
            return;
        }
        a(context);
        if (!b() || this.c.size() <= 0) {
            return;
        }
        djy.a("OrangeConfigImpl", "tracking ab data off");
    }

    private boolean a(Context context, SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebc94e88", new Object[]{this, context, sharedPreferences})).booleanValue();
        }
        String string = sharedPreferences.getString("ab_condition_ver", "");
        djy.a("OrangeConfigImpl", "checkEnvironment, local version=" + string);
        String b = djy.b(context);
        djy.a("OrangeConfigImpl", "checkEnvironment, runtime version=" + b);
        this.i = b;
        return StringUtils.isEmpty(b) || StringUtils.equals(string, b);
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        djy.a("OrangeConfigImpl", "onConfigUpdate");
        a(str, map);
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
            djy.a("OrangeConfigImpl", "discard this update because of it is from cache");
        } else {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs == null) {
                djy.a("OrangeConfigImpl", "no config found for " + str + " in orange");
                return;
            }
            final a aVar = new a("1".equals((String) djy.a(configs, "status", "0")), (String) djy.a(configs, "ab_config_cdn", ""));
            a andSet = this.g.getAndSet(aVar);
            if (andSet != null) {
                djy.a("OrangeConfigImpl", "readConfig, oldIndex {status:" + andSet.f26806a + ", cdnURL:" + andSet.b + riy.BLOCK_END_STR);
            }
            djy.a("OrangeConfigImpl", "readConfig, newIndex {status:" + aVar.f26806a + ", cdnURL:" + aVar.b + riy.BLOCK_END_STR);
            if (andSet == null || !aVar.b.equals(andSet.b)) {
                djy.a("OrangeConfigImpl", "local cdnURL used an older version comparing with remote, sync it");
                this.f26801a.submit(this);
            } else if (aVar.f26806a != andSet.f26806a) {
                djy.a("OrangeConfigImpl", "switch status updated, saving it into local");
                this.f26801a.submit(new Runnable() { // from class: tb.dkb.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        dkb.a(dkb.this).edit().putBoolean("status", aVar.f26806a).commit();
                        djy.a("OrangeConfigImpl", "saved switch status into local");
                    }
                });
            } else {
                djy.a("OrangeConfigImpl", "local cdnURL is up to date with remote, discard");
            }
            this.f26801a.submit(new Runnable() { // from class: tb.dkb.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    }
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        dkd dkdVar = this.h.get();
        if (dkdVar == null) {
            djy.a("OrangeConfigImpl", "something went wrong when get puller instance");
            return;
        }
        a aVar = this.g.get();
        Map<String, dkl> a2 = dkdVar.a(aVar.b);
        if (a2 == null) {
            djy.a("OrangeConfigImpl", "sync pull from remote failed");
            this.b.edit().putBoolean("status", aVar.f26806a).putString("ab_condition_ver", this.i).commit();
            djy.a("OrangeConfigImpl", "warning, update switch only");
            return;
        }
        String a3 = dko.a(a2);
        if (StringUtils.isEmpty(a3)) {
            a3 = "{}";
        }
        this.b.edit().putBoolean("status", aVar.f26806a).putString("ab_config_cdn", aVar.b).putString("ab_condition_ver", this.i).putString("ab_config_json", a3).commit();
        djy.a("OrangeConfigImpl", "saved new experiment configs into local");
    }

    @Override // tb.dkf
    public Boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3961d127", new Object[]{this, context, str});
        }
        a(context);
        if (!b()) {
            return null;
        }
        Iterator<b> a2 = b(context).a();
        while (a2.hasNext()) {
            b next = a2.next();
            if (next.a().equals(str)) {
                return Boolean.valueOf(next.a(false));
            }
        }
        return null;
    }

    @Override // tb.dkf
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        } else {
            djy.a("OrangeConfigImpl", "unsupported operation");
        }
    }

    @Override // tb.dkf
    public Map<String, dkl> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{this, context});
        }
        a(context);
        if (b()) {
            return Collections.unmodifiableMap(this.c);
        }
        return Collections.emptyMap();
    }

    @Override // tb.dkf
    public c b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("be53a6fd", new Object[]{this, context});
        }
        a(context);
        if (b()) {
            dkl dklVar = this.c.get(dkf.KEY_AGE_VARIATIONS);
            return dklVar == null ? dkl.EMPTY : dklVar;
        }
        return dkl.EMPTY;
    }

    @Override // tb.dkf
    public void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        a(context);
        if (this.f.compareAndSet(false, true)) {
            e(context);
        }
        final String str = (String) map.get("deviceId");
        String str2 = (String) map.get("appVersion");
        this.i = str2;
        if (!this.h.compareAndSet(null, new dkd(context, str2, new dkc() { // from class: tb.dkb.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dkc
            public String a(String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("9f352ae", new Object[]{this, str3});
                }
                djy.a("OrangeConfigImpl", "RemoteConfigPuller#get type=" + str3 + ", currently support utdid only");
                return str;
            }
        }))) {
            djy.a("OrangeConfigImpl", "watchForRevision, something went wrong");
        }
        OrangeConfig.getInstance().getConfigs("ab_watcher_indices");
        OrangeConfig.getInstance().registerListener(new String[]{"ab_watcher_indices"}, this, true);
    }
}
