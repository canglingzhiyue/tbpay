package com.taobao.android.weex_uikit.ui;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class UINodeGroup extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Camera camera;
    private Rect childBounds;
    public r children;
    private Boolean hasViewChild;
    public Matrix mtx;
    private boolean shouldClipChildren;
    private int viewChildCount;

    static {
        kge.a(1019040358);
    }

    public static /* synthetic */ Object ipc$super(UINodeGroup uINodeGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2062288793:
                return super.findNodeById(((Number) objArr[0]).intValue());
            case -1546257180:
                super.updateLayoutState((s) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -695014098:
                super.activityPause();
                return null;
            case -534120797:
                super.activityResume();
                return null;
            case -370110026:
                super.collectBatchTasks((List) objArr[0]);
                return null;
            case 786484219:
                super.removedFromParent();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public UINodeGroup(int i) {
        super(i);
        this.childBounds = new Rect();
        this.shouldClipChildren = false;
        this.children = new r(this);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean hasViewChild() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf9c208", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.hasViewChild;
        return bool != null && bool.booleanValue();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf16e8f", new Object[]{this});
            return;
        }
        if (this.viewChildCount == 0) {
            this.hasViewChild = true;
            notifyAddViewNode(false);
        }
        this.viewChildCount++;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeViewNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2331f2", new Object[]{this});
            return;
        }
        if (this.viewChildCount == 1) {
            notifyRemoveViewNode(false);
            this.hasViewChild = false;
        }
        this.viewChildCount--;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public n onCreateTouchHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("b0d04501", new Object[]{this}) : new a(this);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
            return;
        }
        this.children.a(uINode);
        uINode.setParentNode(this);
    }

    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
        } else {
            requestLayout();
        }
    }

    public void notifyChildrenChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241ebabf", new Object[]{this});
        } else {
            onChildrenChanged();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue() : this.children.b(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.children.a()) {
            throw new IllegalStateException("GetChildAt parent index out of bounds, parent: " + toString() + ", index: " + i);
        }
        return this.children.b(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        r rVar = this.children;
        if (rVar != null) {
            return rVar.a();
        }
        return 0;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else if (i > this.children.a() || i < 0) {
            throw new IllegalStateException("AddChild parent index out of bounds, parent: " + toString() + ", index: " + i);
        } else {
            this.children.a(i, uINode);
            uINode.setParentNode(this);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else if (i >= this.children.a() || i < 0) {
            throw new IllegalStateException("RemoveChild from parent index out of bounds, parent: " + toString() + ", index: " + i);
        } else {
            this.children.a(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removedFromParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee0cbfb", new Object[]{this});
            return;
        }
        int a2 = this.children.a();
        for (int i = 0; i < a2; i++) {
            UINode b = this.children.b(i);
            if (b != null) {
                b.removedFromParent();
            }
        }
        super.removedFromParent();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void updateLayoutState(s sVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d5fce4", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.updateLayoutState(sVar, i, i2);
        dispatchUpdateLayoutState(sVar, getGlobalVisibleRect().left, getGlobalVisibleRect().top);
    }

    public void dispatchUpdateLayoutState(s sVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c578c0a", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        this.childBounds.set(0, 0, getRight() - getTop(), getBottom() - getTop());
        int a2 = this.children.a();
        for (int i3 = 0; i3 < a2; i3++) {
            UINode b = this.children.b(i3);
            if (b != null) {
                Rect rect = this.childBounds;
                rect.left = Math.min(rect.left, b.getLeft());
                Rect rect2 = this.childBounds;
                rect2.top = Math.min(rect2.top, b.getTop());
                Rect rect3 = this.childBounds;
                rect3.right = Math.max(rect3.right, b.getRight());
                Rect rect4 = this.childBounds;
                rect4.bottom = Math.max(rect4.bottom, b.getBottom());
                b.updateLayoutState(sVar, i, i2);
            }
        }
        if (this.childBounds.left >= 0 && this.childBounds.top >= 0 && this.childBounds.right <= getRight() - getTop() && this.childBounds.bottom <= getBottom() - getTop()) {
            z = false;
        }
        this.shouldClipChildren = z;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean shouldClip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f29c16ae", new Object[]{this})).booleanValue() : !com.taobao.android.weex_framework.m.f15996a || this.shouldClipChildren;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == i2) {
        } else {
            if (i >= this.children.a() || i < 0) {
                throw new IllegalStateException("moveChild from parent index out of bounds, parent: " + toString() + ", fromIndex: " + i);
            }
            this.children.a(i, i2);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void collectBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f091b6", new Object[]{this, list});
            return;
        }
        super.collectBatchTasks(list);
        this.children.a(list);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
            return;
        }
        int a2 = this.children.a();
        for (int i = 0; i < a2; i++) {
            UINode b = this.children.b(i);
            if (b != null) {
                b.collectBatchTasks(list);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void dispatchPreallocate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559580db", new Object[]{this, context});
            return;
        }
        int a2 = this.children.a();
        for (int i = 0; i < a2; i++) {
            UINode b = this.children.b(i);
            if (b != null) {
                b.preallocate(context);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this}) : UINodeType.LAYOUT;
    }

    /* loaded from: classes6.dex */
    public static class a extends n<UINodeGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private UINode b;

        static {
            kge.a(799518316);
        }

        public a(UINodeGroup uINodeGroup) {
            super(uINodeGroup);
        }

        @Override // com.taobao.android.weex_uikit.ui.n
        public boolean b(MotionEvent motionEvent, View view) {
            boolean z;
            int c;
            int d;
            int c2;
            int d2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f91d758", new Object[]{this, motionEvent, view})).booleanValue();
            }
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                a();
                a(true);
            }
            UINode uINode = this.b;
            if (uINode != null) {
                if (uINode != this.f16141a) {
                    Rect h = this.b.getNodeInfo().h();
                    motionEvent.offsetLocation((-h.left) - this.b.getAnimNodeInfo().c(), (-h.top) - this.b.getAnimNodeInfo().d());
                    z = this.b.dispatchTouchEvent(motionEvent, view);
                    motionEvent.offsetLocation(-c2, -d2);
                    if (!z) {
                        z = a(motionEvent, view);
                    }
                } else {
                    z = a(motionEvent, view);
                }
                if (!z) {
                    this.b = null;
                }
            } else {
                int childCount = ((UINodeGroup) this.f16141a).getChildCount() - 1;
                boolean z2 = false;
                while (true) {
                    if (childCount < 0) {
                        z = z2;
                        break;
                    }
                    UINode childAt = ((UINodeGroup) this.f16141a).getChildAt(childCount);
                    if (childAt.getNodeInfo().h().contains(((int) motionEvent.getX()) - childAt.getAnimNodeInfo().c(), ((int) motionEvent.getY()) - childAt.getAnimNodeInfo().d())) {
                        Rect h2 = childAt.getNodeInfo().h();
                        motionEvent.offsetLocation((-h2.left) - childAt.getAnimNodeInfo().c(), (-h2.top) - childAt.getAnimNodeInfo().d());
                        boolean dispatchTouchEvent = childAt.dispatchTouchEvent(motionEvent, view);
                        motionEvent.offsetLocation(-c, -d);
                        if (dispatchTouchEvent) {
                            this.b = childAt;
                            z = dispatchTouchEvent;
                            break;
                        }
                        z2 = dispatchTouchEvent;
                    }
                    childCount--;
                }
                if (!z) {
                    z = a(motionEvent, view);
                    if (z) {
                        this.b = this.f16141a;
                    } else {
                        a();
                    }
                }
            }
            if (action == 1 || action == 3) {
                this.b = null;
                a(false);
            }
            return z;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void activityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e029f6a3", new Object[]{this});
            return;
        }
        super.activityResume();
        r rVar = this.children;
        if (rVar == null) {
            return;
        }
        int a2 = rVar.a();
        for (int i = 0; i < a2; i++) {
            this.children.b(i).activityResume();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.aa
    public void activityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d692ed2e", new Object[]{this});
            return;
        }
        super.activityPause();
        r rVar = this.children;
        if (rVar == null) {
            return;
        }
        int a2 = rVar.a();
        for (int i = 0; i < a2; i++) {
            this.children.b(i).activityPause();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
            return;
        }
        r rVar = this.children;
        if (rVar == null || rVar.a() == 0) {
            return;
        }
        if (!isRenderNodeEnabled()) {
            f *= getOpacity();
        }
        int a2 = this.children.a();
        for (int i = 0; i < a2; i++) {
            UINode b = this.children.b(i);
            int left = b.getLeft();
            int top = b.getTop();
            int translateX = left + b.getTranslateX();
            int translateY = top + b.getTranslateY();
            int save = canvas.save();
            if (translateX != 0 || translateY != 0) {
                canvas.translate(translateX, translateY);
            }
            float rotate = b.getRotate();
            if (rotate != 0.0f) {
                canvas.rotate(rotate, b.getLayoutWidth() / 2.0f, b.getLayoutHeight() / 2.0f);
            }
            float rotateX = b.getRotateX();
            float rotateY = b.getRotateY();
            if (rotateX != 0.0f || rotateY != 0.0f) {
                if (this.camera == null) {
                    this.camera = new Camera();
                    this.mtx = new Matrix();
                }
                this.mtx.reset();
                this.camera.save();
                this.camera.rotateX(rotateX);
                this.camera.rotateY(rotateY);
                this.camera.getMatrix(this.mtx);
                canvas.translate(b.getLayoutWidth() / 2.0f, b.getLayoutHeight() / 2.0f);
                canvas.concat(this.mtx);
                canvas.translate((-b.getLayoutWidth()) / 2.0f, (-b.getLayoutHeight()) / 2.0f);
                this.camera.restore();
            }
            float scaleX = b.getScaleX();
            float scaleY = b.getScaleY();
            if (Float.compare(1.0f, scaleX) != 0 || Float.compare(1.0f, scaleY) != 0) {
                canvas.scale(scaleX, scaleY, b.getLayoutWidth() / 2.0f, b.getLayoutHeight() / 2.0f);
            }
            float skewX = b.getSkewX();
            float skewY = b.getSkewY();
            if (Float.compare(0.0f, skewX) != 0 || Float.compare(0.0f, skewY) != 0) {
                float layoutWidth = b.getLayoutWidth() / 2.0f;
                float layoutHeight = b.getLayoutHeight() / 2.0f;
                canvas.translate(layoutWidth, layoutHeight);
                canvas.skew(skewX, skewY);
                canvas.translate(-layoutWidth, -layoutHeight);
            }
            b.draw(mUSNodeHost, canvas, 0, 0, false, f);
            canvas.restoreToCount(save);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById == null) {
            int a2 = this.children.a();
            for (int i2 = 0; i2 < a2; i2++) {
                findNodeById = this.children.b(i2).findNodeById(i);
                if (findNodeById != null) {
                    break;
                }
            }
        }
        return findNodeById;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchAccessibleChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edca74b", new Object[]{this});
            return;
        }
        boolean shouldBlock = shouldBlock();
        int a2 = this.children.a();
        for (int i = 0; i < a2; i++) {
            this.children.b(i).onParentAccessibleChange(shouldBlock);
        }
    }
}
