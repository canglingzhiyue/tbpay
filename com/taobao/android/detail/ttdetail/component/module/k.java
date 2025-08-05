package com.taobao.android.detail.ttdetail.component.module;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.widget.TTObservedImageView;
import com.taobao.taobao.R;
import java.util.Map;
import tb.eyx;
import tb.eyy;
import tb.ezc;
import tb.ezg;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class k extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f10546a;
    private boolean b;
    public TTObservedImageView.a c;

    static {
        kge.a(2025711209);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 1985561551) {
            super.fireExposeEvent((RuntimeAbilityParam[]) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "DetailPic_industry";
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ void a(k kVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d95d588", new Object[]{kVar, new Boolean(z)});
        } else {
            kVar.a(z);
        }
    }

    public static /* synthetic */ boolean a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6a1b6d0", new Object[]{kVar})).booleanValue() : kVar.b;
    }

    public static /* synthetic */ void b(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca5822b", new Object[]{kVar});
        } else {
            kVar.c();
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String str = z ? "preRenderHeaderEnd" : "renderHeaderEnd";
        av.c(this.mDetailContext, str, System.currentTimeMillis());
        long b = com.taobao.android.detail.ttdetail.utils.d.b((Params) this.mDetailContext.a().a(Params.class));
        if (b > 0) {
            av.a(this.mDetailContext, "SRT", b);
        }
        ae.a(str, (Map<String, String>) null);
    }

    private void c() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!(this.mContext instanceof Activity) || (findViewById = ((Activity) this.mContext).findViewById(R.id.cl_image_holder_container)) == null) {
        } else {
            findViewById.setVisibility(8);
            this.b = true;
        }
    }

    public k(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.f10546a = new JSONObject(2);
        this.c = new TTObservedImageView.a() { // from class: com.taobao.android.detail.ttdetail.component.module.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.TTObservedImageView.a
            public void a(Drawable drawable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                } else if (k.a(k.this) || k.this.p() != 0) {
                } else {
                    boolean c = k.this.mDetailContext.a().c();
                    k.a(k.this, c);
                    if (c) {
                        return;
                    }
                    k.b(k.this);
                }
            }
        };
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        Object data = getData(com.taobao.android.detail.ttdetail.constant.a.KEY_COMPONENT_CREATE_INDEX);
        if (!(data instanceof Integer)) {
            return -1;
        }
        return ((Integer) data).intValue();
    }

    public JSONObject a() {
        ezg a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        Object data = getData(com.taobao.android.detail.ttdetail.constant.a.KEY_COMPONENT_CREATE_INDEX);
        if (data instanceof Integer) {
            this.f10546a.put("index", data);
        }
        ezg a3 = this.mComponentData.a();
        if ((a3 instanceof ezc) && (a2 = a3.a()) != null) {
            this.f10546a.put("bizCode", (Object) a2.b());
        }
        return this.f10546a;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void fireExposeEvent(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765943cf", new Object[]{this, runtimeAbilityParamArr});
            return;
        }
        super.fireExposeEvent(runtimeAbilityParamArr);
        JSONObject a2 = com.taobao.android.detail.ttdetail.utils.m.a(this.mDetailContext.a());
        a2.putAll(a());
        com.taobao.android.detail.ttdetail.utils.m.a(2201, b(), a2);
    }
}
