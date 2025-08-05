package com.alibaba.android.split.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.alibaba.android.split.a;
import com.alibaba.android.split.api.ISplitInstallService;
import com.alibaba.android.split.api.SplitInstallResultCallback;
import com.alibaba.android.split.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.service.AidlService;
import java.util.List;
import tb.bgu;
import tb.kge;

/* loaded from: classes2.dex */
public class SplitInstallService extends AidlService<BIND_SPLIT_INSTALL_SERVICE, SplitInstallServiceImplDelegate> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bgu f2503a = (bgu) a.b(bgu.class, "SplitInstallService");

    static {
        kge.a(-1049377084);
    }

    public static /* synthetic */ Object ipc$super(SplitInstallService splitInstallService, String str, Object... objArr) {
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

    @Override // com.taobao.android.service.AidlService, android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            super.onCreate();
        }
    }

    @Override // com.taobao.android.service.AidlService, android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ae1fadd", new Object[]{this, intent})).booleanValue();
        }
        this.f2503a.d("SplitInstallService onUnbind", new Object[0]);
        return super.onUnbind(intent);
    }

    /* loaded from: classes2.dex */
    public class SplitInstallServiceImplDelegate extends SplitInstallServiceStub implements BIND_SPLIT_INSTALL_SERVICE {
        private ISplitInstallService delegate;

        static {
            kge.a(-1623467463);
            kge.a(-1430668418);
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void deferredLanguageInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void deferredLanguageUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
        }

        public SplitInstallServiceImplDelegate() {
            this.delegate = new SplitInstallServiceImpl(SplitInstallService.this);
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void startInstall(String str, List<Bundle> list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
            this.delegate.startInstall(str, list, bundle, splitInstallResultCallback);
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void cancelInstall(String str, int i, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
            this.delegate.cancelInstall(str, i, bundle, splitInstallResultCallback);
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void getSessionState(String str, int i, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
            this.delegate.getSessionState(str, i, splitInstallResultCallback);
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void getSessionStates(String str, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
            this.delegate.getSessionStates(str, splitInstallResultCallback);
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void deferredUninstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
            this.delegate.deferredUninstall(str, list, bundle, splitInstallResultCallback);
        }

        @Override // com.alibaba.android.split.api.ISplitInstallService
        public void deferredInstall(String str, List list, Bundle bundle, SplitInstallResultCallback splitInstallResultCallback) throws RemoteException {
            this.delegate.deferredInstall(str, list, bundle, splitInstallResultCallback);
        }
    }
}
