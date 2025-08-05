package com.taobao.search.searchdoor;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.r;
import java.util.Set;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes7.dex */
public final class a implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1775370956);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "CouponSRPNavPreProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent != null && (data = intent.getData()) != null) {
            String dataString = intent.getDataString();
            String str = "";
            if (dataString == null) {
                dataString = str;
            }
            String path = data.getPath();
            if (path != null) {
                str = path;
            }
            if (!TextUtils.isEmpty(str)) {
                String str2 = dataString;
                if (TextUtils.isEmpty(str2) || (!q.a((Object) str, (Object) "/coudan/search_product.htm")) || n.b((CharSequence) str2, new String[]{"?"}, false, 0, 6, (Object) null).size() < 2) {
                    return true;
                }
                String aW = r.aW();
                if (TextUtils.isEmpty(aW)) {
                    return true;
                }
                Uri.Builder buildUpon = Uri.parse(aW).buildUpon();
                Set<String> queryKeys = data.getQueryParameterNames();
                q.a((Object) queryKeys, "queryKeys");
                if (!queryKeys.isEmpty()) {
                    for (String str3 : queryKeys) {
                        if (!TextUtils.isEmpty(str3)) {
                            String queryParameter = data.getQueryParameter(str3);
                            if (!TextUtils.isEmpty(queryParameter)) {
                                buildUpon.appendQueryParameter(str3, queryParameter);
                            }
                        }
                    }
                }
                intent.setData(buildUpon.build());
            }
        }
        return true;
    }
}
