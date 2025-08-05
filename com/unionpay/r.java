package com.unionpay;

import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class r implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24033a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(UPPayWapActivity uPPayWapActivity) {
        this.f24033a = uPPayWapActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f24033a.a("cancel", (String) null);
    }
}
