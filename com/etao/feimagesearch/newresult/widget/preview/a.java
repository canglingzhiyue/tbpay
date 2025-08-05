package com.etao.feimagesearch.newresult.widget.preview;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    static {
        kge.a(-1318661903);
    }

    /* loaded from: classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f6858a;
        public RectF c;

        static {
            kge.a(1554955833);
        }

        public b(RectF rectF, String str) {
            this.c = new RectF(rectF);
            this.f6858a = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DetectPartBean{region =" + this.c + '}';
        }
    }
}
