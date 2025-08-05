package com.unionpay;

/* loaded from: classes9.dex */
final class v implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24051a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(UPPayWapActivity uPPayWapActivity) {
        this.f24051a = uPPayWapActivity;
    }

    @Override // com.unionpay.z
    public final void a(String str, aa aaVar) {
        String b;
        String a2 = a.a(this.f24051a);
        if (aaVar != null) {
            b = UPPayWapActivity.b("0", "success", a2);
            aaVar.a(b);
        }
    }
}
