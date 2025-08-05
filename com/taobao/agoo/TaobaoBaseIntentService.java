package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import org.android.agoo.control.BaseIntentService;
import tb.kge;

/* loaded from: classes.dex */
public abstract class TaobaoBaseIntentService extends BaseIntentService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1108564316);
    }

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onError(Context context, String str);

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onMessage(Context context, Intent intent);

    @Override // org.android.agoo.control.BaseIntentService
    public abstract void onRegistered(Context context, String str);

    public abstract void onUnregistered(Context context, String str);

    @Override // org.android.agoo.control.BaseIntentService
    public void onUserCommand(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4ecadd", new Object[]{this, context, intent});
        }
    }
}
