package com.alipay.mobile.common.transportext.biz.sync;

import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.utils.ConnectivityHelper;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.shared.spdy.SpdyAvalibleListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public class SyncSpdyAvalibleListener implements SpdyAvalibleListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
        } else if (!ConnectivityHelper.isShowRedText()) {
        } else {
            LogCatUtil.info(HttpWorker.TAG, "SyncSpdyAvalibleListener: invoke checkLinkState");
            SyncManager.checkLinkState(4);
        }
    }
}
