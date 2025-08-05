package tb;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.view.StaticLayoutView;

/* loaded from: classes8.dex */
public class oft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(View view);
    }

    static {
        kge.a(-13740061);
    }

    public static boolean a(View view, Layout layout, Spanned spanned, Class<? extends a> cls, MotionEvent motionEvent, boolean z) {
        a[] aVarArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb09b93f", new Object[]{view, layout, spanned, cls, motionEvent, new Boolean(z)})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int y = ((int) motionEvent.getY()) - view.getPaddingTop();
            int scrollX = x + view.getScrollX();
            int scrollY = y + view.getScrollY();
            if (z) {
                aVarArr = (a[]) spanned.getSpans(0, spanned.length(), cls);
            } else {
                int a2 = a(view, layout, scrollX, layout.getLineForVertical(scrollY));
                aVarArr = (a[]) spanned.getSpans(a2, a2, cls);
            }
            if (aVarArr.length != 0) {
                if (action == 1) {
                    aVarArr[0].a(view);
                } else if (spanned instanceof Spannable) {
                    Selection.setSelection((Spannable) spanned, spanned.getSpanStart(aVarArr[0]), spanned.getSpanEnd(aVarArr[0]));
                }
                return true;
            } else if (spanned instanceof Spannable) {
                Selection.removeSelection((Spannable) spanned);
            }
        }
        return false;
    }

    public static boolean a(View view, Layout layout, Spanned spanned, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c873992", new Object[]{view, layout, spanned, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int a2 = a(view, layout, (((int) motionEvent.getX()) - view.getPaddingLeft()) + view.getScrollX(), Math.min(layout.getLineCount() - 1, layout.getLineForVertical((((int) motionEvent.getY()) - view.getPaddingTop()) + view.getScrollY())));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(a2, a2, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(view);
                } else if (spanned instanceof Spannable) {
                    Selection.setSelection((Spannable) spanned, spanned.getSpanStart(clickableSpanArr[0]), spanned.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            } else if (spanned instanceof Spannable) {
                Selection.removeSelection((Spannable) spanned);
            }
        }
        return false;
    }

    private static int a(View view, Layout layout, int i, int i2) {
        int paddingLeft;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46a0d35e", new Object[]{view, layout, new Integer(i), new Integer(i2)})).intValue();
        }
        if (view.getWidth() > layout.getWidth() && (view instanceof StaticLayoutView)) {
            int textAlignment = ((StaticLayoutView) view).getTextAlignment();
            if (textAlignment == 1 || textAlignment == 17) {
                paddingLeft = view.getPaddingLeft() + ((((view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight()) - layout.getWidth()) / 2);
            } else if (textAlignment != 8388613) {
                paddingLeft = view.getPaddingLeft();
            } else {
                paddingLeft = (view.getWidth() - view.getPaddingRight()) - layout.getWidth();
            }
            i -= paddingLeft;
        }
        try {
            return layout.getOffsetForHorizontal(i2, i);
        } catch (Throwable th) {
            th.printStackTrace();
            return layout.getLineEnd(i2);
        }
    }
}
