package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.actionbar.ShowTBPublicMenu;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes9.dex */
public class TBPopoverBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "TBPopoverBridge";
    private static final String SHOW = "show";

    static {
        kge.a(-278706642);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("show".equals(str)) {
            try {
                ShowTBPublicMenu.show((Activity) this.mContext, str2, new ShowTBPublicMenu.CallBack() { // from class: com.taobao.uikit.actionbar.TBPopoverBridge.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.actionbar.ShowTBPublicMenu.CallBack
                    public void callBack(String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ef34536", new Object[]{this, str3});
                            return;
                        }
                        WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                        if (wVCallBackContext2 == null) {
                            return;
                        }
                        WVStandardEventCenter.postNotificationToJS(wVCallBackContext2.getWebview(), "customPopoverItemClicked", str3);
                    }
                });
                wVCallBackContext.success();
            } catch (JSONException e) {
                TLog.loge(NAME, "JSONException", e);
                wVCallBackContext.error(e.getMessage());
            }
        }
        return false;
    }
}
