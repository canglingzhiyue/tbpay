package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface br extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(786912004);
        }

        public static void a(br brVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fa42fe3", new Object[]{brVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(brVar, result);
        }
    }

    void a(FileInfoResult fileInfoResult);
}
