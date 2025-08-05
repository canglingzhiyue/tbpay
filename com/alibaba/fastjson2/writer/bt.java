package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.a;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.bg;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.aak;
import tb.cqa;
import tb.dqj;
import tb.dqo;
import tb.dqs;
import tb.dqv;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class bt<T> implements bg<T> {
    byte[] A;
    char[] B;
    final long C;
    final long[] D;
    final short[] E;
    final boolean F;
    final boolean G;
    final boolean H;
    final boolean I;
    boolean m;
    dqs n;
    dqo o;
    dqj p;
    dqv q;
    final Class r;
    final List<FieldWriter> s;
    protected final FieldWriter[] t;
    final String u;
    byte[] v;
    private String w;
    protected long x;
    protected long y;
    protected byte[] z;

    static {
        kge.a(-353994621);
        kge.a(-1047766740);
    }

    public bt(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        this.r = cls;
        this.w = str2;
        this.u = (str == null || str.isEmpty()) ? JSON.DEFAULT_TYPE_KEY : str;
        this.C = j;
        this.s = list;
        this.G = cls == null || Serializable.class.isAssignableFrom(cls);
        this.I = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2);
        this.t = new FieldWriter[list.size()];
        list.toArray(this.t);
        FieldWriter[] fieldWriterArr = this.t;
        this.F = fieldWriterArr.length == 1 && (fieldWriterArr[0].d & aak.VALUE_MASK) != 0;
        long[] jArr = new long[this.t.length];
        int i = 0;
        boolean z = false;
        while (true) {
            FieldWriter[] fieldWriterArr2 = this.t;
            if (i >= fieldWriterArr2.length) {
                break;
            }
            FieldWriter fieldWriter = fieldWriterArr2[i];
            jArr[i] = com.alibaba.fastjson2.util.c.b(fieldWriter.f3039a);
            if (fieldWriter.j != null && (fieldWriter.d & aak.FIELD_MASK) == 0) {
                z = true;
            }
            i++;
        }
        this.H = z;
        this.D = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.D);
        this.E = new short[this.D.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            this.E[Arrays.binarySearch(this.D, jArr[i2])] = (short) i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r10 != (-1)) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r10 != (-1)) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        r8.y = (r10 << 32) | r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.alibaba.fastjson2.JSONWriter r9, com.alibaba.fastjson2.s r10) {
        /*
            r8 = this;
            int r0 = java.lang.System.identityHashCode(r10)
            long r1 = r8.y
            r3 = 32
            r4 = -1
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L21
            long r1 = r8.d()
            int r10 = r10.a(r1)
            if (r10 == r4) goto L33
        L19:
            long r1 = (long) r10
            long r1 = r1 << r3
            long r5 = (long) r0
            long r0 = r1 | r5
            r8.y = r0
            goto L33
        L21:
            int r5 = (int) r1
            if (r5 != r0) goto L28
            long r0 = r1 >> r3
            int r10 = (int) r0
            goto L33
        L28:
            long r1 = r8.d()
            int r10 = r10.a(r1)
            if (r10 == r4) goto L33
            goto L19
        L33:
            if (r10 == r4) goto L40
            r0 = -110(0xffffffffffffff92, float:NaN)
            r9.a(r0)
            int r10 = -r10
            r9.d(r10)
            r9 = 1
            return r9
        L40:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.bt.a(com.alibaba.fastjson2.JSONWriter, com.alibaba.fastjson2.s):boolean");
    }

    public JSONObject a(T t) {
        return a((bt<T>) t, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject a(T t, long j) {
        JSONObject jSONObject = new JSONObject();
        for (FieldWriter fieldWriter : this.s) {
            Object a2 = fieldWriter.a((FieldWriter) t);
            Class cls = fieldWriter.c;
            if ((fieldWriter.d & aak.UNWRAPPED_MASK) == 0) {
                if (a2 != null) {
                    String name = a2.getClass().getName();
                    if (Collection.class.isAssignableFrom(cls) && a2.getClass() != JSONObject.class && !name.equals("com.alibaba.fastjson.JSONObject")) {
                        Collection collection = (Collection) a2;
                        JSONArray jSONArray = new JSONArray(collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            jSONArray.add(next == t ? jSONObject : a.CC.b(next));
                        }
                        a2 = jSONArray;
                    }
                }
                if (a2 != null || ((this.C | j) & JSONWriter.Feature.WriteNulls.mask) != 0) {
                    if (a2 == t) {
                        a2 = jSONObject;
                    }
                    jSONObject.put(fieldWriter.f3039a, a2);
                }
            } else if (a2 instanceof Map) {
                jSONObject.putAll((Map) a2);
            } else {
                bg c = fieldWriter.c();
                if (c == null) {
                    c = JSONFactory.defaultObjectWriterProvider.b(fieldWriter.c);
                }
                for (FieldWriter fieldWriter2 : c.bn_()) {
                    jSONObject.put(fieldWriter2.f3039a, fieldWriter2.a((FieldWriter) a2));
                }
            }
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public FieldWriter a(long j) {
        int binarySearch = Arrays.binarySearch(this.D, j);
        if (binarySearch < 0) {
            return null;
        }
        return this.t[this.E[binarySearch]];
    }

    protected String a() {
        Class cls;
        if (this.w == null && (cls = this.r) != null) {
            this.w = (!Enum.class.isAssignableFrom(cls) || this.r.isEnum()) ? TypeUtils.a(this.r) : this.r.getSuperclass().getName();
        }
        return this.w;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(JSONWriter jSONWriter, Object obj) {
        a(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (this.F) {
            this.t[0].a(jSONWriter, (JSONWriter) obj);
            return;
        }
        long e = this.C | j | jSONWriter.e();
        boolean z = (JSONWriter.Feature.BeanToArray.mask & e) != 0;
        if (jSONWriter.e) {
            if (z) {
                c(jSONWriter, obj, obj2, type, j);
            } else {
                b(jSONWriter, obj, obj2, type, j);
            }
        } else if (this.I) {
            cn.f3068a.a(jSONWriter, (Collection) obj, obj2, type, j);
        } else if (z) {
            d(jSONWriter, obj, obj2, type, j);
        } else {
            if (!this.G) {
                if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & e) != 0) {
                    b();
                    return;
                } else if ((e & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                    jSONWriter.n();
                    return;
                }
            }
            if (a(jSONWriter)) {
                e(jSONWriter, obj, obj2, type, j);
                return;
            }
            jSONWriter.h();
            if (((this.C | j) & JSONWriter.Feature.WriteClassName.mask) != 0 || jSONWriter.a(obj, j)) {
                c(jSONWriter);
            }
            int size = this.s.size();
            for (int i = 0; i < size; i++) {
                this.s.get(i).b(jSONWriter, (JSONWriter) obj);
            }
            jSONWriter.i();
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void a(cqa cqaVar) {
        bg.CC.$default$a(this, cqaVar);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(dqj dqjVar) {
        this.p = dqjVar;
        if (dqjVar != null) {
            this.m = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(dqo dqoVar) {
        this.o = dqoVar;
        if (dqoVar != null) {
            this.m = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(dqs dqsVar) {
        this.n = dqsVar;
        if (dqsVar != null) {
            this.m = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void a(dqv dqvVar) {
        this.q = dqvVar;
        if (dqvVar != null) {
            this.m = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public final boolean a(JSONWriter jSONWriter) {
        return this.m || jSONWriter.a(this.H);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        throw new JSONException("not support none serializable class " + this.r.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(JSONWriter jSONWriter) {
        com.alibaba.fastjson2.s sVar = jSONWriter.g;
        if (sVar == null || !a(jSONWriter, sVar)) {
            jSONWriter.b(c(), d());
        }
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void b(JSONWriter jSONWriter, Object obj) {
        e(jSONWriter, obj, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void b(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long e = this.C | j | jSONWriter.e();
        if (!this.G) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & e) != 0) {
                b();
                return;
            } else if ((JSONWriter.Feature.IgnoreNoneSerializable.mask & e) != 0) {
                jSONWriter.n();
                return;
            }
        }
        if ((e & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
            e(jSONWriter, obj, obj2, type, j);
            return;
        }
        int length = this.t.length;
        if (jSONWriter.a(obj, type, j)) {
            b(jSONWriter);
        }
        jSONWriter.h();
        for (int i = 0; i < length; i++) {
            this.s.get(i).b(jSONWriter, (JSONWriter) obj);
        }
        jSONWriter.i();
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public List<FieldWriter> bn_() {
        return this.s;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public void c(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.a(obj, type, j)) {
            b(jSONWriter);
        }
        int size = this.s.size();
        jSONWriter.c(size);
        for (int i = 0; i < size; i++) {
            this.s.get(i).a(jSONWriter, (JSONWriter) obj);
        }
    }

    public boolean c(JSONWriter jSONWriter) {
        String a2 = a();
        if (jSONWriter.c) {
            if (this.A == null) {
                int length = this.u.length();
                int length2 = a2.length();
                int i = length + length2;
                byte[] bArr = new byte[i + 5];
                bArr[0] = 34;
                this.u.getBytes(0, length, bArr, 1);
                bArr[length + 1] = 34;
                bArr[length + 2] = 58;
                bArr[length + 3] = 34;
                a2.getBytes(0, length2, bArr, length + 4);
                bArr[i + 4] = 34;
                this.A = bArr;
            }
            jSONWriter.e(this.A);
            return true;
        } else if (!jSONWriter.d) {
            if (!jSONWriter.e) {
                jSONWriter.d(this.u);
                jSONWriter.m();
                jSONWriter.d(a2);
                return true;
            }
            if (this.v == null) {
                this.v = b.CC.a(this.u);
            }
            jSONWriter.d(this.v);
            jSONWriter.d(this.z);
            return true;
        } else {
            if (this.B == null) {
                int length3 = this.u.length();
                int length4 = a2.length();
                int i2 = length3 + length4;
                char[] cArr = new char[i2 + 5];
                cArr[0] = '\"';
                this.u.getChars(0, length3, cArr, 1);
                cArr[length3 + 1] = '\"';
                cArr[length3 + 2] = riy.CONDITION_IF_MIDDLE;
                cArr[length3 + 3] = '\"';
                a2.getChars(0, length4, cArr, length3 + 4);
                cArr[i2 + 4] = '\"';
                this.B = cArr;
            }
            jSONWriter.a(this.B);
            return true;
        }
    }

    protected byte[] c() {
        String a2;
        if (this.z == null && (a2 = a()) != null) {
            this.z = b.CC.a(a2);
        }
        return this.z;
    }

    protected long d() {
        String a2;
        if (this.x == 0 && (a2 = a()) != null) {
            this.x = com.alibaba.fastjson2.util.c.b(a2);
        }
        return this.x;
    }

    @Override // com.alibaba.fastjson2.writer.bg
    public /* synthetic */ void d(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        bg.CC.$default$d(this, jSONWriter, obj, obj2, type, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
        if ((r0.d & tb.aak.FIELD_MASK) != 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    @Override // com.alibaba.fastjson2.writer.bg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(com.alibaba.fastjson2.JSONWriter r42, java.lang.Object r43, java.lang.Object r44, java.lang.reflect.Type r45, long r46) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.bt.e(com.alibaba.fastjson2.JSONWriter, java.lang.Object, java.lang.Object, java.lang.reflect.Type, long):void");
    }

    public String toString() {
        return this.r.getName();
    }
}
