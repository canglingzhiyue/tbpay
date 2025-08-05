package com.taobao.search.m3;

import android.graphics.Canvas;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public interface c {

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-890482036);
        }

        public static void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e21c169", new Object[]{cVar});
            }
        }
    }

    void a(Canvas canvas);

    void b();

    int c();
}
