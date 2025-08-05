package com.taobao.android.stdpop.api;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f15271a;
    private float b;
    private float c;
    private float d;

    static {
        kge.a(-438947305);
    }

    public b() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Float.compare(this.f15271a, bVar.f15271a) != 0 || Float.compare(this.b, bVar.b) != 0 || Float.compare(this.c, bVar.c) != 0 || Float.compare(this.d, bVar.d) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : (((((Float.floatToIntBits(this.f15271a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PopMargins(leftMargin=" + this.f15271a + ", topMargin=" + this.b + ", rightMargin=" + this.c + ", bottomMargin=" + this.d + riy.BRACKET_END_STR;
    }

    public b(float f, float f2, float f3, float f4) {
        this.f15271a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.f15271a;
    }

    public final float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.b;
    }

    public /* synthetic */ b(float f, float f2, float f3, float f4, int i, o oVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    public final float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.c;
    }

    public final float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.d;
    }
}
