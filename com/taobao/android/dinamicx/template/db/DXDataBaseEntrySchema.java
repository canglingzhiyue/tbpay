package com.taobao.android.dinamicx.template.db;

import android.database.sqlite.SQLiteDatabase;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.db.DXDataBaseEntry;
import java.lang.reflect.Field;
import java.util.ArrayList;
import tb.fux;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public final class DXDataBaseEntrySchema {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String[] SQLITE_TYPES;
    private static final String TAG = "DXDataBaseEntrySchema";
    public static final int TYPE_BLOB = 7;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 3;
    public static final int TYPE_LONG = 4;
    public static final int TYPE_SHORT = 2;
    public static final int TYPE_STRING = 0;
    private final a[] mColumnInfo;
    private final String[] mProjection;
    private final String mTableName;

    static {
        kge.a(-1896377707);
        SQLITE_TYPES = new String[]{"TEXT", "INTEGER", "INTEGER", "INTEGER", "INTEGER", "REAL", "REAL", "NONE"};
    }

    public DXDataBaseEntrySchema(Class<? extends DXDataBaseEntry> cls) {
        a[] parseColumnInfo = parseColumnInfo(cls);
        this.mTableName = parseTableName(cls);
        this.mColumnInfo = parseColumnInfo;
        String[] strArr = new String[0];
        if (parseColumnInfo != null) {
            strArr = new String[parseColumnInfo.length];
            for (int i = 0; i != parseColumnInfo.length; i++) {
                strArr[i] = parseColumnInfo[i].f11922a;
            }
        }
        this.mProjection = strArr;
    }

    public String getTableName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f3aed216", new Object[]{this}) : this.mTableName;
    }

    public String[] getProjection() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("d4ec351b", new Object[]{this}) : this.mProjection;
    }

    private void logExecSql(SQLiteDatabase sQLiteDatabase, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccef4e3", new Object[]{this, sQLiteDatabase, str});
        } else {
            sQLiteDatabase.execSQL(str);
        }
    }

    public void createTables(SQLiteDatabase sQLiteDatabase) {
        a[] aVarArr;
        a[] aVarArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6dcfa41", new Object[]{this, sQLiteDatabase});
            return;
        }
        String str = this.mTableName;
        if (StringUtils.isEmpty(str)) {
            fux.b("DinamicX", "DataBase", "没有用注解定义表名");
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(str);
        sb2.append(" (_id INTEGER");
        for (a aVar : this.mColumnInfo) {
            if (!aVar.a()) {
                sb2.append(',');
                sb2.append(aVar.f11922a);
                sb2.append(' ');
                sb2.append(SQLITE_TYPES[aVar.b]);
                if (!StringUtils.isEmpty(aVar.e)) {
                    sb2.append(" DEFAULT ");
                    sb2.append(aVar.e);
                } else if (aVar.f) {
                    sb2.append(" NOT NULL");
                }
                if (aVar.d) {
                    sb.append(aVar.f11922a);
                    sb.append(",");
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb2.append(", PRIMARY KEY(");
            sb2.append(sb.toString());
            sb2.append(riy.BRACKET_END_STR);
        }
        sb2.append(");");
        logExecSql(sQLiteDatabase, sb2.toString());
        sb2.setLength(0);
        sb2.append("CREATE INDEX index_template ON ");
        sb2.append(str);
        sb2.append(riy.BRACKET_START_STR);
        for (a aVar2 : this.mColumnInfo) {
            if (aVar2.c) {
                sb2.append(aVar2.f11922a);
                sb2.append(",");
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(");");
        logExecSql(sQLiteDatabase, sb2.toString());
        sb2.setLength(0);
    }

    public void dropTables(SQLiteDatabase sQLiteDatabase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd68574", new Object[]{this, sQLiteDatabase});
            return;
        }
        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
        sb.append(this.mTableName);
        sb.append(';');
        logExecSql(sQLiteDatabase, sb.toString());
        sb.setLength(0);
    }

    private String parseTableName(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52223f50", new Object[]{this, cls});
        }
        DXDataBaseEntry.Table table = (DXDataBaseEntry.Table) cls.getAnnotation(DXDataBaseEntry.Table.class);
        if (table != null) {
            return table.value();
        }
        return null;
    }

    private a[] parseColumnInfo(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a[]) ipChange.ipc$dispatch("88964f71", new Object[]{this, cls});
        }
        ArrayList<a> arrayList = new ArrayList<>();
        while (cls != null) {
            parseColumnInfo(cls, arrayList);
            cls = cls.getSuperclass();
        }
        a[] aVarArr = new a[arrayList.size()];
        arrayList.toArray(aVarArr);
        return aVarArr;
    }

    private void parseColumnInfo(Class<?> cls, ArrayList<a> arrayList) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806e514b", new Object[]{this, cls, arrayList});
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i2 = 0; i2 != declaredFields.length; i2++) {
            Field field = declaredFields[i2];
            DXDataBaseEntry.Column column = (DXDataBaseEntry.Column) field.getAnnotation(DXDataBaseEntry.Column.class);
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
                arrayList.add(new a(column.value(), i, column.indexed(), column.primaryKey(), column.defaultValue(), column.notNull(), field, arrayList.size()));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f11922a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final boolean f;
        public final Field g;
        public final int h;

        static {
            kge.a(-187334989);
        }

        public a(String str, int i, boolean z, boolean z2, String str2, boolean z3, Field field, int i2) {
            this.f11922a = str.toLowerCase();
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = str2;
            this.g = field;
            this.h = i2;
            this.f = z3;
            field.setAccessible(true);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : "_id".equals(this.f11922a);
        }
    }
}
