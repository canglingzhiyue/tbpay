package com.taobao.homepage.request;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.homepage.business.getconfig.RefreshConfig;
import java.io.Serializable;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes.dex */
public class SettingGetResult implements Serializable, IMTOPDataObject {
    @JSONField(name = "result")
    public SettingNewConfigResult settingNewConfigResult;

    static {
        kge.a(224245105);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public JSONObject getExt() {
        SettingNewConfigResult settingNewConfigResult = this.settingNewConfigResult;
        if (settingNewConfigResult == null) {
            return null;
        }
        return settingNewConfigResult.ext;
    }

    public RefreshConfig getRefeshConfig() {
        SettingNewConfigResult settingNewConfigResult = this.settingNewConfigResult;
        if (settingNewConfigResult == null) {
            return null;
        }
        return settingNewConfigResult.refreshConfig;
    }

    public List<JSONObject> getSections() {
        SettingNewConfigResult settingNewConfigResult = this.settingNewConfigResult;
        if (settingNewConfigResult == null || settingNewConfigResult.sections == null || this.settingNewConfigResult.sections.isEmpty()) {
            return null;
        }
        return this.settingNewConfigResult.sections;
    }
}
