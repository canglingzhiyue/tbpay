package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f24732a;

    /* renamed from: a  reason: collision with other field name */
    private File f1039a;

    /* renamed from: a  reason: collision with other field name */
    private Runnable f1040a;

    private u(Context context, File file) {
        this.f24732a = context;
        this.f1039a = file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ u(Context context, File file, v vVar) {
        this(context, file);
    }

    public static void a(Context context, File file, Runnable runnable) {
        new v(context, file, runnable).run();
    }

    protected abstract void a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = null;
        try {
            try {
                if (this.f1039a == null) {
                    this.f1039a = new File(this.f24732a.getFilesDir(), "default_locker");
                }
                tVar = t.a(this.f24732a, this.f1039a);
                if (this.f1040a != null) {
                    this.f1040a.run();
                }
                a(this.f24732a);
                if (tVar == null) {
                    return;
                }
                tVar.a();
            } catch (IOException e) {
                e.printStackTrace();
                if (tVar == null) {
                    return;
                }
                tVar.a();
            }
        } catch (Throwable th) {
            if (tVar != null) {
                tVar.a();
            }
            throw th;
        }
    }
}
