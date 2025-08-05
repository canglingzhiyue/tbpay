package com.ut.mini.behavior.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.ut.mini.behavior.module.ModulesConfig;
import com.ut.mini.behavior.trigger.TriggerConfig;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class UTBehaviorConfig implements Serializable {
    @JSONField(name = "module")
    public ModulesConfig modulesConfig;
    @JSONField(name = "t")
    public long timestamp;
    @JSONField(name = JarvisConstant.KEY_JARVIS_TRIGGER)
    public TriggerConfig triggerConfig;
    @JSONField(name = "v")
    public int v;

    static {
        kge.a(1712595769);
        kge.a(1028243835);
    }
}
