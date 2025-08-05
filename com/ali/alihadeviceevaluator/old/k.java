package com.ali.alihadeviceevaluator.old;

import com.android.alibaba.ip.runtime.IpChange;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f1811a = 0;

    public int a(HardWareInfo hardWareInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5aea3420", new Object[]{this, hardWareInfo})).intValue();
        }
        long j = this.f1811a;
        if (j >= 6144) {
            return 10;
        }
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            return 9;
        }
        if (j >= 3072) {
            return 7;
        }
        if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX) {
            return 5;
        }
        if (j >= 1024) {
            return 3;
        }
        return j >= 512 ? 1 : 8;
    }
}
