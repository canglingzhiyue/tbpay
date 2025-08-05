package com.unionpay;

import android.view.View;

/* loaded from: classes9.dex */
final class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24032a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(UPPayWapActivity uPPayWapActivity) {
        this.f24032a = uPPayWapActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UPPayWapActivity.d(this.f24032a);
    }
}
