package com.taobao.search.searchdoor.sf.widgets.activate.data.bean;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class CombineHistoryCellBean extends HistoryCellBean {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String guideUrl;
    private boolean showFoldButton;
    private boolean showGuide;
    private String titleTextSize;
    private String picModName = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16662);
    private boolean showPicMod = false;

    static {
        kge.a(342652486);
    }

    public String getPicModName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e39cf8e0", new Object[]{this}) : this.picModName;
    }

    public void setPicModName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebaa96", new Object[]{this, str});
        } else {
            this.picModName = str;
        }
    }

    public boolean isShowGuide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df2f8a00", new Object[]{this})).booleanValue() : this.showGuide;
    }

    public void setShowGuide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16a51590", new Object[]{this, new Boolean(z)});
        } else {
            this.showGuide = z;
        }
    }

    public String getGuideUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6eb28850", new Object[]{this}) : this.guideUrl;
    }

    public void setGuideUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f27bdc26", new Object[]{this, str});
        } else {
            this.guideUrl = str;
        }
    }

    public String getTitleTextSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7aeda369", new Object[]{this}) : this.titleTextSize;
    }

    public void setTitleTextSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1766ab95", new Object[]{this, str});
        } else {
            this.titleTextSize = str;
        }
    }

    public boolean isShowPicMod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e37384a", new Object[]{this})).booleanValue() : this.showPicMod;
    }

    public void setShowPicMod(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25237d16", new Object[]{this, new Boolean(z)});
        } else {
            this.showPicMod = z;
        }
    }

    public boolean isShowFoldButton() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a5218c5", new Object[]{this})).booleanValue() : this.showFoldButton;
    }

    public void setShowFoldButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d34287fb", new Object[]{this, new Boolean(z)});
        } else {
            this.showFoldButton = z;
        }
    }
}
