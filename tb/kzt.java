package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes7.dex */
public class kzt extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPCANCEL = 8746808838507530845L;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPCONFIRM = -1129127094585505562L;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPSCROLL = 8783582798676678022L;
    public static final long DXTBPOPEVENTLAYOUT_ONPOPTIMEOUT = -819022960750368545L;
    public static final long DXTBPOPEVENTLAYOUT_TBPOPEVENTLAYOUT = -5412611939775210923L;

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kzt();
        }
    }

    public static /* synthetic */ Object ipc$super(kzt kztVar, String str, Object... objArr) {
        if (str.hashCode() == 1327675976) {
            return new Boolean(super.onEvent((DXEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kzt();
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
        return super.onEvent(dXEvent) || a(dXEvent);
    }

    private boolean a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed70072e", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.isPrepareBind()) {
            return false;
        }
        long eventId = dXEvent.getEventId();
        String str = null;
        if (DXTBPOPEVENTLAYOUT_ONPOPCANCEL == eventId) {
            str = "popCancel";
        } else if (DXTBPOPEVENTLAYOUT_ONPOPCONFIRM == eventId) {
            str = "popConfirm";
        } else if (DXTBPOPEVENTLAYOUT_ONPOPTIMEOUT == eventId) {
            str = "popTimeout";
        } else if (DXTBPOPEVENTLAYOUT_ONPOPSCROLL == eventId) {
            str = "popScroll";
        }
        if (str == null) {
            return false;
        }
        c.a("DXTBPopEventLayout ", "widget on " + str + " event, " + hashCode());
        return true;
    }
}
