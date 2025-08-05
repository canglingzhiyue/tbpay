package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.ScrollTabView;
import com.taobao.tao.Globals;

/* loaded from: classes7.dex */
public class lov extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHSCROLLTABVIEW_DATASOURCE = -5948810534719014123L;
    public static final long DXHSCROLLTABVIEW_HSCROLLTABVIEW = -2045923102355577993L;
    public static final long DXHSCROLLTABVIEW_SELECTEDTITLECOLOR = -3017816204945500324L;
    public static final long DXHSCROLLTABVIEW_TITLECOLOR = -2833278103584064213L;
    public static final long DXHSCROLLTABVIEW_TITLEPADDINGBOTTOM = 11989631050131552L;
    public static final long DXHSCROLLTABVIEW_TITLEPADDINGLEFT = 9131194993794190452L;
    public static final long DXHSCROLLTABVIEW_TITLEPADDINGRIGHT = 4414988871911025640L;
    public static final long DXHSCROLLTABVIEW_TITLEPADDINGTOP = -3902191403880802533L;
    public static final long DXHSCROLLTABVIEW_TITLESELECTSIZE = 1188062818800698156L;
    public static final long DXHSCROLLTABVIEW_TITLESIZE = 8079882417003171014L;
    private JSONObject d;
    private com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a f;
    private ScrollTabView.a g;

    /* renamed from: a  reason: collision with root package name */
    private final int f30786a = gbg.b(Globals.getApplication(), 12.0f);
    private final int b = gbg.b(Globals.getApplication(), 16.5f);
    private final int c = gbg.b(Globals.getApplication(), 18.0f);
    private final lox e = new lox();

    static {
        kge.a(-991615840);
    }

    public static /* synthetic */ Object ipc$super(lov lovVar, String str, Object... objArr) {
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
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ lox a(lov lovVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lox) ipChange.ipc$dispatch("91c3238c", new Object[]{lovVar}) : lovVar.e;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1726831479);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lov();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lov();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof lov)) {
        } else {
            super.onClone(dXWidgetNode, z);
            lov lovVar = (lov) dXWidgetNode;
            this.d = lovVar.d;
            this.e.a(lovVar.e);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new ScrollTabView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof ScrollTabView)) {
        } else {
            ScrollTabView scrollTabView = (ScrollTabView) view;
            this.f = a(scrollTabView);
            scrollTabView.setOnTabClickedListener(a(this.f));
            scrollTabView.uiRefresh(this.d, this.e);
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == -5948810534719014123L) {
            this.d = jSONObject;
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXHSCROLLTABVIEW_SELECTEDTITLECOLOR) {
            this.e.a(i);
        } else if (j == DXHSCROLLTABVIEW_TITLECOLOR) {
            this.e.b(i);
        } else if (j == DXHSCROLLTABVIEW_TITLEPADDINGLEFT) {
            this.e.c(i);
        } else if (j == DXHSCROLLTABVIEW_TITLEPADDINGRIGHT) {
            this.e.d(i);
        } else if (j == DXHSCROLLTABVIEW_TITLEPADDINGTOP) {
            this.e.f(i);
        } else if (j == DXHSCROLLTABVIEW_TITLEPADDINGBOTTOM) {
            this.e.e(i);
        } else if (j == DXHSCROLLTABVIEW_TITLESELECTSIZE) {
            this.e.g(i);
        } else if (j == DXHSCROLLTABVIEW_TITLESIZE) {
            this.e.h(i);
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
        if (j == DXHSCROLLTABVIEW_SELECTEDTITLECOLOR) {
            return 16732160;
        }
        if (j == DXHSCROLLTABVIEW_TITLECOLOR) {
            return 1118481;
        }
        if (j == DXHSCROLLTABVIEW_TITLEPADDINGLEFT) {
            return this.f30786a;
        }
        if (j == DXHSCROLLTABVIEW_TITLEPADDINGRIGHT) {
            return this.f30786a;
        }
        if (j == DXHSCROLLTABVIEW_TITLESELECTSIZE) {
            return this.c;
        }
        if (j == DXHSCROLLTABVIEW_TITLESIZE) {
            return this.b;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    private ScrollTabView.a a(com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollTabView.a) ipChange.ipc$dispatch("197b26c9", new Object[]{this, aVar});
        }
        if (this.g == null) {
            this.g = b(aVar);
        }
        return this.g;
    }

    private ScrollTabView.a b(final com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollTabView.a) ipChange.ipc$dispatch("849e11a8", new Object[]{this, aVar}) : new ScrollTabView.a() { // from class: tb.lov.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.ScrollTabView.a
            public void a(int i, llj lljVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("743afe1", new Object[]{this, new Integer(i), lljVar});
                    return;
                }
                com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                if (i == 0) {
                    aVar2.a();
                } else {
                    aVar2.a(lljVar);
                }
            }
        };
    }

    private com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a a(ScrollTabView scrollTabView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a) ipChange.ipc$dispatch("57e0ba6", new Object[]{this, scrollTabView});
        }
        ljs a2 = a();
        if (a2 == null) {
            ldf.d("DXHScrollTabViewWidgetNode", "getTabContentController infoFlowContext is null");
            return null;
        }
        if (this.f == null) {
            this.f = new com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a(a2);
            this.f.a(b(scrollTabView));
        }
        return this.f;
    }

    private IMulticlassTabService.a b(final ScrollTabView scrollTabView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.a) ipChange.ipc$dispatch("61c91f24", new Object[]{this, scrollTabView}) : new IMulticlassTabService.a() { // from class: tb.lov.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.a
            public void a(llm llmVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f304c8cb", new Object[]{this, llmVar});
                } else if (!llmVar.a().equals("首页")) {
                } else {
                    scrollTabView.reset(lov.a(lov.this));
                }
            }
        };
    }

    private ljs a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ljs) ipChange.ipc$dispatch("f075909", new Object[]{this});
        }
        ljs a2 = lfq.a(getDXRuntimeContext());
        if (a2 != null) {
            return a2;
        }
        ldf.d("DXHScrollTabViewWidgetNode", "getTabContentController infoFlowContext is null");
        return null;
    }
}
