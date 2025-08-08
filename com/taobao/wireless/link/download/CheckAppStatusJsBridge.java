package com.taobao.wireless.link.download;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.rkg;
import tb.rkj;

/* loaded from: classes9.dex */
public class CheckAppStatusJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHECK_APP_STATUS = "checkStatus";
    public static final String CLASSNAME_CHECK_APP_STATUS = "CheckAppStatus";

    static {
        kge.a(-474458995);
    }

    public static /* synthetic */ Object ipc$super(CheckAppStatusJsBridge checkAppStatusJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (StringUtils.equals("checkStatus", str)) {
                JSONObject jSONObject = new JSONObject(str2);
                String string = jSONObject.getString("packageName");
                int i = jSONObject.getInt(BaseFBPlugin.ACT_CONF.supportVersion);
                if (wVCallBackContext != null) {
                    r rVar = new r();
                    boolean b = rkj.b(this.mContext, string);
                    rVar.a("hasInstall", Boolean.valueOf(b));
                    rVar.a("hasSupportFreeLogin", Boolean.valueOf(hasSupportFreeLogin(this.mContext, string, i)));
                    rVar.a("hasLogin", Boolean.valueOf(getIsLogin(string)));
                    wVCallBackContext.success(rVar);
                    rkg.a("link_tag", "CheckAppStatusJsBridge === execute === wvResult：" + rVar.d());
                    if (b) {
                        DownloadCenter.a().a(this.mContext, string);
                    }
                }
            }
        } catch (Exception e) {
            rkg.b("link_tag", "CheckAppStatusJsBridge === execute === 获取登录安装数据异常：" + e);
        }
        return false;
    }

    private boolean getIsLogin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b69dfe", new Object[]{this, str})).booleanValue();
        }
        if (str != null && com.taobao.wireless.link.login.a.a().b != null && com.taobao.wireless.link.login.a.a().b.size() != 0) {
            return com.taobao.wireless.link.login.a.a().b.get(str).booleanValue();
        }
        return false;
    }

    private boolean hasSupportFreeLogin(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6538dfc4", new Object[]{this, context, str, new Integer(i)})).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= i;
        } catch (Exception e) {
            rkg.b("link_tag", "CheckAppStatusJsBridge === hasSupportFreeLogin === 获取packageInfo异常：" + e);
            return false;
        }
    }
}
