package com.taobao.video_remoteso;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.video_remoteso.api.FetchCallback;
import com.taobao.video_remoteso.api.LoadCallback;
import com.taobao.video_remoteso.inner.VideoRemoteSoHelper;
import tb.kge;

/* loaded from: classes9.dex */
public class VideoRemoteSo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1815592071);
    }

    public static void loadAsync(String str, LoadCallback loadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa7fa00", new Object[]{str, loadCallback});
        } else {
            VideoRemoteSoHelper.a().a(str, loadCallback);
        }
    }

    public static void fetchAsync(String str, FetchCallback fetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700f211a", new Object[]{str, fetchCallback});
        } else {
            VideoRemoteSoHelper.a().a(str, fetchCallback);
        }
    }
}
