package com.taobao.android.live.plugin.atype.flexalocal.good.view.bean;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f13845a;
    public int b;
    public long c;
    public long d;
    public boolean e;
    public String f;
    public boolean g;

    static {
        kge.a(982346316);
    }

    public void a(com.taobao.taolive.sdk.goodlist.a aVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbfce2a3", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            if (aVar.h) {
                if (a.w()) {
                    this.d = 1L;
                } else {
                    this.d = -1L;
                }
            } else if (aVar.b == null || (jSONObject = aVar.b.getJSONObject("itemExtData")) == null) {
            } else {
                this.d = jSONObject.getLongValue("cacheExpire");
            }
        }
    }
}
