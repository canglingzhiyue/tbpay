package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ff extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1251977721);
        }

        public static void a(ff ffVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7124973", new Object[]{ffVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(ffVar, result);
        }
    }

    void a();

    void a(DownloaderCompleteResult downloaderCompleteResult);

    void a(DownloaderProgressResult downloaderProgressResult);
}
