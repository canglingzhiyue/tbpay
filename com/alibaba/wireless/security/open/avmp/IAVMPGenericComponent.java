package com.alibaba.wireless.security.open.avmp;

import com.alibaba.wireless.security.framework.InterfacePluginInfo;
import com.alibaba.wireless.security.open.IComponent;
import com.alibaba.wireless.security.open.SecException;

@InterfacePluginInfo(pluginName = "middletier")
@Deprecated
/* loaded from: classes.dex */
public interface IAVMPGenericComponent extends IComponent {

    /* loaded from: classes3.dex */
    public interface IAVMPGenericInstance {
        Object invokeAVMP(String str, Class cls, Object... objArr) throws SecException;

        Object invokeAVMP2(String str, Class cls, Object... objArr) throws SecException;
    }

    IAVMPGenericInstance createAVMPInstance(String str, String str2) throws SecException;

    boolean destroyAVMPInstance(IAVMPGenericInstance iAVMPGenericInstance) throws SecException;
}
