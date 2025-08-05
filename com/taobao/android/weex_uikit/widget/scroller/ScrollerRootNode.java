package com.taobao.android.weex_uikit.widget.scroller;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.s;
import tb.kge;

/* loaded from: classes6.dex */
public class ScrollerRootNode extends UINodeGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a childrenStateListener;
    private boolean vertical;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a {
        void onChildrenChanged();
    }

    static {
        kge.a(-1637167200);
    }

    public static /* synthetic */ Object ipc$super(ScrollerRootNode scrollerRootNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1546257180:
                super.updateLayoutState((s) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case -1509210880:
                return new Integer(super.getLayoutWidth());
            case -711984031:
                return new Integer(super.getLayoutHeight());
            case -254914203:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0], (View) objArr[1]));
            case -110296387:
                super.dispatchDraw((MUSNodeHost) objArr[0], (Canvas) objArr[1], ((Number) objArr[2]).floatValue());
                return null;
            case 56600925:
                super.onChildrenChanged();
                return null;
            case 743934986:
                super.dispatchUpdateLayoutState((s) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public ScrollerRootNode(int i) {
        super(i);
    }

    public void setVertical(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19b435", new Object[]{this, new Boolean(z)});
        } else {
            this.vertical = z;
        }
    }

    public void setChildrenStateListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b177509d", new Object[]{this, aVar});
        } else {
            this.childrenStateListener = aVar;
        }
    }

    private int getTotalHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28b76e4f", new Object[]{this})).intValue();
        }
        if (getChildCount() != 0) {
            return getChildAt(getChildCount() - 1).getNodeInfo().h().bottom;
        }
        return 0;
    }

    private int getTotalWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c56dd52", new Object[]{this})).intValue();
        }
        if (getChildCount() == 0) {
            return 0;
        }
        UINode childAt = getChildAt(getChildCount() - 1);
        if (m.f()) {
            return Math.max(super.getLayoutWidth() - childAt.getNodeInfo().h().left, super.getLayoutWidth());
        }
        return childAt.getNodeInfo().h().right;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void dispatchDraw(MUSNodeHost mUSNodeHost, Canvas canvas, float f) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96d02bd", new Object[]{this, mUSNodeHost, canvas, new Float(f)});
            return;
        }
        if (needTransform()) {
            i = getTotalWidth() - super.getLayoutWidth();
        }
        if (i != 0) {
            canvas.translate(i, 0.0f);
        }
        super.dispatchDraw(mUSNodeHost, canvas, f);
        if (i == 0) {
            return;
        }
        canvas.translate(-i, 0.0f);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void dispatchUpdateLayoutState(s sVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c578c0a", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        if (needTransform()) {
            i = getTotalWidth() - super.getLayoutWidth();
        }
        super.dispatchUpdateLayoutState(sVar, i, i2);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getLayoutWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a60b4500", new Object[]{this})).intValue();
        }
        if (this.vertical) {
            return super.getLayoutWidth();
        }
        return getTotalWidth();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup, com.taobao.android.weex_uikit.ui.UINode
    public void updateLayoutState(s sVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3d5fce4", new Object[]{this, sVar, new Integer(i), new Integer(i2)});
            return;
        }
        super.updateLayoutState(sVar, i, i2);
        getGlobalVisibleRect().right = getGlobalVisibleRect().left + getLayoutWidth();
        getGlobalVisibleRect().bottom = getGlobalVisibleRect().top + getLayoutHeight();
    }

    private boolean needTransform() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ef52501", new Object[]{this})).booleanValue() : m.f() && !this.vertical;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0ce5165", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if (needTransform()) {
            i = getTotalWidth() - super.getLayoutWidth();
        }
        if (i != 0) {
            motionEvent.offsetLocation(-i, 0.0f);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent, view);
        if (i != 0) {
            motionEvent.offsetLocation(i, 0.0f);
        }
        return dispatchTouchEvent;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getLayoutHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d58ffc61", new Object[]{this})).intValue();
        }
        if (this.vertical) {
            return getTotalHeight();
        }
        return super.getLayoutHeight();
    }

    @Override // com.taobao.android.weex_uikit.ui.UINodeGroup
    public void onChildrenChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35fa95d", new Object[]{this});
            return;
        }
        super.onChildrenChanged();
        a aVar = this.childrenStateListener;
        if (aVar == null) {
            return;
        }
        aVar.onChildrenChanged();
    }
}
