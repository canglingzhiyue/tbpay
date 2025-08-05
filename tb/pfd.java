package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.movehighlight.utils.g;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* loaded from: classes8.dex */
public class pfd implements ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_START_REPORT = "com.taobao.taolive.room.start_report_from_btns";

    /* renamed from: a  reason: collision with root package name */
    private TBLiveDataModel f32583a;
    private boolean b;
    private Context c;
    private a d;

    static {
        kge.a(1533816576);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "EventLiveListener";
    }

    public pfd(TBLiveDataModel tBLiveDataModel, boolean z, Context context, a aVar) {
        this.f32583a = tBLiveDataModel;
        this.b = z;
        this.c = context;
        this.d = aVar;
        ddw.a().a(this);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        pfb a2 = pfb.a(this.d);
        if (EVENT_START_REPORT.equals(str)) {
            g.a(this.c, this.f32583a, this.b, this.d);
        } else if ("com.taobao.taolive.room.goods_list_showing".equals(str)) {
            if (a2.i() == null) {
                return;
            }
            a2.i();
        } else if (xkw.EVENT_SHOW_GOODSPACKAGE.equals(str)) {
            if (a2.j() == null) {
                return;
            }
            a2.j().a(obj);
        } else if (xkw.EVENT_SHOW_GOODSPACKAGE_DISMISS.equals(str) || "com.taobao.taolive.room.hide_goods_list".equals(str)) {
            if (a2.j() == null) {
                return;
            }
            a2.j().b(obj);
        } else if ("com.taobao.taolive.room.interactive_render_finished".equals(str)) {
            if (a2.j() == null) {
                return;
            }
            a2.j();
        } else if (!"com.taobao.taolive.goods.open.shop_vip".equals(str) || a2.j() == null) {
        } else {
            a2.j();
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{EVENT_START_REPORT, "com.taobao.taolive.room.goods_list_showing", xkw.EVENT_SHOW_GOODSPACKAGE, xkw.EVENT_SHOW_GOODSPACKAGE_DISMISS, "com.taobao.taolive.room.hide_goods_list", "com.taobao.taolive.room.interactive_render_finished", "com.taobao.taolive.goods.open.shop_vip"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        a aVar = this.d;
        if (aVar != null) {
            return aVar.G();
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ddw.a().b(this);
        }
    }
}
