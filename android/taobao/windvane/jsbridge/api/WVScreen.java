package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.i;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import java.io.File;
import org.json.JSONObject;
import tb.ado;
import tb.kge;
import tb.lsk;
import tb.riy;

/* loaded from: classes2.dex */
public class WVScreen extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVScreen";

    static {
        kge.a(111500313);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, final String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("capture".equals(str)) {
            if (this.mContext != null) {
                if (Build.VERSION.SDK_INT < 30) {
                    android.taobao.windvane.runtimepermission.b.a(this.mContext, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.jsbridge.api.WVScreen.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                WVScreen.this.capture(wVCallBackContext, str2);
                            }
                        }
                    }).b(new i(wVCallBackContext, "no permission")).b();
                } else {
                    capture(wVCallBackContext, str2);
                }
            }
        } else if ("getOrientation".equals(str)) {
            getOrientation(wVCallBackContext, str2);
        } else if (!"setOrientation".equals(str)) {
            return false;
        } else {
            setOrientation(wVCallBackContext, str2);
        }
        return true;
    }

    public void capture(WVCallBackContext wVCallBackContext, String str) {
        String optString;
        String optString2;
        boolean optBoolean;
        long j;
        long j2;
        long a2;
        String a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbaded4", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        int i = 50;
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("inAlbum", "false");
                optString2 = jSONObject.optString("type", "view");
                long optLong = jSONObject.optLong("maxShortSide", FileUtil.LOCAL_REPORT_FILE_MAX_SIZE);
                long optLong2 = jSONObject.optLong("maxLongSide", FileUtil.LOCAL_REPORT_FILE_MAX_SIZE);
                int optInt = jSONObject.optInt("quality", 50);
                if (optInt <= 100 && optInt >= 0) {
                    i = optInt;
                }
                optBoolean = jSONObject.optBoolean("compress", true);
                j = optLong2;
                j2 = optLong;
            } catch (Exception e) {
                rVar.a("msg", "param error: [" + e.getMessage() + riy.ARRAY_END_STR);
                wVCallBackContext.error(rVar);
                return;
            }
        } else {
            optString = "";
            optString2 = "app";
            j = 10240;
            j2 = 10240;
            optBoolean = true;
        }
        boolean z = !"false".equals(optString);
        try {
            if (optString2.equals("app")) {
                a2 = ScreenCaptureUtil.a((Activity) this.mContext, z, i, j, j2, optBoolean);
            } else {
                a2 = ScreenCaptureUtil.a(this.mWebView.getView(), z, i, j, j2, optBoolean);
            }
            rVar.a("url", ado.a(Long.valueOf(a2)));
            rVar.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, android.taobao.windvane.cache.a.a().a(true) + File.separator + android.taobao.windvane.util.d.a(a3));
            wVCallBackContext.success(rVar);
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    public void getOrientation(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca441b28", new Object[]{this, wVCallBackContext, str});
            return;
        }
        r rVar = new r();
        if (!(this.mContext instanceof Activity)) {
            rVar.a("error", "Context must be Activty!");
            wVCallBackContext.error(rVar);
            return;
        }
        int requestedOrientation = ((Activity) this.mContext).getRequestedOrientation();
        rVar.a("orientation", requestedOrientation == 0 ? "landscape" : requestedOrientation == 1 ? "portrait" : "unknown");
        wVCallBackContext.success(rVar);
    }

    public void setOrientation(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66892d9c", new Object[]{this, wVCallBackContext, str});
            return;
        }
        new r();
        String str2 = "";
        if (!StringUtils.isEmpty(str)) {
            try {
                str2 = new JSONObject(str).optString("orientation", str2);
            } catch (Exception unused) {
                wVCallBackContext.error(new r("HY_PARAM_ERR"));
            }
        }
        if (!(this.mContext instanceof Activity)) {
            r rVar = new r();
            rVar.a("error", "Context must be Activty!");
            wVCallBackContext.error(rVar);
        } else if (lsk.BIZ_NAME.equals(this.mContext.getClass().getName())) {
            r rVar2 = new r();
            rVar2.a("error", "Context cannot be TBMainActivity!");
            wVCallBackContext.error(rVar2);
        } else {
            Activity activity = (Activity) this.mContext;
            if (str2.equals("landscape") || str2.equals("landscapeRight")) {
                activity.setRequestedOrientation(0);
            } else if (str2.equals("landscapeLeft")) {
                activity.setRequestedOrientation(8);
            } else if (str2.equals("portrait") || str2.equals("default")) {
                activity.setRequestedOrientation(1);
            } else if (str2.equals("portraitUpsideDown")) {
                activity.setRequestedOrientation(9);
            } else if (str2.equals("auto")) {
                activity.setRequestedOrientation(4);
            } else {
                wVCallBackContext.error();
                return;
            }
            wVCallBackContext.success();
        }
    }
}
