package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class TTImageUrlView extends AppCompatImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private volatile boolean isViewVisible;
    private List<a> mVisibilityChangeListeners;

    /* loaded from: classes5.dex */
    public interface a {
        void a(TTImageUrlView tTImageUrlView, int i);
    }

    static {
        kge.a(482260593);
    }

    public static /* synthetic */ Object ipc$super(TTImageUrlView tTImageUrlView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1705336120) {
            super.setVisibility(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 348684699) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public TTImageUrlView(Context context) {
        super(context);
        this.isViewVisible = true;
        this.mVisibilityChangeListeners = new ArrayList(0);
    }

    public TTImageUrlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isViewVisible = true;
        this.mVisibilityChangeListeners = new ArrayList(0);
    }

    public TTImageUrlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isViewVisible = true;
        this.mVisibilityChangeListeners = new ArrayList(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
            return;
        }
        super.setVisibility(i);
        if (i != 0) {
            z = false;
        }
        this.isViewVisible = z;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        this.isViewVisible = !isParentNodeHide();
        notifyVisibilityChangeListeners();
    }

    private void notifyVisibilityChangeListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a37a3b", new Object[]{this});
            return;
        }
        for (a aVar : this.mVisibilityChangeListeners) {
            aVar.a(this, this.isViewVisible ? 0 : 8);
        }
    }

    private boolean isParentNodeHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7162183", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 8 || getVisibility() == 4) {
            return true;
        }
        ViewParent parent = getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getVisibility() == 8 || view.getVisibility() == 4) {
                return true;
            }
            parent = view.getParent();
        }
        return false;
    }

    public boolean isViewVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5645218e", new Object[]{this})).booleanValue() : this.isViewVisible;
    }

    public void registerVisibilityChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3317681", new Object[]{this, aVar});
            return;
        }
        if (!this.mVisibilityChangeListeners.contains(aVar)) {
            this.mVisibilityChangeListeners.add(aVar);
        }
        if (aVar == null) {
            return;
        }
        if (!this.isViewVisible) {
            i = 8;
        }
        aVar.a(this, i);
    }

    public void unregisterVisibilityChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c87991a", new Object[]{this, aVar});
        } else {
            this.mVisibilityChangeListeners.remove(aVar);
        }
    }
}
