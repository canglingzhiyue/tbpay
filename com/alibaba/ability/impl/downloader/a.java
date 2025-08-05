package com.alibaba.ability.impl.downloader;

import com.alibaba.ability.impl.downloader.downloadcenter.DownloadCenter;
import tb.kge;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        kge.a(-1431303713);
        int[] iArr = new int[DownloadCenter.DownloadError.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[DownloadCenter.DownloadError.OUT_OF_SPACE.ordinal()] = 1;
        $EnumSwitchMapping$0[DownloadCenter.DownloadError.NETWORK_ERROR.ordinal()] = 2;
        $EnumSwitchMapping$0[DownloadCenter.DownloadError.FILE_MD5_ERROR.ordinal()] = 3;
        $EnumSwitchMapping$0[DownloadCenter.DownloadError.FILE_SIZE_ERROR.ordinal()] = 4;
    }
}
