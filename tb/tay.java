package tb;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class tay extends BaseMovementMethod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static tay f34006a;

    static {
        kge.a(-521106285);
    }

    public static /* synthetic */ Object ipc$super(tay tayVar, String str, Object... objArr) {
        if (str.hashCode() == 1600562927) {
            return new Boolean(super.onTouchEvent((TextView) objArr[0], (Spannable) objArr[1], (MotionEvent) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static tay a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tay) ipChange.ipc$dispatch("f0adaf2", new Object[0]);
        }
        if (f34006a == null) {
            f34006a = new tay();
        }
        return f34006a;
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f66a6ef", new Object[]{this, textView, spannable, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
            int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
            int scrollX = x + textView.getScrollX();
            int scrollY = y + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    clickableSpanArr[0].onClick(textView);
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
