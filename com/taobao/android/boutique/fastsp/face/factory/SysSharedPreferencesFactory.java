package com.taobao.android.boutique.fastsp.face.factory;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class SysSharedPreferencesFactory implements SharedPreferencesFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-969228149);
        kge.a(1021064496);
    }

    @Override // com.taobao.android.boutique.fastsp.face.factory.SharedPreferencesFactory
    public SharedPreferences create(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("11676488", new Object[]{this, context, str, new Integer(i)}) : context.getSharedPreferences(str, i);
    }
}
