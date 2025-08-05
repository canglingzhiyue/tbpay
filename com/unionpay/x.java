package com.unionpay;

/* loaded from: classes9.dex */
final class x implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24053a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(UPPayWapActivity uPPayWapActivity) {
        this.f24053a = uPPayWapActivity;
    }

    @Override // com.unionpay.z
    public final void a(String str, aa aaVar) {
        String b;
        UPPayWapActivity.a(this.f24053a, Boolean.parseBoolean(str));
        if (aaVar != null) {
            b = UPPayWapActivity.b("0", "success", (String) null);
            aaVar.a(b);
        }
    }
}
