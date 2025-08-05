package com.xiaomi.push;

import android.content.SharedPreferences;
import com.xiaomi.push.ah;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ai extends ah.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ah f24348a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f93a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f94a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(ah ahVar, ah.a aVar, boolean z, String str) {
        super(aVar);
        this.f24348a = ahVar;
        this.f94a = z;
        this.f93a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.xiaomi.push.ah.b
    public void a() {
        super.a();
    }

    @Override // com.xiaomi.push.ah.b
    void b() {
        SharedPreferences sharedPreferences;
        if (!this.f94a) {
            sharedPreferences = this.f24348a.f89a;
            sharedPreferences.edit().putLong(this.f93a, System.currentTimeMillis()).commit();
        }
    }
}
