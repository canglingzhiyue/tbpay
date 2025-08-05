package com.flybird;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;

/* loaded from: classes4.dex */
public class FBScrollView extends ScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FBScrollHelper f7174a;
    public final FrameLayout b;
    public boolean c;
    public boolean d;

    /* loaded from: classes4.dex */
    public interface FBScrollViewListener {
        void onScrollBegin(int i, int i2, boolean z);

        void onScrollChanged(int i, int i2, int i3, int i4, boolean z);

        void onScrollEnd(int i, int i2, boolean z);

        void onScrollStop(int i, int i2, boolean z);
    }

    public FBScrollView(Context context, FrameLayout frameLayout) {
        super(context);
        this.c = true;
        this.d = false;
        this.b = frameLayout;
        this.f7174a = new FBScrollHelper(this, frameLayout, false);
        setOverScrollMode(2);
        super.addView(frameLayout);
    }

    public static /* synthetic */ Object ipc$super(FBScrollView fBScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 640003410:
                super.requestChildFocus((View) objArr[0], (View) objArr[1]);
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public void addAdditionalScrollViewListener(FBScrollViewListener fBScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a2643c5", new Object[]{this, fBScrollViewListener});
            return;
        }
        FBScrollHelper fBScrollHelper = this.f7174a;
        if (fBScrollHelper.e == null) {
            fBScrollHelper.e = new HashSet();
        }
        fBScrollHelper.e.add(fBScrollViewListener);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else {
            this.b.addView(view);
        }
    }

    public View getContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("507c2c94", new Object[]{this}) : this.b;
    }

    public View getFbChildAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f051e8a1", new Object[]{this, new Integer(i)}) : this.b.getChildAt(i);
    }

    public int getFbChildCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d36279f", new Object[]{this})).intValue() : this.b.getChildCount();
    }

    public boolean isScrollable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c7d2e7c", new Object[]{this})).booleanValue() : this.c;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.c && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.f7174a.a(i, i2, i3, i4);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onSizeChanged(i, i2, i3, i4);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.c && this.f7174a.a(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            return this.c && super.onTouchEvent(motionEvent);
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            FBLogger.e("FBScrollView", th.getMessage());
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else {
            this.b.removeView(view);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2625ad52", new Object[]{this, view, view2});
        } else if (view2 != null && !this.d && ((view2 instanceof WebView) || view2.getClass().getName().startsWith("com.uc.webkit"))) {
            String name = getClass().getName();
            FBLogger.d(name, "scrollview requestChildFocus focused=" + view2.getClass().getName() + " child=" + view.getClass().getName());
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: com.flybird.FBScrollView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view3, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view3, motionEvent})).booleanValue();
                    }
                    if ((motionEvent.getAction() & 255) == 1) {
                        FBScrollView.this.requestDisallowInterceptTouchEvent(false);
                    } else {
                        FBScrollView fBScrollView = FBScrollView.this;
                        fBScrollView.d = true;
                        fBScrollView.requestDisallowInterceptTouchEvent(true);
                    }
                    return false;
                }
            });
        } else {
            super.requestChildFocus(view, view2);
        }
    }

    public void setOverScrollEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47682ef", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f7174a.g = z;
        this.b.setClipChildren(false);
    }

    public void setScrollListened(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330c0cb8", new Object[]{this, new Boolean(z)});
        } else {
            this.f7174a.h = z;
        }
    }

    public void setScrollViewListener(FBScrollViewListener fBScrollViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921ff34b", new Object[]{this, fBScrollViewListener});
        } else {
            this.f7174a.d = fBScrollViewListener;
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
        } else if (i == -1) {
            super.addView(view, i);
        } else {
            this.b.addView(view, i);
        }
    }
}
