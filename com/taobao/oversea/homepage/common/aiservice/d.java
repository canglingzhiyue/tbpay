package com.taobao.oversea.homepage.common.aiservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IAiService;
import com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.AiServiceImpl;
import java.util.HashMap;
import java.util.Map;
import tb.lwc;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f18648a;

    static {
        HashMap hashMap = new HashMap();
        f18648a = hashMap;
        hashMap.put(lwc.NEW_FACE_CHILD_INTL.a(), new c());
    }

    public static IAiService a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAiService) ipChange.ipc$dispatch("43c08db0", new Object[]{str});
        }
        b bVar = f18648a.get(str);
        return bVar == null ? new AiServiceImpl() : bVar.a();
    }
}
