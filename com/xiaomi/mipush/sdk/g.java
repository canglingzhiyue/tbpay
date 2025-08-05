package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ih;
import com.xiaomi.push.service.az;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class g extends az.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f24325a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, int i, String str) {
        super(i, str);
        this.f24325a = fVar;
    }

    @Override // com.xiaomi.push.service.az.a
    protected void onCallback() {
        Context context;
        boolean z;
        Context context2;
        context = this.f24325a.f73a;
        boolean a2 = az.a(context).a(ih.AggregatePushSwitch.a(), true);
        z = this.f24325a.f76a;
        if (z != a2) {
            this.f24325a.f76a = a2;
            context2 = this.f24325a.f73a;
            i.b(context2);
        }
    }
}
