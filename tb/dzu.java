package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.u;

/* loaded from: classes4.dex */
public class dzu implements dzp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1627179306);
        kge.a(1294504768);
    }

    public dzu() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.factory.impl.DescViewHolderFactory");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r8.equals("desc_single_image") != false) goto L11;
     */
    @Override // tb.dzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.detail.core.detail.kit.view.holder.desc.b<? extends tb.epf> a(android.app.Activity r7, tb.epf r8) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dzu.a(android.app.Activity, tb.epf):com.taobao.android.detail.core.detail.kit.view.holder.desc.b");
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
