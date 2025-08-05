package com.taobao.android.weex_uikit.widget.scroller;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.NestedScrollView;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class MUScrollView extends NestedScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean scrollable;
    private d stateObserver;
    private boolean touching;

    static {
        kge.a(1301767932);
    }

    public static /* synthetic */ Object ipc$super(MUScrollView mUScrollView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode != 1004220751) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public int getScrollRange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512138b4", new Object[]{this})).intValue();
        }
        if (getChildCount() <= 0) {
            return 0;
        }
        return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.touching = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.scrollable && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue() : this.touching;
    }

    public void resetTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b9a39", new Object[]{this});
        } else {
            this.touching = false;
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends AccessibilityDelegateCompat {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2022824661);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1796852737) {
                super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                return null;
            } else if (hashCode == -1476904323) {
                return new Boolean(super.performAccessibilityAction((View) objArr[0], ((Number) objArr[1]).intValue(), (Bundle) objArr[2]));
            } else {
                if (hashCode != -485045190) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                super.onInitializeAccessibilityEvent((View) objArr[0], (AccessibilityEvent) objArr[1]);
                return null;
            }
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            int max;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7f83a7d", new Object[]{this, view, new Integer(i), bundle})).booleanValue();
            }
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            MUScrollView mUScrollView = (MUScrollView) view;
            if (!mUScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(mUScrollView.getScrollY() + ((mUScrollView.getHeight() - mUScrollView.getPaddingBottom()) - mUScrollView.getPaddingTop()), mUScrollView.getScrollRange());
                if (min == mUScrollView.getScrollY()) {
                    return false;
                }
                mUScrollView.smoothScrollTo(0, min);
                return true;
            } else if (i != 8192 || (max = Math.max(mUScrollView.getScrollY() - ((mUScrollView.getHeight() - mUScrollView.getPaddingBottom()) - mUScrollView.getPaddingTop()), 0)) == mUScrollView.getScrollY()) {
                return false;
            } else {
                mUScrollView.scrollBy(0, max - mUScrollView.getScrollY());
                return true;
            }
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94e633ff", new Object[]{this, view, accessibilityNodeInfoCompat});
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            MUScrollView mUScrollView = (MUScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (!mUScrollView.isEnabled() || (scrollRange = mUScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.setScrollable(true);
            if (mUScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
            if (mUScrollView.getScrollY() >= scrollRange) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(4096);
        }

        @Override // android.support.v4.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e316cc3a", new Object[]{this, view, accessibilityEvent});
                return;
            }
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            MUScrollView mUScrollView = (MUScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (mUScrollView.getScrollRange() <= 0) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(mUScrollView.getScrollX());
            accessibilityEvent.setScrollY(mUScrollView.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent, mUScrollView.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent, mUScrollView.getScrollRange());
        }
    }

    public MUScrollView(Context context) {
        super(context);
        this.scrollable = true;
        ViewCompat.setAccessibilityDelegate(this, new a());
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        d dVar = this.stateObserver;
        if (dVar == null) {
            return;
        }
        dVar.a(i, i2, i3, i4);
    }

    public void setOnScrollChangedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5febc19f", new Object[]{this, cVar});
        } else if (this.stateObserver != null || cVar == null) {
        } else {
            this.stateObserver = new d(cVar, this);
        }
    }
}
