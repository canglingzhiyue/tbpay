package com.taobao.android.xsearchplugin.muise;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class MuiseHolderContainer extends FrameLayout implements com.taobao.android.searchbaseframe.uikit.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int clipHeight;
    private int height;
    private View.OnTouchListener interceptListener;
    private a listener;
    private boolean observeHeightChange;

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    static {
        kge.a(-1793169203);
        kge.a(-1593312073);
    }

    public static /* synthetic */ Object ipc$super(MuiseHolderContainer muiseHolderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -407533570) {
            if (hashCode == 623593120) {
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode != 650865254) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
        }
        return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
    }

    public MuiseHolderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clipHeight = 0;
        this.observeHeightChange = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        if (this.clipHeight > 0) {
            i = canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight() - this.clipHeight);
        } else {
            i = -1;
        }
        super.dispatchDraw(canvas);
        if (i == -1) {
            return;
        }
        canvas.restore();
    }

    public void setClipHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7925cc63", new Object[]{this, new Integer(i)});
        } else if (this.clipHeight == i) {
        } else {
            this.clipHeight = i;
            invalidate();
        }
    }

    public int getClipHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2239287", new Object[]{this})).intValue() : this.clipHeight;
    }

    public void setHeightChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132fe5e3", new Object[]{this, aVar});
        } else {
            this.listener = aVar;
        }
    }

    public void setObserveHeightChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b55c69c", new Object[]{this, new Boolean(z)});
        } else {
            this.observeHeightChange = z;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i4 = this.height;
        super.onMeasure(i, i2);
        this.height = getMeasuredHeight();
        if (!this.observeHeightChange || i4 == (i3 = this.height) || (aVar = this.listener) == null) {
            return;
        }
        aVar.a(i3);
    }

    public int getContentHeight() {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.dynamic_container);
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            return childAt.getMeasuredHeight();
        }
        return -1;
    }

    public View getDynamicContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c2a64981", new Object[]{this}) : findViewById(R.id.dynamic_container);
    }

    @Override // com.taobao.android.searchbaseframe.uikit.b
    public void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5b00b", new Object[]{this, onTouchListener});
        } else {
            this.interceptListener = onTouchListener;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        View.OnTouchListener onTouchListener = this.interceptListener;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
