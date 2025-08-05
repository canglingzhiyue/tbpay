package com.alibaba.security.client.smart.core.core;

import android.content.Context;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.service.build.C1236oa;
import com.alibaba.security.ccrc.service.build.C1244ra;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes3.dex */
public class WukongNativeDownloaderImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WukongNativeDownloaderImpl";
    public final C1236oa mDownloader = new C1236oa();
    public final WuKongNativeManager mWuKongNativeManager;

    public WukongNativeDownloaderImpl(Context context, String str, WuKongNativeManager wuKongNativeManager) {
        this.mWuKongNativeManager = wuKongNativeManager;
        this.mDownloader.a(context, str);
    }

    private void mkDirs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97407fd5", new Object[]{this, str});
            return;
        }
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public void download(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b991fb6d", new Object[]{this, str, str2, str3, str4, new Long(j)});
            return;
        }
        Logging.d(TAG, "download sample: " + str + " " + str2 + " " + str3 + " " + str4);
        long currentTimeMillis = System.currentTimeMillis();
        mkDirs(str3);
        this.mDownloader.a(str, str3, str4, new C1244ra(this, str2, currentTimeMillis));
    }
}
