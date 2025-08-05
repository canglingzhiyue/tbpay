package com.taobao.alimama.click.cps;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import tb.kge;

/* loaded from: classes4.dex */
public class CpsClickBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-941771699);
    }

    public Uri commitAndAppendClickid(String str, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("3f346704", new Object[]{this, str, uri}) : new a(Global.getApplication()).a(str, uri);
    }
}
