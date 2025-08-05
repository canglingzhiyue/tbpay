package com.taobao.android.remoteso.component;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;

/* loaded from: classes6.dex */
public class RemoLoadingView extends BaseRemoLoadingView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RemoteLoadingView loadingView;

    public RemoLoadingView(Context context) {
        super(context);
        init();
    }

    public RemoLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public RemoLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public RemoLoadingView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.loadingView = new RemoteLoadingView(getContext(), new LoadConfig.a().a());
        addView(this.loadingView);
    }

    @Override // com.taobao.android.remoteso.component.g
    public void onProgressChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5158474", new Object[]{this, new Integer(i)});
        } else {
            this.loadingView.updateProgress(i);
        }
    }
}
