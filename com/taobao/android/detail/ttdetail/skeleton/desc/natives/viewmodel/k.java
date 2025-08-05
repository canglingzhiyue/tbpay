package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;
import tb.eby;
import tb.kge;

/* loaded from: classes5.dex */
public class k extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String A;
    public float B;
    public float C;
    public String D;
    private b E;

    /* renamed from: a  reason: collision with root package name */
    public String f10878a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String v;
    public String w;
    public ArrayList<a> x;
    public String y;
    public String z;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f10879a;
        public int b;
        public int c;

        static {
            kge.a(87115101);
        }

        public a(String str, int i, int i2) {
            this.f10879a = str;
            this.b = i;
            this.c = i2;
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
    }

    static {
        kge.a(-1543006378);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public k(ComponentModel componentModel) {
        super(componentModel);
        this.h = null;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.h = jSONObject.getString("widthRatio");
        this.f10878a = jSONObject.getString(eby.KEY_PIC_URL);
        this.b = jSONObject.getString("price");
        this.c = jSONObject.getString("title");
        this.d = jSONObject.getString("tips");
        this.e = jSONObject.getString("jumpUrl");
        this.f = jSONObject.getString("itemId");
        this.g = jSONObject.getString("avType");
        this.v = jSONObject.getString("panoramaUrl");
        this.w = jSONObject.getString("videoTagUrl");
        this.y = jSONObject.getString(com.taobao.taolive.room.ui.fanslevel.a.ICON_RENDER);
        if (!TextUtils.isEmpty(this.y)) {
            String[] split = this.y.split(",");
            if (this.x == null) {
                this.x = new ArrayList<>();
            }
            for (String str : split) {
                a a2 = a(str);
                if (a2 != null) {
                    this.x.add(a2);
                }
            }
        }
        this.z = jSONObject.getString("thumbnail");
        this.A = jSONObject.getString("videoUrl");
        this.D = jSONObject.getString("videoId");
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            try {
                this.B = jSONObject2.getFloatValue("height");
                this.C = jSONObject2.getFloatValue("width");
            } catch (Exception unused) {
            }
        }
        if (this.B != 0.0f && this.C != 0.0f) {
            return;
        }
        this.B = 9.0f;
        this.C = 16.0f;
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2f938578", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return new a(str, 0, 0);
        }
        return null;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113b199b", new Object[]{this, bVar});
        } else {
            this.E = bVar;
        }
    }
}
