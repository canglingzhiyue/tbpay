package com.taobao.allspark;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;

/* loaded from: classes4.dex */
public class AllSparkApplication extends PanguApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private InitTaskImpl initTask = new InitTaskImpl(this, false);

    public static /* synthetic */ Object ipc$super(AllSparkApplication allSparkApplication, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -364441911) {
            super.onTerminate();
            return null;
        } else if (hashCode != 413640386) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate();
            return null;
        }
    }

    @Override // com.taobao.android.lifecycle.PanguApplication, android.app.Application
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.initTask.a();
    }

    @Override // android.app.Application
    public void onTerminate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
        } else {
            super.onTerminate();
        }
    }
}
