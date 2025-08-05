package io.unicorn.plugin.platform;

import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g> f24873a = new HashMap();

    static {
        kge.a(-963848811);
        kge.a(1049686485);
    }

    public static void a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g a(String str) {
        return this.f24873a.get(str);
    }

    @Override // io.unicorn.plugin.platform.h
    public boolean a(String str, g gVar) {
        this.f24873a.put(str, gVar);
        return true;
    }
}
