package com.vivo.push.restructure.a.a;

import com.vivo.push.PushClient;

/* loaded from: classes9.dex */
final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24223a;
    final /* synthetic */ String b;
    final /* synthetic */ e c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(e eVar, int i, String str) {
        this.c = eVar;
        this.f24223a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24223a;
        if (i == 3) {
            PushClient.getInstance(com.vivo.push.restructure.a.a().b()).unBindAlias(this.b, null);
        } else if (i != 4) {
        } else {
            PushClient.getInstance(com.vivo.push.restructure.a.a().b()).delTopic(this.b, null);
        }
    }
}
