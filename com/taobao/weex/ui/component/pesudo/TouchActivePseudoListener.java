package com.taobao.weex.ui.component.pesudo;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TouchActivePseudoListener implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsConsumeOnTouch;
    private OnActivePseudoListner mOnActivePseudoListner;

    static {
        kge.a(-895842276);
        kge.a(-468432129);
    }

    public TouchActivePseudoListener(OnActivePseudoListner onActivePseudoListner, boolean z) {
        this.mOnActivePseudoListner = onActivePseudoListner;
        this.mIsConsumeOnTouch = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (this.mOnActivePseudoListner != null) {
            if (action == 0 || action == 5) {
                this.mOnActivePseudoListner.updateActivePseudo(true);
            } else if (action == 3 || action == 1 || action == 6) {
                this.mOnActivePseudoListner.updateActivePseudo(false);
            }
        }
        return this.mIsConsumeOnTouch;
    }
}
