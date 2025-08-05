package com.taobao.android.layoutmanager.container.secondpage.biz;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.secondpage.biz.weexadapter.c;
import com.taobao.tao.flexbox.layoutmanager.component.z;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import java.util.HashMap;
import tb.kge;
import tb.oga;
import tb.ogb;

/* loaded from: classes5.dex */
public final class GGSecPageViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private aa currentTrackNode;
    private MotionEvent mFakeDown;
    private boolean mIsUnableToDragBecauseWeex;
    private boolean mUsingNewGuesture;
    private oga secPageWrapper;
    private boolean touchInGesture;

    static {
        kge.a(1330923321);
    }

    public static /* synthetic */ Object ipc$super(GGSecPageViewPager gGSecPageViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -407533570) {
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            if (hashCode != 222452193) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.canScroll((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public GGSecPageViewPager(Context context) {
        super(context);
        this.touchInGesture = false;
        this.mFakeDown = null;
        this.mIsUnableToDragBecauseWeex = false;
        init();
    }

    public GGSecPageViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.touchInGesture = false;
        this.mFakeDown = null;
        this.mIsUnableToDragBecauseWeex = false;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.mUsingNewGuesture = c.a();
        }
    }

    public void setSecPageWrapper(oga ogaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44dba943", new Object[]{this, ogaVar});
        } else {
            this.secPageWrapper = ogaVar;
        }
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.mUsingNewGuesture) {
            if (!touchEnable(motionEvent)) {
                return false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.mIsUnableToDragBecauseWeex = false;
            }
            if (motionEvent == this.mFakeDown) {
                return true;
            }
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if (!onInterceptTouchEvent && this.mIsUnableToDragBecauseWeex && !canScroll(this, false, 0, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                dispatchTouchEvent(obtain);
                obtain.recycle();
                this.mFakeDown = MotionEvent.obtain(motionEvent);
                this.mFakeDown.setAction(0);
                dispatchTouchEvent(this.mFakeDown);
                this.mFakeDown.recycle();
                this.mFakeDown = null;
            }
            return onInterceptTouchEvent;
        }
        try {
            int action = motionEvent.getAction();
            if ((action == 0 || action == 2) && pullIntercept(this)) {
                return false;
            }
            if (touchEnable(motionEvent)) {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    private boolean pullIntercept(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1b4452", new Object[]{this, view})).booleanValue();
        }
        if ((view instanceof com.taobao.tao.flexbox.layoutmanager.view.b) && ((com.taobao.tao.flexbox.layoutmanager.view.b) view).canPullIntercept(com.taobao.tao.flexbox.layoutmanager.view.b.PULL_HORIZONTAL_DRAG)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (pullIntercept(childAt)) {
                        return true;
                    }
                    if (childAt instanceof com.taobao.tao.flexbox.layoutmanager.view.b) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.support.v4.view.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (this.mUsingNewGuesture && (view instanceof com.taobao.tao.flexbox.layoutmanager.view.b) && ((com.taobao.tao.flexbox.layoutmanager.view.b) view).canPullIntercept(com.taobao.tao.flexbox.layoutmanager.view.b.PULL_HORIZONTAL_DRAG)) {
            this.mIsUnableToDragBecauseWeex = true;
            return true;
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if (touchEnable(motionEvent)) {
                if (super.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    public void triggerTransitionStartEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1d66c", new Object[]{this});
        } else if (this.currentTrackNode == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("url", this.currentTrackNode.e(z.KEY_TRACK_TARGET));
            this.currentTrackNode.I().sendMessage(this.currentTrackNode, "pushvctransitionstart", null, hashMap, null);
        }
    }

    private boolean handleTouchEnable(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1fe50ba", new Object[]{this, motionEvent})).booleanValue();
        }
        ogb l = this.secPageWrapper.l();
        boolean a2 = oga.a(l);
        if (l == null || a2) {
            return false;
        }
        Pair<Boolean, Pair<Boolean, aa>> supportSecondPage = l.supportSecondPage(motionEvent);
        if (supportSecondPage != null) {
            this.touchInGesture = ((Boolean) supportSecondPage.first).booleanValue();
            if (supportSecondPage.second != null && ((Boolean) ((Pair) supportSecondPage.second).first).booleanValue()) {
                this.currentTrackNode = (aa) ((Pair) supportSecondPage.second).second;
            }
        }
        return true;
    }

    private boolean touchEnable(MotionEvent motionEvent) {
        oga ogaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe221202", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0 && !handleTouchEnable(motionEvent)) {
            this.touchInGesture = true;
        }
        if (getCurrentItem() == 0) {
            return this.touchInGesture;
        }
        return this.touchInGesture && (ogaVar = this.secPageWrapper) != null && ogaVar.c().dH_();
    }
}
