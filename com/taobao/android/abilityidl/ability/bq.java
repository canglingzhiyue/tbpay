package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bq extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(299601709);
        }

        public static void a(bq bqVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ccb7c684", new Object[]{bqVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(bqVar, result);
        }
    }

    void a(FileDirInfoResult fileDirInfoResult);
}
