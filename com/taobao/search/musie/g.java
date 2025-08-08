package com.taobao.search.musie;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import mtopsdk.common.util.StringUtils;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.weex_ability.page.MSHCNavAdapter;
import com.taobao.android.weex_ability.page.MUSPageFragment;
import com.taobao.android.weex_ability.page.c;
import com.taobao.android.weex_framework.adapter.MUSImageQuality;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.tao.util.AppcompatUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.lang.reflect.Method;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class g extends MSHCNavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Handler e;
    private static int i;
    private String f;
    private AppCompatActivity g;
    private boolean h;

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ BitmapDrawable a(g gVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("eeef9248", new Object[]{gVar, bitmapDrawable}) : gVar.a(bitmapDrawable);
    }

    public static /* synthetic */ AppCompatActivity a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatActivity) ipChange.ipc$dispatch("439ef6e1", new Object[]{gVar}) : gVar.g;
    }

    public static /* synthetic */ MUSPageFragment b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSPageFragment) ipChange.ipc$dispatch("c78cbfbe", new Object[]{gVar}) : gVar.d();
    }

    public static /* synthetic */ MUSPageFragment c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSPageFragment) ipChange.ipc$dispatch("7f792d3f", new Object[]{gVar}) : gVar.d();
    }

    public static /* synthetic */ MUSPageFragment d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSPageFragment) ipChange.ipc$dispatch("37659ac0", new Object[]{gVar}) : gVar.d();
    }

    public static /* synthetic */ Handler i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("90235056", new Object[0]) : e;
    }

    static {
        kge.a(-1265999568);
        e = new Handler(Looper.getMainLooper());
        i = 0;
    }

    public g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        this.h = false;
        this.g = appCompatActivity;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a a(com.taobao.android.weex_framework.p pVar, JSONObject jSONObject) {
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
    public com.taobao.android.weex_ability.page.a b(com.taobao.android.weex_framework.p pVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        if (this.g.getSupportActionBar() != null) {
            try {
                Method method = ActionBar.class.getMethod(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, Boolean.TYPE);
                method.setAccessible(true);
                method.invoke(this.g.getSupportActionBar(), false);
            } catch (Throwable th) {
                com.taobao.android.weex_framework.util.g.c("exception in cancel action animation. ", th);
            }
            this.g.getSupportActionBar().e();
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a c(com.taobao.android.weex_framework.p pVar, JSONObject jSONObject) {
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
    public com.taobao.android.weex_ability.page.a f(com.taobao.android.weex_framework.p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("f9b0e3c4", new Object[]{this, pVar, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        if (!(this.g instanceof MUSPageActivity)) {
            return new com.taobao.android.weex_ability.page.a("MS_NOT_SUPPORTED", "Only MUSPageActivity support setBadgeStyle(), or your own activity should implement getOverflowMenuButton()");
        }
        String string = jSONObject.getString("style");
        if (string == null) {
            return new com.taobao.android.weex_ability.page.a("MS_NOT_SUPPORTED", "params error");
        }
        TBActionView tBActionView = ((MUSPageActivity) this.g).f19200a;
        if (tBActionView != null) {
            try {
                if ("light".equals(string)) {
                    tBActionView.setMessageNumColor(j().getColor(R.color.uik_action_message_num_dark));
                    tBActionView.setMessageBackgroundColor(j().getColor(R.color.uik_action_message_bg_dark));
                } else if ("dark".equals(string)) {
                    tBActionView.setMessageNumColor(j().getColor(R.color.uik_action_message_num_normal));
                    tBActionView.setMessageBackgroundColor(j().getColor(R.color.uik_action_message_bg_normal));
                } else {
                    tBActionView.setMessageNumColor(j().getColor(R.color.uik_action_message_num_normal));
                    tBActionView.setMessageBackgroundColor(j().getColor(R.color.uik_action_message_bg_normal));
                }
            } catch (Throwable th) {
                com.taobao.android.weex_framework.util.g.c("exception in set badge style. ", th);
            }
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a d(com.taobao.android.weex_framework.p pVar, JSONObject jSONObject) {
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
            com.taobao.android.weex_framework.util.g.a(th);
        }
        return new com.taobao.android.weex_ability.page.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR, "Activity not support");
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a e(com.taobao.android.weex_framework.p pVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("3e07b5a5", new Object[]{this, pVar, jSONObject});
        }
        if (this.g.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("transparent");
        AppCompatActivity appCompatActivity = this.g;
        if (appCompatActivity instanceof MUSPageActivity) {
            ((MUSPageActivity) appCompatActivity).a(!"true".equals(string));
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.b
    public synchronized com.taobao.android.weex_ability.page.a a(com.taobao.android.weex_framework.p pVar) {
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
                i2 = j().getDimensionPixelSize(typedValue.resourceId);
            }
            return new com.taobao.android.weex_ability.page.a(String.valueOf(i2), "");
        }
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a b(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_ability.page.a) ipChange.ipc$dispatch("746b5f30", new Object[]{this, pVar});
        }
        int identifier = j().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return null;
        }
        return new com.taobao.android.weex_ability.page.a(String.valueOf(j().getDimensionPixelSize(identifier)), "");
    }

    @Override // com.taobao.android.weex_ability.page.b
    public com.taobao.android.weex_ability.page.a h(com.taobao.android.weex_framework.p pVar, JSONObject jSONObject) {
        ViewGroup viewGroup;
        if (jSONObject == null) {
            return null;
        }
        if (!(this.g instanceof MUSPageActivity)) {
            return new com.taobao.android.weex_ability.page.a("WX_NOT_SUPPORTED", "Only WXActivity support showMenu(), or your own activity should implement getOverflowMenuButton()");
        }
        boolean equals = jSONObject != null ? "true".equals(jSONObject.get("cancelActualShow")) : false;
        try {
            MUSPageActivity mUSPageActivity = (MUSPageActivity) this.g;
            final ActionBar supportActionBar = mUSPageActivity.getSupportActionBar();
            Method method = ActionBar.class.getMethod(com.alibaba.analytics.core.sync.q.MSGTYPE_INTERVAL, Boolean.TYPE);
            method.setAccessible(true);
            method.invoke(supportActionBar, false);
            int identifier = mUSPageActivity.getResources().getIdentifier("action_bar", "id", this.g.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) mUSPageActivity.findViewById(identifier)) != null) {
                for (int i2 = 0; i2 < 3; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ImageButton) {
                        ((ImageButton) childAt).setImageDrawable(mUSPageActivity.getResources().getDrawable(17170445));
                    } else if (childAt instanceof TextView) {
                        ((TextView) childAt).setText("");
                    } else if (childAt instanceof ActionMenuView) {
                        childAt.setVisibility(4);
                    }
                }
            }
            final TBActionView tBActionView = mUSPageActivity.f19200a;
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
                handler.postDelayed(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.search.musie.g.1
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
                        handler.postDelayed(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.search.musie.g.1.1
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
                handler.postDelayed(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.search.musie.g.2
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
            com.taobao.android.weex_framework.util.g.c("exception in cancel action animation. ", e2);
            return new com.taobao.android.weex_ability.page.a("ERROR", e2.getMessage());
        }
    }

    @Override // com.taobao.android.weex_ability.page.b
    public boolean a(com.taobao.android.weex_framework.p pVar, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("835e5297", new Object[]{this, pVar, menu})).booleanValue();
        }
        if (e()) {
            b(menu);
            k();
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
        List<c> c = c();
        if (c == null || c.isEmpty()) {
            return;
        }
        int i2 = 0;
        for (final c cVar : c) {
            final int i3 = R.id.navigation_bar_more_start_id + i2;
            MenuItem add = menu.add(R.id.navigation_bar_more_group, i3, 0, cVar.d);
            if (cVar.f15963a > 0) {
                add.setIcon(cVar.f15963a);
            } else if (cVar.b > 0) {
                add.setTitle(j().getString(cVar.b) + ":" + cVar.d);
            } else if (cVar.c != null && !cVar.c.isRecycled()) {
                add.setIcon(a(new BitmapDrawable(j(), cVar.c)));
            } else if (!StringUtils.isEmpty(cVar.e)) {
                com.taobao.android.weex_framework.l.a().f().a(this.g, cVar.e, new s() { // from class: com.taobao.search.musie.g.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.search.musie.s, com.taobao.android.weex_framework.adapter.d.a
                    public void a(final Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else {
                            g.i().post(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.search.musie.g.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.android.weex_framework.util.o
                                public void a() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                        return;
                                    }
                                    TBPublicMenu publicMenu = ((ITBPublicMenu) g.a(g.this)).getPublicMenu();
                                    TBPublicMenuItem extraMenu = publicMenu.getExtraMenu(i3);
                                    if (extraMenu == null) {
                                        return;
                                    }
                                    extraMenu.setIconDrawable(g.a(g.this, (BitmapDrawable) drawable));
                                    publicMenu.notifyMenuChanged();
                                }
                            });
                        }
                    }
                }, MUSImageQuality.ORIGINAL);
            }
            add.setIntent(cVar.f);
            add.setShowAsAction(8);
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.search.musie.g.4
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
                            g.b(g.this).fireEvent(MSHCNavAdapter.c, jSONObject);
                        }
                    }
                    return true;
                }
            });
            i2++;
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : !e();
    }

    private Resources j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("aed3d542", new Object[]{this}) : this.g.getResources();
    }

    private void k() {
        final ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        final c b = b();
        if (b == null || (supportActionBar = this.g.getSupportActionBar()) == null) {
            return;
        }
        if (StringUtils.isEmpty(b.d)) {
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
                imageView.setImageDrawable(a(new BitmapDrawable(j(), b.c)));
            } else if (!StringUtils.isEmpty(b.e)) {
                com.taobao.android.weex_framework.l.a().f().a(this.g, b.e, new s() { // from class: com.taobao.search.musie.g.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.search.musie.s, com.taobao.android.weex_framework.adapter.d.a
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
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.search.musie.g.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        g.c(g.this).fireEvent(MSHCNavAdapter.d, new JSONObject());
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
        final c a2 = a();
        try {
            menu.removeItem(R.id.navigation_bar_right_id);
        } catch (Throwable unused) {
        }
        if (a2 == null) {
            return;
        }
        final MenuItem add = menu.add(0, R.id.navigation_bar_right_id, 0, "");
        if (!StringUtils.isEmpty(a2.d)) {
            add.setTitle(a2.d);
        } else if (a2.f15963a > 0) {
            add.setIcon(a2.f15963a);
        } else if (a2.b > 0) {
            add.setTitle(AppcompatUtils.getMenuTitle("", a2.b));
        } else if (a2.c != null && !a2.c.isRecycled()) {
            add.setIcon(a(new BitmapDrawable(j(), a2.c)));
        } else if (!StringUtils.isEmpty(a2.e)) {
            com.taobao.android.weex_framework.l.a().f().a(this.g, a2.e, new s() { // from class: com.taobao.search.musie.g.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.search.musie.s, com.taobao.android.weex_framework.adapter.d.a
                public void a(final Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    } else {
                        g.i().post(new com.taobao.android.weex_framework.util.o() { // from class: com.taobao.search.musie.g.7.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.weex_framework.util.o
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else {
                                    add.setIcon(g.a(g.this, (BitmapDrawable) drawable));
                                }
                            }
                        });
                    }
                }
            }, MUSImageQuality.ORIGINAL);
        }
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.search.musie.g.8
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
                    g.d(g.this).fireEvent(MSHCNavAdapter.b, new JSONObject());
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
            com.taobao.android.weex_framework.util.g.c("TBNavBarAdapter", e2);
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
        if ((this.g instanceof MUSPageActivity) && ((MUSPageActivity) this.g).d()) {
            return false;
        }
        com.taobao.android.weex_ability.e c = com.taobao.android.weex_ability.j.a().c();
        if (c == null) {
            return true;
        }
        String a2 = c.a("group_weex_hc", "weex_main_hc_domain", "");
        if (!StringUtils.isEmpty(a2)) {
            for (String str : a2.split(",")) {
                if (!StringUtils.isEmpty(this.f) && this.f.contains(str)) {
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
            return new BitmapDrawable(j(), Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true));
        } catch (Throwable unused) {
            return bitmapDrawable;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }
}
