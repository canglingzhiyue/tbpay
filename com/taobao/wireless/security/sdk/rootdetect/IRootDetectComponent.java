package com.taobao.wireless.security.sdk.rootdetect;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;

@InterfacePluginInfo(pluginName = "securitybody")
/* loaded from: classes9.dex */
public interface IRootDetectComponent extends IComponent {
    boolean isRoot();
}
