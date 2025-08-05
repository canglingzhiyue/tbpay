package com.taobao.mytaobao.pagev2.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.weex_framework.util.a;
import com.taobao.mytaobao.base.c;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.e;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.iao;
import tb.kge;
import tb.mug;
import tb.mvn;
import tb.mxq;
import tb.nwv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/mytaobao/pagev2/listener/PageDataChangeReceiver;", "Landroid/content/BroadcastReceiver;", a.ATOM_proxy, "Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;", "(Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;)V", "hasSubscribe", "", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", "isInMyTaobao", iao.NEXT_TAG_RECEIVER, "context", "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "subscribe", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class PageDataChangeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f18461a;
    private final com.taobao.mytaobao.pagev2.a b;

    static {
        kge.a(-1039155375);
    }

    public static /* synthetic */ Object ipc$super(PageDataChangeReceiver pageDataChangeReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PageDataChangeReceiver(com.taobao.mytaobao.pagev2.a proxy) {
        q.c(proxy, "proxy");
        this.b = proxy;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f18461a = true;
        PageDataChangeReceiver pageDataChangeReceiver = this;
        mug.a(false, (BroadcastReceiver) pageDataChangeReceiver, "MyTaobao_Order_Refresh", "EDITON_SWITCHER_EDITTION_CODE_CHANGED", mug.ACTION_REFRESH_PAGE, mvn.ACTION_USER_AVATAR_CHANGED);
        mug.a(true, (BroadcastReceiver) pageDataChangeReceiver, "MyTaobao_Order_Refresh", mug.ACTION_REFRESH_PAGE, "taobao.action.ACTION_REVISION_SWITCH_CHANGE", mug.ACTION_REFRESH_PAGE_WHEN_SHOW);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f18461a) {
        } else {
            try {
                mug.a(true, this);
                mug.a(false, this);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PageDataChangeReceiver收到广播");
        sb.append(intent != null ? intent.getAction() : null);
        nwv.f(sb.toString());
        if (intent == null || (action = intent.getAction()) == null || mxq.b(this.b.m())) {
            return;
        }
        if (q.a((Object) mug.ACTION_REFRESH_PAGE_WHEN_SHOW, (Object) action) && !c()) {
            com.taobao.mytaobao.pagev2.dataservice.a.a();
        } else if (q.a((Object) mug.ACTION_REFRESH_PAGE, (Object) action) || q.a((Object) mug.ACTION_REFRESH_PAGE_WHEN_SHOW, (Object) action)) {
            com.taobao.mytaobao.pagev2.dataservice.a.a(1);
        } else if (q.a((Object) "MyTaobao_Order_Refresh", (Object) action)) {
        } else {
            if (q.a((Object) mvn.ACTION_USER_AVATAR_CHANGED, (Object) action)) {
                com.taobao.mytaobao.pagev2.dataservice.a.a();
            } else if (q.a((Object) "EDITON_SWITCHER_EDITTION_CODE_CHANGED", (Object) action)) {
                if (c.r()) {
                    this.b.A().markSwitchToOldProxy();
                } else {
                    com.taobao.mytaobao.pagev2.dataservice.a.a();
                }
            } else if (!q.a((Object) "taobao.action.ACTION_REVISION_SWITCH_CHANGE", (Object) action) || intent.getBooleanExtra("isLazy", false)) {
            } else {
                com.taobao.mytaobao.pagev2.dataservice.a.a();
            }
        }
    }

    private final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (this.b.A().isAdded() && this.b.A().isResumed() && e.c() != null) {
            TBFragmentTabHost c = e.c();
            q.a((Object) c, "Navigation.getFragmentTabHost()");
            if (c.getCurrentTab() == 4) {
                return true;
            }
        }
        return false;
    }
}
