package com.taobao.android.live.plugin.atype.flexalocal.good.view.search;

import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.y;
import java.util.ArrayList;
import tb.ddv;
import tb.ddw;
import tb.hgv;
import tb.hhs;
import tb.hhz;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.hiw;
import tb.hix;
import tb.hjo;
import tb.hjp;
import tb.hjq;
import tb.jwg;
import tb.kge;
import tb.khi;
import tb.kxo;

/* loaded from: classes6.dex */
public class GoodListSearchView extends GoodsBaseView<hjq> implements View.OnClickListener, TaoLiveSearchHistoryView.b, ddv, hjp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INPUT_MAX_WORD = 30;
    public static final String TAG = "GoodListSearchView";
    private final boolean enableShowGoodsSearchItem;
    private Handler handler;
    private View mBackBtn;
    private String mCurrentResultKey;
    private View mDeleteAllInputBtn;
    private AppCompatEditText mEditText;
    private AliUrlImageView mEmptyImage;
    private AliUrlImageView mErrorImage;
    private Button mErrorRetryButton;
    private String mGoodsListSearchMoreUrl;
    private TaoLiveSearchHistoryView mHistoryView;
    private a mICancelClickListener;
    private View mResultContainerView;
    private View mResultEmptyView;
    private View mResultErrorView;
    private jwg mResultListAdapter;
    private TextView mResultNumView;
    private ViewGroup mResultSearchEntryView;
    private View mSearchBtn;
    private CloseRecyclerView mSearchResultListView;
    private kxo mViewFactory;
    private final Runnable prefetchRunnable;
    private final int searchResultFirstShowPreFetchDelayDuration;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(900518443);
        kge.a(1796469521);
        kge.a(-1201612728);
        kge.a(-1405781380);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(GoodListSearchView goodListSearchView, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : TAG;
    }

    @Override // tb.hjc
    public View getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this;
    }

    public static /* synthetic */ AppCompatEditText access$000(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatEditText) ipChange.ipc$dispatch("26a05533", new Object[]{goodListSearchView}) : goodListSearchView.mEditText;
    }

    public static /* synthetic */ hgv access$100(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("113f2cd1", new Object[]{goodListSearchView}) : goodListSearchView.mPresenter;
    }

    public static /* synthetic */ c access$200(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("19dba00", new Object[]{goodListSearchView}) : goodListSearchView.mGoodLiveContext;
    }

    public static /* synthetic */ c access$300(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("be48e81", new Object[]{goodListSearchView}) : goodListSearchView.mGoodLiveContext;
    }

    public static /* synthetic */ View access$400(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cfce6d1d", new Object[]{goodListSearchView}) : goodListSearchView.mDeleteAllInputBtn;
    }

    public static /* synthetic */ c access$500(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("20723783", new Object[]{goodListSearchView}) : goodListSearchView.mGoodLiveContext;
    }

    public static /* synthetic */ String access$600(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c970d67", new Object[]{goodListSearchView}) : goodListSearchView.mCurrentResultKey;
    }

    public static /* synthetic */ hgv access$700(GoodListSearchView goodListSearchView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgv) ipChange.ipc$dispatch("c99c7b57", new Object[]{goodListSearchView}) : goodListSearchView.mPresenter;
    }

    public GoodListSearchView(c cVar) {
        super(cVar, false);
        this.prefetchRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    GoodListSearchView.this.preFetchInsideDetailData(hhz.OPEN_SOURCE_OPEN_SEARCH);
                }
            }
        };
        initView();
        b.b(this.mGoodLiveContext.g(), this.mGoodLiveContext.m());
        ddw.a().a(this);
        this.searchResultFirstShowPreFetchDelayDuration = hir.t();
        this.enableShowGoodsSearchItem = hir.S();
        this.mGoodsListSearchMoreUrl = hir.T();
        this.handler = new Handler();
        com.alibaba.android.ultron.vfw.instance.d B = this.mGoodLiveContext.B();
        this.mViewFactory = new kxo(this.mGoodLiveContext, new com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.a(this.mGoodLiveContext, B.q().v(), B, true));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.taolive_good_search_delete_all) {
            this.mEditText.setText("");
            this.mDeleteAllInputBtn.setVisibility(8);
            showInitState();
            b.d(this.mGoodLiveContext.g(), this.mGoodLiveContext.m());
        } else if (view.getId() == R.id.taolive_good_bak_container) {
            b.c(this.mGoodLiveContext.g(), this.mGoodLiveContext.m());
            a aVar = this.mICancelClickListener;
            if (aVar == null) {
                return;
            }
            aVar.a();
        } else if (view.getId() == R.id.taolive_goods_search_retry || view.getId() == R.id.taolive_goods_search_retry_new) {
            ((hjq) this.mPresenter).a(this.mCurrentResultKey, "");
        } else if (view.getId() != R.id.taolive_good_search_button) {
        } else {
            ((hjq) this.mPresenter).a(this.mEditText.getText().toString(), "");
            e.a(this.mEditText, (ResultReceiver) null);
            b.a(this.mGoodLiveContext.g(), this.mGoodLiveContext.m(), true);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    /* renamed from: initInjector  reason: collision with other method in class */
    public hjq mo967initInjector() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hjq) ipChange.ipc$dispatch("f202276c", new Object[]{this});
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.search.a aVar = new com.taobao.android.live.plugin.atype.flexalocal.good.view.search.a(this.mGoodLiveContext);
        this.mHistoryView.setDataClearListener(aVar);
        this.mHistoryView.setHistoryKeyWords(aVar.f());
        showInitState();
        return aVar;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView
    public View onCreateContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a20e10cc", new Object[]{this});
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_goods_search_pop_layout_flexalocal, (ViewGroup) null);
        this.mBackBtn = inflate.findViewById(R.id.taolive_good_bak_container);
        this.mBackBtn.setOnClickListener(this);
        this.mSearchBtn = inflate.findViewById(R.id.taolive_good_search_button);
        this.mSearchBtn.setOnClickListener(this);
        this.mEditText = (AppCompatEditText) inflate.findViewById(R.id.taolive_good_search_edit_text);
        String c = hiw.c();
        if (!StringUtils.isEmpty(c)) {
            this.mEditText.setHint(c);
        }
        this.mEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("31ef5ab8", new Object[]{this, textView, new Integer(i), keyEvent})).booleanValue();
                }
                if (i != 3 && keyEvent != null && (66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                    return false;
                }
                ((hjq) GoodListSearchView.access$100(GoodListSearchView.this)).a(GoodListSearchView.access$000(GoodListSearchView.this).getText().toString(), "");
                b.a(GoodListSearchView.access$200(GoodListSearchView.this).g(), GoodListSearchView.access$300(GoodListSearchView.this).m(), false);
                return true;
            }
        });
        this.mEditText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private int b;
            private int c;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("acba1d0", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("67397830", new Object[]{this, charSequence, new Integer(i), new Integer(i2), new Integer(i3)});
                    return;
                }
                this.b = i;
                this.c = i3;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                    return;
                }
                String str = "afterTextChanged: s=" + ((Object) editable) + "   mStart=" + this.b + "   mCount=" + this.c + "   start=" + GoodListSearchView.access$000(GoodListSearchView.this).getSelectionStart() + " end=" + GoodListSearchView.access$000(GoodListSearchView.this).getSelectionEnd();
                if (editable != null && !StringUtils.isEmpty(editable.toString())) {
                    GoodListSearchView.access$400(GoodListSearchView.this).setVisibility(0);
                    String obj = editable.toString();
                    if (obj.length() <= 30) {
                        return;
                    }
                    hix.a(GoodListSearchView.access$500(GoodListSearchView.this).f(), "最多只能输入30个字哦");
                    int i = this.b;
                    int i2 = this.c;
                    editable.delete((i + i2) - (obj.length() - 30), i + i2);
                    return;
                }
                GoodListSearchView.access$400(GoodListSearchView.this).setVisibility(8);
            }
        });
        this.mEditText.postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    e.a(GoodListSearchView.access$000(GoodListSearchView.this), 1);
                }
            }
        }, 50L);
        this.mHistoryView = (TaoLiveSearchHistoryView) inflate.findViewById(R.id.taolive_good_search_history_view);
        TaoLiveSearchHistoryView taoLiveSearchHistoryView = this.mHistoryView;
        if (taoLiveSearchHistoryView != null) {
            taoLiveSearchHistoryView.setSearchTagClickListener(this);
        }
        this.mResultContainerView = inflate.findViewById(R.id.taolive_goods_search_result_container);
        this.mResultNumView = (TextView) inflate.findViewById(R.id.taolive_goods_search_result_num);
        this.mSearchResultListView = (CloseRecyclerView) inflate.findViewById(R.id.taolive_goods_search_listview);
        this.mSearchResultListView.setLayoutManager(new hjo(this.mGoodLiveContext.f(), 1, false));
        this.mResultListAdapter = new khi(this.mGoodLiveContext, new ArrayList(), this.mSearchResultListView);
        this.mSearchResultListView.setAdapter(this.mResultListAdapter);
        this.mSearchResultListView.setItemViewCacheSize(0);
        this.mSearchResultListView.setCloseViewListener(new CloseRecyclerView.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.view.search.GoodListSearchView.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a(int i, int i2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
                }
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a(boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
                }
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() == null) {
                } else {
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a();
                }
            }

            @Override // com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView.a
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else {
                    ((hjq) GoodListSearchView.access$700(GoodListSearchView.this)).b(GoodListSearchView.access$600(GoodListSearchView.this), "");
                }
            }
        });
        this.mResultEmptyView = inflate.findViewById(R.id.taolive_goods_search_empty);
        this.mResultSearchEntryView = (ViewGroup) inflate.findViewById(R.id.taolive_goods_search_entry);
        this.mEmptyImage = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_search_empty_view);
        this.mEmptyImage.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01SzKoo829WrPPzGQF5_!!6000000008076-2-tps-220-220.png");
        this.mResultErrorView = inflate.findViewById(R.id.taolive_goods_search_error);
        this.mErrorImage = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_search_error_view);
        this.mErrorImage.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01tM8zwX1oPtS5h7fFn_!!6000000005218-2-tps-330-330.png");
        this.mErrorRetryButton = (Button) inflate.findViewById(R.id.taolive_goods_search_retry);
        this.mDeleteAllInputBtn = inflate.findViewById(R.id.taolive_good_search_delete_all);
        this.mDeleteAllInputBtn.setOnClickListener(this);
        if (this.insidePrefetchHelper != null) {
            this.insidePrefetchHelper.a(this.mSearchResultListView, hhz.OPEN_SOURCE_SCROLL_SEARCH);
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.mGoodLiveContext)) {
            inflate.setBackgroundResource(R.drawable.taolive_goods_package_dx_bg_group_flexalocal);
            inflate.findViewById(R.id.taolive_good_search_input_layout).setBackgroundResource(R.drawable.taolive_good_search_input_bg2_flexalocal);
            this.mEditText.setHintTextColor(-11509638);
            this.mResultEmptyView = inflate.findViewById(R.id.taolive_goods_search_empty_new);
            this.mResultSearchEntryView = (ViewGroup) inflate.findViewById(R.id.taolive_goods_search_entry_new);
            this.mEmptyImage = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_search_empty_view_new);
            this.mEmptyImage.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01CQCH2r1kjoOoMGwzx_!!6000000004720-2-tps-440-440.png");
            this.mResultErrorView = inflate.findViewById(R.id.taolive_goods_search_error_new);
            this.mErrorImage = (AliUrlImageView) inflate.findViewById(R.id.taolive_goods_search_error_view_new);
            this.mErrorImage.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01CQCH2r1kjoOoMGwzx_!!6000000004720-2-tps-440-440.png");
            this.mErrorRetryButton = (Button) inflate.findViewById(R.id.taolive_goods_search_retry_new);
            this.mSearchBtn.setBackgroundResource(R.drawable.taolive_goods_search_button_shape2_flexalocal);
        }
        this.mErrorRetryButton.setOnClickListener(this);
        return inflate;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseView, com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.GoodsBaseTempView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        ((hjq) this.mPresenter).a();
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.prefetchRunnable);
        }
        ddw.a().b(this);
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2034149202) {
            if (hashCode != 189607490) {
                if (hashCode == 224943025 && str.equals("com.taobao.taolive.hide.member.identification.inner")) {
                    c = 0;
                }
            } else if (str.equals("com.taobao.taolive.room.goodlist.timepoint.asked.inner")) {
                c = 1;
            }
        } else if (str.equals("com.taobao.taolive.room.goodlist.all.refresh.item.inner")) {
            c = 2;
        }
        if (c == 0) {
            ((hjq) this.mPresenter).d();
        } else if ((c != 1 && c != 2) || !(obj instanceof LiveItem)) {
        } else {
            ((hjq) this.mPresenter).b((LiveItem) obj);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.hide.member.identification.inner", "com.taobao.taolive.room.goodlist.timepoint.asked.inner", "com.taobao.taolive.room.goodlist.all.refresh.item.inner"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : c.a(this.mGoodLiveContext);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.view.search.TaoLiveSearchHistoryView.b
    public void onSearchHistoryTagClicked(SearchHistory searchHistory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79deef47", new Object[]{this, searchHistory});
        } else if (searchHistory == null || StringUtils.isEmpty(searchHistory.getKey())) {
        } else {
            this.mCurrentResultKey = null;
            this.mEditText.setText(searchHistory.getKey());
            this.mEditText.setSelection(searchHistory.getKey().length());
            ((hjq) this.mPresenter).a(searchHistory.getKey(), "");
        }
    }

    public void setCancelClickListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec6a332", new Object[]{this, aVar});
        } else {
            this.mICancelClickListener = aVar;
        }
    }

    public void showInitState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39edd6b", new Object[]{this});
            return;
        }
        if (!this.mHistoryView.updateView(this.mGoodLiveContext) && this.mGoodLiveContext.q()) {
            this.mHistoryView.setVisibility(0);
        } else {
            this.mHistoryView.setVisibility(8);
        }
        this.mResultContainerView.setVisibility(8);
        this.mResultEmptyView.setVisibility(8);
        removeResultSearchEntryView();
        this.mResultErrorView.setVisibility(8);
        this.mResultListAdapter.a().clear();
        this.mResultListAdapter.notifyDataSetChanged();
        this.mCurrentResultKey = null;
    }

    @Override // tb.hjc
    public void showEmpty(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00b2ee1", new Object[]{this, str});
            return;
        }
        this.mHistoryView.setVisibility(8);
        this.mResultContainerView.setVisibility(8);
        this.mResultEmptyView.setVisibility(0);
        buildSearchEntryView(str);
        this.mResultErrorView.setVisibility(8);
        this.mCurrentResultKey = str;
    }

    private void buildSearchEntryView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17188f2", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
            his.b(TAG, "buildSearchEntryView in blank | searchKey is empty.");
        } else if (y.b(this.mGoodLiveContext.f())) {
            his.b(TAG, "buildSearchEntryView in blank | Devices is tablet.");
        } else if (!this.enableShowGoodsSearchItem) {
            his.b(TAG, "buildSearchEntryView in blank | enableShowGoodsSearchItem is false.");
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.a(this.mGoodLiveContext)) {
            g a2 = this.mViewFactory.a(10);
            JSONObject a3 = hiq.a(true, str, this.mGoodsListSearchMoreUrl);
            this.mResultSearchEntryView.removeAllViews();
            if (a2 == null || a2.itemView == null || a2.d() == null) {
                return;
            }
            this.mResultSearchEntryView.addView(a2.itemView);
            a2.d().a(a2, a3, -1);
            b.a(this.mGoodLiveContext.g(), this.mGoodLiveContext.m(), a3);
        } else {
            DXRootView b = hhs.a().b(this.mGoodLiveContext.f(), "taolive_goods_search_entry");
            if (b == null || this.mResultSearchEntryView == null) {
                return;
            }
            JSONObject a4 = hiq.a(true, str, this.mGoodsListSearchMoreUrl);
            this.mResultSearchEntryView.removeAllViews();
            this.mResultSearchEntryView.addView(b);
            hhs.a().a(b, a4, this.mGoodLiveContext);
            his.b(TAG, "buildSearchEntryDXView is success.");
            b.a(this.mGoodLiveContext.g(), this.mGoodLiveContext.m(), a4);
        }
    }

    private void removeResultSearchEntryView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5886f5", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.mResultSearchEntryView;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.mResultSearchEntryView.removeAllViews();
    }

    @Override // tb.hjc
    public void showError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce476d5c", new Object[]{this, str});
            return;
        }
        this.mHistoryView.setVisibility(8);
        this.mResultContainerView.setVisibility(8);
        this.mResultEmptyView.setVisibility(8);
        removeResultSearchEntryView();
        this.mResultErrorView.setVisibility(0);
        this.mCurrentResultKey = str;
    }

    @Override // tb.hjc
    public void showGoodList(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ec5e0e", new Object[]{this, new Integer(i), str});
            return;
        }
        this.mHistoryView.setVisibility(8);
        this.mResultContainerView.setVisibility(0);
        this.mResultEmptyView.setVisibility(8);
        removeResultSearchEntryView();
        this.mResultErrorView.setVisibility(8);
        this.mResultNumView.setText(String.format("共%d个搜索结果", Integer.valueOf(i)));
        this.mCurrentResultKey = str;
        this.handler.postDelayed(this.prefetchRunnable, this.searchResultFirstShowPreFetchDelayDuration);
    }

    @Override // tb.hjp
    public void updateHistoryView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e0d57", new Object[]{this});
        } else {
            this.mHistoryView.updateView(this.mGoodLiveContext);
        }
    }

    @Override // tb.hjc
    public jwg getAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jwg) ipChange.ipc$dispatch("dd44ddec", new Object[]{this}) : this.mResultListAdapter;
    }
}
