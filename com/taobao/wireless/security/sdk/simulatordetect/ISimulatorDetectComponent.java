package com.taobao.wireless.security.sdk.simulatordetect;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.taobao.wireless.security.sdk.IComponent;

@InterfacePluginInfo(pluginName = "securitybody")
/* loaded from: classes9.dex */
public interface ISimulatorDetectComponent extends IComponent {
    boolean isSimulator();
}
