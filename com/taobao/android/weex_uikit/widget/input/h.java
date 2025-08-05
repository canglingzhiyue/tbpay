package com.taobao.android.weex_uikit.widget.input;

import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINode f16190a;

    static {
        kge.a(1917527303);
        kge.a(-1201612728);
    }

    public h(UINode uINode) {
        this.f16190a = uINode;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        a.a(view.getContext(), (EditText) view);
        i.a(this.f16190a);
    }
}
