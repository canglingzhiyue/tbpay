package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nrx extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31706a;
    private final String b;
    private String c;

    static {
        kge.a(-1823169933);
    }

    public /* synthetic */ nrx(Context context, String str, int i, int i2, o oVar) {
        this(context, str, (i2 & 4) != 0 ? 1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrx(Context context, String tableName, int i) {
        super(context, noa.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i);
        q.c(context, "context");
        q.c(tableName, "tableName");
        this.c = tableName;
        this.f31706a = "id";
        this.b = "content";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else if (sQLiteDatabase == null) {
        } else {
            sQLiteDatabase.execSQL("CREATE TABLE " + this.c + " (" + this.f31706a + " TEXT PRIMARY KEY, " + this.b + " TEXT)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        } else if (i == i2 || sQLiteDatabase == null) {
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.c);
            onCreate(sQLiteDatabase);
        }
    }

    public final void a(nrz... historyEntities) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831dc5a7", new Object[]{this, historyEntities});
            return;
        }
        q.c(historyEntities, "historyEntities");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            for (nrz nrzVar : historyEntities) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(this.f31706a, nrzVar.a());
                contentValues.put(this.b, nrzVar.b());
                writableDatabase.insertWithOnConflict(this.c, null, contentValues, 5);
            }
            writableDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        if (r14.isClosed() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        if (r14.isClosed() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r14) {
        /*
            r13 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.nrx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r13
            r1[r3] = r14
            java.lang.String r14 = "9f352ae"
            java.lang.Object r14 = r0.ipc$dispatch(r14, r1)
            java.lang.String r14 = (java.lang.String) r14
            return r14
        L18:
            java.lang.String r0 = "id"
            kotlin.jvm.internal.q.c(r14, r0)
            android.database.sqlite.SQLiteDatabase r5 = r13.getReadableDatabase()
            r0 = 0
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = r13.c
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r2 = r13.f31706a
            r7[r4] = r2
            java.lang.String r2 = r13.b
            r7[r3] = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = r13.f31706a
            r2.append(r8)
            java.lang.String r8 = " = ?"
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String[] r9 = new java.lang.String[r3]
            r9[r4] = r14
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r14 = r5.query(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != 0) goto L52
            return r0
        L52:
            boolean r0 = r14.moveToFirst()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L78
            if (r0 == 0) goto L63
            java.lang.String r0 = r13.b     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L78
            int r0 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L78
            java.lang.String r0 = r14.getString(r0)     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L78
            r1 = r0
        L63:
            boolean r0 = r14.isClosed()
            if (r0 != 0) goto L80
        L69:
            r14.close()
            goto L80
        L6d:
            r0 = move-exception
            boolean r1 = r14.isClosed()
            if (r1 != 0) goto L77
            r14.close()
        L77:
            throw r0
        L78:
            boolean r0 = r14.isClosed()
            if (r0 != 0) goto L80
            goto L69
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.nrx.a(java.lang.String):java.lang.String");
    }

    public final void b(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, id});
            return;
        }
        q.c(id, "id");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            String str = this.c;
            writableDatabase.delete(str, this.f31706a + " = ?", new String[]{id});
            writableDatabase.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
