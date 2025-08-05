package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.taobao.TBActionBar;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.trade.event.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ead;
import tb.ecr;
import tb.ehe;
import tb.ehf;
import tb.ehh;
import tb.ehs;
import tb.emu;
import tb.eny;
import tb.eoi;
import tb.epe;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends com.taobao.android.detail.core.detail.kit.view.holder.c<ehh> implements View.OnClickListener, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FESTIVAL_GROUP = "android_detail";
    public static final String FESTIVAL_KEY = "openFestival";
    private TaoDetailActionBar g;
    private boolean h;
    private ehh i;

    static {
        kge.a(413840858);
        kge.a(-1201612728);
        kge.a(275753548);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public static /* synthetic */ Context a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("860b3566", new Object[]{dVar}) : dVar.f9568a;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c93b002a", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.h = z;
        return z;
    }

    public static /* synthetic */ Context b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bdfc1085", new Object[]{dVar}) : dVar.f9568a;
    }

    public static /* synthetic */ Context c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f5eceba4", new Object[]{dVar}) : dVar.f9568a;
    }

    public static /* synthetic */ Context d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2dddc6c3", new Object[]{dVar}) : dVar.f9568a;
    }

    public static /* synthetic */ TaoDetailActionBar e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoDetailActionBar) ipChange.ipc$dispatch("801cfc38", new Object[]{dVar}) : dVar.g;
    }

    public d(Context context) {
        super(context);
        this.h = true;
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.NavBarViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.g = new TaoDetailActionBar(this.f9568a);
        return this.g;
    }

    private void b(ehh ehhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55b3f14", new Object[]{this, ehhVar});
        } else if (ehhVar == null || ehhVar.equals(this.i)) {
        } else {
            this.i = ehhVar;
            b(this.i.g);
            b(this.i.h);
            b(this.i.i);
            b(this.i.j);
            if (ehhVar == null || ehhVar.k == null || ehhVar.k.f27309a == null) {
                return;
            }
            Iterator<ehf> it = ehhVar.k.f27309a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    private void a(ehf ehfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d74fd5", new Object[]{this, ehfVar});
        } else if (ehfVar == null || ehfVar.component == null || ehfVar.component.actionModelList == null) {
            b(ehfVar);
        } else {
            for (ActionModel actionModel : ehfVar.component.actionModelList) {
                ehfVar.events.add(ehs.a(this.f9568a, actionModel, ehfVar.mNodeBundle, null, null));
            }
        }
    }

    private void b(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d559e1f7", new Object[]{this, eheVar});
        } else if (eheVar == null || eheVar.component == null || eheVar.component.actionModelList == null) {
            c(eheVar);
        } else {
            eheVar.events.clear();
            for (ActionModel actionModel : eheVar.component.actionModelList) {
                eheVar.events.add(ehs.a(this.f9568a, actionModel, eheVar.mNodeBundle, null, null));
            }
        }
    }

    private List<ActionModel> a(epe epeVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12088f09", new Object[]{this, epeVar});
        }
        if (epeVar.dmComponent.getEvents() == null || (jSONArray = epeVar.dmComponent.getEvents().getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS)) == null || jSONArray.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.size());
        for (int i = 0; i < jSONArray.size(); i++) {
            arrayList.add(new ActionModel(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    private void b(ehf ehfVar) {
        List<ActionModel> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55a5656", new Object[]{this, ehfVar});
        } else if (ehfVar != null && ehfVar.dmComponent != null && (a2 = a((epe) ehfVar)) != null) {
            ehfVar.events.clear();
            for (ActionModel actionModel : a2) {
                ehfVar.events.add(ehs.a(this.f9568a, actionModel, ehfVar.mNodeBundle, null, null));
            }
        }
    }

    private void c(ehe eheVar) {
        List<ActionModel> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3dce878", new Object[]{this, eheVar});
        } else if (eheVar != null && eheVar.dmComponent != null && (a2 = a((epe) eheVar)) != null) {
            eheVar.events.clear();
            for (ActionModel actionModel : a2) {
                eheVar.events.add(ehs.a(this.f9568a, actionModel, eheVar.mNodeBundle, null, null));
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(ehh ehhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d83893", new Object[]{this, ehhVar});
            return;
        }
        b(ehhVar);
        c();
        a(this.g, ehhVar, false);
        TaoDetailActionBar taoDetailActionBar = this.g;
        taoDetailActionBar.setLayoutParams(new LinearLayout.LayoutParams(-2, taoDetailActionBar.getNavHeadHeight()));
    }

    private void a(TaoDetailActionBar taoDetailActionBar, ehh ehhVar, boolean z) {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfac3415", new Object[]{this, taoDetailActionBar, ehhVar, new Boolean(z)});
        } else if (ehhVar == null) {
        } else {
            if (ehhVar.k != null && ehhVar.k.f27309a != null) {
                taoDetailActionBar.setTabNum(ehhVar.k.f27309a.size());
            }
            if (this.h) {
                taoDetailActionBar.setBackgroundColor(this.f9568a.getResources().getColor(R.color.taodetail_action_bar_bg));
            }
            if (ehhVar.g != null) {
                taoDetailActionBar.addLeftView(a(ehhVar.g));
            }
            if (ehhVar.f != null && ehhVar.h != null) {
                taoDetailActionBar.setCenterImgData(ehhVar.f, ehhVar.h.events);
            }
            if (ehhVar.j != null) {
                TBActionView tBActionView = (TBActionView) com.taobao.android.detail.core.async.d.b(this.f9568a, R.layout.x_detail_actionbar_more);
                tBActionView.setTitle(this.f9568a.getString(R.string.detail_menu_more_text));
                tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
                tBActionView.setBackgroundResource(R.drawable.x_detail_actionbar_circularbg);
                taoDetailActionBar.addRightView(tBActionView);
                if ((this.f9568a instanceof DetailActivity) && (publicMenu = ((DetailActivity) this.f9568a).getPublicMenu()) != null) {
                    publicMenu.setCustomOverflow(tBActionView);
                    if (publicMenu.getCustomMenu(9000004) == null) {
                        TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                        builder.setId(9000004).setTitle(this.f9568a.getString(R.string.detail_menu_share_text)).setUTControlName(this.f9568a.getString(R.string.detail_menu_share));
                        ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
                        arrayList.add(builder.build());
                        publicMenu.addCustomMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.d.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                                } else if (tBPublicMenuItem == null || tBPublicMenuItem.getId() != 9000004) {
                                } else {
                                    f.a(d.a(d.this), new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT));
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(new eny(d.b(d.this).getString(R.string.detail_profile_btn_index), d.c(d.this).getString(R.string.detail_menu_share), null));
                                    ead.a(d.d(d.this), arrayList2);
                                }
                            }
                        });
                    }
                }
            }
            if (ehhVar.i != null) {
                taoDetailActionBar.addCustomView(a(ehhVar.i));
            }
            if (ehhVar.k != null && !z) {
                taoDetailActionBar.addNavTabsBar();
                Iterator<ehf> it = ehhVar.k.f27309a.iterator();
                while (it.hasNext()) {
                    ehf next = it.next();
                    if (!TextUtils.isEmpty(next.d)) {
                        taoDetailActionBar.addTabWithImage(next.d, next.events);
                    } else if (!TextUtils.isEmpty(next.c)) {
                        taoDetailActionBar.addTabWithText(next.c, next.events);
                    }
                }
            }
            taoDetailActionBar.initialize();
        }
    }

    public View a(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("53fdc238", new Object[]{this, eheVar});
        }
        int color = this.f9568a.getResources().getColor(R.color.detail_action_bar_fg2);
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.f9568a);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setTextColor(color);
        tIconFontTextView.setBackgroundResource(R.drawable.x_detail_actionbar_circularbg);
        int navHeadHeight = (int) (this.g.getNavHeadHeight() * eheVar.b);
        if (navHeadHeight == 0) {
            tIconFontTextView.setTextSize(1, this.g.getNavHeadHeight());
        } else {
            tIconFontTextView.setTextSize(0, navHeadHeight);
        }
        tIconFontTextView.setText(eheVar.c);
        com.taobao.android.detail.core.detail.kit.utils.d.a(this.f9568a, this.c, tIconFontTextView, eheVar.events);
        if (eheVar.component != null && eheVar.component.mapping != null && eheVar.component.mapping.containsKey("accessHint")) {
            String string = eheVar.component.mapping.getString("accessHint");
            if (!TextUtils.isEmpty(string)) {
                tIconFontTextView.setContentDescription(string);
            }
        }
        try {
            if (eheVar.dmComponent != null && eheVar.dmComponent.getFields() != null && eheVar.dmComponent.getFields().getJSONObject("payload").containsKey("accessHint")) {
                String string2 = eheVar.dmComponent.getFields().getJSONObject("payload").getString("accessHint");
                if (!TextUtils.isEmpty(string2)) {
                    tIconFontTextView.setContentDescription(string2);
                }
            }
        } catch (Throwable unused) {
        }
        return tIconFontTextView;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        TaoDetailActionBar taoDetailActionBar = this.g;
        if (taoDetailActionBar == null) {
            return;
        }
        taoDetailActionBar.destroy();
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.actionbar.a
    public void a(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4670d", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (this.g == null) {
        } else {
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            if (z) {
                View view = new View(this.f9568a);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, ecr.b(this.f9568a)));
                viewGroup.addView(view);
                this.g.setSyncTransparentView(view);
            }
            viewGroup.addView(this.g, new LinearLayout.LayoutParams(-1, this.g.getNavHeight()));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (!Boolean.parseBoolean(OrangeConfig.getInstance().getConfigs("android_detail").get(FESTIVAL_KEY))) {
                return;
            }
            FestivalMgr a2 = FestivalMgr.a();
            boolean f = a2.f();
            if (this.g == null || !f) {
                return;
            }
            String a3 = a2.a("global", "actionBarBackgroundImage");
            int a4 = a2.a("global", "actionbarTextColor", -1);
            int a5 = a2.a("global", "actionbarTextColor", -197380);
            int a6 = a2.a("global", "actionBarBackgroundColor", -65386);
            int a7 = a2.a("global", "actionbarTextSelColor", -192);
            this.g.setActionBarItemColor(a4);
            this.g.setTabItemSelectedTextColor(a7);
            this.g.setTabItemUnSelectedTextColor(a5);
            this.g.setTabItemBackgroundColor(0);
            this.g.setSyncTransparencyViewBackgroundColor(a6);
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            com.taobao.phenix.intf.b.h().a(a3).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.d.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                        BitmapDrawable drawable = succPhenixEvent.getDrawable();
                        if (drawable != null) {
                            if (drawable != null && d.e(d.this) != null) {
                                d.a(d.this, false);
                                drawable.setAlpha(0);
                                d.e(d.this).setBackgroundDrawable(drawable);
                            }
                        } else {
                            i.a("NavBarViewHolder", "failed to load a null drawable");
                        }
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    i.a("NavBarViewHolder", "failed to download drawable");
                    return true;
                }
            }).fetch();
        } catch (Exception e) {
            i.a("NavBarViewHolder", "Fail to get Festival Manager!");
            e.printStackTrace();
        }
    }
}
