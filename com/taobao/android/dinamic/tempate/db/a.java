package com.taobao.android.dinamic.tempate.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.db.Entry;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import tb.fxi;
import tb.kge;

/* loaded from: classes.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_BLOB = 7;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 3;
    public static final int TYPE_LONG = 4;
    public static final int TYPE_SHORT = 2;
    public static final int TYPE_STRING = 0;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f11762a;
    private String b;
    private C0471a[] c;
    private String[] d;
    private boolean e;

    static {
        kge.a(1529237446);
        f11762a = new String[]{"TEXT", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "NONE"};
    }

    public a(Class<? extends Entry> cls) {
    }

    public void a(Class<? extends Entry> cls) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{this, cls});
            return;
        }
        C0471a[] c = c(cls);
        this.b = b(cls);
        this.c = c;
        String[] strArr = new String[0];
        if (c != null) {
            strArr = new String[c.length];
            z = false;
            for (int i = 0; i != c.length; i++) {
                C0471a c0471a = c[i];
                strArr[i] = c0471a.f11763a;
                if (c0471a.d) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.d = strArr;
        this.e = z;
    }

    public String[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this}) : this.d;
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbe4fab", new Object[]{this, sQLiteDatabase, str});
        } else {
            sQLiteDatabase.execSQL(str);
        }
    }

    public <T extends Entry> T a(Cursor cursor, T t) {
        C0471a[] c0471aArr;
        try {
            for (C0471a c0471a : this.c) {
                int i = c0471a.g;
                Field field = c0471a.f;
                Object obj = null;
                switch (c0471a.b) {
                    case 0:
                        if (!cursor.isNull(i)) {
                            obj = cursor.getString(i);
                        }
                        field.set(t, obj);
                        break;
                    case 1:
                        short s = cursor.getShort(i);
                        boolean z = true;
                        if (s != 1) {
                            z = false;
                        }
                        field.setBoolean(t, z);
                        break;
                    case 2:
                        field.setShort(t, cursor.getShort(i));
                        break;
                    case 3:
                        field.setInt(t, cursor.getInt(i));
                        break;
                    case 4:
                        field.setLong(t, cursor.getLong(i));
                        break;
                    case 5:
                        field.setFloat(t, cursor.getFloat(i));
                        break;
                    case 6:
                        field.setDouble(t, cursor.getDouble(i));
                        break;
                    case 7:
                        if (!cursor.isNull(i)) {
                            obj = cursor.getBlob(i);
                        }
                        field.set(t, obj);
                        break;
                }
            }
            return t;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void a(Entry entry, ContentValues contentValues) {
        C0471a[] c0471aArr;
        try {
            for (C0471a c0471a : this.c) {
                String str = c0471a.f11763a;
                Field field = c0471a.f;
                switch (c0471a.b) {
                    case 0:
                        contentValues.put(str, (String) field.get(entry));
                        break;
                    case 1:
                        contentValues.put(str, Boolean.valueOf(field.getBoolean(entry)));
                        break;
                    case 2:
                        contentValues.put(str, Short.valueOf(field.getShort(entry)));
                        break;
                    case 3:
                        contentValues.put(str, Integer.valueOf(field.getInt(entry)));
                        break;
                    case 4:
                        contentValues.put(str, Long.valueOf(field.getLong(entry)));
                        break;
                    case 5:
                        contentValues.put(str, Float.valueOf(field.getFloat(entry)));
                        break;
                    case 6:
                        contentValues.put(str, Double.valueOf(field.getDouble(entry)));
                        break;
                    case 7:
                        contentValues.put(str, (byte[]) field.get(entry));
                        break;
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public long a(SQLiteDatabase sQLiteDatabase, Entry entry) {
        C0471a[] c0471aArr;
        if (Build.VERSION.SDK_INT == 29) {
            try {
                HashMap<String, Object> hashMap = new HashMap<>();
                for (C0471a c0471a : this.c) {
                    hashMap.put(c0471a.f11763a, c0471a.f.get(entry));
                }
                if (entry.f11761a == 0) {
                    hashMap.remove("_id");
                }
                long a2 = a(sQLiteDatabase, this.b, "_id", hashMap);
                entry.f11761a = a2;
                return a2;
            } catch (Throwable th) {
                Log.e("EntrySchema", "sdk int 29 insertOrReplace db exception", th);
                return -1L;
            }
        }
        ContentValues contentValues = new ContentValues();
        a(entry, contentValues);
        if (entry.f11761a == 0) {
            contentValues.remove("_id");
        }
        long replace = sQLiteDatabase.replace(this.b, "_id", contentValues);
        entry.f11761a = replace;
        return replace;
    }

    private long a(SQLiteDatabase sQLiteDatabase, String str, String str2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53d19ed2", new Object[]{this, sQLiteDatabase, str, str2, hashMap})).longValue();
        }
        sQLiteDatabase.acquireReference();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT");
            sb.append(" OR REPLACE ");
            sb.append(" INTO ");
            sb.append(str);
            sb.append('(');
            Object[] objArr = null;
            int size = (hashMap == null || hashMap.isEmpty()) ? 0 : hashMap.size();
            if (size > 0) {
                objArr = new Object[size];
                int i = 0;
                for (String str3 : hashMap.keySet()) {
                    sb.append(i > 0 ? "," : "");
                    sb.append(str3);
                    objArr[i] = hashMap.get(str3);
                    i++;
                }
                sb.append(')');
                sb.append(" VALUES (");
                int i2 = 0;
                while (i2 < size) {
                    sb.append(i2 > 0 ? ",?" : "?");
                    i2++;
                }
            } else {
                sb.append(str2 + ") VALUES (NULL");
            }
            sb.append(')');
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
            if (size > 0) {
                int length = objArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    if (objArr[i3] instanceof Long) {
                        compileStatement.bindLong(i3 + 1, ((Long) objArr[i3]).longValue());
                    } else if (objArr[i3] instanceof String) {
                        compileStatement.bindString(i3 + 1, (String) objArr[i3]);
                    }
                }
            }
            long executeInsert = compileStatement.executeInsert();
            compileStatement.close();
            return executeInsert;
        } finally {
            sQLiteDatabase.releaseReference();
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        C0471a[] c0471aArr;
        C0471a[] c0471aArr2;
        C0471a[] c0471aArr3;
        C0471a[] c0471aArr4;
        C0471a[] c0471aArr5;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cd8c21", new Object[]{this, sQLiteDatabase});
            return;
        }
        String str = this.b;
        if (str == null) {
            z = false;
        }
        c.a(z);
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(str);
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT");
        for (C0471a c0471a : this.c) {
            if (!c0471a.a()) {
                sb.append(',');
                sb.append(c0471a.f11763a);
                sb.append(' ');
                sb.append(f11762a[c0471a.b]);
                if (!StringUtils.isEmpty(c0471a.e)) {
                    sb.append(" DEFAULT ");
                    sb.append(c0471a.e);
                }
            }
        }
        sb.append(");");
        a(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        for (C0471a c0471a2 : this.c) {
            if (c0471a2.c) {
                sb.append("CREATE INDEX ");
                sb.append(str);
                sb.append("_index_");
                sb.append(c0471a2.f11763a);
                sb.append(" ON ");
                sb.append(str);
                sb.append(" (");
                sb.append(c0471a2.f11763a);
                sb.append(");");
                a(sQLiteDatabase, sb.toString());
                sb.setLength(0);
            }
        }
        if (!this.e) {
            return;
        }
        String str2 = str + "_fulltext";
        sb.append("CREATE VIRTUAL TABLE ");
        sb.append(str2);
        sb.append(" USING FTS3 (_id INTEGER PRIMARY KEY");
        for (C0471a c0471a3 : this.c) {
            if (c0471a3.d) {
                String str3 = c0471a3.f11763a;
                sb.append(',');
                sb.append(str3);
                sb.append(" TEXT");
            }
        }
        sb.append(");");
        a(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        StringBuilder sb2 = new StringBuilder("INSERT OR REPLACE INTO ");
        sb2.append(str2);
        sb2.append(" (_id");
        for (C0471a c0471a4 : this.c) {
            if (c0471a4.d) {
                sb2.append(',');
                sb2.append(c0471a4.f11763a);
            }
        }
        sb2.append(") VALUES (new._id");
        for (C0471a c0471a5 : this.c) {
            if (c0471a5.d) {
                sb2.append(",new.");
                sb2.append(c0471a5.f11763a);
            }
        }
        sb2.append(");");
        String sb3 = sb2.toString();
        sb.append("CREATE TRIGGER ");
        sb.append(str);
        sb.append("_insert_trigger AFTER INSERT ON ");
        sb.append(str);
        sb.append(" FOR EACH ROW BEGIN ");
        sb.append(sb3);
        sb.append("END;");
        a(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        sb.append("CREATE TRIGGER ");
        sb.append(str);
        sb.append("_update_trigger AFTER UPDATE ON ");
        sb.append(str);
        sb.append(" FOR EACH ROW BEGIN ");
        sb.append(sb3);
        sb.append("END;");
        a(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        sb.append("CREATE TRIGGER ");
        sb.append(str);
        sb.append("_delete_trigger AFTER DELETE ON ");
        sb.append(str);
        sb.append(" FOR EACH ROW BEGIN DELETE FROM ");
        sb.append(str2);
        sb.append(" WHERE _id = old._id; END;");
        a(sQLiteDatabase, sb.toString());
        sb.setLength(0);
    }

    public void b(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6e4ea2", new Object[]{this, sQLiteDatabase});
            return;
        }
        String str = this.b;
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
        sb.append(str);
        sb.append(';');
        a(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        if (!this.e) {
            return;
        }
        sb.append("DROP TABLE IF EXISTS ");
        sb.append(str);
        sb.append("_fulltext");
        sb.append(';');
        a(sQLiteDatabase, sb.toString());
    }

    private String b(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c798a8ac", new Object[]{this, cls});
        }
        Entry.Table table = (Entry.Table) cls.getAnnotation(Entry.Table.class);
        if (table != null) {
            return table.value();
        }
        return null;
    }

    private C0471a[] c(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0471a[]) ipChange.ipc$dispatch("df7a587e", new Object[]{this, cls});
        }
        ArrayList<C0471a> arrayList = new ArrayList<>();
        while (cls != null) {
            a(cls, arrayList);
            cls = cls.getSuperclass();
        }
        C0471a[] c0471aArr = new C0471a[arrayList.size()];
        arrayList.toArray(c0471aArr);
        return c0471aArr;
    }

    private void a(Class<?> cls, ArrayList<C0471a> arrayList) {
        Entry.Column column;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd8f8f5", new Object[]{this, cls, arrayList});
        } else if (cls != null) {
            try {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields == null) {
                    return;
                }
                for (int i2 = 0; i2 != declaredFields.length; i2++) {
                    Field field = declaredFields[i2];
                    if (field != null && (column = (Entry.Column) field.getAnnotation(Entry.Column.class)) != null) {
                        Class<?> type = field.getType();
                        if (type == String.class) {
                            i = 0;
                        } else if (type == Boolean.TYPE) {
                            i = 1;
                        } else if (type == Short.TYPE) {
                            i = 2;
                        } else if (type == Integer.TYPE) {
                            i = 3;
                        } else if (type == Long.TYPE) {
                            i = 4;
                        } else if (type == Float.TYPE) {
                            i = 5;
                        } else if (type == Double.TYPE) {
                            i = 6;
                        } else if (type != byte[].class) {
                            throw new IllegalArgumentException("Unsupported field type for column: " + type.getName());
                        } else {
                            i = 7;
                        }
                        arrayList.add(new C0471a(column.value(), i, column.indexed(), column.fullText(), column.defaultValue(), field, arrayList.size()));
                    }
                }
            } catch (Throwable th) {
                s sVar = new s(fxi.c);
                s.a aVar = new s.a("native", DXMonitorConstant.NATIVE_CRASH, s.DX_NATIVE_CRASH_16);
                aVar.e = fxi.a() + "_trace: " + com.taobao.android.dinamicx.exception.a.a(th);
                sVar.c.add(aVar);
                com.taobao.android.dinamicx.monitor.b.a(sVar);
            }
        }
    }

    /* renamed from: com.taobao.android.dinamic.tempate.db.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0471a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f11763a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final Field f;
        public final int g;

        static {
            kge.a(-46878);
        }

        public C0471a(String str, int i, boolean z, boolean z2, String str2, Field field, int i2) {
            this.f11763a = str.toLowerCase();
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = str2;
            this.f = field;
            this.g = i2;
            field.setAccessible(true);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "_id".equals(this.f11763a);
        }
    }
}
