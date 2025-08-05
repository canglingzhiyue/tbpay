package com.taobao.keepalive.account;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rty;

/* loaded from: classes7.dex */
public class SyncService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f17649a;

    /* loaded from: classes7.dex */
    public static class a extends AbstractThreadedSyncAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1340909147);
        }

        public a(Context context, boolean z) {
            super(context, z);
        }

        @Override // android.content.AbstractThreadedSyncAdapter
        public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f51e5d14", new Object[]{this, account, bundle, str, contentProviderClient, syncResult});
            } else {
                rty.f33380a.d("AccountSyncService", "onPerformSync", new Object[0]);
            }
        }
    }

    static {
        kge.a(256143646);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        rty.f33380a.d("AccountSyncService", "onBind", new Object[0]);
        if (this.f17649a == null) {
            this.f17649a = new a(getApplicationContext(), true);
        }
        return this.f17649a.getSyncAdapterBinder();
    }
}
