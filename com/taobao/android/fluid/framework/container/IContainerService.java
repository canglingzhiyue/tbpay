package com.taobao.android.fluid.framework.container;

import android.content.Context;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import tb.hjj;
import tb.iyr;
import tb.sjv;
import tb.sjy;
import tb.ska;
import tb.skh;
import tb.snd;

/* loaded from: classes5.dex */
public interface IContainerService extends FluidService, hjj, iyr, sjy, ska, skh, snd {
    public static final b ERROR_CARD_FIRST_CARD_RENDER_FAILED = new b("CONTAINER-1", "首卡渲染失败");
    public static final b ERROR_CARD_LARGE_BITMAP = new b("CONTAINER-2", "卡片加载图片过大异常");

    sjv getConfig();

    boolean isFirstCardRenderSuccess();

    void renderContainerOnCreate(Context context);

    void showTab3CacheHadExposedLoading(boolean z);
}
