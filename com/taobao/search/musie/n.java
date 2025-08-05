package com.taobao.search.musie;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.TaobaoImageUrlStrategy;
import tb.kge;

/* loaded from: classes7.dex */
public final class n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BASE_64 = "base64,";
    public static final String BASE_64_PREFIX = "data:image/";
    public static final int BIZ_ID = 8900;

    static {
        kge.a(1170509890);
    }

    private static final ImageStrategyConfig b(TaobaoImageUrlStrategy.ImageQuality imageQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("9dcb9d77", new Object[]{imageQuality});
        }
        ImageStrategyConfig.a a2 = ImageStrategyConfig.a("muise", 8900);
        a2.a(imageQuality);
        ImageStrategyConfig a3 = a2.a();
        kotlin.jvm.internal.q.a((Object) a3, "builder.build()");
        return a3;
    }

    public static final Bitmap a(String base64Data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{base64Data});
        }
        kotlin.jvm.internal.q.c(base64Data, "base64Data");
        byte[] decode = Base64.decode(base64Data, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }
}
