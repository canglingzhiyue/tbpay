package tb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class dck extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COL_DATA = "data";
    public static final String COL_MSG_TIME = "msg_time";
    public static final String COL_SEQ = "seq";
    public static final String COL_SERVICE = "service_id";
    public static final String COL_STREAM = "stream_id";
    public static final String TABLE_PRE_QUEUE = "t_queue_msg";

    static {
        kge.a(-1541084759);
    }

    public static /* synthetic */ Object ipc$super(dck dckVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9203621d", new Object[]{this, sQLiteDatabase, new Integer(i), new Integer(i2)});
        }
    }

    public dck(Context context) {
        super(context, "accs_sync_sdk.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6815e47b", new Object[]{this, sQLiteDatabase});
        } else if (sQLiteDatabase == null) {
            dcl.a("SyncDBHelper", "onCreate() db = NULL", new Object[0]);
        } else {
            try {
                sQLiteDatabase.execSQL(a());
            } catch (Throwable th) {
                dcl.a("SyncDBHelper", "onCreate err", th, new Object[0]);
            }
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("create table ");
        stringBuffer.append(TABLE_PRE_QUEUE);
        stringBuffer.append(riy.BRACKET_START_STR);
        stringBuffer.append("service_id");
        stringBuffer.append(" text,");
        stringBuffer.append(COL_STREAM);
        stringBuffer.append(" text,");
        stringBuffer.append(COL_SEQ);
        stringBuffer.append(" integer,");
        stringBuffer.append(COL_MSG_TIME);
        stringBuffer.append(" long,");
        stringBuffer.append("data");
        stringBuffer.append(" text");
        stringBuffer.append(");");
        return stringBuffer.toString();
    }
}
