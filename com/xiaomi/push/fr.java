package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes9.dex */
public class fr implements fp {

    /* renamed from: a  reason: collision with root package name */
    private fp f24479a;

    /* loaded from: classes9.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static fr f24480a = new fr();
    }

    private fr() {
    }

    public static fr a() {
        return a.f24480a;
    }

    @Override // com.xiaomi.push.fp
    public void a(fo foVar) {
        fp fpVar = this.f24479a;
        if (fpVar != null) {
            fpVar.a(foVar);
        }
    }

    @Override // com.xiaomi.push.fp
    public void a(String str, Map<String, Object> map) {
        fp fpVar = this.f24479a;
        if (fpVar != null) {
            fpVar.a(str, map);
        }
    }
}
