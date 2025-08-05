package com.xiaomi.push;

import java.io.ByteArrayOutputStream;

/* loaded from: classes9.dex */
public class jq extends ByteArrayOutputStream {
    public jq() {
    }

    public jq(int i) {
        super(i);
    }

    public int a() {
        return this.count;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m2183a() {
        return this.buf;
    }
}
