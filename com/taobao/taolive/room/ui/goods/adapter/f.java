package com.taobao.taolive.room.ui.goods.adapter;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.goodlist.l;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class f implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1424310012);
        kge.a(-659736510);
    }

    @Override // com.taobao.taolive.sdk.goodlist.l
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{this, str, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (n.a() != null) {
            a a2 = n.a();
            if (a2.z() != null && a2.z().aJ_() != null) {
                String f = a2.z().aJ_().f();
                if (!StringUtils.isEmpty(f)) {
                    hashMap.put("trackInfo", f);
                }
            }
        }
        ai.a(n.a(), str, (Map<String, String>) hashMap);
    }

    @Override // com.taobao.taolive.sdk.goodlist.l
    public void b(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3967d960", new Object[]{this, str, hashMap});
        } else {
            ai.a(n.a(), str, hashMap);
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.l
    public void c(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cd0e7f", new Object[]{this, str, hashMap});
        } else {
            ai.b(n.a(), str, (String) null, hashMap);
        }
    }
}
