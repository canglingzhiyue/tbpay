package com.taobao.taolive.sdk.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.ssr;
import tb.tef;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1510869659);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4460226c", new Object[]{aVar, obj, map});
            return;
        }
        if (aVar != null) {
            aVar.k.putAll(map);
        }
        b(aVar, obj, map);
    }

    private static void b(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebdbfc2d", new Object[]{aVar, obj, map});
            return;
        }
        tef a2 = a(aVar);
        if (a2 != null) {
            a2.a(obj, map);
        } else if (obj == null || pmd.a().e() == null) {
        } else {
            pmd.a().e().a(obj, map);
        }
    }

    private static tef a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tef) ipChange.ipc$dispatch("83a4d114", new Object[]{aVar});
        }
        if (aVar == null) {
            return null;
        }
        return a(aVar.o());
    }

    private static tef a(ATaoliveOpenLiveRoomEntity aTaoliveOpenLiveRoomEntity) {
        ssr d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tef) ipChange.ipc$dispatch("e609bfb5", new Object[]{aTaoliveOpenLiveRoomEntity});
        }
        if (aTaoliveOpenLiveRoomEntity != null && aTaoliveOpenLiveRoomEntity.eventCompontent != null && aTaoliveOpenLiveRoomEntity.eventCompontent.a() != null && (d = aTaoliveOpenLiveRoomEntity.eventCompontent.a().d()) != null) {
            return d.dE_();
        }
        return null;
    }
}
