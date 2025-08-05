package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.SizingChartFloatFragment;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class o implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openInterSizingChart";

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f10719a;
    private eyx b;

    static {
        kge.a(1833718669);
        kge.a(1967244270);
    }

    public o(Context context, eyx eyxVar) {
        if (context instanceof FragmentActivity) {
            this.f10719a = (FragmentActivity) context;
        }
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        Vertical vertical;
        Vertical.b hk;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || aVar.b() == null || (vertical = (Vertical) this.b.a().a(Vertical.class)) == null || (hk = vertical.getHK()) == null) {
            return false;
        }
        String b = hk.b();
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        try {
            SizingChartFloatFragment.startFragment(this.f10719a, "国际尺码对照表", b);
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("OpenInterSizingChartImplementor", "execute error", e);
        }
        return true;
    }
}
