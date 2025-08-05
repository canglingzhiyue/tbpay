package com.taobao.android.dinamicx.expression.event;

import android.text.Editable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXTextInputEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Editable text;

    static {
        kge.a(-833567126);
    }

    public Editable getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Editable) ipChange.ipc$dispatch("5d546415", new Object[]{this}) : this.text;
    }

    public void setText(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae5e145", new Object[]{this, editable});
        } else {
            this.text = editable;
        }
    }

    public DXTextInputEvent(long j) {
        super(j);
    }
}
