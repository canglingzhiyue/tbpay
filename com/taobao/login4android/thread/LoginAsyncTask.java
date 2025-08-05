package com.taobao.login4android.thread;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class LoginAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.LoginAsyncTask";

    static {
        kge.a(-228330817);
    }

    public void doFinally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc23aff", new Object[]{this});
        }
    }

    public abstract Result excuteTask(Params... paramsArr) throws Exception;

    @Override // android.os.AsyncTask
    public Result doInBackground(Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("e83e4786", new Object[]{this, paramsArr});
        }
        Result result = null;
        try {
            result = excuteTask(paramsArr);
        } finally {
            try {
                return result;
            } finally {
            }
        }
        return result;
    }

    public void handleException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33990a7", new Object[]{this, th});
            return;
        }
        th.printStackTrace();
        LoginTLogAdapter.w(TAG, "LoginAsyncTask excute failed", th);
    }
}
