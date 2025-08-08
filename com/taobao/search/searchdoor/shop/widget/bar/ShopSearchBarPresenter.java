package com.taobao.search.searchdoor.shop.widget.bar;

import android.content.Intent;
import android.support.v4.util.ArrayMap;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.search.sf.widgets.searchbar.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.imn;
import tb.iud;
import tb.iue;
import tb.kge;
import tb.noa;
import tb.npj;
import tb.npn;
import tb.npr;
import tb.nsa;
import tb.nse;
import tb.nsi;
import tb.nul;

/* loaded from: classes8.dex */
public class ShopSearchBarPresenter extends iue<c, d> implements TextWatcher, View.OnClickListener, TextView.OnEditorActionListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SHOP_SEARCH_HINT_APP_ID = "28890";
    private static final String SHOP_SEARCH_MTOP_ALIAS = "inShopHintDataTpp";
    private static final String SHOP_SEARCH_UPLOAD_EXPOSE = "Page_Shop_Search_Button-CPlaceholder";
    private nsa changedListener;
    private String displayHint;
    private String displayQuery;
    private String mLastSuggestRn;
    private npn requestHintDisposable;
    private String searchHint;
    private boolean showPhotoSearch;

    static {
        kge.a(851168774);
        kge.a(-1201612728);
        kge.a(1670231405);
        kge.a(619812765);
    }

    public static /* synthetic */ Object ipc$super(ShopSearchBarPresenter shopSearchBarPresenter, String str, Object... objArr) {
        if (str.hashCode() == 531831650) {
            super.bind((ShopSearchBarPresenter) objArr[0], objArr[1], (imn) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    public static /* synthetic */ void access$000(ShopSearchBarPresenter shopSearchBarPresenter, InShopSearchHintBean inShopSearchHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbd32b0", new Object[]{shopSearchBarPresenter, inShopSearchHintBean});
        } else {
            shopSearchBarPresenter.updateShopSearchBarHint(inShopSearchHintBean);
        }
    }

    public String getDisplayQuery() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8bd0fcdd", new Object[]{this}) : this.displayQuery;
    }

    public String getDisplayHint() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec5a7ba6", new Object[]{this}) : this.displayHint;
    }

    @Override // tb.iue, tb.iuh
    public void bind(c cVar, d dVar, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd040fc7", new Object[]{this, cVar, dVar, imnVar});
            return;
        }
        super.bind((ShopSearchBarPresenter) cVar, (c) dVar, imnVar);
        handleIntent(dVar.getActivity().getIntent(), cVar, true);
        requestSearchHint();
    }

    public void handleIntent(Intent intent, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63580ad", new Object[]{this, intent, cVar, new Boolean(z)});
            return;
        }
        this.showPhotoSearch = "true".equals(nse.i(getWidget().getModel()));
        getIView().b(this.showPhotoSearch);
        updateInputText(intent);
    }

    private void updateInputText(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cc9b92", new Object[]{this, intent});
            return;
        }
        String str = com.taobao.search.mmd.util.c.a(intent.getData()).get(f.DISPLAY_Q);
        if (str == null) {
            str = "";
        }
        getIView().c(str);
        this.displayQuery = str;
    }

    private List<String> getWhiteListParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("5543bee9", new Object[]{this}) : Arrays.asList(r.aO().split("&"));
    }

    private void requestSearchHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b501c5", new Object[]{this});
            return;
        }
        npn npnVar = this.requestHintDisposable;
        if (npnVar != null && !npnVar.b()) {
            this.requestHintDisposable.a();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("shop_id", nse.b(getWidget().getModel()));
        List<String> whiteListParams = getWhiteListParams();
        Map<String, String> b = getWidget().getModel().b();
        if (whiteListParams != null) {
            for (String str : whiteListParams) {
                String str2 = b.get(str);
                if (!StringUtils.isEmpty(str2)) {
                    hashMap.put(str, str2);
                }
            }
        }
        this.requestHintDisposable = new npr.b().a(new b(SHOP_SEARCH_HINT_APP_ID, SHOP_SEARCH_MTOP_ALIAS, hashMap)).a(new a()).a(new nul("BGWords")).a().b().c().a(new iud<ArrayList<InShopSearchHintBean>>() { // from class: com.taobao.search.searchdoor.shop.widget.bar.ShopSearchBarPresenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iud
            public void a(ArrayList<InShopSearchHintBean> arrayList) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                } else if (arrayList.size() <= 0) {
                } else {
                    ShopSearchBarPresenter.access$000(ShopSearchBarPresenter.this, arrayList.get(0));
                }
            }
        }, new npj("BGWords") { // from class: com.taobao.search.searchdoor.shop.widget.bar.ShopSearchBarPresenter.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
                if (str3.hashCode() == -73738099) {
                    super.a((Throwable) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
            }

            @Override // tb.npj, tb.iud
            public void a(Throwable th) throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb9ad88d", new Object[]{this, th});
                    return;
                }
                super.a(th);
                TLogTracker.a("Default", "-1", th.getMessage());
            }
        });
    }

    private void updateShopSearchBarHint(InShopSearchHintBean inShopSearchHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f4d8fa", new Object[]{this, inShopSearchHintBean});
            return;
        }
        this.displayHint = inShopSearchHintBean.getDisplayText();
        this.searchHint = inShopSearchHintBean.getSearchText();
        this.mLastSuggestRn = inShopSearchHintBean.getSuggest_rn();
        e.b(SHOP_SEARCH_UPLOAD_EXPOSE, inShopSearchHintBean.getUtLogMap());
        getIView().a(inShopSearchHintBean.getDisplayText());
    }

    @Override // tb.iue, tb.iuh
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        npn npnVar = this.requestHintDisposable;
        if (npnVar == null || npnVar.b()) {
            return;
        }
        this.requestHintDisposable.a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.iv_back) {
            getWidget().getActivity().finish();
        } else if (view.getId() == R.id.tv_search) {
            onSearchClick();
        } else if (view.getId() == R.id.tv_delete) {
            getIView().b("");
        } else if (view.getId() != R.id.photoBtn) {
        } else {
            onImageSearchBtnClicked();
        }
    }

    private void onImageSearchBtnClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81ba9d6", new Object[]{this});
            return;
        }
        try {
            String ab = r.ab();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("pssource", "store");
            nsi model = getWidget().getModel();
            arrayMap.put("sellerId", nse.a(model));
            arrayMap.put("shopId", nse.b(model));
            Nav.from(getWidget().getActivity()).toUri(y.a(ab, (ArrayMap<String, String>) arrayMap));
            e.a("PhotoSearch_Enter");
        } catch (Throwable th) {
            q.a("SearchDoorActivity", "启动图搜失败！", th);
        }
    }

    public void onSearchClick() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6402d68", new Object[]{this});
            return;
        }
        String g = getIView().g();
        if (StringUtils.isEmpty(g)) {
            g = this.searchHint;
        } else {
            z = false;
        }
        if (StringUtils.isEmpty(g)) {
            return;
        }
        onSearchTriggered(g, z, noa.VALUE_SEARCH_ACTION_ZD);
    }

    public void setTextChangeListener(nsa nsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40229dce", new Object[]{this, nsaVar});
        } else {
            this.changedListener = nsaVar;
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fdbb29", new Object[]{this, editable});
            return;
        }
        String obj = editable.toString();
        int length = obj.length();
        getIView().a(length > 0);
        if (this.showPhotoSearch) {
            c iView = getIView();
            if (length != 0) {
                z = false;
            }
            iView.b(z);
        }
        nsa nsaVar = this.changedListener;
        if (nsaVar == null) {
            return;
        }
        nsaVar.a(obj.trim());
    }

    private void onSearchTriggered(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d26bbd", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        String b = nse.b(getWidget().getModel());
        String a2 = nse.a(getWidget().getModel());
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap<String, String> arrayMap2 = new ArrayMap<>();
        if (z) {
            arrayMap.put("keyword", str);
            arrayMap.put("seller_id", a2);
            arrayMap.put("shop_id", b);
            String str3 = this.mLastSuggestRn;
            if (str3 != null && !str3.isEmpty()) {
                arrayMap2.put(k.KEY_SUGGEST_RN, this.mLastSuggestRn);
            }
            e.a("CPlaceholder", (ArrayMap<String, String>) arrayMap);
        } else {
            arrayMap.put("seller_id", a2);
            arrayMap.put("shop_id", b);
            e.a(noa.VALUE_SEARCH_ACTION_ZD, (ArrayMap<String, String>) arrayMap);
        }
        if (!StringUtils.isEmpty(str2)) {
            arrayMap2.put("from", str2);
        }
        jumpToSearchResultPage(str, arrayMap2);
    }

    private void jumpToSearchResultPage(String str, ArrayMap<String, String> arrayMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e0857e", new Object[]{this, str, arrayMap});
        } else {
            nse.a(getWidget().getModel(), getWidget().getActivity(), str, arrayMap, getWidget());
        }
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 3 && i != 0) {
            return false;
        }
        onSearchClick();
        return true;
    }
}
