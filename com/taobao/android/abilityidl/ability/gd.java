package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface gd extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1364292411);
        }

        public static void a(gd gdVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebda3936", new Object[]{gdVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(gdVar, result);
        }
    }

    void a(ErrorViewWidgetRequestError errorViewWidgetRequestError);
}
