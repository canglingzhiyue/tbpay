package com.taobao.orange.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigImpl;
import com.taobao.orange.aidl.IOrangeBindService;
import com.taobao.orange.aidl.OrangeBindServiceStub;
import com.taobao.orange.util.OLog;
import com.taobao.orange.util.f;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;
import tb.kge;

/* loaded from: classes7.dex */
public class OrangeBindService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IOrangeBindService.Stub f18585a = null;

    static {
        kge.a(2086026562);
    }

    public static /* synthetic */ Object ipc$super(OrangeBindService orangeBindService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 1256323805) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onUnbind((Intent) objArr[0]));
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        OLog.e("OrangeBindService", i.b.MEASURE_ONCREATE, new Object[0]);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        OLog.e("OrangeBindService", "onBind", new Object[0]);
        if (!f.a(getApplicationContext())) {
            OrangeConfigImpl.getInstance().reInitRemoteService();
        }
        if (this.f18585a == null) {
            this.f18585a = new OrangeBindServiceStub();
        }
        return this.f18585a;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        OLog.e("OrangeBindService", "onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        OLog.e("OrangeBindService", MessageID.onDestroy, new Object[0]);
    }
}
