package com.taobao.taolive.adapterimpl.uikit;

import android.content.Context;
import android.util.AttributeSet;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.alilive.adapter.uikit.e;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1013726874);
        kge.a(712444010);
    }

    @Override // com.alilive.adapter.uikit.e
    public AliUrlImageView.a a(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView.a) ipChange.ipc$dispatch("e078d79a", new Object[]{this, context, attributeSet, new Integer(i)}) : new TaoliveUrlImageView(context, attributeSet, i);
    }
}
