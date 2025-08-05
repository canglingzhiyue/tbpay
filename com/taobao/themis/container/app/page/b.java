package com.taobao.themis.container.app.page;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.page.ITMSPage;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.bgp;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016¨\u0006\u0018"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSFragmentManager;", "Lcom/taobao/themis/container/app/page/TMSBaseFragmentManager;", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "containerId", "", "mFragmentManager", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentActivity;ILandroid/support/v4/app/FragmentManager;)V", "createFragment", "Lcom/taobao/themis/container/app/page/TMSBaseFragment;", TBBuyPreloadScene.EXIT_PAGE, "", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "useTranslateAnim", "findFragmentForPage", "getFragments", "", "getInnerManager", com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_PUSHPAGE, "", bgp.FRAGMENT, "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public class b extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "TMSFragmentManager";

    static {
        kge.a(-1579492719);
        Companion = new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ b(android.support.v4.app.FragmentActivity r1, int r2, android.support.v4.app.FragmentManager r3, int r4, kotlin.jvm.internal.o r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L6
            int r2 = com.taobao.taobao.R.id.tms_fragment_container
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto L14
            android.support.v4.app.FragmentManager r3 = r1.getSupportFragmentManager()
            java.lang.String r4 = "mActivity.supportFragmentManager"
            kotlin.jvm.internal.q.b(r3, r4)
        L14:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.container.app.page.b.<init>(android.support.v4.app.FragmentActivity, int, android.support.v4.app.FragmentManager, int, kotlin.jvm.internal.o):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FragmentActivity mActivity, int i, FragmentManager mFragmentManager) {
        super(mActivity, i, mFragmentManager);
        q.d(mActivity, "mActivity");
        q.d(mFragmentManager, "mFragmentManager");
    }

    @Override // com.taobao.themis.container.app.page.d
    public TMSBaseFragment b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSBaseFragment) ipChange.ipc$dispatch("7e5259ef", new Object[]{this}) : new TMSFragment();
    }

    public void a(ITMSPage page, TMSBaseFragment fragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc60bf", new Object[]{this, page, fragment, new Boolean(z)});
            return;
        }
        q.d(page, "page");
        q.d(fragment, "fragment");
        if (d().contains(fragment) || i().isFinishing()) {
            return;
        }
        page.c().f().put((JSONObject) com.taobao.themis.kernel.entity.a.KEY_IS_PUSH_PAGE, (String) true);
        FragmentTransaction beginTransaction = k().beginTransaction();
        q.b(beginTransaction, "mFragmentManager.beginTransaction()");
        c().put(page, fragment);
        TMSBaseFragment peek = d().peek();
        d().push(fragment);
        if (z) {
            beginTransaction.setCustomAnimations(R.anim.tms_fragment_translate_in_left, R.anim.tms_fragment_translate_out_left);
        }
        if (fragment.isAdded() || fragment.getAlreadyScheduleAdded()) {
            beginTransaction.show(fragment);
        } else {
            beginTransaction.add(j(), fragment);
        }
        if (peek != null && !peek.isHidden()) {
            beginTransaction.detach(peek);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public boolean a(ITMSPage page, boolean z) {
        TMSBaseFragment remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f3e6325", new Object[]{this, page, new Boolean(z)})).booleanValue();
        }
        q.d(page, "page");
        if (k().isDestroyed() || i().isFinishing() || (remove = c().remove(page)) == null) {
            return false;
        }
        if (remove.getActivity() != null) {
            FragmentActivity activity = remove.getActivity();
            q.b(activity, "fragment.activity");
            if (activity.isFinishing()) {
                return true;
            }
        }
        d().remove(remove);
        FragmentTransaction beginTransaction = k().beginTransaction();
        if (z) {
            beginTransaction.setCustomAnimations(0, R.anim.tms_fragment_translate_out_right);
        }
        beginTransaction.remove(remove);
        if (d().size() > 0) {
            beginTransaction.attach(d().peek());
        }
        beginTransaction.commitAllowingStateLoss();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSFragmentManager$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(749438105);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
