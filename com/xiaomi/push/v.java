package com.xiaomi.push;

import android.content.Context;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class v extends u {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f24733a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, File file, Runnable runnable) {
        super(context, file, null);
        this.f24733a = runnable;
    }

    @Override // com.xiaomi.push.u
    protected void a(Context context) {
        Runnable runnable = this.f24733a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
