package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfsadapter.g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class aoe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private aoh b;
    private String c;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, Boolean> f25467a = new HashMap<>();
    private HashMap<Class<?>, List<Field>> d = new HashMap<>();
    private HashMap<Field, String> e = new HashMap<>();
    private HashMap<Class<?>, String> f = new HashMap<>();

    static {
        kge.a(1935578959);
    }

    public aoe(Context context, String str) {
        this.b = new aoh(context, str);
        this.c = str;
    }

    public synchronized List<? extends aof> a(Class<? extends aof> cls, String str, String str2, int i) {
        List<? extends aof> list;
        aoh aohVar;
        Object valueOf;
        List<? extends aof> list2 = Collections.EMPTY_LIST;
        if (cls == null) {
            return list2;
        }
        String a2 = a(cls);
        SQLiteDatabase a3 = a(cls, a2);
        if (a3 == null) {
            apr.b("DBMgr", "[find] db is null. tableName", a2);
            return list2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ");
        sb.append(a2);
        sb.append(StringUtils.isEmpty(str) ? "" : " WHERE " + str);
        sb.append(StringUtils.isEmpty(str2) ? "" : " ORDER BY " + str2);
        sb.append(i <= 0 ? "" : " LIMIT " + i);
        String sb2 = sb.toString();
        apr.a("DBMgr", g.CACHE_SQL, sb2);
        Cursor cursor = null;
        try {
            cursor = a3.rawQuery(sb2, null);
            list = new ArrayList<>();
        } catch (Throwable th) {
            th = th;
            list = list2;
        }
        try {
            List<Field> e = e(cls);
            while (cursor != null) {
                if (!cursor.moveToNext()) {
                    break;
                }
                aof newInstance = cls.newInstance();
                for (int i2 = 0; i2 < e.size(); i2++) {
                    Field field = e.get(i2);
                    Class<?> type = field.getType();
                    String a4 = a(field);
                    int columnIndex = cursor.getColumnIndex(a4);
                    if (columnIndex != -1) {
                        try {
                            if (type != Long.class && type != Long.TYPE) {
                                if (type != Integer.class && type != Integer.TYPE) {
                                    if (type != Double.TYPE && type != Double.class) {
                                        valueOf = cursor.getString(columnIndex);
                                        field.set(newInstance, valueOf);
                                    }
                                    valueOf = Double.valueOf(cursor.getDouble(columnIndex));
                                    field.set(newInstance, valueOf);
                                }
                                valueOf = Integer.valueOf(cursor.getInt(columnIndex));
                                field.set(newInstance, valueOf);
                            }
                            field.set(newInstance, valueOf);
                        } catch (Exception e2) {
                            try {
                                if ((e2 instanceof IllegalArgumentException) && (valueOf instanceof String)) {
                                    field.set(newInstance, Boolean.valueOf((String) valueOf));
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        valueOf = Long.valueOf(cursor.getLong(columnIndex));
                    } else {
                        apr.c("DBMgr", "can not get field", a4);
                    }
                }
                list.add(newInstance);
            }
            this.b.a(cursor);
            aohVar = this.b;
        } catch (Throwable th2) {
            th = th2;
            apr.c("DBMgr", "[get]", th);
            this.b.a(cursor);
            aohVar = this.b;
            aohVar.a(a3);
            return list;
        }
        aohVar.a(a3);
        return list;
    }

    public void a(aof aofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06691e0", new Object[]{this, aofVar});
        } else if (aofVar == null) {
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(aofVar);
            a(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void a(List<? extends aof> list) {
        if (list != null) {
            if (list.size() != 0) {
                String a2 = a(list.get(0).getClass());
                SQLiteDatabase a3 = a(list.get(0).getClass(), a2);
                if (a3 == null) {
                    apr.c("DBMgr", "[insert]can not get available db. tableName", a2);
                    return;
                }
                if (list != null) {
                    apr.b("DBMgr", "entities.size", Integer.valueOf(list.size()));
                }
                try {
                    try {
                        List<Field> e = e(list.get(0).getClass());
                        ContentValues contentValues = new ContentValues();
                        a3.beginTransaction();
                        for (int i = 0; i < list.size(); i++) {
                            aof aofVar = list.get(i);
                            for (int i2 = 0; i2 < e.size(); i2++) {
                                Field field = e.get(i2);
                                String a4 = a(field);
                                try {
                                    Object obj = field.get(aofVar);
                                    if (obj != null) {
                                        contentValues.put(a4, obj + "");
                                    } else {
                                        contentValues.put(a4, "");
                                    }
                                } catch (Exception e2) {
                                    apr.c("DBMgr", "get field failed", e2);
                                } catch (Throwable th) {
                                    try {
                                        a3.setTransactionSuccessful();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        a3.endTransaction();
                                    } catch (Exception unused2) {
                                    }
                                    this.b.a(a3);
                                    throw th;
                                }
                            }
                            if (aofVar.c == -1) {
                                contentValues.remove("_id");
                                long insert = a3.insert(a2, null, contentValues);
                                if (insert != -1) {
                                    aofVar.c = insert;
                                }
                            } else {
                                a3.update(a2, contentValues, "_id=?", new String[]{String.valueOf(aofVar.c)});
                            }
                            contentValues.clear();
                        }
                        try {
                            a3.setTransactionSuccessful();
                        } catch (Exception unused3) {
                        }
                        try {
                            a3.endTransaction();
                        } catch (Exception unused4) {
                        }
                        this.b.a(a3);
                    } catch (Exception unused5) {
                        try {
                            a3.endTransaction();
                        } catch (Exception unused6) {
                        }
                        this.b.a(a3);
                    }
                } catch (Throwable unused7) {
                    a3.setTransactionSuccessful();
                    a3.endTransaction();
                    this.b.a(a3);
                }
            }
        }
    }

    public synchronized int b(List<? extends aof> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39e1ecd", new Object[]{this, list})).intValue();
        }
        if (list != null && list.size() != 0) {
            String a2 = a(list.get(0).getClass());
            SQLiteDatabase a3 = a(list.get(0).getClass(), a2);
            if (a3 == null) {
                apr.b("DBMgr", "[delete] db is null. tableName", a2);
                return 0;
            }
            a3.beginTransaction();
            StringBuffer stringBuffer = new StringBuffer();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                if (arrayList.size() > 0) {
                    stringBuffer.append(" OR ");
                }
                stringBuffer.append("_id=?");
                arrayList.add(String.valueOf(list.get(i).c));
                if (arrayList.size() == 20) {
                    String[] strArr = new String[arrayList.size()];
                    arrayList.toArray(strArr);
                    long delete = a3.delete(a2, stringBuffer.toString(), strArr);
                    if (delete == arrayList.size()) {
                        apr.b("DBMgr", "delete success. DbName", this.c, "tableName", a2, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete));
                    } else {
                        apr.b("DBMgr", "delete fail. DbName", this.c, "tableName", a2, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete));
                    }
                    stringBuffer.delete(0, stringBuffer.length());
                    arrayList.clear();
                }
            }
            if (arrayList.size() > 0) {
                String[] strArr2 = new String[arrayList.size()];
                arrayList.toArray(strArr2);
                long delete2 = a3.delete(a2, stringBuffer.toString(), strArr2);
                if (delete2 == arrayList.size()) {
                    apr.b("DBMgr", "delete success. DbName", this.c, "tableName", a2, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete2));
                } else {
                    apr.b("DBMgr", "delete fail. DbName", this.c, "tableName", a2, "whereArgs size", Integer.valueOf(arrayList.size()), "ret size", Long.valueOf(delete2));
                }
            }
            try {
                a3.setTransactionSuccessful();
            } catch (Throwable unused) {
            }
            try {
                a3.endTransaction();
            } catch (Throwable unused2) {
            }
            this.b.a(a3);
            return list.size();
        }
        return 0;
    }

    public int b(aof aofVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cee99854", new Object[]{this, aofVar})).intValue();
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(aofVar);
        return b(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void c(List<? extends aof> list) {
        if (list != null) {
            if (list.size() != 0) {
                String a2 = a(list.get(0).getClass());
                SQLiteDatabase a3 = a(list.get(0).getClass(), a2);
                if (a3 == null) {
                    apr.b("DBMgr", "[update] db is null. tableName", a2);
                    return;
                }
                try {
                    try {
                        a3.beginTransaction();
                        List<Field> e = e(list.get(0).getClass());
                        for (int i = 0; i < list.size(); i++) {
                            ContentValues contentValues = new ContentValues();
                            for (int i2 = 0; i2 < e.size(); i2++) {
                                Field field = e.get(i2);
                                try {
                                    field.setAccessible(true);
                                    String a4 = a(field);
                                    contentValues.put(a4, field.get(list.get(i)) + "");
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            a3.update(a2, contentValues, "_id=?", new String[]{list.get(i).c + ""});
                        }
                        try {
                            a3.setTransactionSuccessful();
                        } catch (Exception unused) {
                        }
                        try {
                            a3.endTransaction();
                        } catch (Exception unused2) {
                        }
                        this.b.a(a3);
                    } catch (Exception unused3) {
                        try {
                            a3.endTransaction();
                        } catch (Exception unused4) {
                        }
                        this.b.a(a3);
                    }
                } catch (Exception unused5) {
                    a3.setTransactionSuccessful();
                    a3.endTransaction();
                    this.b.a(a3);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void d(List<? extends aof> list) {
        if (list != null) {
            if (list.size() != 0) {
                String a2 = a(list.get(0).getClass());
                SQLiteDatabase a3 = a(list.get(0).getClass(), a2);
                if (a3 == null) {
                    apr.b("DBMgr", "[updateLogPriority] db is null. tableName", a2);
                    return;
                }
                try {
                    try {
                        a3.beginTransaction();
                        List<Field> e = e(list.get(0).getClass());
                        for (int i = 0; i < list.size(); i++) {
                            ContentValues contentValues = new ContentValues();
                            for (int i2 = 0; i2 < e.size(); i2++) {
                                Field field = e.get(i2);
                                String a4 = a(field);
                                if (a4 != null && a4.equalsIgnoreCase("priority")) {
                                    try {
                                        field.setAccessible(true);
                                        contentValues.put(a4, field.get(list.get(i)) + "");
                                        a3.update(a2, contentValues, "_id=?", new String[]{list.get(i).c + ""});
                                        break;
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                        }
                        try {
                            a3.setTransactionSuccessful();
                        } catch (Exception unused) {
                        }
                        try {
                            a3.endTransaction();
                        } catch (Exception unused2) {
                        }
                        this.b.a(a3);
                    } catch (Exception unused3) {
                        a3.setTransactionSuccessful();
                        try {
                            a3.endTransaction();
                        } catch (Exception unused4) {
                        }
                        this.b.a(a3);
                    }
                } catch (Exception unused5) {
                    a3.endTransaction();
                    this.b.a(a3);
                }
            }
        }
    }

    public synchronized int a(Class<? extends aof> cls, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5050c53", new Object[]{this, cls, str, strArr})).intValue();
        }
        if (cls != null) {
            SQLiteDatabase a2 = a(cls, a(cls));
            if (a2 == null) {
                return 0;
            }
            i = a2.delete(a(cls), str, strArr);
            this.b.a(a2);
        }
        return i;
    }

    public String a(Class<?> cls) {
        String replace;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe97b16b", new Object[]{this, cls});
        }
        if (cls == null) {
            apr.e("DBMgr", "cls is null");
            return null;
        } else if (this.f.containsKey(cls)) {
            return this.f.get(cls);
        } else {
            TableName tableName = (TableName) cls.getAnnotation(TableName.class);
            if (tableName != null && !StringUtils.isEmpty(tableName.value())) {
                replace = tableName.value();
            } else {
                replace = cls.getName().replace(".", "_");
            }
            this.f.put(cls, replace);
            return replace;
        }
    }

    private SQLiteDatabase a(Class<? extends aof> cls, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            return (SQLiteDatabase) ipChange.ipc$dispatch("121ba2d0", new Object[]{this, cls, str});
        }
        SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
        Boolean bool = this.f25467a.get(str) != null && this.f25467a.get(str).booleanValue();
        if (cls != null && !bool.booleanValue() && writableDatabase != null) {
            List<Field> e = e(cls);
            ArrayList<Field> arrayList = new ArrayList<>();
            String str2 = " SELECT * FROM " + str + " LIMIT 0";
            if (e != null) {
                Cursor cursor = null;
                try {
                    cursor = writableDatabase.rawQuery(str2, null);
                } catch (Exception unused) {
                    apr.b("DBMgr", "has not create table", str);
                }
                if (cursor != null) {
                    i2 = 0;
                }
                while (i < e.size()) {
                    Field field = e.get(i);
                    if (!"_id".equalsIgnoreCase(a(field)) && (i2 != 0 || (cursor != null && cursor.getColumnIndex(a(field)) == -1))) {
                        arrayList.add(field);
                    }
                    i++;
                }
                this.b.a(cursor);
                i = i2;
            }
            if (i != 0) {
                b(writableDatabase, str, arrayList);
            } else if (arrayList.size() > 0) {
                a(writableDatabase, str, arrayList);
            }
            this.f25467a.put(str, true);
        }
        return writableDatabase;
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, ArrayList<Field> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7952df", new Object[]{this, sQLiteDatabase, str, arrayList});
            return;
        }
        String str2 = "ALTER TABLE " + str + " ADD COLUMN ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(str2);
            sb.append(a(arrayList.get(i)));
            sb.append(" ");
            sb.append(d(arrayList.get(i).getType()));
            String sb2 = sb.toString();
            try {
                sQLiteDatabase.execSQL(sb2);
            } catch (Exception e) {
                apr.c("DBMgr", "update db error...", e);
            }
            sb.delete(0, sb2.length());
            apr.b("DBMgr", null, "excute sql:", sb2);
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase, String str, ArrayList<Field> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778b13e", new Object[]{this, sQLiteDatabase, str, arrayList});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT ,");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                Class<?> type = arrayList.get(i).getType();
                sb.append(" ");
                sb.append(a(arrayList.get(i)));
                sb.append(" ");
                sb.append(d(type));
                sb.append(" ");
                sb.append(f(type));
            }
        }
        sb.append(" );");
        String sb2 = sb.toString();
        apr.b("DBMgr", "excute sql:", sb2);
        try {
            sQLiteDatabase.execSQL(sb2);
        } catch (Exception e) {
            apr.c("DBMgr", "create db error", e);
        }
    }

    private String d(Class<?> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("599a972e", new Object[]{this, cls}) : (cls == Long.TYPE || cls == Integer.TYPE || cls == Long.class) ? "INTEGER" : "TEXT";
    }

    public synchronized int b(Class<? extends aof> cls) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7800267", new Object[]{this, cls})).intValue();
        } else if (cls == null) {
            return 0;
        } else {
            String a2 = a(cls);
            SQLiteDatabase a3 = a(cls, a2);
            if (a3 != null) {
                Cursor rawQuery = a3.rawQuery("SELECT count(*) FROM " + a2, null);
                if (rawQuery != null) {
                    rawQuery.moveToFirst();
                    i = rawQuery.getInt(0);
                }
                this.b.a(rawQuery);
                this.b.a(a3);
            } else {
                apr.b("DBMgr", "[count] db is null. tableName", a2);
            }
            return i;
        }
    }

    public synchronized void c(Class<? extends aof> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e05bd13", new Object[]{this, cls});
        } else if (cls == null) {
        } else {
            a(a(cls));
        }
    }

    public synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null) {
        } else {
            try {
                SQLiteDatabase writableDatabase = this.b.getWritableDatabase();
                if (writableDatabase != null) {
                    writableDatabase.delete(str, null, null);
                    this.b.a(writableDatabase);
                }
            } catch (Exception e) {
                apr.b("delete db data", e, new Object[0]);
            }
        }
    }

    private List<Field> e(Class cls) {
        Field[] declaredFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3dd193d6", new Object[]{this, cls});
        }
        if (this.d.containsKey(cls)) {
            return this.d.get(cls);
        }
        List<Field> emptyList = Collections.emptyList();
        if (cls != null) {
            emptyList = new ArrayList<>();
            for (Field field : cls.getDeclaredFields()) {
                if (field.getAnnotation(Ingore.class) == null && !field.isSynthetic()) {
                    field.setAccessible(true);
                    emptyList.add(field);
                }
            }
            if (cls.getSuperclass() != null && cls.getSuperclass() != Object.class) {
                emptyList.addAll(e(cls.getSuperclass()));
            }
            this.d.put(cls, emptyList);
        }
        return emptyList;
    }

    private String a(Field field) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a98601b", new Object[]{this, field});
        }
        if (this.e.containsKey(field)) {
            return this.e.get(field);
        }
        Column column = (Column) field.getAnnotation(Column.class);
        if (column != null && !StringUtils.isEmpty(column.value())) {
            name = column.value();
        } else {
            name = field.getName();
        }
        this.e.put(field, name);
        return name;
    }

    private String f(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb9c85b0", new Object[]{this, cls}) : (cls == Long.TYPE || cls == Integer.TYPE || cls == Long.class) ? "default 0" : "default \"\"";
    }
}
