package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface cr extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1526401113);
        }

        public static void a(cr crVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a44f264", new Object[]{crVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(crVar, result);
        }
    }

    void a(TinyAppCheckAddIconButtonResult tinyAppCheckAddIconButtonResult);
}
