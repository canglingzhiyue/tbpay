package com.tmall.wireless.mirrorlife.base.listener;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class SoftHideKeyBoardUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ANDROID_PACKAGE = "android";
    private static final String DIMEN_TYPE = "dimen";
    private static final String IDENTIFIER_OF_NAVIGATION_BAR_HEIGHT = "navigation_bar_height";
    private static final String IDENTIFIER_OF_STATUS_BAR_HEIGHT = "status_bar_height";
    private int contentHeight;
    private FrameLayout.LayoutParams frameLayoutParams;
    private boolean isfirst = true;
    private SoftKeyboardListener listener;
    private View mChildOfContent;
    private int usableHeightPrevious;

    /* loaded from: classes9.dex */
    public interface SoftKeyboardListener {
        void a(boolean z);
    }

    static {
        kge.a(-1697785654);
    }

    public static /* synthetic */ boolean access$000(SoftHideKeyBoardUtil softHideKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e95299a0", new Object[]{softHideKeyBoardUtil})).booleanValue() : softHideKeyBoardUtil.isfirst;
    }

    public static /* synthetic */ boolean access$002(SoftHideKeyBoardUtil softHideKeyBoardUtil, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4596b67a", new Object[]{softHideKeyBoardUtil, new Boolean(z)})).booleanValue();
        }
        softHideKeyBoardUtil.isfirst = z;
        return z;
    }

    public static /* synthetic */ int access$102(SoftHideKeyBoardUtil softHideKeyBoardUtil, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60076fb7", new Object[]{softHideKeyBoardUtil, new Integer(i)})).intValue();
        }
        softHideKeyBoardUtil.contentHeight = i;
        return i;
    }

    public static /* synthetic */ View access$200(SoftHideKeyBoardUtil softHideKeyBoardUtil) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e59460", new Object[]{softHideKeyBoardUtil}) : softHideKeyBoardUtil.mChildOfContent;
    }

    public static /* synthetic */ void access$300(SoftHideKeyBoardUtil softHideKeyBoardUtil, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc674b1", new Object[]{softHideKeyBoardUtil, activity});
        } else {
            softHideKeyBoardUtil.possiblyResizeChildOfContent(activity);
        }
    }

    public static void assistActivity(Activity activity, SoftKeyboardListener softKeyboardListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf6aa91", new Object[]{activity, softKeyboardListener});
        } else {
            new SoftHideKeyBoardUtil(activity, softKeyboardListener);
        }
    }

    private SoftHideKeyBoardUtil(final Activity activity, SoftKeyboardListener softKeyboardListener) {
        this.listener = softKeyboardListener;
        this.mChildOfContent = ((FrameLayout) activity.findViewById(16908290)).getChildAt(0);
        this.mChildOfContent.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tmall.wireless.mirrorlife.base.listener.SoftHideKeyBoardUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                    return;
                }
                if (SoftHideKeyBoardUtil.access$000(SoftHideKeyBoardUtil.this)) {
                    SoftHideKeyBoardUtil softHideKeyBoardUtil = SoftHideKeyBoardUtil.this;
                    SoftHideKeyBoardUtil.access$102(softHideKeyBoardUtil, SoftHideKeyBoardUtil.access$200(softHideKeyBoardUtil).getHeight());
                    SoftHideKeyBoardUtil.access$002(SoftHideKeyBoardUtil.this, false);
                }
                SoftHideKeyBoardUtil.access$300(SoftHideKeyBoardUtil.this, activity);
            }
        });
        this.frameLayoutParams = (FrameLayout.LayoutParams) this.mChildOfContent.getLayoutParams();
    }

    public static int getStatusBarHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("226dbd42", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier(IDENTIFIER_OF_STATUS_BAR_HEIGHT, DIMEN_TYPE, "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    private void possiblyResizeChildOfContent(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a063b8", new Object[]{this, activity});
            return;
        }
        int computeUsableHeight = computeUsableHeight();
        if (computeUsableHeight == this.usableHeightPrevious) {
            return;
        }
        int height = this.mChildOfContent.getRootView().getHeight();
        int i = height - computeUsableHeight;
        if (i > height / 4) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.frameLayoutParams.height = (height - i) + getStatusBarHeight(activity);
            } else {
                this.frameLayoutParams.height = height - i;
            }
        } else {
            this.frameLayoutParams.height = this.contentHeight;
        }
        this.mChildOfContent.requestLayout();
        SoftKeyboardListener softKeyboardListener = this.listener;
        if (softKeyboardListener != null) {
            if (computeUsableHeight >= this.usableHeightPrevious) {
                z = false;
            }
            softKeyboardListener.a(z);
        }
        this.usableHeightPrevious = computeUsableHeight;
    }

    private int computeUsableHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9008d390", new Object[]{this})).intValue();
        }
        Rect rect = new Rect();
        this.mChildOfContent.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }
}
