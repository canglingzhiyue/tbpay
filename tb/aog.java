package tb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public class aog extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SQLiteDatabase f25469a;

    static {
        kge.a(-121753057);
    }

    public static /* synthetic */ Object ipc$super(aog aogVar, String str, Object... objArr) {
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

    public aog(Context context, String str) {
        super(context, str, null, 2, null);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        getWritableDatabase();
        b();
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
        if (this.f25469a == null) {
            this.f25469a = super.getWritableDatabase();
            boolean isDatabaseIntegrityOk = this.f25469a.isDatabaseIntegrityOk();
            apr.b("SQLiteCheckHelper", "isDatabaseIntegrityOk", Boolean.valueOf(isDatabaseIntegrityOk));
            if (!isDatabaseIntegrityOk) {
                apr.e("SQLiteCheckHelper", "delete Database", Boolean.valueOf(a(new File(this.f25469a.getPath()))));
            }
            apr.b("SQLiteCheckHelper", "WritableDatabase", this.f25469a);
        }
        return this.f25469a;
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f25469a == null) {
        } else {
            this.f25469a.close();
            this.f25469a = null;
        }
    }

    private void a(Cursor cursor) {
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

    private static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        boolean delete = file.delete() | false | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] listFiles = parentFile.listFiles(new FileFilter() { // from class: tb.aog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("50e018ca", new Object[]{this, file2})).booleanValue() : file2.getName().startsWith(str);
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    delete |= file2.delete();
                }
            }
        }
        return delete;
    }
}
