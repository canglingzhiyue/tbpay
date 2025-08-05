package com.ali.user.open.core.webview;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AUProgressDialog extends ProgressDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIndeterminate;
    private CharSequence mMessage;
    private TextView mMessageView;
    private ProgressBar mProgress;
    private boolean mProgressVisiable;

    static {
        kge.a(-806515793);
    }

    public static /* synthetic */ Object ipc$super(AUProgressDialog aUProgressDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public AUProgressDialog(Context context) {
        super(context);
    }

    public AUProgressDialog(Context context, int i) {
        super(context, i);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.member_sdk_progress_dialog);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawableResource(17170445);
        }
        this.mProgress = (ProgressBar) findViewById(16908301);
        this.mMessageView = (TextView) findViewById(R.id.aliuser_toast_message);
        setMessageAndView();
        setIndeterminate(this.mIndeterminate);
    }

    private void setMessageAndView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72030d1e", new Object[]{this});
            return;
        }
        this.mMessageView.setText(this.mMessage);
        CharSequence charSequence = this.mMessage;
        int i = 8;
        if (charSequence == null || "".equals(charSequence)) {
            this.mMessageView.setVisibility(8);
        }
        ProgressBar progressBar = this.mProgress;
        if (this.mProgressVisiable) {
            i = 0;
        }
        progressBar.setVisibility(i);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
        } else {
            this.mMessage = charSequence;
        }
    }

    public void setProgressVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a59b7b", new Object[]{this, new Boolean(z)});
        } else {
            this.mProgressVisiable = z;
        }
    }

    @Override // android.app.ProgressDialog
    public void setIndeterminate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b47354", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressBar progressBar = this.mProgress;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.mIndeterminate = z;
        }
    }
}
