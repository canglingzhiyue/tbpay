package com.ali.user.mobile.url;

import com.ali.user.mobile.callback.RpcRequestCallback;
import com.ali.user.mobile.url.model.AcBaseParam;
import com.ali.user.mobile.url.service.impl.UrlFetchServiceImpl;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AccountCenterApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AccountCenterApi instance;

    static {
        kge.a(1468377024);
        instance = null;
    }

    private AccountCenterApi() {
    }

    public static AccountCenterApi getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountCenterApi) ipChange.ipc$dispatch("73e8c073", new Object[0]);
        }
        if (instance == null) {
            synchronized (AccountCenterApi.class) {
                if (instance == null) {
                    instance = new AccountCenterApi();
                }
            }
        }
        return instance;
    }

    public void commonAc(boolean z, AcBaseParam acBaseParam, RpcRequestCallback rpcRequestCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58c6bbb", new Object[]{this, new Boolean(z), acBaseParam, rpcRequestCallback});
        } else if (z) {
            UrlFetchServiceImpl.getInstance().navBySceneRemote(acBaseParam, rpcRequestCallback);
        } else {
            UrlFetchServiceImpl.getInstance().foundH5urls(acBaseParam, rpcRequestCallback);
        }
    }
}
