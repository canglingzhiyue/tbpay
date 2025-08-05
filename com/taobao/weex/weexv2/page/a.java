package com.taobao.weex.weexv2.page;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.analytics.core.sync.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.weex_ability.e;
import com.taobao.android.weex_ability.j;
import com.taobao.android.weex_ability.page.MSHCNavAdapter;
import com.taobao.android.weex_ability.page.MUSPageFragment;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.AppcompatUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes9.dex */
public class a extends MSHCNavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler e = new Handler(Looper.getMainLooper());
    private static int i = 0;
    private String f;
    private AppCompatActivity g;
    private boolean h;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ BitmapDrawable a(a aVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("6e463fd5", new Object[]{aVar, bitmapDrawable}) : aVar.a(bitmapDrawable);
    }

    public static /* synthetic */ AppCompatActivity a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatActivity) ipChange.ipc$dispatch("666c34ae", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ MUSPageFragment b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSPageFragment) ipChange.ipc$dispatch("876e098b", new Object[]{aVar}) : aVar.d();
    }

    public static /* synthetic */ MUSPageFragment c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSPageFragment) ipChange.ipc$dispatch("7075ce8c", new Object[]{aVar}) : aVar.d();
    }

    public static /* synthetic */ MUSPageFragment d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSPageFragment) ipChange.ipc$dispatch("597d938d", new Object[]{aVar}) : aVar.d();
    }

    public static /* synthetic */ Handler g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("98203298", new Object[0]) : e;
    }

    public a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.h = false;
        this.g = appCompatActivity;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a a(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("4f62fd29", new Object[]{this, pVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        this.g.getSupportActionBar().d();
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a b(p pVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        if (this.g.getSupportActionBar() != null) {
            try {
                Method method = ActionBar.class.getMethod(q.MSGTYPE_INTERVAL, Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(this.g.getSupportActionBar(), false);
            } catch (Throwable th) {
                g.c("exception in cancel action animation. ", th);
            }
            this.g.getSupportActionBar().e();
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a c(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("c6b55967", new Object[]{this, pVar, jSONObject});
        }
        if (this.g.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        try {
            int parseColor = Color.parseColor(jSONObject.getString("color"));
            Toolbar toolbar = (Toolbar) this.g.findViewById(R.id.action_bar);
            if (toolbar != null) {
                toolbar.setTitleTextColor(parseColor);
                toolbar.setSubtitleTextColor(parseColor);
                Drawable navigationIcon = toolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable mutate = DrawableCompat.wrap(navigationIcon).mutate();
                    DrawableCompat.setTint(mutate, parseColor);
                    toolbar.setNavigationIcon(mutate);
                }
                if (this.g instanceof ITBPublicMenu) {
                    TBPublicMenu publicMenu = ((ITBPublicMenu) this.g).getPublicMenu();
                    if (publicMenu != null) {
                        publicMenu.setActionViewIconColor(parseColor);
                    }
                } else {
                    Drawable overflowIcon = toolbar.getOverflowIcon();
                    if (overflowIcon != null) {
                        Drawable wrap = DrawableCompat.wrap(overflowIcon);
                        wrap.mutate();
                        DrawableCompat.setTint(wrap, parseColor);
                    }
                }
                this.h = true;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a f(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("f9b0e3c4", new Object[]{this, pVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        if (!(this.g instanceof WeexV2Activity)) {
            return new com.taobao.android.weex_ability.page.a("MS_NOT_SUPPORTED", "Only MUSPageActivity support setBadgeStyle(), or your own activity should implement getOverflowMenuButton()");
        }
        String string = jSONObject.getString("style");
        if (string == null) {
            return new com.taobao.android.weex_ability.page.a("MS_NOT_SUPPORTED", "params error");
        }
        TBActionView tBActionView = ((WeexV2Activity) this.g).f23545a;
        if (tBActionView != null) {
            try {
                if ("light".equals(string)) {
                    tBActionView.setMessageNumColor(h().getColor(R.color.uik_action_message_num_dark));
                    tBActionView.setMessageBackgroundColor(h().getColor(R.color.uik_action_message_bg_dark));
                } else if ("dark".equals(string)) {
                    tBActionView.setMessageNumColor(h().getColor(R.color.uik_action_message_num_normal));
                    tBActionView.setMessageBackgroundColor(h().getColor(R.color.uik_action_message_bg_normal));
                } else {
                    tBActionView.setMessageNumColor(h().getColor(R.color.uik_action_message_num_normal));
                    tBActionView.setMessageBackgroundColor(h().getColor(R.color.uik_action_message_bg_normal));
                }
            } catch (Throwable th) {
                g.c("exception in set badge style. ", th);
            }
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a d(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("825e8786", new Object[]{this, pVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Boolean bool = jSONObject.getBoolean("show");
            if (this.g instanceof CustomBaseActivity) {
                if (bool != null && !bool.booleanValue()) {
                    ((CustomBaseActivity) this.g).togglePublicMenu(false);
                } else {
                    ((CustomBaseActivity) this.g).togglePublicMenu(true);
                }
                this.g.supportInvalidateOptionsMenu();
                return null;
            }
        } catch (Throwable th) {
            g.a(th);
        }
        return new com.taobao.android.weex_ability.page.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR, "Activity not support");
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a e(p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("3e07b5a5", new Object[]{this, pVar, jSONObject});
        }
        if (this.g.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        jSONObject.getString("transparent");
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public synchronized com.taobao.android.weex_ability.page.a a(p pVar) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("93f2092f", new Object[]{this, pVar});
        } else if (this.g.getSupportActionBar() == null) {
            return null;
        } else {
            Toolbar toolbar = (Toolbar) this.g.findViewById(R.id.action_bar);
            if (toolbar != null) {
                i2 = toolbar.getHeight();
                if (i2 == 0) {
                    i2 = i;
                } else {
                    i = i2;
                }
            }
            if (i2 == 0) {
                TypedValue typedValue = new TypedValue();
                this.g.getTheme().resolveAttribute(16843499, typedValue, true);
                i2 = h().getDimensionPixelSize(typedValue.resourceId);
            }
            return new com.taobao.android.weex_ability.page.a(String.valueOf(i2), "");
        }
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a b(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("746b5f30", new Object[]{this, pVar});
        }
        int identifier = h().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return null;
        }
        return new com.taobao.android.weex_ability.page.a(String.valueOf(h().getDimensionPixelSize(identifier)), "");
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a h(p pVar, JSONObject jSONObject) {
        ViewGroup viewGroup;
        if (jSONObject == null) {
            return null;
        }
        AppCompatActivity appCompatActivity = this.g;
        if ((appCompatActivity != null && appCompatActivity.getClass().getSimpleName().equals("TBMainActivity")) || (jSONObject.getBoolean("showMenu") != null && jSONObject.getBoolean("showMenu").booleanValue())) {
            TBPublicMenu tBPublicMenu = new TBPublicMenu(this.g);
            tBPublicMenu.setReportArguments(new ITBPublicMenu() { // from class: com.taobao.weex.weexv2.page.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.ITBPublicMenu
                public TBPublicMenu getPublicMenu() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
                    }
                    return null;
                }

                @Override // com.taobao.uikit.actionbar.ITBPublicMenu
                public Bundle pageUserInfo() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
                    }
                    return null;
                }
            });
            tBPublicMenu.show();
            return null;
        } else if (!(this.g instanceof WeexV2Activity)) {
            return new com.taobao.android.weex_ability.page.a("WX_NOT_SUPPORTED", "Only WXActivity support showMenu(), or your own activity should implement getOverflowMenuButton()");
        } else {
            boolean equals = jSONObject != null ? "true".equals(jSONObject.get("cancelActualShow")) : false;
            try {
                WeexV2Activity weexV2Activity = (WeexV2Activity) this.g;
                final ActionBar supportActionBar = weexV2Activity.getSupportActionBar();
                Method method = ActionBar.class.getMethod(q.MSGTYPE_INTERVAL, Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(supportActionBar, false);
                int identifier = weexV2Activity.getResources().getIdentifier("action_bar", "id", this.g.getPackageName());
                if (identifier != 0 && (viewGroup = (ViewGroup) weexV2Activity.findViewById(identifier)) != null) {
                    for (int i2 = 0; i2 < 3; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof ImageButton) {
                            ((ImageButton) childAt).setImageDrawable(weexV2Activity.getResources().getDrawable(17170445));
                        } else if (childAt instanceof TextView) {
                            ((TextView) childAt).setText("");
                        } else if (childAt instanceof ActionMenuView) {
                            childAt.setVisibility(4);
                        }
                    }
                }
                final TBActionView tBActionView = weexV2Activity.f23545a;
                if (tBActionView != null) {
                    tBActionView.setVisibility(4);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("color", "#00ffffff");
                c(pVar, jSONObject2);
                final Handler handler = new Handler(Looper.getMainLooper());
                if (!equals) {
                    if (supportActionBar != null) {
                        supportActionBar.d();
                    }
                    handler.postDelayed(new o() { // from class: com.taobao.weex.weexv2.page.a.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.weex_framework.util.o
                        public void a() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            TBActionView tBActionView2 = tBActionView;
                            if (tBActionView2 != null) {
                                tBActionView2.performClick();
                            }
                            handler.postDelayed(new o() { // from class: com.taobao.weex.weexv2.page.a.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.weex_framework.util.o
                                public void a() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                    } else if (supportActionBar == null) {
                                    } else {
                                        supportActionBar.e();
                                    }
                                }
                            }, 64L);
                        }
                    }, 64L);
                } else {
                    if (supportActionBar != null) {
                        supportActionBar.d();
                    }
                    handler.postDelayed(new o() { // from class: com.taobao.weex.weexv2.page.a.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.android.weex_framework.util.o
                        public void a() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            ActionBar actionBar = supportActionBar;
                            if (actionBar == null) {
                                return;
                            }
                            actionBar.e();
                        }
                    }, 32L);
                }
                return null;
            } catch (Exception e2) {
                g.c("exception in cancel action animation. ", e2);
                return new com.taobao.android.weex_ability.page.a("ERROR", e2.getMessage());
            }
        }
    }

    @Override // com.taobao.android.weex_ability.page.b
    public boolean a(p pVar, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("835e5297", new Object[]{this, pVar, menu})).booleanValue();
        }
        if (e()) {
            b(menu);
            i();
        }
        a(menu);
        return true;
    }

    private void a(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2945670", new Object[]{this, menu});
            return;
        }
        menu.removeGroup(R.id.navigation_bar_more_group);
        List<com.taobao.android.weex_ability.page.c> c = c();
        if (c == null || c.isEmpty()) {
            return;
        }
        int i2 = 0;
        for (final com.taobao.android.weex_ability.page.c cVar : c) {
            final int i3 = R.id.navigation_bar_more_start_id + i2;
            MenuItem add = menu.add(R.id.navigation_bar_more_group, i3, 0, cVar.d);
            if (cVar.f15963a > 0) {
                add.setIcon(cVar.f15963a);
            } else if (cVar.b > 0) {
                add.setTitle(h().getString(cVar.b) + ":" + cVar.d);
            } else if (cVar.c != null && !cVar.c.isRecycled()) {
                add.setIcon(a(new BitmapDrawable(h(), cVar.c)));
            } else if (!TextUtils.isEmpty(cVar.e)) {
                l.a().f().a(this.g, cVar.e, new b() { // from class: com.taobao.weex.weexv2.page.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.weexv2.page.b, com.taobao.android.weex_framework.adapter.d.a
                    public void a(final Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else {
                            a.g().post(new o() { // from class: com.taobao.weex.weexv2.page.a.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.weex_framework.util.o
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                        return;
                                    }
                                    TBPublicMenu publicMenu = ((ITBPublicMenu) a.a(a.this)).getPublicMenu();
                                    TBPublicMenuItem extraMenu = publicMenu.getExtraMenu(i3);
                                    if (extraMenu == null) {
                                        return;
                                    }
                                    extraMenu.setIconDrawable(a.a(a.this, (BitmapDrawable) drawable));
                                    publicMenu.notifyMenuChanged();
                                }
                            });
                        }
                    }
                }, MUSImageQuality.ORIGINAL);
            }
            add.setIntent(cVar.f);
            add.setShowAsAction(8);
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.weex.weexv2.page.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                    }
                    JSONObject jSONObject = new JSONObject();
                    int i4 = -1;
                    if (menuItem != null && menuItem.getIntent() != null) {
                        try {
                            i4 = menuItem.getIntent().getIntExtra("index", -1);
                        } catch (Exception unused) {
                        }
                    }
                    if (i4 >= 0) {
                        jSONObject.put("index", (Object) Integer.valueOf(i4));
                        if (cVar.h != null) {
                            cVar.h.a(i4);
                        } else {
                            a.b(a.this).fireEvent(MSHCNavAdapter.c, jSONObject);
                        }
                    }
                    return true;
                }
            });
            i2++;
        }
    }

    private Resources h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("e12255c0", new Object[]{this}) : this.g.getResources();
    }

    private void i() {
        final ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        final com.taobao.android.weex_ability.page.c b = b();
        if (b == null || (supportActionBar = this.g.getSupportActionBar()) == null) {
            return;
        }
        if (TextUtils.isEmpty(b.d)) {
            supportActionBar.d(false);
            final ImageView imageView = new ImageView(this.g);
            if (b.g) {
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            if (b.f15963a > 0) {
                imageView.setImageResource(b.f15963a);
            } else if (b.b > 0) {
                imageView.setImageDrawable(a(a(this.g, b.b)));
            } else if (b.c != null && !b.c.isRecycled()) {
                imageView.setImageDrawable(a(new BitmapDrawable(h(), b.c)));
            } else if (!TextUtils.isEmpty(b.e)) {
                l.a().f().a(this.g, b.e, new b() { // from class: com.taobao.weex.weexv2.page.a.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.weexv2.page.b, com.taobao.android.weex_framework.adapter.d.a
                    public void a(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                            return;
                        }
                        int c = (int) (supportActionBar.c() * 0.6d);
                        if (b.g) {
                            imageView.setLayoutParams(new Toolbar.LayoutParams(-1, c));
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        } else {
                            imageView.setLayoutParams(new Toolbar.LayoutParams((int) ((c / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth()), c));
                        }
                        imageView.setImageDrawable(drawable);
                    }
                }, MUSImageQuality.ORIGINAL);
            }
            imageView.setClickable(true);
            supportActionBar.a(imageView);
            supportActionBar.e(true);
            supportActionBar.b(true);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.weex.weexv2.page.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.c(a.this).fireEvent(MSHCNavAdapter.d, new JSONObject());
                    }
                }
            });
            return;
        }
        supportActionBar.d(true);
        supportActionBar.e(false);
        supportActionBar.a(b.d);
    }

    private void b(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae95e54f", new Object[]{this, menu});
            return;
        }
        final com.taobao.android.weex_ability.page.c a2 = a();
        try {
            menu.removeItem(R.id.navigation_bar_right_id);
        } catch (Throwable unused) {
        }
        if (a2 == null) {
            return;
        }
        final MenuItem add = menu.add(0, R.id.navigation_bar_right_id, 0, "");
        if (!TextUtils.isEmpty(a2.d)) {
            add.setTitle(a2.d);
        } else if (a2.f15963a > 0) {
            add.setIcon(a2.f15963a);
        } else if (a2.b > 0) {
            add.setTitle(AppcompatUtils.getMenuTitle("", a2.b));
        } else if (a2.c != null && !a2.c.isRecycled()) {
            add.setIcon(a(new BitmapDrawable(h(), a2.c)));
        } else if (!TextUtils.isEmpty(a2.e)) {
            PhenixCreator a3 = com.taobao.phenix.intf.b.h().a(a2.e);
            a3.succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.weex.weexv2.page.a.8
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
                    add.setIcon(succPhenixEvent.getDrawable());
                    return false;
                }
            });
            a3.fetch();
        }
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.weex.weexv2.page.a.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                }
                if (a2.h != null) {
                    a2.h.a(0);
                } else {
                    a.d(a.this).fireEvent(MSHCNavAdapter.b, new JSONObject());
                }
                return true;
            }
        });
        add.setShowAsAction(2);
    }

    public static BitmapDrawable a(Activity activity, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("eca02d22", new Object[]{activity, new Integer(i2)});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(activity);
        tIconFontTextView.setText(i2);
        tIconFontTextView.setTextSize(24.0f);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        tIconFontTextView.setTextColor(FestivalMgr.a().a("actionbarTextColor", activity.getResources().getColor(R.color.abc_title_color)));
        try {
            tIconFontTextView.setTypeface(Typeface.createFromAsset(activity.getAssets(), "uik_iconfont.ttf"));
        } catch (RuntimeException e2) {
            g.c("TBNavBarAdapter", e2);
        }
        return new BitmapDrawable(activity.getResources(), a(tIconFontTextView));
    }

    private static Bitmap a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("99351448", new Object[]{view});
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    @Override // com.taobao.android.weex_ability.page.MSHCNavAdapter
    public boolean e() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if ((this.g instanceof WeexV2Activity) && ((WeexV2Activity) this.g).f()) {
            return false;
        }
        e c = j.a().c();
        if (c == null) {
            return true;
        }
        String a2 = c.a("group_weex_hc", "weex_main_hc_domain", "");
        if (!TextUtils.isEmpty(a2)) {
            for (String str : a2.split(",")) {
                if (!TextUtils.isEmpty(this.f) && this.f.contains(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private BitmapDrawable a(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("18b3e2ce", new Object[]{this, bitmapDrawable});
        }
        try {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float c = ((int) (this.g.getSupportActionBar().c() * 0.6d)) / height;
            Matrix matrix = new Matrix();
            matrix.postScale(c, c);
            return new BitmapDrawable(h(), Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true));
        } catch (Throwable unused) {
            return bitmapDrawable;
        }
    }
}
