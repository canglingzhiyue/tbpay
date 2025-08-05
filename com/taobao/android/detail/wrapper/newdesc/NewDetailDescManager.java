package com.taobao.android.detail.wrapper.newdesc;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.event.basic.PreventRepetitionFilter;
import com.taobao.android.detail.core.event.basic.o;
import com.taobao.android.detail.core.event.basic.q;
import com.taobao.android.detail.core.open.a;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.io.Serializable;
import java.util.Map;
import tb.dyd;
import tb.dyj;
import tb.egy;
import tb.ehj;
import tb.emu;
import tb.eno;
import tb.enu;
import tb.eoi;
import tb.eop;
import tb.fac;
import tb.fdw;
import tb.fdx;
import tb.fdz;
import tb.fea;
import tb.feb;
import tb.fec;
import tb.fey;
import tb.fez;
import tb.ffp;
import tb.ffq;
import tb.ffr;
import tb.ffs;
import tb.kge;

/* loaded from: classes5.dex */
public class NewDetailDescManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private dyd mController;
    private JSONObject mCurrentItemData;
    private ViewGroup mParent;

    static {
        kge.a(-430718320);
        kge.a(1028243835);
    }

    public NewDetailDescManager(Context context) {
        if (!(context instanceof Activity)) {
            return;
        }
        this.mContext = context;
        ehj.a(context.hashCode() + "", true);
        initGlobalData(context);
        this.mController = new dyd((Activity) context);
        emu.a("com.taobao.android.detail.wrapper.newdesc.NewDetailDescManager");
    }

    private void initGlobalData(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1162a324", new Object[]{this, context});
            return;
        }
        fac.a();
        a aVar = new a();
        aVar.a("detail");
        aVar.b("detail");
        if (n.a(context) != null) {
            return;
        }
        h hVar = new h(context, aVar);
        n.a(context, hVar);
        hVar.a(new fez());
        hVar.a(new dyj());
        hVar.a(new fey());
        hVar.a(new fdz());
        hVar.a(new fdw());
        hVar.a(new feb());
        hVar.a(new fea());
        hVar.a((eop) new fdx());
        hVar.a(new fec());
    }

    public void updateItemData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f7335c3", new Object[]{this, jSONObject});
        } else {
            this.mCurrentItemData = jSONObject;
        }
    }

    public JSONObject getCurrentItemData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dbcafb67", new Object[]{this}) : this.mCurrentItemData;
    }

    public void initDesc(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("590e4828", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            egy egyVar = new egy((IDMComponent) null, (b) null);
            egyVar.f27302a = jSONObject.getString("userId");
            egyVar.b = jSONObject.getString("shopId");
            egyVar.c = jSONObject.getString("itemId");
            egyVar.d = (Map) jSONObject.getObject("moduleDescParams", Map.class);
            egyVar.e = jSONObject.getString("taobaoDescUrl");
            egyVar.f = jSONObject.getString("taobaoPcDescUrl");
            dyd dydVar = this.mController;
            if (dydVar == null) {
                return;
            }
            dydVar.a(egyVar);
            ViewGroup viewGroup = this.mParent;
            if (viewGroup != null) {
                if (viewGroup instanceof NestedScrollContainer) {
                    ((NestedScrollContainer) viewGroup).addScrollChild(this.mController);
                } else {
                    View k = this.mController.k();
                    this.mParent.removeView(k);
                    this.mParent.addView(k, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            d a2 = f.a(this.mContext);
            a2.a(eno.a(enu.class), new ffp(this.mContext, egyVar.c), new PreventRepetitionFilter());
            a2.a(eno.a(o.class), new ffq(this.mContext));
            a2.a(eno.a(q.class), new ffr(this.mContext));
            a2.a(eno.a(eoi.class), new ffs(this.mContext, this));
        }
    }

    public void setDescParentView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb48a5a8", new Object[]{this, viewGroup});
        } else {
            this.mParent = viewGroup;
        }
    }

    public void onLoadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c57fdb6", new Object[]{this});
            return;
        }
        dyd dydVar = this.mController;
        if (dydVar == null) {
            return;
        }
        dydVar.a();
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        dyd dydVar = this.mController;
        if (dydVar == null) {
            return;
        }
        dydVar.b();
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        dyd dydVar = this.mController;
        if (dydVar == null) {
            return;
        }
        dydVar.a(false, false);
    }

    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        dyd dydVar = this.mController;
        if (dydVar == null) {
            return;
        }
        dydVar.c();
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        d a2 = f.a(this.mContext);
        a2.a(eno.a(enu.class));
        a2.a(eno.a(o.class));
        a2.a(eno.a(q.class));
        a2.a(eno.a(eoi.class));
        dyd dydVar = this.mController;
        if (dydVar == null) {
            return;
        }
        dydVar.d();
    }
}
