package com.android.taobao.safeclean;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class MainProcessAccsReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(675001649);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String stringExtra = intent.getStringExtra("command");
        a aVar = new a((Application) context.getApplicationContext(), false);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        if (stringExtra.contains("additionDataList")) {
            aVar.a("addition", "", stringExtra);
        } else {
            aVar.a("clean", "", stringExtra);
        }
    }
}
