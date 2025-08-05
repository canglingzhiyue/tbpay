package com.taobao.android.fluid.framework.adapter.remoteconfig;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.spz;
import tb.tjy;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Boolean> f12463a;

    static {
        kge.a(336476800);
        f12463a = new ConcurrentHashMap();
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0bfeb52", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        try {
            String str4 = str + ":" + str2 + ":" + str3;
            Boolean bool = f12463a.get(str4);
            if (bool != null) {
                return bool.booleanValue();
            }
            VariationSet activate = UTABTest.activate(str, str2);
            if (activate != null) {
                Variation variation = activate.getVariation(str3);
                z2 = variation != null ? Boolean.parseBoolean(variation.getValueAsString(String.valueOf(z))) : z;
                tjy.a("tab2", activate.getExperimentId(), activate.getExperimentReleaseId(), activate.getExperimentBucketId());
            } else {
                z2 = z;
            }
            spz.c(com.taobao.taolive.sdk.utils.a.TAG, "fetchABConfig " + str + ":" + str2 + " ; " + z2);
            f12463a.put(str4, Boolean.valueOf(z2));
            return z2;
        } catch (Exception e) {
            spz.a(com.taobao.taolive.sdk.utils.a.TAG, "", e);
            return z;
        }
    }
}
