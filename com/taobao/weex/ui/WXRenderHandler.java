package com.taobao.weex.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class WXRenderHandler extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(652616499);
    }

    public static /* synthetic */ Object ipc$super(WXRenderHandler wXRenderHandler, String str, Object... objArr) {
        if (str.hashCode() == 673877017) {
            super.handleMessage((Message) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public WXRenderHandler() {
        super(Looper.getMainLooper());
    }

    public final boolean post(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8de80333", new Object[]{this, str, runnable})).booleanValue();
        }
        Message obtain = Message.obtain(this, runnable);
        obtain.what = str.hashCode();
        return sendMessageDelayed(obtain, 0L);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else {
            super.handleMessage(message);
        }
    }
}
