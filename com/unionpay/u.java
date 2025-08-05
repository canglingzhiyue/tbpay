package com.unionpay;

import com.unionpay.utils.UPUtils;

/* loaded from: classes9.dex */
final class u implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24046a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(UPPayWapActivity uPPayWapActivity) {
        this.f24046a = uPPayWapActivity;
    }

    @Override // com.unionpay.z
    public final void a(String str, aa aaVar) {
        String b;
        String a2 = UPUtils.a(this.f24046a, str);
        if (aaVar != null) {
            b = UPPayWapActivity.b("0", "success", a2);
            aaVar.a(b);
        }
    }
}
