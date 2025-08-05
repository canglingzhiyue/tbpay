package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public class ShopSwipeListenerLayout extends PerceptionSizeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean alreadyIntercept;
    private boolean alreadyTouch;
    private boolean forceIntercept;
    private boolean ignoreVerticalEvent;
    private Boolean inCenterContainerFlag;
    private Boolean isFirstHorizontalScroll;
    private int lastY;
    private boolean normalMode;
    private int scrollThreshold;
    private boolean startScroll;
    private int startX;
    private int startY;
    private a swipeListener;

    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0139a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(108142994);
            }

            public static void a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("609ea543", new Object[]{aVar});
                } else {
                    kotlin.jvm.internal.q.d(aVar, "this");
                }
            }

            public static void a(a aVar, MotionEvent event) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3ed4198", new Object[]{aVar, event});
                    return;
                }
                kotlin.jvm.internal.q.d(aVar, "this");
                kotlin.jvm.internal.q.d(event, "event");
            }

            public static void a(a aVar, View fromTargetView, MotionEvent event, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("baa8777f", new Object[]{aVar, fromTargetView, event, new Integer(i)});
                    return;
                }
                kotlin.jvm.internal.q.d(aVar, "this");
                kotlin.jvm.internal.q.d(fromTargetView, "fromTargetView");
                kotlin.jvm.internal.q.d(event, "event");
            }

            public static void b(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a2b5d2a2", new Object[]{aVar});
                } else {
                    kotlin.jvm.internal.q.d(aVar, "this");
                }
            }

            public static void b(a aVar, View fromTargetView, MotionEvent event, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd8d169e", new Object[]{aVar, fromTargetView, event, new Integer(i)});
                    return;
                }
                kotlin.jvm.internal.q.d(aVar, "this");
                kotlin.jvm.internal.q.d(fromTargetView, "fromTargetView");
                kotlin.jvm.internal.q.d(event, "event");
            }

            public static boolean c(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e4cd0005", new Object[]{aVar})).booleanValue();
                }
                kotlin.jvm.internal.q.d(aVar, "this");
                return false;
            }
        }

        void onSwipeCancel(MotionEvent motionEvent);

        void onSwipeDown();

        void onSwipeDown(View view, MotionEvent motionEvent, int i);

        void onSwipeUp();

        void onSwipeUp(View view, MotionEvent motionEvent, int i);
    }

    static {
        kge.a(2007084057);
    }

    public static /* synthetic */ Object ipc$super(ShopSwipeListenerLayout shopSwipeListenerLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final a getSwipeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("38e34b7a", new Object[]{this}) : this.swipeListener;
    }

    public final void setSwipeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f4ebf8", new Object[]{this, aVar});
        } else {
            this.swipeListener = aVar;
        }
    }

    public final Boolean getInCenterContainerFlag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("35c1d4a1", new Object[]{this}) : this.inCenterContainerFlag;
    }

    public final void setInCenterContainerFlag(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac93bb5", new Object[]{this, bool});
        } else {
            this.inCenterContainerFlag = bool;
        }
    }

    public final boolean getNormalMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("34ba4bab", new Object[]{this})).booleanValue() : this.normalMode;
    }

    public final void setNormalMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99667581", new Object[]{this, new Boolean(z)});
        } else {
            this.normalMode = z;
        }
    }

    public final boolean getIgnoreVerticalEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e9e9f67", new Object[]{this})).booleanValue() : this.ignoreVerticalEvent;
    }

    public final void setIgnoreVerticalEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f502c8dd", new Object[]{this, new Boolean(z)});
        } else {
            this.ignoreVerticalEvent = z;
        }
    }

    public final boolean getAlreadyTouch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce8e6648", new Object[]{this})).booleanValue() : this.alreadyTouch;
    }

    public final void setAlreadyTouch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ded52184", new Object[]{this, new Boolean(z)});
        } else {
            this.alreadyTouch = z;
        }
    }

    public final Boolean isFirstHorizontalScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("fff002db", new Object[]{this}) : this.isFirstHorizontalScroll;
    }

    public final void setFirstHorizontalScroll(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f48c4e7", new Object[]{this, bool});
        } else {
            this.isFirstHorizontalScroll = bool;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopSwipeListenerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.alreadyTouch = true;
        if (this.normalMode) {
            return super.dispatchTouchEvent(motionEvent);
        }
        boolean z = this.alreadyIntercept;
        if (motionEvent != null && motionEvent.getAction() == 1) {
            clearStatus();
            a aVar3 = this.swipeListener;
            if (aVar3 != null) {
                aVar3.onSwipeCancel(motionEvent);
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 3) {
            clearStatus();
            a aVar4 = this.swipeListener;
            if (aVar4 != null) {
                aVar4.onSwipeCancel(motionEvent);
            }
        }
        if (this.forceIntercept || z) {
            return true;
        }
        if (motionEvent == null) {
            return false;
        }
        try {
            if (motionEvent.getAction() == 0) {
                clearStatus();
                if (!inCenterContainer()) {
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
            if (this.ignoreVerticalEvent) {
                return super.dispatchTouchEvent(motionEvent);
            }
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (motionEvent.getAction() == 2) {
                if (!this.startScroll) {
                    startScroll(rawX, rawY);
                } else if (this.isFirstHorizontalScroll == null) {
                    this.isFirstHorizontalScroll = Boolean.valueOf(Math.abs(rawX - this.startX) > Math.abs(rawY - this.startY));
                }
                boolean ifSwipeDownWithLastPosition = ifSwipeDownWithLastPosition(rawX, rawY);
                boolean ifSwipeDown = ifSwipeDown(rawX, rawY);
                if (ifSwipeDownWithLastPosition && (aVar2 = this.swipeListener) != null) {
                    aVar2.onSwipeDown(this, motionEvent, Math.abs(this.lastY - rawY));
                }
                if (ifSwipeDown(rawX, rawY)) {
                    a aVar5 = this.swipeListener;
                    if (aVar5 != null) {
                        aVar5.onSwipeDown();
                    }
                    if (this.forceIntercept) {
                        return true;
                    }
                }
                if (!ifSwipeDown && !ifSwipeDownWithLastPosition) {
                    boolean ifSwipeUpWithLastPosition = ifSwipeUpWithLastPosition(rawX, rawY);
                    boolean ifSwipeUp = ifSwipeUp(rawX, rawY);
                    if (ifSwipeUpWithLastPosition && (aVar = this.swipeListener) != null) {
                        aVar.onSwipeUp(this, motionEvent, Math.abs(this.lastY - rawY));
                    }
                    if (ifSwipeUp) {
                        a aVar6 = this.swipeListener;
                        if (aVar6 != null) {
                            aVar6.onSwipeUp();
                        }
                        if (this.forceIntercept) {
                            return true;
                        }
                    }
                    if (ifSwipeUp || ifSwipeUpWithLastPosition) {
                        this.lastY = rawY;
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                this.lastY = rawY;
                return super.dispatchTouchEvent(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final boolean getStartScroll() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("59871ca4", new Object[]{this})).booleanValue() : this.startScroll;
    }

    public final void setStartScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b59bf40", new Object[]{this, new Boolean(z)});
        } else {
            this.startScroll = z;
        }
    }

    public final int getStartX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ff8f9a6", new Object[]{this})).intValue() : this.startX;
    }

    public final void setStartX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c2324", new Object[]{this, new Integer(i)});
        } else {
            this.startX = i;
        }
    }

    public final int getStartY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90071127", new Object[]{this})).intValue() : this.startY;
    }

    public final void setStartY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740fbc3", new Object[]{this, new Integer(i)});
        } else {
            this.startY = i;
        }
    }

    public final int getLastY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76f8bcc7", new Object[]{this})).intValue() : this.lastY;
    }

    public final void setLastY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96439ebb", new Object[]{this, new Integer(i)});
        } else {
            this.lastY = i;
        }
    }

    private final boolean ifSwipeUp(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25ad30c3", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.startY;
        return i3 > i2 && Math.abs(i2 - i3) > this.scrollThreshold;
    }

    private final boolean ifSwipeDown(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88538a4a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.startY;
        return i3 < i2 && Math.abs(i2 - i3) > this.scrollThreshold;
    }

    private final boolean ifSwipeUpWithLastPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43c42ae8", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.lastY;
        return i3 > i2 && Math.abs(i2 - i3) > 1;
    }

    private final boolean ifSwipeDownWithLastPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("322c966f", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int i3 = this.lastY;
        return i3 < i2 && Math.abs(i2 - i3) > 1;
    }

    private final void startScroll(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10c4db6", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.startX = i;
        this.startY = i2;
        this.lastY = i2;
        this.startScroll = true;
    }

    private final void clearStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0cbe1a6", new Object[]{this});
            return;
        }
        this.startScroll = false;
        this.startX = 0;
        this.startY = 0;
        this.lastY = 0;
        this.alreadyIntercept = false;
        this.ignoreVerticalEvent = false;
        this.isFirstHorizontalScroll = null;
    }

    public final void setScrollThreshold(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8293d980", new Object[]{this, new Integer(i)});
            return;
        }
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        ceg.Companion.b(kotlin.jvm.internal.q.a("touch slop : ", (Object) Integer.valueOf(scaledTouchSlop)));
        if (i <= scaledTouchSlop) {
            i = scaledTouchSlop;
        }
        this.scrollThreshold = i;
    }

    public boolean inCenterContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fa114d2", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.inCenterContainerFlag;
        if (bool == null) {
            return true;
        }
        kotlin.jvm.internal.q.a(bool);
        return bool.booleanValue();
    }

    public final void forceInterceptAllTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501f5008", new Object[]{this, new Boolean(z)});
            return;
        }
        this.forceIntercept = z;
        if (z) {
            this.alreadyIntercept = true;
        } else {
            this.alreadyIntercept = false;
        }
    }

    public final boolean isForceIntercept() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f0c01ec", new Object[]{this})).booleanValue() : this.forceIntercept;
    }
}
