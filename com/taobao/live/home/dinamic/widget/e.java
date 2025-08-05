package com.taobao.live.home.dinamic.widget;

import android.content.Context;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.live.home.dinamic.view.TBLFrameLayout;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import tb.mfj;
import tb.mfm;
import tb.psn;
import tb.pso;

/* loaded from: classes7.dex */
public class e extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLVWEBVIEW_DATAINFO = 2034718900751390766L;
    public static final long DXTBLVWEBVIEW_DISABLEDEFAULTLIFECYCLE = 1092412866410492448L;
    public static final long DXTBLVWEBVIEW_TBLVWEBVIEW = -4365067432113244932L;
    public static final long DXTBLVWEBVIEW_WEBURL = 10439701118004535L;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f17759a;
    private String b;
    private com.taobao.taolivecontainer.b c;
    private TBLiveH5Container d;
    private TBLFrameLayout e;
    private boolean f;
    private boolean h = false;
    private boolean g = false;

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new e();
        }
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new e();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof e)) {
        } else {
            super.onClone(dXWidgetNode, z);
            e eVar = (e) dXWidgetNode;
            this.f17759a = eVar.f17759a;
            this.h = eVar.h;
            this.b = eVar.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (context != null) {
            mfj.c("DXTBLVWebViewWidgetNode", "onCreateView " + this);
            this.e = new TBLFrameLayout(context);
            return this.e;
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        mfj.c("DXTBLVWebViewWidgetNode", "onRenderView " + this + " mUrlChanged:" + this.g);
        if (this.e == null && view != null && (view instanceof TBLFrameLayout)) {
            TBLFrameLayout tBLFrameLayout = (TBLFrameLayout) view;
            if (tBLFrameLayout.getChildCount() > 0 && (tBLFrameLayout.getChildAt(0) instanceof TBLiveH5Container)) {
                ((TBLiveH5Container) tBLFrameLayout.getChildAt(0)).destroy();
                tBLFrameLayout.removeAllViews();
            }
            this.e = tBLFrameLayout;
        }
        if (this.c != null && !this.g) {
            return;
        }
        this.g = false;
        if (this.g) {
            if (this.d != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onRenderView " + this + " mTBLiveH5Container:true");
                this.d.destroy();
                this.d = null;
                this.f = false;
                TBLFrameLayout tBLFrameLayout2 = this.e;
                if (tBLFrameLayout2 != null) {
                    tBLFrameLayout2.removeAllViews();
                }
            }
            if (this.c != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onRenderView " + this + " mTBLiveH5ContainerBuilder destroy");
                this.c.e();
            }
        }
        mfj.c("DXTBLVWebViewWidgetNode", "onRenderView " + this + " new mTBLiveH5ContainerBuilder");
        this.c = new com.taobao.taolivecontainer.b(context, "LiveHomeTab", new pso() { // from class: com.taobao.live.home.dinamic.widget.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pso
            public void a(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
                    return;
                }
                UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
                uTControlHitBuilder.setProperties(hashMap);
                UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
            }

            @Override // tb.pso
            public void b(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab0b8616", new Object[]{this, str, str2, hashMap});
                } else {
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", hashMap).build());
                }
            }

            @Override // tb.pso
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                } else {
                    TLog.loge(str, str2, str3);
                }
            }
        }, new psn() { // from class: com.taobao.live.home.dinamic.widget.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.psn
            public String a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
            }
        });
        this.c.a(this.b);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() == 10002 || dXEvent.getEventId() == 5288671110273408574L) {
            mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " DX_APPEAR");
            if (!this.f && this.e != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " DX_APPEAR mInit false");
                this.f = true;
                this.c.b(this.b);
                this.d = this.c.b();
                this.d.setEnableWebViewGestureLogic(mfm.q());
                this.e.addView(this.d);
            }
            if (this.d != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.pageAppear()");
                if (this.h) {
                    WVStandardEventCenter.postNotificationToJS(this.d, "TBLiveHomePlugin.onSearchTopADCardAppear", "{}");
                } else {
                    this.d.pageAppear();
                }
            }
        } else if (dXEvent.getEventId() == 10003 || dXEvent.getEventId() == 5388973340095122049L) {
            if (this.d != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.pageDisAppear()");
                if (this.h) {
                    WVStandardEventCenter.postNotificationToJS(this.d, "TBLiveHomePlugin.onSearchTopADCardDisappear", "{}");
                } else {
                    this.d.pageDisAppear();
                }
            }
        } else if (dXEvent.getEventId() == 10000) {
            if (this.d != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.onResume()");
                this.d.onResume();
            }
        } else if (dXEvent.getEventId() == 10001) {
            if (this.d != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.onPause()");
                this.d.onPause();
            }
        } else if (dXEvent.getEventId() == 10004) {
            if (this.d != null) {
                mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5Container.destroy()");
                this.d.destroy();
                z = true;
            }
            if (this.c != null && !z) {
                mfj.c("DXTBLVWebViewWidgetNode", "onEvent " + this + " mTBLiveH5ContainerBuilder.destroy()");
                this.c.e();
            }
        }
        return super.onEvent(dXEvent);
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
        } else if (j == 2034718900751390766L) {
            this.f17759a = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTBLVWEBVIEW_WEBURL) {
            if (!TextUtils.isEmpty(this.b) && !this.b.equals(str)) {
                this.g = true;
            }
            mfj.c("DXTBLVWebViewWidgetNode", "onSetStringAttribute " + this + " webUrl:" + this.b);
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLVWEBVIEW_DISABLEDEFAULTLIFECYCLE) {
            if (i == 0) {
                z = false;
            }
            this.h = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXTBLVWEBVIEW_DISABLEDEFAULTLIFECYCLE) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }
}
