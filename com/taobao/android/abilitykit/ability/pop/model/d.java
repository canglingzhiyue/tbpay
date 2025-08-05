package com.taobao.android.abilitykit.ability.pop.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.dlz;
import tb.dmb;
import tb.dmc;
import tb.dmd;
import tb.dme;
import tb.dmf;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BOTTOM_IN_OUT = "bottomInOut";
    public static final String KEY_FADE_IN_OUT = "fadeInOut";
    public static final String KEY_LEFT_IN_OUT = "leftInOut";
    public static final String KEY_RIGHT_IN_OUT = "rightInOut";
    public static final String KEY_TOP_IN_OUT = "topInOut";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Class<? extends dlz>> f8914a;

    static {
        kge.a(-589114265);
        HashMap hashMap = new HashMap(5);
        f8914a = hashMap;
        hashMap.put(KEY_FADE_IN_OUT, dmc.class);
        f8914a.put(KEY_TOP_IN_OUT, dmf.class);
        f8914a.put(KEY_BOTTOM_IN_OUT, dmb.class);
        f8914a.put(KEY_LEFT_IN_OUT, dmd.class);
        f8914a.put(KEY_RIGHT_IN_OUT, dme.class);
    }

    public static dlz a(String str) {
        if (str == null) {
            return null;
        }
        Class<? extends dlz> cls = f8914a.get(str);
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException | InstantiationException unused) {
            }
        }
        return null;
    }
}
