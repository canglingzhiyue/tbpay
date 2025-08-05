package com.taobao.themis.kernel.adapter;

import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import tb.qpp;
import tb.qpr;

/* loaded from: classes9.dex */
public interface IBizLaunchAdapter extends com.taobao.themis.kernel.basic.a {
    TMSBaseLaunchStep createBizLaunchStep(f fVar, qpr qprVar, qpp qppVar);
}
