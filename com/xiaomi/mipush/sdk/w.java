package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24338a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Context context) {
        this.f24338a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.f24338a.getPackageManager().getPackageInfo(this.f24338a.getPackageName(), 4612);
            v.c(this.f24338a);
            v.d(this.f24338a, packageInfo);
            v.c(this.f24338a, packageInfo);
        } catch (Throwable th) {
            Log.e("ManifestChecker", "", th);
        }
    }
}
