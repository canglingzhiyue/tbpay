package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface fi extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1261088286);
        }

        public static void a(fi fiVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fd78590", new Object[]{fiVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(fiVar, result);
        }
    }

    void a(UTResultWithData uTResultWithData);
}
