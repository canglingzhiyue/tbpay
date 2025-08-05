package com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.HashSet;
import tb.kge;
import tb.mto;

/* loaded from: classes5.dex */
public class j extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STYLE_RECT = 1;

    /* renamed from: a  reason: collision with root package name */
    public static HashSet<Integer> f10877a;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;

    static {
        kge.a(-2028806505);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        if (str.hashCode() == 98379892) {
            return new Boolean(super.i());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public double a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a82180c4", new Object[]{this, new Double(d)})).doubleValue();
        }
        if (d > 1.0d) {
            return 1.0d;
        }
        return d < mto.a.GEO_NOT_SUPPORT ? mto.a.GEO_NOT_SUPPORT : d;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public j(ComponentModel componentModel) {
        super(componentModel);
        HashSet<Integer> hashSet = new HashSet<>();
        f10877a = hashSet;
        hashSet.add(1);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("position");
        String string2 = jSONObject.getString("type");
        JSONObject parseObject = JSON.parseObject(string);
        if (parseObject != null && !parseObject.isEmpty()) {
            try {
                this.c = Double.parseDouble(parseObject.getString("startX"));
            } catch (Exception unused) {
                this.c = -1.0d;
            }
            this.c = a(this.c);
            try {
                this.d = Double.parseDouble(parseObject.getString("startY"));
            } catch (Exception unused2) {
                this.d = -1.0d;
            }
            this.d = a(this.d);
            try {
                this.e = Double.parseDouble(parseObject.getString("endX"));
            } catch (Exception unused3) {
                this.e = -1.0d;
            }
            this.e = a(this.e);
            try {
                this.f = Double.parseDouble(parseObject.getString("endY"));
            } catch (Exception unused4) {
                this.f = -1.0d;
            }
            this.f = a(this.f);
        }
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        try {
            this.b = Integer.parseInt(string2);
        } catch (Exception unused5) {
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        if (!f10877a.contains(Integer.valueOf(this.b)) || this.d >= this.f || this.c >= this.e || this.s.actionModelList == null) {
            return false;
        }
        return super.i();
    }
}
