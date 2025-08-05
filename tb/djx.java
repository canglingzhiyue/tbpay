package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.alibaba.evo.EVO;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.c;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class djx implements d, dkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f26797a;
    private SharedPreferences b;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private volatile boolean d = true;
    private final Map<String, Boolean> e = new HashMap();

    @Override // tb.dkf
    public void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{this, context, str, new Boolean(z)});
        }
    }

    @Override // tb.dkf
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!this.c.compareAndSet(false, true)) {
        } else {
            this.f26797a = context.getSharedPreferences("ab_watcher_indices_evo", 0);
            this.d = this.f26797a.getBoolean("evo_migration_enable", true);
            this.b = context.getSharedPreferences("ab_watcher_indices_evo_switches", 0);
            a(this.b);
        }
    }

    private void a(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d7097c", new Object[]{this, sharedPreferences});
            return;
        }
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            this.e.put(entry.getKey(), Boolean.valueOf(entry.getValue().toString()));
        }
    }

    @Override // tb.dkf
    public Boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3961d127", new Object[]{this, context, str});
        }
        if (!this.d) {
            return null;
        }
        Boolean bool = this.e.get(str);
        if (bool != null) {
            return bool;
        }
        VariationSet activateSync = EVO.activateSync(context, str);
        if (activateSync.size() > 0 && activateSync.contains(str)) {
            return Boolean.valueOf(activateSync.getVariation(str).getValueAsBoolean(false));
        }
        return null;
    }

    @Override // tb.dkf
    public void a(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{this, context, map});
            return;
        }
        a(context);
        OrangeConfig.getInstance().getConfigs("ab_watcher_indices");
        OrangeConfig.getInstance().registerListener(new String[]{"ab_watcher_indices"}, this, true);
        ArrayList arrayList = new ArrayList();
        if (this.f26797a != null) {
            b(arrayList);
        }
        if (arrayList.isEmpty()) {
            a(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Pair<String, String> pair : arrayList) {
            arrayList2.add(a((String) pair.first, (String) pair.second));
        }
        Iterator<Variation>[] itArr = new Iterator[arrayList2.size()];
        arrayList2.toArray(itArr);
        boolean a2 = a(itArr);
        djy.a("EvoSwitchesImpl", "batch commit result: " + a2);
    }

    private void a(List<Pair<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        list.add(Pair.create("AB_STARTUP_FY24", "cold_bootstrap_homepage"));
        list.add(Pair.create("AB_STARTUP_FY24", "cold_bootstrap_homepage_s2_q3"));
        list.add(Pair.create("AB_", "202309121028_4189"));
        list.add(Pair.create("AB_", "202308101133_3951"));
        list.add(Pair.create("AB_", "202308101427_3952"));
        list.add(Pair.create("AB_", "202204021152_2"));
        list.add(Pair.create("AB_", "202204061629_2"));
        list.add(Pair.create("AB_", "202208151043_37"));
        list.add(Pair.create("AB_", "202209201536_487"));
        list.add(Pair.create("AB_", "202312151551_694"));
        list.add(Pair.create("AB_", "202402201036_5679"));
        list.add(Pair.create("AB_", "202402261007_5697"));
    }

    private void b(List<Pair<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        String string = this.f26797a.getString("evo_prefetch_experiments", "_empty_");
        if (string == null || string.length() == 0) {
            return;
        }
        for (String str : string.split(",")) {
            String[] split = str.split(":");
            if (split.length >= 2) {
                list.add(Pair.create(split[0], split[1]));
            }
        }
    }

    private Iterator<Variation> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("c841187b", new Object[]{this, str, str2});
        }
        VariationSet activate = UTABTest.activate(str, str2);
        Iterator<Variation> it = activate.iterator();
        djy.a("EvoSwitchesImpl", "activate with component and module: " + str + ", " + str2);
        djy.a("EvoSwitchesImpl", "received evo data after evo activated, switch count: " + activate.size() + ", id:" + activate.getExperimentId() + ", releaseId:" + activate.getExperimentReleaseId() + ", bucketId:" + activate.getExperimentBucketId());
        AppMonitor.Counter.commit(gve.MODULE, "age", "type=activate,count=" + activate.size() + ",id=" + activate.getExperimentId() + ",releaseId=" + activate.getExperimentReleaseId() + ",bucketId=" + activate.getExperimentBucketId(), 1.0d);
        return it;
    }

    private boolean a(Iterator<Variation>... itArr) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7176c652", new Object[]{this, itArr})).booleanValue();
        }
        if (itArr.length == 0 || (sharedPreferences = this.b) == null) {
            return false;
        }
        SharedPreferences.Editor clear = sharedPreferences.edit().clear();
        for (Iterator<Variation> it : itArr) {
            while (it.hasNext()) {
                Variation next = it.next();
                clear.putBoolean(next.getName(), next.getValueAsBoolean(false));
            }
        }
        return clear.commit();
    }

    @Override // com.taobao.orange.d
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (map == null || Boolean.parseBoolean(map.get("fromCache"))) {
            djy.a("EvoSwitchesImpl", "discard this update because of it is from cache");
        } else {
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
            if (configs == null) {
                djy.a("EvoSwitchesImpl", "no config found for " + str + " in orange");
                return;
            }
            boolean parseBoolean = Boolean.parseBoolean((String) djy.a(configs, "evo_migration_enable", "true"));
            String str2 = (String) djy.a(configs, "evo_prefetch_experiments", "");
            SharedPreferences sharedPreferences = this.f26797a;
            if (sharedPreferences == null) {
                djy.a("EvoSwitchesImpl", "sp is null, maybe not it, something went wrong");
            } else if (sharedPreferences.getBoolean("evo_migration_enable", true) != parseBoolean) {
                this.f26797a.edit().putBoolean("evo_migration_enable", parseBoolean).putString("evo_prefetch_experiments", str2).commit();
            } else {
                this.f26797a.edit().putString("evo_prefetch_experiments", str2).commit();
            }
        }
    }

    @Override // tb.dkf
    public c b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("be53a6fd", new Object[]{this, context}) : dkl.EMPTY;
    }

    @Override // tb.dkf
    public Map<String, dkl> c(Context context) throws UnsupportedOperationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{this, context});
        }
        throw new UnsupportedOperationException("unsupported operation");
    }
}
