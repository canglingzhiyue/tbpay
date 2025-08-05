package com.taobao.taolive.room.ui.goods.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.goodlist.j;
import tb.kge;

/* loaded from: classes8.dex */
public class e implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1399757268);
        kge.a(-1238067990);
    }

    @Override // com.taobao.taolive.sdk.goodlist.j
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            s.a(context, str);
        }
    }
}
