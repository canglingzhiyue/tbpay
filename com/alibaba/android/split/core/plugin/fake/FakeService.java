package com.alibaba.android.split.core.plugin.fake;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class FakeService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1742625032);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }
}
