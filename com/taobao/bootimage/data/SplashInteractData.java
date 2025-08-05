package com.taobao.bootimage.data;

import android.graphics.drawable.BitmapDrawable;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class SplashInteractData implements Serializable {
    public JSONObject banner;
    public BitmapDrawable bannerImg;
    public BootImageData data;
    public boolean hasBannerImg = true;
    public JSONObject splash;
    public String traceId;

    static {
        kge.a(239520627);
        kge.a(1028243835);
    }
}
