package com.alipay.mobile.monitor.track.spm.monitor;

import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.BaseTracker;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.ClickTracker;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.ExposeTracker;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.SlideTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public class TrackerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static BaseTracker createTracker(String str, Behavor.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTracker) ipChange.ipc$dispatch("55af7291", new Object[]{str, builder});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1926005497) {
            if (hashCode != -899647277) {
                if (hashCode == 860524583 && str.equals(BehavorID.CLICK)) {
                    c = 0;
                }
            } else if (str.equals(BehavorID.SLIDE)) {
                c = 2;
            }
        } else if (str.equals("exposure")) {
            c = 1;
        }
        if (c == 0) {
            return new ClickTracker(builder);
        }
        if (c == 1) {
            return new ExposeTracker(builder);
        }
        if (c == 2) {
            return new SlideTracker(builder);
        }
        return null;
    }
}
