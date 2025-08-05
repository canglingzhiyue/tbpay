package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes7.dex */
public class kzr extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHANIMATORIMAGEVIEW_HANIMATORIMAGEVIEW = -1417750378278284013L;
    public static final long DXHANIMATORIMAGEVIEW_IMAGEURL = 3520785955321526846L;
    public static final long DXHANIMATORIMAGEVIEW_MAXSCROLLINGENDNOTIFYTIMES = 8442704571553018783L;
    public static final long DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLEND = -3388379768679026854L;
    public static final long DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLSTART = 111688451027680851L;
    public static final long DXHANIMATORIMAGEVIEW_SCROLLENDDELAYTIME = -4087040622847156170L;
    private static int d;

    /* renamed from: a  reason: collision with root package name */
    private String f30422a;
    private boolean f;
    private int b = -1;
    private long c = 0;
    private final Handler e = new Handler(Looper.getMainLooper());
    private Runnable g = new Runnable() { // from class: tb.kzr.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (kzr.a(kzr.this) || !kzr.b(kzr.this)) {
            } else {
                c.b("HAnimatorImageView ", "post scroll end to template");
                kzr.this.postEvent(new DXEvent(kzr.DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLEND));
                kzr.a();
            }
        }
    };

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kzr();
        }
    }

    public static /* synthetic */ Object ipc$super(kzr kzrVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -1085610847:
                return new Long(super.getDefaultValueForLongAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        }
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        int i = d;
        d = i + 1;
        return i;
    }

    public static /* synthetic */ boolean a(kzr kzrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2177f19", new Object[]{kzrVar})).booleanValue() : kzrVar.f;
    }

    public static /* synthetic */ boolean b(kzr kzrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e09a859a", new Object[]{kzrVar})).booleanValue() : kzrVar.c();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kzr();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof kzr)) {
        } else {
            super.onClone(dXWidgetNode, z);
            kzr kzrVar = (kzr) dXWidgetNode;
            this.f30422a = kzrVar.f30422a;
            this.b = kzrVar.b;
            this.c = kzrVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new View(context);
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
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        boolean onEvent = super.onEvent(dXEvent);
        long eventId = dXEvent.getEventId();
        c.c("HAnimatorImageView ", "onEvent=" + eventId);
        if (eventId == -1609878593 && !this.f) {
            this.e.removeCallbacks(this.g);
            c.b("HAnimatorImageView ", "receive on scroll start event");
            this.f = true;
            postEvent(new DXEvent(DXHANIMATORIMAGEVIEW_ONFEEDSSCROLLSTART));
            return true;
        } else if (eventId != -962581640 || !this.f || !c()) {
            return onEvent;
        } else {
            c.a("HAnimatorImageView ", "receive on scroll stop event");
            this.f = false;
            b();
            return true;
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
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 3520785955321526846L) {
            this.f30422a = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXHANIMATORIMAGEVIEW_MAXSCROLLINGENDNOTIFYTIMES) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXHANIMATORIMAGEVIEW_SCROLLENDDELAYTIME) {
            this.c = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXHANIMATORIMAGEVIEW_MAXSCROLLINGENDNOTIFYTIMES) {
            return super.getDefaultValueForIntAttr(j);
        }
        return -1;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public long getDefaultValueForLongAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf4ae4a1", new Object[]{this, new Long(j)})).longValue();
        }
        if (j != DXHANIMATORIMAGEVIEW_SCROLLENDDELAYTIME) {
            return super.getDefaultValueForLongAttr(j);
        }
        return 0L;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        long j = this.c;
        if (j > 0) {
            this.e.postDelayed(this.g, j);
        } else {
            this.g.run();
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        int i = this.b;
        return i < 0 || d < i;
    }
}
