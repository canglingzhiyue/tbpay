package com.alibaba.android.aura.nodemodel.extend;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class AURAExtendModuleNodeModel implements Serializable {
    @JSONField(name = "bizCode")
    public String bizCode;
    @JSONField(name = "configPath")
    public String configPath;
    @JSONField(name = AliFestivalWVPlugin.PARAMS_MODULE_NAME)
    public String moduleName;
    @JSONField(name = "name")
    public String name;

    static {
        kge.a(-937559204);
        kge.a(1028243835);
    }

    public AURAExtendModuleNodeModel() {
    }

    public AURAExtendModuleNodeModel(String str, String str2, String str3, String str4) {
        this.moduleName = str;
        this.name = str2;
        this.bizCode = str3;
        this.configPath = str4;
    }
}
