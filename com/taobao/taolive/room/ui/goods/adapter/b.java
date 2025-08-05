package com.taobao.taolive.room.ui.goods.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aq;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.goodlist.g;
import java.util.Map;
import tb.kge;
import tb.poy;

/* loaded from: classes8.dex */
public class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-623721677);
        kge.a(269781053);
    }

    @Override // com.taobao.taolive.sdk.goodlist.g
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : poy.ac(n.a());
    }

    @Override // com.taobao.taolive.sdk.goodlist.g
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : poy.R(n.a());
    }

    @Override // com.taobao.taolive.sdk.goodlist.g
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : m.a();
    }

    @Override // com.taobao.taolive.sdk.goodlist.g
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            aq.b(n.a(), str, map);
        }
    }
}
