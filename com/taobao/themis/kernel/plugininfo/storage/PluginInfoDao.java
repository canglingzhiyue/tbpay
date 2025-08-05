package com.taobao.themis.kernel.plugininfo.storage;

import com.alibaba.ariver.resource.api.models.PluginModel;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class PluginInfoDao implements Serializable {
    public String extra;
    public long id;
    public long lastRequestTimeStamp;
    public long lastUsedTimeStamp;
    public String pluginId;
    public PluginModel pluginInfo;
    public String type;
    public String version;

    static {
        kge.a(-1043597525);
        kge.a(1028243835);
    }
}
