package com.alipay.mobile.security.bio.runtime.download.impl;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.alipay.mobile.security.bio.runtime.download.BioCpuArchChecker;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.rgn;

/* loaded from: classes3.dex */
public class BioCpuArchCheckerImpl implements BioCpuArchChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.security.bio.runtime.download.BioCpuArchChecker
    public boolean is64Bit(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0aa8cc0", new Object[]{this, context})).booleanValue();
        }
        try {
            if (rgn.getCurrentRuntimeCpuArchValue(context) != 8) {
                z = false;
            }
            BioLog.d("CpuArch is64Bit  " + z);
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            return Process.is64Bit();
        }
    }
}
