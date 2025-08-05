package tb;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.c;
import com.airbnb.lottie.model.layer.a;

/* loaded from: classes2.dex */
public class aik implements c {

    /* renamed from: a  reason: collision with root package name */
    private final aid f25351a;
    private final ail<PointF, PointF> b;
    private final aif c;
    private final aia d;
    private final aic e;
    private final aia f;
    private final aia g;
    private final aia h;
    private final aia i;

    public aik() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public aik(aid aidVar, ail<PointF, PointF> ailVar, aif aifVar, aia aiaVar, aic aicVar, aia aiaVar2, aia aiaVar3, aia aiaVar4, aia aiaVar5) {
        this.f25351a = aidVar;
        this.b = ailVar;
        this.c = aifVar;
        this.d = aiaVar;
        this.e = aicVar;
        this.h = aiaVar2;
        this.i = aiaVar3;
        this.f = aiaVar4;
        this.g = aiaVar5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public agn a(LottieDrawable lottieDrawable, a aVar) {
        return null;
    }

    public aid a() {
        return this.f25351a;
    }

    public ail<PointF, PointF> b() {
        return this.b;
    }

    public aif c() {
        return this.c;
    }

    public aia d() {
        return this.d;
    }

    public aic e() {
        return this.e;
    }

    public aia f() {
        return this.h;
    }

    public aia g() {
        return this.i;
    }

    public aia h() {
        return this.f;
    }

    public aia i() {
        return this.g;
    }

    public ahv j() {
        return new ahv(this);
    }
}
