package tb;

import android.app.Activity;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.share.globalmodel.e;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class fhg implements j<fhf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f27942a;

    static {
        kge.a(-1367826353);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(fhf fhfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, fhfVar}) : a(fhfVar);
    }

    public fhg(Activity activity) {
        this.f27942a = activity;
    }

    public i a(fhf fhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("8b06733b", new Object[]{this, fhfVar});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "1";
        shareContent.description = fhfVar.b.f27941a;
        shareContent.snapshotImages = fhfVar.b.b;
        Uri.Builder buildUpon = Uri.parse(e.NAV_URL_DETAIL_BASE + fhfVar.b.d + ".htm").buildUpon();
        if (fhfVar.f27940a != null) {
            for (Map.Entry<String, String> entry : fhfVar.f27940a.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        } else {
            buildUpon.appendQueryParameter("price", fhfVar.b.c);
            buildUpon.appendQueryParameter("original_price", fhfVar.b.e);
        }
        buildUpon.appendQueryParameter("sourceType", "item");
        shareContent.url = buildUpon.toString();
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.templateId = "detail";
        HashMap hashMap = new HashMap();
        hashMap.put("price", fhfVar.b.c);
        shareContent.extendParams = hashMap;
        if (fhfVar.b.b != null && fhfVar.b.b.size() > 0) {
            shareContent.imageUrl = fhfVar.b.b.get(0);
        }
        ShareBusiness.share(this.f27942a, "想告诉谁", shareContent);
        return null;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
