package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.util.List;
import tb.cqa;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;

/* loaded from: classes2.dex */
public interface bg<T> {

    /* renamed from: com.alibaba.fastjson2.writer.bg$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static FieldWriter $default$a(bg bgVar, long j) {
            return null;
        }

        public static void $default$a(bg bgVar, cqa cqaVar) {
            if (cqaVar instanceof dqo) {
                bgVar.a((dqo) cqaVar);
            }
            if (cqaVar instanceof dqv) {
                bgVar.a((dqv) cqaVar);
            }
            if (cqaVar instanceof dqj) {
                bgVar.a((dqj) cqaVar);
            }
            if (cqaVar instanceof dqs) {
                bgVar.a((dqs) cqaVar);
            }
        }

        public static void $default$a(bg bgVar, dqj dqjVar) {
        }

        public static void $default$a(bg bgVar, dqo dqoVar) {
        }

        public static void $default$a(bg bgVar, dqs dqsVar) {
        }

        public static void $default$a(bg bgVar, dqv dqvVar) {
        }

        public static void $default$c(bg bgVar, JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            List<FieldWriter> bn_ = bgVar.bn_();
            int size = bn_.size();
            jSONWriter.c(size);
            for (int i = 0; i < size; i++) {
                bn_.get(i).a(jSONWriter, (JSONWriter) obj);
            }
        }

        public static void $default$d(bg bgVar, JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            Class<?> cls;
            if (jSONWriter.e) {
                bgVar.c(jSONWriter, obj, obj2, type, j);
                return;
            }
            List<FieldWriter> bn_ = bgVar.bn_();
            jSONWriter.j();
            int i = 0;
            if (!bgVar.a(jSONWriter)) {
                int size = bn_.size();
                while (i < size) {
                    if (i != 0) {
                        jSONWriter.l();
                    }
                    bn_.get(i).a(jSONWriter, (JSONWriter) obj);
                    i++;
                }
            } else {
                JSONWriter.a aVar = jSONWriter.b;
                dqs i2 = aVar.i();
                dqv k = aVar.k();
                dqo n = aVar.n();
                int size2 = bn_.size();
                while (i < size2) {
                    if (i != 0) {
                        jSONWriter.l();
                    }
                    FieldWriter fieldWriter = bn_.get(i);
                    if (i2 == null || i2.a(jSONWriter, obj, fieldWriter.f3039a)) {
                        Object a2 = fieldWriter.a((FieldWriter) obj);
                        if (n == null || n.a(obj, fieldWriter.f3039a, a2)) {
                            if (k != null) {
                                Object apply = k.apply(obj, fieldWriter.f3039a, a2);
                                if (apply != null) {
                                    cls = apply.getClass();
                                    fieldWriter.a(jSONWriter, (Class) cls).a(jSONWriter, a2);
                                }
                            } else if (a2 != null) {
                                cls = a2.getClass();
                                fieldWriter.a(jSONWriter, (Class) cls).a(jSONWriter, a2);
                            }
                            i++;
                        }
                    }
                    jSONWriter.n();
                    i++;
                }
            }
            jSONWriter.k();
        }

        public static void $default$e(bg bgVar, JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
            throw new UnsupportedOperationException();
        }
    }

    FieldWriter a(long j);

    void a(JSONWriter jSONWriter, Object obj);

    void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    void a(cqa cqaVar);

    void a(dqj dqjVar);

    void a(dqo dqoVar);

    void a(dqs dqsVar);

    void a(dqv dqvVar);

    boolean a(JSONWriter jSONWriter);

    void b(JSONWriter jSONWriter, Object obj);

    void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    List<FieldWriter> bn_();

    void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);

    void e(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j);
}
