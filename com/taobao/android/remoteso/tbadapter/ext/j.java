package com.taobao.android.remoteso.tbadapter.ext;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ihl;
import tb.ihr;
import tb.ihx;
import tb.ijc;
import tb.ikd;
import tb.ike;
import tb.ikf;

/* loaded from: classes6.dex */
public class j implements ihr.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f14864a;
    private final ijc b;

    public j(Context context, ijc ijcVar) {
        this.f14864a = context;
        this.b = ijcVar;
    }

    @Override // tb.ihr.a
    public ihx a(ihl ihlVar, ihx ihxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihx) ipChange.ipc$dispatch("feb6ce0b", new Object[]{this, ihlVar, ihxVar}) : new ikf(new ikd(b(ihlVar, ihxVar), ihlVar.b), ihlVar.f, ihlVar.e);
    }

    private ihx b(ihl ihlVar, ihx ihxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihx) ipChange.ipc$dispatch("ef87d56a", new Object[]{this, ihlVar, ihxVar}) : new ike(ihxVar, ihlVar.b, ihlVar.f);
    }
}
