package com.taobao.taolive.crossplatformfoundation.arch.core.service.powermsg;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.crossplatformfoundation.arch.core.dto_and_do.PMMessageResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rul;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u0003*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00052\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0002\u0010\u0007*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\b"}, d2 = {"CustomMessageValidCheckAction", "Lkotlin/Function1;", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse;", "", "passCheckIfNull", "Lcom/taobao/taolive/crossplatformfoundation/arch/core/service/powermsg/CustomMessageValidCheckAction;", "message", "(Lkotlin/jvm/functions/Function1;Lcom/taobao/taolive/crossplatformfoundation/arch/core/dto_and_do/PMMessageResponse;)Z", "tao-live-crossplatform-foundation_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-257471722);
    }

    public static final boolean a(rul<? super PMMessageResponse, Boolean> rulVar, PMMessageResponse message) {
        Object mo2421invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            mo2421invoke = ipChange.ipc$dispatch("57504b93", new Object[]{rulVar, message});
        } else {
            q.d(message, "message");
            if (rulVar == null) {
                return true;
            }
            mo2421invoke = rulVar.mo2421invoke(message);
        }
        return ((Boolean) mo2421invoke).booleanValue();
    }
}
