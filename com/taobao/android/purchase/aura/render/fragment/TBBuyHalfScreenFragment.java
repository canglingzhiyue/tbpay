package com.taobao.android.purchase.aura.render.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.c;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import com.taobao.android.purchase.aura.a;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.b;
import com.taobao.android.purchase.aura.f;
import com.taobao.android.purchase.aura.utils.g;
import com.taobao.android.purchase.aura.utils.h;
import com.taobao.android.purchase.aura.utils.k;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.bxe;
import tb.bxf;
import tb.dui;
import tb.idt;
import tb.kge;
import tb.qps;
import tb.tdh;

/* loaded from: classes6.dex */
public class TBBuyHalfScreenFragment extends Fragment implements a, b, f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsFullScreenMode;
    private final idt mRenderDelegate = idt.e();

    static {
        kge.a(-1825024880);
        kge.a(-1316612705);
        kge.a(1009639087);
        kge.a(98823612);
    }

    public static /* synthetic */ Object ipc$super(TBBuyHalfScreenFragment tBBuyHalfScreenFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public String getRenderContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this}) : "native";
    }

    public static /* synthetic */ boolean access$000(TBBuyHalfScreenFragment tBBuyHalfScreenFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1759821a", new Object[]{tBBuyHalfScreenFragment})).booleanValue() : tBBuyHalfScreenFragment.mIsFullScreenMode;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_purchase_v2_halfscreen, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.purchase_skeleton);
        this.mIsFullScreenMode = TBBuyPageMode.fullPageMode.equals(this.mRenderDelegate.j());
        if (this.mIsFullScreenMode) {
            ((ViewGroup) inflate.findViewById(R.id.purchase_statusBar)).setVisibility(0);
        }
        if (h.a((Activity) getActivity())) {
            linearLayout.addView(h.a(getActivity(), new View.OnClickListener() { // from class: com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        bxe.a().b(TBBuyHalfScreenFragment.this.getActivity());
                    }
                }
            }, !this.mIsFullScreenMode));
        } else {
            View inflate2 = layoutInflater.inflate(R.layout.layout_purchase_skeleton, (ViewGroup) linearLayout, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(0, com.alibaba.android.ultron.trade.utils.f.a(getContext(), 60.0f), 0, 0);
            linearLayout.addView(inflate2, layoutParams);
        }
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        g.b(getActivity(), new HashMap<String, String>() { // from class: com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment.2
            {
                put("renderContainer", "native");
            }
        });
        arc.a().b("TBBuyHalfScreenFragment onViewCreated", arc.a.a().b("TBBuyHalfScreenFragment").a("info", "TBBuyHalfScreenFragment onViewCreated").b());
        this.mRenderDelegate.a(getActivity(), (ViewGroup) view.findViewById(R.id.purchase_container));
        if (qps.a(getActivity())) {
            this.mRenderDelegate.h();
        } else {
            changeRenderContainer(getActivity(), this.mRenderDelegate);
        }
        this.mRenderDelegate.i();
        View findViewById = view.findViewById(R.id.tbbuy_halfscreen_header_close);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    bxe.a().b(TBBuyHalfScreenFragment.this.getActivity());
                }
            }
        });
        if (!this.mIsFullScreenMode) {
            return;
        }
        findViewById.setVisibility(8);
    }

    private void changeRenderContainer(final FragmentActivity fragmentActivity, idt idtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac15ab8", new Object[]{this, fragmentActivity, idtVar});
        } else {
            idtVar.a(new com.taobao.android.purchase.aura.g() { // from class: com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.purchase.aura.g
                public void a(String str, List<com.alibaba.android.aura.datamodel.parse.a> list, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b7485c02", new Object[]{this, str, list, map});
                        return;
                    }
                    com.taobao.android.lightbuy.performance.a.a().a(LightBuyStage.MTOP_REQ_END);
                    qps.a(fragmentActivity, list);
                    HashMap hashMap = new HashMap();
                    hashMap.put("bundleUrl", str);
                    hashMap.put("containerType", TBBuyHalfScreenFragment.access$000(TBBuyHalfScreenFragment.this) ? "fullScreen" : null);
                    FragmentActivity fragmentActivity2 = fragmentActivity;
                    bxf.a(fragmentActivity2, hashMap, new c(fragmentActivity2));
                    tdh.a("Light-Buy", dui.c(fragmentActivity.getIntent()));
                }
            });
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.mRenderDelegate.a(getActivity(), i, i2, intent);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.mRenderDelegate.a(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        getActivity();
    }

    @Override // com.taobao.android.purchase.aura.a
    public void dataUpdate(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
        } else {
            this.mRenderDelegate.dataUpdate(jSONObject);
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void refreshPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        } else {
            this.mRenderDelegate.refreshPage(z);
        }
    }

    @Override // com.taobao.android.purchase.aura.b
    public void invokeEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            this.mRenderDelegate.invokeEvent(str, jSONObject);
        }
    }

    public String getPageMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this}) : this.mRenderDelegate.j();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        k.a(k.f);
    }

    @Override // com.taobao.android.purchase.aura.f
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        getActivity().finish();
        return true;
    }
}
