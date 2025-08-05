package com.alibaba.triver.triver_shop;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1155565298);
        }

        public abstract void a(boolean z);
    }

    static {
        kge.a(404236962);
    }

    public static void a(Activity activity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ffe2bb", new Object[]{activity, str, aVar});
        } else if (activity == null) {
        } else {
            try {
                d.INSTANCE.a(activity, str, aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void b(Activity activity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7938bc", new Object[]{activity, str, aVar});
        } else if (activity == null) {
        } else {
            try {
                d.INSTANCE.c(activity, str, aVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void c(Activity activity, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af28ebd", new Object[]{activity, str, aVar});
            return;
        }
        try {
            d.INSTANCE.b(activity, str, aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
