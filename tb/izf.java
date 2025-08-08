package tb;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public class izf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<TpChargeBean> f29421a = new CopyOnWriteArrayList();

    static {
        kge.a(874640077);
        kge.a(164177695);
    }

    public static /* synthetic */ void a(izf izfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea85963", new Object[]{izfVar});
        } else {
            izfVar.e();
        }
    }

    public static /* synthetic */ void a(izf izfVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8975c054", new Object[]{izfVar, list});
        } else {
            izfVar.c(list);
        }
    }

    public izf() {
        d();
    }

    public void a(List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f29421a.addAll(list);
        }
    }

    public List<TpChargeBean> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f29421a;
    }

    public void b(final List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            AsyncTask.SERIAL_EXECUTOR.execute(new Runnable() { // from class: tb.izf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        izf.a(izf.this, list);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f29421a.clear();
        c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b(this.f29421a);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            AsyncTask.SERIAL_EXECUTOR.execute(new Runnable() { // from class: tb.izf.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        izf.a(izf.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String a2 = izh.a();
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        String a3 = izi.a(a2);
        if (StringUtils.isEmpty(a3)) {
            return;
        }
        this.f29421a.addAll(JSON.parseArray(a3, TpChargeBean.class));
    }

    private void c(List<TpChargeBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        String a2 = izh.a();
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        izi.a(a2, JSON.toJSONString(list));
    }
}
