package com.taobao.avplayer.core.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import java.lang.reflect.Constructor;
import tb.kck;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1697467204);
    }

    public static DWComponent a(Class<? extends DWComponent> cls, DWContext dWContext, DWInteractiveObject dWInteractiveObject, DWVideoScreenType dWVideoScreenType) {
        Constructor<?>[] constructors;
        int length;
        if (cls == null || dWContext == null || dWInteractiveObject == null) {
            com.taobao.taobaoavsdk.util.c.b("[DWComponentFactory] class is null");
            return null;
        }
        try {
            if (!DWComponent.class.isAssignableFrom(cls) || (length = (constructors = cls.getConstructors()).length) <= 0) {
                return null;
            }
            for (int i = 0; i < length; i++) {
                Class<?>[] parameterTypes = constructors[i].getParameterTypes();
                if (parameterTypes != null && parameterTypes.length == 3 && parameterTypes[0].isAssignableFrom(DWContext.class) && parameterTypes[1].isAssignableFrom(DWInteractiveObject.class) && parameterTypes[2].isAssignableFrom(DWVideoScreenType.class)) {
                    return cls.getConstructor(parameterTypes[0], parameterTypes[1], parameterTypes[2]).newInstance(dWContext, dWInteractiveObject, dWVideoScreenType);
                }
            }
            return null;
        } catch (Exception e) {
            if (kck.a()) {
                com.taobao.taobaoavsdk.util.c.b(com.taobao.taobaoavsdk.util.c.a(e));
            }
        }
    }
}
