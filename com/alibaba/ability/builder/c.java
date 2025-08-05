package com.alibaba.ability.builder;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-369192778);
        }

        public static int a(c cVar, String api) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e2d6346d", new Object[]{cVar, api})).intValue();
            }
            q.d(api, "api");
            return 2;
        }
    }

    com.alibaba.ability.b a();

    boolean a(String str);

    int b();

    int b(String str);
}
