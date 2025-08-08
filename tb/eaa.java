package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.async.d;
import com.taobao.android.detail.core.detail.kit.utils.n;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.detail.kit.view.widget.RoundRelativeLayout;
import com.taobao.android.detail.core.open.j;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.mto;

/* loaded from: classes4.dex */
public class eaa extends c<egt> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int g;
    public LinearLayout h;
    public TextView i;
    public TextView j;
    public ViewGroup k;
    public List<c> l;
    public String m;

    static {
        kge.a(-1431307289);
    }

    public static /* synthetic */ Object ipc$super(eaa eaaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1545161960) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 2121814399) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.G_();
            return null;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : "com.taobao.android.detail.core.detail.kit.view.holder.bottombar.BottomBarViewHolder";
    }

    public static /* synthetic */ Context a(eaa eaaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("80925b6b", new Object[]{eaaVar}) : eaaVar.f9568a;
    }

    public static /* synthetic */ Context b(eaa eaaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("943a2eec", new Object[]{eaaVar}) : eaaVar.f9568a;
    }

    public static /* synthetic */ Context c(eaa eaaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a7e2026d", new Object[]{eaaVar}) : eaaVar.f9568a;
    }

    public eaa(Context context) {
        super(context);
        this.m = "";
        this.l = new ArrayList();
        g = context.getResources().getDimensionPixelSize(R.dimen.detail_bottom_bar_height);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        View b = d.b(context, R.layout.x_detail_vh_bottom_bar);
        this.h = (LinearLayout) b.findViewById(R.id.ll_bottom_bar_content);
        this.i = (TextView) b.findViewById(R.id.tv_hint);
        this.j = (TextView) b.findViewById(R.id.tv_button);
        this.k = (ViewGroup) b.findViewById(R.id.ll_hint_banner);
        return b;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(egt egtVar) {
        View a2;
        LinearLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cf9586", new Object[]{this, egtVar});
        } else if (this.f9568a instanceof Activity) {
            Activity activity = (Activity) this.f9568a;
            if (activity.isFinishing()) {
                return;
            }
            a(egtVar.b);
            b(egtVar);
            if (egtVar.f27296a != null && egtVar.f27296a.b()) {
                this.h.getLayoutParams().height = -2;
                LinearLayout d = egtVar.f27296a.d();
                ViewParent parent = d.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(d);
                }
                this.h.addView(d);
            } else if (egtVar.g != null && !egtVar.g.isEmpty()) {
                if (this.h.getChildCount() > 0) {
                    a();
                    this.h.removeAllViews();
                }
                this.l.clear();
                if (egtVar.d > 0) {
                    this.h.setPadding(egtVar.d == 1 ? epo.i : 0, 0, epo.i, 0);
                }
                int size = egtVar.g.size();
                for (int i = 0; i < size; i++) {
                    epi epiVar = egtVar.g.get(i);
                    c<epi> a3 = j.a(activity).a(activity, epiVar);
                    if (a3 != null && (a2 = a3.a((c<epi>) epiVar, this.h)) != null) {
                        a3.b(epiVar);
                        View a4 = a(a2, i);
                        ViewGroup.LayoutParams layoutParams2 = a4.getLayoutParams();
                        if (epiVar.b() > mto.a.GEO_NOT_SUPPORT) {
                            if (layoutParams2 == null) {
                                layoutParams = new LinearLayout.LayoutParams(0, -1);
                                layoutParams.weight = (float) epiVar.b();
                            } else {
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(layoutParams2);
                                layoutParams3.weight = (float) epiVar.b();
                                ((ViewGroup.LayoutParams) layoutParams3).width = 0;
                                layoutParams = layoutParams3;
                            }
                        } else if (layoutParams2 == null) {
                            layoutParams = new LinearLayout.LayoutParams(-2, -1);
                        } else {
                            layoutParams = new LinearLayout.LayoutParams(layoutParams2);
                        }
                        a4.setTag(a3);
                        a4.setLayoutParams(layoutParams);
                        this.h.addView(a4, layoutParams);
                        this.l.add(a3);
                    }
                }
            }
        }
    }

    private View a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("26df70db", new Object[]{this, view, new Integer(i)});
        }
        int size = ((egt) this.c).g.size();
        int i2 = ((egt) this.c).d;
        int i3 = size - i2;
        if (i < i3) {
            return view;
        }
        RoundRelativeLayout roundRelativeLayout = new RoundRelativeLayout(this.f9568a);
        roundRelativeLayout.setGravity(17);
        roundRelativeLayout.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        if (i2 == 1) {
            roundRelativeLayout.setRadius(epo.m);
        } else if (i == i3) {
            roundRelativeLayout.setRadius(epo.m, 0.0f, epo.m, 0.0f);
        } else if (i == i3 + 1) {
            roundRelativeLayout.setRadius(0.0f, epo.m, 0.0f, epo.m);
        }
        roundRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, epo.m << 1));
        return roundRelativeLayout;
    }

    private void b(egt egtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5529c07", new Object[]{this, egtVar});
        } else if (!egtVar.f) {
        } else {
            if (((egt) this.c).e - n.a() > 0) {
                this.k.setVisibility(0);
                g += this.f9568a.getResources().getDimensionPixelSize(R.dimen.detail_bottom_bar_hint_height);
                return;
            }
            this.k.setVisibility(8);
            g = this.f9568a.getResources().getDimensionPixelSize(R.dimen.detail_bottom_bar_height);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        List<c> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.h != null && (list = this.l) != null) {
            for (c cVar : list) {
                cVar.a();
            }
            this.l.clear();
        }
    }

    private void a(final TradeNode.HintBanner hintBanner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8151b", new Object[]{this, hintBanner});
        } else if (hintBanner == null) {
            this.k.setVisibility(8);
            g = this.f9568a.getResources().getDimensionPixelSize(R.dimen.detail_bottom_bar_height);
        } else {
            String str = hintBanner.text;
            String str2 = hintBanner.subText;
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            if (!StringUtils.isEmpty(str2)) {
                str = str + str2;
            }
            if (!StringUtils.isEmpty(str)) {
                this.i.setText(str);
                if (!StringUtils.isEmpty(hintBanner.bgColor)) {
                    try {
                        this.k.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(hintBanner.bgColor));
                    } catch (Exception unused) {
                    }
                }
                this.k.setVisibility(0);
                g += this.f9568a.getResources().getDimensionPixelSize(R.dimen.detail_bottom_bar_hint_height);
                if (StringUtils.isEmpty(hintBanner.buttonText)) {
                    return;
                }
                this.i.setGravity(16);
                ((LinearLayout.LayoutParams) this.i.getLayoutParams()).setMargins(epo.i, 0, epo.h, 0);
                this.j.setText(hintBanner.buttonText);
                this.j.setVisibility(0);
                this.m = hintBanner.url;
                this.j.setOnClickListener(new View.OnClickListener() { // from class: tb.eaa.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        ActionModel actionModel = new ActionModel(new JSONObject());
                        actionModel.type = hintBanner.eventId;
                        if (!StringUtils.isEmpty(eaa.this.m)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("url", (Object) eaa.this.m);
                            actionModel.params = new JSONObject(jSONObject);
                        }
                        Event a2 = ehs.a(eaa.a(eaa.this), actionModel, null, null, null);
                        if (a2 != null) {
                            f.a(eaa.b(eaa.this)).a(a2);
                        }
                        if (TStudioHelper.a().a(null, view, eaa.this.m, false)) {
                            return;
                        }
                        f.a(eaa.c(eaa.this), new enu(eaa.this.m));
                    }
                });
                return;
            }
            this.k.setVisibility(8);
            g = this.f9568a.getResources().getDimensionPixelSize(R.dimen.detail_bottom_bar_height);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        super.G_();
        List<c> list = this.l;
        if (list == null) {
            return;
        }
        for (c cVar : list) {
            cVar.G_();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        List<c> list = this.l;
        if (list == null) {
            return;
        }
        for (c cVar : list) {
            cVar.a(z, z2);
        }
    }
}
