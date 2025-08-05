package com.alipay.mobile.monitor.track.spm.monitor.tracker;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.SpmUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class MergeTracker extends BaseTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f5771a;

    public MergeTracker(String str, Behavor.Builder builder) {
        super(builder);
        this.f5771a = str;
    }

    @Override // com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker
    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else if (TextUtils.isEmpty(this.f5771a) || this.mBehavorBuilder == null) {
        } else {
            LoggerFactory.getBehavorLogger().event(this.f5771a, this.mBehavorBuilder.build());
            SpmUtils.printBehaviour(TAG, this.mBehavorBuilder, this.f5771a);
        }
    }

    public String getBehavorId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab786e17", new Object[]{this}) : this.f5771a;
    }
}
