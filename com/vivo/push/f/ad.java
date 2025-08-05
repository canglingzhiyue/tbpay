package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;
import java.util.List;

/* loaded from: classes9.dex */
final class ad implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24191a;
    final /* synthetic */ List b;
    final /* synthetic */ List c;
    final /* synthetic */ String d;
    final /* synthetic */ ab e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad(ab abVar, int i, List list, List list2, String str) {
        this.e = abVar;
        this.f24191a = i;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.e.b;
        context = this.e.f24241a;
        pushMessageCallback.onSetAlias(context, this.f24191a, this.b, this.c, this.d);
    }
}
