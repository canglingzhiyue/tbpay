package com.unionpay;

import android.app.AlertDialog;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24034a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(UPPayWapActivity uPPayWapActivity) {
        this.f24034a = uPPayWapActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AlertDialog alertDialog;
        alertDialog = this.f24034a.d;
        alertDialog.dismiss();
    }
}
