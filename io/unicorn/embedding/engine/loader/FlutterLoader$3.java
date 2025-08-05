package io.unicorn.embedding.engine.loader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.taobao.android.weex_framework.util.g;
import io.unicorn.embedding.engine.FlutterJNI;

/* loaded from: classes9.dex */
class FlutterLoader$3 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.e(g.TAG, "[Timeline] android broadcast receiver got: " + action);
        if ("com.taobao.unicorn.tracing_start".equals(action)) {
            FlutterJNI.nativeSwitchTraceState(true);
        } else if (!"com.taobao.unicorn.tracing_stop".equals(action)) {
        } else {
            FlutterJNI.nativeSwitchTraceState(false);
        }
    }
}
