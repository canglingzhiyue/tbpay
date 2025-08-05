package com.taobao.android.detail.core.utils;

import android.content.Context;
import android.view.View;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(686330391);
        emu.a("com.taobao.android.detail.core.utils.MegaUtil");
    }

    public static ExecuteResult a(Context context, View view, String str, String str2, JSONObject jSONObject, alo aloVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecuteResult) ipChange.ipc$dispatch("517b4449", new Object[]{context, view, str, str2, jSONObject, aloVar}) : new alu(new alr("detail", "detail").a(context)).a(str, str2, new alq().a(view), jSONObject, aloVar);
    }
}
