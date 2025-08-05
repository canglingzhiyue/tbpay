package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.web.NetworkUtils;
import com.taobao.taobao.R;
import mtopsdk.mtop.domain.MtopResponse;
import tb.its;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class ag {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(907624922);
    }

    public static void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae8c825", new Object[]{context, mtopResponse});
        } else if (mtopResponse == null) {
            Toast.makeText(context, odg.o().a(R.string.tt_detail_app_busy_system_tired), 0).show();
            i.a("mtopResponse is null.");
        } else {
            if (mtopResponse.isNetworkError() && !NetworkUtils.b(f.a())) {
                Toast.makeText(context, odg.o().a(R.string.tt_detail_network_timeout), 0).show();
            } else {
                Toast.makeText(context, odg.o().a(R.string.tt_detail_app_busy_system_tired), 0).show();
            }
            i.a("请求失败，retCode=" + mtopResponse.getRetCode());
        }
    }

    public static boolean a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{mtopResponse})).booleanValue();
        }
        if (mtopResponse == null) {
            return false;
        }
        return 499 == mtopResponse.getResponseCode() || mtopResponse.isApiLockedResult() || mtopResponse.is41XResult() || its.TRAFFIC_LIMIT_STATUS.equals(mtopResponse.getRetCode());
    }
}
