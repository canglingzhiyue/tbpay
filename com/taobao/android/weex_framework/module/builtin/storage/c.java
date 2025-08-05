package com.taobao.android.weex_framework.module.builtin.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.alibaba.ability.impl.file.FileAbility;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static SimpleDateFormat f16056a;
    private long b;
    private Context c;
    private SQLiteDatabase d;

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(69108904);
        f16056a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    }

    public c(Context context) {
        super(context, "MUSStorage", (SQLiteDatabase.CursorFactory) null, 2);
        this.b = FileAbility.MAX_DIR_SIZE;
        this.c = context;
    }

    public SQLiteDatabase a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("7734f4a7", new Object[]{this});
        }
        b();
        return this.d;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS default_wx_storage (key TEXT PRIMARY KEY,value TEXT NOT NULL,timestamp TEXT NOT NULL,persistent INTEGER DEFAULT 0)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        } else if (i == i2) {
        } else {
            if (i2 == 2) {
                try {
                    if (i == 1) {
                        try {
                            System.currentTimeMillis();
                            sQLiteDatabase.beginTransaction();
                            sQLiteDatabase.execSQL("ALTER TABLE default_wx_storage ADD COLUMN timestamp TEXT;");
                            sQLiteDatabase.execSQL("ALTER TABLE default_wx_storage ADD COLUMN persistent INTEGER;");
                            sQLiteDatabase.execSQL("UPDATE default_wx_storage SET timestamp = '" + f16056a.format(new Date()) + "' , persistent = 0");
                            sQLiteDatabase.setTransactionSuccessful();
                            System.currentTimeMillis();
                            sQLiteDatabase.endTransaction();
                            z = true;
                        } catch (Exception e) {
                            g.a("mus_storage", "storage updated failed from version " + i + " to version " + i2 + "," + e.getMessage());
                            sQLiteDatabase.endTransaction();
                        }
                        if (z) {
                            return;
                        }
                        d();
                        onCreate(sQLiteDatabase);
                        return;
                    }
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            }
            d();
            onCreate(sQLiteDatabase);
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == null || !this.d.isOpen()) {
            for (int i = 0; i < 2; i++) {
                if (i > 0) {
                    try {
                        d();
                    } catch (SQLiteException e) {
                        e.printStackTrace();
                        try {
                            Thread.sleep(30L);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                this.d = getWritableDatabase();
            }
            if (this.d == null) {
                return;
            }
            a(this.d);
            this.d.setMaximumSize(this.b);
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        c();
        return this.c.deleteDatabase("MUSStorage");
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.d != null && this.d.isOpen()) {
            this.d.close();
            this.d = null;
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cd8c21", new Object[]{this, sQLiteDatabase});
            return;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = 'default_wx_storage'", null);
                if (cursor != null && cursor.getCount() > 0) {
                    if (cursor == null) {
                        return;
                    }
                    cursor.close();
                    return;
                }
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS default_wx_storage (key TEXT PRIMARY KEY,value TEXT NOT NULL,timestamp TEXT NOT NULL,persistent INTEGER DEFAULT 0)");
                if (cursor == null) {
                    return;
                }
                cursor.close();
            } catch (Exception e) {
                e.printStackTrace();
                if (cursor == null) {
                    return;
                }
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
