package com.taobao.android.litecreator.sdk.editor;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hdz;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(714855124);
    }

    public static <T extends v> T a(Class<T> cls) {
        try {
            T newInstance = cls.newInstance();
            if (!(newInstance instanceof hdz)) {
                return null;
            }
            ((hdz) newInstance).h();
            return newInstance;
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
