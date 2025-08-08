package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.db.DXDataBaseHelper;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class fwh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile DXDataBaseHelper f28152a;
    private String b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fwh f28153a;

        static {
            kge.a(-895103832);
            f28153a = new fwh();
        }

        public static /* synthetic */ fwh a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fwh) ipChange.ipc$dispatch("f04ce47", new Object[0]) : f28153a;
        }
    }

    static {
        kge.a(-801684449);
    }

    private fwh() {
        this.b = "DinamicX_db";
    }

    public static fwh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fwh) ipChange.ipc$dispatch("f04ce47", new Object[0]) : a.a();
    }

    public synchronized void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
            return;
        }
        if (context != null && !StringUtils.isEmpty(str)) {
            this.b = str2;
            if (this.f28152a == null) {
                this.f28152a = new DXDataBaseHelper(context, str, str2);
            }
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f28152a == null) {
            a(DinamicXEngine.i(), "dinamicx", this.b);
        }
        if (this.f28152a != null) {
            return true;
        }
        a(DXMonitorConstant.DX_MONITOR_DB_OPEN, s.DX_DB_NULL, "dXDataBaseHelper == null");
        return false;
    }

    public void a(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df0205b", new Object[]{this, str, dXTemplateItem});
            return;
        }
        long nanoTime = System.nanoTime();
        if (b()) {
            this.f28152a.store(str, dXTemplateItem);
        }
        a(DXMonitorConstant.DX_MONITOR_DB_STORE, str, dXTemplateItem, System.nanoTime() - nanoTime);
    }

    public void b(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc8ddc", new Object[]{this, str, dXTemplateItem});
            return;
        }
        long nanoTime = System.nanoTime();
        if (b()) {
            this.f28152a.delete(str, dXTemplateItem);
        }
        a(DXMonitorConstant.DX_MONITOR_DB_DELETE, str, dXTemplateItem, System.nanoTime() - nanoTime);
    }

    public boolean a(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{this, str, list})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (b()) {
            z = this.f28152a.delete(str, list);
        }
        a(DXMonitorConstant.DX_MONITOR_DB_DELETE, str, null, System.nanoTime() - nanoTime);
        return z;
    }

    public LinkedList<DXTemplateItem> c(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("8d8b7cf1", new Object[]{this, str, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        if (b()) {
            return this.f28152a.query(str, dXTemplateItem);
        }
        a(DXMonitorConstant.DX_MONITOR_DB_QUERY, str, dXTemplateItem, System.nanoTime() - nanoTime);
        return null;
    }

    public LinkedList<DXTemplateItem> d(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("faf83a10", new Object[]{this, str, dXTemplateItem});
        }
        long nanoTime = System.nanoTime();
        if (b()) {
            return this.f28152a.queryWithDirtyColumn(str, dXTemplateItem);
        }
        a(DXMonitorConstant.DX_MONITOR_DB_QUERY, str, dXTemplateItem, System.nanoTime() - nanoTime);
        return null;
    }

    public boolean b(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aab2c68", new Object[]{this, str, list})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        if (b()) {
            z = this.f28152a.updateTemplatesDirty(str, list);
        }
        a(DXMonitorConstant.DX_MONITOR_DB_UPDATE, str, null, System.nanoTime() - nanoTime);
        return z;
    }

    private void a(String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466a1f3f", new Object[]{this, str, str2, dXTemplateItem, new Long(j)});
        } else {
            b.a(2, str2, DXMonitorConstant.DX_MONITOR_DB, str, dXTemplateItem, (Map<String, String>) null, j, true);
        }
    }

    private void a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        s sVar = new s(this.b);
        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_DB, str, i);
        aVar.e = str2;
        sVar.c = new ArrayList();
        sVar.c.add(aVar);
        b.a(sVar);
    }
}
