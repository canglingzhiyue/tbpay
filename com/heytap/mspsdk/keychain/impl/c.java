package com.heytap.mspsdk.keychain.impl;

import android.content.Context;
import android.os.Bundle;
import tb.dbl;
import tb.kge;

/* loaded from: classes4.dex */
public final class c extends dbl implements d {
    static {
        kge.a(1355228028);
        kge.a(1355228029);
    }

    public c(Context context, Bundle bundle) {
        super(context, null, bundle);
        this.i = new String[]{"com.heytap.htms.action.KEY_CHAIN_SERVICE"};
    }

    @Override // tb.dbl
    public String a() {
        return "com.heytap.msp.keychain.KeyChainService";
    }

    @Override // com.heytap.mspsdk.keychain.impl.d
    public final void a(Bundle bundle, com.heytap.msp.keychain.a aVar) {
        c();
        a(this.f26657a, "com.heytap.msp.keychain.KeyChainServiceModule", this.c, 1, bundle, aVar);
    }

    @Override // com.heytap.mspsdk.keychain.impl.d
    public final void b(Bundle bundle, com.heytap.msp.keychain.a aVar) {
        c();
        a(this.f26657a, "com.heytap.msp.keychain.KeyChainServiceModule", this.c, 2, bundle, aVar);
    }

    @Override // com.heytap.mspsdk.keychain.impl.d
    public final void c(Bundle bundle, com.heytap.msp.keychain.a aVar) {
        c();
        a(this.f26657a, "com.heytap.msp.keychain.KeyChainServiceModule", this.c, 4, bundle, aVar);
    }
}
