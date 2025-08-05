package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.messiah.model.TbHRLogModel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class kyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<TbHRLogModel> f30404a = new CopyOnWriteArrayList();
    private final List<TbHRLogModel> b = new CopyOnWriteArrayList();

    static {
        kge.a(1918400160);
    }

    public void a(TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6650aaf", new Object[]{this, tbHRLogModel});
            return;
        }
        if (this.f30404a.size() >= 1000) {
            List<TbHRLogModel> list = this.f30404a;
            list.removeAll(list.subList(0, 100));
        }
        this.f30404a.add(tbHRLogModel);
    }

    public void a(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        if (this.f30404a.size() >= 1000) {
            List<TbHRLogModel> list2 = this.f30404a;
            list2.removeAll(list2.subList(0, 100));
        }
        this.f30404a.addAll(list);
    }

    public void b(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        if (this.b.size() >= 1000) {
            List<TbHRLogModel> list2 = this.b;
            list2.removeAll(list2.subList(0, 100));
        }
        this.b.addAll(list);
    }

    public void b(TbHRLogModel tbHRLogModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("639fbc30", new Object[]{this, tbHRLogModel});
            return;
        }
        if (this.b.size() >= 1000) {
            List<TbHRLogModel> list = this.b;
            list.removeAll(list.subList(0, 100));
        }
        this.b.add(tbHRLogModel);
    }

    public List<TbHRLogModel> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f30404a;
    }

    public List<TbHRLogModel> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
    }

    public void c(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (this.f30404a.isEmpty()) {
            ldf.d("TbHRLogDataPool", "日志存储里为空");
        } else if (list == null || list.isEmpty()) {
            ldf.d("TbHRLogDataPool", "removeLogList 需要移除的数据是空");
        } else {
            this.f30404a.removeAll(list);
            ldf.d("TbHRLogDataPool", "removeLogList,当前的list的条数是：" + this.f30404a.size());
        }
    }

    public void d(List<TbHRLogModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
        } else if (this.b.isEmpty()) {
        } else {
            if (list == null || list.isEmpty()) {
                ldf.d("TbHRLogDataPool", "removeMonitorList 需要移除的数据是空");
                return;
            }
            this.b.removeAll(list);
            ldf.d("TbHRLogDataPool", "removeMonitorList,当前的list的条数是：" + this.b.size());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (!this.f30404a.isEmpty()) {
            this.f30404a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }
}
