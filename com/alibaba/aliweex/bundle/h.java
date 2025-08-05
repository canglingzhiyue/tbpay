package com.alibaba.aliweex.bundle;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View b;
    private Context c;

    /* renamed from: a  reason: collision with root package name */
    private TextView f2016a = null;
    private boolean d = true;

    static {
        kge.a(1417986782);
    }

    public static /* synthetic */ TextView a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("bcbf341f", new Object[]{hVar}) : hVar.f2016a;
    }

    public static /* synthetic */ TextView a(h hVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("799fdd6d", new Object[]{hVar, textView});
        }
        hVar.f2016a = textView;
        return textView;
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acdd2b8d", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.d = z;
        return z;
    }

    public static /* synthetic */ boolean b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3adfdc70", new Object[]{hVar})).booleanValue() : hVar.d;
    }

    public h(Context context, View view) {
        this.c = context;
        this.b = view;
    }

    private void b(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0822ecc", new Object[]{this, drawable, str, new Integer(i)});
            return;
        }
        this.f2016a = new TextView(this.c);
        this.f2016a.setTextColor(Color.parseColor("#666666"));
        this.f2016a.setBackgroundColor(Color.parseColor("#ffe7b3"));
        this.f2016a.setText(str);
        this.f2016a.setGravity(16);
        ViewParent parent = this.f2016a.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f2016a);
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f2016a.setCompoundDrawables(drawable, null, null, null);
            int i2 = i / 10;
            this.f2016a.setCompoundDrawablePadding(i2);
            this.f2016a.setPadding(i2, 0, 0, 0);
        }
        try {
            this.f2016a.setElevation(2.0f);
        } catch (Throwable unused) {
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, i);
        ViewParent parent2 = this.b.getParent();
        if (parent2 == null) {
            return;
        }
        try {
            ((ViewGroup) parent2).addView(this.f2016a, layoutParams);
        } catch (Exception unused2) {
            ViewParent parent3 = parent2.getParent();
            if (parent3 == null) {
                return;
            }
            ((ViewGroup) parent3).addView(this.f2016a, layoutParams);
        }
    }

    public void a(Drawable drawable, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7e636d", new Object[]{this, drawable, str, new Integer(i)});
            return;
        }
        TextView textView = this.f2016a;
        if (textView == null || (str != null && !str.equals(textView.getText()))) {
            b(drawable, str, i);
        }
        this.f2016a.bringToFront();
        this.f2016a.setTranslationY(0.0f);
        float f = -i;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f2016a, "translationY", f, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(1000L);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f2016a, "translationY", 0.0f, f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2).after(3000L);
        ofFloat2.addListener(new Animator.AnimatorListener() { // from class: com.alibaba.aliweex.bundle.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

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
                } else if (h.a(h.this) == null) {
                } else {
                    ViewParent parent = h.a(h.this).getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(h.a(h.this));
                    }
                    h.a(h.this, (TextView) null);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else if (h.a(h.this) == null) {
                } else {
                    ViewParent parent = h.a(h.this).getParent();
                    if (parent != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(h.a(h.this));
                    }
                    h.a(h.this, (TextView) null);
                }
            }
        });
        animatorSet.start();
        this.f2016a.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.aliweex.bundle.h.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!h.b(h.this)) {
                } else {
                    animatorSet.cancel();
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(ofFloat2);
                    animatorSet2.start();
                    h.a(h.this, false);
                }
            }
        });
    }
}
