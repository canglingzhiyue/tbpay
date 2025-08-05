package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.Hashtable;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class Tab3LiveContentRender$onViewSelectedByViewPager$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$onViewSelectedByViewPager$1(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        Tab3LiveContentRender tab3LiveContentRender = this.this$0;
        defaultTracker.pageAppearDonotSkip(Tab3LiveContentRender.$ipChange);
        Tab3LiveContentRender tab3LiveContentRender2 = this.this$0;
        try {
            Result.a aVar = Result.Companion;
            String pageSpmUrl = UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl((Activity) Tab3LiveContentRender.$ipChange);
            ceg.Companion.b(kotlin.jvm.internal.q.a("tab3 live get spm url : ", (Object) pageSpmUrl));
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = Tab3LiveContentRender.$ipChange;
            if (taoliveOpenLiveRoom != null) {
                PlatformListenerEnum platformListenerEnum = PlatformListenerEnum.updateUserTrackData;
                Hashtable hashtable = new Hashtable();
                hashtable.put("spm-url", pageSpmUrl);
                hashtable.put("entrySpm", pageSpmUrl);
                t tVar = t.INSTANCE;
                taoliveOpenLiveRoom.callPlatform(platformListenerEnum, hashtable);
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }
}
