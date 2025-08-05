package com.taobao.ptr;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(84083035);
    }

    public static void a(View view, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f6f4e8", new Object[]{view, runnable});
        } else if (Build.VERSION.SDK_INT >= 16) {
            a.a(view, runnable);
        } else if (view == null || runnable == null) {
        } else {
            view.postDelayed(runnable, 16L);
        }
    }

    public static void a(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b9198e", new Object[]{view, drawable});
        } else if (Build.VERSION.SDK_INT >= 16) {
            a.a(view, drawable);
        } else if (view == null || drawable == null) {
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-319459530);
        }

        public static void a(View view, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29f6f4e8", new Object[]{view, runnable});
            } else if (view == null || runnable == null) {
            } else {
                view.postOnAnimation(runnable);
            }
        }

        public static void a(View view, Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30b9198e", new Object[]{view, drawable});
            } else if (view == null || drawable == null) {
            } else {
                view.setBackground(drawable);
            }
        }
    }
}
