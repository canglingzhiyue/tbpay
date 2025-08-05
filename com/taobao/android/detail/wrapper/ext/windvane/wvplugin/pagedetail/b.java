package com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.actionsheet.ActionSheet;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-121511791);
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail.MarketExecutor");
    }

    public static boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"callService".equalsIgnoreCase(str) || str2 == null || (parseObject = JSONObject.parseObject(str2)) == null || !parseObject.containsKey("phone")) {
            return false;
        }
        final String string = parseObject.getString("phone");
        if (com.taobao.android.detail.core.detail.activity.a.b() != null && com.taobao.android.detail.core.detail.activity.a.b().f9418a != null) {
            final DetailCoreActivity detailCoreActivity = com.taobao.android.detail.core.detail.activity.a.b().f9418a;
            Resources resources = detailCoreActivity.getResources();
            final ActionSheet.a aVar = new ActionSheet.a(detailCoreActivity);
            aVar.a(200).a(new String[]{String.format(resources.getString(R.string.detail_call_service), string), resources.getString(R.string.detail_cancel)}, new ActionSheet.b() { // from class: com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.widget.actionsheet.ActionSheet.b
                public void a(ViewGroup viewGroup, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
                        return;
                    }
                    if (i == 0) {
                        detailCoreActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + string)));
                    }
                    aVar.c();
                }
            }).b();
        }
        return true;
    }
}
