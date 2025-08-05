package com.taobao.login4android.qrcode;

import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes7.dex */
public class NoLeakHandler extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<Handler.Callback> mCallback;
    private boolean mIsValid = true;

    static {
        kge.a(753788291);
    }

    public NoLeakHandler(Handler.Callback callback) {
        this.mCallback = new WeakReference<>(callback);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Handler.Callback callback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        WeakReference<Handler.Callback> weakReference = this.mCallback;
        if (weakReference == null || (callback = weakReference.get()) == null || !this.mIsValid) {
            return;
        }
        callback.handleMessage(message);
    }

    public void setValid(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16dad2b3", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsValid = z;
        }
    }
}
