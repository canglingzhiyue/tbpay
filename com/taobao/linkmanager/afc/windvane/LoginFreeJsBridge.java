package com.taobao.linkmanager.afc.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.b;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.afc.reduction.a;
import com.taobao.linkmanager.afc.utils.f;
import com.taobao.linkmanager.launcher.TbFcLinkInit;
import tb.kge;

/* loaded from: classes7.dex */
public class LoginFreeJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "loginFree";
    public static final String NAME = "LoginFreeHandler";

    static {
        kge.a(173456098);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, ACTION)) {
            c.a("linkx", "LoginFreeJsBridge === execute === js调用免登");
            String a2 = b.a().a("is_js_login_open", "true");
            if (TextUtils.equals("false", a2)) {
                c.a("linkx", "LoginFreeJsBridge === execute === js调用免登：" + a2);
                return false;
            }
            f.a(TbFcLinkInit.instance().mApplication, new a() { // from class: com.taobao.linkmanager.afc.windvane.LoginFreeJsBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.linkmanager.afc.reduction.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WVStandardEventCenter.postNotificationToJS("is_login_success", "true");
                    }
                }

                @Override // com.taobao.linkmanager.afc.reduction.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        WVStandardEventCenter.postNotificationToJS("is_login_success", "false");
                    }
                }
            });
        }
        return true;
    }
}
