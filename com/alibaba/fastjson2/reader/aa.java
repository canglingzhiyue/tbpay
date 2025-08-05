package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.DateUtils;
import java.util.Date;
import tb.kge;

/* loaded from: classes2.dex */
abstract class aa<T> extends d<T> {
    final bu w;
    final boolean x;
    final boolean y;

    static {
        kge.a(-1660361432);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r3 != 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aa(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, java.lang.reflect.Method r10, java.lang.reflect.Field r11, com.alibaba.fastjson2.reader.bu r12) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r0.w = r12
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L33
            r3 = -1
            int r4 = r7.hashCode()
            r5 = -1074095546(0xffffffffbffa9a46, float:-1.957833)
            if (r4 == r5) goto L24
            r5 = -288020395(0xffffffffeed52855, float:-3.2984533E28)
            if (r4 == r5) goto L19
            goto L2d
        L19:
            java.lang.String r4 = "unixtime"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L2d
            r3 = 0
            goto L2d
        L24:
            java.lang.String r4 = "millis"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L2d
            r3 = 1
        L2d:
            if (r3 == 0) goto L32
            if (r3 == r2) goto L34
            goto L33
        L32:
            r1 = 1
        L33:
            r2 = 0
        L34:
            r0.x = r1
            r0.y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.aa.<init>(java.lang.String, java.lang.reflect.Type, java.lang.Class, int, long, java.lang.String, java.util.Locale, java.lang.Object, java.lang.reflect.Method, java.lang.reflect.Field, com.alibaba.fastjson2.reader.bu):void");
    }

    @Override // com.alibaba.fastjson2.reader.d
    public final bu a(JSONReader.c cVar) {
        return this.w;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public final bu a(JSONReader jSONReader) {
        return this.w;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public void a(T t, Object obj) {
        if (obj == null) {
            b((aa<T>) t);
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                b((aa<T>) t);
                return;
            } else if ((this.f == null || this.x || this.y) && com.alibaba.fastjson2.util.d.a(str)) {
                long parseLong = Long.parseLong(str);
                if (this.x) {
                    parseLong *= 1000;
                }
                a((aa<T>) t, parseLong);
                return;
            } else {
                obj = DateUtils.a(str, this.f, com.alibaba.fastjson2.time.e.b);
            }
        }
        if (obj instanceof Date) {
            a((aa<T>) t, (Date) obj);
        } else if (obj instanceof Long) {
            a((aa<T>) t, ((Long) obj).longValue());
        } else {
            throw new JSONException("not support value " + obj.getClass());
        }
    }

    protected abstract void a(T t, Date date);

    @Override // com.alibaba.fastjson2.reader.d
    public boolean a(Class cls) {
        return cls == Date.class || cls == String.class;
    }

    @Override // com.alibaba.fastjson2.reader.d
    public final Object b(JSONReader jSONReader) {
        return this.w.a(jSONReader, this.d, this.b, this.e);
    }

    protected abstract void b(T t);
}
