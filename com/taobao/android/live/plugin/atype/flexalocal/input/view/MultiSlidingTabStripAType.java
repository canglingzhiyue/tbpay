package com.taobao.android.live.plugin.atype.flexalocal.input.view;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class MultiSlidingTabStripAType extends PagerSlidingTabStripAType {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1664080310);
    }

    public static /* synthetic */ Object ipc$super(MultiSlidingTabStripAType multiSlidingTabStripAType, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MultiSlidingTabStripAType(Context context) {
        this(context, null);
    }

    public MultiSlidingTabStripAType(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiSlidingTabStripAType(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCacheDataEnable = true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.input.view.PagerSlidingTabStripAType
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.mCacheDataEnable) {
        } else {
            super.destroy();
        }
    }
}
