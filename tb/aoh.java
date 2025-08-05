package tb;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class aoh extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean e;
    private static DatabaseErrorHandler f;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f25471a;
    private SQLiteDatabase b;
    private a c;
    private Future<?> d;

    public static /* synthetic */ Object ipc$super(aoh aohVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2000015223) {
            super.onOpen((SQLiteDatabase) objArr[0]);
            return null;
        } else if (hashCode != 305025623) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return super.getWritableDatabase();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        }
    }

    public static /* synthetic */ SQLiteDatabase a(aoh aohVar, SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("d10b5d8", new Object[]{aohVar, sQLiteDatabase});
        }
        aohVar.b = sQLiteDatabase;
        return sQLiteDatabase;
    }

    public static /* synthetic */ AtomicInteger a(aoh aohVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("d5715808", new Object[]{aohVar}) : aohVar.f25471a;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        e = z;
        return z;
    }

    public static /* synthetic */ SQLiteDatabase b(aoh aohVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SQLiteDatabase) ipChange.ipc$dispatch("b92f9010", new Object[]{aohVar}) : aohVar.b;
    }

    static {
        kge.a(1021323973);
        e = false;
        f = new DatabaseErrorHandler() { // from class: tb.aoh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6d4cd45a", new Object[]{this, sQLiteDatabase});
                    return;
                }
                apr.c("SqliteHelper", "DatabaseErrorHandler onCorruption");
                aoh.a(true);
            }
        };
    }

    public aoh(Context context, String str) {
        super(context, str, null, 2, f);
        this.f25471a = new AtomicInteger();
        this.c = new a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ca3089", new Object[]{this, sQLiteDatabase});
            return;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=DELETE", null);
        } catch (Throwable unused) {
        }
        a(cursor);
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public synchronized SQLiteDatabase getWritableDatabase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("122e5257", new Object[]{this});
        }
        if (this.b == null) {
            if (e) {
                return null;
            }
            this.b = super.getWritableDatabase();
        }
        this.f25471a.incrementAndGet();
        return this.b;
    }

    public synchronized void a(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cd8c21", new Object[]{this, sQLiteDatabase});
        } else if (sQLiteDatabase == null) {
        } else {
            try {
                if (this.f25471a.decrementAndGet() == 0) {
                    if (this.d != null) {
                        this.d.cancel(false);
                    }
                    this.d = aqe.a().a(null, this.c, 30000L);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2912c62f", new Object[]{this, cursor});
        } else if (cursor == null) {
        } else {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1477297705);
            kge.a(-1390502639);
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (aoh.this) {
                if (aoh.a(aoh.this).get() == 0 && aoh.b(aoh.this) != null) {
                    aoh.b(aoh.this).close();
                    aoh.a(aoh.this, null);
                }
            }
        }
    }
}
