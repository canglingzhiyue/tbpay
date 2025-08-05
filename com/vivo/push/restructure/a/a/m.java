package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.util.u;

/* loaded from: classes9.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    private String f24225a;
    private String b;

    public m(com.vivo.push.restructure.a.a aVar, String str) {
        if (aVar != null) {
            this.f24225a = aVar.a();
        }
        this.b = str;
    }

    public final com.vivo.push.b.h a() {
        if (TextUtils.isEmpty(this.f24225a) || TextUtils.isEmpty(this.b)) {
            u.a("convertOffLineMsg() error, mMessageID = " + this.f24225a + ", mNodeArrayInfo = " + this.b);
            return null;
        }
        return new com.vivo.push.b.h(this.f24225a, this.b);
    }
}
