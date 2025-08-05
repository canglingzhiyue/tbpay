package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;

/* loaded from: classes4.dex */
public class eco {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DATABASE_VERSION = 16;
    private static eco b;

    /* renamed from: a  reason: collision with root package name */
    public Context f27196a;
    private a c;
    private SQLiteDatabase d;

    static {
        kge.a(1705933769);
    }

    public static /* synthetic */ void a(eco ecoVar, SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb7a660", new Object[]{ecoVar, sQLiteDatabase});
        } else {
            ecoVar.a(sQLiteDatabase);
        }
    }

    private eco(Context context, int i) {
        this.c = new a(context);
        this.f27196a = context;
        emu.a("com.taobao.android.detail.core.detail.utils.HistoryDbHelper");
    }

    public static synchronized eco a(Context context, int i, boolean z) {
        synchronized (eco.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eco) ipChange.ipc$dispatch("e41c3f64", new Object[]{context, new Integer(i), new Boolean(z)});
            }
            if (b == null) {
                b = new eco(epo.a(), i);
            }
            return b;
        }
    }

    /* loaded from: classes4.dex */
    public class a extends SQLiteOpenHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1645552796);
        }

        public a(Context context) {
            super(context, "data_history", (SQLiteDatabase.CursorFactory) null, 17);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
            } else {
                eco.a(eco.this, sQLiteDatabase);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
                return;
            }
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS history");
                sQLiteDatabase.execSQL("create table history (_id integer primary key autoincrement, type text not null,title text , auction_url text ,word text ,word_type text,gmt_create text not null, seller text , address text ,fee text ,picUrl text,item_id text);");
            } catch (Exception e) {
                i.a("HistoryDbHelper", "upgrade exception:", e);
            }
        }
    }

    public SQLiteDatabase a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("7734f4a7", new Object[]{this});
        }
        try {
            if (this.c == null) {
                this.c = new a(epo.a());
            }
            if (this.d == null || !this.d.isOpen()) {
                this.d = this.c.getWritableDatabase();
            }
            return this.d;
        } catch (Throwable th) {
            i.a("HistoryDbHelper", "create sqldatabase exception:", th);
            return null;
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cd8c21", new Object[]{this, sQLiteDatabase});
        } else {
            sQLiteDatabase.execSQL("create table history (_id integer primary key autoincrement, type text not null,title text , auction_url text ,word text ,word_type text,gmt_create text not null, seller text , address text ,fee text ,picUrl text,item_id text);");
        }
    }
}
