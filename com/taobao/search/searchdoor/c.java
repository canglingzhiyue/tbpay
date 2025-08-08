package com.taobao.search.searchdoor;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class c implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1938603526);
        kge.a(-719787762);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "MultipleSearchDoorNavProcessor";
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
        if (intent == null || dVar == null || (data = intent.getData()) == null) {
            return true;
        }
        String queryParameter = data.getQueryParameter(noa.KEY_SEARCHDOOR_LAUNCH_MODE);
        if (StringUtils.isEmpty(queryParameter)) {
            queryParameter = data.getQueryParameter("g_launchMode");
        }
        if (StringUtils.equals(queryParameter, noa.VALUE_SEARCHDOOR_LAUNCH_MODE_NEW_TASK)) {
            intent.addCategory(k.MULTIPLE_SEARCHDOOR_CATEGORY);
        }
        return true;
    }
}
