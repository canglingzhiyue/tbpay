package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.aq;
import com.taobao.ju.track.server.JTrackParams;
import tb.kge;

@MappingKey(key = "params")
/* loaded from: classes4.dex */
public class Params extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String cpsParams;
    private final JSONObject trackEventParams;
    private final JSONObject trackParams;
    private final JSONObject umbParams;
    private final String utParams;

    static {
        kge.a(1645340702);
    }

    public Params(JSONObject jSONObject) {
        super(jSONObject);
        this.trackEventParams = aq.a(jSONObject.getJSONObject("trackEventParams"));
        this.trackParams = aq.a(jSONObject.getJSONObject(JTrackParams.TRACK_PARAMS));
        this.umbParams = aq.a(jSONObject.getJSONObject("umbParams"));
        this.utParams = jSONObject.getString("utParams");
        this.cpsParams = jSONObject.getString("cpsParams");
    }

    public JSONObject getTrackEventParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("31e26812", new Object[]{this}) : this.trackEventParams;
    }

    public JSONObject getTrackParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f9fb2ba2", new Object[]{this}) : this.trackParams;
    }

    public JSONObject getUmbParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8c971ae1", new Object[]{this}) : this.umbParams;
    }

    public String getUtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e3001b5e", new Object[]{this}) : this.utParams;
    }

    public String getCpsParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f79f34a3", new Object[]{this}) : this.cpsParams;
    }
}
