package tb;

import android.text.TextUtils;
import java.lang.reflect.Field;

/* loaded from: classes9.dex */
public final class tll {

    /* renamed from: a  reason: collision with root package name */
    public final long f34191a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    static {
        kge.a(-1099764320);
    }

    public tll(long j, long j2, int i, long j3, int i2, int i3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f34191a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = i2;
        this.f = i3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
        this.k = j8;
        this.l = j9;
        this.m = j10;
    }

    public tll() {
        this.f34191a = 0L;
        this.b = 0L;
        this.c = 0;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    public tll(Object obj) {
        Long l;
        Integer num;
        Long l2;
        Integer num2;
        Integer num3;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        if (obj == null) {
            throw new NullPointerException();
        }
        try {
            Field[] fields = obj.getClass().getFields();
            Long l10 = null;
            if (fields == null || fields.length == 0) {
                l = null;
                num = null;
                l2 = null;
                num2 = null;
                num3 = null;
                l3 = null;
                l4 = null;
                l5 = null;
                l6 = null;
                l7 = null;
                l8 = null;
                l9 = null;
            } else {
                int length = fields.length;
                Long l11 = null;
                l = null;
                num = null;
                l2 = null;
                num2 = null;
                num3 = null;
                l3 = null;
                l4 = null;
                l5 = null;
                l6 = null;
                l7 = null;
                l8 = null;
                l9 = null;
                int i = 0;
                while (i < length) {
                    Field field = fields[i];
                    Field[] fieldArr = fields;
                    String name = field.getName();
                    int i2 = length;
                    if (TextUtils.equals(name, "st_dev")) {
                        l11 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_ino")) {
                        l = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_mode")) {
                        num = (Integer) field.get(obj);
                    } else if (TextUtils.equals(name, "st_nlink")) {
                        l2 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_uid")) {
                        num2 = (Integer) field.get(obj);
                    } else if (TextUtils.equals(name, "st_gid")) {
                        num3 = (Integer) field.get(obj);
                    } else if (TextUtils.equals(name, "st_rdev")) {
                        l3 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_size")) {
                        l4 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_atime")) {
                        l5 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_mtime")) {
                        l6 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_ctime")) {
                        l7 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_blksize")) {
                        l8 = (Long) field.get(obj);
                    } else if (TextUtils.equals(name, "st_blocks")) {
                        l9 = (Long) field.get(obj);
                    }
                    i++;
                    fields = fieldArr;
                    length = i2;
                }
                l10 = l11;
            }
            long j = 0;
            this.f34191a = l10 != null ? l10.longValue() : 0L;
            this.b = l != null ? l.longValue() : 0L;
            this.c = num != null ? num.intValue() : 0;
            this.d = l2 != null ? l2.longValue() : 0L;
            this.e = num2 != null ? num2.intValue() : 0;
            this.f = num3 != null ? num3.intValue() : 0;
            this.g = l3 != null ? l3.longValue() : 0L;
            this.h = l4 != null ? l4.longValue() : 0L;
            this.i = l5 != null ? l5.longValue() : 0L;
            this.j = l6 != null ? l6.longValue() : 0L;
            this.k = l7 != null ? l7.longValue() : 0L;
            this.l = l8 != null ? l8.longValue() : 0L;
            this.m = l9 != null ? l9.longValue() : j;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
