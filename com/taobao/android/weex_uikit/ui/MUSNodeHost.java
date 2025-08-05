package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.jwy;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class MUSNodeHost extends ViewGroup implements com.taobao.android.weex_framework.ui.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Boolean accessibilityEnabled;
    private boolean accessibilityWasOpened;
    private boolean disableClip;
    private int drawTranslateX;
    private int drawTranslateY;
    public int imageLoadedCnt;
    public int imageNodeCnt;
    public boolean inLayout;
    public boolean isAddFlutterView;
    private boolean suppressInvalidate;
    public i uiNodeTree;
    private boolean wasInvalidateRequestedWhenSuppressed;
    private boolean wasRequestLayoutWhenLayout;

    static {
        kge.a(-803485550);
        kge.a(-1860705690);
    }

    public static /* synthetic */ Object ipc$super(MUSNodeHost mUSNodeHost, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1944670684:
                super.invalidateDrawable((Drawable) objArr[0]);
                return null;
            case -1588924205:
                super.removeViewInLayout((View) objArr[0]);
                return null;
            case -1324527800:
                return new Boolean(super.isImportantForAccessibility());
            case -709604280:
                return new Boolean(super.addViewInLayout((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2], ((Boolean) objArr[3]).booleanValue()));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 1621401666:
                super.invalidate();
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void performLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e37fe2", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void access$001(MUSNodeHost mUSNodeHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d926d95", new Object[]{mUSNodeHost});
        } else {
            super.requestLayout();
        }
    }

    public MUSNodeHost(Context context) {
        super(context);
        this.drawTranslateX = 0;
        this.drawTranslateY = 0;
        this.disableClip = false;
        this.isAddFlutterView = false;
        this.imageNodeCnt = 0;
        this.imageLoadedCnt = 0;
        setWillNotDraw(true);
        setChildrenDrawingOrderEnabled(false);
        setContainerFocusable();
    }

    public boolean isAccessibilityEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97ab0468", new Object[]{this})).booleanValue();
        }
        if (this.accessibilityEnabled == null) {
            this.accessibilityEnabled = Boolean.valueOf(com.taobao.android.weex_framework.m.a());
        }
        return this.accessibilityEnabled.booleanValue();
    }

    public void setFlutterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daba1026", new Object[]{this});
        } else {
            this.isAddFlutterView = true;
        }
    }

    public void setUiNodeTree(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2a6846", new Object[]{this, iVar});
        } else {
            this.uiNodeTree = iVar;
        }
    }

    public void setDrawTranslateX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592bab2c", new Object[]{this, new Integer(i)});
        } else {
            this.drawTranslateX = i;
        }
    }

    public void setDrawTranslateY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae083cb", new Object[]{this, new Integer(i)});
        } else {
            this.drawTranslateY = i;
        }
    }

    public int getDrawTranslateX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cbd1c9e", new Object[]{this})).intValue() : this.drawTranslateX;
    }

    public int getDrawTranslateY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ccb341f", new Object[]{this})).intValue() : this.drawTranslateY;
    }

    public boolean isDisableClip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3a29059", new Object[]{this})).booleanValue() : this.disableClip;
    }

    public void setDisableClip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529c6c57", new Object[]{this, new Boolean(z)});
        } else {
            this.disableClip = z;
        }
    }

    private void mountView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30140cd", new Object[]{this, view});
            return;
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(generateDefaultLayoutParams());
        }
        try {
            if (view.getParent() instanceof MUSNodeHost) {
                ((MUSNodeHost) view.getParent()).removeViewFromParent(view);
            }
            if (this.inLayout) {
                super.addViewInLayout(view, -1, view.getLayoutParams(), true);
            } else {
                super.addView(view, -1, view.getLayoutParams());
            }
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
        }
    }

    private void removeViewFromParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b0912e", new Object[]{this, view});
        } else if (this.inLayout) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
        } else if (this.uiNodeTree == null) {
            if (!this.isAddFlutterView) {
                return;
            }
            super.dispatchDraw(canvas);
        } else {
            try {
                if (isLayoutRequested() && this.uiNodeTree.e().i()) {
                    performLayout(false, 0, 0, getWidth(), getHeight());
                }
            } catch (Throwable th) {
                com.taobao.android.weex_framework.util.g.a(th);
            }
            if (this.accessibilityWasOpened) {
                this.accessibilityEnabled = Boolean.valueOf(com.taobao.android.weex_framework.m.a());
                if (!this.accessibilityEnabled.booleanValue()) {
                    this.accessibilityWasOpened = false;
                }
            }
            this.uiNodeTree.a(this, canvas, this.drawTranslateX, this.drawTranslateY, this.disableClip);
        }
    }

    @Override // android.view.View
    public boolean isImportantForAccessibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b10d4f48", new Object[]{this})).booleanValue();
        }
        this.accessibilityWasOpened = true;
        invalidate();
        return super.isImportantForAccessibility();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.inLayout = true;
        performLayout(z, i, i2, i3, i4);
        this.inLayout = false;
        if (this.wasRequestLayoutWhenLayout) {
            post(new Runnable() { // from class: com.taobao.android.weex_uikit.ui.MUSNodeHost.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MUSNodeHost.access$001(MUSNodeHost.this);
                    }
                }
            });
            this.wasRequestLayoutWhenLayout = false;
        }
        if (!this.isAddFlutterView || getChildCount() <= 0) {
            return;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != null) {
                childAt.layout(i, i2, i3, i4);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (!shouldRequestLayout()) {
            this.wasRequestLayoutWhenLayout = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean shouldRequestLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("252be931", new Object[]{this})).booleanValue() : !this.inLayout;
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a156817", new Object[]{this, rect});
        } else if (this.suppressInvalidate) {
            this.wasInvalidateRequestedWhenSuppressed = true;
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76fcd802", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.suppressInvalidate) {
            this.wasInvalidateRequestedWhenSuppressed = true;
        } else {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
        } else if (this.suppressInvalidate) {
            this.wasInvalidateRequestedWhenSuppressed = true;
        } else {
            super.invalidate();
        }
    }

    public void unmount(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa5cdc3", new Object[]{this, obj});
        } else if (obj instanceof Drawable) {
            jwy jwyVar = (jwy) obj;
            jwyVar.setCallback(null);
            jwyVar.a((UINode) null);
        } else if (!(obj instanceof View)) {
        } else {
            unmountView((View) obj);
        }
    }

    private void mountDrawable(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19c6d3a", new Object[]{this, obj});
        } else {
            com.taobao.android.weex_uikit.util.e.a(this, (jwy) obj);
        }
    }

    public void addImageNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("908a68e3", new Object[]{this});
        } else {
            this.imageNodeCnt++;
        }
    }

    public void markImageLoaded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c973973a", new Object[]{this});
            return;
        }
        this.imageLoadedCnt++;
        updateAPMState();
    }

    public void updateAPMState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad01eb83", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.adapter.a d = com.taobao.android.weex_framework.l.a().d();
        if (d == null) {
            return;
        }
        if (this.imageNodeCnt <= this.imageLoadedCnt) {
            d.a(this);
        } else {
            d.b(this);
        }
    }

    public void removeImageNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("959111e0", new Object[]{this});
            return;
        }
        this.imageNodeCnt--;
        if (this.imageNodeCnt > 0) {
            return;
        }
        this.imageNodeCnt = 0;
        this.imageLoadedCnt = 0;
    }

    public void mount(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5133fc", new Object[]{this, obj});
        } else if (obj instanceof Drawable) {
            mountDrawable(obj);
        } else if (!(obj instanceof View)) {
        } else {
            mountView((View) obj);
        }
    }

    private void unmountView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a538ab66", new Object[]{this, view});
            return;
        }
        try {
            if (view.getParent() != this) {
                return;
            }
            if (this.inLayout) {
                super.removeViewInLayout(view);
            } else {
                super.removeView(view);
            }
        } catch (Exception e) {
            com.taobao.android.weex_framework.util.g.a(e);
        }
    }

    public void suppressInvalidate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e54b5d", new Object[]{this, new Boolean(z)});
        } else if (this.suppressInvalidate == z) {
        } else {
            this.suppressInvalidate = z;
            if (z || !this.wasInvalidateRequestedWhenSuppressed) {
                return;
            }
            invalidate();
            this.wasInvalidateRequestedWhenSuppressed = false;
        }
    }

    public void addSubView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1e7fb6", new Object[]{this, view, layoutParams});
        } else {
            super.addView(view, -1, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
            return;
        }
        throw new UnsupportedOperationException("Adding Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
            return;
        }
        throw new UnsupportedOperationException("Adding Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        throw new UnsupportedOperationException("Adding Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5b44c48", new Object[]{this, view, new Integer(i), layoutParams, new Boolean(z)})).booleanValue();
        }
        throw new UnsupportedOperationException("Adding Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17b44d6", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        throw new UnsupportedOperationException("Adding Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    @Deprecated
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        throw new UnsupportedOperationException("Removing Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void removeViewInLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a14af0d3", new Object[]{this, view});
            return;
        }
        throw new UnsupportedOperationException("Removing Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void removeViewsInLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446e8b80", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        throw new UnsupportedOperationException("Removing Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void removeViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
            return;
        }
        throw new UnsupportedOperationException("Removing Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void removeViews(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2923e3f1", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        throw new UnsupportedOperationException("Removing Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void removeAllViewsInLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f57247", new Object[]{this});
            return;
        }
        throw new UnsupportedOperationException("Removing Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void removeDetachedView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9350c624", new Object[]{this, view, new Boolean(z)});
            return;
        }
        throw new UnsupportedOperationException("Removing Views manually within MUSNodeHost is not supported");
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df58e74", new Object[]{this, view, view2});
            return;
        }
        super.onDescendantInvalidated(view, view2);
        UINode uINode = (UINode) view.getTag(R.string.mus_view_tag);
        if (uINode == null) {
            return;
        }
        uINode.invalidate();
    }

    public void invalidateChild(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a243b2a", new Object[]{this, view});
            return;
        }
        UINode uINode = (UINode) view.getTag(R.string.mus_view_tag);
        if (uINode == null) {
            return;
        }
        uINode.invalidate();
    }

    public void drawChild(View view, Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfae7912", new Object[]{this, view, canvas});
        } else {
            drawChild(canvas, view, System.currentTimeMillis());
        }
    }

    public void addAccessibilityView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcb8a39", new Object[]{this, view});
        } else if (this.inLayout) {
            super.addViewInLayout(view, -1, view.getLayoutParams(), false);
        } else {
            super.addView(view, -1, view.getLayoutParams());
        }
    }

    public void removeAccessibilityView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2702b1c", new Object[]{this, view});
        } else if (this.inLayout) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private void setContainerFocusable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cde9ba", new Object[]{this});
            return;
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
