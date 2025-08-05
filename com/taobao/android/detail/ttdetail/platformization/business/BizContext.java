package com.taobao.android.detail.ttdetail.platformization.business;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taobao.R;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyp;
import tb.eyx;
import tb.ezm;
import tb.fut;
import tb.kge;
import tb.lus;

/* loaded from: classes5.dex */
public abstract class BizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;
    private eyx mDetailContext;
    private a mFrameworkBizLifecycle;
    private Intent mIntent;
    private b mViewFinder;

    static {
        kge.a(-1664927878);
    }

    public abstract String bizId();

    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public boolean onFrameworkDowngrade(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ed54b7", new Object[]{this, jSONObject})).booleanValue();
        }
        return false;
    }

    public boolean onInterceptResponse(Map<String, String> map, MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1323cb08", new Object[]{this, map, mtopResponse, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public boolean onSendRequest(Map<String, String> map, lus lusVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21802d9c", new Object[]{this, map, lusVar, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public final void attachBizContext(eyx eyxVar, Context context, Intent intent, b bVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93013352", new Object[]{this, eyxVar, context, intent, bVar, aVar});
        } else if (this.mDetailContext != null || this.mContext != null || this.mIntent != null || this.mViewFinder != null || this.mFrameworkBizLifecycle != null) {
            throw new IllegalStateException("BizContext#attachBizContext(DetailContext, Context, Intent, BizLifecycle) method can not invoke twice or invoke by business");
        } else {
            this.mDetailContext = eyxVar;
            this.mContext = context;
            this.mIntent = intent;
            this.mViewFinder = bVar;
            this.mFrameworkBizLifecycle = aVar;
        }
    }

    public String setMtopData(Map<String, String> map, MtopResponse mtopResponse, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("52bb970c", new Object[]{this, map, mtopResponse, new Integer(i)}) : this.mFrameworkBizLifecycle.b(map, mtopResponse, i);
    }

    public Intent getIntent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this}) : this.mIntent;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    private <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}) : (T) this.mViewFinder.a(i);
    }

    public ViewGroup getFloatView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("17154e63", new Object[]{this}) : (ViewGroup) findViewById(R.id.fl_tt_detail_opening_biz_fliggy_container);
    }

    public ViewGroup getGalleryFloatView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("42e58729", new Object[]{this}) : (ViewGroup) findViewById(R.id.tt_tmall_header_float_container);
    }

    public void set2001PageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb9d14c", new Object[]{this, str});
        } else {
            this.mFrameworkBizLifecycle.a(str);
        }
    }

    public void setUserTrackArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1a22443", new Object[]{this, map});
        } else {
            this.mFrameworkBizLifecycle.a(map);
        }
    }

    public d findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2c508b56", new Object[]{this, str}) : this.mDetailContext.b().b(str);
    }

    public void getStreamingFinalData(com.taobao.android.detail.ttdetail.request.stream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2dfde61", new Object[]{this, aVar});
        } else {
            this.mDetailContext.a().c(aVar);
        }
    }

    public void removeStreamingFinalDataListener(com.taobao.android.detail.ttdetail.request.stream.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8407c1f", new Object[]{this, aVar});
        } else {
            this.mDetailContext.a().a(aVar);
        }
    }

    public boolean hasStreamingFinalDataListener(com.taobao.android.detail.ttdetail.request.stream.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5781be4d", new Object[]{this, aVar})).booleanValue() : this.mDetailContext.a().b(aVar);
    }

    public boolean isPreloadData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e44eb9d4", new Object[]{this})).booleanValue() : this.mDetailContext.a().c();
    }

    public <M extends Merged> M getMergedData(Class<M> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (M) ipChange.ipc$dispatch("8c55ab17", new Object[]{this, cls}) : (M) this.mDetailContext.a().a(cls);
    }

    public void registerAbilityImplementor(String str, ezm ezmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98bdd28", new Object[]{this, str, ezmVar});
        } else {
            this.mDetailContext.c().a(str, ezmVar);
        }
    }

    public void postAbility(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce4d3aa", new Object[]{this, aVar, runtimeAbilityParamArr});
        } else {
            this.mDetailContext.c().a(aVar, runtimeAbilityParamArr);
        }
    }

    public eyx getDetailContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("117c4f3", new Object[]{this}) : this.mDetailContext;
    }

    public boolean registerComponentBuilder(String str, String str2, eyp eypVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af0c874", new Object[]{this, str, str2, eypVar})).booleanValue() : this.mDetailContext.d().a(str, str2, eypVar);
    }

    public void registerDinamicXWidget(long j, ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e3b7b2", new Object[]{this, new Long(j), akVar});
        } else {
            this.mDetailContext.f().a(j, akVar);
        }
    }

    public void registerDinamicXEvent(long j, bn bnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9673007f", new Object[]{this, new Long(j), bnVar});
        } else {
            this.mDetailContext.f().a(j, bnVar);
        }
    }

    public void registerDinamicXDataParser(long j, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac90dd3", new Object[]{this, new Long(j), futVar});
        } else {
            this.mDetailContext.f().a(j, futVar);
        }
    }

    public void putComponentViewMeta(String str, ComponentViewMeta componentViewMeta) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce597556", new Object[]{this, str, componentViewMeta});
        } else {
            this.mDetailContext.d().a(str, componentViewMeta);
        }
    }
}
