package com.alipay.mobile.monitor.track.spm.monitor.tracker;

import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public abstract class BaseTracker implements Comparable<BaseTracker> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String TAG = "BaseTracker";
    public Behavor.Builder mBehavorBuilder;

    public abstract void commit();

    @Override // java.lang.Comparable
    public int compareTo(BaseTracker baseTracker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3270e560", new Object[]{this, baseTracker})).intValue();
        }
        return 0;
    }

    public BaseTracker(Behavor.Builder builder) {
        this.mBehavorBuilder = builder;
    }

    public Behavor.Builder getBehavorBuilder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Behavor.Builder) ipChange.ipc$dispatch("af693adb", new Object[]{this}) : this.mBehavorBuilder;
    }
}
