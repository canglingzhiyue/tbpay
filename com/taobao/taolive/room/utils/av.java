package com.taobao.taolive.room.utils;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.ssr;
import tb.tef;

/* loaded from: classes8.dex */
public class av {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1070958735);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1112984f", new Object[]{aVar, eVar, obj, str});
            return;
        }
        tef a2 = a(aVar, eVar);
        if (a2 != null) {
            a2.a(obj, str);
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().a(obj, str);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564375c5", new Object[]{aVar, eVar, obj});
            return;
        }
        tef a2 = a(aVar, eVar);
        if (a2 != null) {
            a2.a(obj);
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().a(obj);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cb18c6", new Object[]{aVar, eVar, obj});
            return;
        }
        tef a2 = a(aVar, eVar);
        if (a2 != null) {
            a2.b(obj);
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().b(obj);
        }
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d52bbc7", new Object[]{aVar, eVar, obj});
            return;
        }
        tef a2 = a(aVar, eVar);
        if (a2 != null) {
            a2.c(obj);
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().c(obj);
        }
    }

    public static Map<String, String> d(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("157af2fd", new Object[]{aVar, eVar, obj});
        }
        tef a2 = a(aVar, eVar);
        if (a2 != null) {
            return a2.d(obj);
        }
        if (pmd.a().e() == null) {
            return null;
        }
        return pmd.a().e().e(obj);
    }

    public static Map<String, String> a(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("edc98fb0", new Object[]{aVar, eVar, activity});
        }
        tef a2 = a(aVar, eVar);
        if (a2 != null) {
            return a2.a(activity);
        }
        if (pmd.a().e() == null) {
            return null;
        }
        return pmd.a().e().a(activity);
    }

    private static tef a(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tef) ipChange.ipc$dispatch("9ce7aac8", new Object[]{aVar, eVar});
        }
        if (!as.e()) {
            return null;
        }
        if (aVar != null) {
            return a(aVar.o());
        }
        if (eVar == null) {
            return null;
        }
        return a(eVar.f());
    }

    private static tef a(ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity) {
        ssr d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tef) ipChange.ipc$dispatch("e609bfb5", new Object[]{aTaoliveOpenLiveRoomEntity});
        }
        if (aTaoliveOpenLiveRoomEntity == null || aTaoliveOpenLiveRoomEntity.eventCompontent == null || aTaoliveOpenLiveRoomEntity.eventCompontent.a() == null || (d = aTaoliveOpenLiveRoomEntity.eventCompontent.a().d()) == null) {
            return null;
        }
        tef dE_ = d.dE_();
        ab.c("LiveRoomBizPageUTUtil", "getOnLiveRoomBizPageUT，OnLiveRoomBizPageUT：" + dE_);
        return dE_;
    }
}
