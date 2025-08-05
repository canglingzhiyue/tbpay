package com.taobao.android.detail.core.standard.widget.anchor;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PicGalleryFixedAnchorContainerLayout extends AbsPicGalleryAnchorContainerLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(819219174);
    }

    public PicGalleryFixedAnchorContainerLayout(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryFixedAnchorContainerLayout");
    }

    public PicGalleryFixedAnchorContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryFixedAnchorContainerLayout");
    }

    public PicGalleryFixedAnchorContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryFixedAnchorContainerLayout");
    }

    @Override // com.taobao.android.detail.core.standard.widget.anchor.AbsPicGalleryAnchorContainerLayout
    public void updateAnchors(c cVar, List<b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e8e8e4f", new Object[]{this, cVar, list});
            return;
        }
        removeAllViews();
        for (b bVar : list) {
            addView(createAnchor(cVar, bVar));
        }
    }
}
