package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.TaxDescFragment;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class x implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openTaxDesc";

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f10730a;
    private eyx b;

    static {
        kge.a(-281879553);
        kge.a(1967244270);
    }

    public x(Context context, eyx eyxVar) {
        if (context instanceof FragmentActivity) {
            this.f10730a = (FragmentActivity) context;
        }
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        List<Map<String, List<Pair<String, String>>>> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = b()) == null || b.isEmpty()) {
            return false;
        }
        try {
            TaxDescFragment.startFragment(this.f10730a, a(), b());
        } catch (Exception unused) {
        }
        return true;
    }

    public String a() {
        Vertical.b hk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        Vertical vertical = (Vertical) this.b.a().a(Vertical.class);
        return (vertical == null || (hk = vertical.getHK()) == null) ? "税费说明" : hk.a();
    }

    public List<Map<String, List<Pair<String, String>>>> b() {
        Vertical.b hk;
        List<Map<String, List<Pair<String, String>>>> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        Vertical vertical = (Vertical) this.b.a().a(Vertical.class);
        if (vertical != null && (hk = vertical.getHK()) != null && (c = hk.c()) != null && c.size() > 0) {
            return c;
        }
        return null;
    }
}
