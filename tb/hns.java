package tb;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class hns extends BaseMovementMethod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static hns f28745a;

    static {
        kge.a(-497208219);
    }

    public static /* synthetic */ Object ipc$super(hns hnsVar, String str, Object... objArr) {
        if (str.hashCode() == 1600562927) {
            return new Boolean(super.onTouchEvent((TextView) objArr[0], (Spannable) objArr[1], (MotionEvent) objArr[2]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hns() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.TitleClickLinkMovementMethod");
    }

    public static hns a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hns) ipChange.ipc$dispatch("f059691", new Object[0]);
        }
        if (f28745a == null) {
            f28745a = new hns();
        }
        return f28745a;
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
