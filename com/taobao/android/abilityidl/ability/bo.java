package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bo extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(405123073);
        }

        public static void a(bo boVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46def3c6", new Object[]{boVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(boVar, result);
        }
    }

    void a(FavoriteResultData favoriteResultData);
}
