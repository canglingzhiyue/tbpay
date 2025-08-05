package com.unionpay;

import com.unionpay.utils.UPUtils;

/* loaded from: classes9.dex */
final class w implements z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPPayWapActivity f24052a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(UPPayWapActivity uPPayWapActivity) {
        this.f24052a = uPPayWapActivity;
    }

    @Override // com.unionpay.z
    public final void a(String str, aa aaVar) {
        String b;
        UPUtils.b(this.f24052a, str);
        if (aaVar != null) {
            b = UPPayWapActivity.b("0", "success", (String) null);
            aaVar.a(b);
        }
    }
}
