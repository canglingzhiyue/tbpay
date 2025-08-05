package com.taobao.android.trade.template.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.template.db.Entry;
import java.lang.reflect.Field;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
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
    private static final String[] f15633a;
    private final String b;
    private final C0604a[] c;
    private final String[] d;
    private final boolean e;

    static {
        kge.a(-89542375);
        f15633a = new String[]{"TEXT", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "NONE"};
    }

    public a(Class<? extends Entry> cls) {
        C0604a[] b = b(cls);
        this.b = a(cls);
        this.c = b;
        boolean z = false;
        String[] strArr = new String[0];
        if (b != null) {
            strArr = new String[b.length];
            boolean z2 = false;
            for (int i = 0; i != b.length; i++) {
                C0604a c0604a = b[i];
                strArr[i] = c0604a.f15634a;
                if (c0604a.d) {
                    z2 = true;
                }
            }
            z = z2;
        }
        this.d = strArr;
        this.e = z;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
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
        C0604a[] c0604aArr;
        try {
            for (C0604a c0604a : this.c) {
                int i = c0604a.g;
                Field field = c0604a.f;
                Object obj = null;
                switch (c0604a.b) {
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
        C0604a[] c0604aArr;
        try {
            for (C0604a c0604a : this.c) {
                String str = c0604a.f15634a;
                Field field = c0604a.f;
                switch (c0604a.b) {
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("135af66c", new Object[]{this, sQLiteDatabase, entry})).longValue();
        }
        ContentValues contentValues = new ContentValues();
        a(entry, contentValues);
        if (entry.f15632a == 0) {
            contentValues.remove("_id");
        }
        long replace = sQLiteDatabase.replace(this.b, "_id", contentValues);
        entry.f15632a = replace;
        return replace;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        C0604a[] c0604aArr;
        C0604a[] c0604aArr2;
        C0604a[] c0604aArr3;
        C0604a[] c0604aArr4;
        C0604a[] c0604aArr5;
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
        for (C0604a c0604a : this.c) {
            if (!c0604a.a()) {
                sb.append(',');
                sb.append(c0604a.f15634a);
                sb.append(' ');
                sb.append(f15633a[c0604a.b]);
                if (!TextUtils.isEmpty(c0604a.e)) {
                    sb.append(" DEFAULT ");
                    sb.append(c0604a.e);
                }
            }
        }
        sb.append(");");
        a(sQLiteDatabase, sb.toString());
        sb.setLength(0);
        for (C0604a c0604a2 : this.c) {
            if (c0604a2.c) {
                sb.append("CREATE INDEX ");
                sb.append(str);
                sb.append("_index_");
                sb.append(c0604a2.f15634a);
                sb.append(" ON ");
                sb.append(str);
                sb.append(" (");
                sb.append(c0604a2.f15634a);
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
        for (C0604a c0604a3 : this.c) {
            if (c0604a3.d) {
                String str3 = c0604a3.f15634a;
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
        for (C0604a c0604a4 : this.c) {
            if (c0604a4.d) {
                sb2.append(',');
                sb2.append(c0604a4.f15634a);
            }
        }
        sb2.append(") VALUES (new._id");
        for (C0604a c0604a5 : this.c) {
            if (c0604a5.d) {
                sb2.append(",new.");
                sb2.append(c0604a5.f15634a);
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

    private String a(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe97b16b", new Object[]{this, cls});
        }
        Entry.Table table = (Entry.Table) cls.getAnnotation(Entry.Table.class);
        if (table != null) {
            return table.value();
        }
        return null;
    }

    private C0604a[] b(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C0604a[]) ipChange.ipc$dispatch("9d8939c4", new Object[]{this, cls});
        }
        ArrayList<C0604a> arrayList = new ArrayList<>();
        while (cls != null) {
            a(cls, arrayList);
            cls = cls.getSuperclass();
        }
        C0604a[] c0604aArr = new C0604a[arrayList.size()];
        arrayList.toArray(c0604aArr);
        return c0604aArr;
    }

    private void a(Class<?> cls, ArrayList<C0604a> arrayList) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd8f8f5", new Object[]{this, cls, arrayList});
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i2 = 0; i2 != declaredFields.length; i2++) {
            Field field = declaredFields[i2];
            Entry.Column column = (Entry.Column) field.getAnnotation(Entry.Column.class);
            if (column != null) {
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
                arrayList.add(new C0604a(column.value(), i, column.indexed(), column.fullText(), column.defaultValue(), field, arrayList.size()));
            }
        }
    }

    /* renamed from: com.taobao.android.trade.template.db.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0604a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f15634a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final Field f;
        public final int g;

        static {
            kge.a(1860036015);
        }

        public C0604a(String str, int i, boolean z, boolean z2, String str2, Field field, int i2) {
            this.f15634a = str.toLowerCase();
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
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "_id".equals(this.f15634a);
        }
    }
}
