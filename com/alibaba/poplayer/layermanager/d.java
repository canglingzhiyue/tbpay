package com.alibaba.poplayer.layermanager;

import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.layermanager.config.ConfigItem;
import tb.kge;

/* loaded from: classes3.dex */
public final class d extends PopRequest.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f3195a;

    static {
        kge.a(-254820723);
    }

    public d(PopRequest.a aVar, ConfigItem configItem) {
        int i;
        if (aVar != null) {
            this.c = aVar.c;
            this.e = aVar.e;
            this.d = aVar.d;
            i = aVar.b;
        } else {
            this.c = configItem.enqueue;
            this.e = configItem.exclusive;
            this.d = configItem.forcePopRespectingPriority;
            i = configItem.priority;
        }
        this.b = i;
        this.f3195a = configItem.level;
    }
}
