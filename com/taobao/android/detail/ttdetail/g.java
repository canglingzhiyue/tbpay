package com.taobao.android.detail.ttdetail;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.w;
import com.taobao.android.detail.ttdetail.utils.bj;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taobao.R;
import tb.eyx;
import tb.fpr;
import tb.frg;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private eyx f10662a;
    private View b;
    private View c;

    static {
        kge.a(1192260670);
    }

    public g(eyx eyxVar, View view, View view2) {
        this.f10662a = eyxVar;
        this.b = view;
        this.c = view2;
        view.findViewById(R.id.v_head_skeleton_holder).setBackgroundColor(-1250068);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        w wVar = (w) this.f10662a.b().a("mainScreen");
        if (wVar == null) {
            return;
        }
        com.taobao.android.detail.ttdetail.component.module.d g = wVar.g();
        ViewGroup viewGroup = (ViewGroup) this.b.findViewById(R.id.ll_headerLayout);
        g.create();
        View componentView = g.getComponentView(null);
        bj.a(componentView);
        viewGroup.removeAllViews();
        viewGroup.addView(componentView);
        g.willAppear();
        g.didAppear();
        View findViewById = this.c.findViewById(R.id.tt_scrollerLayout);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        marginLayoutParams.rightMargin = fpr.a(this.f10662a.g(), 16.0f);
        findViewById.setLayoutParams(marginLayoutParams);
    }

    /* loaded from: classes4.dex */
    public static class a extends frg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-850236667);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -858210922) {
                return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.frg, tb.fuf, tb.fut
        public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
            }
            if (objArr == null || objArr.length == 0) {
                return null;
            }
            return "platformDetail".equals(objArr[0]) ? "1" : super.evalWithArgs(objArr, dXRuntimeContext);
        }
    }
}
