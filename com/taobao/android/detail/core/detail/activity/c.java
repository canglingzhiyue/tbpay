package com.taobao.android.detail.core.detail.activity;

import android.view.View;
import com.taobao.android.detail.core.inside.InsideLinearLayout;
import tb.eld;

/* loaded from: classes4.dex */
public interface c {
    public static final int FULL_SCREEN_MODE = 3;
    public static final int HALF_SCREEN_MODE = 1;
    public static final int INVALID_SIZE = -2;
    public static final float RATIO_1_1 = 1.0f;
    public static final float RATIO_3_4 = 0.75f;
    public static final float RATIO_9_15 = 0.6f;
    public static final float RATIO_9_16 = 0.5625f;

    boolean J_();

    void a(View view, int i, int i2);

    void a(InsideLinearLayout.a aVar);

    void a(eld eldVar);

    boolean a(float f);

    void b(InsideLinearLayout.a aVar);

    void b(eld eldVar);

    int c();

    int d();
}
