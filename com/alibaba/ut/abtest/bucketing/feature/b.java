package com.alibaba.ut.abtest.bucketing.feature;

import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cex;
import tb.kge;

/* loaded from: classes3.dex */
public class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(381007996);
        kge.a(1291149372);
    }

    @Override // com.alibaba.ut.abtest.bucketing.feature.a
    public boolean a(FeatureType featureType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e83d4a34", new Object[]{this, featureType, str})).booleanValue();
        }
        if (featureType == FeatureType.Crowd) {
            if (cex.a().f() == UTABMethod.Push) {
                return cex.a().m().a(str);
            }
            h.e("FeatureServiceImpl", "警告：拉模式出现人群判断！人群ID=" + str);
        }
        return false;
    }
}
