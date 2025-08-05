package com.ali.user.mobile.security;

import android.os.AsyncTask;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.rpc.login.model.WUAData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes2.dex */
public class WUATask extends AsyncTask<Object, Void, WUAData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DataCallback<WUAData> dataCallback;

    static {
        kge.a(-1974295903);
    }

    public WUATask(DataCallback<WUAData> dataCallback) {
        this.dataCallback = dataCallback;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.AsyncTask
    /* renamed from: doInBackground */
    public WUAData mo111doInBackground(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WUAData) ipChange.ipc$dispatch("ae00fb2e", new Object[]{this, objArr});
        }
        LoginTLogAdapter.e(SSOSecurityService.TAG, "inWUATask");
        return SecurityGuardManagerWraper.getWUA();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(WUAData wUAData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea904115", new Object[]{this, wUAData});
            return;
        }
        DataCallback<WUAData> dataCallback = this.dataCallback;
        if (dataCallback == null) {
            return;
        }
        dataCallback.result(wUAData);
    }
}
