package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import tb.kge;
import tb.tof;

/* loaded from: classes2.dex */
abstract class i extends FieldWriter {
    final byte[] A;
    final byte[] B;
    final byte[] C;
    final char[] D;
    final char[] E;
    final char[] F;
    final char[] G;
    final byte[] z;

    static {
        kge.a(1111290485);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, str3, type, cls, field, method);
        byte[] copyOf = Arrays.copyOf(this.n, this.n.length + 4);
        copyOf[this.n.length] = 116;
        copyOf[this.n.length + 1] = 114;
        copyOf[this.n.length + 2] = 117;
        copyOf[this.n.length + 3] = 101;
        this.z = copyOf;
        byte[] copyOf2 = Arrays.copyOf(this.n, this.n.length + 5);
        copyOf2[this.n.length] = 102;
        copyOf2[this.n.length + 1] = 97;
        copyOf2[this.n.length + 2] = 108;
        copyOf2[this.n.length + 3] = 115;
        copyOf2[this.n.length + 4] = 101;
        this.A = copyOf2;
        byte[] copyOf3 = Arrays.copyOf(this.n, this.n.length + 1);
        copyOf3[this.n.length] = tof.LF_LINK;
        this.B = copyOf3;
        byte[] copyOf4 = Arrays.copyOf(this.n, this.n.length + 1);
        copyOf4[this.n.length] = 48;
        this.C = copyOf4;
        char[] copyOf5 = Arrays.copyOf(this.o, this.o.length + 4);
        copyOf5[this.o.length] = 't';
        copyOf5[this.o.length + 1] = 'r';
        copyOf5[this.o.length + 2] = 'u';
        copyOf5[this.o.length + 3] = 'e';
        this.D = copyOf5;
        char[] copyOf6 = Arrays.copyOf(this.o, this.o.length + 5);
        copyOf6[this.o.length] = 'f';
        copyOf6[this.o.length + 1] = 'a';
        copyOf6[this.o.length + 2] = 'l';
        copyOf6[this.o.length + 3] = 's';
        copyOf6[this.o.length + 4] = 'e';
        this.E = copyOf6;
        char[] copyOf7 = Arrays.copyOf(this.o, this.o.length + 1);
        copyOf7[this.o.length] = '1';
        this.F = copyOf7;
        char[] copyOf8 = Arrays.copyOf(this.o, this.o.length + 1);
        copyOf8[this.o.length] = '0';
        this.G = copyOf8;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public bg a(JSONWriter jSONWriter, Class cls) {
        return ci.f3064a;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void a(JSONWriter jSONWriter, Object obj) {
        Boolean bool = (Boolean) a((i) obj);
        if (bool == null) {
            jSONWriter.n();
        } else {
            jSONWriter.b(bool.booleanValue());
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void a(JSONWriter jSONWriter, boolean z) {
        long c = jSONWriter.c(this.d);
        if ((JSONWriter.Feature.WriteNonStringValueAsString.mask & c) != 0) {
            a(jSONWriter);
            jSONWriter.d(z ? "true" : "false");
        } else if (jSONWriter.c) {
            jSONWriter.e((c & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.B : this.C : z ? this.z : this.A);
        } else if (jSONWriter.d) {
            jSONWriter.a((c & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0 ? z ? this.F : this.G : z ? this.D : this.E);
        } else {
            a(jSONWriter);
            jSONWriter.b(z);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean b(JSONWriter jSONWriter, Object obj) {
        try {
            Boolean bool = (Boolean) a((i) obj);
            if (bool == null) {
                if (((this.d | jSONWriter.e()) & (JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullBooleanAsFalse.mask)) == 0) {
                    return false;
                }
                a(jSONWriter);
                jSONWriter.r();
                return true;
            } else if (this.c == Boolean.TYPE && !bool.booleanValue() && (jSONWriter.c(this.d) & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
                return false;
            } else {
                a(jSONWriter, bool.booleanValue());
                return true;
            }
        } catch (RuntimeException e) {
            if (!jSONWriter.f()) {
                throw e;
            }
            return false;
        }
    }
}
