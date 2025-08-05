package com.taobao.search.musie;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class MuiseContainer extends FrameLayout implements com.taobao.android.searchbaseframe.uikit.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout dynamicContainer;
    private FrameLayout innerCardContainer;
    private View.OnTouchListener interceptListener;
    private LinearLayout parentContainer;
    private View placeHolderView;

    static {
        kge.a(112662762);
        kge.a(-1593312073);
    }

    public static /* synthetic */ Object ipc$super(MuiseContainer muiseContainer, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MuiseContainer(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.parentContainer = new LinearLayout(context);
        this.parentContainer.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.placeHolderView = new View(context);
        this.placeHolderView.setBackgroundColor(-1);
        this.placeHolderView.setId(R.id.placeholder_img);
        frameLayout.addView(this.placeHolderView, new FrameLayout.LayoutParams(-1, -1));
        this.dynamicContainer = new FrameLayout(context);
        this.dynamicContainer.setId(R.id.dynamic_container);
        frameLayout.addView(this.dynamicContainer, new FrameLayout.LayoutParams(-1, -2));
        this.parentContainer.addView(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        this.innerCardContainer = new FrameLayout(context);
        this.parentContainer.addView(this.innerCardContainer, new FrameLayout.LayoutParams(-1, -2));
        addView(this.parentContainer);
    }

    public FrameLayout getInnerCardContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("df3b341", new Object[]{this}) : this.innerCardContainer;
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

    @Override // com.taobao.android.searchbaseframe.uikit.b
    public void setOnInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5b00b", new Object[]{this, onTouchListener});
        } else {
            this.interceptListener = onTouchListener;
        }
    }
}
