package com.alipay.mobile.common.transportext.biz.diagnose.network;

import com.alipay.mobile.common.transportext.amnet.Storage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class StorageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Storage f5671a;

    public StorageManager(Storage storage) {
        this.f5671a = storage;
    }

    public Long getBig(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("e3f6429c", new Object[]{this, str, new Boolean(z)});
        }
        byte[] common = z ? this.f5671a.getCommon(str) : this.f5671a.getSecure(str);
        if (common == null || common.length != 8) {
            return null;
        }
        return Long.valueOf((common[7] & 255) | (((((((((((common[2] & 255) | (((common[1] & 255) | (common[0] << 8)) << 8)) << 8) | (common[3] & 255)) << 8) | (common[4] & 255)) << 8) | (common[5] & 255)) << 8) | (common[6] & 255)) << 8));
    }

    public Integer getInt(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("fb1fd231", new Object[]{this, str, new Boolean(z)});
        }
        byte[] common = z ? this.f5671a.getCommon(str) : this.f5671a.getSecure(str);
        if (common != null && common.length == 4) {
            return Integer.valueOf((common[3] & 255) | (((((common[0] << 8) | (common[1] & 255)) << 8) | (common[2] & 255)) << 8));
        }
        return null;
    }

    public String getStr(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0117498", new Object[]{this, str, new Boolean(z)});
        }
        byte[] common = z ? this.f5671a.getCommon(str) : this.f5671a.getSecure(str);
        if (common != null) {
            return NetworkDiagnoseUtil.convert(common);
        }
        return null;
    }
}
