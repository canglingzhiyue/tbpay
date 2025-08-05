package com.loc;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class cx extends ga {
    /* JADX INFO: Access modifiers changed from: package-private */
    public cx(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override // com.loc.ga
    public final int a(CharSequence charSequence) {
        try {
            return super.a(charSequence);
        } catch (Throwable th) {
            ej.a(th);
            return super.a("");
        }
    }
}
