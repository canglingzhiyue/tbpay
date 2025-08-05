package com.vivo.push.restructure.request;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.g;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f24239a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Looper looper) {
        super(looper);
        this.f24239a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Map map;
        Map map2;
        int i = message.what;
        map = this.f24239a.f24237a;
        if (map.containsKey(Integer.valueOf(i))) {
            map2 = this.f24239a.f24237a;
            g.a().execute(new f(this, (b) map2.remove(Integer.valueOf(i))));
        }
    }
}
