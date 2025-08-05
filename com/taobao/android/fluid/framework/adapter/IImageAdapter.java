package com.taobao.android.fluid.framework.adapter;

import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.taobao.android.fluid.core.a;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.image.ImageStrategyConfig;
import tb.sjq;

/* loaded from: classes5.dex */
public interface IImageAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IImageAdapter";

    String decideUrl(String str, int i, int i2);

    ImageLoader.a getImageConfigInfo();

    ImageStrategyConfig getImageStrategyConfig();

    ImageStrategyConfig getImageStrategyConfig(sjq sjqVar);

    boolean isEnableImageOriginMode();

    void load(String str, ImageView imageView);

    void load(String str, ImageView imageView, a<d> aVar);

    void load(String str, com.taobao.android.fluid.framework.adapter.mtop.a<String, BitmapDrawable> aVar);
}
