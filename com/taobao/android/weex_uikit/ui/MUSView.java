package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSView extends MUSNodeHost {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MUSDKInstance instance;
    public boolean isAttach;
    private boolean isRoot;
    private t mountState;
    private boolean needRecover;
    private int oldHeight;
    private int oldWidth;
    private final Rect previousMountVisibleRectBounds;
    private o scrollObserver;
    private View subView;

    static {
        kge.a(826269805);
    }

    public static /* synthetic */ Object ipc$super(MUSView mUSView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1171625914:
                super.setUiNodeTree((i) objArr[0]);
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -270519527:
                super.onFinishTemporaryDetach();
                return null;
            case -65110090:
                super.addSubView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1861606664:
                super.onStartTemporaryDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void setRecycleWhenDetach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5927fcf", new Object[]{this, new Boolean(z)});
        }
    }

    public MUSView(MUSDKInstance mUSDKInstance) {
        super(mUSDKInstance.getUIContext());
        this.isRoot = true;
        this.previousMountVisibleRectBounds = new Rect();
        init(mUSDKInstance);
    }

    public MUSView(Context context) {
        super(context);
        this.isRoot = true;
        this.previousMountVisibleRectBounds = new Rect();
        init(null);
    }

    public t getMountState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("841adb5f", new Object[]{this}) : this.mountState;
    }

    private void init(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ed0893f", new Object[]{this, mUSDKInstance});
            return;
        }
        this.mountState = new t(this);
        this.instance = mUSDKInstance;
        this.scrollObserver = new o(this);
    }

    public void setMountContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87082b49", new Object[]{this, context});
        } else {
            this.mountState.a(context);
        }
    }

    public void setScrollObserverEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4a9ef1", new Object[]{this, new Boolean(z)});
            return;
        }
        o oVar = this.scrollObserver;
        if (oVar == null) {
            return;
        }
        oVar.a(z);
    }

    public void setRoot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("253ead49", new Object[]{this, new Boolean(z)});
        } else {
            this.isRoot = z;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost
    public void setUiNodeTree(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2a6846", new Object[]{this, iVar});
            return;
        }
        setScrollObserverEnabled(iVar.d());
        this.needRecover = false;
        if (this.uiNodeTree != null && this.uiNodeTree != iVar) {
            release(true);
        }
        super.setUiNodeTree(iVar);
        iVar.a(this);
        requestLayout();
    }

    public i getUiNodeTree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("9c3f030e", new Object[]{this}) : this.uiNodeTree;
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost
    public void performLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        MUSDKInstance mUSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e37fe2", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (this.uiNodeTree == null || !this.isAttach) {
        } else {
            if (this.isRoot && (((i5 = i3 - i) != this.oldWidth || i4 - i2 != this.oldHeight) && (mUSDKInstance = this.instance) != null)) {
                this.oldWidth = i5;
                this.oldHeight = i4 - i2;
                mUSDKInstance.updateContainerSize(this.oldWidth, this.oldHeight, com.taobao.android.weex_framework.m.f());
            }
            performMount();
            updateChildTranslate(this);
            updateAPMState();
        }
    }

    public void updateTranslateOnLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b29915", new Object[]{this});
        } else {
            updateChildTranslate(this);
        }
    }

    private void performMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa1c01bf", new Object[]{this});
        } else if (this.uiNodeTree == null || !this.isAttach || !this.uiNodeTree.i()) {
        } else {
            this.uiNodeTree.m();
            if (!this.uiNodeTree.j()) {
                this.uiNodeTree.c(this.uiNodeTree.c());
            }
            performLayoutOnChildrenIfNecessary(this);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int k = this.uiNodeTree == null ? 0 : this.uiNodeTree.k();
        int l = this.uiNodeTree == null ? 0 : this.uiNodeTree.l();
        if (mode == Integer.MIN_VALUE ? k < size : mode == 0) {
            size = k;
        }
        if (mode2 == Integer.MIN_VALUE ? l < size2 : mode2 == 0) {
            size2 = l;
        }
        setMeasuredDimension(size, size2);
        if (!this.isAddFlutterView || getChildCount() <= 0) {
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                childAt.measure(i, i2);
            }
        }
    }

    public MUSDKInstance getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSDKInstance) ipChange.ipc$dispatch("ab68dab8", new Object[]{this}) : this.instance;
    }

    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
        } else {
            this.instance = mUSDKInstance;
        }
    }

    public void performIncrementalMount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43778a67", new Object[]{this});
        } else if (this.uiNodeTree == null || this.inLayout) {
        } else {
            suppressInvalidate(true);
            this.uiNodeTree.c(this.uiNodeTree.c());
            suppressInvalidate(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        onDetach();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef5dd08", new Object[]{this});
            return;
        }
        super.onStartTemporaryDetach();
        onDetach();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        onAttach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe03319", new Object[]{this});
            return;
        }
        super.onFinishTemporaryDetach();
        onAttach();
    }

    private static void performLayoutOnChildrenIfNecessary(MUSNodeHost mUSNodeHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c63ea4d", new Object[]{mUSNodeHost});
            return;
        }
        for (int childCount = mUSNodeHost.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = mUSNodeHost.getChildAt(childCount);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                childAt.setTranslationX(mUSNodeHost.getDrawTranslateX());
                childAt.setTranslationY(mUSNodeHost.getDrawTranslateY());
            }
        }
    }

    private static void updateChildTranslate(MUSNodeHost mUSNodeHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c0b8df", new Object[]{mUSNodeHost});
            return;
        }
        int childCount = mUSNodeHost.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mUSNodeHost.getChildAt(i);
            childAt.setTranslationX(mUSNodeHost.getDrawTranslateX());
            childAt.setTranslationY(mUSNodeHost.getDrawTranslateY());
        }
    }

    private void onAttach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51f7278b", new Object[]{this});
            return;
        }
        this.isAttach = true;
        this.scrollObserver.a();
        if (this.uiNodeTree == null) {
            return;
        }
        if (this.needRecover) {
            recoverMountState();
        } else {
            requestLayout();
        }
    }

    private void recoverMountState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78f7c303", new Object[]{this});
            return;
        }
        this.needRecover = false;
        if (this.uiNodeTree == null) {
            return;
        }
        performLayout(false, 0, 0, this.oldWidth, this.oldHeight);
    }

    private void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        this.isAttach = false;
        this.scrollObserver.b();
    }

    @Override // com.taobao.android.weex_framework.ui.f
    public void release(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88058386", new Object[]{this, new Boolean(z)});
        } else if (this.uiNodeTree == null) {
        } else {
            this.mountState.a();
            this.previousMountVisibleRectBounds.setEmpty();
            if (!z) {
                return;
            }
            setContentDescription("");
            this.uiNodeTree.a((ViewGroup) null);
            this.uiNodeTree = null;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.MUSNodeHost
    public void addSubView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1e7fb6", new Object[]{this, view, layoutParams});
        } else {
            super.addSubView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isAddFlutterView) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = -getDrawTranslateX();
        int i2 = -getDrawTranslateY();
        motionEvent.offsetLocation(i, i2);
        if (this.uiNodeTree == null || !this.uiNodeTree.a(motionEvent, this)) {
            z = false;
        }
        motionEvent.offsetLocation(-i, -i2);
        return z;
    }

    public boolean isMountStateDirty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b9e0cbb", new Object[]{this})).booleanValue() : this.mountState.d();
    }

    @Override // android.view.View
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (getTag() != null) {
            return getTag().toString();
        }
        return super.toString();
    }

    public void mount(s sVar, Rect rect, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeada41a", new Object[]{this, sVar, rect, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (rect == null) {
            this.previousMountVisibleRectBounds.setEmpty();
        } else {
            this.previousMountVisibleRectBounds.set(rect);
        }
        if (this.uiNodeTree == null) {
            return;
        }
        this.mountState.a(sVar, rect, z, z2, this.uiNodeTree.d());
    }

    public Rect getPreviousMountVisibleRectBounds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Rect) ipChange.ipc$dispatch("2a9b5b4f", new Object[]{this}) : this.previousMountVisibleRectBounds;
    }
}
