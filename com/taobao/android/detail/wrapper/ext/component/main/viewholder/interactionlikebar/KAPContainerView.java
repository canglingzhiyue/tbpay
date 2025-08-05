package com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.datasdk.protocol.adapter.core.d;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.request.KAPRemoveClient;
import com.taobao.android.detail.wrapper.request.KAPRemoveLikeRequestParams;
import com.taobao.android.detail.wrapper.request.KAPThumbUpClient;
import com.taobao.android.detail.wrapper.request.size.model.KAPThumbUpRequestParams;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.fcc;
import tb.fpz;
import tb.gbk;
import tb.kge;

/* loaded from: classes5.dex */
public class KAPContainerView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_COLOR = -6710887;
    public static final int DEFAULT_MENU_COLOR = -10066330;
    public static final int LIKE_COLOR = -45056;
    public static final int LIKE_MENU_COLOR = -45056;
    private static final String TAG = "KAPContainerView";
    private fcc.b currSelectItem;
    private TUrlImageView firstIconIV;
    private fcc.b firstItem;
    private TextView firstTitleTV;
    private int highlightMenuColor;
    private int highlightTextColor;
    private boolean isEnterLiked;
    private int normalMenuColor;
    private int normalTextColor;
    private KAPPopupView popupView;
    private PopupWindow popupWindow;
    private fcc.b tmpSelectItem;
    private fcc viewModel;

    static {
        kge.a(-797325566);
    }

    public static /* synthetic */ Object ipc$super(KAPContainerView kAPContainerView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ fcc access$000(KAPContainerView kAPContainerView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fcc) ipChange.ipc$dispatch("8fdd9318", new Object[]{kAPContainerView}) : kAPContainerView.viewModel;
    }

    public static /* synthetic */ void access$100(KAPContainerView kAPContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9edd47", new Object[]{kAPContainerView});
        } else {
            kAPContainerView.performClickOfFirst();
        }
    }

    public static /* synthetic */ void access$200(KAPContainerView kAPContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d0cea6", new Object[]{kAPContainerView});
        } else {
            kAPContainerView.showPopupWindowUT();
        }
    }

    public static /* synthetic */ void access$300(KAPContainerView kAPContainerView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6debd28f", new Object[]{kAPContainerView, str});
        } else {
            kAPContainerView.otherButtonClickUT(str);
        }
    }

    public KAPContainerView(Context context) {
        this(context, null);
    }

    public KAPContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KAPContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.normalTextColor = -6710887;
        this.highlightTextColor = -45056;
        this.normalMenuColor = DEFAULT_MENU_COLOR;
        this.highlightMenuColor = -45056;
        LayoutInflater.from(context).inflate(R.layout.x_detail_main_interaction_bar_like, this);
        setOrientation(0);
        setBackgroundColor(-1);
        View findViewById = findViewById(R.id.detail_first_layout);
        this.firstIconIV = (TUrlImageView) findViewById(R.id.detail_first_iv);
        this.firstTitleTV = (TextView) findViewById(R.id.detail_first_tv);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TStudioHelper.a().a(DXRootView.class, view, KAPContainerView.access$000(KAPContainerView.this), false)) {
                } else {
                    d c = epj.c();
                    if (!c.b()) {
                        c.a(true);
                        return;
                    }
                    KAPContainerView.access$100(KAPContainerView.this);
                    KAPContainerView.access$200(KAPContainerView.this);
                }
            }
        });
        findViewById.setContentDescription("点赞");
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView");
    }

    private void performClickOfFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfe19f9", new Object[]{this});
            return;
        }
        fcc.b bVar = this.currSelectItem;
        if (bVar == null) {
            try {
                bVar = this.viewModel.f27782a.f27785a.get(0);
            } catch (Throwable unused) {
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.f27784a = !bVar.f27784a;
        int i = this.viewModel.f27782a.b;
        if (!bVar.f27784a) {
            this.tmpSelectItem = null;
            if (!this.isEnterLiked) {
                this.firstTitleTV.setText(likeCountDesc(i));
            } else {
                this.firstTitleTV.setText(likeCountDesc(i - 1));
            }
            this.firstIconIV.setImageUrl(this.firstItem.b);
            this.firstTitleTV.setTextColor(this.normalTextColor);
        } else {
            this.tmpSelectItem = bVar;
            if (!this.isEnterLiked) {
                this.firstTitleTV.setText(likeCountDesc(i + 1));
            } else {
                this.firstTitleTV.setText(likeCountDesc(i));
            }
            this.firstIconIV.setImageUrl(this.firstItem.c);
            this.firstTitleTV.setTextColor(this.highlightTextColor);
            attitudeClickUT(bVar.e);
        }
        sendLikeRequest();
    }

    private void sendLikeRequest() {
        fcc.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e9a2d7", new Object[]{this});
            return;
        }
        fcc.b bVar2 = this.tmpSelectItem;
        if (bVar2 != null) {
            thumbUp(bVar2.e);
            this.currSelectItem = this.tmpSelectItem;
        }
        if (this.tmpSelectItem != null || (bVar = this.currSelectItem) == null) {
            return;
        }
        removeLike(bVar.e);
        this.currSelectItem = null;
    }

    public void setNormalTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e3172f", new Object[]{this, new Integer(i)});
        } else {
            this.normalTextColor = i;
        }
    }

    public void setHighlightTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f711df8", new Object[]{this, new Integer(i)});
        } else {
            this.highlightTextColor = i;
        }
    }

    public void setNormalMenuColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43c6d0e1", new Object[]{this, new Integer(i)});
        } else {
            this.normalMenuColor = i;
        }
    }

    public void setHighlightMenuColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba54d7aa", new Object[]{this, new Integer(i)});
        } else {
            this.highlightMenuColor = i;
        }
    }

    public void bindData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde2ba22", new Object[]{this, jSONObject});
            return;
        }
        fcc fccVar = new fcc();
        JSONObject jSONObject2 = jSONObject.getJSONObject("kapContain");
        if (jSONObject2 != null) {
            fccVar.f27782a = new fcc.c();
            JSONArray jSONArray = jSONObject2.getJSONArray("kaplist");
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList(jSONArray.size());
                for (int i = 0; i < jSONArray.size(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONObject) {
                        fcc.b bVar = new fcc.b();
                        JSONObject jSONObject3 = (JSONObject) obj;
                        bVar.b = jSONObject3.getString("icon");
                        bVar.c = jSONObject3.getString("selectIcon");
                        bVar.f27784a = jSONObject3.getBooleanValue(gbk.TYPE_SELECTED);
                        bVar.d = jSONObject3.getString("title");
                        bVar.e = jSONObject3.getString("key");
                        arrayList.add(bVar);
                    }
                }
                fccVar.f27782a.f27785a = arrayList;
            }
            fccVar.f27782a.b = jSONObject2.getIntValue("count");
            fccVar.f27782a.c = jSONObject2.getString("likeList");
            fccVar.f27782a.d = jSONObject2.getString(Constants.Name.SUFFIX);
            if (fccVar.f27782a.d == null) {
                fccVar.f27782a.d = "";
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(com.taobao.android.weex_framework.util.a.ATOM_EXT_bubbles);
        if (jSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList(jSONArray2.size());
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                Object obj2 = jSONArray2.get(i2);
                if (obj2 instanceof JSONObject) {
                    fcc.a aVar = new fcc.a();
                    JSONObject jSONObject4 = (JSONObject) obj2;
                    aVar.b = jSONObject4.getString("icon");
                    aVar.f27783a = jSONObject4.getString("title");
                    aVar.c = jSONObject4.getString("action");
                    arrayList2.add(aVar);
                }
            }
            fccVar.b = arrayList2;
        }
        setViewModel(fccVar);
    }

    public void setViewModel(final fcc fccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1bed33", new Object[]{this, fccVar});
        } else if (fccVar == null || fccVar.f27782a == null || fccVar.f27782a.f27785a == null || fccVar.f27782a.f27785a.size() <= 0) {
        } else {
            View findViewById = findViewById(R.id.detail_second_layout);
            if (fccVar.b != null && fccVar.b.size() > 0) {
                final fcc.a aVar = fccVar.b.get(0);
                findViewById.setVisibility(0);
                ((TUrlImageView) findViewById(R.id.detail_second_iv)).setImageUrl(aVar.b);
                TextView textView = (TextView) findViewById(R.id.detail_second_tv);
                textView.setText(aVar.f27783a);
                textView.setTextColor(this.normalTextColor);
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (TStudioHelper.a().a(DXRootView.class, view, fccVar, false)) {
                        } else {
                            d c = epj.c();
                            if (!c.b()) {
                                c.a(true);
                                return;
                            }
                            Nav.from(fpz.b(view.getContext())).toUri(aVar.c);
                            KAPContainerView.access$300(KAPContainerView.this, aVar.f27783a);
                        }
                    }
                });
                findViewById.setContentDescription(aVar.f27783a);
            } else {
                findViewById.setVisibility(8);
            }
            View findViewById2 = findViewById(R.id.detail_three_layout);
            if (fccVar.b != null && fccVar.b.size() >= 2) {
                final fcc.a aVar2 = fccVar.b.get(1);
                ((TUrlImageView) findViewById(R.id.detail_three_iv)).setImageUrl(aVar2.b);
                TextView textView2 = (TextView) findViewById(R.id.detail_three_tv);
                textView2.setText(aVar2.f27783a);
                textView2.setTextColor(this.normalTextColor);
                findViewById2.setVisibility(0);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        d c = epj.c();
                        if (!c.b()) {
                            c.a(true);
                            return;
                        }
                        Nav.from(fpz.b(view.getContext())).toUri(aVar2.c);
                        KAPContainerView.access$300(KAPContainerView.this, aVar2.f27783a);
                    }
                });
                findViewById2.setContentDescription(aVar2.f27783a);
            } else {
                findViewById2.setVisibility(8);
            }
            this.viewModel = fccVar;
            this.firstItem = fccVar.f27782a.f27785a.get(0);
            Iterator<fcc.b> it = fccVar.f27782a.f27785a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fcc.b next = it.next();
                if (next.f27784a) {
                    this.currSelectItem = next;
                    this.isEnterLiked = true;
                    break;
                }
            }
            fcc.b bVar = this.currSelectItem;
            this.tmpSelectItem = bVar;
            if (bVar == null) {
                this.firstIconIV.setImageUrl(this.firstItem.b);
                this.firstTitleTV.setTextColor(this.normalTextColor);
            } else {
                this.firstIconIV.setImageUrl(this.firstItem.c);
                this.firstTitleTV.setTextColor(this.highlightTextColor);
            }
            this.firstTitleTV.setText(likeCountDesc(fccVar.f27782a.b));
        }
    }

    private void thumbUp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c43c6e2", new Object[]{this, str});
            return;
        }
        try {
            new KAPThumbUpClient(new KAPThumbUpRequestParams(epo.g().e(), ((DetailActivity) fpz.b(getContext())).y().t.i(), str), epo.f(), null).execute();
            Map<String, String> prepareCommonUTParams = prepareCommonUTParams();
            prepareCommonUTParams.put("tag", str);
            b.a("Page_Detail_Button-AttitudeClick", prepareCommonUTParams);
        } catch (Exception unused) {
        }
    }

    private void removeLike(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb39468c", new Object[]{this, str});
            return;
        }
        try {
            new KAPRemoveClient(new KAPRemoveLikeRequestParams(epo.g().e(), ((DetailActivity) fpz.b(getContext())).y().t.i()), epo.f(), null).execute();
            Map<String, String> prepareCommonUTParams = prepareCommonUTParams();
            prepareCommonUTParams.put("tag", str);
            b.a("Page_Detail_Button-LaudRemove", prepareCommonUTParams);
        } catch (Exception unused) {
        }
    }

    private String likeCountDesc(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfcba26d", new Object[]{this, new Integer(i)});
        }
        String str = this.viewModel.f27782a.d;
        if (str == null) {
            str = "";
        }
        if (i <= 0) {
            return this.isEnterLiked ? "点赞" : str;
        } else if (i == 1) {
            return (this.viewModel.b == null || this.viewModel.b.size() == 1) ? "1人赞过" : "1";
        } else if (i < 10000) {
            return String.valueOf(i) + this.viewModel.f27782a.d;
        } else if (i < 10000000) {
            return String.format(Locale.CHINA, "%.1f万", Float.valueOf(i / 10000.0f)) + this.viewModel.f27782a.d;
        } else {
            return String.format(Locale.CHINA, "%.1f千万", Float.valueOf(i / 1.0E7f)) + this.viewModel.f27782a.d;
        }
    }

    private Map<String, String> prepareCommonUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("99cc0393", new Object[]{this});
        }
        c cVar = ((DetailActivity) fpz.b(getContext())).y().t;
        String e = epo.g().e();
        HashMap hashMap = new HashMap(4);
        hashMap.put("item_id", cVar.i());
        hashMap.put("seller_id", cVar.h());
        hashMap.put("userid", e);
        return hashMap;
    }

    private void showPopupWindowUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0890e5", new Object[]{this});
            return;
        }
        try {
            b.a("Page_Detail_Button-LaudClick", prepareCommonUTParams());
        } catch (Exception unused) {
        }
    }

    private void attitudeClickUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9064ee", new Object[]{this, str});
            return;
        }
        try {
            Map<String, String> prepareCommonUTParams = prepareCommonUTParams();
            prepareCommonUTParams.put("tag", str);
            b.a("Page_Detail_Button-AttitudeClick", prepareCommonUTParams);
        } catch (Exception unused) {
        }
    }

    private void otherButtonClickUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b67e36", new Object[]{this, str});
            return;
        }
        try {
            Map<String, String> prepareCommonUTParams = prepareCommonUTParams();
            prepareCommonUTParams.put("title", str);
            b.a("Page_Detail_Button-KAPButtonClick", prepareCommonUTParams);
        } catch (Exception unused) {
        }
    }
}
