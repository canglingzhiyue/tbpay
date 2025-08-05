package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface fx extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-258387446);
        }

        public static void a(fx fxVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8bb1b221", new Object[]{fxVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(fxVar, result);
        }
    }

    void a();

    void a(AliUploadServiceCompleteResult aliUploadServiceCompleteResult);

    void a(AliUploadServiceProgressResult aliUploadServiceProgressResult);
}
