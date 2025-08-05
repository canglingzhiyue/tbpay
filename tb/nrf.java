package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ImagePopTask;
import com.etao.feimagesearch.guide.PltNewUser;
import com.etao.feimagesearch.model.d;
import com.etao.feimagesearch.o;
import com.taobao.android.searchbaseframe.uikit.a;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.s;
import com.taobao.search.mmd.util.e;
import com.taobao.search.searchdoor.searchbar.data.SearchBarHintBean;
import com.taobao.search.searchdoor.sf.widgets.searchbar.SearchBarWidget;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.StringUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import tb.nre;
import tb.nrj;

/* loaded from: classes7.dex */
public class nrf extends iut implements View.OnClickListener, ImagePopTask.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31681a;
    private final Handler b;
    private final Runnable c;
    private final Runnable d;
    private PopupWindow e;
    private View f;
    private String g;
    private boolean h;
    private Map<String, String> i;
    private String j;
    private View k;
    private ViewGroup l;
    private SearchBarWidget m;

    public static /* synthetic */ Object ipc$super(nrf nrfVar, String str, Object... objArr) {
        if (str.hashCode() == 299066517) {
            super.onCtxPause();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "ImageSearchGuideWidget";
    }

    public static /* synthetic */ Activity a(nrf nrfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("17fb07f2", new Object[]{nrfVar}) : nrfVar.mActivity;
    }

    public static /* synthetic */ Activity b(nrf nrfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("551acc11", new Object[]{nrfVar}) : nrfVar.mActivity;
    }

    public static /* synthetic */ PopupWindow c(nrf nrfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("6c72143c", new Object[]{nrfVar}) : nrfVar.e;
    }

    static {
        kge.a(-750015488);
        kge.a(-1201612728);
        kge.a(352986083);
        f31681a = "";
    }

    public nrf(Activity activity, SearchBarWidget searchBarWidget, View view, ViewGroup viewGroup) {
        super(activity, searchBarWidget);
        this.b = new Handler(Looper.getMainLooper());
        this.c = new Runnable() { // from class: tb.nrf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    nrf.this.a();
                }
            }
        };
        this.d = new Runnable() { // from class: tb.nrf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (nrf.a(nrf.this) == null || nrf.b(nrf.this).isFinishing() || nrf.c(nrf.this) == null) {
                } else {
                    nrf.c(nrf.this).dismiss();
                }
            }
        };
        this.k = view;
        this.l = viewGroup;
        this.m = searchBarWidget;
        subscribeEvent(this);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    @Override // tb.iut
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        PopupWindow popupWindow = this.e;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
        this.b.removeCallbacks(this.d);
        this.e = null;
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        View view = this.f;
        if (view != null && view.getVisibility() != 8) {
            return;
        }
        try {
            com.b();
        } catch (Exception unused) {
            o.a();
        }
        if (r.aI()) {
            new ImagePopTask(this, 0).execute();
        } else {
            new ImagePopTask(this, 1).execute();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.f.setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) this.f.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f);
        }
        this.g = null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.preview_image) {
            if (this.mActivity == null) {
                return;
            }
            View view2 = this.f;
            if (view2 != null && view2.getVisibility() == 0) {
                this.f.setVisibility(8);
            }
            e.a("PhotoRecently");
            ArrayMap arrayMap = new ArrayMap();
            Map<String, String> map = this.i;
            if (map != null) {
                arrayMap.putAll(map);
            }
            if (this.h) {
                e.a("ImagePopLocal", (ArrayMap<String, String>) arrayMap);
                str = "ssklocal";
            } else {
                e.a("ImagePopRemote", (ArrayMap<String, String>) arrayMap);
                str = "sskremote";
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(k.PAILITAO_EDITOR_URL));
            Bundle bundle = new Bundle();
            if (this.g == null) {
                return;
            }
            String f = this.m.getModel().f();
            String str2 = "sskview";
            if (!TextUtils.isEmpty(f)) {
                str2 = str2 + "-" + f;
            }
            bundle.putString(d.EXTRA_KEY_PIC_URI, this.g);
            bundle.putString("pssource", str2);
            bundle.putString(d.KEY_PHOTO_FROM, str);
            intent.putExtra(d.EXTRA_KEY_BUNDLE_PARAM, bundle);
            this.mActivity.startActivity(intent);
            this.g = null;
        } else if (view.getId() != R.id.photo_preview_panel) {
        } else {
            a();
        }
    }

    private void b(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511f45a4", new Object[]{this, str, new Boolean(z), map});
            return;
        }
        Activity activity = getActivity();
        if (activity == null || this.k.getVisibility() != 0) {
            return;
        }
        if (this.f == null) {
            this.f = LayoutInflater.from(activity).inflate(R.layout.image_search_photo_preview_layout, this.l, false);
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        ((RelativeLayout.LayoutParams) layoutParams).addRule(6, R.id.tbsearch_searchbar_container);
        this.g = str;
        this.h = z;
        this.i = map;
        if (z) {
            e.b("Page_SearchDoor_Show-ImagePopLocal", map);
        } else {
            e.b("Page_SearchDoor_Show-ImagePopRemote", map);
        }
        TUrlImageView tUrlImageView = (TUrlImageView) this.f.findViewById(R.id.preview_image);
        tUrlImageView.setImageUrl(str);
        tUrlImageView.setOnClickListener(this);
        ((LinearLayout) this.f.findViewById(R.id.photo_preview_panel)).setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) this.f.findViewById(R.id.photo_preview_layout);
        linearLayout.setBackgroundResource(R.drawable.feis_capture_bg_up);
        int[] iArr = new int[2];
        this.k.getLocationOnScreen(iArr);
        if (iArr.length > 1) {
            int measuredWidth = (iArr[0] + (this.k.getMeasuredWidth() / 2)) - (DensityUtil.dip2px(activity, 105.0f) / 2);
            int dip2px = DensityUtil.dip2px(activity, 105.0f);
            int dip2px2 = DensityUtil.dip2px(activity, 143.0f);
            int dip2px3 = DensityUtil.dip2px(activity, 36.0f);
            if ((getActivity() instanceof a) && ((a) getActivity()).aF_()) {
                dip2px3 += SystemBarDecorator.getStatusBarHeight(this.mActivity);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dip2px, dip2px2);
            layoutParams2.setMargins(measuredWidth, dip2px3, 0, 0);
            linearLayout.setLayoutParams(layoutParams2);
            this.f.setVisibility(0);
        }
        ViewGroup viewGroup = (ViewGroup) this.f.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f);
        }
        this.l.addView(this.f);
        this.b.postDelayed(this.c, Constants.STARTUP_TIME_LEVEL_1);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing() || this.k == null || !d()) {
            return false;
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.image_search_new_member_guide_layout, (ViewGroup) null);
        inflate.measure(0, 0);
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        String V = r.V();
        if (!TextUtils.isEmpty(V)) {
            ((TextView) inflate.findViewById(R.id.tv_guide_text)).setText(V);
        }
        int measuredWidth2 = (this.k.getMeasuredWidth() / 2) - (measuredWidth / 2);
        this.e = new PopupWindow(inflate, measuredWidth, measuredHeight);
        this.e.setBackgroundDrawable(new BitmapDrawable());
        this.e.setOutsideTouchable(true);
        if (activity.isFinishing() || this.k.getVisibility() != 0) {
            return false;
        }
        this.e.showAsDropDown(this.k, measuredWidth2, 0);
        this.b.postDelayed(this.d, Constants.STARTUP_TIME_LEVEL_1);
        SharedPreferences a2 = s.a(activity);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putBoolean(k.IMAGE_SEARCH_NEW_MEMBER_GUIDE_INIT, true);
            edit.putLong(k.IMAGE_SEARCH_NEW_USER_GUIDE_TIME, System.currentTimeMillis());
            edit.apply();
        }
        return true;
    }

    public void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb445a", new Object[]{this, activity, new Boolean(z)});
        } else if (z) {
            a(activity);
        } else {
            a();
        }
    }

    public boolean d() {
        View view;
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Activity activity = getActivity();
        if (activity == null || (view = this.k) == null || view.getVisibility() != 0 || (a2 = s.a(activity)) == null) {
            return false;
        }
        String string = a2.getString(k.FORMER_IMAGE_SEARCH_GUIDE_KEYWORD, "");
        if (!StringUtil.isEmpty(this.j) && this.j.contains(k.PAILITAO_TEXT) && !this.j.equals(string)) {
            SharedPreferences a3 = s.a(activity);
            if (a3 != null) {
                SharedPreferences.Editor edit = a3.edit();
                edit.putString(k.FORMER_IMAGE_SEARCH_GUIDE_KEYWORD, this.j);
                edit.apply();
            }
            return true;
        } else if (!a2.getBoolean(k.IMAGE_SEARCH_NEW_MEMBER_GUIDE_INIT, false)) {
            return true;
        } else {
            if (!r.T() && PltNewUser.isNewUser(activity)) {
                if (System.currentTimeMillis() - s.a(activity).getLong(k.IMAGE_SEARCH_NEW_USER_GUIDE_TIME, 0L) >= r.U()) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.etao.feimagesearch.ImagePopTask.a
    public void a(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881e4e63", new Object[]{this, str, new Boolean(z), map});
        } else if (getActivity() == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                b(str, z, map);
            } else {
                z2 = b();
            }
            postEvent(new nrg(str, z2));
        }
    }

    public void onEventMainThread(nre.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8bed11", new Object[]{this, gVar});
        } else if (r.l()) {
        } else {
            a(this.mActivity, gVar.f31680a);
        }
    }

    public void onEventMainThread(nrj.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812cb0f", new Object[]{this, dVar});
        } else {
            a(dVar.f31690a);
        }
    }

    public void onEventMainThread(nrj.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8133f6e", new Object[]{this, eVar});
        } else {
            a(eVar.f31691a);
        }
    }

    private void a(SearchBarHintBean searchBarHintBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e043b093", new Object[]{this, searchBarHintBean});
        } else if (searchBarHintBean == null) {
        } else {
            a(searchBarHintBean.displayText);
        }
    }
}
