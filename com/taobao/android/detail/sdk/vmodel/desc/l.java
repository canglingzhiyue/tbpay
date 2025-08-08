package com.taobao.android.detail.sdk.vmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import java.util.ArrayList;
import tb.eby;
import tb.ewy;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class l extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A;

    /* renamed from: a  reason: collision with root package name */
    public String f10377a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String s;
    public String t;
    public ArrayList<a> u;
    public String v;
    public String w;
    public String x;
    public float y;
    public float z;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10378a;
        public int b;
        public int c;

        static {
            kge.a(-1292046478);
        }

        public a(String str, int i, int i2) {
            this.f10378a = str;
            this.b = i;
            this.c = i2;
        }
    }

    static {
        kge.a(504451489);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_ITEM_INFO;
    }

    public l(ComponentModel componentModel) {
        super(componentModel);
        this.h = null;
        tpc.a("com.taobao.android.detail.sdk.vmodel.desc.ItemInfoViewModel");
    }

    @Override // com.taobao.android.detail.sdk.vmodel.desc.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.h = jSONObject.getString("widthRatio");
        this.f10377a = jSONObject.getString(eby.KEY_PIC_URL);
        this.b = jSONObject.getString("price");
        this.c = jSONObject.getString("title");
        this.d = jSONObject.getString("tips");
        this.e = jSONObject.getString("jumpUrl");
        this.f = jSONObject.getString("itemId");
        this.g = jSONObject.getString("avType");
        this.s = jSONObject.getString("panoramaUrl");
        this.t = jSONObject.getString("videoTagUrl");
        this.v = jSONObject.getString(com.taobao.taolive.room.ui.fanslevel.a.ICON_RENDER);
        if (!StringUtils.isEmpty(this.v)) {
            String[] split = this.v.split(",");
            if (this.u == null) {
                this.u = new ArrayList<>();
            }
            for (String str : split) {
                a a2 = a(str);
                if (a2 != null) {
                    this.u.add(a2);
                }
            }
        }
        this.w = jSONObject.getString("thumbnail");
        this.x = jSONObject.getString("videoUrl");
        this.A = jSONObject.getString("videoId");
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            try {
                this.y = jSONObject2.getFloatValue("height");
                this.z = jSONObject2.getFloatValue("width");
            } catch (Exception unused) {
            }
        }
        if (this.y != 0.0f && this.z != 0.0f) {
            return;
        }
        this.y = 9.0f;
        this.z = 16.0f;
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("889130fc", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return new a(str, 0, 0);
        }
        return null;
    }
}
