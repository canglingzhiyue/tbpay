package com.alipay.mobile.monitor.track.spm.monitor.tracker;

import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class SlideTracker extends BaseTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SlideTracker(Behavor.Builder builder) {
        super(builder);
    }

    @Override // com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker
    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
            return;
        }
        this.mBehavorBuilder.slide();
        SpmUtils.printBehaviour("SlideTracker", this.mBehavorBuilder, BehavorID.SLIDE);
    }
}
