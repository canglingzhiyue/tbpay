package tb;

import android.support.constraint.motion.g;
import android.support.constraint.motion.r;

/* loaded from: classes2.dex */
public class ifr {
    private static String g = "VelocityMatrix";

    /* renamed from: a  reason: collision with root package name */
    float f28998a;
    float b;
    float c;
    float d;
    float e;
    float f;

    public void a() {
        this.e = 0.0f;
        this.d = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.f28998a = 0.0f;
    }

    public void a(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.c;
        float f8 = f5 + this.d;
        float f9 = f7 + (this.f28998a * (f - 0.5f) * 2.0f);
        float f10 = f8 + (this.b * f6);
        float radians = (float) Math.toRadians(this.e);
        double radians2 = (float) Math.toRadians(this.f);
        double d = i2 * f6;
        fArr[0] = f9 + (((float) ((((-i) * f3) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) (((i * f3) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    public void a(g gVar, float f) {
        if (gVar != null) {
            this.e = gVar.b(f);
        }
    }

    public void a(g gVar, g gVar2, float f) {
        if (gVar != null) {
            this.c = gVar.b(f);
        }
        if (gVar2 != null) {
            this.d = gVar2.b(f);
        }
    }

    public void a(r rVar, float f) {
        if (rVar != null) {
            this.e = rVar.b(f);
            this.f = rVar.a(f);
        }
    }

    public void a(r rVar, r rVar2, float f) {
        if (rVar != null) {
            this.c = rVar.b(f);
        }
        if (rVar2 != null) {
            this.d = rVar2.b(f);
        }
    }

    public void b(g gVar, g gVar2, float f) {
        if (gVar == null && gVar2 == null) {
            return;
        }
        if (gVar == null) {
            this.f28998a = gVar.b(f);
        }
        if (gVar2 != null) {
            return;
        }
        this.b = gVar2.b(f);
    }

    public void b(r rVar, r rVar2, float f) {
        if (rVar != null) {
            this.f28998a = rVar.b(f);
        }
        if (rVar2 != null) {
            this.b = rVar2.b(f);
        }
    }
}
