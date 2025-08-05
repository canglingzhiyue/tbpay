package com.taobao.tao.export.flickbtn;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXFLICKINGSHAREBUTTON_BIZCODE = 4692571911381046119L;
    public static final long DXFLICKINGSHAREBUTTON_FLICKANIMENABLE = 3594541629581155300L;
    public static final int DXFLICKINGSHAREBUTTON_FLICKANIMENABLE_FALSE = 1;
    public static final int DXFLICKINGSHAREBUTTON_FLICKANIMENABLE_TRUE = 0;
    public static final long DXFLICKINGSHAREBUTTON_FLICKINGSHAREBUTTON = -2033267238411967319L;
    public static final long DXFLICKINGSHAREBUTTON_ICONCOLOR = 2996147367631721393L;
    public static final long DXFLICKINGSHAREBUTTON_ICONHEIGHT = 7735295455280851724L;
    public static final long DXFLICKINGSHAREBUTTON_ICONWIDTH = 2996192074059827378L;
    public static final long DXFLICKINGSHAREBUTTON_LOCATION = 4406527402114761313L;
    public static final long DXFLICKINGSHAREBUTTON_SHARECONTENT = -8838640107702650118L;
    public static final long DXFLICKINGSHAREBUTTON_SHAREICONFONT = 8560243711849934944L;
    public static final long DXFLICKINGSHAREBUTTON_TARGETID = 6746394970674636604L;
    public static final long DXFLICKINGSHAREBUTTON_TARGETTYPE = -3419842854714867917L;

    /* renamed from: a  reason: collision with root package name */
    private String f19918a;
    private int b = 0;
    private int c = -6710887;
    private int d;
    private int e;
    private String f;
    private JSONObject g;
    private String h;
    private String i;
    private String j;

    static {
        kge.a(807764009);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* renamed from: com.taobao.tao.export.flickbtn.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0828a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1044520448);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
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
            this.f19918a = aVar.f19918a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.j;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        Log.e("daishuwen", "DXFlickingShareButtonWidgetNode#onCreateView");
        DXRootView s = getDXRuntimeContext().s();
        if (s != null && s.findViewById(R.id.flShareContainer) != null) {
            Log.e("daishuwen", "find cached view");
            return s.findViewById(R.id.flShareContainer);
        }
        Log.e("daishuwen", "create new view");
        FlickingShareButton flickingShareButton = new FlickingShareButton(context);
        flickingShareButton.setIconSize(this.e, this.d);
        flickingShareButton.setIconColor(this.c);
        if (!TextUtils.isEmpty(this.h)) {
            flickingShareButton.setIconFont(this.h);
        }
        if (this.b == 0) {
            z = true;
        }
        flickingShareButton.setFlickAnimEnable(z);
        flickingShareButton.dxMode = true;
        a(flickingShareButton);
        return flickingShareButton;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(context instanceof Activity) || !(view instanceof FlickingShareButton)) {
            return;
        }
        FlickingShareButton flickingShareButton = (FlickingShareButton) view;
        a(flickingShareButton);
        flickingShareButton.considerPostRequestData();
    }

    private void a(FlickingShareButton flickingShareButton) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926e480", new Object[]{this, flickingShareButton});
            return;
        }
        if (this.f != null) {
            flickingShareButton.presenter.b = this.f;
        }
        if (this.f19918a != null) {
            flickingShareButton.presenter.f19919a = this.f19918a;
        }
        if (this.i != null) {
            flickingShareButton.presenter.c = this.i;
        }
        if (this.j == null) {
            return;
        }
        flickingShareButton.presenter.d = this.j;
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
        } else if (j == DXFLICKINGSHAREBUTTON_SHARECONTENT) {
            this.g = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXFLICKINGSHAREBUTTON_BIZCODE) {
            this.f19918a = str;
        } else if (j == DXFLICKINGSHAREBUTTON_LOCATION) {
            this.f = str;
        } else if (j == DXFLICKINGSHAREBUTTON_SHAREICONFONT) {
            this.h = str;
        } else if (j == DXFLICKINGSHAREBUTTON_TARGETID) {
            this.i = str;
        } else if (j == DXFLICKINGSHAREBUTTON_TARGETTYPE) {
            this.j = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXFLICKINGSHAREBUTTON_FLICKANIMENABLE) {
            this.b = i;
        } else if (j == 2996147367631721393L) {
            this.c = i;
        } else if (j == DXFLICKINGSHAREBUTTON_ICONHEIGHT) {
            this.d = i;
        } else if (j == DXFLICKINGSHAREBUTTON_ICONWIDTH) {
            this.e = i;
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
        if (j != DXFLICKINGSHAREBUTTON_FLICKANIMENABLE) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }
}
