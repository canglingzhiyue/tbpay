package com.taobao.tao.recommend4.manager.weex2.container.drawer.impl;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic;
import tb.kge;

/* loaded from: classes8.dex */
public class ScrollInterceptView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ANIM = 2;
    public static final int STATE_DOWN = 0;
    public static final int STATE_DRAG = 1;
    public static final int STATE_FULL_DOWN = -1;
    public static final int STATE_HALF_UP = 4;
    public static final int STATE_UP = 3;
    private boolean dropTouch;
    private com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b mScrollLogic;

    /* loaded from: classes8.dex */
    public interface a {
        boolean a();
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void a(int i, int i2, int i3, int i4, int i5, float f);

        void a(NewScrollLogic.PullState pullState, NewScrollLogic.PullState pullState2);
    }

    static {
        kge.a(-282079036);
    }

    public static /* synthetic */ Object ipc$super(ScrollInterceptView scrollInterceptView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    public ScrollInterceptView(Context context) {
        super(context);
        this.dropTouch = false;
        init();
    }

    public ScrollInterceptView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dropTouch = false;
        init();
    }

    public ScrollInterceptView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dropTouch = false;
        init();
    }

    public void setOffsetCallback(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6419e", new Object[]{this, bVar});
        } else {
            this.mScrollLogic.a(bVar);
        }
    }

    public void setAtmosphereHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501434d1", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.d(i);
        }
    }

    public void flyToAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19f7297", new Object[]{this});
        } else {
            this.mScrollLogic.d();
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mScrollLogic = new NewScrollLogic();
        this.mScrollLogic.a(this);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.mScrollLogic.a() == -1) {
            int i5 = i4 - i2;
            ViewCompat.offsetTopAndBottom(getChildAt(0), i5);
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
            this.mScrollLogic.c(i5);
            return;
        }
        ViewCompat.offsetTopAndBottom(getChildAt(0), this.mScrollLogic.b());
        onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.dropTouch) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.dropTouch = false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.mScrollLogic.a(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : this.mScrollLogic.b(motionEvent);
    }

    public void setDownContentHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2597ba0", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.a(i);
        }
    }

    public void moveChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26168f76", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.a(i, true);
        }
    }

    public void flyChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d6fd18", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.b(i);
        }
    }

    public void appearAnim(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1c69a7", new Object[]{this, new Boolean(z)});
        } else {
            this.mScrollLogic.a(z);
        }
    }

    public void setTargetHeight(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337d76ab", new Object[]{this, str});
        } else {
            this.mScrollLogic.a(str);
        }
    }

    public void setFlyChildDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e2ad1d", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.f(i);
        }
    }

    public void updateWindowMoveY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b32f80ad", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.j(i);
        }
    }

    public void setSwitchScrollClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb826938", new Object[]{this, new Boolean(z)});
        } else {
            this.mScrollLogic.b(z);
        }
    }

    public void closeEnterAnim(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fdbc3dc", new Object[]{this, new Boolean(z)});
        } else {
            this.mScrollLogic.c(z);
        }
    }

    public void setEnterAnimDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7a76c1", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.g(i);
        }
    }

    public int getChildState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8cab8fc5", new Object[]{this})).intValue() : this.mScrollLogic.a();
    }

    public void disappearAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b816db", new Object[]{this});
        } else {
            this.mScrollLogic.b(getHeight());
        }
    }

    public void setStateProvider(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc346699", new Object[]{this, aVar});
        } else {
            this.mScrollLogic.a(aVar);
        }
    }

    public int getDownStateOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ba889ec6", new Object[]{this})).intValue() : this.mScrollLogic.c();
    }

    public void setDropTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66a309f", new Object[]{this, new Boolean(z)});
        } else {
            this.dropTouch = z;
        }
    }

    public void notifyScrollChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef3cd04d", new Object[]{this});
        } else {
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
        }
    }

    public void setHeaderHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f8bd86", new Object[]{this, new Integer(i)});
        } else {
            this.mScrollLogic.e(i);
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b bVar = this.mScrollLogic;
        if (bVar == null) {
            return;
        }
        bVar.e();
    }
}
