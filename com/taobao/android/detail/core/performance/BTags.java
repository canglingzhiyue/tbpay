package com.taobao.android.detail.core.performance;

/* loaded from: classes4.dex */
public enum BTags {
    MainRequestTag("[dtMainRequest]"),
    DowngradeTag("[dtDowngrade]"),
    TTFloat("[ttFloat]"),
    TTNavBar("[ttNavBar]"),
    BtBar("[dtBottomBar]"),
    CommonDlg("[dtCommonDlg]"),
    XLightOff("[XLightOff]"),
    Video("[dtVideo]"),
    DxRender("[dxRender]"),
    TalkGroup("[dtTalkGroup]"),
    Category("[dtCategory]"),
    MarketBanner("[marketBanner]");
    
    public String tagName;

    BTags(String str) {
        this.tagName = str;
    }
}
