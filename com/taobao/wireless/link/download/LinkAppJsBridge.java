package com.taobao.wireless.link.download;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.rjw;
import tb.rke;
import tb.rkg;
import tb.rki;
import tb.rkj;

/* loaded from: classes9.dex */
public class LinkAppJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHECK_INSTALL_PERMISSION = "checkInstallPermission";
    private static final String ACTION_LAUNCH_APP = "launchApp";
    private static final String ACTION_REQUEST_INSTALL_PERMISSION = "requestInstallPermission";
    public static final String CLASSNAME_APP = "LinkApp";

    static {
        kge.a(1673046313);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        rkg.b("link_tag", "LinkAppJsBridge === execute === action:" + str + ", params:" + str2);
        try {
            if (StringUtils.equals(ACTION_LAUNCH_APP, str)) {
                String string = new JSONObject(str2).getString("packageName");
                if (!StringUtils.isEmpty(string)) {
                    boolean a2 = rke.a(this.mContext, string);
                    if (wVCallBackContext != null) {
                        if (a2) {
                            rki.a(rki.ARG1_LAUNCH_APK_DOWNLOAD, null, string, null);
                            wVCallBackContext.success();
                        } else {
                            wVCallBackContext.error();
                        }
                    }
                } else if (wVCallBackContext != null) {
                    r rVar = new r();
                    rVar.a("message", "Please provide the required parameter 'packageName'.");
                    wVCallBackContext.error(rVar);
                }
            } else if (StringUtils.equals(ACTION_REQUEST_INSTALL_PERMISSION, str)) {
                rjw.b(this.mContext);
                if (wVCallBackContext != null) {
                    wVCallBackContext.success();
                }
            } else if (StringUtils.equals(ACTION_CHECK_INSTALL_PERMISSION, str)) {
                boolean c = rkj.c(this.mContext);
                if (wVCallBackContext != null) {
                    r rVar2 = new r();
                    rVar2.a("data", Boolean.valueOf(c));
                    wVCallBackContext.success(rVar2);
                }
            }
        } catch (Exception e) {
            rkg.b("link_tag", "LinkAppJsBridge === execute === 启动安装的APP异常：" + e);
        }
        return false;
    }
}
