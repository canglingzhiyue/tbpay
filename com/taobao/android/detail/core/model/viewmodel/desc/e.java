package com.taobao.android.detail.core.model.viewmodel.desc;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import java.util.ArrayList;
import tb.eby;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b B;

    /* renamed from: a  reason: collision with root package name */
    public String f9747a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public ArrayList<a> k;
    public String l;
    public String m;
    public String n;
    public float o;
    public float p;
    public String q;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f9748a;
        public int b;
        public int c;

        static {
            kge.a(-58724456);
        }

        public a(String str, int i, int i2) {
            this.f9748a = str;
            this.b = i;
            this.c = i2;
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
    }

    static {
        kge.a(1295281851);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.ItemInfoViewModel";
    }

    public e(ComponentModel componentModel) {
        super(componentModel);
        this.h = null;
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.h = jSONObject.getString("widthRatio");
        this.f9747a = jSONObject.getString(eby.KEY_PIC_URL);
        this.b = jSONObject.getString("price");
        this.c = jSONObject.getString("title");
        this.d = jSONObject.getString("tips");
        this.e = jSONObject.getString("jumpUrl");
        this.f = jSONObject.getString("itemId");
        this.g = jSONObject.getString("avType");
        this.i = jSONObject.getString("panoramaUrl");
        this.j = jSONObject.getString("videoTagUrl");
        this.l = jSONObject.getString(com.taobao.taolive.room.ui.fanslevel.a.ICON_RENDER);
        if (!TextUtils.isEmpty(this.l)) {
            String[] split = this.l.split(",");
            if (this.k == null) {
                this.k = new ArrayList<>();
            }
            for (String str : split) {
                a a2 = a(str);
                if (a2 != null) {
                    this.k.add(a2);
                }
            }
        }
        this.m = jSONObject.getString("thumbnail");
        this.n = jSONObject.getString("videoUrl");
        this.q = jSONObject.getString("videoId");
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            try {
                this.o = jSONObject2.getFloatValue("height");
                this.p = jSONObject2.getFloatValue("width");
            } catch (Exception unused) {
            }
        }
        if (this.o != 0.0f && this.p != 0.0f) {
            return;
        }
        this.o = 9.0f;
        this.p = 16.0f;
    }

    private a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b4bc1109", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return new a(str, 0, 0);
        }
        return null;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c00d4de", new Object[]{this, bVar});
        } else {
            this.B = bVar;
        }
    }
}
