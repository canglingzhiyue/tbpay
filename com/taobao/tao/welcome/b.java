package com.taobao.tao.welcome;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(542711035);
    }

    public b(Context context) {
        super(context, "tips1", new int[]{R.id.provision_negative_button_view_mode, R.id.provision_negative_button_exit_app, R.id.provision_positive_button}, new int[]{R.string.privacy_text_disagree_enter_view_mode, R.string.privacy_text_disagree_exit_app, R.string.privacy_text_agree_continue});
    }

    public b(Context context, int i, int i2, int[] iArr, int[] iArr2) {
        super(context, "tips1", i, i2, iArr, iArr2);
    }

    @Override // com.taobao.tao.welcome.d
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : R.layout.new_provision_dialog2_2;
    }
}
