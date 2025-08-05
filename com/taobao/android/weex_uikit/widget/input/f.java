package com.taobao.android.weex_uikit.widget.input;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface b {
        void a(boolean z);
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a();
    }

    static {
        kge.a(733899279);
    }

    public static c a(final Activity activity, final b bVar) {
        WindowManager.LayoutParams attributes;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("10045a9b", new Object[]{activity, bVar});
        }
        if (activity == null || bVar == null) {
            com.taobao.android.weex_framework.util.g.d("Activity or listener is null!");
            return null;
        } else if (activity.getWindow() != null && (attributes = activity.getWindow().getAttributes()) != null && ((i = attributes.softInputMode) == 48 || i == 32)) {
            com.taobao.android.weex_framework.util.g.d("SoftKeyboard detector can't work with softInputMode is SOFT_INPUT_ADJUST_NOTHING or SOFT_INPUT_ADJUST_PAN");
            return null;
        } else {
            final View a2 = a(activity);
            if (a2 == null) {
                com.taobao.android.weex_framework.util.g.d("Activity root is null!");
                return null;
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.weex_uikit.widget.input.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private final int e;
                private final Rect d = new Rect();
                private boolean f = false;

                {
                    this.e = com.taobao.android.weex_uikit.util.b.a(activity, 100.0f);
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    a2.getWindowVisibleDisplayFrame(this.d);
                    if (a2.getRootView().getHeight() - this.d.height() > this.e) {
                        z = true;
                    }
                    if (z == this.f) {
                        return;
                    }
                    this.f = z;
                    bVar.a(z);
                }
            };
            a2.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            return new a(activity, onGlobalLayoutListener);
        }
    }

    public static View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ee74837c", new Object[]{activity});
        }
        if (activity == null) {
            return null;
        }
        return activity.findViewById(16908290);
    }

    /* loaded from: classes6.dex */
    public static final class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Activity> f16188a;
        private WeakReference<ViewTreeObserver.OnGlobalLayoutListener> b;

        static {
            kge.a(1766735368);
            kge.a(1278450193);
        }

        public a(Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f16188a = new WeakReference<>(activity);
            this.b = new WeakReference<>(onGlobalLayoutListener);
        }

        @Override // com.taobao.android.weex_uikit.widget.input.f.c
        public void a() {
            View a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Activity activity = this.f16188a.get();
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.b.get();
            if (activity != null && onGlobalLayoutListener != null && (a2 = f.a(activity)) != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    a2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
                } else {
                    a2.getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
                }
            }
            this.f16188a.clear();
            this.b.clear();
        }
    }
}
