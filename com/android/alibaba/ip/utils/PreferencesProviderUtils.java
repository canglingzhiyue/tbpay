package com.android.alibaba.ip.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.PreferencesProvider;
import tb.kge;

/* loaded from: classes3.dex */
public class PreferencesProviderUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(141620269);
    }

    public static boolean putString(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("585a2443", new Object[]{context, str, str2, str3})).booleanValue();
        }
        Uri buildUri = buildUri(context, 100, str, str2, str3);
        ContentResolver contentResolver = context.getContentResolver();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, str3);
            contentResolver.insert(buildUri, contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean remove(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2e18db5", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            context.getContentResolver().delete(buildUri(context, 106, str, str2, null), null, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean clear(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cb11ac2", new Object[]{context, str})).booleanValue();
        }
        try {
            context.getContentResolver().delete(buildUri(context, 108, str, null, null), null, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String getString(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2}) : getString(context, str, str2, "");
    }

    public static String getString(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1745d1c8", new Object[]{context, str, str2, str3});
        }
        Cursor query = context.getContentResolver().query(buildUri(context, 100, str, str2, str3), null, null, null, null);
        return (query != null && query.moveToNext()) ? query.getString(query.getColumnIndex(PreferencesProvider.COLUMNNAME)) : str3;
    }

    public static boolean putInt(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50641a52", new Object[]{context, str, str2, new Integer(i)})).booleanValue();
        }
        Uri buildUri = buildUri(context, 101, str, str2, Integer.valueOf(i));
        ContentResolver contentResolver = context.getContentResolver();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, Integer.valueOf(i));
            contentResolver.insert(buildUri, contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int getInt(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eba56c0f", new Object[]{context, str, str2})).intValue() : getInt(context, str, str2, -1);
    }

    public static int getInt(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89088a5a", new Object[]{context, str, str2, new Integer(i)})).intValue();
        }
        Cursor query = context.getContentResolver().query(buildUri(context, 101, str, str2, Integer.valueOf(i)), null, null, null, null);
        return (query != null && query.moveToNext()) ? query.getInt(query.getColumnIndex(PreferencesProvider.COLUMNNAME)) : i;
    }

    public static boolean putLong(Context context, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d41bef1e", new Object[]{context, str, str2, new Long(j)})).booleanValue();
        }
        Uri buildUri = buildUri(context, 102, str, str2, Long.valueOf(j));
        ContentResolver contentResolver = context.getContentResolver();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, Long.valueOf(j));
            contentResolver.insert(buildUri, contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static long getLong(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ad94f7", new Object[]{context, str, str2})).longValue() : getLong(context, str, str2, -1L);
    }

    public static long getLong(Context context, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0058215", new Object[]{context, str, str2, new Long(j)})).longValue();
        }
        Cursor query = context.getContentResolver().query(buildUri(context, 102, str, str2, Long.valueOf(j)), null, null, null, null);
        return (query != null && query.moveToNext()) ? query.getLong(query.getColumnIndex(PreferencesProvider.COLUMNNAME)) : j;
    }

    public static boolean putFloat(Context context, String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47e901fc", new Object[]{context, str, str2, new Float(f)})).booleanValue();
        }
        Uri buildUri = buildUri(context, 104, str, str2, Float.valueOf(f));
        ContentResolver contentResolver = context.getContentResolver();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, Float.valueOf(f));
            contentResolver.insert(buildUri, contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static float getFloat(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93e8d1bf", new Object[]{context, str, str2})).floatValue() : getFloat(context, str, str2, -1.0f);
    }

    public static float getFloat(Context context, String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e931cfc1", new Object[]{context, str, str2, new Float(f)})).floatValue();
        }
        Cursor query = context.getContentResolver().query(buildUri(context, 104, str, str2, Float.valueOf(f)), null, null, null, null);
        return (query != null && query.moveToNext()) ? query.getFloat(query.getColumnIndex(PreferencesProvider.COLUMNNAME)) : f;
    }

    public static boolean putBoolean(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5dd3b9c", new Object[]{context, str, str2, new Boolean(z)})).booleanValue();
        }
        Uri buildUri = buildUri(context, 105, str, str2, Boolean.valueOf(z));
        ContentResolver contentResolver = context.getContentResolver();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(str2, Boolean.valueOf(z));
            contentResolver.insert(buildUri, contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean getBoolean(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b9e3c07", new Object[]{context, str, str2})).booleanValue() : getBoolean(context, str, str2, false);
    }

    public static boolean getBoolean(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4829f735", new Object[]{context, str, str2, new Boolean(z)})).booleanValue();
        }
        Cursor query = context.getContentResolver().query(buildUri(context, 105, str, str2, Boolean.valueOf(z)), null, null, null, null);
        return (query != null && query.moveToNext()) ? Boolean.valueOf(query.getString(query.getColumnIndex(PreferencesProvider.COLUMNNAME))).booleanValue() : z;
    }

    public static boolean put(Context context, String str, ContentValues contentValues) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d412684", new Object[]{context, str, contentValues})).booleanValue();
        }
        try {
            context.getContentResolver().insert(buildUri(context, 107, str, null, null), contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static Uri buildUri(Context context, int i, String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("823fb2c7", new Object[]{context, new Integer(i), str, str2, obj});
        }
        String string = PreferencesUtils.getString(context, PreferencesProvider.AUTHORITIES_SPNAME, PreferencesProvider.AUTHORITIES_KEY);
        switch (i) {
            case 100:
                return Uri.parse("content://" + string + "/string/" + str + "/" + str2 + "/" + obj);
            case 101:
                return Uri.parse("content://" + string + "/integer/" + str + "/" + str2 + "/" + obj);
            case 102:
                return Uri.parse("content://" + string + "/long/" + str + "/" + str2 + "/" + obj);
            case 103:
            default:
                return null;
            case 104:
                return Uri.parse("content://" + string + "/float/" + str + "/" + str2 + "/" + obj);
            case 105:
                return Uri.parse("content://" + string + "/boolean/" + str + "/" + str2 + "/" + obj);
            case 106:
                return Uri.parse("content://" + string + "/delete/" + str + "/" + str2);
            case 107:
                return Uri.parse("content://" + string + "/puts");
            case 108:
                return Uri.parse("content://" + string + "/clear/" + str);
        }
    }
}
