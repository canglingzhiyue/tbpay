package com.taobao.android.boutique.fastsp.adapter.factory;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.boutique.fastsp.FastSpCreator;
import com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory;
import java.util.Set;
import tb.kge;

/* loaded from: classes4.dex */
public class FastSpFactory implements SharedPreferencesFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1323529266);
        kge.a(1021064496);
    }

    public FastSpFactory(Set<String> set) {
        FastSpCreator.a(set);
    }

    @Override // com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory
    public SharedPreferences create(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{this, context, str, new Integer(i)}) : FastSpCreator.create(context, str, i);
    }
}
