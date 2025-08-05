package com.alibaba.poplayer.config.model.predeal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.bzl;
import tb.kge;

/* loaded from: classes2.dex */
public class PreDealCustomEventParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long dealEndTime;
    private long dealStartTime;
    private long sdkWaitTime;
    private String traceId;
    private Set<String> uriSet = new HashSet();
    private Map<String, PreDealIndexContent> indexMap = new HashMap();
    private JSONObject trackMap = new JSONObject();

    static {
        kge.a(1355936005);
        kge.a(1028243835);
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        Set<String> set = this.uriSet;
        return set != null && !set.isEmpty();
    }

    public long getPreDealCostTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47f3dbce", new Object[]{this})).longValue();
        }
        long j = this.dealEndTime;
        long j2 = this.dealStartTime;
        if (j > j2 && j2 > 0) {
            return (j - j2) / 1000;
        }
        return 0L;
    }

    public long generateSdkWaitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("549e4c82", new Object[]{this})).longValue();
        }
        long j = this.dealEndTime;
        if (j > 0) {
            long j2 = this.sdkWaitTime;
            if (j2 > 0) {
                return (j - j2) / 1000;
            }
        }
        return 0L;
    }

    public String getContentById(String str) {
        PreDealIndexContent preDealIndexContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53a335da", new Object[]{this, str});
        }
        Map<String, PreDealIndexContent> map = this.indexMap;
        return (map == null || (preDealIndexContent = map.get(str)) == null) ? "" : preDealIndexContent.getContent();
    }

    public void syncModuleByIndexId(String str, OnePopModule onePopModule) {
        PreDealIndexContent preDealIndexContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95ecb67", new Object[]{this, str, onePopModule});
        } else if (this.indexMap == null || bzl.a().b() == null || !bzl.a().b().isRecordBucketId() || (preDealIndexContent = this.indexMap.get(str)) == null) {
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(JSON.parseObject(JSON.parseObject(preDealIndexContent.getContent()).getString("algParams")).getString("algParams"));
                onePopModule.X = parseObject.getString("bucketId");
                onePopModule.Z = parseObject.getString(OConstant.DIMEN_CONFIG_NAME);
            } catch (Throwable th) {
                c.a("PreDealCustomBroadcastReceiver.getBucketIdFromPreDealIndexContent.error.", th);
            }
        }
    }

    public Set<String> getUriSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("efe08782", new Object[]{this}) : this.uriSet;
    }

    public void setUriSet(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57df3e00", new Object[]{this, set});
        } else {
            this.uriSet = set;
        }
    }

    public Map<String, PreDealIndexContent> getIndexMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ee536f1c", new Object[]{this}) : this.indexMap;
    }

    public void setIndexMap(Map<String, PreDealIndexContent> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf426f2", new Object[]{this, map});
        } else {
            this.indexMap = map;
        }
    }

    public Set<String> getIndexIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("dbd70b32", new Object[]{this});
        }
        Map<String, PreDealIndexContent> map = this.indexMap;
        if (map == null) {
            return null;
        }
        return map.keySet();
    }

    public boolean needTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.trackMap;
        return jSONObject != null && jSONObject.size() > 0;
    }

    public JSONObject getTrackMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("13b84dae", new Object[]{this}) : this.trackMap;
    }

    public void setTrackMap(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e88096", new Object[]{this, jSONObject});
        } else {
            this.trackMap = jSONObject;
        }
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this}) : this.traceId;
    }

    public void setTraceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        } else {
            this.traceId = str;
        }
    }

    public void setDealStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e091bc", new Object[]{this, new Long(j)});
        } else {
            this.dealStartTime = j;
        }
    }

    public void setDealEndTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15350e3", new Object[]{this, new Long(j)});
        } else {
            this.dealEndTime = j;
        }
    }

    public void setSdkWaitTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547be8e3", new Object[]{this, new Long(j)});
        } else {
            this.sdkWaitTime = j;
        }
    }
}
