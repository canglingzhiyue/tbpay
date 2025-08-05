package com.taobao.alilive.aliliveframework.context.atmo.bean;

import com.taobao.alilive.aliliveframework.context.atmo.bean.AtmosphereResListResponseData;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class StickerGroup implements Serializable {
    public AtmosphereResListResponseData.Rule rule;
    public String stickerType;
    public List<StickerConfig> stickers;
    public String title;
    public String type;

    static {
        kge.a(1270548714);
        kge.a(1028243835);
    }
}
