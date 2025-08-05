package com.flybird;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.alipay.android.app.template.FBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class FBEmbedView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FBPlugin f7142a;
    public WeakReference<View> b;

    public FBEmbedView(Context context) {
        super(context);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public static /* synthetic */ Object ipc$super(FBEmbedView fBEmbedView, String str, Object... objArr) {
        if (str.hashCode() == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public View apply() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ba9bc5f7", new Object[]{this});
        }
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            FBPlugin fBPlugin = this.f7142a;
            if (fBPlugin != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                View createView = fBPlugin.createView(viewGroup.getContext());
                int id = getId();
                if (id != -1) {
                    createView.setId(id);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(createView, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(createView, indexOfChild);
                }
                this.b = new WeakReference<>(createView);
                return createView;
            }
            throw new IllegalArgumentException("FBEmbedView must have a valid FBPlugin");
        }
        FBPlugin fBPlugin2 = this.f7142a;
        if (fBPlugin2 == null) {
            return null;
        }
        View createView2 = fBPlugin2.createView(getContext());
        int id2 = getId();
        if (id2 != -1) {
            createView2.setId(id2);
        }
        this.b = new WeakReference<>(createView2);
        return createView2;
    }

    public void setPlugin(FBPlugin fBPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c760f0c", new Object[]{this, fBPlugin});
        } else {
            this.f7142a = fBPlugin;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        WeakReference<View> weakReference = this.b;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        apply();
    }
}
