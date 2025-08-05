package com.ali.user.mobile.rpc.filter;

import com.ali.user.mobile.rpc.RpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class FilterManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STOP = "STOP";
    private static FilterManager instance;

    static {
        kge.a(1582944688);
        instance = null;
    }

    private FilterManager() {
    }

    public static FilterManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FilterManager) ipChange.ipc$dispatch("6cf11883", new Object[0]);
        }
        if (instance == null) {
            synchronized (FilterManager.class) {
                if (instance == null) {
                    instance = new FilterManager();
                }
            }
        }
        return instance;
    }

    public void beforeRpc(List<IBeforeFilter> list) {
        String doBefore;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f50925e", new Object[]{this, list});
        } else if (list == null) {
        } else {
            Iterator<IBeforeFilter> it = list.iterator();
            while (it.hasNext() && (doBefore = it.next().doBefore()) != null && !"STOP".equals(doBefore)) {
            }
        }
    }

    public void afterRpc(List<IAfterFilter> list, RpcResponse rpcResponse) {
        String doAfter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ba4e2c", new Object[]{this, list, rpcResponse});
        } else if (list == null) {
        } else {
            Iterator<IAfterFilter> it = list.iterator();
            while (it.hasNext() && (doAfter = it.next().doAfter(rpcResponse)) != null && !"STOP".equals(doAfter)) {
            }
        }
    }
}
