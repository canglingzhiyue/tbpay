package com.taobao.taopai.material.request.musicetype;

import java.util.List;
import tb.kge;
import tb.pzb;

/* loaded from: classes8.dex */
public class b extends com.taobao.taopai.material.request.base.a {
    public boolean d;

    static {
        kge.a(-837420656);
    }

    public b() {
        this.d = true;
    }

    public b(String str, int i) {
        boolean z = true;
        this.d = true;
        this.b = str;
        this.c = i;
        List<String> h = pzb.h();
        if (h != null && h.contains(str)) {
            z = false;
        }
        this.d = z;
    }

    public b(int i) {
        this.d = true;
        this.c = i;
    }
}
