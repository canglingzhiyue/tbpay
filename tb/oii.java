package tb;

import android.text.TextUtils;
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
public class oii implements oiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32089a = "qrcode";
    private boolean b;

    static {
        kge.a(2067711153);
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
            this.b = "1".equals(map.get("isSuperUser"));
        }
        if (nyg.h()) {
            this.f32089a = "qrcode";
        } else {
            this.f32089a = nym.TYPE_GEN3_CODE;
        }
        TBShareContent j = e.b().j();
        ShareData shareData = new ShareData();
        shareData.setBusinessId(j.businessId);
        shareData.setTitle(j.title);
        shareData.setText(j.description);
        shareData.setLink(j.url);
        shareData.setSourceType(e.b().c());
        shareData.setUserInfo(j.activityParams);
        if (!TextUtils.isEmpty(j.imageUrl)) {
            if ((!TextUtils.isEmpty(j.imageUrl) && j.imageUrl.startsWith(k.HTTP_PREFIX)) || j.imageUrl.startsWith(k.HTTPS_PREFIX)) {
                shareData.setImageUrl(j.imageUrl);
            } else {
                shareData.setImagePath(j.imageUrl);
            }
        }
        List<String> list = j.snapshotImages;
        if ((list == null || list.size() == 0) && !TextUtils.isEmpty(j.imageUrl)) {
            list = new ArrayList<>();
            list.add(j.imageUrl);
        }
        List<String> list2 = list;
        String str2 = j.extraParams != null ? j.extraParams.get("price") : "";
        JSONObject jSONObject = j.qrConfig;
        nzf tLongPicEngine = ShareBizAdapter.getInstance().getShareEngine().getTLongPicEngine();
        if (tLongPicEngine == null) {
            return;
        }
        tLongPicEngine.a(j, shareData, list2, str2, jSONObject, j.headUrl, j.disableQrcode, j.disableTextInfo, this.f32089a, this.b);
    }
}
