package com.taobao.android.detail.datasdk.model.datamodel.node;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import java.util.ArrayList;
import java.util.Map;
import tb.emu;
import tb.eqb;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final b f10055a;

    static {
        kge.a(-1322476670);
    }

    public c(b bVar) {
        this.f10055a = bVar;
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.NodeBundleWrapper");
    }

    public boolean b() {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        b bVar = this.f10055a;
        if (bVar != null && (f = eqb.f(bVar)) != null) {
            return f.oneProductMM;
        }
        return false;
    }

    public boolean c() {
        SellerNode d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        b bVar = this.f10055a;
        return (bVar == null || (d = eqb.d(bVar)) == null || d.shopType != 2) ? false : true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        b bVar = this.f10055a;
        return (bVar == null || eqb.g(bVar).jhsNode == null) ? false : true;
    }

    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return null;
        }
        return bVar.o();
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.f10055a.d();
    }

    public Map<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.f10055a.e();
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.f10055a.g();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        b bVar = this.f10055a;
        return bVar != null ? eqb.d(bVar).userId : "";
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return "";
        }
        ItemNode c = eqb.c(bVar);
        return !StringUtils.isEmpty(c.itemId) ? c.itemId : "";
    }

    public String j() {
        ItemNode c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        b bVar = this.f10055a;
        return (bVar == null || (c = eqb.c(bVar)) == null) ? "" : c.platformItemId;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        b bVar = this.f10055a;
        return bVar != null ? eqb.c(bVar).title : "";
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        b bVar = this.f10055a;
        return bVar != null ? eqb.h(bVar).to : "";
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return null;
        }
        return eqb.e(bVar).degradeUrl;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return null;
        }
        return bVar.h();
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        b bVar = this.f10055a;
        return bVar != null ? eqb.d(bVar).shopId : "";
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return 1;
        }
        return eqb.d(bVar).shopType;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        b bVar = this.f10055a;
        return bVar != null ? eqb.d(bVar).shopTypeOriginal : "C";
    }

    public AskAllNode r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AskAllNode) ipChange.ipc$dispatch("fa2bf213", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return null;
        }
        return eqb.g(bVar).askAllNode;
    }

    public long s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136e", new Object[]{this})).longValue();
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return 0L;
        }
        return eqb.c(bVar).commentCount.longValue();
    }

    public ArrayList<RateNode.RateKeyword> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7aa2c355", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar != null) {
            return eqb.k(bVar).keywords;
        }
        return new ArrayList<>();
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return "";
        }
        ItemNode c = eqb.c(bVar);
        return (c.images == null || c.images.isEmpty()) ? "" : c.images.get(0);
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        b bVar = this.f10055a;
        return bVar != null ? eqb.c(bVar).themeType : "";
    }

    public boolean w() {
        VerticalNode g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
        }
        b bVar = this.f10055a;
        return (bVar == null || (g = eqb.g(bVar)) == null || g.isvCustomNode == null || g.isvCustomNode.tradeBefor == null || StringUtils.isEmpty(g.isvCustomNode.tradeBefor.f9968a)) ? false : true;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return null;
        }
        VerticalNode g = eqb.g(bVar);
        if (g.mWwPromptNode == null) {
            return null;
        }
        return g.mWwPromptNode.msg;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar == null) {
            return null;
        }
        VerticalNode g = eqb.g(bVar);
        if (g.superMarketNode == null) {
            return null;
        }
        return g.superMarketNode.tpId;
    }

    public String z() {
        a j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar != null && (j = bVar.j()) != null && j.e != null && j.e.f10048a != null) {
            return j.e.f10048a.f10049a;
        }
        return null;
    }

    public boolean A() {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue();
        }
        b bVar = this.f10055a;
        return (bVar == null || (f = eqb.f(bVar)) == null || !f.forceNaviAlpha) ? false : true;
    }

    public DetailOptNode B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailOptNode) ipChange.ipc$dispatch("21228ec5", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar != null) {
            return eqb.u(bVar);
        }
        return null;
    }

    public DetailClientDataNode C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailClientDataNode) ipChange.ipc$dispatch("c07bcb46", new Object[]{this});
        }
        b bVar = this.f10055a;
        if (bVar != null) {
            return eqb.v(bVar);
        }
        return null;
    }

    public NativeFloatButtonNode D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NativeFloatButtonNode) ipChange.ipc$dispatch("ec7f52ae", new Object[]{this}) : eqb.w(this.f10055a);
    }
}
