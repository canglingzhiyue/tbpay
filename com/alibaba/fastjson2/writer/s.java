package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes2.dex */
class s extends FieldWriter {
    final char[][] A;
    final byte[][] B;
    final char[][] C;
    final Class D;
    final Enum[] E;
    final long[] F;
    final long[] G;
    final byte[][] z;

    static {
        kge.a(250837460);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public s(String str, int i, long j, String str2, String str3, Type type, Class<? extends Enum> cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.D = cls;
        this.E = (Enum[]) cls.getEnumConstants();
        Enum[] enumArr = this.E;
        this.F = new long[enumArr.length];
        this.G = new long[enumArr.length];
        int i2 = 0;
        while (true) {
            Enum[] enumArr2 = this.E;
            if (i2 >= enumArr2.length) {
                this.z = new byte[enumArr2.length];
                this.A = new char[enumArr2.length];
                this.B = new byte[enumArr2.length];
                this.C = new char[enumArr2.length];
                return;
            }
            this.F[i2] = com.alibaba.fastjson2.util.c.b(enumArr2[i2].name());
            i2++;
        }
    }

    private void a(JSONWriter jSONWriter, Enum r10, com.alibaba.fastjson2.s sVar) {
        int i;
        if (sVar != null) {
            int identityHashCode = System.identityHashCode(sVar);
            if (this.q != 0 && ((int) this.q) == identityHashCode) {
                i = (int) (this.q >> 32);
            } else {
                i = sVar.a(this.m);
                this.q = (i << 32) | identityHashCode;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            jSONWriter.a(-i);
        } else {
            jSONWriter.a(this.p, this.m);
        }
        jSONWriter.d(r10.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r13 != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.alibaba.fastjson2.JSONWriter r11, int r12, com.alibaba.fastjson2.s r13) {
        /*
            r10 = this;
            int r0 = java.lang.System.identityHashCode(r13)
            long[] r1 = r10.G
            r2 = r1[r12]
            r4 = 0
            r1 = 32
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L21
            long[] r2 = r10.F
            r6 = r2[r12]
            int r2 = r13.a(r6)
            long[] r3 = r10.G
            long r6 = (long) r2
            long r6 = r6 << r1
            long r8 = (long) r0
            long r6 = r6 | r8
            r3[r12] = r6
            goto L37
        L21:
            int r6 = (int) r2
            if (r6 != r0) goto L27
            long r2 = r2 >> r1
            int r2 = (int) r2
            goto L37
        L27:
            long[] r2 = r10.F
            r6 = r2[r12]
            int r2 = r13.a(r6)
            long[] r3 = r10.G
            long r6 = (long) r2
            long r6 = r6 << r1
            long r8 = (long) r0
            long r6 = r6 | r8
            r3[r12] = r6
        L37:
            if (r2 < 0) goto L79
            long r6 = r10.q
            r12 = -1
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 != 0) goto L49
            long r3 = r10.m
            int r13 = r13.a(r3)
            if (r13 == r12) goto L60
            goto L5a
        L49:
            long r3 = r10.q
            int r4 = (int) r3
            if (r4 != r0) goto L54
            long r3 = r10.q
            long r0 = r3 >> r1
            int r13 = (int) r0
            goto L60
        L54:
            long r3 = r10.m
            int r13 = r13.a(r3)
        L5a:
            long r3 = (long) r13
            long r3 = r3 << r1
            long r0 = (long) r0
            long r0 = r0 | r3
            r10.q = r0
        L60:
            if (r13 == r12) goto L67
            int r12 = -r13
            r11.a(r12)
            goto L6e
        L67:
            byte[] r12 = r10.p
            long r0 = r10.m
            r11.a(r12, r0)
        L6e:
            r12 = 121(0x79, float:1.7E-43)
            r11.a(r12)
            int r12 = -r2
            r11.d(r12)
            r11 = 1
            return r11
        L79:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.s.a(com.alibaba.fastjson2.JSONWriter, int, com.alibaba.fastjson2.s):boolean");
    }

    private char[] a(int i) {
        String name = this.E[i].name();
        char[] copyOf = Arrays.copyOf(this.o, this.o.length + name.length() + 2);
        copyOf[this.o.length] = '\"';
        name.getChars(0, name.length(), copyOf, this.o.length + 1);
        copyOf[copyOf.length - 1] = '\"';
        return copyOf;
    }

    private byte[] b(int i) {
        byte[] bytes = this.E[i].name().getBytes(StandardCharsets.UTF_8);
        byte[] copyOf = Arrays.copyOf(this.n, this.n.length + bytes.length + 2);
        copyOf[this.n.length] = 34;
        int length = this.n.length + 1;
        int length2 = bytes.length;
        int i2 = 0;
        while (i2 < length2) {
            copyOf[length] = bytes[i2];
            i2++;
            length++;
        }
        copyOf[copyOf.length - 1] = 34;
        return copyOf;
    }

    private char[] c(int i) {
        char[] copyOf = Arrays.copyOf(this.o, this.o.length + com.alibaba.fastjson2.util.d.a(i));
        char[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        com.alibaba.fastjson2.util.d.b(copyOf2, 0, i);
        return copyOf2;
    }

    private byte[] d(int i) {
        byte[] copyOf = Arrays.copyOf(this.n, this.n.length + com.alibaba.fastjson2.util.d.a(i));
        byte[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
        com.alibaba.fastjson2.util.d.a(copyOf2, this.n.length, i);
        return copyOf2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void a(JSONWriter jSONWriter, Enum r12) {
        int i;
        if (r12 == null) {
            return;
        }
        long c = jSONWriter.c(this.d);
        boolean z = true;
        boolean z2 = ((JSONWriter.Feature.WriteEnumUsingToString.mask | JSONWriter.Feature.WriteEnumsUsingName.mask) & c) == 0;
        if ((c & JSONWriter.Feature.WriteEnumUsingToString.mask) == 0) {
            z = false;
        }
        int ordinal = r12.ordinal();
        com.alibaba.fastjson2.s sVar = jSONWriter.g;
        if (sVar != null && z2 && !z && a(jSONWriter, ordinal, sVar)) {
            return;
        }
        if (z) {
            a(jSONWriter, r12, sVar);
        } else if (!z2) {
            a(jSONWriter);
            jSONWriter.d(r12.name());
        } else {
            if (sVar != null) {
                int identityHashCode = System.identityHashCode(sVar);
                if (this.q != 0 && ((int) this.q) == identityHashCode) {
                    i = (int) (this.q >> 32);
                } else {
                    i = sVar.a(this.m);
                    this.q = (i << 32) | identityHashCode;
                }
            } else {
                i = -1;
            }
            if (i != -1) {
                jSONWriter.a(-i);
            } else {
                jSONWriter.a(this.p, this.m);
            }
            jSONWriter.d(ordinal);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void a(JSONWriter jSONWriter, Object obj) {
        jSONWriter.a((Enum) a((s) obj));
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void b(JSONWriter jSONWriter, Enum r12) {
        long c = jSONWriter.c(this.d);
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & c) == 0) {
            if (jSONWriter.e) {
                a(jSONWriter, r12);
                return;
            }
            boolean z = true;
            boolean z2 = (JSONWriter.Feature.UnquoteFieldName.mask & c) != 0;
            boolean z3 = jSONWriter.c;
            if (jSONWriter.c || !jSONWriter.d) {
                z = false;
            }
            int ordinal = r12.ordinal();
            if ((c & JSONWriter.Feature.WriteEnumUsingOrdinal.mask) != 0) {
                if (!z2) {
                    if (z3) {
                        byte[][] bArr = this.B;
                        byte[] bArr2 = bArr[ordinal];
                        if (bArr2 == null) {
                            bArr2 = d(ordinal);
                            bArr[ordinal] = bArr2;
                        }
                        jSONWriter.e(bArr2);
                        return;
                    } else if (z) {
                        char[][] cArr = this.C;
                        char[] cArr2 = cArr[ordinal];
                        if (cArr2 == null) {
                            cArr2 = c(ordinal);
                            cArr[ordinal] = cArr2;
                        }
                        jSONWriter.a(cArr2);
                        return;
                    }
                }
                a(jSONWriter);
                jSONWriter.d(ordinal);
                return;
            } else if (!z2) {
                if (z3) {
                    byte[][] bArr3 = this.z;
                    byte[] bArr4 = bArr3[ordinal];
                    if (bArr4 == null) {
                        bArr4 = b(ordinal);
                        bArr3[ordinal] = bArr4;
                    }
                    jSONWriter.e(bArr4);
                    return;
                } else if (z) {
                    char[][] cArr3 = this.A;
                    char[] cArr4 = cArr3[ordinal];
                    if (cArr4 == null) {
                        cArr4 = a(ordinal);
                        cArr3[ordinal] = cArr4;
                    }
                    jSONWriter.a(cArr4);
                    return;
                }
            }
        }
        a(jSONWriter);
        jSONWriter.d(r12.toString());
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, Object obj) {
        Enum r7 = (Enum) a((s) obj);
        if (r7 != null) {
            if (jSONWriter.e) {
                a(jSONWriter, r7);
            } else {
                b(jSONWriter, r7);
            }
            return true;
        } else if (((this.d | jSONWriter.e()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        } else {
            a(jSONWriter);
            jSONWriter.n();
            return true;
        }
    }
}
