package com.taobao.search.searchdoor.sf.widgets.activate.data.bean;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class HintGuideBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String nameSpace;
    private int showInterval;
    private String showText;
    private int totalCount;

    static {
        kge.a(-437890426);
        kge.a(1028243835);
    }

    public int getTotalCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue() : this.totalCount;
    }

    public void setTotalCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6425d4f", new Object[]{this, new Integer(i)});
        } else {
            this.totalCount = i;
        }
    }

    public int getShowInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7bb81d2", new Object[]{this})).intValue() : this.showInterval;
    }

    public void setShowInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db4b3978", new Object[]{this, new Integer(i)});
        } else {
            this.showInterval = i;
        }
    }

    public String getNameSpace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3e990d94", new Object[]{this}) : this.nameSpace;
    }

    public void setNameSpace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c660ca", new Object[]{this, str});
        } else {
            this.nameSpace = str;
        }
    }

    public String getShowText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8916abb9", new Object[]{this}) : this.showText;
    }

    public void setShowText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249c25dd", new Object[]{this, str});
        } else {
            this.showText = str;
        }
    }

    public boolean isLegal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c32224ba", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.showText) && !TextUtils.isEmpty(this.nameSpace) && this.totalCount > 0 && this.showInterval > 0;
    }
}
