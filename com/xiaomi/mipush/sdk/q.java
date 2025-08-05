package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.es;
import com.xiaomi.push.ih;
import com.xiaomi.push.service.az;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class q extends az.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24334a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i, String str, Context context) {
        super(i, str);
        this.f24334a = context;
    }

    @Override // com.xiaomi.push.service.az.a
    protected void onCallback() {
        es.a(this.f24334a).a(az.a(this.f24334a).a(ih.AwakeInfoUploadWaySwitch.a(), 0));
    }
}
