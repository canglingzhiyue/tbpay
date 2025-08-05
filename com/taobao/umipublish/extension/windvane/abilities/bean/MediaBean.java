package com.taobao.umipublish.extension.windvane.abilities.bean;

import com.taobao.android.litecreator.base.data.meta.MediaStatInfoV2;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class MediaBean implements Serializable {
    public String fileId;
    public Integer height;
    public String mediaType;
    public String path;
    public MediaStatInfoV2 statInfo = new MediaStatInfoV2();
    public String url;
    public Integer width;

    static {
        kge.a(-472035565);
        kge.a(1028243835);
    }
}
