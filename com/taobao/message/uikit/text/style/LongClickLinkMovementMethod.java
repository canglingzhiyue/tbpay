package com.taobao.message.uikit.text.style;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.UIHandler;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes7.dex */
public class LongClickLinkMovementMethod extends LinkMovementMethod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long DOUBLE_TAP_TIME = 300;
    private static final long LONG_CLICK_TIME = 500;
    private static final long TAP_TIME = 100;
    private static LongClickLinkMovementMethod instance;
    private CheckForLongClick checkForLongClick;
    private CheckForTap checkForTap;
    private boolean doubleTap;
    private Long lastClickTime = 0L;
    private int lastX = 0;
    private int lastY = 0;
    private PerformClick performClick;

    public static /* synthetic */ Object ipc$super(LongClickLinkMovementMethod longClickLinkMovementMethod, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1284523358);
        instance = new LongClickLinkMovementMethod();
    }

    private LongClickLinkMovementMethod() {
    }

    public static LongClickLinkMovementMethod getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LongClickLinkMovementMethod) ipChange.ipc$dispatch("39147fa5", new Object[0]) : instance;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f66a6ef", new Object[]{this, textView, spannable, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.lastX = x;
            this.lastY = y;
            Math.abs(x - this.lastX);
            Math.abs(y - this.lastY);
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            LongClickableSpan[] longClickableSpanArr = (LongClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, LongClickableSpan.class);
            if (longClickableSpanArr.length != 0) {
                if (action == 1) {
                    textView.setPressed(false);
                    if (this.doubleTap) {
                        this.doubleTap = false;
                        removeCallbacks();
                        longClickableSpanArr[0].onDoubleClick(textView);
                    } else if (System.currentTimeMillis() - this.lastClickTime.longValue() < 500) {
                        removeCallbacks();
                        this.performClick = new PerformClick();
                        PerformClick performClick = this.performClick;
                        performClick.span = longClickableSpanArr[0];
                        performClick.widget = new WeakReference<>(textView);
                        pendingPerformClick();
                    }
                } else if (action == 0) {
                    if (System.currentTimeMillis() - this.lastClickTime.longValue() < 300) {
                        cancelPerformClick();
                        this.doubleTap = true;
                    }
                    this.lastClickTime = Long.valueOf(System.currentTimeMillis());
                    if (this.checkForLongClick == null) {
                        this.checkForLongClick = new CheckForLongClick();
                    }
                    if (this.checkForTap == null) {
                        this.checkForTap = new CheckForTap();
                    }
                    Selection.setSelection(spannable, spannable.getSpanStart(longClickableSpanArr[0]), spannable.getSpanEnd(longClickableSpanArr[0]));
                    this.checkForLongClick.clickTime = this.lastClickTime.longValue();
                    this.checkForLongClick.widget = new WeakReference<>(textView);
                    this.checkForLongClick.span = longClickableSpanArr[0];
                    this.checkForTap.touchDownTime = this.lastClickTime.longValue();
                    this.checkForTap.widget = new WeakReference<>(textView);
                    UIHandler.postDelayed(this.checkForTap, 100L);
                    UIHandler.postDelayed(this.checkForLongClick, 500L);
                }
                return true;
            }
            Selection.removeSelection(spannable);
        } else if (action == 3 || action == 4) {
            textView.setPressed(false);
            removeCallbacks();
        }
        return false;
    }

    private void removeCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58438431", new Object[]{this});
            return;
        }
        CheckForLongClick checkForLongClick = this.checkForLongClick;
        if (checkForLongClick != null) {
            UIHandler.removeCallbacks(checkForLongClick);
        }
        CheckForTap checkForTap = this.checkForTap;
        if (checkForTap != null) {
            UIHandler.removeCallbacks(checkForTap);
        }
        this.checkForTap = null;
        this.checkForLongClick = null;
        this.performClick = null;
    }

    private void pendingPerformClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead1fb65", new Object[]{this});
            return;
        }
        PerformClick performClick = this.performClick;
        if (performClick == null) {
            return;
        }
        UIHandler.postDelayed(performClick, 100L);
    }

    private void cancelPerformClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d37a48", new Object[]{this});
            return;
        }
        PerformClick performClick = this.performClick;
        if (performClick == null) {
            return;
        }
        UIHandler.removeCallbacks(performClick);
    }

    /* loaded from: classes7.dex */
    public static class CheckForLongClick implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long clickTime;
        public LongClickableSpan span;
        public WeakReference<TextView> widget;

        static {
            kge.a(-1966766875);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (System.currentTimeMillis() - this.clickTime < 500 || (textView = this.widget.get()) == null) {
            } else {
                this.span.onLongClick(textView);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class CheckForTap implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long touchDownTime;
        public WeakReference<TextView> widget;

        static {
            kge.a(1764529884);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (System.currentTimeMillis() - this.touchDownTime < 100 || (textView = this.widget.get()) == null) {
            } else {
                textView.setPressed(true);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class PerformClick implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public LongClickableSpan span;
        public WeakReference<TextView> widget;

        static {
            kge.a(929530957);
            kge.a(-1390502639);
        }

        private PerformClick() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TextView textView = this.widget.get();
            if (textView == null) {
                return;
            }
            this.span.onClick(textView);
        }
    }

    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        this.checkForTap.widget.clear();
        this.checkForTap.widget = null;
    }
}
