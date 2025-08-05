package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public interface h {
    void a(float f);

    void a(boolean z);

    View b();

    void c();

    void d();

    void e();

    void f();

    void g();

    boolean h();

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1993967421);
        }

        public static void a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("256c6e5a", new Object[]{hVar});
            } else {
                kotlin.jvm.internal.q.d(hVar, "this");
            }
        }

        public static void a(h hVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8821c4a6", new Object[]{hVar, new Float(f)});
            } else {
                kotlin.jvm.internal.q.d(hVar, "this");
            }
        }

        public static void b(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534508b9", new Object[]{hVar});
            } else {
                kotlin.jvm.internal.q.d(hVar, "this");
            }
        }

        public static void c(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("811da318", new Object[]{hVar});
                return;
            }
            kotlin.jvm.internal.q.d(hVar, "this");
            hVar.a(true);
        }

        public static void d(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef63d77", new Object[]{hVar});
                return;
            }
            kotlin.jvm.internal.q.d(hVar, "this");
            hVar.a(false);
        }

        public static boolean e(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dcced7da", new Object[]{hVar})).booleanValue();
            }
            kotlin.jvm.internal.q.d(hVar, "this");
            return hVar.h();
        }
    }
}
