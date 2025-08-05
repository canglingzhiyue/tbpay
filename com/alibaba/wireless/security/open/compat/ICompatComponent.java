package com.alibaba.wireless.security.open.compat;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

@InterfacePluginInfo(pluginName = "main")
/* loaded from: classes.dex */
public interface ICompatComponent extends IComponent {
    String getCachedSecurityToken(int i) throws SecException;
}
