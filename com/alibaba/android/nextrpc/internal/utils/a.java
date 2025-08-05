package com.alibaba.android.nextrpc.internal.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f2385a = false;
    private static final Object b = new Object();

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        synchronized (b) {
            if (f2385a) {
                return;
            }
            f2385a = true;
            try {
                ACCSClient.init(context, new AccsClientConfig.Builder().setAppKey("21646297").setTag("default").build());
                ACCSClient.getAccsClient();
            } catch (AccsException e) {
                UnifyLog.d("AccsUtils", e.getMessage(), new Object[0]);
            }
        }
    }
}
