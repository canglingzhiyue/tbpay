package com.taobao.android.fluid.framework.data.datamodel;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class AlbumData implements Serializable {
    public final String albumPosition;
    public final String needMove;
    public final String type;

    static {
        kge.a(1502659981);
        kge.a(1028243835);
    }

    public AlbumData(String str, String str2, String str3) {
        this.type = str;
        this.needMove = str2;
        this.albumPosition = str3;
    }
}
