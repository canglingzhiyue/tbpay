package com.taobao.android.fluid.framework.activityresult;

import android.content.Intent;
import com.taobao.android.fluid.core.FluidService;

/* loaded from: classes5.dex */
public interface IActivityResultService extends FluidService {
    void navToCartForResult(String str);

    void onActivityResult(int i, int i2, Intent intent);
}
