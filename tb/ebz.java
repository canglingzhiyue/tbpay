package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes4.dex */
public class ebz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DATABASE_TABLE = "history";
    public static final int INSERT_ITEM = 5;
    public static final int INSERT_KEY = 6;

    /* renamed from: a  reason: collision with root package name */
    public Context f27183a;
    private String b;
    private SQLiteDatabase c;
    private eco d = eco.a(epo.a(), 17, false);

    static {
        kge.a(-684013404);
    }

    public ebz(Context context) {
        this.f27183a = context;
        a();
        emu.a("com.taobao.android.detail.core.detail.model.history.HistoryData");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
        if (r2 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized long a(tb.eby r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ebz.a(tb.eby):long");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = this.d.a();
        if (this.c == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(eby.KEY_GMT_GREATE, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        try {
            SQLiteDatabase sQLiteDatabase = this.c;
            sQLiteDatabase.update("history", contentValues, "_id=" + i, null);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
        if (r10 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e9, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f4, code lost:
        if (r10 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f7, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ebz.a(java.lang.String, java.lang.String, java.lang.String):int");
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{this, str, str2, str3, str4, str5, str6});
        } else if (str.equals("") && str2.equals("")) {
        } else {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            String b = dyw.b(str, "UTF-8");
            String b2 = dyw.b(str3, "UTF-8");
            String b3 = dyw.b(str5, "UTF-8");
            String replace = dyw.b(str4, "UTF-8").replace("元", "");
            String b4 = dyw.b(epj.b().a(str2, new epm(80, 80)), "UTF-8");
            eby ebyVar = new eby();
            ebyVar.f(b3);
            ebyVar.d(b2);
            ebyVar.e(replace);
            ebyVar.g(b4);
            ebyVar.a("1");
            ebyVar.c(format);
            ebyVar.h(str6);
            int indexOf = b.indexOf("sid");
            int indexOf2 = b.indexOf("&", indexOf);
            if (indexOf != -1) {
                if (indexOf2 != -1) {
                    b = b.replace(b.substring(indexOf, indexOf2 + 1), "");
                } else {
                    b = b.substring(0, indexOf);
                }
            }
            ebyVar.b(b);
            int a2 = a("1", str6, null);
            if (a2 <= 0) {
                a(ebyVar);
            } else {
                a(a2);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = this.d.a();
        SQLiteDatabase sQLiteDatabase = this.c;
        if (sQLiteDatabase == null) {
            return;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("select max(gmt_create) TIME from history", null);
            if (cursor != null) {
                cursor.moveToFirst();
                this.b = cursor.getString(cursor.getColumnIndex("TIME"));
            }
            if (cursor == null) {
                return;
            }
            cursor.close();
        } catch (Exception unused) {
            if (cursor == null) {
                return;
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
