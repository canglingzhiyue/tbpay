package com.taobao.android.detail.sdk.request.combo;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.d;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes4.dex */
public class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_COMBO_ID = "comboId";
    public static final String K_ITEM_ID = "itemId";
    public static final String K_SELLER_ID = "sellerId";

    /* renamed from: a  reason: collision with root package name */
    private String f10313a;
    private String b;
    private String c;

    static {
        kge.a(1057930830);
        kge.a(-1535221011);
    }

    @Override // com.taobao.android.detail.sdk.request.d
    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!StringUtils.isEmpty(this.f10313a)) {
            hashMap.put("itemId", this.f10313a);
        }
        if (!StringUtils.isEmpty(this.b)) {
            hashMap.put(K_COMBO_ID, this.b);
        }
        if (!StringUtils.isEmpty(this.c)) {
            hashMap.put("sellerId", this.c);
        }
        return hashMap;
    }
}
