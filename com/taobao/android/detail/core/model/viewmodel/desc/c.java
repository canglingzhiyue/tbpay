package com.taobao.android.detail.core.model.viewmodel.desc;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashSet;
import tb.epf;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public class c extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STYLE_RECT = 1;

    /* renamed from: a  reason: collision with root package name */
    public static HashSet<Integer> f9745a;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;

    static {
        kge.a(418055826);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 67041405) {
            return new Boolean(super.isValid());
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.desc.HotAreaViewModel";
    }

    public c(ComponentModel componentModel) {
        super(componentModel);
        HashSet<Integer> hashSet = new HashSet<>();
        f9745a = hashSet;
        hashSet.add(1);
    }

    @Override // tb.epf
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
        if (StringUtils.isEmpty(string2)) {
            return;
        }
        try {
            this.b = Integer.parseInt(string2);
        } catch (Exception unused5) {
        }
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (!f9745a.contains(Integer.valueOf(this.b)) || this.d >= this.f || this.c >= this.e || this.component.actionModelList == null) {
            return false;
        }
        return super.isValid();
    }

    public c(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
        HashSet<Integer> hashSet = new HashSet<>();
        f9745a = hashSet;
        hashSet.add(1);
    }
}
