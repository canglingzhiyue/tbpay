package tb;

import android.database.Cursor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.b;

/* loaded from: classes8.dex */
public class omf {
    public static final String DAO_NAME = "message_kit";

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final String[] CONFLICT_VALUES;

        /* renamed from: a  reason: collision with root package name */
        private static b f32174a;

        static {
            kge.a(2125420097);
            CONFLICT_VALUES = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        }

        public static Cursor a(String str, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Cursor) ipChange.ipc$dispatch("75564934", new Object[]{str, strArr});
            }
            try {
                return a().getReadableDatabase().rawQuery(str, strArr);
            } catch (Exception e) {
                MsgLog.c("MsgDao_DB", e.getMessage());
                e.printStackTrace();
                return null;
            }
        }

        public static synchronized b a() {
            synchronized (a.class) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (b) ipChange.ipc$dispatch("3288d569", new Object[0]);
                }
                if (f32174a == null) {
                    f32174a = new b(omg.d, omf.DAO_NAME);
                }
                return f32174a;
            }
        }

        public static void a(String str, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
                return;
            }
            try {
                if (objArr == null) {
                    a().getReadableDatabase().execSQL(str);
                } else {
                    a().getReadableDatabase().execSQL(str, objArr);
                }
            } catch (Exception e) {
                MsgLog.c("MsgDao_DB", e.getMessage());
                e.printStackTrace();
            }
        }
    }

    static {
        kge.a(1895617985);
    }
}
