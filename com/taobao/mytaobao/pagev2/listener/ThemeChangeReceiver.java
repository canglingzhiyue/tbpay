package com.taobao.mytaobao.pagev2.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.tbtheme.kit.j;
import com.taobao.android.weex_framework.util.a;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.iao;
import tb.kge;
import tb.mug;
import tb.mxa;
import tb.mxo;
import tb.mxq;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/taobao/mytaobao/pagev2/listener/ThemeChangeReceiver;", "Landroid/content/BroadcastReceiver;", a.ATOM_proxy, "Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;", "(Lcom/taobao/mytaobao/pagev2/MtbBizProxyV2;)V", "hasSubscribe", "", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "", iao.NEXT_TAG_RECEIVER, "context", "Landroid/content/Context;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Landroid/content/Intent;", "subscribe", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ThemeChangeReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f18462a;
    private final com.taobao.mytaobao.pagev2.a b;

    static {
        kge.a(459840559);
    }

    public ThemeChangeReceiver(com.taobao.mytaobao.pagev2.a proxy) {
        q.c(proxy, "proxy");
        this.b = proxy;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f18462a = true;
        if (mxa.c()) {
            mug.a(true, (BroadcastReceiver) this, j.ACTION_THEME_CHANGE);
        } else {
            ThemeChangeReceiver themeChangeReceiver = this;
            mug.a(false, (BroadcastReceiver) themeChangeReceiver, FestivalMgr.ACTION_FESTIVAL_CHANGE);
            mug.a(true, (BroadcastReceiver) themeChangeReceiver, FestivalMgr.ACTION_FESTIVAL_CHANGE);
        }
        mug.a(true, (BroadcastReceiver) this, mxo.SKIN_BROADCAST_ACTION);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f18462a) {
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
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        FragmentActivity activity = this.b.A().getActivity();
        if (activity == null) {
            return;
        }
        q.a((Object) activity, "proxy.mtbFragment.activity?:return");
        if (intent == null) {
            return;
        }
        if (intent.getAction() == null) {
            z = false;
        }
        if (!z) {
            intent = null;
        }
        if (intent == null || mxq.b(activity) || !mxa.c() || !TextUtils.equals(j.ACTION_THEME_CHANGE, intent.getAction())) {
            return;
        }
        this.b.k().c();
        if (System.currentTimeMillis() - this.b.l() < 3000) {
            return;
        }
        this.b.r();
    }
}
