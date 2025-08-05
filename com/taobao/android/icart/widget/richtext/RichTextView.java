package com.taobao.android.icart.widget.richtext;

import android.content.Context;
import android.graphics.Canvas;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class RichTextView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private e mRichTextRender;

    static {
        kge.a(971941026);
    }

    public static /* synthetic */ Object ipc$super(RichTextView richTextView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RichTextView(Context context) {
        super(context);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : handleSpanTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        e eVar = this.mRichTextRender;
        if (eVar == null) {
            return;
        }
        eVar.a(canvas);
    }

    private boolean handleSpanTouchEvent(MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba22d4ed", new Object[]{this, motionEvent})).booleanValue();
        }
        int a2 = this.mRichTextRender.a(motionEvent.getX(), motionEvent.getY());
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.mRichTextRender.a(a2, a2, ClickableSpan.class);
        if (clickableSpanArr != null) {
            z = false;
            for (ClickableSpan clickableSpan : clickableSpanArr) {
                z = z || clickableSpan != null;
            }
        } else {
            z = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return z;
        }
        if (action != 1 || !z) {
            return false;
        }
        for (ClickableSpan clickableSpan2 : clickableSpanArr) {
            clickableSpan2.onClick(this);
        }
        return true;
    }

    public e getRichTextRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e41aca38", new Object[]{this}) : this.mRichTextRender;
    }

    public void setRichTextRender(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae7d3e6", new Object[]{this, eVar});
        } else {
            this.mRichTextRender = eVar;
        }
    }
}
