package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.c;
import com.taobao.downgrade.e;
import com.taobao.downgrade.j;
import com.taobao.downgrade.rule.DefaultRule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class kkr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_FILTER_ID = "biz_filter_id";
    public static final String BIZ_ID = "biz_id";
    public static final String COLD_LAUNCHER_TIME = "cold_launch_time";
    public static final String CPU_ARCH = "cpu_arch";
    public static final String DEVICE_CPU_PERCENT = "device_cpu_percent";
    public static final String DEVICE_MEM_LEFT = "device_mem_left";
    public static final String DEVICE_MEM_PERCENT = "device_mem_percent";
    public static final String DEVICE_RUNTIME_SORE = "device_runtime_sore";
    public static final String DEVICE_TEMPERATURE = "device_temperature";
    public static final String GPU_SCORE = "gpu_score";
    public static final String HARDWARE_SORE = "hardware_sore";
    public static final String OLD_DEVICE_SCORE_ID = "old_device_score_id";
    public static final String PAGE_URL = "page_url";
    public static final String PERCENT = "percent";
    public static final String PERFORMANCE_WEIGHTS_ID = "performance_weights_id";
    public static final String SCORE_LEVEL_VARIABLE_ID = "score_level_variable_id";
    public static final String SCORE_TACTICS_MAPPING_ID = "score_tactics_mapping_id";
    public static final String TACTICS_FUNCTION = "tactics_function";
    public static final String TACTICS_PERFORMANCE = "tactics_performance";
    public static final String UPLOAD_TYPE = "upload_type";

    public static void a(DefaultRule defaultRule) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def2342", new Object[]{defaultRule});
            return;
        }
        Map<String, Integer> c = e.c(defaultRule);
        int e = c.e();
        if (c != null) {
            i = c.a(c, e.b(defaultRule), e.a(defaultRule, c.get(e.RUNTIME_CPU)), e.a(defaultRule), e);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(HARDWARE_SORE, String.valueOf(e));
        hashMap.put(DEVICE_MEM_LEFT, String.valueOf(c.k()));
        hashMap.put(DEVICE_MEM_PERCENT, String.valueOf(c.l()));
        hashMap.put(DEVICE_CPU_PERCENT, String.valueOf(c.a(defaultRule.androidCpuOpen)));
        hashMap.put("cold_launch_time", String.valueOf(c.j()));
        hashMap.put(DEVICE_TEMPERATURE, String.valueOf(c.n()));
        hashMap.put("globalId", defaultRule.globalId);
        hashMap.put(GPU_SCORE, String.valueOf(c.q()));
        hashMap.put(CPU_ARCH, String.valueOf(c.p()));
        new j(j.EVENT_PAGE_MASTER, c.m(), String.valueOf(i), hashMap).a();
    }
}
