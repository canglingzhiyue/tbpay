package com.airbnb.lottie;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f1797a;
    private final LottieAnimationView b;
    private final LottieDrawable c;
    private boolean d;

    s() {
        this.f1797a = new HashMap();
        this.d = true;
        this.b = null;
        this.c = null;
    }

    public s(LottieAnimationView lottieAnimationView) {
        this.f1797a = new HashMap();
        this.d = true;
        this.b = lottieAnimationView;
        this.c = null;
    }

    private void a() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String a(String str, String str2) {
        return a(str2);
    }

    public void b(String str, String str2) {
        this.f1797a.put(str, str2);
        a();
    }

    public final String c(String str, String str2) {
        if (!this.d || !this.f1797a.containsKey(str2)) {
            String a2 = a(str, str2);
            if (this.d) {
                this.f1797a.put(str2, a2);
            }
            return a2;
        }
        return this.f1797a.get(str2);
    }
}
