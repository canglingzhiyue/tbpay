package com.xiaomi.push;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class gl extends gf {
    public gl() {
        a("PING", (String) null);
        a("0");
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.xiaomi.push.gf
    /* renamed from: a */
    public ByteBuffer mo1963a(ByteBuffer byteBuffer) {
        return a().length == 0 ? byteBuffer : super.mo1963a(byteBuffer);
    }

    @Override // com.xiaomi.push.gf
    public int c() {
        if (a().length == 0) {
            return 0;
        }
        return super.c();
    }
}
