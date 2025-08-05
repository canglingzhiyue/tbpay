package com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.d;
import tb.kge;

/* loaded from: classes5.dex */
public class ClickableView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d mClickUtil;

    static {
        kge.a(-853347259);
    }

    public static /* synthetic */ Object ipc$super(ClickableView clickableView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ClickableView(Context context) {
        super(context);
        init();
    }

    public ClickableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ClickableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setClickable(true);
        }
    }

    public void setOnSingleClickListener(d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5045456f", new Object[]{this, aVar});
        } else {
            this.mClickUtil = new d(getContext(), aVar);
        }
    }

    public void setOnMultiClickListener(d.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83bbe31f", new Object[]{this, bVar});
        } else {
            this.mClickUtil = new d(getContext(), bVar);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            d dVar2 = this.mClickUtil;
            if (dVar2 != null) {
                dVar2.a(motionEvent.getX(), motionEvent.getY());
            }
        } else if ((action == 1 || action == 3) && (dVar = this.mClickUtil) != null) {
            dVar.b(motionEvent.getX(), motionEvent.getY());
        }
        return super.onTouchEvent(motionEvent);
    }
}
