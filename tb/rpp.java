package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rpp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Edge";
    public Map<String, Object> baseSaveMap;
    public long id = -1;
    public long left_node_id = 0;
    public long right_node_id = 0;
    public String left_table = "";
    public String right_table = "";
    public String left_event_id = "";
    public String right_event_id = "";
    public String left_event_name = "";
    public String right_event_name = "";
    public String left_scene = "";
    public String right_scene = "";
    public String create_time = "";
    public String update_time = "";

    static {
        kge.a(670546731);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "edge";
    }

    public Map<String, Object> getBaseSaveMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92b751d4", new Object[]{this});
        }
        this.baseSaveMap = Collections.synchronizedMap(new HashMap());
        this.baseSaveMap.put("left_node_id", Long.valueOf(this.left_node_id));
        this.baseSaveMap.put("right_node_id", Long.valueOf(this.right_node_id));
        this.baseSaveMap.put("left_table", rpo.a(this.left_table));
        this.baseSaveMap.put("right_table", rpo.a(this.right_table));
        this.baseSaveMap.put("left_event_id", rpo.a(this.left_event_id));
        this.baseSaveMap.put("right_event_id", rpo.a(this.right_event_id));
        this.baseSaveMap.put("left_event_name", rpo.a(this.left_event_name));
        this.baseSaveMap.put("right_event_name", rpo.a(this.right_event_name));
        this.baseSaveMap.put("left_scene", rpo.a(this.left_scene));
        this.baseSaveMap.put("right_scene", rpo.a(this.right_scene));
        this.baseSaveMap.put("create_time", rpo.a(this.create_time));
        return this.baseSaveMap;
    }

    public long save() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84643f78", new Object[]{this})).longValue();
        }
        this.baseSaveMap = getBaseSaveMap();
        if (this.baseSaveMap == null || Build.VERSION.SDK_INT < 21) {
            return -1L;
        }
        return rpk.getInstance().getDataCollectorAdapter().commit(BHRTaskConfigBase.TYPE_CONFIG_UT, a(), this.create_time, this.baseSaveMap);
    }

    public long update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee4a30c4", new Object[]{this})).longValue();
        }
        apr.b(TAG, "update id", Long.valueOf(this.id));
        if (this.id < 0) {
            return -1L;
        }
        this.baseSaveMap = getBaseSaveMap();
        if (this.baseSaveMap == null || Build.VERSION.SDK_INT < 21) {
            return -1L;
        }
        return rpk.getInstance().getDataCollectorAdapter().update(BHRTaskConfigBase.TYPE_CONFIG_UT, a(), "" + System.currentTimeMillis(), "id=" + this.id, null, this.baseSaveMap);
    }
}
