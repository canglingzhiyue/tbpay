package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bl extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-140213633);
        }

        public static void a(bl blVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe19b7a9", new Object[]{blVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(blVar, result);
        }
    }

    void a(ContainerSwiperSwitchDetail containerSwiperSwitchDetail);
}
