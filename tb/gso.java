package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import android.util.SparseArray;
import com.alibaba.ut.abtest.internal.bucketing.HighPriorityExperimentStorage;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import com.taobao.android.knife.perf.PerfKnife;
import com.taobao.android.tbtheme.kit.f;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.common.util.ConfigStoreManager;

/* loaded from: classes5.dex */
public class gso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final SparseArray<SharedPreferences> f28429a = new SparseArray<>();
    private static final List<String> b = new ArrayList(128);

    /* loaded from: classes5.dex */
    public interface a {
        SharedPreferences a(Context context, String str, int i);
    }

    static {
        Trace.beginSection("IOKnife#cinit");
        b.add(FeatureManager.FEATURE_KEY_CRASH);
        b.add("instant_patch");
        b.add("ab_watcher_indices_evo_switches");
        b.add("ab_watcher_indices");
        b.add(f.MODULE_NAME);
        b.add("fragment_model_downgrade_switch");
        b.add("group_dinamicX_common_android");
        b.add("homepage_switch");
        b.add("template_data_debug");
        b.add(tcs.BOOTIMAGE_GROUP_NAME);
        b.add("bootimage_coldstart_launch");
        b.add("ab_watcher_indices_evo");
        b.add("ab_watcher_indices_switches");
        b.add(HighPriorityExperimentStorage.SP_NAME_BETA_SINGLE);
        b.add(HighPriorityExperimentStorage.SP_NAME_RELEASE);
        b.add("SwallowsRemoteSoSwitch");
        b.add("SwallowsRemoteSoIndex");
        b.add("com.taobao.tao.welcome.Welcome");
        b.add("com.taobao.taobao_preferences");
        b.add("festivalSP");
        b.add("deviceevaluator");
        b.add("rvision_switch");
        b.add("ut-ab");
        b.add("ut-ab-config");
        b.add("apm");
        b.add("ability_storage_home_atmos");
        b.add("homepage_fragment_sp");
        b.add("homepage_um_ab");
        b.add("home_client_abtest");
        b.add("sp_poplayer_info_v2");
        b.add("adaemon");
        b.add("network_ssl_ticket");
        b.add(ConfigStoreManager.MTOP_CONFIG_STORE);
        b.add(sac.SP_NAME);
        b.add(fxk.DX_GLOBAL_SP);
        b.add("WALLE");
        b.add("home_dx_data");
        b.add("homepage_location_sp");
        b.add("homepage_common");
        b.add("home_pass_params");
        b.add("home_device");
        b.add("performanceAbTestInfo");
        b.add("globalAddress");
        b.add("homepage_biz_switch");
        Trace.endSection();
    }

    public static void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14cf8bd0", new Object[]{context, aVar});
            return;
        }
        try {
            Trace.beginSection("IOKnife#init");
            iyt.a(context);
            for (String str : b) {
                f28429a.put(str.hashCode(), aVar.a(context, str, 0));
            }
        } finally {
            Trace.endSection();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            PerfKnife.b();
        }
    }

    public static SharedPreferences a(Context context, String str, int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("e8e2f4dd", new Object[]{context, str, new Integer(i), aVar});
        }
        SharedPreferences sharedPreferences = f28429a.get(str.hashCode());
        return sharedPreferences == null ? aVar.a(context, str, i) : sharedPreferences;
    }
}
