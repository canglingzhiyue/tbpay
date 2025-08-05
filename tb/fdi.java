package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.gallery.GalleryActivity;
import com.taobao.android.detail.core.detail.kit.gallery.GalleryModel;
import com.taobao.android.detail.core.model.datamodel.endorsement.EndorsementModel;
import com.taobao.android.detail.core.request.endorsement.EndorsementRequestClient;
import com.taobao.android.detail.core.request.endorsement.EndorsementRequestParams;
import com.taobao.android.detail.core.request.endorsement.EndorsementResult;
import com.taobao.android.trade.boost.request.mtop.a;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import java.util.ArrayList;
import java.util.Iterator;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes5.dex */
public class fdi implements j<fcw> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private EndorsementModel f27829a = null;
    private DetailCoreActivity b;
    private a<EndorsementResult> c;

    static {
        kge.a(-335396145);
        kge.a(-1453870097);
    }

    public static /* synthetic */ EndorsementModel a(fdi fdiVar, EndorsementModel endorsementModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EndorsementModel) ipChange.ipc$dispatch("2858017", new Object[]{fdiVar, endorsementModel});
        }
        fdiVar.f27829a = endorsementModel;
        return endorsementModel;
    }

    public static /* synthetic */ void b(fdi fdiVar, EndorsementModel endorsementModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be88c01c", new Object[]{fdiVar, endorsementModel});
        } else {
            fdiVar.a(endorsementModel);
        }
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fcw fcwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fcwVar}) : a(fcwVar);
    }

    public fdi(DetailCoreActivity detailCoreActivity) {
        this.b = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.dinamic.OpenEndorsementSubscriber");
    }

    public i a(fcw fcwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("f28e6fb1", new Object[]{this, fcwVar});
        }
        EndorsementModel endorsementModel = this.f27829a;
        if (endorsementModel != null) {
            a(endorsementModel);
            return i.SUCCESS;
        }
        this.c = new a<EndorsementResult>() { // from class: tb.fdi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* bridge */ /* synthetic */ void onFailure(MtopResponse mtopResponse) {
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                } else {
                    a((EndorsementResult) obj);
                }
            }

            public void a(EndorsementResult endorsementResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("23fbc772", new Object[]{this, endorsementResult});
                    return;
                }
                fdi.a(fdi.this, endorsementResult.result);
                fdi.b(fdi.this, endorsementResult.result);
            }
        };
        new EndorsementRequestClient().execute(new EndorsementRequestParams(this.b.y().t.h()), this.c, epo.f());
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void a(EndorsementModel endorsementModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caff402", new Object[]{this, endorsementModel});
        } else if (endorsementModel == null || endorsementModel.endorsements == null || endorsementModel.endorsements.isEmpty()) {
        } else {
            ArrayList<EndorsementModel.EndorsementItem> arrayList = endorsementModel.endorsements;
            ArrayList arrayList2 = new ArrayList();
            Iterator<EndorsementModel.EndorsementItem> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(a(it.next(), endorsementModel.instruction, endorsementModel.icon));
            }
            GalleryActivity.a(this.b, arrayList2);
        }
    }

    private GalleryModel a(EndorsementModel.EndorsementItem endorsementItem, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GalleryModel) ipChange.ipc$dispatch("7263126", new Object[]{this, endorsementItem, str, str2});
        }
        GalleryModel galleryModel = new GalleryModel();
        galleryModel.title = endorsementItem.title + riy.BRACKET_START_STR + endorsementItem.language + riy.BRACKET_END_STR;
        galleryModel.picPath = endorsementItem.filePath;
        galleryModel.desc = str;
        galleryModel.headDescPicPath = str2;
        return galleryModel;
    }
}
