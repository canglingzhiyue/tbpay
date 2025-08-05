package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache.a;
import java.util.List;

/* loaded from: classes7.dex */
public class lrv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lrx f30877a;
    private lru b;
    private a c;
    private ljs d;
    private boolean e;
    private boolean f;
    private boolean g;
    private IContainerDataService<?> h;
    private IMainFeedsViewService<?> i;

    static {
        kge.a(-1632027889);
    }

    public lrv(ljs ljsVar, a aVar) {
        this.d = ljsVar;
        this.c = aVar;
        this.f30877a = new lrx(ljsVar, this.c);
        this.b = new lru(ljsVar);
        this.i = (IMainFeedsViewService) this.d.a(IMainFeedsViewService.class);
        this.h = (IContainerDataService) this.d.a(IContainerDataService.class);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!"scrollNextPage".equals(str) || !this.f) {
        } else {
            e();
            this.f = false;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e = false;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        int d = d();
        if (a(d, i, this.g)) {
            ldf.d("SmartLoadingInsertCardController", "检查下是否需要从磁盘中获取数据了，当前的页码是：" + d);
            b(d);
        }
        if (!a(d, i)) {
            return;
        }
        this.f30877a.a(this.b.a(), i, d);
        this.f = true;
    }

    private boolean a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2619b910", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)})).booleanValue() : i == 0 && !z && c() - i2 == 6;
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.i;
        if (iMainFeedsViewService == null) {
            ldf.d("SmartLoadingInsertCardController", "mainFeedsViewService == null");
            return -1;
        }
        return iMainFeedsViewService.getItemCount();
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        int c = c();
        int b = this.b.b();
        if (i == 0 && c - i2 == 2 && !this.e) {
            ldf.d("SmartLoadingInsertCardController", "需要插卡了，当前的位置是：" + i2 + "当前totalSize是：" + c);
            return true;
        } else if (c - i2 != b || this.e) {
            return false;
        } else {
            ldf.d("SmartLoadingInsertCardController", "需要插卡了，当前的位置是：" + i2 + "当前totalSize是：" + c);
            return true;
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        String f = f();
        if (this.c.a(f) >= 10) {
            return;
        }
        ldf.d("SmartLoadingInsertCardController", "前面几屏且当前内存中的卡片个数小于10，异步从磁盘中取值");
        this.c.a(f, this.b.c());
        if (i != 0) {
            return;
        }
        this.g = true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        IContainerDataService<?> iContainerDataService = this.h;
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingInsertCardController", "containerDataService == null");
            return -1;
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData == 0) {
            ldf.d("SmartLoadingInsertCardController", "containerData == null");
            return -1;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("SmartLoadingInsertCardController", "baseData == null");
            return -1;
        }
        IPageDataModel mo1280getPageParams = base.mo1280getPageParams();
        if (mo1280getPageParams == null) {
            ldf.d("SmartLoadingInsertCardController", "pageParams == null");
            return -1;
        }
        return mo1280getPageParams.getPageNum();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String f = f();
        List<BaseSectionModel<?>> b = this.c.b(f);
        ldf.d("SmartLoadingInsertCardController", "翻页请求回来更新磁盘,当前的数据大小是： " + b.size());
        this.c.b(f, b.subList(0, Math.min(b.size(), 100)));
    }

    private String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.d.a().a();
    }
}
