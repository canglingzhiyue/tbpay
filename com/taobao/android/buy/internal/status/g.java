package com.taobao.android.buy.internal.status;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.e;
import com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar;
import com.taobao.taobao.R;
import tb.arc;
import tb.ard;
import tb.kge;

/* loaded from: classes4.dex */
public class g implements e.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup b;
    private Runnable d;
    private TextView e;

    /* renamed from: a  reason: collision with root package name */
    private final String f9246a = "DefaultHalfLoadingHandler";
    private final Handler c = new Handler();

    static {
        kge.a(2059373179);
        kge.a(-762856716);
    }

    public static /* synthetic */ TextView a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("961adf6b", new Object[]{gVar}) : gVar.e;
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e504eed", new Object[]{this, context, bool});
        } else {
            a(context, bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
        } else if (!(context instanceof Activity)) {
        } else {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.alibuy_build_loading_layout, (ViewGroup) null);
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.buy.internal.status.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    }
                }
            });
            this.b = a((Activity) context);
            this.b.addView(viewGroup);
            this.b.setVisibility(0);
            this.e = (TextView) this.b.findViewById(R.id.loading_text_view);
            try {
                a(viewGroup, i);
            } catch (Throwable th) {
                ard a2 = arc.a();
                a2.b("onShowLoading exception !! " + th.toString());
            }
        }
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        this.b.setVisibility(8);
    }

    public void a(final ViewGroup viewGroup, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.alibuy_loading_box);
        final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.loading_progressbar);
        viewGroup2.setVisibility(8);
        imageView.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
        if (i == 2) {
            return;
        }
        this.d = new Runnable() { // from class: com.taobao.android.buy.internal.status.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                imageView.setVisibility(8);
                viewGroup2.setVisibility(0);
                AliBuyProgressBar aliBuyProgressBar = (AliBuyProgressBar) viewGroup.findViewById(R.id.alibuy_progress_bar);
                if (i != 1) {
                    z = false;
                }
                aliBuyProgressBar.isAdjust(z);
                aliBuyProgressBar.setmProgressUpdateListener(new AliBuyProgressBar.b() { // from class: com.taobao.android.buy.internal.status.g.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.buy.module.progressBar.widget.AliBuyProgressBar.b
                    public void a(String str) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        } else if (g.a(g.this) == null) {
                        } else {
                            g.a(g.this).setText(str);
                        }
                    }
                });
            }
        };
        this.c.removeCallbacks(this.d);
        this.c.postDelayed(this.d, 3000L);
    }

    public ViewGroup a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7373231b", new Object[]{this, activity}) : (ViewGroup) activity.findViewById(16908290).getRootView();
    }
}
