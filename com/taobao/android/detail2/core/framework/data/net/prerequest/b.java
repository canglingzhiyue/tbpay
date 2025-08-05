package com.taobao.android.detail2.core.framework.data.net.prerequest;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fjx;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements com.taobao.android.preload.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1331537700);
        kge.a(1375254923);
    }

    @Override // com.taobao.android.preload.b
    public String a(String str) {
        Uri parse;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return "";
        }
        if ("content".equals(parse.getQueryParameter("materialType"))) {
            queryParameter = parse.getQueryParameter("contentId");
        } else {
            queryParameter = parse.getQueryParameter("id");
        }
        return fjx.b(queryParameter, fjx.a(str));
    }
}
