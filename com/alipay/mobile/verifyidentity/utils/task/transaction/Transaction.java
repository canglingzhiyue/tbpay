package com.alipay.mobile.verifyidentity.utils.task.transaction;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class Transaction implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f6106a = new AtomicInteger(0);
    public final String id = "Transaction_" + f6106a.getAndIncrement();

    public final String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
    }
}
