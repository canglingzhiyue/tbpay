package com.alipay.mobile.verifyidentity.utils.task.transaction;

import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class TransactionExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TransactionExecutor";
    public volatile Transaction mActive;
    public final ArrayDeque<Transaction> mTransactions = new ArrayDeque<>();

    public String addTransaction(Transaction transaction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47b551e6", new Object[]{this, transaction});
        }
        synchronized (this.mTransactions) {
            this.mTransactions.offer(transaction);
        }
        if (this.mActive == null) {
            a();
        } else {
            LoggerFactory.getTraceLogger().verbose(TAG, "TransactionExecutor.execute(a transaction is running, so don't call scheduleNext())");
        }
        return transaction.id;
    }

    public void removeTransaction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d931acb", new Object[]{this, str});
            return;
        }
        Iterator<Transaction> it = this.mTransactions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Transaction next = it.next();
            if (next.id.equals(str)) {
                synchronized (this.mTransactions) {
                    this.mTransactions.remove(next);
                }
                break;
            }
        }
        if (this.mActive != null && this.mActive.id.equals(str)) {
            this.mActive = null;
        }
        if (this.mActive == null) {
            a();
        } else {
            LoggerFactory.getTraceLogger().verbose(TAG, "TransactionExecutor.execute(a transaction is running, so don't call scheduleNext())");
        }
    }

    private void a() {
        Transaction transaction;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        synchronized (this.mTransactions) {
            this.mActive = this.mTransactions.poll();
            transaction = this.mActive;
        }
        if (this.mActive != null) {
            LoggerFactory.getTraceLogger().debug(TAG, "TransactionExecutor.scheduleNext()");
            transaction.run();
            return;
        }
        LoggerFactory.getTraceLogger().debug(TAG, "TransactionExecutor.scheduleNext(mTransactions is empty)");
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        } else {
            this.mTransactions.clear();
        }
    }
}
