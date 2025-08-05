package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponse;
import com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.LiveCommonIssueInteractResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;

/* loaded from: classes8.dex */
public class pfj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.a f32587a;

    /* loaded from: classes8.dex */
    public interface a {
        void a();

        void a(LiveCommonIssueInteractResponseData liveCommonIssueInteractResponseData);
    }

    static {
        kge.a(-1913029669);
    }

    public void a(LiveTimemovingModel liveTimemovingModel, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34404f43", new Object[]{this, liveTimemovingModel, aVar});
            return;
        }
        if (this.f32587a == null) {
            this.f32587a = new com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.a(new d() { // from class: tb.pfj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1677869863) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -83293931) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
                        return null;
                    } else if (hashCode != 1845393354) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onError(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], objArr[2]);
                        return null;
                    }
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, netResponse, netBaseOutDo, obj);
                    if (!(netBaseOutDo instanceof LiveCommonIssueInteractResponse)) {
                        return;
                    }
                    LiveCommonIssueInteractResponse liveCommonIssueInteractResponse = (LiveCommonIssueInteractResponse) netBaseOutDo;
                    if (liveCommonIssueInteractResponse.mo1437getData() == null) {
                        return;
                    }
                    aVar.a(liveCommonIssueInteractResponse.mo1437getData());
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    super.onError(i, netResponse, obj);
                    aVar.a();
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    super.onSystemError(i, netResponse, obj);
                    aVar.a();
                }
            });
        }
        this.f32587a.a(liveTimemovingModel);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.taolive.movehighlight.bussiness.highlight.commonIssueInteract.a aVar = this.f32587a;
        if (aVar == null) {
            return;
        }
        aVar.a();
        this.f32587a = null;
    }
}
