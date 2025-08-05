package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class bko implements boz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VirtualLayoutManager f25953a;
    public bkp b;
    public bny c;
    public ble d;

    static {
        kge.a(1172579340);
        kge.a(-745436470);
    }

    @Override // tb.boz
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(bko bkoVar, RecyclerView.LayoutManager layoutManager, Exception exc, bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4186e888", new Object[]{bkoVar, layoutManager, exc, bnyVar});
        } else {
            bkoVar.a(layoutManager, exc, bnyVar);
        }
    }

    @Override // tb.boz
    public void a(final bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e215f60b", new Object[]{this, bnyVar});
            return;
        }
        this.c = bnyVar;
        this.d = new ble();
        if (this.f25953a == null) {
            this.f25953a = new VirtualLayoutManager(bnyVar.k());
            this.f25953a.a(new a() { // from class: tb.bko.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.ext.vlayout.a
                public void a(RecyclerView.LayoutManager layoutManager, Exception exc) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c354798f", new Object[]{this, layoutManager, exc});
                    } else {
                        bko.a(bko.this, layoutManager, exc, bnyVar);
                    }
                }
            });
        }
        if (this.b != null) {
            return;
        }
        this.b = new bkp(this.c, this.f25953a);
    }

    private void a(RecyclerView.LayoutManager layoutManager, Exception exc, bny bnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480dec32", new Object[]{this, layoutManager, exc, bnyVar});
            return;
        }
        int itemCount = layoutManager.getItemCount();
        int childCount = layoutManager.getChildCount();
        String r = bnyVar == null ? "none" : bnyVar.r();
        UMLinkLogInterface a2 = bpp.a();
        String message = exc == null ? "" : exc.getMessage();
        HashMap hashMap = new HashMap();
        hashMap.put("itemCount", String.valueOf(itemCount));
        hashMap.put("childCount", String.valueOf(childCount));
        a2.logError("AURAMonitor", r, "VirtualLayoutManager", null, "VirtualLayoutManagerException", message, new HashMap(), com.alibaba.android.umbrella.link.export.a.a(hashMap));
        a2.commitFailure("VirtualLayoutManager", "AURAMonitor", "1.0", "AURAMonitor", r, hashMap, "VirtualLayoutManagerException", message);
        UnifyLog.d("UltronLayoutExtend", "bizName=" + r + ",message=" + message);
    }

    @Override // tb.boz
    public RecyclerView.LayoutManager a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.LayoutManager) ipChange.ipc$dispatch("9b5f6525", new Object[]{this, context}) : this.f25953a;
    }

    @Override // tb.boz
    public void a(bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21498ee", new Object[]{this, bnvVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.b.a(bll.a(this.c.k(), bnvVar.a().f(), arrayList, this.d));
        this.b.b(arrayList);
    }

    @Override // tb.boz
    public bnn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnn) ipChange.ipc$dispatch("16b4811b", new Object[]{this}) : this.b;
    }
}
