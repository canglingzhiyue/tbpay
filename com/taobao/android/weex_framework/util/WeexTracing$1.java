package com.taobao.android.weex_framework.util;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;

/* loaded from: classes6.dex */
public class WeexTracing$1 extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Application f16082a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String action = intent.getAction();
        g.d("[Timeline] android broadcast receiver got: " + action);
        if ("com.taobao.android.weex2.tracing.start".equals(action)) {
            MUSCommonNativeBridge.nativeWx_Trace_startRecord();
        } else if ("com.taobao.android.weex2.tracing.stop".equals(action)) {
            MUSCommonNativeBridge.nativeWx_Trace_stopRecord();
        } else {
            Application application = this.f16082a;
            Toast.makeText(application, "Not valid tracing action: " + action, 0).show();
        }
    }
}
