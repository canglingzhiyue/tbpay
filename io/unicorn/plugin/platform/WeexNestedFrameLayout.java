package io.unicorn.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import tb.kge;

/* loaded from: classes9.dex */
public class WeexNestedFrameLayout extends FrameLayout {
    private static final String TAG = "WeexNestedFrameLayout";
    public boolean isIntercept;
    private boolean isInterceptRoll;
    private boolean isMoveSlideUp;
    public boolean isPlatformListCanScroll;
    public boolean isWeex2Scrolling;
    private float mDispatchDownY;
    private float mDownX;
    private float mDownY;
    private boolean mIsActionMove;

    static {
        kge.a(1600678847);
    }

    public WeexNestedFrameLayout(Context context) {
        super(context);
        this.isPlatformListCanScroll = false;
        this.isWeex2Scrolling = false;
        this.isIntercept = false;
        this.mIsActionMove = false;
        this.isInterceptRoll = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r0 != 3) goto L9;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 0
            if (r0 == 0) goto L3d
            r2 = 1
            if (r0 == r2) goto L35
            r3 = 2
            if (r0 == r3) goto L11
            r2 = 3
            if (r0 == r2) goto L35
            goto L49
        L11:
            boolean r0 = r4.isInterceptRoll
            if (r0 == 0) goto L16
            return r1
        L16:
            r4.mIsActionMove = r2
            r4.isWeex2Scrolling = r2
            boolean r0 = r4.isPlatformListCanScroll
            if (r0 == 0) goto L25
            boolean r0 = r4.isIntercept
            if (r0 == 0) goto L25
            r5.setAction(r1)
        L25:
            float r0 = r5.getRawY()
            float r3 = r4.mDispatchDownY
            float r0 = r0 - r3
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L32
            r1 = 1
        L32:
            r4.isMoveSlideUp = r1
            goto L49
        L35:
            boolean r0 = r4.isInterceptRoll
            if (r0 == 0) goto L3a
            return r1
        L3a:
            r4.mIsActionMove = r1
            goto L49
        L3d:
            float r0 = r5.getRawY()
            r4.mDispatchDownY = r0
            r4.mIsActionMove = r1
            r4.isWeex2Scrolling = r1
            r4.isInterceptRoll = r1
        L49:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.plugin.platform.WeexNestedFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isActionMove() {
        return this.mIsActionMove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isMoveSlideUp() {
        return this.isMoveSlideUp;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
        } else if ((action == 1 || action == 2) && this.mDownX == motionEvent.getRawX() && this.mDownY == motionEvent.getRawY()) {
            return false;
        }
        if (this.isPlatformListCanScroll || !this.isWeex2Scrolling) {
            this.isIntercept = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.isIntercept = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setInterceptRoll(boolean z) {
        this.isInterceptRoll = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPlatformListCanScroll(boolean z) {
        this.isPlatformListCanScroll = z;
    }
}
