package com.taobao.tao.config;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes8.dex */
public class ShareApp extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2132535153);
    }

    public static /* synthetic */ Object ipc$super(ShareApp shareApp, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        TLog.loge("PanguApplication", "ShareApp onCreate");
        ShareBizAdapter.getInstance().initShareAdapter();
    }
}
