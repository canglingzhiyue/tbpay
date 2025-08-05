package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache.a;

/* loaded from: classes7.dex */
public class lrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30878a;
    private final a b;
    private final lry c;
    private int d;

    static {
        kge.a(1790078625);
    }

    public lrw(ljs ljsVar, a aVar) {
        this.f30878a = ljsVar;
        this.b = aVar;
        this.c = new lry(ljsVar, aVar);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!d()) {
            ldf.d("SmartLoadingRequestController", "已经冷启过了 并且从磁盘中取了值");
            return false;
        } else if (!c()) {
            ldf.d("SmartLoadingRequestController", "两次请求的间隔时间小于5s");
            return false;
        } else if (!b()) {
            ldf.d("SmartLoadingRequestController", "最近两次请求response一直小于10");
            return false;
        } else if (!e()) {
            return false;
        } else {
            ldf.d("SmartLoadingRequestController", "bufferSize小于阈值，需要发请求了");
            this.c.c();
            return false;
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.c.b() < 10) {
            this.d++;
        }
        return this.d < 2;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        IConfigService iConfigService = (IConfigService) this.f30878a.a(IConfigService.class);
        if (iConfigService != null) {
            return ((float) (currentTimeMillis - this.c.a())) > iConfigService.getFloatValue("timeThreshold", 5000.0f);
        }
        ldf.d("SmartLoadingRequestController", "configService == null");
        return false;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30878a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("SmartLoadingRequestController", "containerDataService == null");
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("SmartLoadingRequestController", "containerDataModel == null");
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("SmartLoadingRequestController", "baseData == null");
            return false;
        }
        IPageDataModel mo1280getPageParams = base.mo1280getPageParams();
        if (mo1280getPageParams == null) {
            ldf.d("SmartLoadingRequestController", "pageDataModel == null");
            return false;
        } else if (mo1280getPageParams.getPageNum() != 0) {
            return true;
        } else {
            return this.b.a();
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        String a2 = this.f30878a.a().a();
        IConfigService iConfigService = (IConfigService) this.f30878a.a(IConfigService.class);
        return iConfigService != null && this.b.a(a2) < iConfigService.getIntValue("minBufferSize", 10);
    }
}
