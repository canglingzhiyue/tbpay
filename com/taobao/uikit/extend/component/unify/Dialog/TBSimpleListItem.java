package com.taobao.uikit.extend.component.unify.Dialog;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TBSimpleListItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mText;
    public TBSimpleListItemType mType;

    static {
        kge.a(2045490501);
    }

    public TBSimpleListItem() {
        this.mType = TBSimpleListItemType.NORMAL;
    }

    public TBSimpleListItem(String str, TBSimpleListItemType tBSimpleListItemType) {
        this.mType = TBSimpleListItemType.NORMAL;
        this.mText = str;
        this.mType = tBSimpleListItemType;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97297536", new Object[]{this}) : this.mText;
    }

    public TBSimpleListItemType getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSimpleListItemType) ipChange.ipc$dispatch("53b093a9", new Object[]{this}) : this.mType;
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.mText = str;
        }
    }

    public void setType(TBSimpleListItemType tBSimpleListItemType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d39d5f", new Object[]{this, tBSimpleListItemType});
        } else {
            this.mType = tBSimpleListItemType;
        }
    }
}
