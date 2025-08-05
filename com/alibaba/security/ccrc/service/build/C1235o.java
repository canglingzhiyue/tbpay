package com.alibaba.security.ccrc.service.build;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.o  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1235o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr}) : bArr == null ? "" : Base64.encodeToString(bArr, 2);
    }
}
