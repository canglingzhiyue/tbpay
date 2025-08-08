package com.taobao.taobao.scancode.barcode.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.util.j;
import tb.cpe;
import tb.css;
import tb.kge;
import tb.oyd;
import tb.oys;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1968610629);
    }

    private static void a(Activity activity, String str, css cssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe8d691", new Object[]{activity, str, cssVar});
            return;
        }
        String queryParameter = activity.getIntent().getData().getQueryParameter("pssource");
        if (StringUtils.isEmpty(queryParameter)) {
            queryParameter = cpe.PsSourceSY_SYS;
        }
        j.a(activity.getApplicationContext(), cssVar).a(Uri.parse(com.taobao.android.detail.ttdetail.constant.a.FIND_SIMILAR_URL_PREFIX).buildUpon().appendQueryParameter("pssource", queryParameter).appendQueryParameter(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, "productCode").appendQueryParameter("barcode", str).build().toString());
    }

    public static boolean a(Activity activity, oyd oydVar, String str, int i, String str2, boolean z, css cssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86d577f2", new Object[]{activity, oydVar, str, new Integer(i), str2, new Boolean(z), cssVar})).booleanValue();
        }
        Context applicationContext = activity.getApplicationContext();
        if (i == 1) {
            try {
                ScancodeBaseBrowserActivity.f();
                a(activity, str, cssVar);
                return true;
            } catch (Exception unused) {
            }
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append("taobao://tb.cn/n/scancode/h5/barcode/info?barcode=");
        sb.append(str);
        if (i == 3) {
            sb.append("&type=");
            sb.append("3");
            sb.append("&linkUrl=");
            sb.append(str2);
        }
        sb.append("&saveHistory=");
        sb.append(z);
        if (oydVar != null) {
            sb.append("&");
            sb.append(oydVar.a());
        }
        String sb2 = sb.toString();
        boolean a2 = j.a(applicationContext, cssVar).a(sb2);
        oys.a().a("Recommend_Nav_lunchBarcodePage", "finalUrl", sb2);
        return a2;
    }
}
