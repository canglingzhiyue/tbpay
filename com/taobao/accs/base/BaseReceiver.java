package com.taobao.accs.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.a;
import com.taobao.accs.internal.ReceiverImpl;
import com.taobao.accs.utl.ALog;
import tb.kge;

/* loaded from: classes.dex */
public class BaseReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private IBaseReceiver baseReceiver;

    public static /* synthetic */ IBaseReceiver access$000(BaseReceiver baseReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IBaseReceiver) ipChange.ipc$dispatch("8dcb035a", new Object[]{baseReceiver}) : baseReceiver.baseReceiver;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]) : TAG;
    }

    static {
        kge.a(943563700);
        TAG = BaseReceiver.class.getSimpleName();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            if (this.baseReceiver == null) {
                this.baseReceiver = new ReceiverImpl();
            }
            a.a(new Runnable() { // from class: com.taobao.accs.base.BaseReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BaseReceiver.access$000(BaseReceiver.this).onReceive(context, intent);
                    } catch (Exception e) {
                        ALog.e(BaseReceiver.access$100(), "onReceive error", e, new Object[0]);
                    }
                }
            });
        } catch (Exception e) {
            ALog.e(TAG, "build ReceiverImpl error", e, new Object[0]);
        }
    }
}
