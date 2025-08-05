package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.fxy;
import tb.fym;
import tb.kge;
import tb.pbm;

/* loaded from: classes8.dex */
public class DXTBLFllowContentWidgetNode extends DXWidgetNode implements fym {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLFLLOWCONTENT_MUTE = 36176011951L;
    public static final long DXTBLFLLOWCONTENT_ONMUTESTATECHANGE = 2679050831624843472L;
    public static final long DXTBLFLLOWCONTENT_TBLFLLOWCONTENT = 7659290621499814096L;
    public static final long DXTBLFLLOWCONTENT_TBLIVEDATA = -4433725912444460566L;
    public static final String TAG;
    private String mute;
    private JSONObject tbLiveData;
    private pbm tbLiveFllowContentController;

    public static /* synthetic */ Object ipc$super(DXTBLFllowContentWidgetNode dXTBLFllowContentWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ pbm access$000(DXTBLFllowContentWidgetNode dXTBLFllowContentWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pbm) ipChange.ipc$dispatch("1f7f5ae3", new Object[]{dXTBLFllowContentWidgetNode}) : dXTBLFllowContentWidgetNode.tbLiveFllowContentController;
    }

    static {
        kge.a(119226654);
        kge.a(-1594984463);
        TAG = DXTBLFllowContentWidgetNode.class.getSimpleName();
    }

    @Override // tb.fym
    public void onCanPlay(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcb3bff", new Object[]{this, fxyVar, str});
            return;
        }
        String str2 = "onCanPlay: " + hashCode();
        if (getDXRuntimeContext() == null || getDXRuntimeContext().s() == null) {
            return;
        }
        getDXRuntimeContext().s().post(new Runnable() { // from class: com.taobao.taolive.dinamicext.dinamicx.DXTBLFllowContentWidgetNode.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DXTBLFllowContentWidgetNode.access$000(DXTBLFllowContentWidgetNode.this) == null) {
                } else {
                    String str3 = null;
                    if (DXTBLFllowContentWidgetNode.this.getEngine() != null && DXTBLFllowContentWidgetNode.this.getEngine().l() != null && DXTBLFllowContentWidgetNode.this.getEngine().l().c() != null) {
                        str3 = DXTBLFllowContentWidgetNode.this.getEngine().l().c().getString("global_muted");
                    }
                    DXTBLFllowContentWidgetNode.access$000(DXTBLFllowContentWidgetNode.this).a(str3);
                }
            }
        });
    }

    @Override // tb.fym
    public void onShouldStop(fxy<?, fym> fxyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198f0e", new Object[]{this, fxyVar, str});
            return;
        }
        String str2 = "onShouldStop: " + hashCode();
        pbm pbmVar = this.tbLiveFllowContentController;
        if (pbmVar == null) {
            return;
        }
        pbmVar.b();
    }

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1997137419);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXTBLFllowContentWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXTBLFllowContentWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof DXTBLFllowContentWidgetNode)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXTBLFllowContentWidgetNode dXTBLFllowContentWidgetNode = (DXTBLFllowContentWidgetNode) dXWidgetNode;
            this.mute = dXTBLFllowContentWidgetNode.mute;
            this.tbLiveData = dXTBLFllowContentWidgetNode.tbLiveData;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : LayoutInflater.from(context).inflate(R.layout.tbliveuikit_fllow_content_layout, (ViewGroup) null);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view == null) {
            return;
        }
        this.tbLiveFllowContentController = new pbm(context, view, this.tbLiveData, this.mute, new pbm.a() { // from class: com.taobao.taolive.dinamicext.dinamicx.DXTBLFllowContentWidgetNode.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pbm.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                DXEvent dXEvent = new DXEvent(DXTBLFllowContentWidgetNode.DXTBLFLLOWCONTENT_ONMUTESTATECHANGE);
                HashMap hashMap = new HashMap();
                hashMap.put("mute", com.taobao.android.dinamicx.expression.expr_v2.f.a(String.valueOf(z)));
                dXEvent.setArgs(hashMap);
                DXTBLFllowContentWidgetNode.this.postEvent(dXEvent);
            }
        });
        this.tbLiveFllowContentController.c();
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
        } else if (j == DXTBLFLLOWCONTENT_TBLIVEDATA) {
            this.tbLiveData = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 36176011951L) {
            this.mute = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
