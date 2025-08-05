package tb;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.panel.impl.a;
import com.taobao.android.litecreator.sdk.framework.container.panel.impl.b;
import com.taobao.android.litecreator.util.au;
import com.taobao.android.litecreator.util.e;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class hfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static float f28586a;
    private static float b;
    private static b c;
    private static Handler d;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f28591a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public FrameLayout.LayoutParams m;

        static {
            kge.a(-1551462971);
        }
    }

    public static /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : d;
    }

    public static /* synthetic */ void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else {
            b(view);
        }
    }

    public static /* synthetic */ void b(Activity activity, String str, long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b749406", new Object[]{activity, str, new Long(j), aVar});
        } else {
            c(activity, str, j, aVar);
        }
    }

    public static /* synthetic */ void b(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5aaeb60", new Object[]{application, str});
        } else {
            c(application, str);
        }
    }

    static {
        kge.a(-1436559959);
        f28586a = 30.47f;
        b = 15.17f;
        c = new b(f28586a, b, false);
        d = new Handler(Looper.getMainLooper());
    }

    public static void a(Activity activity, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea80240", new Object[]{activity, str, new Long(j)});
            return;
        }
        a aVar = new a();
        aVar.f28591a = activity.getResources().getDrawable(R.drawable.drawable_common_toast_bg);
        aVar.m = new FrameLayout.LayoutParams(-2, -2, 17);
        aVar.b = -1;
        int a2 = e.a(activity, 10.0f);
        aVar.l = a2;
        aVar.k = a2;
        int a3 = e.a(activity, 25.0f);
        aVar.j = a3;
        aVar.i = a3;
        aVar.c = e.a(activity, 15.0f);
        a(activity, str, j, aVar);
    }

    public static void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{activity, str});
        } else {
            a(activity, str, 3000L);
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context instanceof Activity) {
            a((Activity) context, str);
        } else {
            a((Application) context.getApplicationContext(), str);
        }
    }

    public static void a(final Activity activity, final String str, final long j, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a3e4127", new Object[]{activity, str, new Long(j), aVar});
        } else {
            au.a(new Runnable() { // from class: tb.hfj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        hfj.b(activity, str, j, aVar);
                    }
                }
            });
        }
    }

    private static void c(Activity activity, String str, long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5caae6e5", new Object[]{activity, str, new Long(j), aVar});
            return;
        }
        TextView textView = (TextView) activity.findViewById(R.id.lc_toast);
        if (textView == null) {
            textView = (TextView) LayoutInflater.from(activity).inflate(R.layout.layout_common_toast, (ViewGroup) null);
            textView.setId(R.id.lc_toast);
            activity.addContentView(textView, aVar.m);
        }
        textView.setLayoutParams(aVar.m);
        textView.setBackground(aVar.f28591a);
        textView.setText(str);
        textView.setTextSize(0, aVar.c);
        textView.setTextColor(aVar.b);
        textView.setPadding(aVar.i, aVar.l, aVar.j, aVar.k);
        textView.setCompoundDrawablePadding(aVar.h);
        textView.setCompoundDrawablesWithIntrinsicBounds(aVar.d, aVar.g, aVar.e, aVar.f);
        a(textView, j);
    }

    public static void a(final Application application, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be04981", new Object[]{application, str});
        } else {
            au.a(new Runnable() { // from class: tb.hfj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        hfj.b(application, str);
                    }
                }
            });
        }
    }

    private static void c(Application application, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df758d3f", new Object[]{application, str});
            return;
        }
        Toast makeText = Toast.makeText(application, str, 1);
        TextView textView = (TextView) LayoutInflater.from(application).inflate(R.layout.layout_common_toast, (ViewGroup) null, false);
        textView.setText(str);
        makeText.setView(textView);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    private static void a(final View view, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b009a", new Object[]{view, new Long(j)});
            return;
        }
        d.removeCallbacksAndMessages(null);
        c(view);
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(c.a());
        ofPropertyValuesHolder.setDuration(600L);
        ofPropertyValuesHolder.addListener(new a.C0520a() { // from class: tb.hfj.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.C0520a, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                hfj.a().removeCallbacksAndMessages(null);
                hfj.a().postDelayed(new Runnable() { // from class: tb.hfj.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            hfj.a(view);
                        }
                    }
                }, j);
            }
        });
        ofPropertyValuesHolder.start();
        view.setTag(ofPropertyValuesHolder);
    }

    private static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(ofFloat);
    }

    private static void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{view});
        } else if (!(view.getTag() instanceof ObjectAnimator) || !((ObjectAnimator) view.getTag()).isRunning()) {
        } else {
            ((ObjectAnimator) view.getTag()).cancel();
        }
    }
}
