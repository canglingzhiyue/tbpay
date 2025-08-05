package com.alibaba.android.split.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Dialog b;
    private static boolean c;

    /* renamed from: a  reason: collision with root package name */
    private Activity f2508a;
    private DialogInterface.OnCancelListener d;
    private DialogInterface.OnShowListener e;
    private DialogInterface.OnDismissListener f;

    static {
        kge.a(-1078730653);
        kge.a(-2109436213);
        b = null;
        c = false;
    }

    @Override // com.alibaba.android.split.ui.c
    public DialogInterface.OnCancelListener c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnCancelListener) ipChange.ipc$dispatch("48f07c65", new Object[]{this}) : this.d;
    }

    @Override // com.alibaba.android.split.ui.c
    public DialogInterface.OnShowListener d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnShowListener) ipChange.ipc$dispatch("d8f45ba1", new Object[]{this}) : this.e;
    }

    @Override // com.alibaba.android.split.ui.c
    public DialogInterface.OnDismissListener e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogInterface.OnDismissListener) ipChange.ipc$dispatch("48b0c67", new Object[]{this}) : this.f;
    }

    public a(Activity activity) {
        this(activity, null, null, null);
    }

    public a(Activity activity, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener) {
        this.f2508a = activity;
        this.d = onCancelListener;
        this.f = onDismissListener;
        this.e = onShowListener;
    }

    public static void a(final c cVar) {
        Activity ownerActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72dc259", new Object[]{cVar});
        } else if (c || cVar == null) {
        } else {
            Dialog b2 = cVar.b();
            b = b2;
            if (b2 == null || (ownerActivity = b.getOwnerActivity()) == null || ownerActivity.isFinishing()) {
                return;
            }
            b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.alibaba.android.split.ui.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    } else if (c.this.e() == null) {
                    } else {
                        c.this.e().onDismiss(dialogInterface);
                    }
                }
            });
            b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.alibaba.android.split.ui.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else if (c.this.c() == null) {
                    } else {
                        c.this.c().onCancel(dialogInterface);
                    }
                }
            });
            b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.alibaba.android.split.ui.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
                    } else if (c.this.d() == null) {
                    } else {
                        c.this.d().onShow(dialogInterface);
                    }
                }
            });
            if (b == null || ownerActivity == null || ownerActivity.isFinishing() || b.isShowing()) {
                return;
            }
            try {
                b.show();
                c = true;
            } catch (Throwable unused) {
            }
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        Dialog dialog = b;
        if (dialog == null || dialog.getOwnerActivity().isFinishing()) {
            return;
        }
        try {
            if (!b.isShowing()) {
                return;
            }
            b.dismiss();
            b = null;
        } catch (Throwable unused) {
            b = null;
        }
    }

    @Override // com.alibaba.android.split.ui.c
    public Dialog b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("24560806", new Object[]{this});
        }
        if (this.f2508a.isFinishing()) {
            return null;
        }
        Dialog dialog = new Dialog(this.f2508a, R.style.feature_default_dialog);
        dialog.setOwnerActivity(this.f2508a);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        DefaultProgress defaultProgress = new DefaultProgress(this.f2508a);
        int i = (int) (this.f2508a.getResources().getDisplayMetrics().density * 96.0f);
        dialog.setContentView(defaultProgress, new ViewGroup.LayoutParams(i, i));
        return dialog;
    }
}
