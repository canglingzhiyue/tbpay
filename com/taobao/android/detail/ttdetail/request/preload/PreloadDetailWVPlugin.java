package com.taobao.android.detail.ttdetail.request.preload;

import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class PreloadDetailWVPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "PreloadDetail";
    private static final String START_PRELOAD = "start_preload_task";
    private static final String TAG = "PreloadPageDetailPlugin";

    static {
        kge.a(-548600493);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "WVApi action为空");
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "WVApi params为空");
            return false;
        } else {
            JSONObject p = com.taobao.android.detail.ttdetail.utils.j.p();
            boolean z = !com.taobao.android.detail.ttdetail.utils.j.b(p) && com.taobao.android.detail.ttdetail.utils.j.a(null, p);
            if (!com.taobao.android.detail.ttdetail.utils.j.l() || !z || odg.o().a() || !START_PRELOAD.equals(str)) {
                return false;
            }
            com.taobao.android.detail.ttdetail.utils.i.a(TAG, "WVApi 发起预加载请求");
            Intent intent = new Intent();
            intent.putExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS, str2);
            com.taobao.android.detail.ttdetail.request.b.a(intent);
            return true;
        }
    }
}
