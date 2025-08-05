package com.flybird;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.android.app.template.FBContext;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class FBNav extends FBView implements FBContext.NavbarInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup A;
    public ViewGroup B;
    public ViewGroup C;

    public FBNav(Context context, View view, FBDocument fBDocument) {
        super(context, null, fBDocument);
    }

    public View a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a545e87e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (viewGroup == null || viewGroup.getChildCount() <= i) {
            return null;
        }
        View childAt = viewGroup.getChildAt(i);
        if (childAt.getParent() != null) {
            ((ViewGroup) childAt.getParent()).removeView(childAt);
        }
        return childAt;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.C = (ViewGroup) a((ViewGroup) getInnerView(), 2);
        this.B = (ViewGroup) a((ViewGroup) getInnerView(), 1);
        this.A = (ViewGroup) a((ViewGroup) getInnerView(), 0);
    }

    @Override // com.alipay.android.app.template.FBContext.NavbarInterface
    public ViewGroup getLeftElement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("3bf7f68f", new Object[]{this});
        }
        if (this.A == null) {
            d();
        }
        return this.A;
    }

    @Override // com.alipay.android.app.template.FBContext.NavbarInterface
    public ViewGroup getMiddleElemenet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("58a1959c", new Object[]{this});
        }
        if (this.B == null) {
            d();
        }
        return this.B;
    }

    @Override // com.alipay.android.app.template.FBContext.NavbarInterface
    public ViewGroup getRightElement() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("9b3a1c38", new Object[]{this});
        }
        if (this.C == null) {
            d();
        }
        return this.C;
    }
}
