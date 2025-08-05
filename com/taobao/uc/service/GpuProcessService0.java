package com.taobao.uc.service;

import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.multiprocess.SandboxedProcessService;
import tb.kge;

/* loaded from: classes9.dex */
public class GpuProcessService0 extends SandboxedProcessService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2114870810);
    }

    public static /* synthetic */ Object ipc$super(GpuProcessService0 gpuProcessService0, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 51128253) {
            return super.onBind((Intent) objArr[0]);
        } else {
            if (hashCode != 413640386) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onCreate();
            return null;
        }
    }

    @Override // com.uc.webview.export.multiprocess.SandboxedProcessService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // com.uc.webview.export.multiprocess.SandboxedProcessService, android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : super.onBind(intent);
    }

    @Override // com.uc.webview.export.multiprocess.SandboxedProcessService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
