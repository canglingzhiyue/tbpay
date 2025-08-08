package com.taobao.android.detail.wrapper.ext.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.ttdetail.request.preload.PreloadTaskBroadcastReceiver;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class PreloadTasksBroadCastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1237307536);
    }

    public static /* synthetic */ Object ipc$super(PreloadTasksBroadCastReceiver preloadTasksBroadCastReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PreloadTasksBroadCastReceiver() {
        emu.a("com.taobao.android.detail.wrapper.ext.preload.PreloadTasksBroadCastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if (!a(context, intent)) {
                i.c(l.a("PreloadTasksBroadCastReceiver"), "intent参数合法校验");
                return;
            }
            String stringExtra = intent.getStringExtra(PreloadTaskBroadcastReceiver.START_PRELOAD_TASKS);
            if (!StringUtils.isEmpty(stringExtra)) {
                i.c(l.a("PreloadTasksBroadCastReceiver"), "开始发送预加载请求");
                c(stringExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra("updatePreloadDataSource");
            if (!StringUtils.isEmpty(stringExtra2)) {
                i.c(l.a("PreloadTasksBroadCastReceiver"), "开始更新预加载数据源");
                b(stringExtra2);
                return;
            }
            String stringExtra3 = intent.getStringExtra("clearPreloadDataSource");
            if (!StringUtils.isEmpty(stringExtra3)) {
                i.c(l.a("PreloadTasksBroadCastReceiver"), "开始删除预加载数据源");
                a(stringExtra3);
                return;
            }
            String stringExtra4 = intent.getStringExtra("updateBucketId");
            if (StringUtils.isEmpty(stringExtra4)) {
                return;
            }
            i.c(l.a("PreloadTasksBroadCastReceiver"), "开始更新实验桶号");
            j.a().c(stringExtra4);
        } catch (Exception e) {
            i.a(l.a("PreloadTasksBroadCastReceiver"), "预加载逻辑接收处理异常", e);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            j.a().b(str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            j.a().a(str);
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        DetailPreloadRequester.a();
        i.c(l.a("PreloadTasksBroadCastReceiver"), str);
        j.a().a(str, new b());
    }

    private boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{this, context, intent})).booleanValue();
        }
        if (context == null) {
            i.c(l.a("PreloadTasksBroadCastReceiver"), "参数context为空");
            return false;
        } else if (intent == null) {
            i.c(l.a("PreloadTasksBroadCastReceiver"), "参数Intent为空");
            return false;
        } else {
            return "com.taobao.android.detail.StartPreloadTasks".equals(intent.getAction());
        }
    }
}
