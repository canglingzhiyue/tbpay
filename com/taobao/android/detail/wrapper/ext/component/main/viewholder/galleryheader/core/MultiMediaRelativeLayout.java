package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class MultiMediaRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int supposedWidth;

    static {
        kge.a(1132660018);
    }

    public static /* synthetic */ Object ipc$super(MultiMediaRelativeLayout multiMediaRelativeLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MultiMediaRelativeLayout(Context context) {
        super(context);
        this.supposedWidth = epo.b;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaRelativeLayout");
    }

    public MultiMediaRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.supposedWidth = epo.b;
        this.supposedWidth = epo.b(attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "subItemWidthDp", 55));
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaRelativeLayout");
    }

    public MultiMediaRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.supposedWidth = epo.b;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaRelativeLayout");
    }

    public void setSupposedWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3157bf9d", new Object[]{this, new Integer(i)});
        } else {
            this.supposedWidth = i;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(1073741824 | this.supposedWidth, i2);
        }
    }
}
