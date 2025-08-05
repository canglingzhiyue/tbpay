package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* loaded from: classes4.dex */
public class dad extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private String f26633a;
    private String b;
    private String c;

    public dad(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, String str2, String str3, String str4) {
        super(context, str, cursorFactory, i);
        this.f26633a = str2;
        this.b = str3;
        this.c = str4;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(this.f26633a);
            sQLiteDatabase.execSQL(this.c);
            sQLiteDatabase.execSQL("PRAGMA auto_vacuum = FULL");
        } catch (Exception e) {
            Log.e("DbHelper", "Database onCreate Exception", e);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL(this.b);
            onCreate(sQLiteDatabase);
        } catch (Exception e) {
            Log.e("DbHelper", "Database onUpgrade Exception", e);
        }
    }
}
