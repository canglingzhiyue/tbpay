package com.alibaba.android.icart.core.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f2309a;
    private String b = "";
    private String c = "";
    private List<IDMComponent> d;
    private String e;

    static {
        kge.a(-1636318176);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f2309a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f2309a = z;
        }
    }

    public void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.d = list;
        for (IDMComponent iDMComponent : list) {
            this.c += a(iDMComponent) + ",";
            this.b += b(iDMComponent) + ",";
        }
        String str = this.c;
        this.c = str.substring(0, str.length() - 1);
        String str2 = this.b;
        this.b = str2.substring(0, str2.length() - 1);
    }

    private String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent}) : (iDMComponent == null || iDMComponent.getFields() == null) ? "" : iDMComponent.getFields().getString("settlement");
    }

    private String b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("759a0cf5", new Object[]{this, iDMComponent}) : (iDMComponent == null || iDMComponent.getFields() == null) ? "" : iDMComponent.getFields().getString("cartId");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.e;
    }
}
