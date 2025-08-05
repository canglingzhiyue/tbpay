package com.xiaomi.push;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.push.cg;

/* loaded from: classes9.dex */
class ci implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24400a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ cg.a f171a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ci(cg.a aVar, Context context) {
        this.f171a = aVar;
        this.f24400a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.f171a.a();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.beginTransaction();
                    this.f171a.a(this.f24400a, sQLiteDatabase);
                    sQLiteDatabase.setTransactionSuccessful();
                }
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e) {
                        e = e;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        this.f171a.a(this.f24400a);
                    }
                }
                if (this.f171a.f162a != null) {
                    this.f171a.f162a.close();
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Exception e2) {
                        com.xiaomi.channel.commonutils.logger.b.a(e2);
                        this.f171a.a(this.f24400a);
                        throw th;
                    }
                }
                if (this.f171a.f162a != null) {
                    this.f171a.f162a.close();
                }
                this.f171a.a(this.f24400a);
                throw th;
            }
        } catch (Exception e3) {
            com.xiaomi.channel.commonutils.logger.b.a(e3);
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e4) {
                    e = e4;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    this.f171a.a(this.f24400a);
                }
            }
            if (this.f171a.f162a != null) {
                this.f171a.f162a.close();
            }
        }
        this.f171a.a(this.f24400a);
    }
}
