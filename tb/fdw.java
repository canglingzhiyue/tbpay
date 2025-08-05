package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.u;

/* loaded from: classes5.dex */
public class fdw implements dzp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-796246880);
        kge.a(1294504768);
    }

    public fdw() {
        emu.a("com.taobao.android.detail.wrapper.ext.factory.TBDescViewHolderFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        if (r9.equals("desc_user_talk") != false) goto L14;
     */
    @Override // tb.dzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.detail.core.detail.kit.view.holder.desc.b<? extends tb.epf> a(android.app.Activity r8, tb.epf r9) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fdw.a(android.app.Activity, tb.epf):com.taobao.android.detail.core.detail.kit.view.holder.desc.b");
    }

    private void a(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a5b204", new Object[]{this, str, activity});
            return;
        }
        AliUserTrackerInterface a2 = u.a();
        if (a2 == null) {
            return;
        }
        a2.a("Page_Detail", 2201, "desc_holder_create", null, null, "type=" + str);
        if (!(activity instanceof DetailCoreActivity)) {
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) activity;
        if (detailCoreActivity.y() == null || detailCoreActivity.y().t == null) {
            return;
        }
        String str2 = "Type_" + str;
        a2.a("Page_Detail", 2201, str2, null, null, "itemId=" + detailCoreActivity.y().t.i());
    }
}
