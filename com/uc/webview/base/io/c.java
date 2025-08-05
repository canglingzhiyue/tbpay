package com.uc.webview.base.io;

import java.io.File;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final File f23789a;
    public final File b;
    private final File c;

    public c(File file, String str) {
        this(file, str, (byte) 0);
    }

    private c(File file, String str, byte b) {
        this.f23789a = new File(file, str + "_s");
        this.b = new File(file, str + "_f");
        this.c = null;
    }

    public final boolean a() {
        if (c()) {
            return true;
        }
        d.c("FlagMarker-mf", this.f23789a);
        return d.b("FlagMarker-mf", this.b);
    }

    public final boolean b() {
        d.c("FlagMarker-cl", this.b);
        d.c("FlagMarker-cl", this.f23789a);
        return !this.f23789a.exists() && !this.b.exists();
    }

    public final boolean c() {
        if (this.f23789a.exists() || !this.b.exists()) {
            return false;
        }
        File file = this.c;
        return file == null || file.exists();
    }
}
