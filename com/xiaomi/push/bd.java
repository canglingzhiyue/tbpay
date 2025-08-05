package com.xiaomi.push;

/* loaded from: classes9.dex */
public class bd implements bf {

    /* renamed from: a  reason: collision with root package name */
    private final String f24369a;
    private final String b;

    public bd(String str, String str2) {
        if (str != null) {
            this.f24369a = str;
            this.b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    @Override // com.xiaomi.push.bf
    public String a() {
        return this.f24369a;
    }

    @Override // com.xiaomi.push.bf
    public String b() {
        return this.b;
    }
}
