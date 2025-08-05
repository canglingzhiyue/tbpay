package com.taobao.search.m3;

import android.graphics.Paint;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class i {
    public static final a Companion;

    static {
        kge.a(1872784944);
        Companion = new a(null);
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(350248312);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final float a(String str, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ff7de37", new Object[]{this, str, paint})).floatValue();
            }
            q.c(paint, "paint");
            if (str != null) {
                return paint.measureText(str);
            }
            return 0.0f;
        }
    }
}
