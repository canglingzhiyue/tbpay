package com.unionpay;

import android.view.View;

/* loaded from: classes9.dex */
final class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24025a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(UPPayWapActivity uPPayWapActivity) {
        this.f24025a = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f24025a.finish();
    }
}
