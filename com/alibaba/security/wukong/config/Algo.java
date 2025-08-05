package com.alibaba.security.wukong.config;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import java.io.Serializable;
import java.util.Map;
import tb.dck;
import tb.dqy;

/* loaded from: classes3.dex */
public class Algo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String code;
    public Map<String, Object> config;
    public boolean preRun;
    public String type;
    public String version;

    public String getDsl() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ca622d2", new Object[]{this});
        }
        if (isBehavior() && (map = this.config) != null) {
            return (String) map.get(IStorage.TYPE_DSL);
        }
        return null;
    }

    public boolean isBehavior() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("469db027", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.type) && this.type.equalsIgnoreCase(dck.COL_SEQ);
    }

    public boolean isCpp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("17d8c424", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.type) && this.type.equalsIgnoreCase("cpp");
    }

    public boolean isPython() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c902e431", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.type) && this.type.equalsIgnoreCase(dqy.TYPE);
    }

    public boolean isSupport(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36fe101a", new Object[]{this, str})).booleanValue();
        }
        Map<String, Object> map = this.config;
        if (map == null || (jSONArray = (JSONArray) map.get("supportSampleTypes")) == null) {
            return true;
        }
        for (String str2 : JSON.parseArray(JsonUtils.toJSONString(jSONArray), String.class)) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
