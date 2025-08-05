package com.taobao.android.layoutmanager.adapter.impl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
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
import com.taobao.taobao.R;
import tb.kge;
import tb.oec;
import tb.ogb;
import tb.ohd;

/* loaded from: classes5.dex */
public class x implements com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static float f13153a;
    private static float b;
    private static m c;
    private static Handler d;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f13158a;
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
            kge.a(-1050012635);
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
            e(view);
        }
    }

    public static /* synthetic */ void b(Activity activity, ViewGroup viewGroup, String str, long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6bb6bc", new Object[]{activity, viewGroup, str, new Long(j), aVar});
        } else {
            c(activity, viewGroup, str, j, aVar);
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

    public static /* synthetic */ void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else {
            c(view);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s
    public void a(Context context, ViewGroup viewGroup, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5037aac9", new Object[]{this, context, viewGroup, str, new Integer(i), new Integer(i2)});
        } else if (context instanceof Activity) {
            a((Activity) context, viewGroup, str, i, i2);
        } else {
            a((Application) context, str);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s
    public void a(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0fb40a", new Object[]{this, context, str, new Integer(i), new Integer(i2)});
            return;
        }
        Toast toast = new Toast(context);
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.tnode_layout_common_toast, (ViewGroup) null, false);
        textView.setText(str);
        toast.setView(textView);
        toast.setDuration(i);
        toast.setGravity(i2, 0, 0);
        toast.show();
    }

    static {
        kge.a(-1418687671);
        kge.a(1351821514);
        f13153a = 30.47f;
        b = 15.17f;
        c = new m(f13153a, b, false);
        d = new Handler(Looper.getMainLooper());
    }

    public static void a(Activity activity, ViewGroup viewGroup, String str, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cbc182", new Object[]{activity, viewGroup, str, new Long(j), new Integer(i)});
            return;
        }
        a aVar = new a();
        aVar.f13158a = activity.getResources().getDrawable(R.drawable.tnode_drawable_common_toast_bg);
        aVar.m = new FrameLayout.LayoutParams(-2, -2, 17);
        aVar.b = -1;
        int b2 = ohd.b((Context) activity, 10);
        aVar.l = b2;
        aVar.k = b2;
        int b3 = ohd.b((Context) activity, 25);
        aVar.j = b3;
        aVar.i = b3;
        aVar.c = ohd.b((Context) activity, 15);
        a(activity, viewGroup, str, j, aVar);
    }

    public static void a(final Activity activity, final ViewGroup viewGroup, final String str, final long j, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe035bb", new Object[]{activity, viewGroup, str, new Long(j), aVar});
        } else {
            oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.x.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        x.b(activity, viewGroup, str, j, aVar);
                    }
                }
            });
        }
    }

    private static void c(Activity activity, ViewGroup viewGroup, String str, long j, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf737bd", new Object[]{activity, viewGroup, str, new Long(j), aVar});
            return;
        }
        TextView textView = (TextView) (viewGroup == null ? activity.getWindow().getDecorView() : viewGroup).findViewById(R.id.layout_manager_toast_id);
        if (textView == null) {
            textView = (TextView) LayoutInflater.from(activity).inflate(R.layout.tnode_layout_common_toast, (ViewGroup) null);
            textView.setId(R.id.layout_manager_toast_id);
            if (viewGroup != null) {
                viewGroup.addView(textView, aVar.m);
            } else if (activity instanceof ogb) {
                ((ViewGroup) activity.getWindow().getDecorView()).addView(textView, aVar.m);
            } else {
                activity.addContentView(textView, aVar.m);
            }
        }
        textView.setLayoutParams(aVar.m);
        textView.setBackground(aVar.f13158a);
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
            oec.a(new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.x.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        x.b(application, str);
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
        TextView textView = (TextView) LayoutInflater.from(application).inflate(R.layout.tnode_layout_common_toast, (ViewGroup) null, false);
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
        d(view);
        e(view);
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        ofPropertyValuesHolder.setInterpolator(c.a());
        ofPropertyValuesHolder.setDuration(600L);
        ofPropertyValuesHolder.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.layoutmanager.adapter.impl.x.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else if (animator.getDuration() == 0) {
                } else {
                    x.a(view);
                    Runnable runnable = new Runnable() { // from class: com.taobao.android.layoutmanager.adapter.impl.x.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                x.b(view);
                            }
                        }
                    };
                    view.setTag(R.id.toast_cancel_callback_tag, runnable);
                    x.a().postDelayed(runnable, j);
                }
            }
        });
        ofPropertyValuesHolder.start();
        view.setTag(R.id.toast_show_anim_tag, ofPropertyValuesHolder);
    }

    private static void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.start();
        view.setTag(R.id.toast_cancel_anim_tag, ofFloat);
    }

    private static void d(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89069007", new Object[]{view});
        } else if (view == null || !(view.getTag(R.id.toast_show_anim_tag) instanceof ValueAnimator)) {
        } else {
            ((ValueAnimator) view.getTag(R.id.toast_show_anim_tag)).setDuration(0L);
            ((ValueAnimator) view.getTag(R.id.toast_show_anim_tag)).cancel();
            view.setTag(R.id.toast_show_anim_tag, null);
        }
    }

    private static void e(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85081ee6", new Object[]{view});
        } else if (view == null) {
        } else {
            if (view.getTag(R.id.toast_cancel_anim_tag) instanceof ValueAnimator) {
                ((ValueAnimator) view.getTag(R.id.toast_cancel_anim_tag)).setDuration(0L);
                ((ValueAnimator) view.getTag(R.id.toast_cancel_anim_tag)).cancel();
                view.setTag(R.id.toast_cancel_anim_tag, null);
            }
            if (!(view.getTag(R.id.toast_cancel_callback_tag) instanceof Runnable)) {
                return;
            }
            d.removeCallbacks((Runnable) view.getTag(R.id.toast_cancel_callback_tag));
            view.setTag(R.id.toast_cancel_callback_tag, null);
        }
    }
}
