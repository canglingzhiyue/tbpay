package com.taobao.tao.flexbox.layoutmanager.component.bouncy;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeRecyclerView;
import tb.abr;
import tb.abs;
import tb.kge;
import tb.ofj;
import tb.ofm;
import tb.ohc;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1706655824);
    }

    public static void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{view, new Boolean(z)});
        } else {
            a(view, z, false);
        }
    }

    public static void a(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2d0b6a", new Object[]{view, new Boolean(z), new Boolean(z2)});
        } else if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT > 29) {
        } else {
            if (view instanceof ViewPager) {
                new ofj(new ofm((ViewPager) view));
                return;
            }
            abs a2 = new abs().c(0.0f).b(1.0f).a(200.0f);
            abr abrVar = new abr(view, z ? abr.TRANSLATION_Y : abr.TRANSLATION_X);
            abrVar.a(a2);
            BouncyEdgeEffect bouncyEdgeEffect = new BouncyEdgeEffect(view.getContext(), abrVar, view, z ? 1 : 0, 0.5f, 0.5f);
            BouncyEdgeEffect bouncyEdgeEffect2 = new BouncyEdgeEffect(view.getContext(), abrVar, view, z ? 3 : 2, 0.5f, 0.5f);
            if (view instanceof HorizontalScrollView) {
                ohc.a(HorizontalScrollView.class, "mEdgeGlowLeft", view, bouncyEdgeEffect);
                ohc.a(HorizontalScrollView.class, "mEdgeGlowRight", view, bouncyEdgeEffect2);
            } else if (view instanceof ScrollView) {
                ohc.a(ScrollView.class, "mEdgeGlowTop", view, bouncyEdgeEffect);
                ohc.a(ScrollView.class, "mEdgeGlowBottom", view, bouncyEdgeEffect2);
            } else if (view instanceof NestedScrollView) {
                ohc.a(NestedScrollView.class, "mEdgeGlowTop", view, bouncyEdgeEffect);
                ohc.a(NestedScrollView.class, "mEdgeGlowBottom", view, new MyEdgeEffect(view, view.getContext(), z2));
            } else if (!(view instanceof TNodeRecyclerView)) {
            } else {
                if (z) {
                    ohc.a(RecyclerView.class, "mTopGlow", view, bouncyEdgeEffect);
                    ohc.a(RecyclerView.class, "mBottomGlow", view, bouncyEdgeEffect2);
                    return;
                }
                ohc.a(RecyclerView.class, "mLeftGlow", view, bouncyEdgeEffect);
                ohc.a(RecyclerView.class, "mRightGlow", view, bouncyEdgeEffect2);
            }
        }
    }
}
