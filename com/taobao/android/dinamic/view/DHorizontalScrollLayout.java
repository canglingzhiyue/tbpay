package com.taobao.android.dinamic.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.e;
import com.taobao.android.dinamic.k;
import java.util.Map;
import tb.fpd;
import tb.kge;

/* loaded from: classes5.dex */
public class DHorizontalScrollLayout extends DFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String SL_LAYOUT_TYPE_FRAME;
    public String SL_LAYOUT_TYPE_LINEAR;
    public String SL_SCROLLBAR_INVISIBLE;
    public String SL_SCROLLBAR_VISIBLE;
    public ViewGroup containerView;
    public FrameLayout scrollView;

    static {
        kge.a(-1250578520);
    }

    public static /* synthetic */ Object ipc$super(DHorizontalScrollLayout dHorizontalScrollLayout, String str, Object... objArr) {
        if (str.hashCode() == 1992612095) {
            super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DHorizontalScrollLayout(Context context) {
        super(context);
        this.SL_LAYOUT_TYPE_LINEAR = "linear";
        this.SL_LAYOUT_TYPE_FRAME = "frame";
        this.SL_SCROLLBAR_INVISIBLE = "invisible";
        this.SL_SCROLLBAR_VISIBLE = "visible";
    }

    public DHorizontalScrollLayout(Context context, AttributeSet attributeSet, fpd fpdVar) {
        super(context, attributeSet);
        this.SL_LAYOUT_TYPE_LINEAR = "linear";
        this.SL_LAYOUT_TYPE_FRAME = "frame";
        this.SL_SCROLLBAR_INVISIBLE = "invisible";
        this.SL_SCROLLBAR_VISIBLE = "visible";
        generateChildView(attributeSet, fpdVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.addView(view, i, layoutParams);
    }

    private void generateChildView(AttributeSet attributeSet, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd05aa11", new Object[]{this, attributeSet, fpdVar});
            return;
        }
        Map<String, Object> map = e.b("DHorizontalScrollLayout").handleAttributeSet(attributeSet).b;
        String str = (String) map.get("dLayoutType");
        this.scrollView = new HorizontalScrollView(getContext());
        this.scrollView.setOverScrollMode(2);
        this.scrollView.setVerticalScrollBarEnabled(false);
        if (!TextUtils.equals((String) map.get("dScrollBar"), this.SL_SCROLLBAR_VISIBLE)) {
            this.scrollView.setHorizontalScrollBarEnabled(false);
        }
        if (TextUtils.equals(str, this.SL_LAYOUT_TYPE_FRAME)) {
            this.containerView = (DFrameLayout) k.a("DFrameLayout", getContext(), attributeSet, fpdVar);
            this.scrollView.addView(this.containerView);
        } else {
            this.containerView = (DLinearLayout) k.a("DLinearLayout", getContext(), attributeSet, fpdVar);
            this.scrollView.addView(this.containerView);
        }
        super.addView(this.scrollView, -1, generateLayoutParams(attributeSet));
        map.remove("dLayoutType");
        map.remove("dScrollBar");
    }
}
