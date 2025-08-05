package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.cq;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.bg;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import tb.aaj;
import tb.cqa;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;

/* loaded from: classes2.dex */
public class f {

    /* loaded from: classes2.dex */
    public static final class a implements bg {
        static {
            kge.a(-1095728854);
            kge.a(-1047766740);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ FieldWriter a(long j) {
            return bg.CC.$default$a(this, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
            a(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            try {
                jSONWriter.a(((Clob) obj).getCharacterStream());
            } catch (SQLException e) {
                throw new JSONException("get getCharacterStream error", e);
            }
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(cqa cqaVar) {
            bg.CC.$default$a(this, cqaVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqj dqjVar) {
            bg.CC.$default$a((bg) this, dqjVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqo dqoVar) {
            bg.CC.$default$a((bg) this, dqoVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqs dqsVar) {
            bg.CC.$default$a((bg) this, dqsVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqv dqvVar) {
            bg.CC.$default$a((bg) this, dqvVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ boolean a(JSONWriter jSONWriter) {
            boolean a2;
            a2 = jSONWriter.a(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
            return a2;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
            e(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            a(jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ List<FieldWriter> bn_() {
            List<FieldWriter> emptyList;
            emptyList = Collections.emptyList();
            return emptyList;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$c(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$d(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$e(this, jSONWriter, obj, obj2, type, j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends cq {
        static {
            kge.a(-253856852);
        }

        public b(String str, Locale locale) {
            super(str, locale);
        }

        @Override // com.alibaba.fastjson2.reader.cq, com.alibaba.fastjson2.reader.bu
        public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
            if (jSONReader.d()) {
                long Y = jSONReader.Y();
                if (this.b) {
                    Y *= 1000;
                }
                return new Date(Y);
            } else if (jSONReader.aF()) {
                return null;
            } else {
                if (this.b && jSONReader.z()) {
                    return new Date(Long.parseLong(jSONReader.az()) * 1000);
                }
                if (this.f25183a != null && !this.d && !this.c) {
                    String az = jSONReader.az();
                    if (az.isEmpty()) {
                        return null;
                    }
                    DateTimeFormatter a2 = a();
                    return new Date(com.alibaba.fastjson2.time.f.a(!this.f ? com.alibaba.fastjson2.time.c.a(a2.a(az), com.alibaba.fastjson2.time.d.MIN) : a2.b(az), jSONReader.f2934a.d()).a().a());
                }
                com.alibaba.fastjson2.time.c ai = jSONReader.ai();
                if (ai != null) {
                    return new Date(ai.a(jSONReader.j()).a());
                }
                if (jSONReader.aH()) {
                    return null;
                }
                long al = jSONReader.al();
                if (al == 0 && jSONReader.aH()) {
                    return null;
                }
                return new Date(al);
            }
        }

        @Override // com.alibaba.fastjson2.reader.cq, com.alibaba.fastjson2.reader.bu
        public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
            return a(jSONReader, type, obj, j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends cq {
        static {
            kge.a(7390091);
        }

        public c(String str, Locale locale) {
            super(str, locale);
        }

        @Override // com.alibaba.fastjson2.reader.cq, com.alibaba.fastjson2.reader.bu
        public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
            com.alibaba.fastjson2.time.f aj;
            if (jSONReader.d()) {
                long Y = jSONReader.Y();
                if (this.b) {
                    Y *= 1000;
                }
                return new Time(Y);
            } else if (jSONReader.aF()) {
                return null;
            } else {
                if (this.d || this.c) {
                    return new Time(jSONReader.al());
                }
                if (this.b) {
                    return new Time(jSONReader.Z().longValue() * 1000);
                }
                if (this.f25183a != null) {
                    DateTimeFormatter a2 = a(jSONReader.i());
                    if (a2 != null) {
                        String az = jSONReader.az();
                        if (az.isEmpty()) {
                            return null;
                        }
                        aj = com.alibaba.fastjson2.time.f.a(!this.f ? com.alibaba.fastjson2.time.c.a(a2.a(az), com.alibaba.fastjson2.time.d.MIN) : !this.e ? com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.b.a(1970, 1, 1), a2.d(az)) : a2.b(az), jSONReader.f2934a.d());
                    } else {
                        aj = jSONReader.aj();
                    }
                    return new Time(aj.a().a());
                }
                String az2 = jSONReader.az();
                if ("0000-00-00".equals(az2) || "0000-00-00 00:00:00".equals(az2)) {
                    return new Time(0L);
                }
                if (!az2.isEmpty() && !"null".equals(az2)) {
                    return Time.valueOf(az2);
                }
                return null;
            }
        }

        @Override // com.alibaba.fastjson2.reader.cq, com.alibaba.fastjson2.reader.bu
        public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
            return a(jSONReader, type, obj, j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends aaj implements bg {
        public static final d INSTANCE;

        static {
            kge.a(162795323);
            kge.a(-1047766740);
            INSTANCE = new d(null);
        }

        public d(String str) {
            super(str);
        }

        public static d a(String str) {
            return str == null ? INSTANCE : new d(str);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ FieldWriter a(long j) {
            return bg.CC.$default$a(this, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
            a(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            String c;
            if (obj == null) {
                jSONWriter.n();
                return;
            }
            JSONWriter.a aVar = jSONWriter.b;
            if (this.b || aVar.e()) {
                jSONWriter.e(((java.util.Date) obj).getTime() / 1000);
            } else if (this.c || aVar.d()) {
                jSONWriter.e(((Time) obj).getTime());
            } else if (this.d || aVar.f()) {
                com.alibaba.fastjson2.time.f a2 = com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(((Time) obj).getTime()), com.alibaba.fastjson2.time.e.c);
                jSONWriter.a(a2.f3024a.f3021a.f3020a, a2.f3024a.f3021a.b, a2.f3024a.f3021a.c, a2.f3024a.b.f3022a, a2.f3024a.b.b, a2.f3024a.b.c, 0, a2.b, true);
            } else {
                DateTimeFormatter dateTimeFormatter = null;
                if (this.f25183a != null && !this.f25183a.contains("dd")) {
                    dateTimeFormatter = a();
                }
                if (dateTimeFormatter == null && (c = aVar.c()) != null && !c.contains("dd")) {
                    dateTimeFormatter = aVar.h();
                }
                if (dateTimeFormatter == null) {
                    jSONWriter.d(obj.toString());
                } else {
                    jSONWriter.d(dateTimeFormatter.a(com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(((java.util.Date) obj).getTime()), aVar.b())));
                }
            }
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(cqa cqaVar) {
            bg.CC.$default$a(this, cqaVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqj dqjVar) {
            bg.CC.$default$a((bg) this, dqjVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqo dqoVar) {
            bg.CC.$default$a((bg) this, dqoVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqs dqsVar) {
            bg.CC.$default$a((bg) this, dqsVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqv dqvVar) {
            bg.CC.$default$a((bg) this, dqvVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ boolean a(JSONWriter jSONWriter) {
            boolean a2;
            a2 = jSONWriter.a(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
            return a2;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
            e(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            a(jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ List<FieldWriter> bn_() {
            List<FieldWriter> emptyList;
            emptyList = Collections.emptyList();
            return emptyList;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$c(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$d(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$e(this, jSONWriter, obj, obj2, type, j);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends cq {
        static {
            kge.a(-1317251906);
        }

        public e(String str, Locale locale) {
            super(str, locale);
        }

        Object a(long j, int i) {
            Timestamp timestamp = new Timestamp(j);
            if (i != 0) {
                timestamp.setNanos(i);
            }
            return timestamp;
        }

        @Override // com.alibaba.fastjson2.reader.cq, com.alibaba.fastjson2.reader.bu
        public Object a(JSONReader jSONReader, Type type, Object obj, long j) {
            if (jSONReader.d()) {
                long Y = jSONReader.Y();
                if (this.b) {
                    Y *= 1000;
                }
                return a(Y, 0);
            } else if (jSONReader.o()) {
                return null;
            } else {
                if (this.f25183a != null && !this.d && !this.c) {
                    String az = jSONReader.az();
                    if (az.isEmpty()) {
                        return null;
                    }
                    com.alibaba.fastjson2.time.a a2 = !this.f ? com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.c.a(a().a(az), com.alibaba.fastjson2.time.d.MIN), jSONReader.f2934a.d()).a() : DateUtils.a(az, 0, az.length()).a(jSONReader.f2934a.d());
                    return a(a2.a(), a2.c);
                }
                com.alibaba.fastjson2.time.c ai = jSONReader.ai();
                if (ai != null) {
                    return ai.a();
                }
                if (jSONReader.aH()) {
                    return null;
                }
                long al = jSONReader.al();
                if (al == 0 && jSONReader.aH()) {
                    return null;
                }
                return new Timestamp(al);
            }
        }

        @Override // com.alibaba.fastjson2.reader.cq, com.alibaba.fastjson2.reader.bu
        public Object b(JSONReader jSONReader, Type type, Object obj, long j) {
            if (!jSONReader.d()) {
                if (!jSONReader.aF()) {
                    return a(jSONReader, type, obj, j);
                }
                return null;
            }
            long Y = jSONReader.Y();
            if (this.b) {
                Y *= 1000;
            }
            return a(Y, 0);
        }
    }

    /* renamed from: com.alibaba.fastjson2.util.f$f  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0108f extends aaj implements bg {
        static {
            kge.a(-1161846674);
            kge.a(-1047766740);
        }

        public C0108f(String str) {
            super(str);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ FieldWriter a(long j) {
            return bg.CC.$default$a(this, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
            a(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            if (obj == null) {
                jSONWriter.n();
                return;
            }
            JSONWriter.a aVar = jSONWriter.b;
            Timestamp timestamp = (Timestamp) obj;
            if (this.b || aVar.e()) {
                jSONWriter.e(timestamp.getTime() / 1000);
                return;
            }
            com.alibaba.fastjson2.time.e b = aVar.b();
            com.alibaba.fastjson2.time.a a2 = com.alibaba.fastjson2.time.a.a(timestamp);
            com.alibaba.fastjson2.time.f a3 = com.alibaba.fastjson2.time.f.a(a2, b);
            int a4 = b.a(a2);
            if ((this.d || aVar.f()) && a3.f3024a.b.d % 1000000 == 0) {
                jSONWriter.a(a3.f3024a.f3021a.f3020a, a3.f3024a.f3021a.b, a3.f3024a.f3021a.c, a3.f3024a.b.f3022a, a3.f3024a.b.b, a3.f3024a.b.c, a3.f3024a.b.d / 1000000, a4, true);
                return;
            }
            DateTimeFormatter a5 = a();
            if (a5 == null) {
                a5 = aVar.h();
            }
            if (a5 != null) {
                jSONWriter.d(a5.a(a3));
            } else if (this.c || aVar.d()) {
                jSONWriter.e(timestamp.getTime());
            } else {
                int nanos = timestamp.getNanos();
                if (nanos == 0) {
                    jSONWriter.e(timestamp.getTime());
                    return;
                }
                int i = a3.f3024a.f3021a.f3020a;
                short s = a3.f3024a.f3021a.b;
                short s2 = a3.f3024a.f3021a.c;
                byte b2 = a3.f3024a.b.f3022a;
                byte b3 = a3.f3024a.b.b;
                byte b4 = a3.f3024a.b.c;
                if (nanos % 1000000 == 0) {
                    jSONWriter.a(i, s, s2, b2, b3, b4, nanos / 1000000, a4, false);
                } else {
                    jSONWriter.a(a3.f3024a);
                }
            }
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(cqa cqaVar) {
            bg.CC.$default$a(this, cqaVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqj dqjVar) {
            bg.CC.$default$a((bg) this, dqjVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqo dqoVar) {
            bg.CC.$default$a((bg) this, dqoVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqs dqsVar) {
            bg.CC.$default$a((bg) this, dqsVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void a(dqv dqvVar) {
            bg.CC.$default$a((bg) this, dqvVar);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ boolean a(JSONWriter jSONWriter) {
            boolean a2;
            a2 = jSONWriter.a(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
            return a2;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
            e(jSONWriter, obj, null, null, 0L);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            if (obj == null) {
                jSONWriter.n();
                return;
            }
            Timestamp timestamp = (Timestamp) obj;
            long time = timestamp.getTime();
            int nanos = timestamp.getNanos();
            if (nanos == 0) {
                jSONWriter.f(time);
            } else {
                jSONWriter.a(time, nanos);
            }
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ List<FieldWriter> bn_() {
            List<FieldWriter> emptyList;
            emptyList = Collections.emptyList();
            return emptyList;
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$c(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$d(this, jSONWriter, obj, obj2, type, j);
        }

        @Override // com.alibaba.fastjson2.writer.bg
        public /* synthetic */ void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            bg.CC.$default$e(this, jSONWriter, obj, obj2, type, j);
        }
    }

    static {
        kge.a(1465898505);
    }
}
