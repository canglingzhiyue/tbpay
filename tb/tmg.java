package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/taobao/themis/web/external/AbsBizWebURLLoadingInterceptor;", "Lcom/taobao/themis/web/external/IWebURLLoadingInterceptor;", "bizType", "", "(Ljava/lang/String;)V", "getBizType", "themis_web_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class tmg implements tmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34213a;

    static {
        kge.a(-460218664);
        kge.a(-1656708230);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f34213a;
    }
}
