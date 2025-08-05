package com.alipay.mobile.verifyidentity.ui.helper;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class APGenericProgressDialog extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f6088a;
    private TextView b;
    private CharSequence c;
    private boolean d;
    private boolean e;

    public static /* synthetic */ Object ipc$super(APGenericProgressDialog aPGenericProgressDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public APGenericProgressDialog(Context context) {
        super(context);
    }

    public APGenericProgressDialog(Context context, int i) {
        super(context, i);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.generic_progress_dialog);
        this.f6088a = (ProgressBar) findViewById(16908301);
        this.b = (TextView) findViewById(R.id.message);
        this.b.setText(this.c);
        CharSequence charSequence = this.c;
        int i = 8;
        if (charSequence == null || "".equals(charSequence)) {
            this.b.setVisibility(8);
        }
        ProgressBar progressBar = this.f6088a;
        if (this.e) {
            i = 0;
        }
        progressBar.setVisibility(i);
        setIndeterminate(this.d);
    }

    @Override // android.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
        } else {
            this.c = charSequence;
        }
    }

    public void setProgressVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a59b7b", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void setIndeterminate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b47354", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressBar progressBar = this.f6088a;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.d = z;
        }
    }
}
