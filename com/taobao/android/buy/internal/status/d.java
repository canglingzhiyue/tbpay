package com.taobao.android.buy.internal.status;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import tb.arc;
import tb.ard;
import tb.bbh;
import tb.kge;

/* loaded from: classes4.dex */
public class d implements e.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup b;
    private final Activity d;

    /* renamed from: a  reason: collision with root package name */
    private final String f9242a = "TBBuyLoading";
    private final ExecutorService c = bbh.a(1, 1, 1, TimeUnit.MINUTES, "buy-mask-loading");

    static {
        kge.a(553994115);
        kge.a(-762856716);
    }

    public static /* synthetic */ ViewGroup a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("b56175fb", new Object[]{dVar}) : dVar.b;
    }

    public d(Activity activity) {
        this.d = activity;
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
        } else {
            a(context, (Boolean) false);
        }
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e504eed", new Object[]{this, context, bool});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup == null) {
            a(this.d);
        } else {
            viewGroup.setVisibility(0);
        }
    }

    @Override // com.taobao.android.buy.internal.status.e.c
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.b == null) {
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(50L);
            this.b.startAnimation(alphaAnimation);
            this.b.setVisibility(8);
        }
    }

    public void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        this.b = new RelativeLayout(activity);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.c.execute(new Runnable() { // from class: com.taobao.android.buy.internal.status.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    final Bitmap b = h.b(activity);
                    bbh.a(new Runnable() { // from class: com.taobao.android.buy.internal.status.d.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            d.a(d.this).addView(h.a(activity, b));
                            ViewGroup b2 = d.this.b(activity);
                            if (b2 == null) {
                                arc.a().b("DefaultSkeletonHandler getParentViewGroupOfSkeleton is null!!");
                            } else {
                                b2.addView(d.a(d.this));
                            }
                        }
                    }, 0L);
                } catch (Throwable th) {
                    ard a2 = arc.a();
                    a2.c("TBBuyLoading", "asyncLoad", "buy-mask-loading|异步加载配置失败,error=" + th.getMessage());
                }
            }
        });
    }

    public ViewGroup b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("651cc93a", new Object[]{this, activity});
        }
        View findViewById = activity.findViewById(16908290);
        if (findViewById != null) {
            return (ViewGroup) findViewById.getRootView();
        }
        return null;
    }
}
