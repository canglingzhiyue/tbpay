package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* loaded from: classes9.dex */
final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24197a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ l e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(l lVar, int i, List list, List list2, String str) {
        this.e = lVar;
        this.f24197a = i;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.e.b;
        context = this.e.f24241a;
        pushMessageCallback.onDelAlias(context, this.f24197a, this.b, this.c, this.d);
    }
}
