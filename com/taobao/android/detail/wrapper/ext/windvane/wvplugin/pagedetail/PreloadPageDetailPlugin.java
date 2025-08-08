package com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.ext.preload.DetailPreloadRequester;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class PreloadPageDetailPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "PreloadDetail";
    private static final String START_PRELOAD = "start_preload_task";
    private static final String TAG = "PreloadPageDetailPlugin";

    static {
        kge.a(-2128163302);
    }

    public PreloadPageDetailPlugin() {
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail.PreloadPageDetailPlugin");
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            i.c(l.a(TAG), "WVApi action为空");
            return false;
        } else if (StringUtils.isEmpty(str2)) {
            i.c(l.a(TAG), "WVApi params为空");
            return false;
        } else if (!START_PRELOAD.equals(str)) {
            return false;
        } else {
            i.c(l.a(TAG), "WVApi 发起预加载");
            DetailPreloadRequester.a();
            j.a().a(str2, new com.taobao.android.detail.wrapper.ext.preload.b());
            return true;
        }
    }
}
