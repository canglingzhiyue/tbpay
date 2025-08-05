package com.taobao.share.core.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.share.aidl.ISharePassword;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TaobaoApplication;
import tb.kge;

/* loaded from: classes8.dex */
public class SharePasswordService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ISharePassword.Stub f19621a;

    static {
        kge.a(1271951327);
    }

    public SharePasswordService() {
        f.a("com.taobao.clipboard_share", "com.taobao.share.core.services.SharePasswordService");
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
        this.f19621a = new ISharePassword.Stub() { // from class: com.taobao.share.core.services.SharePasswordService.1
            @Override // com.taobao.share.aidl.ISharePassword
            public void putPassworToHistory(String str, String str2) throws RemoteException {
                ShareBizAdapter.getInstance().getAppEnv().b(str2);
            }
        };
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent}) : this.f19621a;
    }
}
