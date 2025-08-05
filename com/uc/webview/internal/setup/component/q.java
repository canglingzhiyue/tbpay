package com.uc.webview.internal.setup.component;

import android.content.Context;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.io.PathUtils;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    final String f23933a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final String g;
    final int h;
    final File i;
    final String[] j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(String str, int i) {
        this(str, i, true, 0, 0, "", "", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(String str, int i, int i2, String str2, String str3) {
        this(str, i, true, 0, i2, str2, str3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public q(String str, int i, boolean z, int i2, int i3, String str2, String str3, String[] strArr) {
        String str4;
        this.f23933a = str;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = i3;
        Context context = EnvInfo.getContext();
        this.h = com.uc.webview.base.f.a(str + "Dir");
        this.i = new File(PathUtils.g(context), str);
        this.j = strArr;
        if (i3 == 1) {
            this.f = x.a(str2, str);
            str4 = (str3 + "/" + this.f).toLowerCase();
        } else {
            str4 = null;
            this.f = null;
        }
        this.g = str4;
    }
}
