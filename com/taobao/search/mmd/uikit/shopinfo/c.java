package com.taobao.search.mmd.uikit.shopinfo;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.kge;
import tb.rul;

/* loaded from: classes7.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f19189a;
    private final Map<String, Object> b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final Map f;
    private final d g;
    private final d h;
    private final d i;
    private final d j;
    private final Map k;

    static {
        kge.a(1528332966);
        f19189a = new k[]{t.a(new PropertyReference1Impl(t.b(c.class), "color", "getColor()Ljava/lang/String;")), t.a(new PropertyReference1Impl(t.b(c.class), "icon", "getIcon()Ljava/lang/String;")), t.a(new PropertyReference1Impl(t.b(c.class), "text", "getText()Ljava/lang/String;")), t.a(new PropertyReference1Impl(t.b(c.class), "hiddenType", "getHiddenType()Ljava/lang/String;")), t.a(new PropertyReference1Impl(t.b(c.class), "textSize", "getTextSize()I")), t.a(new PropertyReference1Impl(t.b(c.class), "iconWidth", "getIconWidth()I")), t.a(new PropertyReference1Impl(t.b(c.class), "iconHeight", "getIconHeight()I")), t.a(new PropertyReference1Impl(t.b(c.class), "height", "getHeight()I")), t.a(new PropertyReference1Impl(t.b(c.class), "iconStyle", "getIconStyle()Ljava/lang/String;"))};
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return (String) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : ai.a(this.c, f19189a[0].getName()));
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return (String) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : ai.a(this.d, f19189a[1].getName()));
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return (String) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : ai.a(this.e, f19189a[2].getName()));
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return (String) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("43881515", new Object[]{this}) : ai.a(this.f, f19189a[3].getName()));
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5a4ca5f", new Object[]{this}) : this.g.getValue())).intValue();
    }

    public final int f() {
        IpChange ipChange = $ipChange;
        return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5b2e1e0", new Object[]{this}) : this.h.getValue())).intValue();
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5c0f961", new Object[]{this}) : this.i.getValue())).intValue();
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("5cf10e2", new Object[]{this}) : this.j.getValue())).intValue();
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return (String) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : ai.a(this.k, f19189a[8].getName()));
    }

    public c(Map<String, ? extends Object> props) {
        q.c(props, "props");
        this.b = ai.a((Map) props, (rul) ShopInfoItemBean$refs$1.INSTANCE);
        Map<String, Object> map = this.b;
        this.c = map;
        this.d = map;
        this.e = map;
        this.f = map;
        this.g = kotlin.e.a(new ShopInfoItemBean$textSize$2(props));
        this.h = kotlin.e.a(new ShopInfoItemBean$iconWidth$2(props));
        this.i = kotlin.e.a(new ShopInfoItemBean$iconHeight$2(props));
        this.j = kotlin.e.a(new ShopInfoItemBean$height$2(props));
        this.k = this.b;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        Object obj = this.b.get("isBold");
        if (!(obj instanceof String)) {
            obj = null;
        }
        return com.taobao.search.mmd.util.d.a((String) obj, false);
    }
}
