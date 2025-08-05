package com.loc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public abstract class cv {

    /* renamed from: a  reason: collision with root package name */
    cx f7733a;
    private ByteBuffer b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cv(int i) {
        this.b = ByteBuffer.allocate(i);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        this.f7733a = new cx(this.b);
    }

    public final cv a() {
        this.f7733a.a(this.b);
        return this;
    }
}
