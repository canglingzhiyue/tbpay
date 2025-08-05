package com.taobao.android.behavir.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.e;
import tb.dsc;
import tb.kge;

/* loaded from: classes.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(471959898);
    }

    /* loaded from: classes.dex */
    public static abstract class a extends com.taobao.android.behavix.utils.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-141012748);
        }

        public a() {
            super("ucp");
        }

        @Override // com.taobao.android.behavix.utils.b
        public final void a(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            } else {
                d.a("postRunnable", exc.getMessage(), exc);
            }
        }
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0338e41", new Object[]{aVar});
        } else {
            dsc.a(aVar);
        }
    }

    public static void a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("263eb0a3", new Object[]{aVar, new Long(j)});
        } else {
            dsc.a(aVar, j);
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e798c360", new Object[]{aVar});
        } else {
            dsc.b(aVar);
        }
    }

    public static void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefdf87f", new Object[]{aVar});
        } else {
            b(aVar, -1L);
        }
    }

    public static void b(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b801f64", new Object[]{aVar, new Long(j)});
        } else if (j < 0) {
            if (Utils.a()) {
                aVar.run();
            } else {
                e.a().post(aVar);
            }
        } else {
            e.a().postDelayed(aVar, j);
        }
    }
}
