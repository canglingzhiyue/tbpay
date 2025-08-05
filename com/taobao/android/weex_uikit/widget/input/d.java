package com.taobao.android.weex_uikit.widget.input;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.input.a;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements TextWatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINode f16185a;
    private a.C0622a b;
    private int c;

    static {
        kge.a(-1394817379);
        kge.a(1670231405);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public d(UINode uINode, a.C0622a c0622a) {
        this.f16185a = uINode;
        this.b = c0622a;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        EditText editText = (EditText) this.f16185a.getMountContent();
        if (editText == null || this.b.f16177a == null) {
            return;
        }
        String a2 = this.b.f16177a.a(this.b.f16177a.b(charSequence.toString()));
        if (!a2.equals(charSequence.toString()) && (i4 = this.c) < 3) {
            this.c = i4 + 1;
            int length = this.b.f16177a.a(this.b.f16177a.b(charSequence.subSequence(0, editText.getSelectionStart()).toString())).length();
            editText.setText(a2);
            editText.setSelection(length);
            return;
        }
        this.c = 0;
    }
}
