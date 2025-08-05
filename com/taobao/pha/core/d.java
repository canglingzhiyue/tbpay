package com.taobao.pha.core;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class d implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f18735a;

    static {
        kge.a(-912892829);
        kge.a(-274617221);
        HashMap hashMap = new HashMap();
        f18735a = hashMap;
        hashMap.put("/mtb/lib-windvane/3.0.7/windvane.js", "windvane.js");
        f18735a.put("/mtb/lib-mtop/2.6.1/mtop.js", "mtop.js");
        f18735a.put("/ali-lib/aplus/0.1.1/index.js", "aplus.js");
        f18735a.put("/mtb/lib-login/2.2.0/login.js", "login.js");
        f18735a.put("/mtb/lib-promise/3.1.3/polyfillB.js", "promise.js");
    }

    @Override // com.taobao.pha.core.g
    public InputStream a(Uri uri) {
        String path;
        String str;
        c j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("54091b62", new Object[]{this, uri});
        }
        if (uri == null || !TextUtils.equals("g.alicdn.com", uri.getHost()) || (path = uri.getPath()) == null || (str = f18735a.get(path)) == null || (j = p.b().j()) == null) {
            return null;
        }
        return j.c("pha-built-in-library" + File.separator + str);
    }
}
