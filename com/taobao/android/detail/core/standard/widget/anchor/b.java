package com.taobao.android.detail.core.standard.widget.anchor;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f9889a;
    private String b;
    private boolean c;
    private AURARenderComponent d;

    static {
        kge.a(1059383184);
    }

    public b(String str, String str2, boolean z, AURARenderComponent aURARenderComponent) {
        this.f9889a = str;
        this.b = str2;
        this.c = z;
        this.d = aURARenderComponent;
        emu.a("com.taobao.android.detail.core.standard.widget.anchor.PicGalleryAnchorModel");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f9889a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
    }

    public AURARenderComponent d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("4aa17516", new Object[]{this}) : this.d;
    }

    public static boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fd41377", new Object[]{bVar})).booleanValue() : bVar != null && !StringUtils.isEmpty(bVar.f9889a) && !StringUtils.isEmpty(bVar.b);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PicGalleryAnchorModel{title='" + this.f9889a + "', anchorId='" + this.b + "', isFixed=" + this.c + ", componentKey=" + this.d.key + '}';
    }
}
