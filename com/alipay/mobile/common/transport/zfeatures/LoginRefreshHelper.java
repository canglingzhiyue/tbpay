package com.alipay.mobile.common.transport.zfeatures;

import android.content.Context;
import com.alipay.mobile.common.transport.http.HttpException;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class LoginRefreshHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void recordRpc(HttpWorker httpWorker, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe55a6f7", new Object[]{httpWorker, context});
            return;
        }
        try {
            if (httpWorker.isRpcRequest() && LoginRefreshManager.getInstance().isEnabledLoginRefresh(context)) {
                LoginRefreshManager.getInstance().recordRpc(httpWorker);
            }
        } catch (Throwable th) {
            LogCatUtil.error(HttpWorker.TAG, "LoginRefreshHelper#recordRpc error. ", th);
        }
    }

    public static final void checkIn(HttpWorker httpWorker, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e6ab9e", new Object[]{httpWorker, context});
            return;
        }
        try {
            if (!httpWorker.isRpcRequest() || !LoginRefreshManager.getInstance().isEnabledLoginRefresh(context) || LoginRefreshManager.getInstance().checkIn(httpWorker)) {
                return;
            }
            throw new HttpException((Integer) 50, " Login refresh check don't pass. API:" + httpWorker.getOperationType());
        } catch (HttpException e) {
            throw e;
        } catch (Throwable th) {
            LogCatUtil.error(HttpWorker.TAG, "LoginRefreshHelper#checkIn error. ", th);
        }
    }

    public static final void removeRpc(HttpWorker httpWorker, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45603aa", new Object[]{httpWorker, context});
            return;
        }
        try {
            if (httpWorker.isRpcRequest() && LoginRefreshManager.getInstance().isEnabledLoginRefresh(context)) {
                LoginRefreshManager.getInstance().removeRecord(httpWorker);
            }
        } catch (Throwable th) {
            LogCatUtil.error(HttpWorker.TAG, "LoginRefreshHelper#removeRpc error. ", th);
        }
    }
}
