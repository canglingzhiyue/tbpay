package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bz extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(773649641);
        }

        public static void a(bz bzVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7077adb", new Object[]{bzVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(bzVar, result);
        }
    }

    void a();
}
