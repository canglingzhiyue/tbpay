package com.alibaba.poplayer.factory.view.base;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.config.model.base.IModel;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class ClickableAreaParam implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int bottom;
    public int height;
    public String layoutX;
    public String layoutY;
    public int left;
    public int right;
    public int top;
    public int width;

    static {
        kge.a(-989460379);
        kge.a(-284545415);
    }

    @Override // com.alibaba.poplayer.config.model.base.IModel
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.left >= 0 && this.top >= 0 && this.right >= 0 && this.bottom >= 0 && this.width > 0 && this.height > 0 && !StringUtils.isEmpty(this.layoutX) && !StringUtils.isEmpty(this.layoutY);
    }
}
