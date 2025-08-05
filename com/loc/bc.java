package com.loc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes4.dex */
public final class bc extends SQLiteOpenHelper {
    private static boolean b = true;
    private static boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    private ay f7676a;

    public bc(Context context, String str, ay ayVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f7676a = ayVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f7676a.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
