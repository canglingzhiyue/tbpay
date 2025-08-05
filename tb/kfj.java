package tb;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class kfj {

    /* renamed from: a  reason: collision with root package name */
    private static String f30034a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;

    static {
        kge.a(-880387596);
        f30034a = "taobao";
        b = "taobao_display_default_account";
        c = "com.android.exchange";
        d = "淘宝日历";
        e = "content://com.android.calendar/calendars";
    }

    private int b(Context context) {
        Cursor query = context.getContentResolver().query(Uri.parse(e), null, null, null, null);
        if (query == null) {
            return -1;
        }
        try {
            if (query.getCount() <= 0) {
                if (query != null) {
                    query.close();
                }
                return -1;
            }
            query.moveToFirst();
            int i = query.getInt(query.getColumnIndex("_id"));
            if (query != null) {
                query.close();
            }
            return i;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    private long c(Context context) {
        TimeZone timeZone = TimeZone.getDefault();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", f30034a);
        contentValues.put("account_name", b);
        contentValues.put("account_type", c);
        contentValues.put("calendar_displayName", d);
        contentValues.put("visible", (Integer) 1);
        contentValues.put("calendar_color", (Integer) (-16776961));
        contentValues.put("calendar_access_level", (Integer) 700);
        contentValues.put("sync_events", (Integer) 1);
        contentValues.put("calendar_timezone", timeZone.getID());
        contentValues.put("ownerAccount", b);
        contentValues.put("canOrganizerRespond", (Integer) 0);
        Uri insert = context.getContentResolver().insert(Uri.parse(e).buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", b).appendQueryParameter("account_type", c).build(), contentValues);
        if (insert == null) {
            return -1L;
        }
        return ContentUris.parseId(insert);
    }

    public int a(Context context) {
        int b2 = b(context);
        if (b2 >= 0) {
            return b2;
        }
        if (c(context) < 0) {
            return -1;
        }
        return b(context);
    }
}
