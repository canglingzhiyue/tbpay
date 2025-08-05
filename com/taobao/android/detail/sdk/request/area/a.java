package com.taobao.android.detail.sdk.request.area;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.d;
import java.util.HashMap;
import tb.kge;
import tb.mrm;

/* loaded from: classes4.dex */
public class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f10308a;
    private String b;

    static {
        kge.a(-133281632);
        kge.a(-1535221011);
    }

    @Override // com.taobao.android.detail.sdk.request.d
    public HashMap<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String str = this.f10308a;
        if (str != null) {
            hashMap.put("itemId", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            hashMap.put(mrm.KEY_AREA_ID, str2);
        }
        return hashMap;
    }
}
