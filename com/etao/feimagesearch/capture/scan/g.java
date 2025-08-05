package com.etao.feimagesearch.capture.scan;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.taolive.room.utils.aw;
import tb.kge;
import tb.oyd;
import tb.oyf;

/* loaded from: classes3.dex */
public class g extends com.taobao.taobao.scancode.gateway.activity.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Intent b;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6591a = true;
    public oyf d = new oyf();
    public oyd k = new oyd();

    static {
        kge.a(104723965);
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public boolean a(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return false;
        }
        try {
            this.b = (Intent) intent.getParcelableExtra("TARGET_INTENT");
            this.f6591a = intent.getBooleanExtra("NeedFinish", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.c = intent.getStringExtra(com.taobao.android.scancode.common.util.a.GATEWAY_CALLBACK_ACTION_PARAM);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Uri data = intent.getData();
        if (data == null) {
            this.d = oyf.f32480a;
            return true;
        }
        try {
            this.e = "";
            this.d = oyf.f32480a;
            if (!com.etao.feimagesearch.config.b.ai()) {
                this.f = com.etao.feimagesearch.config.b.a("android_scancode_client", "dm_target_url", "");
                if (!TextUtils.isEmpty(this.f) && !"false".equals(this.f)) {
                    this.d.b(ScancodeType.DM);
                }
                String a2 = com.etao.feimagesearch.config.b.a("android_scancode_client", "ma_4g_switch", "");
                if (!TextUtils.isEmpty(a2) && TextUtils.equals("false", a2)) {
                    this.d.a(ScancodeType.TB_4G);
                }
                String a3 = com.etao.feimagesearch.config.b.a("android_scancode_client", "enable_gen3", "");
                if (!TextUtils.isEmpty(a3) && TextUtils.equals("false", a3)) {
                    this.d.a(ScancodeType.GEN3);
                }
                String a4 = com.etao.feimagesearch.config.b.a("android_scancode_client", "enable_dm_goodsbarcode", "true");
                if (!TextUtils.isEmpty(a4) && "true".equals(a4)) {
                    this.d.b(ScancodeType.DM);
                    l = true;
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.g = data.getQueryParameter("description");
        this.k = new oyd();
        this.k.a(data);
        if ("1".equals(this.k.b().get("isActivity"))) {
            this.j = true;
        }
        this.h = this.k.b().get("activityId");
        this.i = this.k.b().get(aw.PARAM_ACTIVITY_URL);
        return true;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public oyf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oyf) ipChange.ipc$dispatch("f08ece2", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public Intent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("ee89e30a", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f6591a;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.j;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.i;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.h;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.taobao.scancode.gateway.activity.a
    public oyd j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oyd) ipChange.ipc$dispatch("5447bcfb", new Object[]{this}) : this.k;
    }
}
