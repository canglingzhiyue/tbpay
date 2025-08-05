package com.ali.user.open.mtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.c;

/* loaded from: classes.dex */
public class UccRemoteLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static c getUccLoginImplWithSite(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("a3bdca5", new Object[]{str}) : new UccMtopLoginImpl(str);
    }
}
