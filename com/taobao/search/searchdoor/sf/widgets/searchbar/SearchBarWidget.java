package com.taobao.search.searchdoor.sf.widgets.searchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.nav.Nav;
import com.taobao.android.xsearchplugin.muise.e;
import com.taobao.android.xsearchplugin.muise.f;
import com.taobao.monitor.procedure.v;
import com.taobao.phenix.animate.c;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.uikit.SearchUrlImageView;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.l;
import com.taobao.search.common.util.m;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.s;
import com.taobao.search.common.util.y;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintStructuredBean;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.a;
import com.taobao.search.sf.widgets.searchbar.g;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.preference.AppPreference;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.esr;
import tb.fgl;
import tb.hme;
import tb.hny;
import tb.ium;
import tb.iur;
import tb.ius;
import tb.kge;
import tb.noa;
import tb.nom;
import tb.npw;
import tb.nqe;
import tb.nqg;
import tb.nqw;
import tb.nre;
import tb.nrf;
import tb.nrj;
import tb.nrn;
import tb.ntg;
import tb.nud;
import tb.nuu;
import tb.poq;

/* loaded from: classes7.dex */
public class SearchBarWidget extends ius<Void, View, SearchDoorContext> implements ClipboardManager.OnPrimaryClipChangedListener, View.OnClickListener, TextView.OnEditorActionListener, e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_HINT;
    private static final String KEY_SEARCH_BUTTON_GIF_SEP_COUNT = "gifSepCount";
    private static final String KEY_SEARCH_BUTTON_GIF_SHOW_COUNT = "gifShowedCount";
    private static final String TAG = "SearchBarWidget";
    private boolean advHintTracked;
    private boolean cameraAnimChecked;
    private CharSequence clipboardContent;
    private View delButton;
    private EditText editText;
    private nqg hintGuideWidget;
    private boolean isKeyboardViewTreeObserverEnabled;
    private boolean isUOneStyle;
    private ImageView mBackButton;
    private Handler mHandler;
    private Drawable mHintIconDrawable;
    private nrf mImageSearchGuideWidget;
    private boolean mIsElderHomeEdition;
    private boolean mIsPhotoSearchUnable;
    private LottieAnimationView mPhotoSearchAnimView;
    public TUrlImageView mPhotoSearchButtonFont;
    private View mSearchBarInner;
    public View mSearchBarLeftContainer;
    public TextView mSearchBarLeftTxtTv;
    private Button mSearchButton;
    private SearchDoorContext mSearchDoorContext;
    private Runnable mShowKeyboardRunnable;
    private boolean mShowingSpeechLayer;
    private boolean mTb2024Enabled;
    private Resources resources;

    public static /* synthetic */ Object ipc$super(SearchBarWidget searchBarWidget, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode != 593843865) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxDestroy();
            return null;
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : TAG;
    }

    public static /* synthetic */ void access$000(SearchBarWidget searchBarWidget, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2c3340", new Object[]{searchBarWidget, str});
        } else {
            searchBarWidget.showSearchButtonGif(str);
        }
    }

    public static /* synthetic */ Button access$100(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Button) ipChange.ipc$dispatch("c0a553c9", new Object[]{searchBarWidget}) : searchBarWidget.mSearchButton;
    }

    public static /* synthetic */ void access$200(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a818d34", new Object[]{searchBarWidget});
        } else {
            searchBarWidget.onBackBtnClick();
        }
    }

    public static /* synthetic */ void access$300(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f28653", new Object[]{searchBarWidget});
        } else {
            searchBarWidget.handleTextChanged();
        }
    }

    public static /* synthetic */ void access$400(SearchBarWidget searchBarWidget, CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bbe0f6", new Object[]{searchBarWidget, charSequence, new Integer(i), new Integer(i2)});
        } else {
            searchBarWidget.checkAndReportPaste(charSequence, i, i2);
        }
    }

    public static /* synthetic */ Drawable access$500(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("95d59f89", new Object[]{searchBarWidget}) : searchBarWidget.mHintIconDrawable;
    }

    public static /* synthetic */ Drawable access$502(SearchBarWidget searchBarWidget, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("2329c2e7", new Object[]{searchBarWidget, drawable});
        }
        searchBarWidget.mHintIconDrawable = drawable;
        return drawable;
    }

    public static /* synthetic */ void access$600(SearchBarWidget searchBarWidget, SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aa7224b", new Object[]{searchBarWidget, searchBarHintBean});
        } else {
            searchBarWidget.updateSearchBarHintUI(searchBarHintBean);
        }
    }

    public static /* synthetic */ Handler access$700(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("3cfd5b97", new Object[]{searchBarWidget}) : searchBarWidget.mHandler;
    }

    public static /* synthetic */ LottieAnimationView access$800(SearchBarWidget searchBarWidget) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LottieAnimationView) ipChange.ipc$dispatch("492fa7d0", new Object[]{searchBarWidget}) : searchBarWidget.mPhotoSearchAnimView;
    }

    static {
        kge.a(1514523444);
        kge.a(-1201612728);
        kge.a(619812765);
        kge.a(1351750140);
        kge.a(1724051340);
        DEFAULT_HINT = b.a(R.string.taobao_app_1005_1_16704);
    }

    public SearchBarWidget(Activity activity, ium iumVar, SearchDoorContext searchDoorContext, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, searchDoorContext, viewGroup, iurVar);
        this.clipboardContent = null;
        this.mHandler = new Handler(Looper.getMainLooper());
        boolean z = false;
        this.mIsPhotoSearchUnable = false;
        this.cameraAnimChecked = false;
        this.mShowKeyboardRunnable = new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SearchBarWidget.this.showKeyBoard();
                }
            }
        };
        this.mTb2024Enabled = poq.a(activity);
        this.resources = Globals.getApplication().getResources();
        this.mSearchDoorContext = searchDoorContext;
        this.isUOneStyle = "UOne".equals(getModel().b("searchBoxShowType"));
        this.mIsElderHomeEdition = "true".equals(getModel().a(noa.KEY_SEARCH_ELDER_HOME_OPEN));
        if ((getActivity() instanceof a) && ((a) getActivity()).j()) {
            z = true;
        }
        this.isKeyboardViewTreeObserverEnabled = z;
        registerClipboardListener();
        subscribeEvent(this);
        if (activity instanceof f) {
            ((f) activity).a(this);
        }
    }

    private void registerClipboardListener() {
        ClipboardManager clipboardManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b6050e", new Object[]{this});
        } else if (!r.by() || (clipboardManager = (ClipboardManager) Globals.getApplication().getSystemService("clipboard")) == null) {
        } else {
            clipboardManager.addPrimaryClipChangedListener(this);
        }
    }

    private void unregisterClipboardListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b4915", new Object[]{this});
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) Globals.getApplication().getSystemService("clipboard");
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.removePrimaryClipChangedListener(this);
    }

    public void loadHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49aaa94", new Object[]{this});
            return;
        }
        String h = this.mSearchDoorContext.h();
        SearchBarHintBean searchBarHintBean = null;
        if (TextUtils.isEmpty(this.mSearchDoorContext.f())) {
            searchBarHintBean = npw.a(AppPreference.getString(k.HOMEPAGE_PREFERENCE_KEY, ""));
            if (searchBarHintBean != null) {
                searchBarHintBean.handleMultiHint();
            }
        } else if (!TextUtils.isEmpty(h)) {
            searchBarHintBean = new SearchBarHintBean();
            searchBarHintBean.displayText = h;
            searchBarHintBean.searchText = h;
            searchBarHintBean.suggestRn = this.mSearchDoorContext.a("hint_suggest_rn");
            searchBarHintBean.handleMultiHint();
            trackChannelHintExpose(searchBarHintBean);
        }
        if (searchBarHintBean == null) {
            return;
        }
        if (!TextUtils.isEmpty(searchBarHintBean.aac)) {
            this.mSearchDoorContext.c("aac", searchBarHintBean.aac);
        }
        this.mSearchDoorContext.a("all", searchBarHintBean);
        applyDefaultSearchhint(searchBarHintBean);
    }

    private CharSequence getClipboardContent() {
        ClipboardManager clipboardManager;
        ClipData primaryClip;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("ae9b563a", new Object[]{this}) : (r.by() && (clipboardManager = (ClipboardManager) getActivity().getSystemService("clipboard")) != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() > 0) ? primaryClip.getItemAt(0).getText() : "";
    }

    public static int getLayoutId(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b1d00a5", new Object[]{new Boolean(z)})).intValue();
        }
        if (z) {
            return R.layout.tbsearchdoor_searchbar_immersive_2021_new;
        }
        return R.layout.tbsearchdoor_searchbar_immersive_2021;
    }

    @Override // tb.ius
    public View onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : LayoutInflater.from(this.mActivity).inflate(getLayoutId(this.mTb2024Enabled), this.mContainer, false);
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [android.view.View] */
    @Override // tb.ius, tb.iup
    public void findAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.mBackButton = (ImageView) findView(R.id.btn_go_back);
        this.mSearchButton = (Button) findView(R.id.searchbtn);
        this.delButton = findView(R.id.edit_del_btn);
        this.editText = (EditText) findView(R.id.searchEdit);
        EditText editText = this.editText;
        if (editText != null) {
            editText.setTag(v.APM_VIEW_TOKEN, v.APM_VIEW_IGNORE);
            if (Build.VERSION.SDK_INT >= 26) {
                this.editText.setImportantForAutofill(2);
            }
            if (!this.isKeyboardViewTreeObserverEnabled) {
                this.editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                        }
                        SearchBarWidget.this.getModel().a(SearchBarWidget.this.getActivity(), true);
                        return false;
                    }
                });
            }
        }
        this.mSearchBarInner = findView(R.id.searchbar_inner);
        this.mSearchBarLeftContainer = findView(R.id.search_bar_left_container);
        this.mSearchBarLeftTxtTv = (TextView) findView(R.id.sblc_txt_tv);
        this.mPhotoSearchButtonFont = (TUrlImageView) findView(R.id.photoBtn);
        if (!this.mTb2024Enabled) {
            this.mPhotoSearchButtonFont.setImageUrl(g.PHOTO_SEARCH_ICON);
        } else {
            this.mPhotoSearchButtonFont.setImageUrl(g.PHOTO_SEARCH_ICON_2024);
        }
        this.mPhotoSearchAnimView = (LottieAnimationView) findView(R.id.lav_photo_btn);
        bindListener();
        this.mImageSearchGuideWidget = new nrf(this.mActivity, this, this.mPhotoSearchButtonFont, (ViewGroup) this.mActivity.findViewById(R.id.tbsearch_searchdoor));
        if (c().a().c()) {
            this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(512)});
        }
        String f = getModel().f();
        if (TextUtils.equals(f, "localSearch")) {
            this.mSearchButton.setText(b.a(R.string.taobao_app_1005_1_16702));
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_local_search);
            this.mSearchButton.getLayoutParams().width = l.a(72);
        }
        if (this.mIsElderHomeEdition) {
            elderHomeAdapt();
        }
        List asList = Arrays.asList(r.aU());
        if (asList.isEmpty()) {
            return;
        }
        this.mIsPhotoSearchUnable = asList.contains(f);
        if (this.mIsPhotoSearchUnable) {
            this.mPhotoSearchButtonFont.setVisibility(8);
        } else {
            this.mPhotoSearchButtonFont.setVisibility(0);
        }
        checkAndShowPromotionGif();
        this.hintGuideWidget = new nqg(getActivity(), this, this.mSearchButton, this.mSearchDoorContext);
        View findViewById = getView().findViewById(R.id.view_bg);
        if (findViewById != null) {
            setSearchBarBg(findViewById, false);
        }
        displayNormalSearchButton();
        this.mSearchBarInner.setPadding(0, 0, l.a(8.6f), 0);
        if (!isDarkMode()) {
            return;
        }
        bindNightResources();
    }

    public void setSearchBarBg(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56775e77", new Object[]{this, view, new Boolean(z)});
        } else if (z) {
            view.setBackgroundResource(this.isUOneStyle ? R.drawable.tbsearch_searchdoor_bar_bg_uone_night : R.drawable.tbsearch_searchdoor_bar_bg_2021_night);
        } else if (this.mTb2024Enabled) {
            view.setBackgroundResource(R.drawable.tbsearch_searchdoor_bar_bg_uone_new);
        } else {
            view.setBackgroundResource(this.isUOneStyle ? R.drawable.tbsearch_searchdoor_bar_bg_uone : R.drawable.tbsearch_searchdoor_bar_bg_2021);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    private void bindNightResources() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88740611", new Object[]{this});
            return;
        }
        View findViewById = getView().findViewById(R.id.view_bg);
        if (findViewById != null) {
            setSearchBarBg(findViewById, true);
        }
        this.editText.setTextColor(-1);
        if (this.mTb2024Enabled) {
            this.mPhotoSearchButtonFont.setImageUrl(g.PHOTO_SEARCH_ICON_2024_DARK);
        } else {
            this.mPhotoSearchButtonFont.setImageUrl(g.PHOTO_SEARCH_ICON_LIGHT);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [android.view.View] */
    private void checkAndShowPromotionGif() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9eb94", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mSearchDoorContext.f())) {
        } else {
            String ca = r.ca();
            if (TextUtils.isEmpty(ca)) {
                clearSearchButtonGifShowedCount();
                return;
            }
            try {
                final com.taobao.search.mmd.datasource.bean.b a2 = com.taobao.search.mmd.datasource.bean.b.a(new JSONObject(ca));
                long currentTimeMillis = System.currentTimeMillis();
                if (a2 == null || currentTimeMillis < a2.d() || currentTimeMillis > a2.e()) {
                    clearSearchButtonGifShowedCount();
                    return;
                }
                int b = s.b(KEY_SEARCH_BUTTON_GIF_SHOW_COUNT, 0);
                if (b >= a2.b()) {
                    return;
                }
                int b2 = s.b(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, 0);
                if (b2 < a2.c() && b != 0) {
                    s.a(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, b2 + 1);
                    return;
                }
                s.a(KEY_SEARCH_BUTTON_GIF_SHOW_COUNT, b + 1);
                s.a(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, 0);
                getView().postDelayed(new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            SearchBarWidget.access$000(SearchBarWidget.this, a2.a());
                        }
                    }
                }, 500L);
            } catch (JSONException unused) {
                clearSearchButtonGifShowedCount();
            }
        }
    }

    private void showSearchButtonGif(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9fd07e", new Object[]{this, str});
            return;
        }
        final TUrlImageView tUrlImageView = new TUrlImageView(getActivity());
        tUrlImageView.setId(R.id.search_button_gif_view);
        tUrlImageView.setSkipAutoSize(true);
        tUrlImageView.setLayoutParams(this.mSearchButton.getLayoutParams());
        tUrlImageView.setOnClickListener(this);
        ((ViewGroup) this.mSearchButton.getParent()).addView(tUrlImageView);
        tUrlImageView.setImageUrl(str);
        tUrlImageView.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.phenix.intf.event.a
            public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
            }

            public boolean a(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable instanceof com.taobao.phenix.animate.b) {
                    SearchBarWidget.access$100(SearchBarWidget.this).setVisibility(4);
                    ((com.taobao.phenix.animate.b) drawable).a(new c() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.4.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.phenix.animate.c
                        public boolean onLoopCompleted(int i, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return ((Boolean) ipChange3.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
                            }
                            if (i == 0) {
                                return true;
                            }
                            SearchBarWidget.access$100(SearchBarWidget.this).setVisibility(0);
                            tUrlImageView.setImageUrl(null);
                            com.taobao.search.mmd.util.k.a(tUrlImageView);
                            return false;
                        }
                    });
                }
                return false;
            }
        });
    }

    private void clearSearchButtonGifShowedCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd952fd", new Object[]{this});
            return;
        }
        s.a(KEY_SEARCH_BUTTON_GIF_SEP_COUNT, 0);
        s.a(KEY_SEARCH_BUTTON_GIF_SHOW_COUNT, 0);
    }

    private void elderHomeAdapt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ea9ea0", new Object[]{this});
            return;
        }
        this.editText.setTextSize(1, m.a(14, true));
        this.mSearchBarLeftTxtTv.setTextSize(1, m.a(14, true));
        this.mSearchButton.setHeight(DensityUtil.dip2px(getActivity(), 30.0f));
        this.mSearchButton.getLayoutParams().width = l.a(67);
        this.mSearchButton.getLayoutParams().height = l.a(30);
        this.mSearchButton.setTextSize(1, m.a(m.a.INSTANCE.a(), true));
    }

    public void bindListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d54d418", new Object[]{this});
            return;
        }
        this.mSearchButton.setOnClickListener(this);
        this.delButton.setOnClickListener(this);
        this.mPhotoSearchButtonFont.setOnClickListener(this);
        LottieAnimationView lottieAnimationView = this.mPhotoSearchAnimView;
        if (lottieAnimationView != null) {
            lottieAnimationView.setOnClickListener(this);
        }
        this.mBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    SearchBarWidget.access$200(SearchBarWidget.this);
                }
            }
        });
        this.editText.setOnEditorActionListener(this);
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("77fdbb29", new Object[]{this, editable});
                }
            }

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
                SearchBarWidget.access$300(SearchBarWidget.this);
                SearchBarWidget.access$400(SearchBarWidget.this, charSequence, i, i3);
            }
        });
    }

    private void checkAndReportPaste(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7adbd85b", new Object[]{this, charSequence, new Integer(i), new Integer(i2)});
        } else if (!r.by()) {
        } else {
            CharSequence subSequence = charSequence.subSequence(i, i2 + i);
            if (this.clipboardContent == null) {
                this.clipboardContent = getClipboardContent();
            }
            if (TextUtils.isEmpty(this.clipboardContent) || TextUtils.isEmpty(subSequence) || !TextUtils.equals(subSequence, this.clipboardContent)) {
                return;
            }
            String f = getModel().f();
            HashMap hashMap = new HashMap();
            hashMap.put("content", y.b(this.clipboardContent.toString()));
            hashMap.put("contentType", "string");
            if (!TextUtils.isEmpty(f)) {
                hashMap.put("channelSrp", f);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Paste", 19997, "OnDeviceAI_Paste", TextUtils.isEmpty(f) ? "search" : "search_pingdao", "", hashMap).build());
        }
    }

    private void updateSearchBarHintUI(SearchBarHintBean searchBarHintBean) {
        SpannableString structuredHint;
        SearchUrlImageView searchUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd84ef7", new Object[]{this, searchBarHintBean});
            return;
        }
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        if (searchBarHintBean == null) {
            editText.setHint(DEFAULT_HINT);
            return;
        }
        String atmosImg = searchBarHintBean.getAtmosImg(isDarkMode());
        if (!TextUtils.isEmpty(atmosImg) && !poq.a(getActivity()) && (searchUrlImageView = (SearchUrlImageView) findView(R.id.view_promotion)) != null) {
            searchUrlImageView.setImageUrl(atmosImg);
        }
        if (searchBarHintBean.isStructuredHint() && !this.mIsElderHomeEdition && (structuredHint = getStructuredHint(searchBarHintBean.structuredInfo)) != null) {
            this.editText.setHint(structuredHint);
        } else if (TextUtils.isEmpty(searchBarHintBean.displayText)) {
            this.editText.setHint(DEFAULT_HINT);
        } else {
            this.editText.setHint(getHintContent(searchBarHintBean));
        }
    }

    private SpannableString getStructuredHint(SearchBarHintStructuredBean searchBarHintStructuredBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("1f4b1663", new Object[]{this, searchBarHintStructuredBean});
        }
        if (searchBarHintStructuredBean.getInfoList() == null || searchBarHintStructuredBean.getInfoList().isEmpty()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean isDarkMode = isDarkMode();
        for (com.taobao.search.searchdoor.searchbar.data.a aVar : searchBarHintStructuredBean.getInfoList()) {
            hme<?> a2 = hny.a(aVar, isDarkMode, getActivity());
            if (a2 != null) {
                a2.setCallback(this.editText);
                spannableStringBuilder.append(" ", new com.taobao.search.mmd.uikit.b(a2), 17).append((CharSequence) " ");
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    private CharSequence getHintContent(final SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f017bc62", new Object[]{this, searchBarHintBean});
        }
        if (TextUtils.isEmpty(searchBarHintBean.iconUrl) || searchBarHintBean.iconWidth == 0 || searchBarHintBean.iconHeight == 0 || r.S()) {
            return searchBarHintBean.displayText;
        }
        final int a2 = l.a(m.a(14, true));
        final int i = (int) ((a2 * searchBarHintBean.iconWidth) / searchBarHintBean.iconHeight);
        if (this.mHintIconDrawable == null) {
            com.taobao.phenix.intf.b.h().a(searchBarHintBean.iconUrl).addLoaderExtra(esr.BUNDLE_BIZ_CODE, "8920").succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null && !succPhenixEvent.isIntermediate()) {
                        drawable.setBounds(0, 0, i, a2);
                        SearchBarWidget.access$502(SearchBarWidget.this, drawable.mutate());
                        SearchBarWidget.access$500(SearchBarWidget.this).setAlpha(204);
                        SearchBarWidget.access$700(SearchBarWidget.this).post(new Runnable() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.7.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    SearchBarWidget.access$600(SearchBarWidget.this, searchBarHintBean);
                                }
                            }
                        });
                    }
                    return true;
                }
            }).fetch();
            return searchBarHintBean.displayText;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(searchBarHintBean.displayText);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.setSpan(new com.taobao.search.mmd.uikit.b(this.mHintIconDrawable), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.searchbtn || view.getId() == R.id.search_button_gif_view) {
            onSearchBtnClicked();
        } else if (view.getId() == R.id.edit_del_btn) {
            this.editText.setText("");
        } else if (view.getId() != R.id.photoBtn && view.getId() != R.id.lav_photo_btn) {
        } else {
            onImageSearchBtnClicked();
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
        com.taobao.search.mmd.util.e.a("IME_Search");
        onSearchBtnClicked();
        return true;
    }

    public void loadSearchHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66126fdc", new Object[]{this});
            return;
        }
        String h = this.mSearchDoorContext.h();
        SearchBarHintBean searchBarHintBean = null;
        if (TextUtils.isEmpty(this.mSearchDoorContext.f())) {
            searchBarHintBean = npw.a(AppPreference.getString(k.HOMEPAGE_PREFERENCE_KEY, ""));
            if (searchBarHintBean != null) {
                searchBarHintBean.handleMultiHint();
            }
        } else if (!TextUtils.isEmpty(h)) {
            searchBarHintBean = new SearchBarHintBean();
            searchBarHintBean.displayText = h;
            searchBarHintBean.searchText = h;
            searchBarHintBean.suggestRn = this.mSearchDoorContext.a("hint_suggest_rn");
            searchBarHintBean.handleMultiHint();
            trackChannelHintExpose(searchBarHintBean);
        }
        if (searchBarHintBean == null) {
            return;
        }
        if (!TextUtils.isEmpty(searchBarHintBean.aac)) {
            this.mSearchDoorContext.c("aac", searchBarHintBean.aac);
            postEvent(new nrj.f());
        }
        this.mSearchDoorContext.a("all", searchBarHintBean);
        applyDefaultSearchhint(searchBarHintBean);
        postEvent(nrj.d.a(searchBarHintBean));
        if (!searchBarHintBean.isAdvHint() || this.advHintTracked) {
            return;
        }
        AlimamaAdvertising.instance().buildTanxEventTracking(getActivity().getApplication(), searchBarHintBean.advInfo.getExposureParams()).a(noa.RUNTIME_PERMISSION_REQUEST_BIZ_NAME).a();
        this.advHintTracked = true;
    }

    private void trackChannelHintExpose(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd173931", new Object[]{this, searchBarHintBean});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("channelSrp", getModel().f());
        hashMap.put(k.KEY_SUGGEST_RN, searchBarHintBean.suggestRn);
        hashMap.put("item_id", getModel().a(fgl.TARGETITEMID));
        hashMap.put("q", searchBarHintBean.displayText);
        com.taobao.search.mmd.util.e.b("Page_SearchDoor_Button-DiWen-Exposure", hashMap);
    }

    private void applyDefaultSearchhint(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b74dd2", new Object[]{this, searchBarHintBean});
        } else if (searchBarHintBean == null) {
            nrn.a().a(Integer.valueOf(this.mSearchDoorContext.hashCode()), null);
        } else {
            try {
                nrn.a().a(Integer.valueOf(this.mSearchDoorContext.hashCode()), new JSONObject(JSON.toJSONString(searchBarHintBean)));
            } catch (JSONException unused) {
            }
            if (TextUtils.equals(this.mSearchDoorContext.i(), "all")) {
                updateSearchBarHintUI(searchBarHintBean);
            } else {
                updateSearchBarHintUI(null);
            }
        }
    }

    public void setSearchBarLeftTxt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e65ca27", new Object[]{this});
            return;
        }
        String b = getModel().b(k.a.PARAM_COMBO_BIZ_NAME, "");
        if (TextUtils.isEmpty(b)) {
            this.mSearchBarLeftContainer.setVisibility(8);
            return;
        }
        this.mSearchBarLeftContainer.setVisibility(0);
        this.mSearchBarLeftTxtTv.setText(b);
    }

    public void setSearchWord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba23665", new Object[]{this, str});
        } else if (this.editText == null) {
        } else {
            if (str == null) {
                str = "";
            }
            this.editText.setText(str);
            this.editText.setSelection(getSearchEditContent().length());
        }
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        nrn.a().a(Integer.valueOf(this.mSearchDoorContext.hashCode()));
        hideSoftKeyBoard();
        unregisterClipboardListener();
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        ntg a2 = nuu.INSTANCE.a(this.mSearchDoorContext.f());
        boolean z2 = a2 != null && a2.f == 10002;
        if (FestivalMgr.a().a("global") || z2) {
            if (!TextUtils.equals(FestivalMgr.a().d("global", nom.KEY_NAVI_STYLE), "0") && !z2) {
                z = false;
            }
            renderSearchBar(z);
            return;
        }
        renderSearchBar(false);
    }

    private void setStatusBarColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1424789", new Object[]{this, new Boolean(z)});
        } else {
            nud.a(z, getActivity());
        }
    }

    public void shakeHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55114b4", new Object[]{this});
        } else {
            this.editText.startAnimation(AnimationUtils.loadAnimation(Globals.getApplication(), R.anim.shake));
        }
    }

    public void showKeyBoard() {
        EditText editText;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315b686b", new Object[]{this});
        } else if (this.mShowingSpeechLayer || (editText = this.editText) == null) {
        } else {
            editText.setFocusable(true);
            this.editText.requestFocus();
            this.editText.setSelection(getSearchEditContent().length());
            ((InputMethodManager) Globals.getApplication().getSystemService("input_method")).showSoftInput(this.editText, 0);
            if (this.isKeyboardViewTreeObserverEnabled) {
                return;
            }
            getModel().a(getActivity(), true);
        }
    }

    private void renderSearchBar(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef907f8", new Object[]{this, new Boolean(z)});
        } else if (isDarkMode()) {
            this.mSearchBarInner.setBackground(null);
            this.mBackButton.setImageResource(R.drawable.actionbar_left_arrow);
            setStatusBarColor(false);
        } else {
            this.mBackButton.getDrawable().setColorFilter(z ? -1 : ContextCompat.getColor(Globals.getApplication(), R.color.black_33), PorterDuff.Mode.SRC_IN);
            setStatusBarColor(!z);
        }
    }

    public boolean isDarkMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue() : (getActivity() instanceof f) && ((f) getActivity()).g();
    }

    private void displayNormalSearchButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db704cea", new Object[]{this});
            return;
        }
        this.mSearchButton.setTextColor(ContextCompat.getColor(Globals.getApplication(), R.color.tbsearch_white));
        String f = getModel().f();
        if (this.isUOneStyle) {
            if (this.mTb2024Enabled) {
                this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_uone_new);
                this.mSearchButton.getLayoutParams().width = l.a(52.0f);
                this.mSearchButton.setTextSize(1, 13.0f);
                return;
            }
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_uone);
            this.mSearchButton.getLayoutParams().width = l.a(57.5f);
            this.mSearchButton.setTextSize(1, 14.4f);
        } else if (TextUtils.equals(f, "localSearch")) {
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_local_search);
        } else if (this.mTb2024Enabled) {
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn_new);
        } else {
            this.mSearchButton.setBackgroundResource(R.drawable.tbsearch_search_btn);
        }
    }

    public String getSearchEditContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cfdb408", new Object[]{this});
        }
        return (((Object) this.editText.getText()) + "").trim();
    }

    public void hideSoftKeyBoard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86c837a", new Object[]{this});
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) Globals.getApplication().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.editText.getWindowToken(), 0);
        if (this.isKeyboardViewTreeObserverEnabled) {
            return;
        }
        getModel().a(getActivity(), false);
    }

    public void onSearchBtnClicked() {
        String str;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce74979", new Object[]{this});
            return;
        }
        try {
            str = getSearchEditContent();
        } catch (Exception e) {
            q.a(TAG, "点击键盘获取搜索框关键词失败", e);
            str = str2;
        }
        SearchDoorContext searchDoorContext = this.mSearchDoorContext;
        SearchBarHintBean f = searchDoorContext.f(searchDoorContext.i());
        if (f != null) {
            str2 = f.searchText;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            shakeHint();
        } else {
            postEvent(nrj.c.a(str, f));
        }
    }

    private void handleTextChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f439f686", new Object[]{this});
            return;
        }
        String searchEditContent = getSearchEditContent();
        if (!TextUtils.isEmpty(searchEditContent)) {
            this.delButton.setVisibility(0);
            if (!this.mTb2024Enabled) {
                this.mPhotoSearchButtonFont.setVisibility(8);
            }
        } else {
            this.delButton.setVisibility(8);
            if (this.mIsPhotoSearchUnable) {
                this.mPhotoSearchButtonFont.setVisibility(8);
            } else {
                this.mPhotoSearchButtonFont.setVisibility(0);
            }
        }
        this.mSearchDoorContext.d(searchEditContent);
        this.mSearchDoorContext.h(searchEditContent);
        postEvent(nrj.b.a(searchEditContent));
    }

    private void onBackBtnClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec13999", new Object[]{this});
            return;
        }
        com.taobao.search.mmd.util.e.a("Back");
        this.mActivity.finish();
    }

    private void onImageSearchBtnClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81ba9d6", new Object[]{this});
            return;
        }
        try {
            ArrayMap arrayMap = new ArrayMap();
            String str = "ssk";
            String f = getModel().f();
            if (!TextUtils.isEmpty(f)) {
                str = str + "-" + f;
            }
            arrayMap.put("pssource", str);
            if (!TextUtils.isEmpty(nrf.f31681a)) {
                arrayMap.put("image_id", nrf.f31681a);
            }
            Nav.from(this.mActivity).toUri(y.a(k.PAILITAO_URL, (ArrayMap<String, String>) arrayMap));
            com.taobao.search.mmd.util.e.a("PhotoSearch_Enter");
        } catch (Throwable th) {
            q.a("SearchDoorActivity", "启动图搜失败！", th);
        }
    }

    private void checkAndShowCameraAnim(com.taobao.search.searchdoor.sf.widgets.activate.data.bean.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8147474", new Object[]{this, cVar});
        } else if (this.mPhotoSearchAnimView == null || this.cameraAnimChecked || cVar == null) {
        } else {
            this.cameraAnimChecked = true;
            if (!nqe.a(cVar)) {
                return;
            }
            this.mPhotoSearchButtonFont.setVisibility(8);
            this.mPhotoSearchAnimView.setVisibility(0);
            this.mPhotoSearchAnimView.setAnimationFromUrl(cVar.d);
            this.mPhotoSearchAnimView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass8 anonymousClass8, String str, Object... objArr) {
                    if (str.hashCode() == -2145066406) {
                        super.onAnimationEnd((Animator) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    super.onAnimationEnd(animator);
                    SearchBarWidget.access$800(SearchBarWidget.this).setVisibility(8);
                    SearchBarWidget.this.mPhotoSearchButtonFont.setVisibility(0);
                }
            });
        }
    }

    public void initSearchHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f87e86", new Object[]{this});
        } else if (this.mSearchDoorContext.l()) {
        } else {
            loadSearchHint();
        }
    }

    public void onEventMainThread(nre.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8a1b95", new Object[]{this, cVar});
            return;
        }
        initSearchHint();
        setSearchWord(this.mSearchDoorContext.b());
        setSearchBarLeftTxt();
    }

    public void onEventMainThread(nre.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8bed11", new Object[]{this, gVar});
        } else if (!gVar.f31680a || "true".equals(this.mSearchDoorContext.a(MspEventTypes.ACTION_STRING_HIDE_KEYBOARD))) {
        } else {
            if (this.mSearchDoorContext.l() || this.mSearchDoorContext.p() == 10002) {
                this.mHandler.post(this.mShowKeyboardRunnable);
                return;
            }
            SearchBarHintBean f = this.mSearchDoorContext.f("all");
            if ((f != null && TextUtils.equals(f.aac, "true")) || !this.mSearchDoorContext.k()) {
                return;
            }
            this.mHandler.postDelayed(this.mShowKeyboardRunnable, r.v());
        }
    }

    public void onEventMainThread(nre.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8932d7", new Object[]{this, aVar});
        } else {
            hideSoftKeyBoard();
        }
    }

    public void onEventMainThread(nrj.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8116df2", new Object[]{this, aVar});
        } else {
            hideSoftKeyBoard();
        }
    }

    public void onEventMainThread(nre.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8a8ff4", new Object[]{this, dVar});
        } else {
            this.mShowingSpeechLayer = dVar.f31677a;
        }
    }

    public void onEventMainThread(nrj.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8133f6e", new Object[]{this, eVar});
            return;
        }
        SearchBarHintBean searchBarHintBean = eVar.f31691a;
        if (searchBarHintBean == null) {
            return;
        }
        applyDefaultSearchhint(searchBarHintBean);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("display_text", searchBarHintBean.displayText);
        arrayMap.put("search_text", searchBarHintBean.searchText);
        arrayMap.put(k.KEY_SUGGEST_RN, searchBarHintBean.suggestRn);
        com.taobao.search.mmd.util.e.b(SearchDoorActivity.PAGE_NAME, "Page_SearchDoor_Show-inner_search_text", arrayMap);
    }

    public void onEventMainThread(nqw.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95b8fe1", new Object[]{this, dVar});
        } else {
            checkAndShowCameraAnim(dVar.f31672a.n);
        }
    }

    public void onHitDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95f2594", new Object[]{this});
            return;
        }
        this.mSearchBarInner.setBackground(null);
        this.mBackButton.setImageResource(R.drawable.actionbar_left_arrow);
        setStatusBarColor(false);
        bindNightResources();
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public void onPrimaryClipChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64145e28", new Object[]{this});
        } else {
            this.clipboardContent = getClipboardContent();
        }
    }
}
