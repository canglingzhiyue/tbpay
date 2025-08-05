package com.alibaba.ut.abtest.internal.bucketing.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.ut.abtest.track.TrackId;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes.dex */
public class ExperimentTrack implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -4060896856005218741L;
    @JSONField(name = "global")
    private boolean appScope;
    @JSONField(serialize = false)
    private long groupId;
    @JSONField(name = "pageNames")
    private String[] pageNames;
    @JSONField(serialize = false)
    private TrackId trackId;

    static {
        kge.a(-240079444);
        kge.a(1028243835);
    }

    public String[] getPageNames() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("3db1f799", new Object[]{this}) : this.pageNames;
    }

    public ExperimentTrack() {
    }

    public ExperimentTrack(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("pageNames");
        if (jSONArray != null) {
            int size = jSONArray.size();
            this.pageNames = new String[size];
            for (int i = 0; i < size; i++) {
                this.pageNames[i] = jSONArray.getString(i);
            }
        }
        Boolean bool = jSONObject.getBoolean("appScope");
        if (bool != null) {
            this.appScope = bool.booleanValue();
        }
    }

    public void setPageNames(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ba97a1", new Object[]{this, strArr});
        } else {
            this.pageNames = strArr;
        }
    }

    public TrackId getTrackId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TrackId) ipChange.ipc$dispatch("5ad07f33", new Object[]{this}) : this.trackId;
    }

    public void setTrackId(TrackId trackId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9498541", new Object[]{this, trackId});
        } else {
            this.trackId = trackId;
        }
    }

    public long getGroupId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f5069a3f", new Object[]{this})).longValue() : this.groupId;
    }

    public void setGroupId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21620e5", new Object[]{this, new Long(j)});
        } else {
            this.groupId = j;
        }
    }

    public boolean isAppScope() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b3f9e608", new Object[]{this})).booleanValue() : this.appScope;
    }

    public void setAppScope(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3a5918", new Object[]{this, new Boolean(z)});
        } else {
            this.appScope = z;
        }
    }

    public String toJsonString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d4e3785", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        String[] strArr = this.pageNames;
        if (strArr != null) {
            for (String str : strArr) {
                jSONArray.add(str);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageNames", (Object) jSONArray);
        if (this.appScope) {
            jSONObject.put("appScope", (Object) true);
        }
        return jSONObject.toJSONString();
    }
}
