package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bf extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1451600886);
        }

        public static void a(bf bfVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c8f3f6f", new Object[]{bfVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(bfVar, result);
        }
    }

    void a();

    void a(AudioContextStatusInfo audioContextStatusInfo);

    void a(AudioContextTimeUpdateInfo audioContextTimeUpdateInfo);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();
}
