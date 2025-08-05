package com.uc.webview.internal.stats;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class h extends ArrayList<c> {

    /* renamed from: a  reason: collision with root package name */
    final String f23999a;

    public h(String str) {
        this.f23999a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (isEmpty()) {
            return;
        }
        Iterator<c> it = iterator();
        while (it.hasNext()) {
            c next = it.next();
            e.a(next.g(), next.e());
        }
        clear();
    }
}
