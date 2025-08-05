package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements AbsFlexibleMarqueeGallery.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FlexibleMarqueeGallery f14167a;

    static {
        kge.a(377341827);
        kge.a(-2045386471);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.d
    public void onAnimateUpdate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178e8f8e", new Object[]{this, new Float(f)});
        }
    }

    public b(FlexibleMarqueeGallery flexibleMarqueeGallery) {
        this.f14167a = flexibleMarqueeGallery;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.AbsFlexibleMarqueeGallery.d
    public void onAnimatePerform(View view, int i, float f, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2167426b", new Object[]{this, view, new Integer(i), new Float(f), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt instanceof AbsFlexibleMarqueeGallery.d) {
                    ((AbsFlexibleMarqueeGallery.d) childAt).onAnimatePerform(view, i, f, z, i2, i3);
                }
            }
        }
    }
}
