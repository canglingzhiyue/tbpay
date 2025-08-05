package tb;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.model.constant.DetailConstants;
import com.taobao.android.detail.core.event.a;
import com.taobao.android.detail.core.event.video.c;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.node.AskAllNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.wrapper.ext.component.actionbar.TaoDetailActionBarV3;
import com.taobao.android.nav.Nav;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.f;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.d;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.feu;

/* loaded from: classes5.dex */
public class fdf implements j<enz>, RateFeedsFragment.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DETAIL_COMMENT_FRAGMENT_TAG = "DetailCommentFragment";
    public static final String TAG = "Comment";

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f27824a;
    private String b;
    private boolean c = true;

    static {
        kge.a(-156442411);
        kge.a(-1453870097);
        kge.a(599563176);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(enz enzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, enzVar}) : a(enzVar);
    }

    public fdf(DetailCoreActivity detailCoreActivity) {
        this.f27824a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.comment.OpenCommentViewSubscriber");
    }

    public i a(enz enzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("9311adc8", new Object[]{this, enzVar});
        }
        DetailCoreActivity detailCoreActivity = this.f27824a;
        if (detailCoreActivity == null) {
            return i.FAILURE;
        }
        dya y = detailCoreActivity.y();
        if (y == null) {
            return i.FAILURE;
        }
        if (this.f27824a.m() && eiq.h) {
            Toast.makeText(this.f27824a, "信息加载中,客官请稍等", 0).show();
            return i.FAILURE;
        }
        com.taobao.android.detail.core.utils.i.a(TAG, "[handleEvent] switchToRateFeeds");
        a(y, enzVar.f27485a, enzVar);
        c.d(this.f27824a, null);
        return a.SUCCESS;
    }

    private JSONObject a(b bVar, enz enzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5fd9801", new Object[]{this, bVar, enzVar});
        }
        JSONObject jSONObject = new JSONObject();
        if (bVar != null && eqb.k(bVar) != null && eqb.k(bVar).rateExtParams != null) {
            jSONObject.putAll(eqb.k(bVar).rateExtParams);
        }
        if (enzVar.a() != null) {
            jSONObject.putAll(enzVar.a());
        }
        return jSONObject;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            jSONObject2 = new JSONObject(jSONObject);
        } else {
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put("jutrack_Ab", (Object) (fgt.a(this.f27824a) ? "true" : "false"));
        return jSONObject2;
    }

    private void a(dya dyaVar, RateNode.RateKeyword rateKeyword, enz enzVar) {
        Bundle bundle;
        Uri a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25055aa0", new Object[]{this, dyaVar, rateKeyword, enzVar});
            return;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = dyaVar.t;
        if (cVar == null) {
            return;
        }
        boolean b = s.b();
        if (b && (a2 = a((bundle = new Bundle()), cVar, enzVar, rateKeyword)) != null) {
            Nav.from(this.f27824a).withExtras(bundle).toUri(a2);
            return;
        }
        long s = cVar.s();
        this.b = "评价";
        if (s > 0) {
            this.b += riy.BRACKET_START_STR + s + riy.BRACKET_END_STR;
        }
        DetailCoreActivity detailCoreActivity = this.f27824a;
        if (detailCoreActivity != null) {
            detailCoreActivity.b(true);
        }
        Fragment a3 = a(cVar, s, enzVar, rateKeyword).a();
        FragmentManager supportFragmentManager = this.f27824a.getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (b) {
            Bundle arguments = a3.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
                a3.setArguments(arguments);
            }
            arguments.putBoolean("adaptByViewSize", true);
            View findViewById = this.f27824a.findViewById(R.id.fl_detail_fragment);
            if (findViewById != null) {
                findViewById.setPadding(iuy.f29328a - iuy.d, 0, 0, 0);
            }
        }
        beginTransaction.add(R.id.fl_detail_fragment, a3, "DetailCommentFragment");
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
        try {
            supportFragmentManager.executePendingTransactions();
        } catch (IllegalStateException e) {
            epp.a(e);
        }
        dyaVar.m = a3;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!(this.f27824a.r() instanceof TaoDetailActionBarV3)) {
        } else {
            TaoDetailActionBarV3 taoDetailActionBarV3 = (TaoDetailActionBarV3) this.f27824a.r();
            taoDetailActionBarV3.setIsRateFragmentShown(true);
            taoDetailActionBarV3.showActionBarTitle(true);
            taoDetailActionBarV3.showElevatorView(false);
        }
    }

    private Uri a(Bundle bundle, com.taobao.android.detail.datasdk.model.datamodel.node.c cVar, enz enzVar, RateNode.RateKeyword rateKeyword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("8d449aa0", new Object[]{this, bundle, cVar, enzVar, rateKeyword});
        }
        try {
            Uri.Builder path = new Uri.Builder().scheme("https").authority("h5.m.taobao.com").path("/ratedisplay/vivid_ratelist.htm");
            path.appendQueryParameter("itemId", cVar.i());
            path.appendQueryParameter("shopId", cVar.o());
            path.appendQueryParameter("sellerId", cVar.h());
            path.appendQueryParameter("feedId", String.valueOf(enzVar.d));
            path.appendQueryParameter("invokeSource", String.valueOf(enzVar.f));
            path.appendQueryParameter("skuvids", enzVar.c);
            path.appendQueryParameter("exParams", a(enzVar.e).toString());
            try {
                path.appendQueryParameter("skuInfo", eqb.i(cVar.f10055a).getOriginalData().toString());
            } catch (Exception unused) {
            }
            if (cVar.r() != null) {
                AskAllNode r = cVar.r();
                if (r.getData() != null) {
                    path.appendQueryParameter("askInfo", r.getData().toString());
                }
            }
            List<RateNode.RateKeyword> list = enzVar.b;
            if (list == null || list.isEmpty()) {
                list = cVar.t();
            }
            JSONArray jSONArray = new JSONArray();
            for (RateNode.RateKeyword rateKeyword2 : list) {
                RateKeyword rateKeyword3 = new RateKeyword();
                rateKeyword3.count = rateKeyword2.b;
                rateKeyword3.attribute = rateKeyword2.c;
                rateKeyword3.word = rateKeyword2.f9993a;
                rateKeyword3.type = rateKeyword2.d.ordinal();
                rateKeyword3.status = rateKeyword2.i;
                rateKeyword3.level = rateKeyword2.f;
                rateKeyword3.attributeId = rateKeyword2.g;
                rateKeyword3.subImprList = rateKeyword2.e;
                try {
                    rateKeyword3.setRateType(Integer.parseInt(rateKeyword2.h));
                } catch (Exception unused2) {
                    com.taobao.android.detail.core.utils.i.a(TAG, "[getRateFeedsManger] setRateType parseInt");
                }
                jSONArray.add(rateKeyword3);
            }
            bundle.putSerializable("rateKeywordList", jSONArray);
            if (rateKeyword != null) {
                path.appendQueryParameter("expression", rateKeyword.c);
            }
            path.appendQueryParameter("rateExtParams", a(cVar.f10055a, enzVar).toJSONString());
            if (rateKeyword != null) {
                path.appendQueryParameter("selectTag", rateKeyword.f9993a);
            }
            return path.build();
        } catch (Exception unused3) {
            com.taobao.android.detail.core.utils.i.a(TAG, "[getRateFeedsUri] Exception");
            return null;
        }
    }

    private d a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar, long j, enz enzVar, RateNode.RateKeyword rateKeyword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6d7e543a", new Object[]{this, cVar, new Long(j), enzVar, rateKeyword});
        }
        d dVar = new d();
        RateInfo.a b = new RateInfo.a().a(cVar.i()).b(cVar.o());
        RateInfo.a e = b.e("" + cVar.p());
        RateInfo.a g = e.d("" + j).g(cVar.h());
        g.a(enzVar.d);
        g.a(enzVar.f);
        g.h(enzVar.c);
        g.e(a(enzVar.e));
        try {
            g.i(eqb.c(cVar.f10055a).groupId);
        } catch (Throwable unused) {
        }
        try {
            g.c(eqb.i(cVar.f10055a).getOriginalData()).d(a(cVar));
        } catch (Exception unused2) {
        }
        if (cVar.r() != null) {
            g.b(cVar.r().getData());
        }
        List<RateNode.RateKeyword> list = enzVar.b;
        if (list == null || list.isEmpty()) {
            list = cVar.t();
        }
        ArrayList arrayList = new ArrayList();
        for (RateNode.RateKeyword rateKeyword2 : list) {
            RateKeyword rateKeyword3 = new RateKeyword();
            rateKeyword3.count = rateKeyword2.b;
            rateKeyword3.attribute = rateKeyword2.c;
            rateKeyword3.word = rateKeyword2.f9993a;
            rateKeyword3.type = rateKeyword2.d.ordinal();
            rateKeyword3.status = rateKeyword2.i;
            rateKeyword3.level = rateKeyword2.f;
            rateKeyword3.attributeId = rateKeyword2.g;
            rateKeyword3.subImprList = rateKeyword2.e;
            try {
                rateKeyword3.setRateType(Integer.parseInt(rateKeyword2.h));
            } catch (Exception unused3) {
                com.taobao.android.detail.core.utils.i.a(TAG, "[getRateFeedsManger] setRateType parseInt");
            }
            arrayList.add(rateKeyword3);
        }
        g.a(arrayList);
        if (rateKeyword != null) {
            g.c(rateKeyword.c);
        }
        g.a(a(cVar.f10055a, enzVar));
        g.f(rateKeyword == null ? null : rateKeyword.f9993a);
        dVar.a(g.b());
        dVar.a(this);
        return dVar;
    }

    private JSONObject a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ce26be81", new Object[]{this, cVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("itemId", (Object) cVar.i());
        jSONObject.put("title", (Object) cVar.k());
        jSONObject.put("image", (Object) cVar.u());
        jSONObject.put("exParams", (Object) eqb.c(cVar.f10055a).exParams);
        return jSONObject;
    }

    @Override // com.taobao.detail.rate.RateFeedsFragment.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f27824a;
        if (detailCoreActivity == null || detailCoreActivity.isFinishing()) {
            return;
        }
        Handler A = this.f27824a.A();
        if (A != null) {
            Message obtain = Message.obtain();
            obtain.what = 257;
            obtain.obj = DetailConstants.ResizeBarArg.HEAD_MODE;
            A.sendMessage(obtain);
            Message obtain2 = Message.obtain();
            obtain2.what = 258;
            obtain2.obj = Float.valueOf(1.0f);
            A.sendMessage(obtain2);
        }
        f.a(this.f27824a).a(new feu.a(false));
    }

    @Override // com.taobao.detail.rate.RateFeedsFragment.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f27824a;
        if (detailCoreActivity == null || detailCoreActivity.isFinishing()) {
            return;
        }
        Handler A = this.f27824a.A();
        if (A != null) {
            Message message = new Message();
            message.what = 257;
            message.obj = DetailConstants.ResizeBarArg.FULL_MODE;
            A.sendMessage(message);
            A.sendEmptyMessage(258);
        }
        f.a(this.f27824a).a(new feu.a(true));
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
