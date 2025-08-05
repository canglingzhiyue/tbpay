package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ct extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1145265487);
        }

        public static void a(ct ctVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b01dc522", new Object[]{ctVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(ctVar, result);
        }
    }

    void a(WidgetServiceEditSuccessResult widgetServiceEditSuccessResult);
}
