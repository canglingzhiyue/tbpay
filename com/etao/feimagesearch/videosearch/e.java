package com.etao.feimagesearch.videosearch;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_NAME = "videoMuiseConfig";

    /* renamed from: a  reason: collision with root package name */
    public int f7047a;
    public int b;
    public String c;
    public String d;
    public String e;

    static {
        kge.a(433693623);
    }

    public static e a() {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("d1a721f3", new Object[0]);
        }
        String b = com.etao.feimagesearch.config.b.b(CONFIG_NAME, "");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(b);
            eVar = new e();
            eVar.f7047a = (int) com.taobao.android.weex_framework.util.i.a(parseObject.getString("width"));
            eVar.c = parseObject.getString("widthPx");
            eVar.b = (int) com.taobao.android.weex_framework.util.i.a(parseObject.getString("height"));
            eVar.d = parseObject.getString("heightPx");
            eVar.e = parseObject.getString("url");
        } catch (Exception unused) {
        }
        if (!eVar.b()) {
            return null;
        }
        return eVar;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(this.e) && this.f7047a != 0 && this.b != 0 && !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d);
    }
}
