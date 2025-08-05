package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.d;
import com.taobao.tao.topmultitab.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class kyj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLICK_ACTION_TYPE = "click";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, Object>> f30399a = new HashMap();

    static {
        kge.a(-1828418369);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("realtimeClickParam", str);
        JSONObject a2 = a();
        if (a2 != null) {
            hashMap.put(c.SERVICE_REALTIME_PASS_PARAMS, a2);
        }
        this.f30399a.put("click", hashMap);
    }

    public Map<String, Object> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        if (this.f30399a.isEmpty()) {
            ldf.d("MonitorParamsConstructor", "mRecordMap.isEmpty()");
            return null;
        }
        for (Map.Entry<String, Map<String, Object>> entry : this.f30399a.entrySet()) {
            if (str.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.f30399a.isEmpty()) {
            ldf.d("MonitorParamsConstructor", "clearMonitorParams mRecordMap.isEmpty()");
        } else if (!this.f30399a.containsKey(str)) {
            ldf.d("MonitorParamsConstructor", "!mRecordMap.containsKey(actionType)");
        } else {
            this.f30399a.remove(str);
        }
    }

    private JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject c = d.a().c();
        if (c == null) {
            ldf.d("MonitorParamsConstructor", "ext == null");
            return null;
        }
        return c.getJSONObject(c.SERVICE_REALTIME_PASS_PARAMS);
    }
}
