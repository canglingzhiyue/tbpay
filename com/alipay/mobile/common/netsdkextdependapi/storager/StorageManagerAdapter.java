package com.alipay.mobile.common.netsdkextdependapi.storager;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class StorageManagerAdapter implements StorageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.storager.StorageManager
    public Serializable getSerializable(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializable) ipChange.ipc$dispatch("3cc33b64", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.storager.StorageManager
    public boolean remove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39af3819", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.netsdkextdependapi.storager.StorageManager
    public boolean saveSerializable(String str, Serializable serializable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c14bb5e7", new Object[]{this, str, serializable, new Long(j)})).booleanValue();
        }
        return false;
    }
}
