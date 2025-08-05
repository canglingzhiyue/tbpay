package com.taobao.homepage.utils;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class AccessibilityWVPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(501529940);
    }

    public static /* synthetic */ Object ipc$super(AccessibilityWVPlugin accessibilityWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"isScreenReaderOpen".equals(str)) {
            return false;
        }
        doAccessibilityCheck(str2, wVCallBackContext);
        return true;
    }

    private void doAccessibilityCheck(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39116153", new Object[]{this, str, wVCallBackContext});
            return;
        }
        r rVar = new r();
        rVar.a("isOpen", Boolean.valueOf(a.a(this.mContext)));
        wVCallBackContext.success(rVar);
    }
}
