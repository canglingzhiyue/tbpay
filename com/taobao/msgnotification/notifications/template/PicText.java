package com.taobao.msgnotification.notifications.template;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.msw;

/* loaded from: classes7.dex */
public class PicText {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bigIcon;
    public String subTitle;
    public String subTitleColor;
    public String title;
    public String titleColor;
    public String widePic;

    static {
        kge.a(368809951);
    }

    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this}) : msw.a(this.title, this.titleColor);
    }

    public CharSequence getSubTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("a3b46d25", new Object[]{this}) : msw.a(this.subTitle, this.subTitleColor);
    }
}
