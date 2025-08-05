package com.alipay.android.msp.ui.widget.input.watcher;

import android.text.Editable;
import android.text.TextWatcher;
import com.alipay.android.msp.ui.widget.input.PasswordInputPlugin;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SimplePasswordTextWatcher implements TextWatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5096a = false;
    private PasswordInputPlugin b;
    private int c;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public SimplePasswordTextWatcher(PasswordInputPlugin passwordInputPlugin) {
        this.b = passwordInputPlugin;
        this.c = passwordInputPlugin.getBusinessId();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            return;
        }
        int length = editable.length();
        for (int i = 0; i < length; i++) {
            if (editable.charAt(i) != '0') {
                this.f5096a = true;
                editable.replace(i, i + 1, "0");
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (!this.f5096a) {
            try {
                this.b.getPasswordService().onTextChanged(this.c, charSequence.toString(), i, i2, i3);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        this.f5096a = false;
    }
}
