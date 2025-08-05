package com.alipay.mobile.security.bio.runtime.download;

import android.content.Context;
import com.alipay.bis.core.protocol.BioRuntimeDependency;
import java.util.List;

/* loaded from: classes3.dex */
public interface BioResChecker {
    public static final int CHECK_ERROR_FAILED_TO_STAT_FILE = -2;
    public static final int CHECK_ERROR_INVALID_DEPENDENCY = -1;

    int checkRes(Context context, BioRuntimeDependency bioRuntimeDependency, List<BioDownloadItem> list, List<BioDownloadItem> list2);

    void init(Context context, String str);

    boolean isStaticBuild();
}
