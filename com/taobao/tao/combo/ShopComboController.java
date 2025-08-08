package com.taobao.tao.combo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.combo.c;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavCheckcollectResponse;
import com.taobao.tao.combo.dataobject.ComTaobaoMclFavCheckcollectResponseData;
import com.taobao.tao.combo.dataobject.ComboData;
import com.taobao.tao.combo.dataobject.ComboItemData;
import com.taobao.tao.combo.dataobject.ComboResponse;
import com.taobao.tao.combo.ui.DirectionVerticalViewPager;
import com.taobao.tao.combo.ui.DirectionViewPager;
import com.taobao.tao.combo.ui.IconPageIndicator;
import com.taobao.tao.combo.ui.VerticalViewPager;
import com.taobao.tao.combo.ui.VerticallinePageIndicator;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.extend.feature.view.TPriceTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.its;
import tb.kge;

/* loaded from: classes8.dex */
public class ShopComboController implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CANCEL_FAV_TYPE = 3;
    private static final int CHECK_COLLECT = 4;
    private static final int FAV_TYPE = 2;
    private static final int GETMEAL_TYPE = 1;
    private static final int UISIZE = 56;
    private String commonUTStr;
    private ActionBar mActionBar;
    private LinearLayout mButtomView;
    private Button mBuyBtn;
    private com.taobao.tao.combo.a mComboBusiness;
    private ComboData mComboData;
    private IconPageIndicator mComboIconPageIndicator;
    private long mComboId;
    private a mComboIdManager;
    private b mComboImageClickedObserve;
    private TPriceTextView mComboPrice;
    private c mComboViewPagerChangedObserve;
    private ShopComboActivity mContext;
    private d mCurrentComboData;
    private LinearLayout mDetailLayout;
    private com.taobao.tao.combo.e mErrorController;
    private com.taobao.tao.request.b mFavCollectBusiness;
    private ImageView mFavoriteImg;
    private LinearLayout mFavoriteLayout;
    private long mFirstEntryItemId;
    private boolean mIsLogin;
    private int mItemCount;
    private TextView mItemName;
    private TPriceTextView mItemPrice;
    private LinearLayout mLayout;
    private Animation mLoadAnimation;
    private PreLoadBusiness mPreLoadBusiness;
    private ProgressBar mProgressBar;
    private TextView mSavePrice;
    private long mSellerId;
    private RelativeLayout mTopView;
    private DirectionViewPager mViewPager;
    private com.taobao.tao.combo.d mViewPagerAdapter;
    private f mViewPagerManager;
    private String mWeapp;
    private String mWepk;
    private String mWpm;
    private boolean mIsGetNextData = false;
    private boolean mIsGetPreData = false;
    private boolean mIsVisibale = true;
    private int mCurrentItemIndex = 0;
    private boolean mIsFirstRequset = true;
    private ArrayList<View> mViews = new ArrayList<>();
    private boolean mIsAutoScrollBack = false;
    private boolean mIsVerticalScroll = false;
    private boolean mIsAddFavFromUnLogin = false;
    private BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.tao.combo.ShopComboController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null || AnonymousClass9.f19873a[valueOf.ordinal()] != 1 || ShopComboController.access$000(ShopComboController.this)) {
            } else {
                LoginBroadcastHelper.unregisterLoginReceiver(ShopComboController.access$100(ShopComboController.this), ShopComboController.access$200(ShopComboController.this));
                if (!ShopComboController.access$300(ShopComboController.this) || ShopComboController.access$400(ShopComboController.this) == null) {
                    return;
                }
                ShopComboController.access$002(ShopComboController.this, true);
                com.taobao.tao.combo.b.b();
                ShopComboController.access$502(ShopComboController.this, true);
                ShopComboController shopComboController = ShopComboController.this;
                ShopComboController.access$602(shopComboController, ShopComboController.access$400(shopComboController).b);
                ShopComboController shopComboController2 = ShopComboController.this;
                ShopComboController.access$702(shopComboController2, ShopComboController.access$400(shopComboController2).f19877a);
                ShopComboController shopComboController3 = ShopComboController.this;
                ShopComboController.access$800(shopComboController3, ShopComboController.access$700(shopComboController3), true);
                ShopComboController.access$402(ShopComboController.this, null);
            }
        }
    };

    /* renamed from: com.taobao.tao.combo.ShopComboController$9  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass9 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19873a = new int[LoginAction.values().length];

        static {
            try {
                f19873a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        kge.a(-226122157);
        kge.a(-525336021);
    }

    public static /* synthetic */ boolean access$000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de162d77", new Object[]{shopComboController})).booleanValue() : shopComboController.mIsLogin;
    }

    public static /* synthetic */ boolean access$002(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58457783", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsLogin = z;
        return z;
    }

    public static /* synthetic */ ShopComboActivity access$100(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopComboActivity) ipChange.ipc$dispatch("d108ecb", new Object[]{shopComboController}) : shopComboController.mContext;
    }

    public static /* synthetic */ com.taobao.tao.combo.a access$1000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.combo.a) ipChange.ipc$dispatch("9a7b2ac3", new Object[]{shopComboController}) : shopComboController.mComboBusiness;
    }

    public static /* synthetic */ boolean access$1102(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34f6913", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsAddFavFromUnLogin = z;
        return z;
    }

    public static /* synthetic */ long access$1300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7752fdd9", new Object[]{shopComboController})).longValue() : shopComboController.getCurrentItemId();
    }

    public static /* synthetic */ void access$1400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76dc97e6", new Object[]{shopComboController});
        } else {
            shopComboController.login();
        }
    }

    public static /* synthetic */ int access$1500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("766631da", new Object[]{shopComboController})).intValue() : shopComboController.mCurrentItemIndex;
    }

    public static /* synthetic */ ComboData access$1600(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ComboData) ipChange.ipc$dispatch("259f4a86", new Object[]{shopComboController}) : shopComboController.mComboData;
    }

    public static /* synthetic */ com.taobao.tao.request.b access$1700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.request.b) ipChange.ipc$dispatch("a665041a", new Object[]{shopComboController}) : shopComboController.mFavCollectBusiness;
    }

    public static /* synthetic */ String access$1800(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("360d85f6", new Object[]{shopComboController}) : shopComboController.commonUTStr;
    }

    public static /* synthetic */ long access$1900(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("748c99df", new Object[]{shopComboController})).longValue() : shopComboController.mSellerId;
    }

    public static /* synthetic */ BroadcastReceiver access$200(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("3036b82c", new Object[]{shopComboController}) : shopComboController.mBroadcastReceiver;
    }

    public static /* synthetic */ boolean access$2000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a5fd605", new Object[]{shopComboController})).booleanValue() : shopComboController.mIsVerticalScroll;
    }

    public static /* synthetic */ boolean access$2002(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5530e0b5", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsVerticalScroll = z;
        return z;
    }

    public static /* synthetic */ void access$2100(ShopComboController shopComboController, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7112dc60", new Object[]{shopComboController, str, str2, str3});
        } else {
            shopComboController.userTrack(str, str2, str3);
        }
    }

    public static /* synthetic */ f access$2200(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("661c7c1d", new Object[]{shopComboController}) : shopComboController.mViewPagerManager;
    }

    public static /* synthetic */ boolean access$2300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68fca408", new Object[]{shopComboController})).booleanValue() : shopComboController.mIsVisibale;
    }

    public static /* synthetic */ boolean access$2302(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a2dd312", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsVisibale = z;
        return z;
    }

    public static /* synthetic */ RelativeLayout access$2400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("1e754455", new Object[]{shopComboController}) : shopComboController.mTopView;
    }

    public static /* synthetic */ LinearLayout access$2500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("29f7245d", new Object[]{shopComboController}) : shopComboController.mButtomView;
    }

    public static /* synthetic */ ActionBar access$2600(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionBar) ipChange.ipc$dispatch("a0e0bfbd", new Object[]{shopComboController}) : shopComboController.mActionBar;
    }

    public static /* synthetic */ IconPageIndicator access$2700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IconPageIndicator) ipChange.ipc$dispatch("b36a6b8c", new Object[]{shopComboController}) : shopComboController.mComboIconPageIndicator;
    }

    public static /* synthetic */ boolean access$2800(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66aca60d", new Object[]{shopComboController})).booleanValue() : shopComboController.mIsAutoScrollBack;
    }

    public static /* synthetic */ boolean access$2802(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e27e11ad", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsAutoScrollBack = z;
        return z;
    }

    public static /* synthetic */ ArrayList access$2900(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d87abae4", new Object[]{shopComboController}) : shopComboController.mViews;
    }

    public static /* synthetic */ boolean access$300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dcb2fb7a", new Object[]{shopComboController})).booleanValue() : shopComboController.isLogin();
    }

    public static /* synthetic */ a access$3000(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("aaa8fa15", new Object[]{shopComboController}) : shopComboController.mComboIdManager;
    }

    public static /* synthetic */ void access$3100(ShopComboController shopComboController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d02102", new Object[]{shopComboController, new Integer(i)});
        } else {
            shopComboController.setTopViewData(i);
        }
    }

    public static /* synthetic */ String access$3200(ShopComboController shopComboController, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("df75339f", new Object[]{shopComboController, new Integer(i)}) : shopComboController.getResourcesString(i);
    }

    public static /* synthetic */ boolean access$3300(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5aa64a27", new Object[]{shopComboController})).booleanValue() : shopComboController.mIsGetPreData;
    }

    public static /* synthetic */ boolean access$3302(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6db8f0d3", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsGetPreData = z;
        return z;
    }

    public static /* synthetic */ boolean access$3400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a2fe428", new Object[]{shopComboController})).booleanValue() : shopComboController.mIsGetNextData;
    }

    public static /* synthetic */ boolean access$3402(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f6296f2", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsGetNextData = z;
        return z;
    }

    public static /* synthetic */ int access$3500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("59b97e18", new Object[]{shopComboController})).intValue() : shopComboController.mItemCount;
    }

    public static /* synthetic */ void access$3600(ShopComboController shopComboController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bcc470", new Object[]{shopComboController, str});
        } else {
            shopComboController.showToast(str);
        }
    }

    public static /* synthetic */ void access$3700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58ccb227", new Object[]{shopComboController});
        } else {
            shopComboController.showProgress();
        }
    }

    public static /* synthetic */ d access$400(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7d3810bb", new Object[]{shopComboController}) : shopComboController.mCurrentComboData;
    }

    public static /* synthetic */ d access$402(ShopComboController shopComboController, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("29a0c1fd", new Object[]{shopComboController, dVar});
        }
        shopComboController.mCurrentComboData = dVar;
        return dVar;
    }

    public static /* synthetic */ boolean access$500(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dbc62f7c", new Object[]{shopComboController})).booleanValue() : shopComboController.mIsFirstRequset;
    }

    public static /* synthetic */ boolean access$502(ShopComboController shopComboController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1095b61e", new Object[]{shopComboController, new Boolean(z)})).booleanValue();
        }
        shopComboController.mIsFirstRequset = z;
        return z;
    }

    public static /* synthetic */ long access$602(ShopComboController shopComboController, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23f201d", new Object[]{shopComboController, new Long(j)})).longValue();
        }
        shopComboController.mFirstEntryItemId = j;
        return j;
    }

    public static /* synthetic */ long access$700(ShopComboController shopComboController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dad9636e", new Object[]{shopComboController})).longValue() : shopComboController.mComboId;
    }

    public static /* synthetic */ long access$702(ShopComboController shopComboController, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3e8c63c", new Object[]{shopComboController, new Long(j)})).longValue();
        }
        shopComboController.mComboId = j;
        return j;
    }

    public static /* synthetic */ void access$800(ShopComboController shopComboController, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda89f4b", new Object[]{shopComboController, new Long(j), new Boolean(z)});
        } else {
            shopComboController.startRequest(j, z);
        }
    }

    /* loaded from: classes8.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public long f19877a;
        public long b;

        static {
            kge.a(438861616);
        }

        private d() {
        }
    }

    public ShopComboController(ShopComboActivity shopComboActivity) {
        this.mFirstEntryItemId = -1L;
        this.mIsLogin = false;
        this.mContext = shopComboActivity;
        com.taobao.tao.combo.b.b();
        this.mIsLogin = isLogin();
        Intent intent = this.mContext.getIntent();
        this.mSellerId = intent.getLongExtra("seller_id", -1L);
        this.mComboId = intent.getIntExtra("meal_id", -1);
        this.mFirstEntryItemId = intent.getLongExtra("item_id", -1L);
        this.mWeapp = intent.getStringExtra("wp_app");
        this.mWepk = intent.getStringExtra("wp_pk");
        this.mWpm = intent.getStringExtra("wp_m");
        if (-1 == this.mSellerId || -1 == this.mComboId || -1 == this.mFirstEntryItemId) {
            getDataFromUrl(this.mContext.getIntent().getData());
            if (-1 == this.mSellerId || -1 == this.mComboId || -1 == this.mFirstEntryItemId) {
                return;
            }
        }
        this.mViewPagerManager = new f();
        initView();
        init();
        this.commonUTStr = "collocation_id=" + this.mComboId + ",seller_id=" + this.mSellerId;
        startRequest(this.mComboId, true);
    }

    private boolean isLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue() : Login.getSid() != null;
    }

    public void onResume() {
        ComboData comboData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!isLogin() || this.mFavCollectBusiness == null || (comboData = this.mComboData) == null || comboData.itemList == null) {
        } else {
            this.mFavCollectBusiness.c(4, this.mComboData.itemList.get(this.mCurrentItemIndex).itemId);
        }
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        Properties properties = new Properties();
        properties.put("seller_id", Long.valueOf(this.mSellerId));
        this.mContext.a(properties);
    }

    public void onDestory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
            return;
        }
        com.taobao.tao.combo.b.b();
        com.taobao.tao.combo.a aVar = this.mComboBusiness;
        if (aVar != null) {
            aVar.destroy();
        }
        com.taobao.tao.request.b bVar = this.mFavCollectBusiness;
        if (bVar != null) {
            bVar.destroy();
        }
        PreLoadBusiness preLoadBusiness = this.mPreLoadBusiness;
        if (preLoadBusiness != null) {
            preLoadBusiness.destory();
        }
        f fVar = this.mViewPagerManager;
        if (fVar != null) {
            fVar.b();
        }
        this.mContext = null;
    }

    private void getDataFromUrl(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38106f9b", new Object[]{this, uri});
        } else if (uri == null) {
        } else {
            String queryParameter = uri.getQueryParameter("seller_id");
            String queryParameter2 = uri.getQueryParameter("meal_id");
            String queryParameter3 = uri.getQueryParameter("item_id");
            if (!StringUtils.isEmpty(queryParameter) && !StringUtils.isEmpty(queryParameter2) && !StringUtils.isEmpty(queryParameter3)) {
                try {
                    this.mSellerId = Long.parseLong(queryParameter);
                    this.mComboId = Integer.parseInt(queryParameter2);
                    this.mFirstEntryItemId = Long.parseLong(queryParameter3);
                    this.mWeapp = uri.getQueryParameter("wp_app");
                    this.mWepk = uri.getQueryParameter("wp_pk");
                    this.mWpm = uri.getQueryParameter("wp_m");
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.shop_combo_load_data_alpha);
        this.mActionBar = this.mContext.getSupportActionBar();
        this.mProgressBar = (ProgressBar) this.mContext.findViewById(R.id.shop_combo_view_progress);
        this.mTopView = (RelativeLayout) this.mContext.findViewById(R.id.shop_combo_main_top_view);
        this.mItemName = (TextView) this.mContext.findViewById(R.id.shop_combo_main_top_item_name_tv);
        this.mItemPrice = (TPriceTextView) this.mContext.findViewById(R.id.shop_combo_main_top_item_price_all);
        this.mFavoriteImg = (ImageView) this.mContext.findViewById(R.id.shop_combo_main_top_item_favorite_img);
        this.mFavoriteLayout = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_main_top_item_favorite);
        this.mDetailLayout = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_main_top_item_detail);
        this.mButtomView = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_main_buttom_view);
        this.mSavePrice = (TextView) this.mContext.findViewById(R.id.shop_combo_buttom_savemoney_tv);
        this.mBuyBtn = (Button) this.mContext.findViewById(R.id.shop_combo_buttom_buy_bt);
        this.mComboPrice = (TPriceTextView) this.mContext.findViewById(R.id.shop_combo_buttom_layout_price);
        this.mLayout = (LinearLayout) this.mContext.findViewById(R.id.shop_combo_buttom_layout);
        this.mViewPager = (DirectionViewPager) this.mContext.findViewById(R.id.shop_combo_viewpager);
        this.mViewPager.setOffscreenPageLimit(1);
        this.mComboIconPageIndicator = (IconPageIndicator) this.mContext.findViewById(R.id.shop_combo_buttom_layout_scroll);
        this.mComboIconPageIndicator.setIconClickedListener(new e());
        this.mComboImageClickedObserve = new b();
        this.mComboBusiness = new com.taobao.tao.combo.a(Globals.getApplication(), this.mSellerId, new Handler());
        this.mComboBusiness.setRemoteBaseListener(this);
        this.mPreLoadBusiness = new PreLoadBusiness(Globals.getApplication(), this.mSellerId);
        this.mFavCollectBusiness = new com.taobao.tao.request.b(Globals.getApplication());
        this.mFavCollectBusiness.setRemoteBaseListener(this);
        this.mErrorController = new com.taobao.tao.combo.e(this.mContext);
        this.mErrorController.a(new View.OnClickListener() { // from class: com.taobao.tao.combo.ShopComboController.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ShopComboController.access$1000(ShopComboController.this).a(1, ShopComboController.access$700(ShopComboController.this), ShopComboController.access$500(ShopComboController.this));
                }
            }
        });
    }

    private void login() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99739770", new Object[]{this});
            return;
        }
        LoginBroadcastHelper.registerLoginReceiver(this.mContext, this.mBroadcastReceiver);
        Login.login(true);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mTopView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.tao.combo.ShopComboController.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                return true;
            }
        });
        this.mFavoriteLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.combo.ShopComboController.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!StringUtils.isEmpty(Login.getSid())) {
                    if (ShopComboController.access$1600(ShopComboController.this).itemList.get(ShopComboController.access$1500(ShopComboController.this)).isFavor) {
                        ShopComboController.access$1700(ShopComboController.this).a(3, ShopComboController.access$1300(ShopComboController.this));
                    } else {
                        ShopComboController.access$1700(ShopComboController.this).b(2, ShopComboController.access$1300(ShopComboController.this));
                    }
                } else {
                    ShopComboController.access$1102(ShopComboController.this, true);
                    ShopComboController.access$002(ShopComboController.this, false);
                    ShopComboController shopComboController = ShopComboController.this;
                    ShopComboController.access$402(shopComboController, new d());
                    ShopComboController.access$400(ShopComboController.this).f19877a = ShopComboController.access$700(ShopComboController.this);
                    ShopComboController.access$400(ShopComboController.this).b = ShopComboController.access$1300(ShopComboController.this);
                    ShopComboController.access$1400(ShopComboController.this);
                }
            }
        });
        this.mDetailLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.combo.ShopComboController.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("id", Long.toString(ShopComboController.access$1300(ShopComboController.this)));
                bundle.putString("collocation_id", Long.toString(ShopComboController.access$700(ShopComboController.this)));
                Nav.from(Globals.getApplication()).withExtras(bundle).toUri(com.etao.feimagesearch.e.DETAIL_URL_PRE_1);
                com.taobao.android.shop.utils.d.a("Page_ShopcollocationDetail", "Button", "ItemDetail", ShopComboController.access$1800(ShopComboController.this) + ",item_id=" + ShopComboController.access$1300(ShopComboController.this));
            }
        });
        this.mBuyBtn.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.combo.ShopComboController.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("itemId", Long.toString(ShopComboController.access$1300(ShopComboController.this)));
                bundle.putString(com.taobao.android.detail.sdk.request.combo.a.K_COMBO_ID, Long.toString(ShopComboController.access$700(ShopComboController.this)));
                bundle.putString("sellerId", Long.toString(ShopComboController.access$1900(ShopComboController.this)));
                if (ShopComboController.access$1600(ShopComboController.this) != null && !StringUtils.isEmpty(ShopComboController.access$1600(ShopComboController.this).type)) {
                    bundle.putString("type", ShopComboController.access$1600(ShopComboController.this).type);
                }
                Nav.from(Globals.getApplication()).withExtras(bundle).toUri("http://h5.m.taobao.com/detailplugin/mix.html?itemId=" + Long.toString(ShopComboController.access$1300(ShopComboController.this)) + "&" + com.taobao.android.detail.sdk.request.combo.a.K_COMBO_ID + "=" + Long.toString(ShopComboController.access$700(ShopComboController.this)) + "&sellerId=" + Long.toString(ShopComboController.access$1900(ShopComboController.this)) + "&type=" + ShopComboController.access$1600(ShopComboController.this).type);
                StringBuilder sb = new StringBuilder();
                sb.append(ShopComboController.access$1800(ShopComboController.this));
                sb.append(",item_id=");
                sb.append(ShopComboController.access$1300(ShopComboController.this));
                com.taobao.android.shop.utils.d.a("Page_ShopcollocationDetail", "Button", "Buy", sb.toString());
            }
        });
    }

    private long getCurrentItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f0aa76ac", new Object[]{this})).longValue();
        }
        ComboData comboData = this.mComboData;
        if (comboData != null && comboData.itemList != null && this.mComboData.itemList.get(this.mCurrentItemIndex) != null) {
            try {
                return this.mComboData.itemList.get(this.mCurrentItemIndex).itemId;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return -1L;
    }

    private void startRequest(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eedc3964", new Object[]{this, new Long(j), new Boolean(z)});
        } else if (j < 0) {
            this.mErrorController.a(false);
        } else {
            this.mErrorController.a();
            showProgress();
            this.mComboBusiness.a(1, j, z);
        }
    }

    private void showProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83b03d1", new Object[]{this});
        } else {
            this.mProgressBar.setVisibility(0);
        }
    }

    private void hideProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("713c696", new Object[]{this});
        } else {
            this.mProgressBar.setVisibility(8);
        }
    }

    private ArrayList<View> genViews(int i) {
        ShopComboActivity shopComboActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fe3269f8", new Object[]{this, new Integer(i)});
        }
        this.mViews.clear();
        this.mViewPagerManager.b();
        ComboData comboData = this.mComboData;
        if (comboData == null || comboData.itemList == null || (shopComboActivity = this.mContext) == null) {
            return null;
        }
        LayoutInflater layoutInflater = shopComboActivity.getLayoutInflater();
        if (i != 0 && 3 != i) {
            this.mViews.add(layoutInflater.inflate(R.layout.shop_combo_padding_left_layout, (ViewGroup) null));
        }
        int size = this.mComboData.itemList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.shop_combo_vertical_view_pager_layout, (ViewGroup) null);
            DirectionVerticalViewPager directionVerticalViewPager = (DirectionVerticalViewPager) frameLayout.findViewById(R.id.shop_combo_vertical_view_pager);
            directionVerticalViewPager.setOffscreenPageLimit(1);
            com.taobao.tao.combo.c cVar = new com.taobao.tao.combo.c(this.mContext);
            directionVerticalViewPager.setAdapter(cVar);
            directionVerticalViewPager.setDirectionListener(new DirectionVerticalViewPager.a() { // from class: com.taobao.tao.combo.ShopComboController.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.combo.ui.DirectionVerticalViewPager.a
                public void a(int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i3), new Integer(i4)});
                    } else {
                        ShopComboController.access$2002(ShopComboController.this, true);
                    }
                }
            });
            cVar.a((c.b) this.mComboImageClickedObserve);
            VerticallinePageIndicator verticallinePageIndicator = (VerticallinePageIndicator) frameLayout.findViewById(R.id.shop_combo_vertical_indicator);
            verticallinePageIndicator.setViewPager(directionVerticalViewPager, 0);
            verticallinePageIndicator.setOnPageChangeListener(new VerticalViewPager.f() { // from class: com.taobao.tao.combo.ShopComboController.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.combo.ui.VerticalViewPager.f, com.taobao.tao.combo.ui.VerticalViewPager.d
                public void onPageSelected(int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i3)});
                    } else if (!ShopComboController.access$2000(ShopComboController.this)) {
                    } else {
                        ShopComboController.access$2002(ShopComboController.this, false);
                        ShopComboController.access$2100(ShopComboController.this, "Button", "RecommendItem", ag.ARG_ITEM_ID + ShopComboController.access$1300(ShopComboController.this) + ",collocation_id=" + ShopComboController.access$700(ShopComboController.this) + ",seller_id=" + ShopComboController.access$1900(ShopComboController.this));
                    }
                }
            });
            cVar.a(this.mComboData.itemList.get(i2).picUrlList);
            verticallinePageIndicator.notifyDataSetChanged();
            this.mViews.add(frameLayout);
            this.mViewPagerManager.a(cVar);
        }
        if (1 != i && 3 != i) {
            this.mViews.add(layoutInflater.inflate(R.layout.shop_combo_padding_right_layout, (ViewGroup) null));
        }
        return this.mViews;
    }

    private void setData(ComboResponse comboResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2390bb24", new Object[]{this, comboResponse});
        } else if (comboResponse == null || comboResponse.mo2429getData() == null) {
            this.mErrorController.a(false);
        } else {
            this.mComboData = comboResponse.mo2429getData();
            if (this.mComboData.mealIdList != null && this.mComboData.mealIdList.size() > 0) {
                this.mIsFirstRequset = false;
                com.taobao.tao.combo.b.a().a(Long.valueOf(this.mComboData.mealId), comboResponse);
                this.mComboIdManager = new a(this.mComboData.mealIdList, this.mComboData.mealId);
                this.mPreLoadBusiness.startRequest(this.mComboIdManager.a(this.mComboData.mealId));
            }
            a aVar = this.mComboIdManager;
            if (aVar == null || aVar.a() <= 0 || this.mComboData.itemList == null) {
                this.mErrorController.a(false);
                return;
            }
            this.mItemCount = this.mComboData.itemList.size();
            this.mComboIdManager.b(this.mComboData.mealId);
            freshTitle(this.mComboData.mealName, this.mComboIdManager.b());
            if (-1 != this.mFirstEntryItemId) {
                int size = this.mComboData.itemList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        i = 0;
                        break;
                    } else if (this.mFirstEntryItemId == this.mComboData.itemList.get(i).itemId) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (this.mIsAddFavFromUnLogin) {
                    this.mIsAddFavFromUnLogin = false;
                    if (isLogin() && !this.mComboData.itemList.get(i).isFavor) {
                        this.mFavCollectBusiness.b(2, this.mFirstEntryItemId);
                    }
                }
                this.mCurrentItemIndex = i;
                setAdapterData(i);
                setTopViewData(i);
                this.mFirstEntryItemId = -1L;
            } else {
                this.mCurrentItemIndex = 0;
                setAdapterData(0);
                setTopViewData(0);
            }
            setButtomViewData();
        }
    }

    private void freshTitle(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b228a549", new Object[]{this, str, new Long(j)});
        } else if (str == null || j < 0) {
        } else {
            this.mActionBar.a(str);
        }
    }

    private void setAdapterData(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8d8be5", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.mComboIdManager.f() && 1 != this.mComboIdManager.a()) {
            i2 = 0;
        } else if (this.mComboIdManager.e() && 1 != this.mComboIdManager.a()) {
            i2 = 1;
        } else if (1 == this.mComboIdManager.a()) {
            i2 = 3;
        }
        ArrayList<View> genViews = genViews(i2);
        ArrayList<ComboItemData> arrayList = this.mComboData.itemList;
        int size = arrayList.size();
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(com.taobao.android.shop.utils.e.a(arrayList.get(i3).mainPicUrl, 56));
        }
        this.mViewPager.startAnimation(this.mLoadAnimation);
        this.mViewPagerAdapter = new com.taobao.tao.combo.d();
        this.mViewPager.setAdapter(this.mViewPagerAdapter);
        this.mViewPager.setViewPagerClassify(i2);
        this.mComboViewPagerChangedObserve = new c();
        this.mViewPager.setOnDirectionPagerChangeListener(this.mComboViewPagerChangedObserve);
        this.mViewPager.setOnDirectionPagerMoved(this.mComboViewPagerChangedObserve);
        this.mComboIconPageIndicator.setViewPager(this.mViewPager, i);
        this.mComboIconPageIndicator.setOnPageChangeListener(this.mComboViewPagerChangedObserve);
        this.mViewPagerAdapter.a(genViews, arrayList2);
        this.mComboIconPageIndicator.notifyDataSetChanged();
    }

    private void setTopViewData(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4bd5fa", new Object[]{this, new Integer(i)});
            return;
        }
        ComboItemData comboItemData = this.mComboData.itemList.get(i);
        this.mCurrentItemIndex = i;
        ViewGroup.LayoutParams layoutParams = this.mItemName.getLayoutParams();
        layoutParams.width = ((com.taobao.android.shop.utils.f.b() - ((RelativeLayout) this.mContext.findViewById(R.id.shop_combo_main_top_view)).getPaddingLeft()) - g.a(this.mContext.findViewById(R.id.shop_combo_main_top_item_right_layout))) - 5;
        this.mItemName.setLayoutParams(layoutParams);
        this.mItemName.setSingleLine(true);
        this.mItemName.setEllipsize(StringUtils.TruncateAt.END);
        this.mItemName.setText(comboItemData.itemName);
        this.mItemPrice.setTextColor(this.mContext.getResources().getColor(R.color.SC_A_C));
        this.mItemPrice.setPrice((float) (comboItemData.itemPrice / 100.0d));
        setFavImage(comboItemData.isFavor);
    }

    private void setFavImage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2225aeb", new Object[]{this, new Boolean(z)});
        } else if (z) {
            setBackground(this.mFavoriteImg, getResourcesDrawable(R.drawable.shop_combo_favor));
        } else {
            setBackground(this.mFavoriteImg, getResourcesDrawable(R.drawable.shop_combo_no_favor));
        }
    }

    private void setBackground(View view, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142cf15f", new Object[]{this, view, drawable});
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    private void setButtomViewData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("952ad6c9", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (this.mComboData.type != null) {
            this.mLayout.removeAllViews();
            if (this.mComboData.type.equals(com.taobao.linkmanager.flowout.c.TMALL)) {
                this.mLayout.addView(this.mSavePrice);
                this.mLayout.addView(this.mComboPrice);
                long j = this.mComboData.savedMoney;
                if (0 == j) {
                    this.mComboPrice.setText("");
                    sb.delete(0, sb.length());
                    sb.append("");
                } else {
                    this.mComboPrice.setPrice((float) (j / 100.0d));
                    sb.delete(0, sb.length());
                    sb.append(getResourcesString(R.string.combo_save_price));
                }
            } else if (this.mComboData.type.equals("taobao")) {
                this.mLayout.addView(this.mComboPrice);
                this.mLayout.addView(this.mSavePrice);
                this.mComboPrice.setPrice((float) (this.mComboData.mealPrice / 100.0d));
                long j2 = this.mComboData.savedMoney;
                sb.delete(0, sb.length());
                if (0 == j2) {
                    sb.append("");
                } else {
                    int i = (int) ((j2 % 100) / 10);
                    int i2 = (int) (j2 % 10);
                    sb.append(getResourcesString(R.string.combo_save));
                    sb.append(j2 / 100);
                    if (i != 0 || i2 != 0) {
                        sb.append(getResourcesString(R.string.shop_dot));
                        String str2 = "0";
                        if (i == 0) {
                            str = str2;
                        } else {
                            str = i + "";
                        }
                        sb.append(str);
                        if (i2 != 0) {
                            str2 = i2 + "";
                        }
                        sb.append(str2);
                    }
                    sb.append(getResourcesString(R.string.combo_money_unit));
                }
            }
            this.mLayout.addView(this.mBuyBtn);
            this.mLayout.invalidate();
        }
        this.mSavePrice.setText(sb.toString());
    }

    private String getResourcesString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1022fd24", new Object[]{this, new Integer(i)}) : this.mContext.getResources().getString(i);
    }

    private Drawable getResourcesDrawable(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("200f510b", new Object[]{this, new Integer(i)}) : this.mContext.getResources().getDrawable(i);
    }

    private void showToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
            return;
        }
        Toast makeText = Toast.makeText(this.mContext, str, 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    private void userTrack(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39292765", new Object[]{this, str, str2, str3});
        } else if (str == null || str2 == null || str3 == null) {
        } else {
            TBS.Adv.ctrlClicked(CT.valueOf(str), str2, str3);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            errorProc(i, mtopResponse, obj);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            errorProc(i, mtopResponse, obj);
        }
    }

    private void errorProc(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ad09ff", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else if (this.mContext == null) {
        } else {
            if (i != 1) {
                if (i == 2) {
                    showToast(getResourcesString(R.string.combo_fav_fail));
                    return;
                } else if (i != 3) {
                    return;
                } else {
                    showToast(getResourcesString(R.string.combo_cancel_fav_fail));
                    return;
                }
            }
            hideProgress();
            com.taobao.tao.combo.e eVar = this.mErrorController;
            if (mtopResponse.getRetCode().equals("FAIL_SYS_FLOWLIMIT") || mtopResponse.getRetCode().equals(its.TRAFFIC_LIMIT_STATUS) || mtopResponse.getRetCode().equals("ANDROID_SYS_API_LOCKED_IN_10_SECONDS")) {
                z = true;
            }
            eVar.a(z);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.mContext == null) {
        } else {
            if (i == 1) {
                this.mErrorController.a();
                hideProgress();
                if (baseOutDo != null && (baseOutDo instanceof ComboResponse)) {
                    setData((ComboResponse) baseOutDo);
                } else {
                    this.mErrorController.a(false);
                }
            } else if (i == 2) {
                if (!(obj instanceof Long)) {
                    return;
                }
                Long l = (Long) obj;
                Iterator<ComboItemData> it = this.mComboData.itemList.iterator();
                while (it.hasNext()) {
                    ComboItemData next = it.next();
                    if (l.longValue() == next.itemId) {
                        next.isFavor = true;
                        com.taobao.android.shop.utils.d.a("Page_ShopcollocationDetail", "Button", "AddToFavorite", this.commonUTStr + ",item_id=" + next.itemId);
                        if (this.mCurrentItemIndex != this.mComboData.itemList.indexOf(next)) {
                            return;
                        }
                        setFavImage(next.isFavor);
                        return;
                    }
                }
            } else if (i == 3) {
                if (!(obj instanceof Long)) {
                    return;
                }
                Long l2 = (Long) obj;
                Iterator<ComboItemData> it2 = this.mComboData.itemList.iterator();
                while (it2.hasNext()) {
                    ComboItemData next2 = it2.next();
                    if (l2.longValue() == next2.itemId) {
                        next2.isFavor = false;
                        com.taobao.android.shop.utils.d.a("Page_ShopcollocationDetail", "Button", "CancleFavorite", this.commonUTStr + ",item_id=" + next2.itemId);
                        if (this.mCurrentItemIndex != this.mComboData.itemList.indexOf(next2)) {
                            return;
                        }
                        setFavImage(next2.isFavor);
                        return;
                    }
                }
            } else if (i != 4 || !(baseOutDo instanceof ComTaobaoMclFavCheckcollectResponse)) {
            } else {
                ComTaobaoMclFavCheckcollectResponseData mo2429getData = ((ComTaobaoMclFavCheckcollectResponse) baseOutDo).mo2429getData();
                Iterator<ComboItemData> it3 = this.mComboData.itemList.iterator();
                while (it3.hasNext()) {
                    ComboItemData next3 = it3.next();
                    if (mo2429getData.itemId == next3.itemId) {
                        next3.isFavor = mo2429getData.isFav;
                        if (this.mCurrentItemIndex != this.mComboData.itemList.indexOf(next3)) {
                            return;
                        }
                        setFavImage(next3.isFavor);
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public class e implements IconPageIndicator.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(591481981);
            kge.a(-1198432821);
        }

        private e() {
        }

        @Override // com.taobao.tao.combo.ui.IconPageIndicator.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (ShopComboController.access$1600(ShopComboController.this) == null || ShopComboController.access$1600(ShopComboController.this).itemList == null) {
            } else {
                com.taobao.android.shop.utils.d.a("Page_ShopcollocationDetail", "Button", "ItemPic", ShopComboController.access$1800(ShopComboController.this) + ",item_id=" + ShopComboController.access$1600(ShopComboController.this).itemList.get(i).itemId);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class b implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(104533523);
            kge.a(759510509);
        }

        public b() {
        }

        @Override // com.taobao.tao.combo.c.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (ShopComboController.access$2200(ShopComboController.this) != null) {
                int a2 = ShopComboController.access$2200(ShopComboController.this).a();
                for (int i = 0; i < a2; i++) {
                    ShopComboController.access$2200(ShopComboController.this).a(i).c();
                }
            }
            if (ShopComboController.access$2300(ShopComboController.this)) {
                ShopComboController.access$2302(ShopComboController.this, false);
                ShopComboController.access$2400(ShopComboController.this).setVisibility(8);
                ShopComboController.access$2500(ShopComboController.this).setVisibility(8);
                ShopComboController.access$2600(ShopComboController.this).e();
                return;
            }
            ShopComboController.access$2302(ShopComboController.this, true);
            ShopComboController.access$2400(ShopComboController.this).setVisibility(0);
            ShopComboController.access$2500(ShopComboController.this).setVisibility(0);
            ShopComboController.access$2600(ShopComboController.this).d();
        }
    }

    /* loaded from: classes8.dex */
    public class c implements ViewPager.OnPageChangeListener, DirectionViewPager.a, DirectionViewPager.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(956822249);
            kge.a(1848919473);
            kge.a(709543218);
            kge.a(-2022506983);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        public c() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else if (-1 == i) {
                ShopComboController.access$2700(ShopComboController.this).setCurrentItem(0);
                ShopComboController.access$2802(ShopComboController.this, true);
            } else if (-2 == i) {
                int size = ShopComboController.access$2900(ShopComboController.this).size() - 1;
                ShopComboController.access$2802(ShopComboController.this, true);
                if (ShopComboController.access$3000(ShopComboController.this).f()) {
                    ShopComboController.access$2700(ShopComboController.this).setCurrentItem(size - 1);
                } else {
                    ShopComboController.access$2700(ShopComboController.this).setCurrentItem(size - 2);
                }
            } else {
                if (!ShopComboController.access$2800(ShopComboController.this)) {
                    com.taobao.android.shop.utils.d.a("Page_ShopcollocationDetail", "Button", "MovePic", ShopComboController.access$1800(ShopComboController.this) + ",item_id=" + ShopComboController.access$1300(ShopComboController.this));
                }
                ShopComboController.access$2802(ShopComboController.this, false);
                ShopComboController.access$3100(ShopComboController.this, i);
            }
        }

        @Override // com.taobao.tao.combo.ui.DirectionViewPager.b
        public void a(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26196df8", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (3 == i) {
            } else {
                if (i != 0 && 1 == i2 && Math.abs(f) < (com.taobao.android.shop.utils.f.b() / 4) - 10) {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(0)).findViewById(R.id.shop_combo_padding_left_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_left_continue));
                    ShopComboController.access$3302(ShopComboController.this, false);
                } else if ((2 != i && i != 0) || ShopComboController.access$2900(ShopComboController.this).size() - 2 != i2 || Math.abs(f) >= (com.taobao.android.shop.utils.f.b() / 4) - 10) {
                } else {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(ShopComboController.access$2900(ShopComboController.this).size() - 1)).findViewById(R.id.shop_combo_padding_right_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_right_continue));
                    ShopComboController.access$3402(ShopComboController.this, false);
                }
            }
        }

        @Override // com.taobao.tao.combo.ui.DirectionViewPager.b
        public void b(int i, int i2, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfa9ad7", new Object[]{this, new Integer(i), new Integer(i2), new Float(f)});
            } else if (3 == i) {
            } else {
                if (i != 0 && 1 == i2 && f > com.taobao.android.shop.utils.f.b() / 4) {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(0)).findViewById(R.id.shop_combo_padding_left_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_left_get));
                    ShopComboController.access$3302(ShopComboController.this, true);
                } else if ((2 != i && i != 0) || ShopComboController.access$2900(ShopComboController.this).size() - 2 != i2 || f >= (-com.taobao.android.shop.utils.f.b()) / 4) {
                } else {
                    ((TextView) ((View) ShopComboController.access$2900(ShopComboController.this).get(ShopComboController.access$2900(ShopComboController.this).size() - 1)).findViewById(R.id.shop_combo_padding_right_layout_tv)).setText(ShopComboController.access$3200(ShopComboController.this, R.string.combo_padding_right_get));
                    ShopComboController.access$3402(ShopComboController.this, true);
                }
            }
        }

        @Override // com.taobao.tao.combo.ui.DirectionViewPager.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                if (ShopComboController.access$3300(ShopComboController.this)) {
                    a();
                }
                if (!ShopComboController.access$3000(ShopComboController.this).f() || i != 0) {
                    return;
                }
                ShopComboController shopComboController = ShopComboController.this;
                ShopComboController.access$3600(shopComboController, ShopComboController.access$3200(shopComboController, R.string.combo_first_combo_toast));
            } else {
                if (ShopComboController.access$3400(ShopComboController.this)) {
                    b();
                }
                if (!ShopComboController.access$3000(ShopComboController.this).e()) {
                    return;
                }
                if (ShopComboController.access$3500(ShopComboController.this) != i && (1 != ShopComboController.access$3000(ShopComboController.this).a() || ShopComboController.access$3500(ShopComboController.this) - 1 != i)) {
                    return;
                }
                ShopComboController shopComboController2 = ShopComboController.this;
                ShopComboController.access$3600(shopComboController2, ShopComboController.access$3200(shopComboController2, R.string.combo_last_combo_toast));
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ShopComboController.access$3700(ShopComboController.this);
            ShopComboController shopComboController = ShopComboController.this;
            ShopComboController.access$702(shopComboController, ShopComboController.access$3000(shopComboController).d());
            if (-1 != ShopComboController.access$700(ShopComboController.this)) {
                ShopComboController.access$1000(ShopComboController.this).a(1, ShopComboController.access$700(ShopComboController.this), false);
            }
            ShopComboController.access$3302(ShopComboController.this, false);
            a(ShopComboController.access$700(ShopComboController.this));
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            ShopComboController.access$3700(ShopComboController.this);
            ShopComboController shopComboController = ShopComboController.this;
            ShopComboController.access$702(shopComboController, ShopComboController.access$3000(shopComboController).c());
            if (-1 != ShopComboController.access$700(ShopComboController.this)) {
                ShopComboController.access$1000(ShopComboController.this).a(1, ShopComboController.access$700(ShopComboController.this), false);
            }
            ShopComboController.access$3402(ShopComboController.this, false);
            a(ShopComboController.access$700(ShopComboController.this));
        }

        private void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            ShopComboController.access$2100(ShopComboController.this, "Button", "NextMeal", "collocation_id=" + j + ",seller_id=" + ShopComboController.access$1900(ShopComboController.this));
        }
    }

    /* loaded from: classes8.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_COMBO_ID = -1;
        private ArrayList<Long> b;
        private long c;

        static {
            kge.a(-1740780875);
        }

        public a(ArrayList<Long> arrayList, long j) {
            this.b = arrayList;
            this.c = j;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b.size();
        }

        public ArrayList<Long> a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("fb533536", new Object[]{this, new Long(j)});
            }
            ArrayList<Long> arrayList = new ArrayList<>();
            if (j < 0) {
                return arrayList;
            }
            int a2 = a(Long.valueOf(j));
            int i = a2 - 1;
            if (i >= 0) {
                arrayList.add(this.b.get(i));
            }
            int i2 = a2 + 1;
            if (i2 < a()) {
                arrayList.add(this.b.get(i2));
            }
            return arrayList;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : a(Long.valueOf(this.c));
        }

        public void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }

        public int a(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5ed6d49a", new Object[]{this, l})).intValue();
            }
            if (l.longValue() >= 0) {
                return this.b.indexOf(l);
            }
            return -1;
        }

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            if (!e()) {
                return this.b.get(b() + 1).longValue();
            }
            return -1L;
        }

        public long d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
            }
            if (!f()) {
                return this.b.get(b() - 1).longValue();
            }
            return -1L;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : b() == this.b.size() - 1;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : b() == 0;
        }
    }
}
