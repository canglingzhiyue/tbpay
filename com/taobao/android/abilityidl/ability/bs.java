package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bs extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2147112391);
        }

        public static void a(bs bsVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52909942", new Object[]{bsVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(bsVar, result);
        }
    }

    void a(FileReadAsStringResult fileReadAsStringResult);
}
