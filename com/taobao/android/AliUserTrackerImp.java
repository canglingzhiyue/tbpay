package com.taobao.android;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.Map;

/* loaded from: classes4.dex */
public class AliUserTrackerImp implements AliUserTrackerInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AliUserTrackerImp f8603a = new AliUserTrackerImp();
    private final UTTracker b = UTAnalytics.getInstance().getDefaultTracker();

    public static AliUserTrackerImp getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUserTrackerImp) ipChange.ipc$dispatch("5afedf29", new Object[0]) : f8603a;
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void a(String str, AliUserTrackerCT aliUserTrackerCT, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edffd139", new Object[]{this, str, aliUserTrackerCT, str2, strArr});
        } else {
            TBS.Adv.ctrlClicked(str, a(aliUserTrackerCT), str2, strArr);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void b(String str, AliUserTrackerCT aliUserTrackerCT, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db7053a", new Object[]{this, str, aliUserTrackerCT, str2, strArr});
        } else {
            TBS.Adv.ctrlClickedOnPage(str, a(aliUserTrackerCT), str2, strArr);
        }
    }

    private static CT a(AliUserTrackerCT aliUserTrackerCT) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CT) ipChange.ipc$dispatch("73be5e34", new Object[]{aliUserTrackerCT}) : CT.valueOf(aliUserTrackerCT.toString());
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{this, obj, str});
        } else {
            this.b.pageAppear(obj, str);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.b.pageDisAppear(obj);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26bde0f", new Object[]{this, obj, str});
        } else {
            this.b.updatePageName(obj, str);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{this, obj, map});
        } else {
            this.b.updatePageProperties(obj, map);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public Map<String, String> a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4282aa6f", new Object[]{this, activity}) : this.b.getPageAllProperties(activity);
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9201a", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }

    @Override // com.taobao.android.AliUserTrackerInterface
    public void a(int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43444d0", new Object[]{this, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            TBS.Ext.commitEvent(i, obj, obj2, obj3, strArr);
        }
    }
}
