package com.alibaba.ariver.kernel.api.extension.bridge;

import com.alibaba.ariver.kernel.api.annotation.UsePermission;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
public class ActionMeta {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Method actionMethod;
    public String actionName;
    public Class<? extends BridgeExtension> bridgeExtensionClazz;
    public String[] nativePermissions;
    public Annotation[][] paramAnnotationArray;
    public Class[] paramTypes;
    public UsePermission usePermission;
    public boolean paramRequired = false;
    public boolean autoCallback = false;

    static {
        kge.a(-733852051);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ActionMeta{actionName='" + this.actionName + "', bridgeExtensionClazz=" + this.bridgeExtensionClazz + ", paramRequired=" + this.paramRequired + ", autoCallback=" + this.autoCallback + '}';
    }
}
