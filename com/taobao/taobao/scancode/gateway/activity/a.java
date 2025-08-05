package com.taobao.taobao.scancode.gateway.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.orange.OrangeConfig;
import com.taobao.taolive.room.utils.aw;
import tb.kge;
import tb.oyd;
import tb.oyf;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean l;
    public Intent n;
    public String o;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    public boolean m = true;
    public oyf p = new oyf();
    public oyd w = new oyd();

    static {
        kge.a(-1663118762);
        l = false;
    }

    public oyf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oyf) ipChange.ipc$dispatch("f08ece2", new Object[]{this}) : this.p;
    }

    public Intent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("ee89e30a", new Object[]{this}) : this.n;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.m;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.o;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.v;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.u;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.t;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.q;
    }

    public oyd j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oyd) ipChange.ipc$dispatch("5447bcfb", new Object[]{this}) : this.w;
    }

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
            this.n = (Intent) intent.getParcelableExtra("TARGET_INTENT");
            this.m = intent.getBooleanExtra("NeedFinish", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.o = intent.getStringExtra(com.taobao.android.scancode.common.util.a.GATEWAY_CALLBACK_ACTION_PARAM);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Uri data = intent.getData();
        if (data == null) {
            this.p = oyf.f32480a;
            return true;
        }
        try {
            this.q = data.getQueryParameter("scanType");
            if (TextUtils.isEmpty(this.q)) {
                this.p = oyf.f32480a;
                this.r = OrangeConfig.getInstance().getConfig("android_scancode_client", "dm_target_url", "");
                if (!TextUtils.isEmpty(this.r) && !"false".equals(this.r)) {
                    this.p.b(ScancodeType.DM);
                }
                String config = OrangeConfig.getInstance().getConfig("android_scancode_client", "ma_4g_switch", "");
                if (!TextUtils.isEmpty(config) && TextUtils.equals("false", config)) {
                    this.p.a(ScancodeType.TB_4G);
                }
                String config2 = OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_gen3", "");
                if (!TextUtils.isEmpty(config2) && TextUtils.equals("false", config2)) {
                    this.p.a(ScancodeType.GEN3);
                }
                String config3 = OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_dm_goodsbarcode", "true");
                if (!TextUtils.isEmpty(config3) && "true".equals(config3)) {
                    this.p.b(ScancodeType.DM);
                    l = true;
                }
            } else if (this.q != null && "taoFriend".equals(this.q)) {
                this.p = oyf.b;
            } else {
                this.p.a(com.taobao.android.scancode.common.util.a.a(this.q));
                if (this.p.a().isEmpty()) {
                    this.p = oyf.f32480a;
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.s = data.getQueryParameter("description");
        this.w = new oyd();
        this.w.a(data);
        if ("1".equals(this.w.b().get("isActivity"))) {
            this.v = true;
        }
        this.t = this.w.b().get("activityId");
        this.u = this.w.b().get(aw.PARAM_ACTIVITY_URL);
        return true;
    }
}
