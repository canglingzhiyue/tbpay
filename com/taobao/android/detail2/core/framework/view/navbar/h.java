package com.taobao.android.detail2.core.framework.view.navbar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.List;
import tb.fjq;
import tb.fjt;
import tb.fka;
import tb.fmd;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBPublicMenu d;

    static {
        kge.a(-1844803663);
    }

    public h(TBActionView tBActionView, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        super(tBActionView, fmdVar, bVar);
        if (bVar != null && bVar.h().b().ai()) {
            this.d = new TBPublicMenu(bVar.g(), new a());
        } else {
            this.d = new TBPublicMenu(bVar.g());
        }
        this.d.setCustomOverflow(tBActionView);
        this.d.setShareContentCallBack(new b());
        this.d.setOnOverflowButtonClickListener(new TBPublicMenu.TBOnOverflowButtonClickListener() { // from class: com.taobao.android.detail2.core.framework.view.navbar.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
            public void onOverflowButtonClicked() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ddc419b", new Object[]{this});
                } else if (h.this.c == null) {
                } else {
                    h hVar = h.this;
                    hVar.d(hVar.c);
                }
            }
        });
        if (bVar != null && bVar.h().b().ai()) {
            fjt.a("new_detail公共菜单", "enableConstructPublicMenuReportArg true");
        } else {
            this.d.setReportArguments(new a());
        }
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.g
    public void a(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2441c2", new Object[]{this, lVar});
            return;
        }
        if (this.itemView instanceof TBActionView) {
            ((TBActionView) this.itemView).setIconColor(lVar.b());
        }
        a();
    }

    public void a() {
        com.taobao.android.detail2.core.framework.data.model.d g;
        List<n> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.c != null && (g = this.c.g()) != null && (list = g.S) != null) {
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            for (n nVar : list) {
                if (nVar != null && !TextUtils.isEmpty(nVar.a()) && !TextUtils.isEmpty(nVar.b()) && !TextUtils.isEmpty(nVar.c())) {
                    TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                    builder.setName(nVar.a());
                    builder.setTitle(nVar.b() + ":" + nVar.c());
                    TBPublicMenuItem build = builder.build();
                    if (build != null) {
                        arrayList.add(build);
                    }
                }
            }
            if (this.d == null || arrayList.isEmpty()) {
                return;
            }
            this.d.clearExternalMenus();
            this.d.addExternalMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail2.core.framework.view.navbar.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                    } else if (tBPublicMenuItem == null) {
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ndType", (Object) tBPublicMenuItem.getName());
                        h.this.b.a("cusNaviClicked", jSONObject);
                    }
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public class a implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1618654988);
            kge.a(-1343974867);
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return null;
        }

        private a() {
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this}) : fjq.a(h.this.c.g().I);
        }
    }

    /* loaded from: classes5.dex */
    public class b implements ShareContentCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(930333661);
            kge.a(321354641);
        }

        private b() {
        }

        @Override // com.taobao.uikit.actionbar.ShareContentCallBack
        public Object getQueryShareParameters() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("febe4434", new Object[]{this});
            }
            if (h.this.c != null && h.this.c.g() != null) {
                return fka.a(h.this.c.g().I);
            }
            return null;
        }
    }

    public static g a(ViewGroup viewGroup, fmd fmdVar, com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("232f9dc4", new Object[]{viewGroup, fmdVar, bVar});
        }
        TBActionView tBActionView = (TBActionView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_nav_more_layout, (ViewGroup) null, false);
        tBActionView.setTitle(viewGroup.getContext().getString(R.string.new_detail_menu_more_text));
        return new h(tBActionView, fmdVar, bVar);
    }
}
