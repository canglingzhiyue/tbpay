package com.taobao.msgnotification.notifications.template;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.msw;

/* loaded from: classes7.dex */
public class AssembleBanner {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bgPic;
    public String pic;
    public String subTitle;
    public String title;
    public String titleColor;

    static {
        kge.a(101492886);
    }

    public CharSequence getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this}) : msw.a(this.title, this.titleColor);
    }
}
