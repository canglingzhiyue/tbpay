package com.taobao.android.detail.ttdetail.request.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class PreloadTaskBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String START_PRELOAD_TASKS = "startPreloadTasks";

    static {
        kge.a(-1106235973);
    }

    public static /* synthetic */ Object ipc$super(PreloadTaskBroadcastReceiver preloadTaskBroadcastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            JSONObject p = com.taobao.android.detail.ttdetail.utils.j.p();
            if (com.taobao.android.detail.ttdetail.utils.j.b(p) || !com.taobao.android.detail.ttdetail.utils.j.a(null, p)) {
                z = false;
            }
            if (com.taobao.android.detail.ttdetail.utils.j.l() && z && !odg.o().a()) {
                if (!a(context, intent)) {
                    com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskBroadcastReceiver", "intent参数合法校验");
                } else if (TextUtils.isEmpty(intent.getStringExtra(START_PRELOAD_TASKS))) {
                } else {
                    com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskBroadcastReceiver", "开始发送预加载请求");
                    com.taobao.android.detail.ttdetail.request.b.a(intent);
                }
            }
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskBroadcastReceiver", "预加载逻辑接收处理异常", e);
        }
    }

    private boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{this, context, intent})).booleanValue();
        }
        if (context == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskBroadcastReceiver", "参数context为空");
            return false;
        } else if (intent == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("PreloadTaskBroadcastReceiver", "参数Intent为空");
            return false;
        } else {
            return "com.taobao.android.detail.StartPreloadTasks".equals(intent.getAction());
        }
    }
}
