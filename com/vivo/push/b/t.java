package com.vivo.push.b;

import com.taobao.android.weex_framework.MUSAppMonitor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class t extends s {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f24167a;
    private ArrayList<String> b;

    public t(int i) {
        super(i);
        this.f24167a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("content", this.f24167a);
        dVar.a(MUSAppMonitor.ERROR_MSG, this.b);
    }

    public final ArrayList<String> d() {
        return this.f24167a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24167a = dVar.c("content");
        this.b = dVar.c(MUSAppMonitor.ERROR_MSG);
    }

    public final List<String> e() {
        return this.b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnSetTagsCommand";
    }
}
