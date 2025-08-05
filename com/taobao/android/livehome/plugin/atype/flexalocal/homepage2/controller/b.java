package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.simple.SimpleQuerySafeResponseData;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.e;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.g;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.h;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.j;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.m;
import com.taobao.live.home.dinamic.widget.DXTBLNativeTextView;
import com.taobao.live.home.widget.tab.XTabLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mfg;
import tb.mfj;
import tb.pqj;
import tb.sqt;

/* loaded from: classes6.dex */
public class b implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private sqt f14191a;
    private ImageView b;
    private XTabLayout d;
    private int e;
    private int f;
    private Context g;
    private List<TabManager.TabUp> h;
    private boolean i;
    private SimpleQuerySafeResponseData j;
    private boolean l;
    private View m;
    private View n;
    private int o;
    private boolean p;
    private Handler q;
    private boolean s;
    private View t;
    private boolean u;
    private boolean v;
    private int w;
    private LinearLayout x;
    private boolean c = true;
    private int k = 0;
    private boolean r = false;

    static {
        kge.a(1861946209);
        kge.a(-1043440182);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Map a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8cdd546f", new Object[]{bVar, str}) : bVar.c(str);
    }

    public static /* synthetic */ sqt a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("6d198380", new Object[]{bVar}) : bVar.f14191a;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed752ee8", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.p = z;
        return z;
    }

    public b(View view, Context context, XTabLayout xTabLayout, List<TabManager.TabUp> list, sqt sqtVar) {
        this.f14191a = sqtVar;
        this.b = (ImageView) view.findViewById(R.id.homepage2_back);
        this.x = (LinearLayout) view.findViewById(R.id.homepage_new_search_bar);
        this.g = context;
        this.h = list;
        this.d = xTabLayout;
        if (this.g != null) {
            this.f = context.getResources().getColor(R.color.homepage2024_tab_text_color);
            this.e = context.getResources().getColor(R.color.homepage2024_tab_text_color_b_unselected);
            this.w = context.getResources().getColor(R.color.homepage2024_tab_text_color_b_selected);
        }
        this.q = new Handler(this);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.u = z;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.u;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.n = view.findViewById(R.id.live_top_atmosphere_layout);
            this.t = view.findViewById(R.id.live_top_background);
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.n == null || this.t == null) {
        } else {
            int i3 = i2;
            if (i3 > i) {
                i3 = i;
            }
            if (Math.abs(i3) >= i) {
                return;
            }
            if (this.n.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i3;
                }
                this.n.setLayoutParams(marginLayoutParams);
                this.n.requestLayout();
            } else if (this.t.getVisibility() != 0) {
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = i3;
                }
                this.t.setLayoutParams(marginLayoutParams2);
                this.t.requestLayout();
            }
        }
    }

    public void a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else if (this.m == null || this.t == null || this.n == null) {
        } else {
            int i3 = i2;
            if (i3 > i) {
                i3 = i;
            }
            if (Math.abs(i3) > i) {
                return;
            }
            if (this.n.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = -i3;
                }
                this.n.setLayoutParams(marginLayoutParams);
                this.n.requestLayout();
            } else if (this.t.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = -i3;
                }
                this.t.setLayoutParams(marginLayoutParams2);
                this.t.requestLayout();
            }
            if ((!z && !i.c()) || this.o == i3) {
                return;
            }
            this.o = i3;
            float f = i3 / 100.0f;
            if (f <= 0.0f && this.m.getAlpha() != 0.0f) {
                this.m.setAlpha(0.0f);
                if (this.s) {
                    a(false);
                }
            }
            if (f >= 1.0f && this.m.getAlpha() != 1.0f) {
                this.m.setAlpha(1.0f);
                a(true);
            }
            if (f > 0.0f && f < 1.0f) {
                this.m.setAlpha(f);
            }
            this.m.invalidate();
        }
    }

    public View i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aec84b2", new Object[]{this}) : this.m;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = z;
        b(z);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.v;
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            this.v = z;
            if (z) {
                e(true);
                h.a((Activity) this.g, z, R.color.homepage_transparent);
                if (this.b == null) {
                    return;
                }
                this.b.setImageResource(R.drawable.live_back_b_flexalocal);
                return;
            }
            if (this.b != null) {
                this.b.setImageResource(R.drawable.live_back_flexalocal);
            }
            e(false);
            h.a((Activity) this.g);
        } catch (Throwable th) {
            mfj.a("SelectedTopColorCtrl", "switch color exp.", th);
        }
    }

    private void e(boolean z) {
        List<TabManager.TabUp> list;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (this.d != null && (list = this.h) != null && list.size() > 0) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                XTabLayout.d tabAt = this.d.getTabAt(i2);
                if (tabAt != null && tabAt.h() != null) {
                    if (tabAt.q()) {
                        if (z) {
                            i = this.w;
                        } else {
                            i = this.f;
                        }
                    } else if (z) {
                        i = this.e;
                    } else {
                        i = this.f;
                    }
                    View customView = tabAt.h().getCustomView();
                    if (customView != null) {
                        TextView textView = (TextView) customView.findViewById(R.id.tabitem_text);
                        DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) customView.findViewById(R.id.tabitem_longtext);
                        if (textView != null && textView.getVisibility() == 0) {
                            textView.setTextColor(i);
                            textView.invalidate();
                        }
                        if (dXTBLNativeTextView != null && dXTBLNativeTextView.getVisibility() == 0) {
                            dXTBLNativeTextView.setTextColor(i);
                            dXTBLNativeTextView.invalidate();
                        }
                    }
                }
            }
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.k;
    }

    public View a(int i) {
        List<TabManager.TabUp> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
        }
        if (this.g == null || (list = this.h) == null || list.size() == 0 || i < 0 || i >= this.h.size()) {
            return null;
        }
        View inflate = LayoutInflater.from(this.g).inflate(R.layout.xtab_extend_layout_flexalocal, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tabitem_text);
        DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) inflate.findViewById(R.id.tabitem_longtext);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.tabitem_left);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tabitem_right);
        TabManager.TabUp tabUp = this.h.get(i);
        if (tabUp != null) {
            String str = this.h.get(i).name;
            String str2 = tabUp.channelType;
            char c = 65535;
            if (str2.hashCode() == -2022436447 && str2.equals(d.TAB_SINGLELIVE)) {
                c = 0;
            }
            if (c == 0) {
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        mfg.a().a("com.taobao.taolive.mix.follow.action");
                        String str3 = null;
                        if (b.a(b.this) != null && !TextUtils.isEmpty(b.a(b.this).g)) {
                            str3 = b.a(b.this).g + ".topbar.followicon";
                        }
                        g.a("FollowIcon", b.a(b.this, str3));
                    }
                });
                if (tabUp.tabMiddle != null) {
                    String string = tabUp.tabMiddle.getString("title");
                    String string2 = tabUp.tabMiddle.getString("iconUrl");
                    if (TextUtils.isEmpty(string)) {
                        string = "直播间";
                    }
                    dXTBLNativeTextView.setText(string);
                    dXTBLNativeTextView.setTextGradient(true);
                    if (TextUtils.isEmpty(string2)) {
                        string2 = "https://gw.alicdn.com/imgextra/i1/O1CN01LdOw4E25qJtLv2hbK_!!6000000007577-2-tps-84-84.png";
                    }
                    tUrlImageView.setImageUrl(string2);
                }
                tUrlImageView.setVisibility(0);
                textView2.setVisibility(8);
                textView.setVisibility(8);
                dXTBLNativeTextView.setVisibility(0);
            } else {
                textView.setText(str);
                textView.setVisibility(0);
                tUrlImageView.setVisibility(8);
                textView2.setVisibility(8);
                dXTBLNativeTextView.setVisibility(8);
                if (!TextUtils.isEmpty(str)) {
                    Paint paint = new Paint();
                    paint.setTextSize(c.a(this.g, 18.0f));
                    paint.setTypeface(Typeface.DEFAULT_BOLD);
                    this.k += Math.round(paint.measureText(str) + c.a(this.g, 18.0f));
                }
            }
        }
        return inflate;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < this.h.size(); i++) {
            TabManager.TabUp tabUp = this.h.get(i);
            if (!l.a((CharSequence) tabUp.channelType) && tabUp.channelType.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public void a(XTabLayout.d dVar) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5106c6cb", new Object[]{this, dVar});
        } else if (dVar == null || dVar.h() == null) {
        } else {
            View customView = dVar.h().getCustomView();
            if (customView != null && (findViewById = customView.findViewById(R.id.badge_view)) != null) {
                findViewById.setVisibility(8);
            }
            this.p = false;
        }
    }

    public void a(TabManager.TabUp tabUp) {
        XTabLayout.d tabAt;
        View customView;
        final View findViewById;
        TUrlImageView tUrlImageView;
        long j;
        Handler handler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed03147a", new Object[]{this, tabUp});
        } else if (this.d == null) {
        } else {
            String str = tabUp.channelType;
            JSONObject jSONObject = tabUp.subscript;
            if (l.a((CharSequence) str) || jSONObject == null || !jSONObject.getBoolean("isOpen").booleanValue() || a(d.TAB_FOLLOW) < 0 || (tabAt = this.d.getTabAt(0)) == null || tabAt.h() == null || tabAt.h().getCustomView() == null || (findViewById = (customView = tabAt.h().getCustomView()).findViewById(R.id.badge_view)) == null) {
                return;
            }
            TUrlImageView tUrlImageView2 = (TUrlImageView) customView.findViewById(R.id.badge_img);
            TextView textView = (TextView) customView.findViewById(R.id.badge_text);
            TextView textView2 = (TextView) customView.findViewById(R.id.badge_point);
            boolean booleanValue = jSONObject.getBoolean("redPoint").booleanValue();
            boolean booleanValue2 = jSONObject.getBoolean("animation").booleanValue();
            String string = jSONObject.getString("backgroundPicUrl");
            String string2 = jSONObject.getString("title");
            long a2 = e.a(jSONObject.getString("disappearTime"));
            boolean equals = "followLiveNum".equals(jSONObject.getString("recReason"));
            float b = e.b(jSONObject.getString("timeInterval"));
            if (b > 0.0f) {
                tUrlImageView = tUrlImageView2;
                j = b * 60.0f * 60.0f * 1000.0f;
            } else {
                tUrlImageView = tUrlImageView2;
                j = 0;
            }
            long a3 = e.a(j.a(d.TAO_LIVE_FOLLOW_ICON_SJSD_SHOW_TIME));
            if (!(a3 <= 0 || j <= 0 || System.currentTimeMillis() > a3 + j)) {
                return;
            }
            if (!l.a((CharSequence) string)) {
                TUrlImageView tUrlImageView3 = tUrlImageView;
                findViewById.setVisibility(0);
                tUrlImageView3.setVisibility(0);
                textView.setVisibility(8);
                textView2.setVisibility(8);
                tUrlImageView3.setImageUrl(string);
                if (booleanValue2) {
                    tUrlImageView3.setSkipAutoSize(true);
                }
            } else if (booleanValue) {
                findViewById.setVisibility(0);
                textView2.setVisibility(0);
                tUrlImageView.setVisibility(8);
                textView.setVisibility(8);
            } else {
                TUrlImageView tUrlImageView4 = tUrlImageView;
                if (!l.a((CharSequence) string2)) {
                    if (equals && TextUtils.isDigitsOnly(string2)) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.rightMargin += c.a(this.g, 11.0f);
                        }
                        textView.setLayoutParams(layoutParams);
                    }
                    findViewById.setVisibility(0);
                    textView.setVisibility(0);
                    textView2.setVisibility(8);
                    tUrlImageView4.setVisibility(8);
                    textView.setText(string2);
                }
            }
            if (a2 > 0 && (handler = this.q) != null) {
                handler.postDelayed(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (findViewById == null) {
                        } else {
                            b.a(b.this, false);
                            findViewById.setVisibility(8);
                        }
                    }
                }, a2 * 1000);
            }
            j.a(d.TAO_LIVE_FOLLOW_ICON_SJSD_SHOW_TIME, System.currentTimeMillis() + "");
            this.p = true;
            d(jSONObject.getString("recReason"));
        }
    }

    public void b(XTabLayout.d dVar) {
        View customView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9491e48c", new Object[]{this, dVar});
        } else if (dVar != null && dVar.h() != null && (customView = dVar.h().getCustomView()) != null) {
            TextView textView = (TextView) customView.findViewById(R.id.tabitem_text);
            DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) customView.findViewById(R.id.tabitem_longtext);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            if (TabManager.a().c() == null || TabManager.a().c().size() <= 0 || TabManager.a().c().get(0) == null || TabManager.a().c().get(0).topTab == null || TabManager.a().c().get(0).topTab.size() <= 0) {
                return;
            }
            TabManager.TabUp tabUp = TabManager.a().c().get(0).topTab.get(dVar.k());
            if (tabUp != null && d.TAB_SINGLELIVE.equals(tabUp.channelType)) {
                if (dXTBLNativeTextView != null) {
                    dXTBLNativeTextView.setTypeface(Typeface.defaultFromStyle(1));
                    dXTBLNativeTextView.setAutoMarquee(true);
                    dXTBLNativeTextView.startLongTextMarquee();
                    dXTBLNativeTextView.setTextGradient(false);
                    dXTBLNativeTextView.setMarqueeRepeatLimit(1);
                }
                a((View) ((TextView) customView.findViewById(R.id.tabitem_right)), this.l, true);
                if (!this.r) {
                    return;
                }
                f();
                if (this.l) {
                    return;
                }
                g();
            } else if (tabUp != null && d.TAB_FOLLOW.equals(tabUp.channelType) && this.p && tabUp.sjsdParam != null) {
                if (!"followLiveNum".equals(tabUp.sjsdParam.getString("recReason"))) {
                    String a2 = j.a(d.TAO_LIVE_FOLLOW_ICON_SJSD_PARAM);
                    JSONArray jSONArray = null;
                    if (!TextUtils.isEmpty(a2)) {
                        jSONArray = pqj.c(a2);
                    }
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (m.a(jSONObject.getLongValue("cacheTime"))) {
                            jSONArray2.add(jSONObject);
                        }
                    }
                    tabUp.sjsdParam.put("cacheTime", (Object) Long.valueOf(System.currentTimeMillis()));
                    jSONArray2.add(tabUp.sjsdParam);
                    j.a(d.TAO_LIVE_FOLLOW_ICON_SJSD_PARAM, jSONArray2.toJSONString());
                }
                if (!this.p) {
                    return;
                }
                b(tabUp.sjsdParam.getString("recReason"));
            }
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Map<String, String> c = c("a2141.8001240.topbar.FollowTabCorner");
        if (c == null) {
            c = new HashMap<>();
        }
        c.put("x_recReason", str);
        g.a("FollowTabCorner", c("a2141.8001240.topbar.FollowTabCorner"));
    }

    public void c(XTabLayout.d dVar) {
        View customView;
        TabManager.TabUp tabUp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81d024d", new Object[]{this, dVar});
        } else if (dVar == null || dVar.h() == null || (customView = dVar.h().getCustomView()) == null) {
        } else {
            TextView textView = (TextView) customView.findViewById(R.id.tabitem_text);
            DXTBLNativeTextView dXTBLNativeTextView = (DXTBLNativeTextView) customView.findViewById(R.id.tabitem_longtext);
            if (textView != null) {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            List<TabManager.TabUp> list = this.h;
            if (list == null || list.size() <= 0 || (tabUp = this.h.get(dVar.k())) == null || !d.TAB_SINGLELIVE.equals(tabUp.channelType)) {
                return;
            }
            if (dXTBLNativeTextView != null) {
                dXTBLNativeTextView.setTypeface(Typeface.defaultFromStyle(0));
                dXTBLNativeTextView.setTextGradient(true);
                dXTBLNativeTextView.cancelLongTextMarquee();
            }
            TextView textView2 = (TextView) customView.findViewById(R.id.tabitem_right);
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        }
    }

    public void d(XTabLayout.d dVar) {
        List<TabManager.TabUp> list;
        TabManager.TabUp tabUp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba8200e", new Object[]{this, dVar});
        } else if (dVar == null || dVar.h() == null || dVar.h().getCustomView() == null || (list = this.h) == null || list.size() <= 0 || dVar.k() >= this.h.size() || (tabUp = this.h.get(dVar.k())) == null || !d.TAB_SINGLELIVE.equals(tabUp.channelType)) {
        } else {
            mfg.a().a("com.taobao.taolive.mix.present.avatarpage.action");
            String str = null;
            sqt sqtVar = this.f14191a;
            if (sqtVar != null && !TextUtils.isEmpty(sqtVar.g)) {
                str = this.f14191a.g + ".topbar.liveavatar";
            }
            g.a("Liveavatar", c(str));
        }
    }

    public void a(JSONObject jSONObject) {
        List<TabManager.TabUp> list;
        XTabLayout.d tabAt;
        View customView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.d == null || (list = this.h) == null || list.size() == 0 || jSONObject == null || (tabAt = this.d.getTabAt(a(d.TAB_SINGLELIVE))) == null || tabAt.h() == null || (customView = tabAt.h().getCustomView()) == null) {
        } else {
            a((View) ((TextView) customView.findViewById(R.id.tabitem_right)), jSONObject.getBoolean("follow").booleanValue(), true);
        }
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        if (this.j == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, (Object) this.j.liveId);
        jSONObject.put("liveUrlList", (Object) this.j.liveUrlList);
        return jSONObject;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.i = true;
        }
    }

    public void a(SimpleQuerySafeResponseData simpleQuerySafeResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e49ee06", new Object[]{this, simpleQuerySafeResponseData});
        } else if (this.i || simpleQuerySafeResponseData == null) {
        } else {
            this.j = simpleQuerySafeResponseData;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accountHeadPic", (Object) simpleQuerySafeResponseData.accountHeadPic);
            jSONObject.put("accountName", (Object) simpleQuerySafeResponseData.accountName);
            jSONObject.put("follow", (Object) Boolean.valueOf(simpleQuerySafeResponseData.follow));
            a(jSONObject, false);
        }
    }

    public void a(JSONObject jSONObject, boolean z) {
        List<TabManager.TabUp> list;
        XTabLayout.d tabAt;
        View customView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (this.d == null || (list = this.h) == null || list.size() == 0 || jSONObject == null) {
        } else {
            if (z) {
                this.r = true;
            }
            int a2 = a(d.TAB_SINGLELIVE);
            if (a2 < this.d.getTabCount() && (tabAt = this.d.getTabAt(a2)) != null && tabAt.h() != null && (customView = tabAt.h().getCustomView()) != null) {
                TextView textView = (TextView) customView.findViewById(R.id.tabitem_right);
                TextView textView2 = (TextView) customView.findViewById(R.id.tabitem_longtext);
                TUrlImageView tUrlImageView = (TUrlImageView) customView.findViewById(R.id.tabitem_left);
                String string = jSONObject.getString("accountHeadPic");
                String string2 = jSONObject.getString("accountName");
                boolean booleanValue = jSONObject.getBoolean("follow").booleanValue();
                if (tUrlImageView != null && !l.a((CharSequence) string)) {
                    tUrlImageView.setImageUrl(string);
                }
                a(textView, booleanValue, z);
                if (textView2 != null && !l.a((CharSequence) string2)) {
                    textView2.setText(string2);
                }
                customView.invalidate();
                if (!booleanValue && z) {
                    g();
                }
            }
            if (!z) {
                return;
            }
            f();
        }
    }

    private void a(View view, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c2d0b6a", new Object[]{this, view, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.l = z;
        if (view == null) {
            return;
        }
        if (z || !z2) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
    }

    private Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        sqt sqtVar = this.f14191a;
        if (sqtVar != null) {
            hashMap.put("entryLiveSource", sqtVar.e);
            hashMap.put("entrySpm", this.f14191a.f);
        }
        return hashMap;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String str = null;
        sqt sqtVar = this.f14191a;
        if (sqtVar != null && !TextUtils.isEmpty(sqtVar.g)) {
            str = this.f14191a.g + ".topbar.liveavatar";
        }
        g.b("Page_TaobaoLive_Show-Liveavatar", c(str));
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String str = null;
        sqt sqtVar = this.f14191a;
        if (sqtVar != null && !TextUtils.isEmpty(sqtVar.g)) {
            str = this.f14191a.g + ".topbar.followicon";
        }
        g.b("Page_TaobaoLive_Show-FollowIcon", c(str));
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        Map<String, String> c = c("a2141.8001240.topbar.FollowTabCorner");
        if (c == null) {
            c = new HashMap<>();
        }
        c.put("x_recReason", str);
        g.b("Page_Taobaolive_Show-FollowTabCorner", c("a2141.8001240.topbar.FollowTabCorner"));
    }

    public void a(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3e34e", new Object[]{this, tUrlImageView});
        } else {
            this.m = tUrlImageView;
        }
    }
}
