package com.taobao.message.notification.banner;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.annotation.aspectjx.MethodSpy;
import com.taobao.message.notification.banner.view.DefaultBannerView;
import com.taobao.message.notification.banner.view.NotificationBannerHelper;
import tb.kge;

/* loaded from: classes7.dex */
public class InnerNotificationAdapter implements IInnerNotificationAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context mContext;
    public InnerPushVO mVO;

    static {
        kge.a(-733205016);
        kge.a(-1994500547);
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public int getDelayTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee424fb4", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public boolean needShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47da8fbe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    @MethodSpy(name = "clickInnerNotification")
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    @MethodSpy(name = "showInnerNotification")
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
        }
    }

    public InnerNotificationAdapter(Context context, InnerPushVO innerPushVO) {
        this.mVO = innerPushVO;
        this.mContext = context;
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        } else {
            NotificationBannerHelper.instance().dismissPushBar();
        }
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismissActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d4698", new Object[]{this});
        } else {
            NotificationBannerHelper.instance().dismissPushBar();
        }
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public InnerPushVO getVO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InnerPushVO) ipChange.ipc$dispatch("67cd4a40", new Object[]{this}) : this.mVO;
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void updateVO(InnerPushVO innerPushVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5bf649", new Object[]{this, innerPushVO});
        } else {
            this.mVO = innerPushVO;
        }
    }

    @Override // com.taobao.message.notification.banner.IInnerNotificationAdapter
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : DefaultBannerView.build(this.mContext, this.mVO.iconUrl, this.mVO.title, this.mVO.content, this.mVO.time, this.mVO.img).getView();
    }
}
