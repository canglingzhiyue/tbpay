package com.alipay.android.msp.framework.taskscheduler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SafeHandler extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(SafeHandler safeHandler, String str, Object... objArr) {
        if (str.hashCode() == 72182663) {
            super.dispatchMessage((Message) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SafeHandler(Looper looper) {
        super(looper);
    }

    public SafeHandler(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public SafeHandler() {
    }

    public SafeHandler(Handler.Callback callback) {
        super(callback);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
            return;
        }
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
