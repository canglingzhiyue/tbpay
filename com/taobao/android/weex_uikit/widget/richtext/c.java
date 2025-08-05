package com.taobao.android.weex_uikit.widget.richtext;

import android.text.SpannableString;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-552165289);
    }

    public c(RichText richText) {
        super(richText);
    }

    @Override // com.taobao.android.weex_uikit.widget.richtext.a
    public void a(SpannableString spannableString, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba1e299", new Object[]{this, spannableString, new Integer(i)});
            return;
        }
        a(spannableString, i, k().length() + i);
        b(spannableString, i);
    }
}
