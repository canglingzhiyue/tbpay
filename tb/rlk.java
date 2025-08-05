package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.utils.a;
import com.tmall.android.dai.compute.DAIComputeService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class rlk extends rln<List<Map<String, String>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SINK_TYPE = "python_cep_task";
    public static final String TAG = "PythonCepTaskSink";
    private final String b;
    private final boolean c;

    static {
        kge.a(1543250497);
    }

    public rlk(String str, String str2, boolean z) {
        super(str);
        this.b = str2;
        this.c = z;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    @Override // tb.rln
    public void a(List<Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.c) {
            hashMap.put("match_seq", JSON.toJSONString(list));
        } else if (list.size() > 0) {
            hashMap.putAll(list.get(0));
        } else {
            a.d("Cep", "cannot run PythonCepTaskSink because input is empty");
        }
        try {
            rkq.d().m().a(this.b, hashMap, DAIComputeService.TaskPriority.NORMAL, null, this.f33224a);
        } catch (Exception e) {
            Log.e(TAG, "run cep sink exception", e);
        }
    }
}
