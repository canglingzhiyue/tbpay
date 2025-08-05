package com.taobao.message.lab.comfrm.aura;

import com.taobao.message.lab.comfrm.inner2.Plugin;
import com.taobao.message.lab.comfrm.inner2.config.ConfigInfo;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class DojoContext {
    public String bizConfigCode;
    public String classNamespace;
    public ConfigInfo configInfo;
    public String containerKey;
    public String identifier;
    public Plugin plugin;
    public Map<String, Object> props;
    public IResourceManager resourceManager;
    public boolean useRemote;
    public String version;

    static {
        kge.a(880982085);
    }
}
