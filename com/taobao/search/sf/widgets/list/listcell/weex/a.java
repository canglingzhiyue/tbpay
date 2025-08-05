package com.taobao.search.sf.widgets.list.listcell.weex;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.iqt;
import tb.iru;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends ius<Integer, ConstraintLayout, iru> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TextView f19540a;
    private Integer b;
    private Runnable c;

    static {
        kge.a(1185926109);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "GiraffeTimerWidget";
    }

    public static /* synthetic */ Integer a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5fd26127", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ Integer a(a aVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("268227de", new Object[]{aVar, num});
        }
        aVar.b = num;
        return num;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1394df", new Object[]{aVar});
        } else {
            aVar.d();
        }
    }

    @Override // tb.iup, tb.iui
    public /* synthetic */ void bindWithData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2491dd0", new Object[]{this, obj});
        } else {
            a((Integer) obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.support.constraint.ConstraintLayout] */
    @Override // tb.ius
    public /* synthetic */ ConstraintLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    public a(Activity activity, ium iumVar, iru iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.c = new Runnable() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a.a(a.this);
                a aVar = a.this;
                a.a(aVar, Integer.valueOf(a.a(aVar).intValue() - 1));
                a.b(a.this);
            }
        };
    }

    public ConstraintLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintLayout) ipChange.ipc$dispatch("c397bf20", new Object[]{this});
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_giraffe_timer, (ViewGroup) new FrameLayout(getActivity()), false);
        this.f19540a = (TextView) constraintLayout.findViewById(R.id.tv_time);
        return constraintLayout;
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
        } else {
            this.b = num;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ObjectAnimator.ofFloat(getView(), "alpha", 0.0f, 1.0f).setDuration(500L).start();
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b.intValue() <= 0) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(getView(), "alpha", 1.0f, 0.0f).setDuration(200L);
            duration.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.search.sf.widgets.list.listcell.weex.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        a.this.postEvent(iqt.h.a("timer"));
                    }
                }
            });
            duration.start();
        } else {
            this.f19540a.setText(String.valueOf(this.b));
            ((ConstraintLayout) getView()).postDelayed(this.c, 1000L);
        }
    }

    @Override // tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        ((ConstraintLayout) getView()).removeCallbacks(this.c);
    }
}
