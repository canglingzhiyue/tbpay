package com.taobao.search.m3.price;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public interface b extends com.taobao.search.m3.c {

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(874029802);
        }

        public static void a(b bVar, e priceInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efe988d5", new Object[]{bVar, priceInfo});
            } else {
                q.c(priceInfo, "priceInfo");
            }
        }
    }

    void a(e eVar);
}
