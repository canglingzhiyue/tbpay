package com.xiaomi.push;

import com.xiaomi.push.du;
import java.io.File;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class dv extends du.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f24436a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ du f237a;

    /* renamed from: a  reason: collision with other field name */
    File f238a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f239a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Date f240a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ boolean f241a;
    final /* synthetic */ String b;

    /* renamed from: b  reason: collision with other field name */
    final /* synthetic */ Date f242b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(du duVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.f237a = duVar;
        this.f24436a = i;
        this.f240a = date;
        this.f242b = date2;
        this.f239a = str;
        this.b = str2;
        this.f241a = z;
    }

    @Override // com.xiaomi.push.du.b, com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo1827b() {
        if (!z.d()) {
            return;
        }
        try {
            File file = new File(this.f237a.f230a.getExternalFilesDir(null) + "/.logcache");
            file.mkdirs();
            if (!file.isDirectory()) {
                return;
            }
            dt dtVar = new dt();
            dtVar.a(this.f24436a);
            this.f238a = dtVar.a(this.f237a.f230a, this.f240a, this.f242b, file);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: c */
    public void mo1828c() {
        File file = this.f238a;
        if (file != null && file.exists()) {
            this.f237a.f231a.add(new du.c(this.f239a, this.b, this.f238a, this.f241a));
        }
        this.f237a.a(0L);
    }
}
