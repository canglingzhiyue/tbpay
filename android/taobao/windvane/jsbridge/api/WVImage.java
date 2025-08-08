package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.h;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVImage extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(271737870);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.equals(str, "saveImage")) {
            return false;
        }
        try {
            String optString = new JSONObject(str2).optString("url", "");
            if (!StringUtils.isEmpty(optString)) {
                h.a(this.mContext, optString, new h.a() { // from class: android.taobao.windvane.jsbridge.api.WVImage.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.taobao.windvane.util.h.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            wVCallBackContext.success();
                        }
                    }

                    @Override // android.taobao.windvane.util.h.a
                    public void a(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str3});
                            return;
                        }
                        r rVar = new r();
                        rVar.a("msg", str3);
                        wVCallBackContext.error(rVar);
                    }
                });
            }
        } catch (JSONException e) {
            r rVar = new r();
            rVar.a("msg", e.getMessage());
            wVCallBackContext.error(rVar);
        }
        return true;
    }
}
