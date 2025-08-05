package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.afc.xbs.b;
import tb.kge;
import tb.koi;

/* loaded from: classes7.dex */
public class XbsJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_HIDE_TIPS = "hideTips";
    private static final String ACTION_SHOW_TIPS = "resumeTips";
    public static final String CLASSNAME_BC_TIPS = "TBTipsJSBridgeHandler";

    static {
        kge.a(-2088351626);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str == null) {
            c.b("linkx", "showXbs : action is null");
            return false;
        } else if (str.equals("hideTips")) {
            b.a();
            return true;
        } else if (str.equals(ACTION_SHOW_TIPS) && koi.a().f30190a != null) {
            b.a(koi.a().f30190a.get());
            return true;
        } else {
            c.b("linkx", "XbsJsBridge === showXbs : no action is match");
            return false;
        }
    }
}
