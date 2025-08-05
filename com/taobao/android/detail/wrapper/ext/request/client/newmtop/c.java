package com.taobao.android.detail.wrapper.ext.request.client.newmtop;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.main.MainRequestParams;
import tb.dyo;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-268893973);
        emu.a("com.taobao.android.detail.wrapper.ext.request.client.newmtop.MainRequestParamsUtils");
    }

    public static boolean a(MainRequestParams mainRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed641bb2", new Object[]{mainRequestParams})).booleanValue();
        }
        if (mainRequestParams == null || mainRequestParams.mExParams == null || !mainRequestParams.mExParams.containsKey("isInit")) {
            return false;
        }
        mainRequestParams.mExParams.remove("isInit");
        return true;
    }

    public static String b(MainRequestParams mainRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6435833", new Object[]{mainRequestParams});
        }
        if (mainRequestParams == null || mainRequestParams.mExParams == null || !mainRequestParams.mExParams.containsKey(dyo.STREAM_FLAG)) {
            return "";
        }
        String str = mainRequestParams.mExParams.get(dyo.STREAM_FLAG);
        mainRequestParams.mExParams.remove(dyo.STREAM_FLAG);
        return str;
    }

    public static String c(MainRequestParams mainRequestParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be2fc5b4", new Object[]{mainRequestParams}) : (mainRequestParams == null || mainRequestParams.mExParams == null || !mainRequestParams.mExParams.containsKey(dyo.STREAM_FLAG)) ? "" : mainRequestParams.mExParams.get(dyo.STREAM_FLAG);
    }

    public static boolean d(MainRequestParams mainRequestParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2ae10cf", new Object[]{mainRequestParams})).booleanValue();
        }
        if (mainRequestParams == null || mainRequestParams.mExParams == null || !mainRequestParams.mExParams.containsKey(com.taobao.android.detail.wrapper.nav.c.KEY_DETAIL_NAV)) {
            return false;
        }
        mainRequestParams.mExParams.remove(com.taobao.android.detail.wrapper.nav.c.KEY_DETAIL_NAV);
        return true;
    }
}
