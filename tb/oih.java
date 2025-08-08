package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.ut.share.data.ShareData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class oih implements oiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f32088a;

    static {
        kge.a(1484028110);
        kge.a(-2068678803);
    }

    @Override // tb.oiq
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        if (map != null && map.containsKey("isSuperUser")) {
            this.f32088a = "1".equals(map.get("isSuperUser"));
        }
        TBShareContent j = e.b().j();
        ShareData shareData = new ShareData();
        shareData.setBusinessId(j.businessId);
        shareData.setTitle(j.title);
        shareData.setText(j.description);
        shareData.setLink(j.url);
        shareData.setSourceType(e.b().c());
        shareData.setUserInfo(j.activityParams);
        if (!StringUtils.isEmpty(j.imageUrl)) {
            if ((!StringUtils.isEmpty(j.imageUrl) && j.imageUrl.startsWith(k.HTTP_PREFIX)) || j.imageUrl.startsWith(k.HTTPS_PREFIX)) {
                shareData.setImageUrl(j.imageUrl);
            } else {
                shareData.setImagePath(j.imageUrl);
            }
        }
        List<String> list = j.snapshotImages;
        if ((list == null || list.size() == 0) && !StringUtils.isEmpty(j.imageUrl)) {
            list = new ArrayList<>();
            list.add(j.imageUrl);
        }
        List<String> list2 = list;
        String str2 = j.extraParams != null ? j.extraParams.get("price") : "";
        JSONObject jSONObject = j.qrConfig;
        nzb qRCodeScanEngine = ShareBizAdapter.getInstance().getShareEngine().getQRCodeScanEngine();
        if (qRCodeScanEngine == null) {
            return;
        }
        qRCodeScanEngine.a(shareData, list2, str2, jSONObject, this.f32088a);
    }
}
