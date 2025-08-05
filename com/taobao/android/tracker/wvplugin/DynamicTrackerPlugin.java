package com.taobao.android.tracker.wvplugin;

import android.os.Bundle;
import android.os.Message;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.util.a;
import com.taobao.android.tracker.util.c;
import com.taobao.android.tracker.wvplugin.data.DTData;
import tb.kge;

/* loaded from: classes6.dex */
public class DynamicTrackerPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1344171457);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        c.a("updateConfig  start");
        if (!TextUtils.isEmpty(str) && "updateConfig".equalsIgnoreCase(str)) {
            updateConfig(str2);
        }
        c.a("updateConfig  end");
        return false;
    }

    public static void updateConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ca5b5bc", new Object[]{str});
            return;
        }
        DTData dTData = (DTData) a.a(str, DTData.class);
        if (dTData == null) {
            return;
        }
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putString(MspDBHelper.ActionEntry.COLUMN_NAME_PAGE_ID, dTData.getPageId());
        bundle.putString("page_config", dTData.getConf());
        obtain.setData(bundle);
        com.taobao.android.tracker.a.a().a("weex_update_page_config", obtain);
    }
}
