package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ceg;
import tb.cen;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public class ShopOptSwipeLayout extends PerceptionSizeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean alreadyDetectSwipeOrientation;
    private boolean alreadyIntercept;
    private boolean alreadySwipeHorizon;
    private boolean alreadyTouch;
    private boolean disableUpAndMoveEventReturn;
    private boolean downEventIntercept;
    private boolean enableInterceptAllEventByDownEventIntercept;
    private ruk<Boolean> expandedStatusGetter;
    private boolean forceIntercept;
    private boolean ignoreVerticalEvent;
    private Boolean inCenterContainerFlag;
    private int lastY;
    private boolean normalMode;
    private int scrollThreshold;
    private VelocityTracker speedDetector;
    private boolean startExpandedStatus;
    private boolean startScroll;
    private int startX;
    private int startY;
    private ShopSwipeListenerLayout.a swipeListener;

    static {
        kge.a(-1219481488);
    }

    public static /* synthetic */ Object ipc$super(ShopOptSwipeLayout shopOptSwipeLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public final ShopSwipeListenerLayout.a getSwipeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopSwipeListenerLayout.a) ipChange.ipc$dispatch("38e34b7a", new Object[]{this}) : this.swipeListener;
    }

    public final void setSwipeListener(ShopSwipeListenerLayout.a aVar) {
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

    public final boolean getEnableInterceptAllEventByDownEventIntercept() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("44ec44e", new Object[]{this})).booleanValue() : this.enableInterceptAllEventByDownEventIntercept;
    }

    public final void setEnableInterceptAllEventByDownEventIntercept(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00fdcd6", new Object[]{this, new Boolean(z)});
        } else {
            this.enableInterceptAllEventByDownEventIntercept = z;
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

    public final ruk<Boolean> getExpandedStatusGetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("4e771fab", new Object[]{this}) : this.expandedStatusGetter;
    }

    public final void setExpandedStatusGetter(ruk<Boolean> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e1862e7", new Object[]{this, rukVar});
        } else {
            this.expandedStatusGetter = rukVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
        VelocityTracker obtain = VelocityTracker.obtain();
        kotlin.jvm.internal.q.b(obtain, "obtain()");
        this.speedDetector = obtain;
        this.disableUpAndMoveEventReturn = cen.Companion.al();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
        VelocityTracker obtain = VelocityTracker.obtain();
        kotlin.jvm.internal.q.b(obtain, "obtain()");
        this.speedDetector = obtain;
        this.disableUpAndMoveEventReturn = cen.Companion.al();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
        VelocityTracker obtain = VelocityTracker.obtain();
        kotlin.jvm.internal.q.b(obtain, "obtain()");
        this.speedDetector = obtain;
        this.disableUpAndMoveEventReturn = cen.Companion.al();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopOptSwipeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.q.d(context, "context");
        this.scrollThreshold = 50;
        VelocityTracker obtain = VelocityTracker.obtain();
        kotlin.jvm.internal.q.b(obtain, "obtain()");
        this.speedDetector = obtain;
        this.disableUpAndMoveEventReturn = cen.Companion.al();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0136 A[Catch: Throwable -> 0x0198, TryCatch #0 {Throwable -> 0x0198, blocks: (B:54:0x009b, B:56:0x00a1, B:63:0x00b7, B:65:0x00bf, B:59:0x00aa, B:62:0x00b3, B:67:0x00c3, B:69:0x00c7, B:71:0x00cc, B:73:0x00dc, B:75:0x00e0, B:76:0x00e3, B:78:0x00e7, B:80:0x00eb, B:82:0x00f0, B:94:0x010e, B:96:0x0112, B:100:0x0125, B:104:0x012d, B:107:0x0136, B:109:0x013d, B:114:0x0149, B:116:0x014d, B:117:0x015a, B:119:0x0160, B:121:0x0164, B:122:0x0167, B:125:0x016c, B:127:0x0172, B:129:0x0176, B:131:0x0185, B:133:0x0189, B:134:0x018c, B:137:0x0191, B:112:0x0145, B:138:0x0193), top: B:147:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0149 A[Catch: Throwable -> 0x0198, TryCatch #0 {Throwable -> 0x0198, blocks: (B:54:0x009b, B:56:0x00a1, B:63:0x00b7, B:65:0x00bf, B:59:0x00aa, B:62:0x00b3, B:67:0x00c3, B:69:0x00c7, B:71:0x00cc, B:73:0x00dc, B:75:0x00e0, B:76:0x00e3, B:78:0x00e7, B:80:0x00eb, B:82:0x00f0, B:94:0x010e, B:96:0x0112, B:100:0x0125, B:104:0x012d, B:107:0x0136, B:109:0x013d, B:114:0x0149, B:116:0x014d, B:117:0x015a, B:119:0x0160, B:121:0x0164, B:122:0x0167, B:125:0x016c, B:127:0x0172, B:129:0x0176, B:131:0x0185, B:133:0x0189, B:134:0x018c, B:137:0x0191, B:112:0x0145, B:138:0x0193), top: B:147:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160 A[Catch: Throwable -> 0x0198, TryCatch #0 {Throwable -> 0x0198, blocks: (B:54:0x009b, B:56:0x00a1, B:63:0x00b7, B:65:0x00bf, B:59:0x00aa, B:62:0x00b3, B:67:0x00c3, B:69:0x00c7, B:71:0x00cc, B:73:0x00dc, B:75:0x00e0, B:76:0x00e3, B:78:0x00e7, B:80:0x00eb, B:82:0x00f0, B:94:0x010e, B:96:0x0112, B:100:0x0125, B:104:0x012d, B:107:0x0136, B:109:0x013d, B:114:0x0149, B:116:0x014d, B:117:0x015a, B:119:0x0160, B:121:0x0164, B:122:0x0167, B:125:0x016c, B:127:0x0172, B:129:0x0176, B:131:0x0185, B:133:0x0189, B:134:0x018c, B:137:0x0191, B:112:0x0145, B:138:0x0193), top: B:147:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0172 A[Catch: Throwable -> 0x0198, TryCatch #0 {Throwable -> 0x0198, blocks: (B:54:0x009b, B:56:0x00a1, B:63:0x00b7, B:65:0x00bf, B:59:0x00aa, B:62:0x00b3, B:67:0x00c3, B:69:0x00c7, B:71:0x00cc, B:73:0x00dc, B:75:0x00e0, B:76:0x00e3, B:78:0x00e7, B:80:0x00eb, B:82:0x00f0, B:94:0x010e, B:96:0x0112, B:100:0x0125, B:104:0x012d, B:107:0x0136, B:109:0x013d, B:114:0x0149, B:116:0x014d, B:117:0x015a, B:119:0x0160, B:121:0x0164, B:122:0x0167, B:125:0x016c, B:127:0x0172, B:129:0x0176, B:131:0x0185, B:133:0x0189, B:134:0x018c, B:137:0x0191, B:112:0x0145, B:138:0x0193), top: B:147:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185 A[Catch: Throwable -> 0x0198, TryCatch #0 {Throwable -> 0x0198, blocks: (B:54:0x009b, B:56:0x00a1, B:63:0x00b7, B:65:0x00bf, B:59:0x00aa, B:62:0x00b3, B:67:0x00c3, B:69:0x00c7, B:71:0x00cc, B:73:0x00dc, B:75:0x00e0, B:76:0x00e3, B:78:0x00e7, B:80:0x00eb, B:82:0x00f0, B:94:0x010e, B:96:0x0112, B:100:0x0125, B:104:0x012d, B:107:0x0136, B:109:0x013d, B:114:0x0149, B:116:0x014d, B:117:0x015a, B:119:0x0160, B:121:0x0164, B:122:0x0167, B:125:0x016c, B:127:0x0172, B:129:0x0176, B:131:0x0185, B:133:0x0189, B:134:0x018c, B:137:0x0191, B:112:0x0145, B:138:0x0193), top: B:147:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf A[Catch: Throwable -> 0x0198, TryCatch #0 {Throwable -> 0x0198, blocks: (B:54:0x009b, B:56:0x00a1, B:63:0x00b7, B:65:0x00bf, B:59:0x00aa, B:62:0x00b3, B:67:0x00c3, B:69:0x00c7, B:71:0x00cc, B:73:0x00dc, B:75:0x00e0, B:76:0x00e3, B:78:0x00e7, B:80:0x00eb, B:82:0x00f0, B:94:0x010e, B:96:0x0112, B:100:0x0125, B:104:0x012d, B:107:0x0136, B:109:0x013d, B:114:0x0149, B:116:0x014d, B:117:0x015a, B:119:0x0160, B:121:0x0164, B:122:0x0167, B:125:0x016c, B:127:0x0172, B:129:0x0176, B:131:0x0185, B:133:0x0189, B:134:0x018c, B:137:0x0191, B:112:0x0145, B:138:0x0193), top: B:147:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e A[Catch: Throwable -> 0x0198, TryCatch #0 {Throwable -> 0x0198, blocks: (B:54:0x009b, B:56:0x00a1, B:63:0x00b7, B:65:0x00bf, B:59:0x00aa, B:62:0x00b3, B:67:0x00c3, B:69:0x00c7, B:71:0x00cc, B:73:0x00dc, B:75:0x00e0, B:76:0x00e3, B:78:0x00e7, B:80:0x00eb, B:82:0x00f0, B:94:0x010e, B:96:0x0112, B:100:0x0125, B:104:0x012d, B:107:0x0136, B:109:0x013d, B:114:0x0149, B:116:0x014d, B:117:0x015a, B:119:0x0160, B:121:0x0164, B:122:0x0167, B:125:0x016c, B:127:0x0172, B:129:0x0176, B:131:0x0185, B:133:0x0189, B:134:0x018c, B:137:0x0191, B:112:0x0145, B:138:0x0193), top: B:147:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.ShopOptSwipeLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float getYSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a7058bb", new Object[]{this})).floatValue();
        }
        this.speedDetector.computeCurrentVelocity(1000);
        return this.speedDetector.getYVelocity();
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

    private final boolean ifSwipeHorizon(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8b2a369", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : Math.abs(this.startX - i) >= this.scrollThreshold;
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
        this.alreadySwipeHorizon = false;
        this.alreadyDetectSwipeOrientation = false;
        this.startExpandedStatus = false;
        this.downEventIntercept = false;
        this.speedDetector.clear();
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
