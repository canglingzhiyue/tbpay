package com.huawei.hms.hatool;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* loaded from: classes4.dex */
public class q1 {
    private static q1 c = new q1();

    /* renamed from: a  reason: collision with root package name */
    private boolean f7484a = false;
    private Context b = q0.i();

    private q1() {
    }

    public static q1 b() {
        return c;
    }

    public boolean a() {
        boolean z;
        if (!this.f7484a) {
            Context context = this.b;
            if (context == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    z = userManager.isUserUnlocked();
                } else {
                    this.f7484a = false;
                }
            } else {
                z = true;
            }
            this.f7484a = z;
        }
        return this.f7484a;
    }
}
