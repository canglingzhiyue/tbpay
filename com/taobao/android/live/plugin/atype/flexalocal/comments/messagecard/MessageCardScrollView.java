package com.taobao.android.live.plugin.atype.flexalocal.comments.messagecard;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class MessageCardScrollView extends NestedScrollView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(977746402);
    }

    public static /* synthetic */ Object ipc$super(MessageCardScrollView messageCardScrollView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MessageCardScrollView(Context context) {
        this(context, null);
    }

    public MessageCardScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageCardScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }
}
