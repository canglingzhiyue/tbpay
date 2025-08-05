package com.taobao.android.weex_uikit.widget.input;

import android.view.View;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.kge;

/* loaded from: classes6.dex */
public class b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINode f16178a;

    static {
        kge.a(-1218283416);
        kge.a(-1201612728);
    }

    public b(UINode uINode) {
        this.f16178a = uINode;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        a.a(view.getContext(), (EditText) view);
        i.a((String) this.f16178a.getAttribute("max"), (String) this.f16178a.getAttribute("min"), this.f16178a);
    }
}
