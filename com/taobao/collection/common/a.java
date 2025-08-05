package com.taobao.collection.common;

import android.app.AlarmManager;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.receiver.AlarmReceiver;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1254588966);
    }

    public static void a(int i, int i2, Code code, SwitchOption switchOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a44a4ac", new Object[]{new Integer(i), new Integer(i2), code, switchOption});
            return;
        }
        Intent intent = new Intent(Globals.getApplication(), AlarmReceiver.class);
        intent.setAction(switchOption.getType().name());
        intent.putExtra("com.taobao.collection.common.Code", JSON.toJSONString(code));
        intent.putExtra("com.taobao.collection.common.SwitchOption", JSON.toJSONString(switchOption));
        intent.putExtra("com.taobao.collection.common.timestamp", System.currentTimeMillis());
        ((AlarmManager) Globals.getApplication().getSystemService("alarm")).set(i, System.currentTimeMillis() + (i2 * 1000), com.android.taobao.aop.a.b(Globals.getApplication(), 0, intent, 134217728));
    }
}
