package com.taobao.pha.tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import tb.kge;
import tb.neg;
import tb.ngr;

/* loaded from: classes.dex */
public class k extends neg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1143982505);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 1628521357) {
            return super.b((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.pha.core.h.a, com.taobao.pha.core.h
    public boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{this, context, str})).booleanValue();
        }
        if (context != null && !StringUtils.isEmpty(str)) {
            return ABGlobal.isFeatureOpened(context, str);
        }
        return false;
    }

    @Override // com.taobao.pha.core.h.a, com.taobao.pha.core.h
    public String b(String str) {
        VariationSet activate;
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && (activate = UTABTest.activate(UTABTest.COMPONENT_NAV, str)) != null && (variation = activate.getVariation("bucket")) != null) {
            String valueAsString = variation.getValueAsString(null);
            if (!StringUtils.equals(valueAsString, str)) {
                ngr.a("TBConfigProvider", "abtest valid, use abUrl:" + valueAsString);
                return valueAsString;
            }
        }
        return super.b(str);
    }
}
