package com.taobao.taolive.uikit.homepage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d extends ViewOutlineProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Rect f22031a;

    static {
        kge.a(-1834859858);
    }

    public d(Rect rect) {
        this.f22031a = rect;
    }

    public d(int i) {
        this.f22031a = new Rect(i, i, i, i);
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
        } else if (this.f22031a == null) {
        } else {
            Rect rect = new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            if (this.f22031a.left != 0 && this.f22031a.top != 0 && this.f22031a.right == 0 && this.f22031a.bottom == 0) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f22031a.top, this.f22031a.top);
            } else if (this.f22031a.left == 0 && this.f22031a.top == 0 && this.f22031a.right != 0 && this.f22031a.bottom != 0) {
                outline.setRoundRect(0, -this.f22031a.bottom, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f22031a.bottom);
            } else if (this.f22031a.left != 0 && this.f22031a.top == 0 && this.f22031a.right == 0 && this.f22031a.bottom != 0) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth() + this.f22031a.left, view.getMeasuredHeight(), this.f22031a.left);
            } else if (this.f22031a.left == 0 && this.f22031a.top != 0 && this.f22031a.right != 0 && this.f22031a.bottom == 0) {
                outline.setRoundRect(-this.f22031a.right, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.f22031a.right);
            } else {
                outline.setRoundRect(rect, Math.max(Math.max(this.f22031a.left, this.f22031a.top), Math.max(this.f22031a.right, this.f22031a.bottom)));
            }
        }
    }
}
