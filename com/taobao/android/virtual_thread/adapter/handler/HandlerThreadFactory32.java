package com.taobao.android.virtual_thread.adapter.handler;

import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.adapter.task.TBHandlerThreadFactory;
import tb.kge;

/* loaded from: classes6.dex */
public class HandlerThreadFactory32 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static TBHandlerThreadFactory sFactory;

    static {
        kge.a(-2095316712);
    }

    public static void setFactory(TBHandlerThreadFactory tBHandlerThreadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f8c002", new Object[]{tBHandlerThreadFactory});
        } else {
            sFactory = tBHandlerThreadFactory;
        }
    }

    public static HandlerThread create(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("4621fc46", new Object[]{str, new Integer(i)});
        }
        TBHandlerThreadFactory tBHandlerThreadFactory = sFactory;
        if (tBHandlerThreadFactory == null) {
            return null;
        }
        return tBHandlerThreadFactory.a(str);
    }

    public static void quit(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8118f", new Object[]{looper});
            return;
        }
        TBHandlerThreadFactory tBHandlerThreadFactory = sFactory;
        if (tBHandlerThreadFactory != null) {
            tBHandlerThreadFactory.quit(looper);
        } else {
            looper.quit();
        }
    }

    public static void quitSafely(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3579cd95", new Object[]{looper});
        } else if (Build.VERSION.SDK_INT < 18) {
        } else {
            TBHandlerThreadFactory tBHandlerThreadFactory = sFactory;
            if (tBHandlerThreadFactory != null) {
                tBHandlerThreadFactory.quitSafely(looper);
            } else {
                looper.quitSafely();
            }
        }
    }
}
