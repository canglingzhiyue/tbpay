package com.taobao.themis.container.app.page;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.bgp;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 42\u00020\u0001:\u00014B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020\u0015H$J\u0018\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020'H\u0016J\u0012\u0010,\u001a\u0004\u0018\u00010\u00152\u0006\u0010-\u001a\u00020\u001aH\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150/H\u0016J\b\u00100\u001a\u00020\u0007H\u0016J\b\u00101\u001a\u00020\u0015H\u0016J\b\u00102\u001a\u000203H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0084D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0015X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00065"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSBaseFragmentManager;", "Lcom/taobao/themis/container/app/page/IFragmentManager;", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "containerId", "", "mFragmentManager", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentActivity;ILandroid/support/v4/app/FragmentManager;)V", "READY_TAG", "", "getREADY_TAG", "()Ljava/lang/String;", "getContainerId", "()I", "getMActivity", "()Landroid/support/v4/app/FragmentActivity;", "getMFragmentManager", "()Landroid/support/v4/app/FragmentManager;", "mFragmentStack", "Ljava/util/Deque;", "Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "getMFragmentStack", "()Ljava/util/Deque;", "mPageFragmentMap", "", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getMPageFragmentMap", "()Ljava/util/Map;", "mReadyCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "getMReadyCounter", "()Ljava/util/concurrent/atomic/AtomicInteger;", "mReadyFragment", "getMReadyFragment", "()Lcom/taobao/themis/container/app/page/TMSBaseFragment;", "setMReadyFragment", "(Lcom/taobao/themis/container/app/page/TMSBaseFragment;)V", "attachFragment", "", bgp.FRAGMENT, "useTranslateAnim", "createFragment", "detachFragment", "findFragmentForPage", "page", "getFragments", "", "getInnerManager", "getReadyFragment", "release", "", "Companion", "themis_container_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private TMSBaseFragment f22368a;
    private final Map<ITMSPage, TMSBaseFragment> b;
    private final Deque<TMSBaseFragment> c;
    private final String d;
    private final AtomicInteger e;
    private final FragmentActivity f;
    private final int g;
    private final FragmentManager h;

    static {
        kge.a(-710335104);
        kge.a(-799651102);
        Companion = new a(null);
    }

    public abstract TMSBaseFragment b();

    public d(FragmentActivity mActivity, int i, FragmentManager mFragmentManager) {
        q.d(mActivity, "mActivity");
        q.d(mFragmentManager, "mFragmentManager");
        this.f = mActivity;
        this.g = i;
        this.h = mFragmentManager;
        this.b = new LinkedHashMap();
        this.c = new ArrayDeque();
        this.d = "mReadyFragment";
        this.e = new AtomicInteger(0);
    }

    public final FragmentActivity i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentActivity) ipChange.ipc$dispatch("6066f983", new Object[]{this}) : this.f;
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.g;
    }

    public final FragmentManager k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("45968395", new Object[]{this}) : this.h;
    }

    public final TMSBaseFragment a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSBaseFragment) ipChange.ipc$dispatch("f16542d0", new Object[]{this}) : this.f22368a;
    }

    public final Map<ITMSPage, TMSBaseFragment> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.b;
    }

    public final Deque<TMSBaseFragment> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Deque) ipChange.ipc$dispatch("435f0dc", new Object[]{this}) : this.c;
    }

    public TMSBaseFragment g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSBaseFragment) ipChange.ipc$dispatch("3ef3cd8a", new Object[]{this});
        }
        TMSBaseFragment tMSBaseFragment = null;
        if (this.f22368a != null) {
            String str = this.d + this.e.get();
            TMSBaseFragment tMSBaseFragment2 = this.f22368a;
            q.a(tMSBaseFragment2);
            if (q.a((Object) str, (Object) tMSBaseFragment2.getTag())) {
                TMSBaseFragment tMSBaseFragment3 = this.f22368a;
                this.f22368a = tMSBaseFragment;
                tMSBaseFragment = tMSBaseFragment3;
            }
        }
        if (tMSBaseFragment == null) {
            try {
                Fragment findFragmentByTag = this.h.findFragmentByTag(this.d + this.e.get());
                if (findFragmentByTag == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.container.app.page.TMSBaseFragment");
                }
                tMSBaseFragment = (TMSBaseFragment) findFragmentByTag;
            } catch (Throwable th) {
                TMSLogger.b(b.TAG, "getReadyFragment findFragmentByTag has Error", th);
            }
        }
        if (tMSBaseFragment != null) {
            this.e.incrementAndGet();
            return tMSBaseFragment;
        }
        return b();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
        this.f22368a = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/container/app/page/TMSBaseFragmentManager$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_container_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1809305400);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
