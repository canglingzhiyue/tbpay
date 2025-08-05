package android.taobao.windvane.extra.jsbridge;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.wireless.aliprivacy.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ado;
import tb.kge;

/* loaded from: classes2.dex */
public class WVApplication extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1021420969);
    }

    public static /* synthetic */ Object ipc$super(WVApplication wVApplication, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getNotificationSettings".equals(str)) {
            getNotificationSettings(wVCallBackContext, str2);
        } else if (!b.SETTINGS_CONFIG_KEY.equals(str)) {
            return false;
        } else {
            openSettings(wVCallBackContext, str2);
        }
        return true;
    }

    private void getNotificationSettings(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acc54b2", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        if (Build.VERSION.SDK_INT < 22) {
            rVar.a("status", "unknown");
            wVCallBackContext.success(rVar);
        } else if (!ado.a(this.mContext)) {
            rVar.a("status", "denied");
            wVCallBackContext.success(rVar);
        } else {
            rVar.a("status", "authorized");
            wVCallBackContext.success(rVar);
        }
    }

    private void openSettings(WVCallBackContext wVCallBackContext, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10e0f5b", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            try {
                str2 = new JSONObject(str).optString("type", "");
            } catch (JSONException unused) {
                wVCallBackContext.error(new r("HY_PARAM_ERR"));
                str2 = null;
            }
            if ("Notification".equals(str2)) {
                j.a();
                if (j.commonConfig.bb && Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", this.mContext.getPackageName());
                    if (this.mContext != null) {
                        this.mContext.startActivity(intent);
                        wVCallBackContext.success();
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 21) {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent2.putExtra("app_package", this.mContext.getPackageName());
                    intent2.putExtra("app_uid", this.mContext.getApplicationInfo().uid);
                    if (this.mContext != null) {
                        this.mContext.startActivity(intent2);
                        wVCallBackContext.success();
                        return;
                    }
                }
                r rVar = new r();
                rVar.a("msg", "fail to open Notification Settings");
                wVCallBackContext.error(rVar);
                return;
            }
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            if (this.mContext != null) {
                intent3.setData(Uri.fromParts("package", this.mContext.getPackageName(), null));
                this.mContext.startActivity(intent3);
                wVCallBackContext.success();
                return;
            }
            r rVar2 = new r();
            rVar2.a("msg", "fail to open Application Settings");
            wVCallBackContext.error(rVar2);
        } catch (Throwable unused2) {
            wVCallBackContext.error();
        }
    }
}
