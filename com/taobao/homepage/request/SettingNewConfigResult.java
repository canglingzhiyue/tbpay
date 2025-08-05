package com.taobao.homepage.request;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.business.getconfig.RefreshConfig;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class SettingNewConfigResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject ext;
    public RefreshConfig refreshConfig;
    public List<JSONObject> sections;

    static {
        kge.a(-937568355);
        kge.a(1028243835);
    }

    public List<JSONObject> getSections() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2802a8bc", new Object[]{this}) : this.sections;
    }

    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this}) : this.ext;
    }

    public RefreshConfig getRefreshConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RefreshConfig) ipChange.ipc$dispatch("47778e12", new Object[]{this}) : this.refreshConfig;
    }
}
