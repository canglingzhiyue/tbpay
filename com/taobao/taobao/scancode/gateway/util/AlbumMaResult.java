package com.taobao.taobao.scancode.gateway.util;

import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import tb.kge;

/* loaded from: classes8.dex */
public class AlbumMaResult extends MaResult {
    static {
        kge.a(809246197);
    }

    public AlbumMaResult(MaType maType, String str) {
        super(maType, str);
    }

    public AlbumMaResult(MaType maType, String str, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        super(maType, str, iArr, iArr2, i, i2, i3, i4);
    }
}
