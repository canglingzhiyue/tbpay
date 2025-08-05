package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.bg;
import com.xiaomi.push.service.bm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ar extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ao f24316a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(ao aoVar, Handler handler) {
        super(handler);
        this.f24316a = aoVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Context context;
        Integer num;
        Context context2;
        Context context3;
        ao aoVar = this.f24316a;
        context = aoVar.f50a;
        aoVar.f54a = Integer.valueOf(bm.a(context).a());
        num = this.f24316a.f54a;
        if (num.intValue() != 0) {
            context2 = this.f24316a.f50a;
            context2.getContentResolver().unregisterContentObserver(this);
            context3 = this.f24316a.f50a;
            if (!bg.b(context3)) {
                return;
            }
            this.f24316a.m1662c();
        }
    }
}
