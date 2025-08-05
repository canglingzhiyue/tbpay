package com.taobao.mrt.task.desc;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import tb.kge;

/* loaded from: classes7.dex */
public class MRTTaskDescription implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean async;
    public String cid;
    public String clnName;
    public String extentAgr1;
    public List<String> libs;
    public MRTCodeDescription model;
    public String name;
    public MRTFilesDescription optResource;
    public MRTFilesDescription resource;

    static {
        kge.a(442487919);
        kge.a(1028243835);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MRTTaskDescription mRTTaskDescription = (MRTTaskDescription) obj;
            if (Objects.equals(this.name, mRTTaskDescription.name) && Objects.equals(this.model, mRTTaskDescription.model) && Objects.equals(this.resource, mRTTaskDescription.resource) && Objects.equals(this.cid, mRTTaskDescription.cid)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(this.name, this.model, this.resource, this.cid);
    }

    public JSONObject toJSONObjet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d04b4dea", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("n", (Object) this.name);
        jSONObject.put("cln", (Object) this.clnName);
        jSONObject.put("async", (Object) Boolean.valueOf(this.async));
        jSONObject.put("cid", (Object) this.cid);
        jSONObject.put("extentAgr1", (Object) this.extentAgr1);
        MRTCodeDescription mRTCodeDescription = this.model;
        if (mRTCodeDescription != null) {
            jSONObject.put("furl", (Object) mRTCodeDescription.furl);
            jSONObject.put("fmd5", (Object) this.model.fmd5);
            jSONObject.put("mmd5", (Object) this.model.mmd5);
        }
        MRTFilesDescription mRTFilesDescription = this.resource;
        if (mRTFilesDescription != null) {
            jSONObject.put("r", (Object) mRTFilesDescription.toJSONObject());
        }
        if (this.optResource != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.add(this.optResource.toJSONObject());
            jSONObject.put("or", (Object) jSONArray);
        }
        return jSONObject;
    }
}
