package com.taobao.tao.welcome;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes.dex */
public class a extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(542711034);
    }

    public a(Context context) {
        super(context, "tips1", null, new int[]{R.string.wl_Disagree, R.string.wl_Agree});
    }

    @Override // com.taobao.tao.welcome.d
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.layout.new_provision_dialog2_1;
    }
}
