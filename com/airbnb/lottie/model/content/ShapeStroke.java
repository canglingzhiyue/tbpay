package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import tb.agn;
import tb.ahe;
import tb.ahz;
import tb.aia;
import tb.aic;

/* loaded from: classes2.dex */
public class ShapeStroke implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f1755a;
    private final aia b;
    private final List<aia> c;
    private final ahz d;
    private final aic e;
    private final aia f;
    private final LineCapType g;
    private final LineJoinType h;
    private final float i;
    private final boolean j;

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1756a;
        static final /* synthetic */ int[] b = new int[LineJoinType.values().length];

        static {
            try {
                b[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1756a = new int[LineCapType.values().length];
            try {
                f1756a[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1756a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1756a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = AnonymousClass1.f1756a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* loaded from: classes2.dex */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = AnonymousClass1.b[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return Paint.Join.MITER;
                }
                if (i == 3) {
                    return Paint.Join.ROUND;
                }
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public ShapeStroke(String str, aia aiaVar, List<aia> list, ahz ahzVar, aic aicVar, aia aiaVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f1755a = str;
        this.b = aiaVar;
        this.c = list;
        this.d = ahzVar;
        this.e = aicVar;
        this.f = aiaVar2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.j = z;
    }

    public String a() {
        return this.f1755a;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.a aVar) {
        return new ahe(lottieDrawable, aVar, this);
    }

    public ahz b() {
        return this.d;
    }

    public aic c() {
        return this.e;
    }

    public aia d() {
        return this.f;
    }

    public List<aia> e() {
        return this.c;
    }

    public aia f() {
        return this.b;
    }

    public LineCapType g() {
        return this.g;
    }

    public LineJoinType h() {
        return this.h;
    }

    public float i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }
}
