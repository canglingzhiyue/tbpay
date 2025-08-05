package tb;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes9.dex */
public class rxc {
    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
