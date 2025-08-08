package com.loc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import mtopsdk.common.util.StringUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class az {
    private static Map<Class<? extends ay>, ay> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private bc f7674a;
    private SQLiteDatabase b;
    private ay c;

    public az(Context context, ay ayVar) {
        try {
            this.f7674a = new bc(context.getApplicationContext(), ayVar.a(), ayVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.c = ayVar;
    }

    private static ContentValues a(Object obj, ba baVar) {
        Field[] a2;
        ContentValues contentValues = new ContentValues();
        for (Field field : a(obj.getClass(), baVar.b())) {
            field.setAccessible(true);
            a(obj, field, contentValues);
        }
        return contentValues;
    }

    private SQLiteDatabase a() {
        try {
            if (this.b == null) {
                this.b = this.f7674a.getReadableDatabase();
            }
        } catch (Throwable th) {
            as.a(th, "dbs", "grd");
        }
        return this.b;
    }

    public static synchronized ay a(Class<? extends ay> cls) throws IllegalAccessException, InstantiationException {
        ay ayVar;
        synchronized (az.class) {
            if (d.get(cls) == null) {
                d.put(cls, cls.newInstance());
            }
            ayVar = d.get(cls);
        }
        return ayVar;
    }

    private static <T> T a(Cursor cursor, Class<T> cls, ba baVar) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Object valueOf;
        Field[] a2 = a((Class<?>) cls, baVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : a2) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(bb.class);
            if (annotation != null) {
                bb bbVar = (bb) annotation;
                int b = bbVar.b();
                int columnIndex = cursor.getColumnIndex(bbVar.a());
                switch (b) {
                    case 1:
                        valueOf = Short.valueOf(cursor.getShort(columnIndex));
                        field.set(newInstance, valueOf);
                        break;
                    case 2:
                        valueOf = Integer.valueOf(cursor.getInt(columnIndex));
                        field.set(newInstance, valueOf);
                        break;
                    case 3:
                        valueOf = Float.valueOf(cursor.getFloat(columnIndex));
                        field.set(newInstance, valueOf);
                        break;
                    case 4:
                        valueOf = Double.valueOf(cursor.getDouble(columnIndex));
                        field.set(newInstance, valueOf);
                        break;
                    case 5:
                        valueOf = Long.valueOf(cursor.getLong(columnIndex));
                        field.set(newInstance, valueOf);
                        break;
                    case 6:
                        valueOf = cursor.getString(columnIndex);
                        field.set(newInstance, valueOf);
                        break;
                    case 7:
                        field.set(newInstance, cursor.getBlob(columnIndex));
                        break;
                }
            }
        }
        return newInstance;
    }

    private static <T> String a(ba baVar) {
        if (baVar == null) {
            return null;
        }
        return baVar.a();
    }

    private static <T> void a(SQLiteDatabase sQLiteDatabase, T t) {
        ba b = b((Class) t.getClass());
        String a2 = a(b);
        if (StringUtils.isEmpty(a2) || t == null || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.insert(a2, null, a(t, b));
    }

    private <T> void a(T t) {
        b((az) t);
    }

    private static void a(Object obj, Field field, ContentValues contentValues) {
        Annotation annotation = field.getAnnotation(bb.class);
        if (annotation == null) {
            return;
        }
        bb bbVar = (bb) annotation;
        try {
            switch (bbVar.b()) {
                case 1:
                    contentValues.put(bbVar.a(), Short.valueOf(field.getShort(obj)));
                    return;
                case 2:
                    contentValues.put(bbVar.a(), Integer.valueOf(field.getInt(obj)));
                    return;
                case 3:
                    contentValues.put(bbVar.a(), Float.valueOf(field.getFloat(obj)));
                    return;
                case 4:
                    contentValues.put(bbVar.a(), Double.valueOf(field.getDouble(obj)));
                    return;
                case 5:
                    contentValues.put(bbVar.a(), Long.valueOf(field.getLong(obj)));
                    return;
                case 6:
                    contentValues.put(bbVar.a(), (String) field.get(obj));
                    return;
                case 7:
                    contentValues.put(bbVar.a(), (byte[]) field.get(obj));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private <T> void a(String str, Object obj) {
        synchronized (this.c) {
            if (obj == null) {
                return;
            }
            ba b = b((Class) obj.getClass());
            String a2 = a(b);
            if (StringUtils.isEmpty(a2)) {
                return;
            }
            ContentValues a3 = a(obj, b);
            this.b = b();
            if (this.b == null) {
                return;
            }
            this.b.update(a2, a3, str, null);
            if (this.b != null) {
                this.b.close();
                this.b = null;
            }
        }
    }

    private static Field[] a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        return z ? cls.getSuperclass().getDeclaredFields() : cls.getDeclaredFields();
    }

    private SQLiteDatabase b() {
        try {
            if (this.b == null || this.b.isReadOnly()) {
                if (this.b != null) {
                    this.b.close();
                }
                this.b = this.f7674a.getWritableDatabase();
            }
        } catch (Throwable th) {
            as.a(th, "dbs", "gwd");
        }
        return this.b;
    }

    private static <T> ba b(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(ba.class);
        if (!(annotation != null)) {
            return null;
        }
        return (ba) annotation;
    }

    private <T> List<T> b(String str, Class<T> cls) {
        Cursor cursor;
        String str2;
        String str3;
        synchronized (this.c) {
            ArrayList arrayList = new ArrayList();
            ba b = b((Class) cls);
            String a2 = a(b);
            if (this.b == null) {
                this.b = a();
            }
            if (this.b == null || StringUtils.isEmpty(a2) || str == null) {
                return arrayList;
            }
            try {
                cursor = this.b.query(a2, null, str, null, null, null, null);
            } catch (Throwable th) {
                th = th;
                cursor = null;
            }
            try {
            } catch (Throwable th2) {
                th = th2;
                as.a(th, "dbs", "sld");
                if (cursor != null) {
                    cursor.close();
                }
                try {
                    if (this.b != null) {
                        this.b.close();
                        this.b = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str2 = "dbs";
                    str3 = "sld";
                    as.a(th, str2, str3);
                    return arrayList;
                }
                return arrayList;
            }
            if (cursor == null) {
                this.b.close();
                this.b = null;
                if (cursor != null) {
                    cursor.close();
                }
                if (this.b != null) {
                    this.b.close();
                    this.b = null;
                }
                return arrayList;
            }
            while (cursor.moveToNext()) {
                arrayList.add(a(cursor, cls, b));
            }
            if (cursor != null) {
                cursor.close();
            }
            try {
                if (this.b != null) {
                    this.b.close();
                    this.b = null;
                }
            } catch (Throwable th4) {
                th = th4;
                str2 = "dbs";
                str3 = "sld";
                as.a(th, str2, str3);
                return arrayList;
            }
            return arrayList;
        }
    }

    private <T> void b(T t) {
        synchronized (this.c) {
            this.b = b();
            if (this.b == null) {
                return;
            }
            a(this.b, t);
            if (this.b != null) {
                this.b.close();
                this.b = null;
            }
        }
    }

    private <T> void b(String str, Object obj) {
        a(str, obj);
    }

    public final <T> List<T> a(String str, Class<T> cls) {
        return b(str, (Class) cls);
    }

    public final void a(Object obj, String str) {
        synchronized (this.c) {
            List a2 = a(str, (Class) obj.getClass());
            if (a2 != null && a2.size() != 0) {
                b(str, obj);
            }
            a((az) obj);
        }
    }
}
