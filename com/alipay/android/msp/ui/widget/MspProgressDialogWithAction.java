package com.alipay.android.msp.ui.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class MspProgressDialogWithAction extends AlertDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f5058a;
    private FrameLayout b;
    private LinearLayout c;
    private TextView d;
    private CharSequence e;
    private boolean f;
    private boolean g;
    private ImageView h;
    private int i;
    private View.OnClickListener j;
    private Context k;

    public static /* synthetic */ Object ipc$super(MspProgressDialogWithAction mspProgressDialogWithAction, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MspProgressDialogWithAction(Context context) {
        super(context);
        this.f = true;
        this.k = context;
    }

    public MspProgressDialogWithAction(Context context, int i) {
        super(context, i);
        this.f = true;
        this.k = context;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        init();
        this.d.setText(this.e);
        CharSequence charSequence = this.e;
        int i = 8;
        if (charSequence == null || "".equals(charSequence)) {
            this.d.setVisibility(8);
        }
        ProgressBar progressBar = this.f5058a;
        if (this.f) {
            i = 0;
        }
        progressBar.setVisibility(i);
        setIndeterminate(this.g);
        if (Build.VERSION.SDK_INT < 21 || getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setContentView(R.layout.au_progress_dialog_with_action);
        this.f5058a = (ProgressBar) findViewById(R.id.progress);
        this.d = (TextView) findViewById(R.id.progress_message);
        this.b = (FrameLayout) findViewById(R.id.layout_bg);
        this.c = (LinearLayout) findViewById(R.id.body);
        this.h = (ImageView) findViewById(R.id.progress_action);
        this.b.setAlpha(0.9f);
        this.h.setImageResource(this.i);
        this.h.setOnClickListener(this.j);
    }

    @Override // android.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22c4a3f0", new Object[]{this, charSequence});
        } else {
            this.e = charSequence;
        }
    }

    public TextView getMessageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ff6a0511", new Object[]{this}) : this.d;
    }

    public void setProgressVisiable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a59b7b", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void setIndeterminate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b47354", new Object[]{this, new Boolean(z)});
            return;
        }
        ProgressBar progressBar = this.f5058a;
        if (progressBar != null) {
            progressBar.setIndeterminate(z);
        } else {
            this.g = z;
        }
    }

    public void setActionIcon(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d0d02b", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void setActionListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b977bac6", new Object[]{this, onClickListener});
        } else {
            this.j = onClickListener;
        }
    }
}
