package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.datasdk.protocol.model.share.ShareModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.share.globalmodel.e;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class fdt implements j<eoi> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<String> f27846a = null;
    private String b;
    private DetailCoreActivity c;
    private HashMap<String, String> d;

    static {
        kge.a(1957325811);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eoi eoiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eoiVar}) : a(eoiVar);
    }

    public fdt(DetailCoreActivity detailCoreActivity) {
        this.c = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.title.ShareSubscriber");
    }

    public i a(eoi eoiVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("a63f3ed6", new Object[]{this, eoiVar});
        }
        DetailCoreActivity detailCoreActivity = this.c;
        dya y = detailCoreActivity.y();
        if (y == null) {
            com.taobao.android.detail.core.utils.i.a("[share][title]ShareSubscriber", "controller null");
            return a.FAILURE;
        }
        c cVar = y.t;
        if (cVar == null) {
            com.taobao.android.detail.core.utils.i.a("[share][title]ShareSubscriber", "nodeBundleWrapper null");
            return a.FAILURE;
        }
        b bVar = cVar.f10055a;
        ResourceNode l = eqb.l(bVar);
        if (l.share != null && l.share.c != null) {
            this.d = l.share.c;
        }
        this.f27846a = new ArrayList();
        String i = cVar.i();
        this.b = cVar.k();
        String str3 = eqb.m(bVar).price.priceText;
        String str4 = null;
        if (eoiVar.b == null || !eoiVar.b.containsKey("share_businessId") || !eoiVar.b.containsKey("share_imageUrl")) {
            str = null;
        } else {
            str4 = eoiVar.b.remove("share_businessId");
            str = eoiVar.b.remove("share_imageUrl");
        }
        PriceNode.PriceData extraPriceByType = eqb.m(bVar).getExtraPriceByType(2);
        String str5 = e.NAV_URL_DETAIL_BASE + i + ".htm";
        String b = fgp.b(bVar);
        com.taobao.android.detail.core.utils.i.d("[share][title]ShareSubscriber", "ShareSubscriber serverShareUrl = " + b);
        if (TextUtils.isEmpty(b)) {
            b = str5;
        }
        Uri.Builder buildUpon = Uri.parse(b).buildUpon();
        if (!TextUtils.isEmpty(str3)) {
            buildUpon.appendQueryParameter("price", str3);
        }
        if (extraPriceByType != null) {
            buildUpon.appendQueryParameter("original_price", extraPriceByType.priceText);
        }
        buildUpon.appendQueryParameter("sourceType", "item");
        if (eoiVar != null && eoiVar.b != null) {
            for (Map.Entry<String, String> entry : eoiVar.b.entrySet()) {
                if (entry != null) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        String builder = buildUpon.toString();
        if (cVar.d()) {
            str2 = detailCoreActivity.getResources().getString(R.string.notice_share_juhuasuan) + this.b + detailCoreActivity.getResources().getString(R.string.notice_share_tair);
        } else {
            str2 = this.b;
        }
        ShareModel shareModel = new ShareModel();
        shareModel.link = builder;
        shareModel.price = str3;
        if (TitleViewModel.ShareType.SHARE_TYPE_AWARD == eoiVar.f27500a) {
            shareModel.title = " 想告诉谁";
            shareModel.msg = String.format(Locale.CHINA, "我剁手都要买的宝贝（%s），快来和我一起瓜分红包", this.b);
            shareModel.isActivity = "true";
            shareModel.businessId = "baobeixiangqingfenxiang";
        } else {
            shareModel.msg = str2;
            shareModel.title = "想告诉谁";
        }
        try {
            if (eqb.l(bVar).share.c.containsKey("bizId") && !TextUtils.isEmpty(eqb.l(bVar).share.c.get("bizId"))) {
                shareModel.businessId = eqb.l(bVar).share.c.get("bizId");
            }
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("[share][title]ShareSubscriber", "handleEvent: 获取bizId过程中发生错误, exception: ", e);
        }
        this.f27846a.addAll(eqb.c(bVar).images);
        if (TextUtils.isEmpty(shareModel.businessId) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str)) {
            shareModel.businessId = str4;
            this.f27846a.remove(str);
            this.f27846a.add(0, str);
        }
        String a2 = fgp.a(bVar);
        if (!TextUtils.isEmpty(a2) && TextUtils.isEmpty(shareModel.businessId)) {
            shareModel.businessId = a2;
        }
        shareModel.picUrlList = this.f27846a;
        epr.a(this.c, shareModel, this.d);
        StringBuilder sb = new StringBuilder();
        sb.append("shareItem:");
        sb.append(JSON.toJSONString(shareModel));
        sb.append(", activityParams:");
        sb.append(this.d);
        com.taobao.android.detail.core.utils.i.d("[share][title]ShareSubscriber", sb.toString() == null ? "null" : JSON.toJSONString(this.d));
        return a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
