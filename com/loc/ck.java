package com.loc;

import java.io.File;

/* loaded from: classes4.dex */
public final class ck extends co {

    /* renamed from: a  reason: collision with root package name */
    private int f7722a;
    private String b;

    public ck(String str, co coVar) {
        super(coVar);
        this.f7722a = 30;
        this.b = str;
    }

    private static int a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.list().length;
            }
            return 0;
        } catch (Throwable th) {
            av.b(th, "fus", "gfn");
            return 0;
        }
    }

    @Override // com.loc.co
    protected final boolean a() {
        return a(this.b) >= this.f7722a;
    }
}
