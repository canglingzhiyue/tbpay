package com.hihonor.push.sdk;

import android.os.Looper;
import com.hihonor.push.framework.aidl.IPushInvoke;
import com.hihonor.push.sdk.ab;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;
import com.hihonor.push.sdk.x;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class ae implements ab {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f7263a = new AtomicInteger(1);
    public volatile IPushInvoke b;
    public final ab.a c;
    public ah d;

    public ae(ab.a aVar) {
        this.c = aVar;
    }

    public final void a(int i) {
        String str = "notifyFailed result: " + i;
        ab.a aVar = this.c;
        if (aVar != null) {
            x.a aVar2 = (x.a) aVar;
            aVar2.getClass();
            if (Looper.myLooper() == x.this.f7292a.getLooper()) {
                aVar2.a(HonorPushErrorEnum.fromCode(i));
            } else {
                x.this.f7292a.post(new v(aVar2, i));
            }
        }
    }

    public boolean a() {
        return this.f7263a.get() == 3 || this.f7263a.get() == 4;
    }
}
