package com.alibaba.ability.impl.audio;

import java.util.Map;
import kotlin.jvm.internal.q;
import tb.kge;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1851a;
    public int b;
    public final i c;
    public final Map<?, ?> d;

    static {
        kge.a(-393277414);
    }

    public e(Map<String, ? extends Object> data, Map<?, ?> map) {
        q.d(data, "data");
        Boolean a2 = com.alibaba.ability.e.a(data, MonitorMediaPlayer.ABTEST_USE_CACHE_ENABLE, (Boolean) true);
        q.a(a2);
        this.f1851a = a2.booleanValue();
        Integer a3 = com.alibaba.ability.e.a(data, "startPosition", (Integer) 0);
        q.a(a3);
        this.b = a3.intValue();
        Map<String, Object> a4 = com.alibaba.ability.e.a(data, "mediaInfo");
        if (a4 != null) {
            this.c = new i(a4);
            this.d = map;
            return;
        }
        throw new RuntimeException("mediaInfo invalid");
    }
}
