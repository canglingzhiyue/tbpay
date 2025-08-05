package tb;

import android.os.Build;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.taolive.room.utils.ag;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class rpn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BaseNode";
    public Map<String, Object> baseSaveMap;
    public long id = -1;
    public String cold_start_id = "";
    public String session_id = "";
    public String pv_key = "";
    public String pv_id = "";
    public String scene = "";
    public String from_scene = "";
    public String event_id = "";
    public String createTime = "";
    public String updateTime = "";
    public String user_id = "";
    public String page = "";
    public Map<String, String> bizMap = null;

    static {
        kge.a(-532070687);
    }

    public abstract String getNodeType();

    public void updateBizMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e577516c", new Object[]{this, map});
            return;
        }
        try {
            this.bizMap = Collections.synchronizedMap(new HashMap(map));
        } catch (Exception unused) {
        }
    }

    public Map<String, Object> getBaseSaveMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("92b751d4", new Object[]{this});
        }
        this.baseSaveMap = Collections.synchronizedMap(new HashMap());
        this.baseSaveMap.put("cold_start_id", rpo.a(this.cold_start_id));
        this.baseSaveMap.put("session_id", rpo.a(this.session_id));
        this.baseSaveMap.put("pv_key", rpo.a(this.pv_key));
        this.baseSaveMap.put("scene", rpo.a(this.scene));
        this.baseSaveMap.put("from_scene", rpo.a(this.from_scene));
        this.baseSaveMap.put(UserTrackDO.COLUMN_EVENT_ID, rpo.a(this.event_id));
        this.baseSaveMap.put("create_time", rpo.a(this.createTime));
        this.baseSaveMap.put("update_time", rpo.a(this.updateTime));
        this.baseSaveMap.put("user_id", rpo.a(this.user_id));
        this.baseSaveMap.put("page", rpo.a(this.page));
        Map<String, String> map = this.bizMap;
        if (map != null) {
            this.baseSaveMap.put("pv_id", rpo.a(map.get("utpvid")));
            this.baseSaveMap.put("arg1", rpo.a(this.bizMap.get(LogField.ARG1.toString())));
            this.baseSaveMap.put("arg2", rpo.a(this.bizMap.get(LogField.ARG2.toString())));
            this.baseSaveMap.put("arg3", rpo.a(this.bizMap.get(LogField.ARG3.toString())));
            try {
                this.baseSaveMap.put("args", rpo.a(JSON.toJSONString(this.bizMap)));
            } catch (Exception unused) {
            }
            this.baseSaveMap.put("spm_cnt", rpo.a(this.bizMap.get("spm-cnt")));
            this.baseSaveMap.put("spm_url", rpo.a(this.bizMap.get("spm-url")));
            this.baseSaveMap.put("spm_pre", rpo.a(this.bizMap.get(bip.KEY_UMBRELLA_SPM_PRE)));
            this.baseSaveMap.put("scm", rpo.a(this.bizMap.get("scm")));
            this.baseSaveMap.put("scm_pre", rpo.a(this.bizMap.get("scm-pre")));
            this.baseSaveMap.put("utparam_cnt", rpo.a(this.bizMap.get("utparam-cnt")));
            this.baseSaveMap.put("utparam_url", rpo.a(this.bizMap.get(ag.KEY_UTPARAM_URL)));
            this.baseSaveMap.put("utparam_pre", rpo.a(this.bizMap.get("utparam-pre")));
            this.baseSaveMap.put("utlogmap", rpo.a(this.bizMap.get("utlogmap")));
            this.baseSaveMap.put("utlogmapedge", rpo.a(this.bizMap.get("utlogmapedge")));
            this.baseSaveMap.put("object_id", rpo.a(this.bizMap.get("object_id")));
            this.baseSaveMap.put("object_type", rpo.a(this.bizMap.get("object_type")));
            rpo.getInstance().a(this.baseSaveMap, this.bizMap);
        }
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
        return rpk.getInstance().getDataCollectorAdapter().commit(BHRTaskConfigBase.TYPE_CONFIG_UT, getNodeType(), this.createTime, this.baseSaveMap);
    }

    public long update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee4a30c4", new Object[]{this})).longValue();
        }
        apr.b("BaseNode", "update id", Long.valueOf(this.id));
        if (this.id < 0) {
            return -1L;
        }
        this.baseSaveMap = getBaseSaveMap();
        if (this.baseSaveMap == null || Build.VERSION.SDK_INT < 21) {
            return -1L;
        }
        return rpk.getInstance().getDataCollectorAdapter().update(BHRTaskConfigBase.TYPE_CONFIG_UT, getNodeType(), this.updateTime, "id=" + this.id, null, this.baseSaveMap);
    }

    public long updatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c881309e", new Object[]{this})).longValue();
        }
        apr.b("BaseNode", "update id", Long.valueOf(this.id), "pageName", this.page, "pv_key", this.pv_key);
        if (this.id < 0 || Build.VERSION.SDK_INT < 21) {
            return -1L;
        }
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap());
        synchronizedMap.put("pv_key", rpo.a(this.pv_key));
        synchronizedMap.put("page", rpo.a(this.page));
        return rpk.getInstance().getDataCollectorAdapter().update(BHRTaskConfigBase.TYPE_CONFIG_UT, getNodeType(), this.updateTime, "id=" + this.id, null, synchronizedMap);
    }

    public String getTableName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3aed216", new Object[]{this});
        }
        return "dc_ut_" + getNodeType();
    }
}
