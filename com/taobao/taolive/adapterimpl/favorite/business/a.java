package com.taobao.taolive.adapterimpl.favorite.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CANCEL_FAVORITE = 2;
    public static final int TYPE_IS_FAVORITE = 3;
    public static final int TYPE_SET_FAVORITE = 1;

    static {
        kge.a(1790291980);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        FavoriteRequest favoriteRequest = new FavoriteRequest();
        favoriteRequest.anchorId = str;
        a(1, favoriteRequest, FavoriteResponse.class);
    }
}
