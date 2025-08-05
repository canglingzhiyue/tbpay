package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.graphics.Bitmap;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class ThumbnailItem implements Serializable {
    public Bitmap coverThumbnail;
    public c imageLoader;
    public boolean isNeedCrop = false;
    public int mediaId;
    public int position;
    public String srcPath;
    public String typeTag;

    static {
        kge.a(-1337187891);
        kge.a(1028243835);
    }

    public ThumbnailItem(String str) {
        this.typeTag = str;
    }

    public ThumbnailItem() {
    }
}
