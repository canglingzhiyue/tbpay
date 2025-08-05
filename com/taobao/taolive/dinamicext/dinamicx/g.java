package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taolive.uikit.view.TBLiveFollowComponent;
import tb.kge;

/* loaded from: classes8.dex */
public class g extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLFOLLOWVIEW_FOLLOWCOLOR = -5256959681575179875L;
    public static final long DXTBLFOLLOWVIEW_FOLLOWDATA = -3947223316720625897L;
    public static final long DXTBLFOLLOWVIEW_ISFOLLOWED = -7049142842304485086L;
    public static final long DXTBLFOLLOWVIEW_RADIUS = 10074193828068110L;
    public static final long DXTBLFOLLOWVIEW_STROKECOLOR = 1904134416384250786L;
    public static final long DXTBLFOLLOWVIEW_STROKEWIDTH = 1904312980655574691L;
    public static final long DXTBLFOLLOWVIEW_TBLFOLLOWVIEW = 2167110289751455229L;
    public static final long DXTBLFOLLOWVIEW_UNFOLLOWCOLOR = -5703421456103511934L;

    /* renamed from: a  reason: collision with root package name */
    private int f21415a;
    private Object b;
    private int c = 0;
    private double d;
    private int e;
    private double f;
    private int g;

    static {
        kge.a(-1868799799);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79233009", new Object[]{gVar, new Integer(i)})).intValue();
        }
        gVar.c = i;
        return i;
    }

    public static /* synthetic */ Object a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("b11b4e45", new Object[]{gVar}) : gVar.b;
    }

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1419665056);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof g)) {
        } else {
            super.onClone(dXWidgetNode, z);
            g gVar = (g) dXWidgetNode;
            this.f21415a = gVar.f21415a;
            this.b = gVar.b;
            this.c = gVar.c;
            this.d = gVar.d;
            this.e = gVar.e;
            this.f = gVar.f;
            this.g = gVar.g;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new TBLiveFollowComponent(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof TBLiveFollowComponent)) {
        } else {
            TBLiveFollowComponent tBLiveFollowComponent = (TBLiveFollowComponent) view;
            tBLiveFollowComponent.setFollowColor(this.f21415a);
            tBLiveFollowComponent.setFollowData(this.b);
            tBLiveFollowComponent.setIsFollowed(this.c);
            tBLiveFollowComponent.setUnFollowColor(this.g);
            tBLiveFollowComponent.setRadius(this.d);
            tBLiveFollowComponent.setStrokeColor(this.e);
            tBLiveFollowComponent.setStrokeWidth(this.f);
            tBLiveFollowComponent.update();
            if (this.c != 0) {
                return;
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.taolive.dinamicext.dinamicx.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else if (!(view2 instanceof TBLiveFollowComponent) || !(g.a(g.this) instanceof JSONObject)) {
                    } else {
                        String string = ((JSONObject) g.a(g.this)).getString("accountId");
                        String string2 = ((JSONObject) g.a(g.this)).getString("type");
                        if (TextUtils.isEmpty(string)) {
                            return;
                        }
                        ((TBLiveFollowComponent) view2).addFollow(string, TextUtils.equals("daren", string2) ? "2" : "1");
                        try {
                            g.a(g.this, 1);
                            g.this.getDXRuntimeContext().e().getJSONObject("liveSearchAnchorBaseInfo").put("follow", (Object) "true");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
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
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == DXTBLFOLLOWVIEW_FOLLOWDATA) {
            this.b = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 10074193828068110L) {
            this.d = d;
        } else if (j == DXTBLFOLLOWVIEW_STROKEWIDTH) {
            this.f = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLFOLLOWVIEW_FOLLOWCOLOR) {
            this.f21415a = i;
        } else if (j == DXTBLFOLLOWVIEW_ISFOLLOWED) {
            this.c = i;
        } else if (j == DXTBLFOLLOWVIEW_STROKECOLOR) {
            this.e = i;
        } else if (j == DXTBLFOLLOWVIEW_UNFOLLOWCOLOR) {
            this.g = i;
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
        if (j != DXTBLFOLLOWVIEW_ISFOLLOWED) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }
}
