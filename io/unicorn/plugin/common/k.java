package io.unicorn.plugin.common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import tb.kge;

/* loaded from: classes9.dex */
public final class k implements f<String> {
    public static final k INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f24852a;

    static {
        kge.a(1193187133);
        kge.a(1699229335);
        f24852a = Charset.forName("UTF8");
        INSTANCE = new k();
    }

    private k() {
    }

    public static void a() {
    }

    @Override // io.unicorn.plugin.common.f
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f24852a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // io.unicorn.plugin.common.f
    /* renamed from: b */
    public String a(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i = 0;
        }
        return new String(bArr, i, remaining, f24852a);
    }
}
