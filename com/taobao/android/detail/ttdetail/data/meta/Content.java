package com.taobao.android.detail.ttdetail.data.meta;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@MappingKey(key = "content")
/* loaded from: classes4.dex */
public class Content extends Meta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject commonUtParams;
    private final JSONObject extendParams;
    private final String seeIds;
    private final String title;

    static {
        kge.a(1210980577);
    }

    public Content(JSONObject jSONObject) {
        super(jSONObject);
        this.title = jSONObject.getString("title");
        this.seeIds = jSONObject.getString("seeIds");
        this.commonUtParams = jSONObject.getJSONObject("commonUtParams");
        this.extendParams = jSONObject.getJSONObject("extendParams");
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public String getSeeIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("24f9c57e", new Object[]{this}) : this.seeIds;
    }

    public JSONObject getCommonUtParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("762149ad", new Object[]{this}) : this.commonUtParams;
    }

    public JSONObject getExtendParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("1e7b2c5d", new Object[]{this}) : this.extendParams;
    }
}
