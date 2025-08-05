package com.taobao.android.detail.ttdetail.component;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class ComponentViewMeta {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "name";
    public static final String TYPE = "type";
    public static final String URL = "url";
    public static final String VERSION = "version";
    private String mName;
    private String mType;
    private String mUrl;
    private String mVersion;

    static {
        kge.a(-861755966);
    }

    public ComponentViewMeta(JSONObject jSONObject) {
        this.mName = jSONObject.getString("name");
        this.mType = jSONObject.getString("type");
        this.mVersion = jSONObject.getString("version");
        this.mUrl = jSONObject.getString("url");
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.mName;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this}) : this.mType;
    }

    public String getVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this}) : this.mVersion;
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.mUrl;
    }
}
