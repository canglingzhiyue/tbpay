package com.alibaba.triver.cannal_engine.scene;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.common.TRWidgetConstant;
import com.alibaba.triver.cannal_engine.event.IDXWidgetEvent;
import com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer;
import com.alibaba.triver.cannal_engine.manager.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class a extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTRWIDGETVIEW_DEBUGURL = 2039222475875855938L;
    public static final long DXTRWIDGETVIEW_DOWNGRADEPIC = -5669943142817255453L;
    public static final long DXTRWIDGETVIEW_EXTRADATA = 1374035529445903015L;
    public static final long DXTRWIDGETVIEW_INITDATA = 3521967542925970230L;
    public static final long DXTRWIDGETVIEW_LOADINGPIC = -5875488234411868668L;
    public static final long DXTRWIDGETVIEW_METAINFO = 4689624929528691771L;
    public static final long DXTRWIDGETVIEW_OFFLINEDOWNGRADEPIC = -1338052012691369043L;
    public static final long DXTRWIDGETVIEW_RELATIONURL = 7063849423137885340L;
    public static final long DXTRWIDGETVIEW_SCENEPARAMS = 4479639587008577405L;
    public static final long DXTRWIDGETVIEW_SPMURL = 10151332148980425L;
    public static final long DXTRWIDGETVIEW_SUBSCRIBESCENEID = 7704921073715745389L;
    public static final long DXTRWIDGETVIEW_TRWIDGETVIEW = -5329577880870718543L;
    public static final long DXTRWIDGETVIEW_VERSION = 5435381891761953165L;
    public static final long DXTRWIDGETVIEW_VISUALX = 5435960974756632435L;
    public static final long DXTRWIDGETVIEW_VISUALY = 5435960974756632564L;
    public static final long DXTRWIDGETVIEW_WIDGETHEIGHT = -2514211213979615255L;
    public static final long DXTRWIDGETVIEW_WIDGETID = 7638940145981662009L;
    public static final long DXTRWIDGETVIEW_WIDGETWIDTH = 5473119589518193295L;

    /* renamed from: a  reason: collision with root package name */
    private String f3671a;
    private String b;
    private JSONObject c;
    private String d;
    private String e;
    private JSONObject f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private int l = -1;
    private int m = -1;
    private int n = 0;
    private int o = 0;
    private String p;
    private String q;
    private TUrlImageView r;
    private FrameLayout s;

    /* renamed from: com.alibaba.triver.cannal_engine.scene.a$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3676a = new int[TRWidgetConstant.WidgetState.values().length];

        static {
            try {
                f3676a[TRWidgetConstant.WidgetState.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3676a[TRWidgetConstant.WidgetState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3676a[TRWidgetConstant.WidgetState.INITING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3676a[TRWidgetConstant.WidgetState.RENDERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-1380988815);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        }
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18f34c1a", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ void a(a aVar, Context context, ViewGroup viewGroup, com.alibaba.triver.cannal_engine.common.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f00c56", new Object[]{aVar, context, viewGroup, aVar2});
        } else {
            aVar.a(context, viewGroup, aVar2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof a)) {
        } else {
            super.onClone(dXWidgetNode, z);
            a aVar = (a) dXWidgetNode;
            this.f3671a = aVar.f3671a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.p = aVar.p;
            this.j = aVar.j;
            this.k = aVar.k;
            this.l = aVar.l;
            this.m = aVar.m;
            this.n = aVar.n;
            this.o = aVar.o;
            this.q = aVar.q;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.s = new FrameLayout(context);
        this.s.setOnTouchListener(new View.OnTouchListener() { // from class: com.alibaba.triver.cannal_engine.scene.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                return true;
            }
        });
        return this.s;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (this.g == null) {
            this.g = getDXRuntimeContext().A();
        }
        if (view == null || !(view instanceof FrameLayout)) {
            return;
        }
        a(context, view);
    }

    private void a(Context context, View view) {
        WeakReference<TRWidgetInstance> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8ef3872", new Object[]{this, context, view});
            return;
        }
        try {
            String string = getDXRuntimeContext().e().getString("id");
            view.setTag(R.id.triver_widget_viewId, string);
            TRWidgetInstance tRWidgetInstance = null;
            if (!TextUtils.isEmpty(string) && (weakReference = h.a().a(this.g).get(string)) != null) {
                tRWidgetInstance = weakReference.get();
            }
            if (tRWidgetInstance != null) {
                int i = AnonymousClass4.f3676a[tRWidgetInstance.getWidgetState().a().ordinal()];
                if (i == 1) {
                    a(context, string, (FrameLayout) view);
                    return;
                } else if (i != 2) {
                    return;
                } else {
                    View rootView = tRWidgetInstance.getRootView();
                    if (rootView.getParent() != null) {
                        ((FrameLayout) rootView.getParent()).removeView(rootView);
                    }
                    ((FrameLayout) view).removeAllViews();
                    RVLogger.e("TRWidgetInstanceManager", "reuse instance in cache, scene id: " + this.g + ",cache id :" + string);
                    ((FrameLayout) view).addView(rootView);
                    return;
                }
            }
            a(context, string, (FrameLayout) view);
        } catch (Exception e) {
            a(context, (FrameLayout) view, TRWidgetConstant.CL_CONTEXT_ERROR);
            RVLogger.e("DXTRWidgetViewWidgetNode", e.getMessage());
        }
    }

    private void a(final Context context, final String str, final FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812156ad", new Object[]{this, context, str, frameLayout});
            return;
        }
        frameLayout.removeAllViews();
        final TRWidgetInstance tRWidgetInstance = new TRWidgetInstance((FragmentActivity) context);
        tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(context));
        tRWidgetInstance.registerWidgetRenderListener(new TRWidgetInstance.g() { // from class: com.alibaba.triver.cannal_engine.scene.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
            public void a(View view) {
                FrameLayout frameLayout2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                } else if (!(frameLayout.getTag(R.id.triver_widget_viewId) instanceof String) || !TextUtils.equals(str, (String) frameLayout.getTag(R.id.triver_widget_viewId)) || (frameLayout2 = frameLayout) == null) {
                } else {
                    frameLayout2.removeAllViews();
                    frameLayout.addView(view);
                }
            }

            @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.g
            public void a(final com.alibaba.triver.cannal_engine.common.a aVar, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("af2eb696", new Object[]{this, aVar, map});
                    return;
                }
                frameLayout.post(new Runnable() { // from class: com.alibaba.triver.cannal_engine.scene.a.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a.this, context, frameLayout, aVar);
                        }
                    }
                });
                if (TextUtils.equals(aVar.f3640a, TRWidgetConstant.CL_TRIVER_INITING.f3640a)) {
                    return;
                }
                RVLogger.e("DXTRWidgetViewWidgetNode", "renderError" + aVar.f3640a + aVar.b);
                tRWidgetInstance.destroy();
            }
        });
        WidgetStartParams widgetStartParams = new WidgetStartParams();
        widgetStartParams.setDebugUrl(this.f3671a);
        widgetStartParams.setWidgetId(this.i);
        widgetStartParams.setVersion(this.h);
        widgetStartParams.setRelationUrl(this.e);
        widgetStartParams.setSpmUrl(this.j);
        JSONObject jSONObject = this.f;
        String str2 = "";
        widgetStartParams.setSceneParams(jSONObject != null ? jSONObject.toJSONString() : str2);
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 != null) {
            str2 = jSONObject2.toJSONString();
        }
        widgetStartParams.setExtraData(str2);
        widgetStartParams.setInitData(this.q);
        widgetStartParams.setHeight(String.valueOf(this.l));
        widgetStartParams.setWidth(String.valueOf(this.m));
        widgetStartParams.setMetaInfo(this.p);
        widgetStartParams.setVisualX(String.valueOf(this.n));
        widgetStartParams.setVisualY(String.valueOf(this.o));
        tRWidgetInstance.render(widgetStartParams);
    }

    private void a(final Context context, ViewGroup viewGroup, com.alibaba.triver.cannal_engine.common.a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe22478", new Object[]{this, context, viewGroup, aVar});
        } else if (viewGroup == null || context == null) {
        } else {
            this.r = new TUrlImageView(context);
            this.r.setBackgroundColor(Color.parseColor("#F5F5F5"));
            if (TextUtils.equals(aVar.f3640a, TRWidgetConstant.WIDGET_OFFLINE_ERROR_CODE)) {
                str = this.d;
            } else if (TextUtils.equals(aVar.f3640a, TRWidgetConstant.CL_TRIVER_INITING.f3640a)) {
                str = this.k;
            } else {
                String str2 = this.b;
                this.r.setOnClickListener(new View.OnClickListener() { // from class: com.alibaba.triver.cannal_engine.scene.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            ((IDXWidgetEvent) RVProxy.get(IDXWidgetEvent.class)).openApp(context, Uri.parse(a.a(a.this)), new Bundle());
                        }
                    }
                });
                str = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.r.setSkipAutoSize(true);
                this.r.setImageUrl(str);
            }
            viewGroup.removeAllViews();
            viewGroup.addView(this.r);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXTRWIDGETVIEW_EXTRADATA) {
            this.c = jSONObject;
        } else if (j == DXTRWIDGETVIEW_SCENEPARAMS) {
            this.f = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTRWIDGETVIEW_DEBUGURL) {
            this.f3671a = str;
        } else if (j == DXTRWIDGETVIEW_DOWNGRADEPIC) {
            this.b = str;
        } else if (j == DXTRWIDGETVIEW_OFFLINEDOWNGRADEPIC) {
            this.d = str;
        } else if (j == DXTRWIDGETVIEW_RELATIONURL) {
            this.e = str;
        } else if (j == DXTRWIDGETVIEW_SUBSCRIBESCENEID) {
            this.g = str;
        } else if (j == 5435381891761953165L) {
            this.h = str;
        } else if (j == DXTRWIDGETVIEW_LOADINGPIC) {
            this.k = str;
        } else if (j == DXTRWIDGETVIEW_WIDGETID) {
            this.i = str;
        } else if (j == DXTRWIDGETVIEW_SPMURL) {
            this.j = str;
        } else if (j == DXTRWIDGETVIEW_METAINFO) {
            this.p = str;
        } else if (j == DXTRWIDGETVIEW_INITDATA) {
            this.q = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTRWIDGETVIEW_VISUALX) {
            this.n = i;
        } else if (j == DXTRWIDGETVIEW_VISUALY) {
            this.o = i;
        } else if (j == DXTRWIDGETVIEW_WIDGETHEIGHT) {
            this.l = i;
        } else if (j == DXTRWIDGETVIEW_WIDGETWIDTH) {
            this.m = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
