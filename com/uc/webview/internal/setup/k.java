package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.internal.setup.b;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public Context f23973a = null;
    public String[] b = null;
    public boolean c = EnvInfo.c();
    public File d = null;
    public File e = null;
    public File f = null;
    public String g = null;
    public IDownloadHandle h = null;
    public boolean i = false;
    public boolean j = false;
    public b.a k = null;

    public final void a(Context context) {
        if (context != null) {
            this.f23973a = context.getApplicationContext();
            EnvInfo.a(context);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("  ctx: ");
        sb.append(this.f23973a);
        sb.append("\n  authKeys: ");
        sb.append(Arrays.toString(this.b));
        if (this.d != null) {
            sb.append("\n  compressedLibFile: ");
            sb.append(this.d.getAbsolutePath());
        }
        if (this.e != null) {
            sb.append("\n  specificExtractDir: ");
            sb.append(this.e.getAbsolutePath());
        }
        if (this.f != null) {
            sb.append("\n  decompressedDir: ");
            sb.append(this.f.getAbsolutePath());
        }
        if (!TextUtils.isEmpty(this.g)) {
            sb.append("\n  updateUrl: ");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append("\n  downloadHandle: ");
            sb.append(this.h);
        }
        sb.append("\n  usingFullCapacityCore: ");
        sb.append(String.valueOf(this.i));
        return sb.toString();
    }
}
