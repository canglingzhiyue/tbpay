package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.menu.g;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.PublicMenuPresenter;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.actionbar.model.PageInfoModel;
import com.taobao.uikit.actionbar.util.MenuMonitor;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cts;
import tb.hyt;
import tb.kge;

/* loaded from: classes9.dex */
public class TBPublicMenu implements MenuItem.OnMenuItemClickListener, LoginCallBack {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REPORT_ORANGE_KEY_USENEWREPORTURL = "usenewreporturl";
    private static final String REPORT_ORANGE_NAMESPACE = "ReportNewUrlAndroid";
    private static final String TAG = "TBPublicMenu";
    private static List<TBPublicMenuItem> sDefaultPublicMenus;
    private static InitShareCallBack sInitShareCallBack;
    private static List<TBPublicMenuItem> sNewDefaultPublicMenus;
    private static TBOnPublicMenuClickListener sOnPublicMenuClickListener;
    public static ArrayList<TBPublicMenuItem> sPublicMenus;
    private static TBLiteProgramOnOverflowButtonOnClickListener sTbLiteProgramOnOverflowButtonOnClickListener;
    private final WeakReference<Activity> mActivityRef;
    private MenuCallBack mCallBack;
    private TBActionView mCustomOverflow;
    private TBOnPublicMenuClickListener mDefaultPublicMenuListener;
    public ArrayList<TBPublicMenuItem> mExtensionMenu;
    public String mExtensionTitle;
    public ArrayList<TBPublicMenuItem> mExtraMenus;
    private ArrayList<g> mFilteredMenus;
    private int mMenuIconColor;
    private ArrayList<g> mMenuItems;
    public boolean mNeedPublicMenu;
    private TBOnOverflowButtonClickListener mOnOverflowButtonClickListener;
    private TBOnMenuHidedListener mOnTBOnMenuHidedListener;
    private TBOnMenuShowedListener mOnTBOnMenuShowedListener;
    private PublicMenuPresenter mPresentar;
    private TBPublicMenuData mTbPublicMenuData;
    private boolean mUseNewActionViewStyle;
    private OnShareMenuItemExposedListener onShareMenuItemExposed;
    private PageInfoModel pageInfoModel;

    /* loaded from: classes9.dex */
    public interface DefaultItemAction extends MenuCallBack {
        boolean isItemVisible();
    }

    /* loaded from: classes9.dex */
    public interface InitShareCallBack {
        void callBack(Activity activity, TBPublicMenu tBPublicMenu, Object obj);
    }

    /* loaded from: classes9.dex */
    public interface MenuCallBack {
        boolean onDefaultItemClicked(TBPublicMenuItem tBPublicMenuItem);
    }

    /* loaded from: classes9.dex */
    public interface OnShareMenuItemExposedListener {
        void onShareMenuItemExposed(TBPublicMenuItem tBPublicMenuItem, String str);
    }

    /* loaded from: classes9.dex */
    public interface TBLiteProgramOnOverflowButtonOnClickListener {
        void onOverflowButtonClicked(TBPublicMenu tBPublicMenu, Activity activity);
    }

    /* loaded from: classes9.dex */
    public interface TBOnLiteProgramClickListener {
        void onLiteProgramClicked(Context context, TBPublicMenuItem tBPublicMenuItem);
    }

    /* loaded from: classes9.dex */
    public interface TBOnMenuHidedListener {
        void onMenuHided();
    }

    /* loaded from: classes9.dex */
    public interface TBOnMenuShowedListener {
        void onMenuShowed();
    }

    /* loaded from: classes9.dex */
    public interface TBOnOverflowButtonClickListener {
        void onOverflowButtonClicked();
    }

    /* loaded from: classes9.dex */
    public interface TBOnPublicMenuClickListener {
        void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem);
    }

    @Deprecated
    public void addLiteProgram(ArrayList<TBPublicMenuItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98cb6a8e", new Object[]{this, arrayList});
        }
    }

    public boolean isNewActionBarOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96f1f17c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Deprecated
    public void needNewMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66082324", new Object[]{this, new Boolean(z)});
        }
    }

    @Deprecated
    public void setOnLiteProgramClickListener(TBOnLiteProgramClickListener tBOnLiteProgramClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e295f2e", new Object[]{this, tBOnLiteProgramClickListener});
        }
    }

    public static /* synthetic */ WeakReference access$000(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("4c4f4e30", new Object[]{tBPublicMenu}) : tBPublicMenu.mActivityRef;
    }

    public static /* synthetic */ PageInfoModel access$100(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageInfoModel) ipChange.ipc$dispatch("7f846670", new Object[]{tBPublicMenu}) : tBPublicMenu.pageInfoModel;
    }

    public static /* synthetic */ OnShareMenuItemExposedListener access$1000(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnShareMenuItemExposedListener) ipChange.ipc$dispatch("12b62634", new Object[]{tBPublicMenu}) : tBPublicMenu.onShareMenuItemExposed;
    }

    public static /* synthetic */ void access$1100(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c877df2", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.notifyMenuShown();
        }
    }

    public static /* synthetic */ void access$1200(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6521fd1", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.notifyMenuHidden();
        }
    }

    public static /* synthetic */ void access$1300(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("101cc1b0", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.clearReportArguments();
        }
    }

    public static /* synthetic */ void access$1400(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e7638f", new Object[]{tBPublicMenu});
        } else {
            tBPublicMenu.resetOnShareMenuItemExposedListener();
        }
    }

    public static /* synthetic */ void access$1500(TBPublicMenu tBPublicMenu, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f6cb2b8", new Object[]{tBPublicMenu, tBPublicMenuItem});
        } else {
            tBPublicMenu.onPublicMenuClicked(tBPublicMenuItem);
        }
    }

    public static /* synthetic */ TBActionView access$1600(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBActionView) ipChange.ipc$dispatch("b6801583", new Object[]{tBPublicMenu}) : tBPublicMenu.mCustomOverflow;
    }

    public static /* synthetic */ void access$1700(TBPublicMenu tBPublicMenu, TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70b26da", new Object[]{tBPublicMenu, tBActionView});
        } else {
            tBPublicMenu.onOverflowClicked(tBActionView);
        }
    }

    public static /* synthetic */ TBPublicMenuData access$200(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenuData) ipChange.ipc$dispatch("c89139ff", new Object[]{tBPublicMenu}) : tBPublicMenu.mTbPublicMenuData;
    }

    public static /* synthetic */ TBOnPublicMenuClickListener access$300(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBOnPublicMenuClickListener) ipChange.ipc$dispatch("9cf1f7c5", new Object[]{tBPublicMenu}) : tBPublicMenu.mDefaultPublicMenuListener;
    }

    public static /* synthetic */ boolean access$400(TBPublicMenu tBPublicMenu, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("21e7fe4c", new Object[]{tBPublicMenu, tBPublicMenuItem})).booleanValue() : tBPublicMenu.defaultItemClicked(tBPublicMenuItem);
    }

    public static /* synthetic */ String access$500(TBPublicMenu tBPublicMenu, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("439fc539", new Object[]{tBPublicMenu, str}) : tBPublicMenu.getAssembledUrl(str);
    }

    public static /* synthetic */ JSONObject access$600(TBPublicMenu tBPublicMenu, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4a5258a6", new Object[]{tBPublicMenu, bundle}) : tBPublicMenu.assembleUrlString(bundle);
    }

    public static /* synthetic */ TBOnPublicMenuClickListener access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBOnPublicMenuClickListener) ipChange.ipc$dispatch("8a0ba084", new Object[0]) : sOnPublicMenuClickListener;
    }

    public static /* synthetic */ ArrayList access$800(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("c332a34", new Object[]{tBPublicMenu}) : tBPublicMenu.mMenuItems;
    }

    public static /* synthetic */ ArrayList access$900(TBPublicMenu tBPublicMenu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("a8a12693", new Object[]{tBPublicMenu}) : tBPublicMenu.mFilteredMenus;
    }

    static {
        kge.a(-383296568);
        kge.a(78402243);
        kge.a(-923516484);
        sDefaultPublicMenus = new ArrayList();
        sNewDefaultPublicMenus = new ArrayList();
        sPublicMenus = new ArrayList<>();
        q.a(TBPopoverBridge.NAME, (Class<? extends e>) TBPopoverBridge.class, false);
    }

    public boolean isClickDefaultItem(Context context, TBPublicMenuItem tBPublicMenuItem) {
        String string;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52b25ff", new Object[]{this, context, tBPublicMenuItem})).booleanValue();
        }
        String str2 = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            MenuMonitor.countFailed("nav_failed", "context_is_null");
            return true;
        }
        int id = tBPublicMenuItem.getId();
        Bundle pageInfoBundle = this.pageInfoModel.getPageInfoBundle(activity);
        String str3 = "";
        if (id == R.id.uik_menu_feedback) {
            UTWrapper.itemClick(tBPublicMenuItem, this);
            TBPublicMenuItem extraMenuById = this.mTbPublicMenuData.getExtraMenuById(R.id.uik_menu_feedback);
            if (extraMenuById == null) {
                return true;
            }
            TBS.Adv.ctrlClicked(CT.Button, "Feedback", new String[0]);
            if (defaultItemClicked(extraMenuById)) {
                return true;
            }
            if (!pageInfoBundle.isEmpty()) {
                String assembledUrl = getAssembledUrl(extraMenuById.getNavUrl());
                if (StringUtils.isEmpty(assembledUrl)) {
                    MenuMonitor.countFailed("nav_failed", "feedback_url_is_empty");
                    return true;
                }
                try {
                    Bundle bundle = pageInfoBundle.getBundle(this.pageInfoModel.getExtraBundleKey());
                    if (bundle != null && bundle.getBundle(hyt.ZZB_BUNDLE_KEY) != null) {
                        str2 = bundle.getBundle(hyt.ZZB_BUNDLE_KEY).getString("_f");
                    }
                    if (!StringUtils.isEmpty(str2)) {
                        if (assembledUrl.contains("?")) {
                            assembledUrl = assembledUrl + "&_f=" + URLEncoder.encode(str2, "utf-8");
                        } else {
                            assembledUrl = assembledUrl + "?_f=" + URLEncoder.encode(str2, "utf-8");
                        }
                    }
                    Intent intent = activity.getIntent();
                    if (assembledUrl.contains("?")) {
                        StringBuilder sb = new StringBuilder(assembledUrl);
                        sb.append("&from_page=");
                        sb.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                        sb.append("&from_url=");
                        if (intent != null) {
                            if (intent.getData() != null) {
                                str3 = intent.getData().toString();
                            }
                            str3 = URLEncoder.encode(str3, "utf-8");
                        }
                        sb.append(str3);
                        str = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder(assembledUrl);
                        sb2.append("?from_page=");
                        sb2.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                        sb2.append("&from_url=");
                        if (intent != null) {
                            if (intent.getData() != null) {
                                str3 = intent.getData().toString();
                            }
                            str3 = URLEncoder.encode(str3, "utf-8");
                        }
                        sb2.append(str3);
                        str = sb2.toString();
                    }
                } catch (Exception e) {
                    String assembledUrl2 = getAssembledUrl(getAssembledUrl(extraMenuById.getNavUrl()));
                    MenuMonitor.countFailed("nav_exception", "feedback_" + e.toString());
                    str = assembledUrl2;
                }
                Nav.from(activity).withExtras(pageInfoBundle).toUri(str);
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener != null) {
                    tBOnPublicMenuClickListener.onPublicMenuItemClicked(extraMenuById);
                }
            } else {
                Nav.from(activity).withExtras(pageInfoBundle).toUri(extraMenuById.getNavUrl());
                TBS.Adv.ctrlClicked(CT.Button, "Feedback", new String[0]);
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener2 != null) {
                    tBOnPublicMenuClickListener2.onPublicMenuItemClicked(extraMenuById);
                }
            }
            return true;
        } else if (id == R.id.uik_menu_report) {
            UTWrapper.itemClick(tBPublicMenuItem, this);
            TBPublicMenuItem extraMenuById2 = this.mTbPublicMenuData.getExtraMenuById(R.id.uik_menu_report);
            if (extraMenuById2 != null) {
                int a2 = EnvironmentSwitcher.a();
                if (a2 == 1) {
                    string = activity.getString(R.string.uik_menu_report_url_pre_new);
                } else if (a2 == 2) {
                    string = activity.getString(R.string.uik_menu_report_url_test);
                } else {
                    string = activity.getString(R.string.uik_menu_report_url_online_new);
                }
                if (pageInfoBundle.isEmpty()) {
                    MenuMonitor.countFailed("nav_failed", "report_arg_null");
                }
                String shortClassName = activity.getComponentName().getShortClassName();
                Intent intent2 = activity.getIntent();
                if (intent2 != null && intent2.getData() != null) {
                    str3 = intent2.getData().toString();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("from_page", shortClassName);
                bundle2.putString("from_url", str3);
                pageInfoBundle.putBundle("ReportData", bundle2);
                StringBuilder sb3 = new StringBuilder(string);
                try {
                    if (assembleUrlString(pageInfoBundle) != null) {
                        str2 = URLEncoder.encode(assembleUrlString(pageInfoBundle).toString(), "utf-8");
                    }
                } catch (UnsupportedEncodingException e2) {
                    MenuMonitor.countFailed("nav_exception", "report " + e2.toString());
                }
                if (str2 != null) {
                    sb3.append("?args=");
                    sb3.append(str2);
                }
                Nav.from(activity).toUri(sb3.toString());
                TBS.Adv.ctrlClicked(CT.Button, "report", new String[0]);
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener3 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener3 != null) {
                    tBOnPublicMenuClickListener3.onPublicMenuItemClicked(extraMenuById2);
                }
            }
            return true;
        } else if (id != R.id.uik_menu_service) {
            return false;
        } else {
            UTWrapper.itemClick(tBPublicMenuItem, this);
            if (pageInfoBundle.isEmpty()) {
                MenuMonitor.countFailed("nav_failed", "service_at" + ("failed page:" + activity.getClass()));
                return true;
            }
            TBPublicMenuItem extraMenuById3 = this.mTbPublicMenuData.getExtraMenuById(R.id.uik_menu_service);
            if (extraMenuById3 == null) {
                return true;
            }
            TBS.Adv.ctrlClicked(CT.Button, "handService", new String[0]);
            if (defaultItemClicked(extraMenuById3)) {
                return true;
            }
            Nav.from(activity).withExtras(pageInfoBundle).toUri(getAssembledUrl(extraMenuById3.getNavUrl()));
            TBOnPublicMenuClickListener tBOnPublicMenuClickListener4 = this.mDefaultPublicMenuListener;
            if (tBOnPublicMenuClickListener4 != null) {
                tBOnPublicMenuClickListener4.onPublicMenuItemClicked(extraMenuById3);
            }
            return true;
        }
    }

    public void setOnShareMenuItemExposedListener(OnShareMenuItemExposedListener onShareMenuItemExposedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49db3afc", new Object[]{this, onShareMenuItemExposedListener});
        } else {
            this.onShareMenuItemExposed = onShareMenuItemExposedListener;
        }
    }

    private void resetOnShareMenuItemExposedListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a795658", new Object[]{this});
        } else {
            this.onShareMenuItemExposed = null;
        }
    }

    public void setReportArguments(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa2de29", new Object[]{this, iTBPublicMenu});
        } else {
            this.pageInfoModel.setReportArgs(iTBPublicMenu);
        }
    }

    private void clearReportArguments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16f1e7c", new Object[]{this});
        } else {
            this.pageInfoModel.clearReportArgs();
        }
    }

    public void registerMenuCallBack(MenuCallBack menuCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0a40bd", new Object[]{this, menuCallBack});
        } else {
            this.mCallBack = menuCallBack;
        }
    }

    public void setDefaultPageUserInfo(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5701dd26", new Object[]{this, bundle});
        } else {
            this.pageInfoModel.setDefaultPageInfoBundle(bundle);
        }
    }

    public TBPublicMenu(Activity activity) {
        this(activity, null);
    }

    public TBPublicMenu(Activity activity, ITBPublicMenu iTBPublicMenu) {
        this(activity, iTBPublicMenu, null);
    }

    private void addDefaultMenuClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65c56ec4", new Object[]{this});
        } else {
            this.mPresentar.addOnDefaultMenuClickListener(new TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    String access$500;
                    StringBuilder sb;
                    StringBuilder sb2;
                    String encode;
                    TBPublicMenuItem publicMenu;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                        return;
                    }
                    int id = tBPublicMenuItem.getId();
                    if (!TBPublicMenu.this.checkLogin() && tBPublicMenuItem.isNeedLogin()) {
                        TBPublicMenu.this.doLogin();
                    } else if (TBPublicMenu.access$000(TBPublicMenu.this) != null && TBPublicMenu.access$000(TBPublicMenu.this).get() != null) {
                        Activity activity = (Activity) TBPublicMenu.access$000(TBPublicMenu.this).get();
                        Bundle pageInfoBundle = TBPublicMenu.access$100(TBPublicMenu.this).getPageInfoBundle(activity);
                        if (id == R.id.uik_menu_wangxin) {
                            UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                            TBPublicMenuItem publicMenu2 = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_wangxin);
                            if (publicMenu2 == null) {
                                return;
                            }
                            TBS.Adv.ctrlClicked(CT.Button, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_WANG_WANG, new String[0]);
                            Nav.from(activity).toUri(publicMenu2.getNavUrl());
                            if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                return;
                            }
                            TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu2);
                        } else if (id == R.id.uik_menu_home) {
                            UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                            TBPublicMenuItem publicMenu3 = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_home);
                            if (publicMenu3 == null) {
                                return;
                            }
                            TBS.Adv.ctrlClicked(CT.Button, "Home", new String[0]);
                            if (TBPublicMenu.access$400(TBPublicMenu.this, publicMenu3)) {
                                return;
                            }
                            Nav.from(activity).toUri(publicMenu3.getNavUrl());
                            if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                return;
                            }
                            TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu3);
                        } else if (id == R.id.uik_menu_service) {
                            UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                            if (pageInfoBundle.isEmpty() || (publicMenu = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_service)) == null) {
                                return;
                            }
                            TBS.Adv.ctrlClicked(CT.Button, "handService", new String[0]);
                            if (TBPublicMenu.access$400(TBPublicMenu.this, publicMenu)) {
                                return;
                            }
                            Nav.from(activity).withExtras(pageInfoBundle).toUri(TBPublicMenu.access$500(TBPublicMenu.this, publicMenu.getNavUrl()));
                            if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                return;
                            }
                            TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu);
                        } else {
                            String str = null;
                            String str2 = "";
                            if (id == R.id.uik_menu_feedback) {
                                UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                                TBPublicMenuItem publicMenu4 = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_feedback);
                                if (publicMenu4 == null) {
                                    return;
                                }
                                TBS.Adv.ctrlClicked(CT.Button, "Feedback", new String[0]);
                                if (TBPublicMenu.access$400(TBPublicMenu.this, publicMenu4)) {
                                    return;
                                }
                                if (pageInfoBundle.isEmpty()) {
                                    Nav.from(activity).withExtras(pageInfoBundle).toUri(publicMenu4.getNavUrl());
                                    TBS.Adv.ctrlClicked(CT.Button, "Feedback", new String[0]);
                                    if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                        return;
                                    }
                                    TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu4);
                                    return;
                                }
                                String access$5002 = TBPublicMenu.access$500(TBPublicMenu.this, publicMenu4.getNavUrl());
                                if (StringUtils.isEmpty(access$5002)) {
                                    return;
                                }
                                try {
                                    Bundle bundle = pageInfoBundle.getBundle(TBPublicMenu.access$100(TBPublicMenu.this).getExtraBundleKey());
                                    if (bundle != null && bundle.getBundle(hyt.ZZB_BUNDLE_KEY) != null) {
                                        str = bundle.getBundle(hyt.ZZB_BUNDLE_KEY).getString("_f");
                                    }
                                    if (!StringUtils.isEmpty(str)) {
                                        if (access$5002.contains("?")) {
                                            sb2 = new StringBuilder(access$5002);
                                            sb2.append("&_f=");
                                            encode = URLEncoder.encode(str, "utf-8");
                                        } else {
                                            sb2 = new StringBuilder(access$5002);
                                            sb2.append("?_f=");
                                            encode = URLEncoder.encode(str, "utf-8");
                                        }
                                        sb2.append(encode);
                                        access$5002 = sb2.toString();
                                    }
                                    Intent intent = activity.getIntent();
                                    if (access$5002.contains("?")) {
                                        sb = new StringBuilder(access$5002);
                                        sb.append("&from_page=");
                                        sb.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                                        sb.append("&from_url=");
                                        if (intent != null) {
                                            if (intent.getData() != null) {
                                                str2 = intent.getData().toString();
                                            }
                                            str2 = URLEncoder.encode(str2, "utf-8");
                                        }
                                    } else {
                                        sb = new StringBuilder(access$5002);
                                        sb.append("?from_page=");
                                        sb.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                                        sb.append("&from_url=");
                                        if (intent != null) {
                                            if (intent.getData() != null) {
                                                str2 = intent.getData().toString();
                                            }
                                            str2 = URLEncoder.encode(str2, "utf-8");
                                        }
                                    }
                                    sb.append(str2);
                                    access$500 = sb.toString();
                                } catch (Exception unused) {
                                    TBPublicMenu tBPublicMenu = TBPublicMenu.this;
                                    access$500 = TBPublicMenu.access$500(tBPublicMenu, TBPublicMenu.access$500(tBPublicMenu, publicMenu4.getNavUrl()));
                                }
                                Nav.from(activity).withExtras(pageInfoBundle).toUri(access$500);
                                if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                    return;
                                }
                                TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu4);
                            } else if (id == R.id.uik_menu_mytaobao) {
                                UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                                TBPublicMenuItem publicMenu5 = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_mytaobao);
                                if (publicMenu5 == null) {
                                    return;
                                }
                                Nav.from(activity).toUri(publicMenu5.mNavUrl);
                                TBS.Adv.ctrlClicked(CT.Button, "mytaobao", new String[0]);
                                if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                    return;
                                }
                                TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu5);
                            } else if (id == R.id.uit_menu_shopping_cart) {
                                UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                                TBPublicMenuItem publicMenu6 = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uit_menu_shopping_cart);
                                if (publicMenu6 == null) {
                                    return;
                                }
                                Nav.from(activity).toUri(publicMenu6.mNavUrl);
                                TBS.Adv.ctrlClicked(CT.Button, "mycart", new String[0]);
                                if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                    return;
                                }
                                TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu6);
                            } else if (id == R.id.uik_menu_orderList) {
                                UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                                if (TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_orderList) == null) {
                                    return;
                                }
                                Nav.from(activity).toUri(tBPublicMenuItem.mNavUrl);
                                TBS.Adv.ctrlClicked(CT.Button, cts.a.BIZ_ORDER_LIST, new String[0]);
                                if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                    return;
                                }
                                TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(tBPublicMenuItem);
                            } else if (id == R.id.uik_menu_footpoint) {
                                UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                                TBPublicMenuItem publicMenu7 = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_footpoint);
                                if (publicMenu7 == null) {
                                    return;
                                }
                                Nav.from(activity).toUri(publicMenu7.mNavUrl);
                                TBS.Adv.ctrlClicked(CT.Button, "footPoint", new String[0]);
                                if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                    return;
                                }
                                TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu7);
                            } else if (id != R.id.uik_menu_report) {
                                UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                                if (TBPublicMenu.access$700() != null) {
                                    TBPublicMenu.access$700().onPublicMenuItemClicked(tBPublicMenuItem);
                                }
                                for (int i = 0; i < TBPublicMenu.access$800(TBPublicMenu.this).size(); i++) {
                                    if (TBPublicMenu.access$800(TBPublicMenu.this).get(i) != null && id == ((g) TBPublicMenu.access$800(TBPublicMenu.this).get(i)).getItemId() && StringUtils.equals(tBPublicMenuItem.getTitle(), ((g) TBPublicMenu.access$800(TBPublicMenu.this).get(i)).getTitle()) && !((g) TBPublicMenu.access$800(TBPublicMenu.this).get(i)).a()) {
                                        activity.onOptionsItemSelected((MenuItem) TBPublicMenu.access$800(TBPublicMenu.this).get(i));
                                    }
                                }
                                for (int i2 = 0; i2 < TBPublicMenu.access$900(TBPublicMenu.this).size(); i2++) {
                                    if (TBPublicMenu.access$900(TBPublicMenu.this).get(i2) != null && id == ((g) TBPublicMenu.access$900(TBPublicMenu.this).get(i2)).getItemId() && StringUtils.equals(tBPublicMenuItem.getTitle(), ((g) TBPublicMenu.access$900(TBPublicMenu.this).get(i2)).getTitle())) {
                                        if (!((g) TBPublicMenu.access$900(TBPublicMenu.this).get(i2)).a()) {
                                            activity.onOptionsItemSelected((MenuItem) TBPublicMenu.access$900(TBPublicMenu.this).get(i2));
                                        }
                                        if (!tBPublicMenuItem.getTitle().contains(b.a(R.string.app_share))) {
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } else {
                                UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this);
                                TBPublicMenuItem publicMenu8 = TBPublicMenu.access$200(TBPublicMenu.this).getPublicMenu(R.id.uik_menu_report);
                                if (publicMenu8 == null) {
                                    return;
                                }
                                int a2 = EnvironmentSwitcher.a();
                                String string = activity.getString(a2 == 1 ? R.string.uik_menu_report_url_pre_new : a2 == 2 ? R.string.uik_menu_report_url_test : R.string.uik_menu_report_url_online_new);
                                if (pageInfoBundle.isEmpty()) {
                                    MenuMonitor.countFailed("nav_failed", "report_arg_null");
                                }
                                String shortClassName = activity.getComponentName().getShortClassName();
                                Intent intent2 = activity.getIntent();
                                if (intent2 != null && intent2.getData() != null) {
                                    str2 = intent2.getData().toString();
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("from_page", shortClassName);
                                bundle2.putString("from_url", str2);
                                pageInfoBundle.putBundle("ReportData", bundle2);
                                StringBuilder sb3 = new StringBuilder(string);
                                try {
                                    if (TBPublicMenu.access$600(TBPublicMenu.this, pageInfoBundle) != null) {
                                        str = URLEncoder.encode(TBPublicMenu.access$600(TBPublicMenu.this, pageInfoBundle).toString(), "utf-8");
                                    }
                                } catch (UnsupportedEncodingException unused2) {
                                }
                                if (str != null) {
                                    sb3.append("?args=");
                                    sb3.append(str);
                                }
                                Nav.from(activity).toUri(sb3.toString());
                                TBS.Adv.ctrlClicked(CT.Button, "report", new String[0]);
                                if (TBPublicMenu.access$300(TBPublicMenu.this) == null) {
                                    return;
                                }
                                TBPublicMenu.access$300(TBPublicMenu.this).onPublicMenuItemClicked(publicMenu8);
                            }
                        }
                    }
                }
            });
        }
    }

    private void addCustomExternMenuClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240c42b2", new Object[]{this});
        } else {
            this.mPresentar.addOnExternMenuClickListener(new TBOnPublicMenuClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                        return;
                    }
                    int id = tBPublicMenuItem.getId();
                    Activity activity = (Activity) TBPublicMenu.access$000(TBPublicMenu.this).get();
                    if (activity == null || TBPublicMenu.this.isClickDefaultItem(activity, tBPublicMenuItem)) {
                        return;
                    }
                    UTWrapper.itemClick(tBPublicMenuItem, TBPublicMenu.this, true);
                    if (TBPublicMenu.access$700() != null) {
                        TBPublicMenu.access$700().onPublicMenuItemClicked(tBPublicMenuItem);
                    }
                    for (int i = 0; i < TBPublicMenu.access$800(TBPublicMenu.this).size(); i++) {
                        if (TBPublicMenu.access$800(TBPublicMenu.this).get(i) != null && id == ((g) TBPublicMenu.access$800(TBPublicMenu.this).get(i)).getItemId() && StringUtils.equals(tBPublicMenuItem.getTitle(), ((g) TBPublicMenu.access$800(TBPublicMenu.this).get(i)).getTitle()) && !((g) TBPublicMenu.access$800(TBPublicMenu.this).get(i)).a()) {
                            activity.onOptionsItemSelected((MenuItem) TBPublicMenu.access$800(TBPublicMenu.this).get(i));
                        }
                    }
                    for (int i2 = 0; i2 < TBPublicMenu.access$900(TBPublicMenu.this).size(); i2++) {
                        if (TBPublicMenu.access$900(TBPublicMenu.this).get(i2) != null && id == ((g) TBPublicMenu.access$900(TBPublicMenu.this).get(i2)).getItemId() && StringUtils.equals(tBPublicMenuItem.getTitle(), ((g) TBPublicMenu.access$900(TBPublicMenu.this).get(i2)).getTitle())) {
                            if (((g) TBPublicMenu.access$900(TBPublicMenu.this).get(i2)).a()) {
                                return;
                            }
                            activity.onOptionsItemSelected((MenuItem) TBPublicMenu.access$900(TBPublicMenu.this).get(i2));
                            return;
                        }
                    }
                }
            });
        }
    }

    private void addMenuItemAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ca10f0", new Object[]{this});
        } else {
            this.mPresentar.setOnMenuItemActions(new PublicMenuPresenter.MenuItemActions() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public boolean isItemVisible(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("89468e2b", new Object[]{this, new Integer(i)})).booleanValue();
                    }
                    return false;
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onItemExposed(TBPublicMenuItem tBPublicMenuItem, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("74339a5b", new Object[]{this, tBPublicMenuItem, str});
                    } else if (TBPublicMenu.access$1000(TBPublicMenu.this) == null) {
                    } else {
                        TBPublicMenu.access$1000(TBPublicMenu.this).onShareMenuItemExposed(tBPublicMenuItem, str);
                    }
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onMenuShown() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7076a2da", new Object[]{this});
                    } else {
                        TBPublicMenu.access$1100(TBPublicMenu.this);
                    }
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onMenuHidden() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43e3ebaf", new Object[]{this});
                        return;
                    }
                    TBPublicMenu.access$1200(TBPublicMenu.this);
                    TBPublicMenu.access$1300(TBPublicMenu.this);
                }

                @Override // com.taobao.uikit.actionbar.PublicMenuPresenter.MenuItemActions
                public void onShareMenuClear() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("791f8455", new Object[]{this});
                    } else {
                        TBPublicMenu.access$1400(TBPublicMenu.this);
                    }
                }
            });
        }
    }

    private void initPresenterAndModel(Activity activity, ITBPublicMenu iTBPublicMenu, ShareContentCallBack shareContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c53b0b", new Object[]{this, activity, iTBPublicMenu, shareContentCallBack});
            return;
        }
        if (b.c()) {
            this.mTbPublicMenuData = new GlobalizationData();
        } else {
            this.mTbPublicMenuData = new TBPublicMenuData();
        }
        this.mTbPublicMenuData.init(activity);
        sNewDefaultPublicMenus = this.mTbPublicMenuData.getDefaultPublicMenus();
        this.mTbPublicMenuData.addCustomMenus(TBPublicMenuData.sDefaultExtraMenus);
        PublicMenuV3 publicMenuV3 = new PublicMenuV3(activity);
        if (b.c()) {
            this.mPresentar = new GlobalizationPresenter(this.mTbPublicMenuData, publicMenuV3, this, activity, shareContentCallBack);
        } else {
            this.mPresentar = new PublicMenuPresenter(this.mTbPublicMenuData, publicMenuV3, this, activity, shareContentCallBack);
        }
        this.pageInfoModel = new PageInfoModel(iTBPublicMenu);
    }

    public TBPublicMenu(Activity activity, ITBPublicMenu iTBPublicMenu, ShareContentCallBack shareContentCallBack) {
        this.mExtraMenus = new ArrayList<>();
        this.mFilteredMenus = new ArrayList<>();
        this.mMenuItems = new ArrayList<>();
        this.mUseNewActionViewStyle = false;
        this.mNeedPublicMenu = false;
        initPresenterAndModel(activity, iTBPublicMenu, shareContentCallBack);
        addMenuItemAction();
        addDefaultMenuClickListener();
        addCustomExternMenuClickListener();
        this.mActivityRef = new WeakReference<>(activity);
        this.mMenuIconColor = ContextCompat.getColor(activity, R.color.uik_action_icon_normal);
    }

    public void togglePublicMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c9aad1", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedPublicMenu = z;
        }
    }

    public void useNewActionViewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ecd66a4", new Object[]{this});
        } else {
            this.mUseNewActionViewStyle = true;
        }
    }

    public Menu onCreateOptionsMenu(MenuInflater menuInflater, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("a5581c1c", new Object[]{this, menuInflater, menu});
        }
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            return menu;
        }
        this.mExtraMenus.clear();
        this.mPresentar.cleanExternMenus();
        this.mTbPublicMenuData.addCustomMenus(TBPublicMenuData.sDefaultExtraMenus);
        this.mFilteredMenus.clear();
        this.mMenuItems.clear();
        filterMenus(menu);
        if (this.mNeedPublicMenu && menu.findItem(R.id.uik_menu_overflow) == null) {
            menuInflater.inflate(R.menu.uik_menu_overflow_action, menu);
            final MenuItem findItem = menu.findItem(R.id.uik_menu_overflow);
            if (this.mCustomOverflow == null) {
                this.mCustomOverflow = new TBActionView(activity);
            }
            String charSequence = findItem.getTitle().toString();
            if (this.mUseNewActionViewStyle) {
                charSequence = charSequence.replace("ꈝ", "됻");
            }
            this.mCustomOverflow.setTitle(charSequence);
            this.mCustomOverflow.setIconColor(this.mMenuIconColor);
            findItem.setActionView(this.mCustomOverflow);
            this.mCustomOverflow.setId(R.id.uik_action_overflow);
            this.mCustomOverflow.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        TBPublicMenu.this.onMenuItemClick(findItem);
                    }
                }
            });
            findItem.setOnMenuItemClickListener(this);
            this.mCustomOverflow.onMessageUpdate(getPublicMenu(R.id.uik_menu_wangxin));
            this.mMenuItems.add((g) findItem);
        }
        this.mPresentar.notifyMenuChanged();
        return menu;
    }

    public Menu onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("b737a044", new Object[]{this, menu});
        }
        if (this.mCustomOverflow != null) {
            filterMenus(menu);
        }
        return menu;
    }

    private Menu filterMenus(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Menu) ipChange.ipc$dispatch("40901f9d", new Object[]{this, menu});
        }
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            return menu;
        }
        android.support.v7.view.menu.e eVar = (android.support.v7.view.menu.e) menu;
        int i = 0;
        while (true) {
            if (i >= eVar.size()) {
                break;
            }
            g gVar = (g) eVar.getItem(i);
            if (gVar != null) {
                if (gVar.k()) {
                    String charSequence = gVar.getTitle().toString();
                    if (charSequence.length() >= 2 && charSequence.indexOf(":") == 1) {
                        if (gVar.getActionView() != null && (gVar.getActionView() instanceof TBActionView)) {
                            ((TBActionView) gVar.getActionView()).setIconColor(this.mMenuIconColor);
                            break;
                        }
                        TBActionView tBActionView = new TBActionView(activity);
                        tBActionView.setTitle(charSequence);
                        tBActionView.setIconColor(this.mMenuIconColor);
                        tBActionView.setContentDescription(charSequence.substring(charSequence.indexOf(":"), charSequence.length()));
                        gVar.setActionView(tBActionView);
                        TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                        builder.setId(gVar.getItemId()).setTitle(gVar.getTitle().toString()).setIcon(gVar.getIcon());
                        final TBPublicMenuItem build = builder.build();
                        tBActionView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                } else {
                                    TBPublicMenu.access$1500(TBPublicMenu.this, build);
                                }
                            }
                        });
                        this.mMenuItems.add(gVar);
                    } else {
                        if (MenuItemCompat.getActionProvider(gVar) == null && gVar.getActionView() == null && gVar.getIcon() == null && !StringUtils.isEmpty(gVar.getTitle())) {
                            TBActionView tBActionView2 = new TBActionView(activity);
                            tBActionView2.setTitle(charSequence);
                            tBActionView2.setIconColor(this.mMenuIconColor);
                            tBActionView2.setContentDescription(charSequence);
                            gVar.setActionView(tBActionView2);
                            TBPublicMenuItem.Builder builder2 = new TBPublicMenuItem.Builder();
                            builder2.setId(gVar.getItemId()).setTitle(gVar.getTitle().toString()).setIcon(gVar.getIcon());
                            final TBPublicMenuItem build2 = builder2.build();
                            tBActionView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.6
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.View.OnClickListener
                                public void onClick(View view) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    } else {
                                        TBPublicMenu.access$1500(TBPublicMenu.this, build2);
                                    }
                                }
                            });
                        }
                        this.mMenuItems.add(gVar);
                    }
                } else {
                    TBPublicMenuItem.Builder builder3 = new TBPublicMenuItem.Builder();
                    builder3.setId(gVar.getItemId()).setTitle(gVar.getTitle().toString()).setIcon(gVar.getIcon());
                    this.mExtraMenus.add(builder3.build());
                    if (!StringUtils.isEmpty(gVar.getTitle().toString()) && gVar.getTitle().toString().contains(b.a(R.string.app_share))) {
                        gVar.setTitle("ꄪ:" + b.a(R.string.app_share));
                        builder3.setTitle("ꄪ:" + b.a(R.string.app_share));
                    }
                    this.mFilteredMenus.add(gVar);
                    this.mTbPublicMenuData.addCustomMenu(builder3.build());
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.mFilteredMenus.size(); i2++) {
            MenuItem menuItem = null;
            g gVar2 = this.mFilteredMenus.get(i2);
            if (gVar2 != null) {
                menuItem = eVar.findItem(gVar2.getItemId());
            }
            if (menuItem != null && !gVar2.k()) {
                eVar.removeItem(menuItem.getItemId());
            }
        }
        return menu;
    }

    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        updateMenuData();
        TBActionView tBActionView = this.mCustomOverflow;
        if (tBActionView == null) {
            return;
        }
        tBActionView.onMessageUpdate(getPublicMenu(R.id.uik_menu_wangxin));
    }

    public void notifyMenuChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907ec3d3", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.notifyMenuChanged();
    }

    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.pause();
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
        }
        if (this.mActivityRef.get() == null || menuItem == null) {
            return true;
        }
        if (menuItem.getItemId() == R.id.uik_menu_overflow) {
            View actionView = menuItem.getActionView();
            if (actionView instanceof TBActionView) {
                onOverflowClicked((TBActionView) actionView);
                return true;
            }
        }
        return false;
    }

    public void setCustomOverflow(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f1246a", new Object[]{this, tBActionView});
        } else if (tBActionView == null) {
        } else {
            this.mCustomOverflow = tBActionView;
            this.mCustomOverflow.setIconColor(this.mMenuIconColor);
            this.mCustomOverflow.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.TBPublicMenu.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TBPublicMenu tBPublicMenu = TBPublicMenu.this;
                    TBPublicMenu.access$1700(tBPublicMenu, TBPublicMenu.access$1600(tBPublicMenu));
                }
            });
            this.mCustomOverflow.onMessageUpdate(getPublicMenu(R.id.uik_menu_wangxin));
        }
    }

    public TBActionView getCustomOverflow() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBActionView) ipChange.ipc$dispatch("aef3b6c6", new Object[]{this});
        }
        if (this.mCustomOverflow == null && (activity = this.mActivityRef.get()) != null) {
            this.mCustomOverflow = new TBActionView(activity);
        }
        return this.mCustomOverflow;
    }

    @Deprecated
    public void addCustomMenus(ArrayList<TBPublicMenuItem> arrayList, TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0f0d795", new Object[]{this, arrayList, tBOnPublicMenuClickListener});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.addExternalMenuCustomiseItems(arrayList);
        this.mPresentar.addOnExternMenuClickListener(tBOnPublicMenuClickListener);
        this.mPresentar.addOnDefaultMenuClickListener(tBOnPublicMenuClickListener);
    }

    public void addExternalMenus(ArrayList<TBPublicMenuItem> arrayList, TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f6053b", new Object[]{this, arrayList, tBOnPublicMenuClickListener});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.addExternalMenuCustomiseItems(arrayList);
        this.mPresentar.addCustomizeExternalMenuClickListener(tBOnPublicMenuClickListener);
    }

    public void removeCustomMenuItemsByType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c15d62e", new Object[]{this, str});
            return;
        }
        TBPublicMenuData tBPublicMenuData = this.mTbPublicMenuData;
        if (tBPublicMenuData == null) {
            return;
        }
        tBPublicMenuData.removeExtraMenuItemByType(str);
    }

    @Deprecated
    public void setExtensionTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3824eac", new Object[]{this, str});
        } else {
            this.mExtensionTitle = str;
        }
    }

    @Deprecated
    public void setExtensionMenu(ArrayList<TBPublicMenuItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c54207", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            ArrayList<TBPublicMenuItem> arrayList2 = this.mExtensionMenu;
            if (arrayList2 == null) {
                this.mExtensionMenu = new ArrayList<>();
            } else {
                arrayList2.clear();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mExtensionMenu.add(arrayList.get(i));
            }
        }
    }

    private void onOverflowClicked(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2270edb9", new Object[]{this, tBActionView});
            return;
        }
        MenuMonitor.countSucceed("overflow_clicked");
        TBOnOverflowButtonClickListener tBOnOverflowButtonClickListener = this.mOnOverflowButtonClickListener;
        if (tBOnOverflowButtonClickListener != null) {
            tBOnOverflowButtonClickListener.onOverflowButtonClicked();
        }
        TBLiteProgramOnOverflowButtonOnClickListener tBLiteProgramOnOverflowButtonOnClickListener = sTbLiteProgramOnOverflowButtonOnClickListener;
        if (tBLiteProgramOnOverflowButtonOnClickListener != null) {
            tBLiteProgramOnOverflowButtonOnClickListener.onOverflowButtonClicked(this, this.mActivityRef.get());
        }
        UTWrapper.overflowClick();
        if (this.mPresentar == null) {
            return;
        }
        showInner(tBActionView);
    }

    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        MenuMonitor.countSucceed("menu_show_called");
        showInner(null);
    }

    private void showInner(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efd3126", new Object[]{this, tBActionView});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.show(tBActionView);
    }

    private void notifyMenuShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88b35b0", new Object[]{this});
            return;
        }
        TBOnMenuShowedListener tBOnMenuShowedListener = this.mOnTBOnMenuShowedListener;
        if (tBOnMenuShowedListener == null) {
            return;
        }
        tBOnMenuShowedListener.onMenuShowed();
    }

    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        MenuMonitor.countSucceed("menu_hide_called");
        hideInner();
    }

    private void hideInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef4ec4bb", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.close();
    }

    private void notifyMenuHidden() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61b399", new Object[]{this});
            return;
        }
        TBOnMenuHidedListener tBOnMenuHidedListener = this.mOnTBOnMenuHidedListener;
        if (tBOnMenuHidedListener == null) {
            return;
        }
        tBOnMenuHidedListener.onMenuHided();
    }

    public void closePopupMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab8001a", new Object[]{this});
            return;
        }
        MenuMonitor.countSucceed("menu_closePopupMenu_called");
        hideInner();
    }

    private void onPublicMenuClicked(TBPublicMenuItem tBPublicMenuItem) {
        Activity activity;
        String str;
        TBPublicMenuItem publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21abe8bf", new Object[]{this, tBPublicMenuItem});
        } else if (tBPublicMenuItem != null && (activity = this.mActivityRef.get()) != null) {
            UTWrapper.closeByButton = true;
            if (tBPublicMenuItem != null && tBPublicMenuItem.isMenuNeedToBeClosed()) {
                closePopupMenu();
            }
            int id = tBPublicMenuItem.getId();
            Bundle pageInfoBundle = this.pageInfoModel.getPageInfoBundle(activity);
            if (id == R.id.uik_menu_wangxin) {
                UTWrapper.itemClick(tBPublicMenuItem, this);
                TBPublicMenuItem publicMenu2 = getPublicMenu(R.id.uik_menu_wangxin);
                if (publicMenu2 == null) {
                    return;
                }
                TBS.Adv.ctrlClicked(CT.Button, com.alibaba.triver.triver_shop.newShop.ext.g.KEY_WANG_WANG, new String[0]);
                if (defaultItemClicked(publicMenu2)) {
                    return;
                }
                Nav.from(activity).toUri(publicMenu2.getNavUrl());
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener == null) {
                    return;
                }
                tBOnPublicMenuClickListener.onPublicMenuItemClicked(publicMenu2);
            } else if (id == R.id.uik_menu_home) {
                UTWrapper.itemClick(tBPublicMenuItem, this);
                TBPublicMenuItem publicMenu3 = getPublicMenu(R.id.uik_menu_home);
                if (publicMenu3 == null) {
                    return;
                }
                TBS.Adv.ctrlClicked(CT.Button, "Home", new String[0]);
                if (defaultItemClicked(publicMenu3)) {
                    return;
                }
                Nav.from(activity).toUri(publicMenu3.getNavUrl());
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener2 == null) {
                    return;
                }
                tBOnPublicMenuClickListener2.onPublicMenuItemClicked(publicMenu3);
            } else if (id == R.id.uik_menu_service) {
                UTWrapper.itemClick(tBPublicMenuItem, this);
                if (pageInfoBundle.isEmpty() || (publicMenu = getPublicMenu(R.id.uik_menu_service)) == null) {
                    return;
                }
                TBS.Adv.ctrlClicked(CT.Button, "handService", new String[0]);
                if (defaultItemClicked(publicMenu)) {
                    return;
                }
                Nav.from(activity).withExtras(pageInfoBundle).toUri(getAssembledUrl(publicMenu.getNavUrl()));
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener3 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener3 == null) {
                    return;
                }
                tBOnPublicMenuClickListener3.onPublicMenuItemClicked(publicMenu);
            } else if (id == R.id.uik_menu_feedback) {
                UTWrapper.itemClick(tBPublicMenuItem, this);
                TBPublicMenuItem publicMenu4 = getPublicMenu(R.id.uik_menu_feedback);
                if (publicMenu4 == null) {
                    return;
                }
                TBS.Adv.ctrlClicked(CT.Button, "Feedback", new String[0]);
                if (defaultItemClicked(publicMenu4)) {
                    return;
                }
                if (!pageInfoBundle.isEmpty()) {
                    String assembledUrl = getAssembledUrl(publicMenu4.getNavUrl());
                    if (StringUtils.isEmpty(assembledUrl)) {
                        return;
                    }
                    String str2 = null;
                    try {
                        Bundle bundle = pageInfoBundle.getBundle(this.pageInfoModel.getExtraBundleKey());
                        if (bundle != null && bundle.getBundle(hyt.ZZB_BUNDLE_KEY) != null) {
                            str2 = bundle.getBundle(hyt.ZZB_BUNDLE_KEY).getString("_f");
                        }
                        if (!StringUtils.isEmpty(str2)) {
                            assembledUrl = assembledUrl.indexOf("?") != -1 ? assembledUrl + "&_f=" + URLEncoder.encode(str2, "utf-8") : assembledUrl + "?_f=" + URLEncoder.encode(str2, "utf-8");
                        }
                        Intent intent = activity.getIntent();
                        String str3 = "";
                        if (assembledUrl.indexOf("?") != -1) {
                            StringBuilder sb = new StringBuilder(assembledUrl);
                            sb.append("&from_page=");
                            sb.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                            sb.append("&from_url=");
                            if (intent != null) {
                                if (intent.getData() != null) {
                                    str3 = intent.getData().toString();
                                }
                                str3 = URLEncoder.encode(str3, "utf-8");
                            }
                            sb.append(str3);
                            str = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder(assembledUrl);
                            sb2.append("?from_page=");
                            sb2.append(URLEncoder.encode(activity.getComponentName().getShortClassName(), "utf-8"));
                            sb2.append("&from_url=");
                            if (intent != null) {
                                if (intent.getData() != null) {
                                    str3 = intent.getData().toString();
                                }
                                str3 = URLEncoder.encode(str3, "utf-8");
                            }
                            sb2.append(str3);
                            str = sb2.toString();
                        }
                    } catch (Exception e) {
                        String assembledUrl2 = getAssembledUrl(getAssembledUrl(publicMenu4.getNavUrl()));
                        e.printStackTrace();
                        str = assembledUrl2;
                    }
                    Nav.from(activity).withExtras(pageInfoBundle).toUri(str);
                    TBOnPublicMenuClickListener tBOnPublicMenuClickListener4 = this.mDefaultPublicMenuListener;
                    if (tBOnPublicMenuClickListener4 == null) {
                        return;
                    }
                    tBOnPublicMenuClickListener4.onPublicMenuItemClicked(publicMenu4);
                    return;
                }
                Nav.from(activity).withExtras(pageInfoBundle).toUri(publicMenu4.getNavUrl());
                TBS.Adv.ctrlClicked(CT.Button, "Feedback", new String[0]);
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener5 = this.mDefaultPublicMenuListener;
                if (tBOnPublicMenuClickListener5 == null) {
                    return;
                }
                tBOnPublicMenuClickListener5.onPublicMenuItemClicked(publicMenu4);
            } else {
                ArrayList<TBPublicMenuItem> arrayList = this.mExtensionMenu;
                if (arrayList != null && arrayList.contains(tBPublicMenuItem)) {
                    if (StringUtils.isEmpty(tBPublicMenuItem.getNavUrl())) {
                        return;
                    }
                    Nav.from(activity).toUri(tBPublicMenuItem.getNavUrl());
                    return;
                }
                UTWrapper.itemClick(tBPublicMenuItem, this);
                TBOnPublicMenuClickListener tBOnPublicMenuClickListener6 = sOnPublicMenuClickListener;
                if (tBOnPublicMenuClickListener6 != null) {
                    tBOnPublicMenuClickListener6.onPublicMenuItemClicked(tBPublicMenuItem);
                }
                for (int i = 0; i < this.mMenuItems.size(); i++) {
                    if (this.mMenuItems.get(i) != null && id == this.mMenuItems.get(i).getItemId() && StringUtils.equals(tBPublicMenuItem.getTitle(), this.mMenuItems.get(i).getTitle()) && !this.mMenuItems.get(i).a()) {
                        activity.onOptionsItemSelected(this.mMenuItems.get(i));
                    }
                }
                for (int i2 = 0; i2 < this.mFilteredMenus.size(); i2++) {
                    if (this.mFilteredMenus.get(i2) != null && id == this.mFilteredMenus.get(i2).getItemId() && StringUtils.equals(tBPublicMenuItem.getTitle(), this.mFilteredMenus.get(i2).getTitle())) {
                        if (this.mFilteredMenus.get(i2).a()) {
                            return;
                        }
                        activity.onOptionsItemSelected(this.mFilteredMenus.get(i2));
                        return;
                    }
                }
            }
        }
    }

    private boolean defaultItemClicked(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1f21c10", new Object[]{this, tBPublicMenuItem})).booleanValue();
        }
        MenuCallBack menuCallBack = this.mCallBack;
        if (menuCallBack == null) {
            return false;
        }
        return menuCallBack.onDefaultItemClicked(tBPublicMenuItem);
    }

    @Deprecated
    public TBPublicMenuItem getExtraMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("da568f39", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < this.mExtraMenus.size(); i2++) {
            TBPublicMenuItem tBPublicMenuItem = this.mExtraMenus.get(i2);
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    public static TBPublicMenuItem getPublicMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("f37b4d54", new Object[]{new Integer(i)});
        }
        for (int i2 = 0; i2 < sNewDefaultPublicMenus.size(); i2++) {
            TBPublicMenuItem tBPublicMenuItem = sNewDefaultPublicMenus.get(i2);
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                return tBPublicMenuItem;
            }
        }
        return null;
    }

    @Deprecated
    public static void removePublicMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787527d0", new Object[]{new Integer(i)});
        } else {
            removePublicMenu(i, false);
        }
    }

    public static void removePublicMenu(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96308504", new Object[]{new Integer(i), new Boolean(z)});
            return;
        }
        for (int i2 = 0; i2 < sPublicMenus.size(); i2++) {
            TBPublicMenuItem tBPublicMenuItem = sPublicMenus.get(i2);
            if (tBPublicMenuItem != null && tBPublicMenuItem.getId() == i) {
                sPublicMenus.remove(i2);
                if (!z) {
                    return;
                }
                for (int i3 = 0; i3 < sDefaultPublicMenus.size(); i3++) {
                    TBPublicMenuItem tBPublicMenuItem2 = sDefaultPublicMenus.get(i3);
                    if (tBPublicMenuItem2 != null && tBPublicMenuItem2.getId() == i) {
                        sDefaultPublicMenus.remove(i3);
                        return;
                    }
                }
                return;
            }
        }
    }

    public TBPublicMenuItem getCustomMenu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("9fd4094c", new Object[]{this, new Integer(i)});
        }
        if (this.mExtraMenus == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.mExtraMenus.size(); i2++) {
            if (this.mExtraMenus.get(i2).getId() == i) {
                return this.mExtraMenus.get(i2);
            }
        }
        return null;
    }

    private String getAssembledUrl(String str) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de40011c", new Object[]{this, str});
        }
        WeakReference<Activity> weakReference = this.mActivityRef;
        String str2 = null;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return null;
        }
        Bundle pageInfoBundle = this.pageInfoModel.getPageInfoBundle(activity);
        if (pageInfoBundle.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        try {
            if (assembleUrlString(pageInfoBundle) != null) {
                str2 = URLEncoder.encode(assembleUrlString(pageInfoBundle).toString(), "utf-8");
            }
        } catch (UnsupportedEncodingException unused) {
        }
        if (str2 != null) {
            if (str.indexOf(63) != -1) {
                sb.append("&args=");
                sb.append(str2);
            } else {
                sb.append("?args=");
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    private JSONObject assembleUrlString(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b61b73ed", new Object[]{this, bundle});
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                if (bundle.get(str) instanceof Bundle) {
                    jSONObject.put(str, assembleUrlString((Bundle) bundle.get(str)));
                } else {
                    jSONObject.put(str, bundle.get(str));
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    @Deprecated
    public void setActionViewIconColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939fc08f", new Object[]{this, new Integer(i)});
            return;
        }
        this.mMenuIconColor = i;
        for (int i2 = 0; i2 < this.mMenuItems.size(); i2++) {
            if (this.mMenuItems.get(i2) != null && this.mMenuItems.get(i2).getActionView() != null && (this.mMenuItems.get(i2).getActionView() instanceof TBActionView)) {
                ((TBActionView) this.mMenuItems.get(i2).getActionView()).setIconColor(i);
            } else if (this.mMenuItems.get(i2).getActionView() != null && (this.mMenuItems.get(i2).getActionView() instanceof TextView)) {
                ((TextView) this.mMenuItems.get(i2).getActionView()).setTextColor(i);
            }
        }
        TBActionView tBActionView = this.mCustomOverflow;
        if (tBActionView == null) {
            return;
        }
        tBActionView.setIconColor(this.mMenuIconColor);
    }

    @Deprecated
    public static void updatePublicMenu(int i, TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76268a5b", new Object[]{new Integer(i), tBPublicMenuItem});
        } else {
            updatePublicMenu(tBPublicMenuItem, true);
        }
    }

    public static void updatePublicMenu(TBPublicMenuItem tBPublicMenuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb6c34e", new Object[]{tBPublicMenuItem});
        } else {
            updatePublicMenu(tBPublicMenuItem, true);
        }
    }

    public static void updatePublicMenu(TBPublicMenuItem tBPublicMenuItem, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7225946", new Object[]{tBPublicMenuItem, new Boolean(z)});
        } else if (tBPublicMenuItem != null && getPublicMenu(tBPublicMenuItem.getId()) != null && tBPublicMenuItem.checkValidation()) {
            if (sNewDefaultPublicMenus.isEmpty()) {
                sNewDefaultPublicMenus = TBPublicMenuData.sDefaultPublicMenus;
            }
            for (int i = 0; i < sNewDefaultPublicMenus.size(); i++) {
                TBPublicMenuItem tBPublicMenuItem2 = sNewDefaultPublicMenus.get(i);
                if (tBPublicMenuItem2 != null && tBPublicMenuItem2.getId() == tBPublicMenuItem.getId()) {
                    sNewDefaultPublicMenus.remove(tBPublicMenuItem2);
                    sNewDefaultPublicMenus.add(i, tBPublicMenuItem);
                }
            }
        }
    }

    private void updateMenuData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f435e119", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.notifyMenuChanged();
    }

    public void setOnOverflowButtonClickListener(TBOnOverflowButtonClickListener tBOnOverflowButtonClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e237f4", new Object[]{this, tBOnOverflowButtonClickListener});
        } else {
            this.mOnOverflowButtonClickListener = tBOnOverflowButtonClickListener;
        }
    }

    public void setOnMenuShowedListener(TBOnMenuShowedListener tBOnMenuShowedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69df3bce", new Object[]{this, tBOnMenuShowedListener});
        } else {
            this.mOnTBOnMenuShowedListener = tBOnMenuShowedListener;
        }
    }

    public void setOnMenuHidedListener(TBOnMenuHidedListener tBOnMenuHidedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9e30516", new Object[]{this, tBOnMenuHidedListener});
        } else {
            this.mOnTBOnMenuHidedListener = tBOnMenuHidedListener;
        }
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f68afe8", new Object[]{this, shareContentCallBack});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.setShareContentCallBack(shareContentCallBack);
    }

    public void setShareContentCallBack(ShareContentCallBack shareContentCallBack, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdadffec", new Object[]{this, shareContentCallBack, new Boolean(z)});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.setShareContentCallBack(shareContentCallBack, z);
    }

    private void cleanExternMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96ffc32", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.cleanExternMenus();
        this.mPresentar.clearAllExternMenuClickListeners();
    }

    public void clearExternalMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("996f9f23", new Object[]{this});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.clearExternalCustomiseItems();
        this.mPresentar.clearCustomizeExternalMenuClickListeners();
    }

    public void showMenuItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1e758d", new Object[]{this, new Integer(i)});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.showMenuItem(i);
    }

    public void showMenuItem(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcf4c80", new Object[]{this, str});
            return;
        }
        PublicMenuPresenter publicMenuPresenter = this.mPresentar;
        if (publicMenuPresenter == null) {
            return;
        }
        publicMenuPresenter.showMenuItem(str);
    }

    public static void setOnPublicMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816c9e9c", new Object[]{tBOnPublicMenuClickListener});
        } else {
            sOnPublicMenuClickListener = tBOnPublicMenuClickListener;
        }
    }

    public static void setTBLiteProgramOnOverflowButtonOnClickListener(TBLiteProgramOnOverflowButtonOnClickListener tBLiteProgramOnOverflowButtonOnClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4df84fc", new Object[]{tBLiteProgramOnOverflowButtonOnClickListener});
        } else {
            sTbLiteProgramOnOverflowButtonOnClickListener = tBLiteProgramOnOverflowButtonOnClickListener;
        }
    }

    public void setDefaultPublicMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa0e03a", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.mDefaultPublicMenuListener = tBOnPublicMenuClickListener;
        }
    }

    public static void registerInitShareCallBack(InitShareCallBack initShareCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a466ee71", new Object[]{initShareCallBack});
        } else {
            sInitShareCallBack = initShareCallBack;
        }
    }

    public static InitShareCallBack getInitShareCallBack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InitShareCallBack) ipChange.ipc$dispatch("341fde3e", new Object[0]) : sInitShareCallBack;
    }

    public void addOnShareMenuClickListener(TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdea6411", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.mPresentar.addOnShareMenuClickListener(tBOnPublicMenuClickListener);
        }
    }

    public void clearShareMenuListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af9bf0b5", new Object[]{this});
        } else {
            this.mPresentar.clearShareMenuListeners();
        }
    }

    public void addShareMenus(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25a064e", new Object[]{this, list});
        } else {
            this.mPresentar.addShareMenus(list);
        }
    }

    public void cleanShareMenus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34af0b05", new Object[]{this});
        } else {
            this.mPresentar.cleanShareMenus();
        }
    }

    public PublicMenuPresenter getPresentar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PublicMenuPresenter) ipChange.ipc$dispatch("9cdc503a", new Object[]{this}) : this.mPresentar;
    }

    @Override // com.taobao.uikit.actionbar.LoginCallBack
    public void doLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26139725", new Object[]{this});
        } else if (Login.checkSessionValid()) {
        } else {
            Login.login(true);
        }
    }

    @Override // com.taobao.uikit.actionbar.LoginCallBack
    public boolean checkLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71efb4c", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }
}
