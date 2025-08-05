package com.alibaba.appmonitor.model;

import android.text.TextUtils;
import com.alibaba.analytics.core.db.annotation.Column;
import com.alibaba.analytics.core.db.annotation.Ingore;
import com.alibaba.analytics.core.db.annotation.TableName;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;
import tb.aof;
import tb.bte;
import tb.bti;
import tb.kge;

@TableName("stat_register_temp")
/* loaded from: classes.dex */
public class a extends aof implements com.alibaba.appmonitor.pool.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Column("module")

    /* renamed from: a  reason: collision with root package name */
    private String f2887a;
    @Column(bte.TAG_MONITOR_POINT)
    private String b;
    @Column("dimensions")
    private String d;
    @Column("measures")
    private String e;
    @Ingore
    private String f;
    @Column("is_commit_detail")
    private boolean g;
    @Ingore
    private DimensionSet h;
    @Ingore
    private MeasureSet i;
    @Ingore
    private String j;

    static {
        kge.a(754551659);
        kge.a(1105107017);
    }

    @Deprecated
    public a() {
    }

    public a(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet, boolean z) {
        this.f2887a = str;
        this.b = str2;
        this.h = dimensionSet;
        this.i = measureSet;
        this.f = null;
        this.g = z;
        if (dimensionSet != null) {
            this.d = JSON.toJSONString(dimensionSet);
        }
        this.e = JSON.toJSONString(measureSet);
    }

    public synchronized String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (this.j == null) {
            this.j = UUID.randomUUID().toString() + "$" + this.f2887a + "$" + this.b;
        }
        return this.j;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.j = null;
        }
    }

    public boolean a(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7afc786", new Object[]{this, dimensionValueSet, measureValueSet})).booleanValue();
        }
        DimensionSet dimensionSet = this.h;
        boolean valid = dimensionSet != null ? dimensionSet.valid(dimensionValueSet) : true;
        MeasureSet measureSet = this.i;
        return measureSet != null ? valid && measureSet.valid(measureValueSet) : valid;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f2887a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b;
    }

    public DimensionSet e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionSet) ipChange.ipc$dispatch("664dde90", new Object[]{this});
        }
        if (this.h == null && !TextUtils.isEmpty(this.d)) {
            this.h = (DimensionSet) JSON.parseObject(this.d, DimensionSet.class);
        }
        return this.h;
    }

    public MeasureSet h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeasureSet) ipChange.ipc$dispatch("17d570cb", new Object[]{this});
        }
        if (this.i == null && !TextUtils.isEmpty(this.e)) {
            this.i = (MeasureSet) JSON.parseObject(this.e, MeasureSet.class);
        }
        return this.i;
    }

    public synchronized boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return this.g || bti.a().a(this.f2887a, this.b);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f2887a;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.b;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f;
        if (str == null) {
            if (aVar.f != null) {
                return false;
            }
        } else if (!str.equals(aVar.f)) {
            return false;
        }
        String str2 = this.f2887a;
        if (str2 == null) {
            if (aVar.f2887a != null) {
                return false;
            }
        } else if (!str2.equals(aVar.f2887a)) {
            return false;
        }
        String str3 = this.b;
        if (str3 == null) {
            if (aVar.b != null) {
                return false;
            }
        } else if (!str3.equals(aVar.b)) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        this.f2887a = null;
        this.b = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    @Override // com.alibaba.appmonitor.pool.b
    public void fill(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7129a67", new Object[]{this, objArr});
            return;
        }
        this.f2887a = (String) objArr[0];
        this.b = (String) objArr[1];
        if (objArr.length <= 2) {
            return;
        }
        this.f = (String) objArr[2];
    }
}
