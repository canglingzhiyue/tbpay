package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bt extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-906763624);
        }

        public static void a(bt btVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("157d02a1", new Object[]{btVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(btVar, result);
        }
    }

    void a(FileRenameFileResult fileRenameFileResult);
}
