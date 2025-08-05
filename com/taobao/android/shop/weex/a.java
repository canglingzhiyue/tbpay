package com.taobao.android.shop.weex;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.taobao.TBActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.alibaba.aliweex.f;
import com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.AppcompatUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.hyt;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends WXHCNavBarAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f15127a;
    public static String b;
    public static String c;
    public static String d;
    private WeakReference<AppCompatActivity> e;
    private Context f;
    private boolean g;
    private String h;

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ BitmapDrawable a(a aVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("cfa25158", new Object[]{aVar, bitmapDrawable}) : aVar.a(bitmapDrawable);
    }

    public static /* synthetic */ AppCompatActivity a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatActivity) ipChange.ipc$dispatch("216289f1", new Object[]{aVar}) : aVar.b();
    }

    public static /* synthetic */ WeexPageFragment b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment) ipChange.ipc$dispatch("d36917d4", new Object[]{aVar}) : aVar.getWeexPageFragment();
    }

    public static /* synthetic */ WeexPageFragment c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment) ipChange.ipc$dispatch("b3e26dd5", new Object[]{aVar}) : aVar.getWeexPageFragment();
    }

    public static /* synthetic */ WeexPageFragment d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexPageFragment) ipChange.ipc$dispatch("945bc3d6", new Object[]{aVar}) : aVar.getWeexPageFragment();
    }

    static {
        kge.a(326140865);
        f15127a = "clickleftitem";
        b = "clickrightitem";
        c = "clickmoreitem";
        d = "clickcenteritem";
    }

    public a(AppCompatActivity appCompatActivity, Map<String, String> map) {
        super(appCompatActivity);
        this.g = false;
        this.e = new WeakReference<>(appCompatActivity);
        this.f = appCompatActivity.getApplicationContext();
        if (map == null || !map.containsKey("shopId")) {
            return;
        }
        this.h = map.get("shopId");
    }

    private AppCompatActivity b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatActivity) ipChange.ipc$dispatch("28f83c86", new Object[]{this}) : this.e.get();
    }

    private Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this}) : this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r8 == false) goto L12;
     */
    @Override // com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter, com.alibaba.aliweex.bundle.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void push(android.app.Activity r6, java.lang.String r7, org.json.JSONObject r8) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.shop.weex.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r1[r2] = r6
            r6 = 2
            r1[r6] = r7
            r6 = 3
            r1[r6] = r8
            java.lang.String r6 = "991897a1"
            r0.ipc$dispatch(r6, r1)
            return
        L1b:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r8.toString()
            com.alibaba.fastjson.JSONObject r1 = com.alibaba.fastjson.JSON.parseObject(r1)
            java.lang.String r4 = "wx_options"
            r0.putSerializable(r4, r1)
            com.taobao.android.nav.Nav r1 = com.taobao.android.nav.Nav.from(r6)
            com.taobao.android.nav.Nav r0 = r1.withExtras(r0)
            java.lang.String r7 = r7.trim()
            r0.toUri(r7)
            java.lang.String r7 = "transform"
            java.lang.String r7 = r8.optString(r7)
            java.lang.String r0 = "animated"
            java.lang.Object r8 = r8.opt(r0)
            if (r8 == 0) goto L66
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L57
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = java.lang.Boolean.parseBoolean(r8)
            goto L63
        L57:
            boolean r0 = r8 instanceof java.lang.Boolean
            if (r0 == 0) goto L62
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            goto L63
        L62:
            r8 = 1
        L63:
            if (r8 != 0) goto L66
            goto L67
        L66:
            r2 = 0
        L67:
            if (r2 == 0) goto L6d
            r6.overridePendingTransition(r3, r3)
            return
        L6d:
            java.lang.String r8 = "3d"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L78
            r6.overridePendingTransition(r3, r3)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.shop.weex.a.push(android.app.Activity, java.lang.String, org.json.JSONObject):void");
    }

    @Override // tb.amu
    public f show(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("250bcca2", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        if (b() != null) {
            boolean booleanValue = jSONObject.getBooleanValue("navVisible");
            View findViewById = b().findViewById(R.id.fake_title);
            if (booleanValue && findViewById != null) {
                findViewById.setVisibility(0);
            } else if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            b().getSupportActionBar().d();
            if (a() && !this.g) {
                FestivalMgr.a().a(b(), findViewById, TBActionBar.ActionBarStyle.NORMAL);
            }
            if (b() instanceof ShopRenderActivity) {
                ((ShopRenderActivity) b()).mActionBarShow = false;
            }
        }
        return null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            String str = FestivalMgr.a().j().get("isFestivalOn");
            if (!TextUtils.isEmpty(str)) {
                if (Integer.valueOf(str).intValue() == 1) {
                    return true;
                }
            }
        } catch (RuntimeException e) {
            WXLogUtils.e("TBNavBarAdapter", WXLogUtils.getStackTrace(e));
        }
        return false;
    }

    @Override // tb.amu
    public f hide(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("37cf2aa7", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        jSONObject.getBooleanValue("animated");
        if (b() != null) {
            boolean booleanValue = jSONObject.getBooleanValue("navVisible");
            View findViewById = b().findViewById(R.id.fake_title);
            if (booleanValue && findViewById != null) {
                findViewById.setVisibility(0);
            } else if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            b().getSupportActionBar().e();
            if (b() instanceof ShopRenderActivity) {
                ((ShopRenderActivity) b()).mActionBarShow = false;
            }
        }
        return null;
    }

    @Override // tb.amu
    public f setStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5fd7f594", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (b() == null) {
            return null;
        }
        AppCompatActivity b2 = b();
        if (b2.getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        try {
            int parseColor = Color.parseColor(jSONObject.getString("color"));
            Toolbar toolbar = (Toolbar) b2.findViewById(R.id.action_bar);
            if (toolbar != null) {
                toolbar.setTitleTextColor(parseColor);
                toolbar.setSubtitleTextColor(parseColor);
                Drawable navigationIcon = toolbar.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable mutate = DrawableCompat.wrap(navigationIcon).mutate();
                    DrawableCompat.setTint(mutate, parseColor);
                    toolbar.setNavigationIcon(mutate);
                }
                if (b() instanceof ITBPublicMenu) {
                    TBPublicMenu publicMenu = ((ITBPublicMenu) b()).getPublicMenu();
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
                this.g = true;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // tb.amu
    public f setBadgeStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d2058db5", new Object[]{this, wXSDKInstance, jSONObject});
        }
        f fVar = new f();
        fVar.b = "Activity not support";
        return fVar;
    }

    @Override // tb.amu
    public f hasMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("9d2f25be", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            Boolean bool = jSONObject.getBoolean("show");
            AppCompatActivity b2 = b();
            if (b2 instanceof CustomBaseActivity) {
                if (bool != null && !bool.booleanValue()) {
                    ((CustomBaseActivity) b2).togglePublicMenu(false);
                } else {
                    ((CustomBaseActivity) b2).togglePublicMenu(true);
                }
                b2.supportInvalidateOptionsMenu();
                return null;
            }
        } catch (Throwable unused) {
        }
        f fVar = new f();
        fVar.b = "Activity not support";
        return fVar;
    }

    @Override // tb.amu
    public f setTransparent(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("da278f75", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (this.e.get().getSupportActionBar() == null || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("transparence");
        if (this.e.get() instanceof ShopRenderActivity) {
            ((ShopRenderActivity) this.e.get()).setNaviTransparent(!"true".equals(string));
        }
        return null;
    }

    @Override // tb.amu
    public f getHeight(WXSDKInstance wXSDKInstance) {
        Toolbar toolbar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("fe9d5526", new Object[]{this, wXSDKInstance});
        }
        AppCompatActivity b2 = b();
        if (b2 == null || b2.getSupportActionBar() == null || (toolbar = (Toolbar) b2.findViewById(R.id.action_bar)) == null) {
            return null;
        }
        f fVar = new f();
        fVar.f2023a = String.valueOf(toolbar.getHeight());
        return fVar;
    }

    @Override // tb.amu
    public f getStatusBarHeight(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("273759d1", new Object[]{this, wXSDKInstance});
        }
        int identifier = d().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return null;
        }
        int dimensionPixelSize = d().getDimensionPixelSize(identifier);
        f fVar = new f();
        fVar.f2023a = String.valueOf(dimensionPixelSize);
        return fVar;
    }

    @Override // tb.amu
    public f showMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        TBPublicMenuItem publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("ffa046e1", new Object[]{this, wXSDKInstance, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        AppCompatActivity b2 = b();
        if (b2 == null) {
            f fVar = new f();
            fVar.f2023a = "WX_NOT_SUPPORTED";
            fVar.b = "activity reference is null";
            return fVar;
        } else if (!(b2 instanceof ShopRenderActivity)) {
            f fVar2 = new f();
            fVar2.f2023a = "WX_NOT_SUPPORTED";
            fVar2.b = "Only ShopRenderActivity support showMenu()";
            return fVar2;
        } else {
            if (jSONObject != null ? "true".equals(jSONObject.get("cancelActualShow")) : false) {
                return null;
            }
            try {
                ShopRenderActivity shopRenderActivity = (ShopRenderActivity) b2;
                if (shopRenderActivity.mTBPublicMenu != null) {
                    TBPublicMenu publicMenu2 = ((ITBPublicMenu) b2).getPublicMenu();
                    if (publicMenu2 != null && (publicMenu = TBPublicMenu.getPublicMenu(R.id.uik_menu_feedback)) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("shopId", this.h);
                        bundle.putString("pageName", "n_Page_Shop");
                        Bundle bundle2 = new Bundle();
                        bundle2.putBundle(hyt.ZZB_BUNDLE_KEY, bundle);
                        publicMenu2.setDefaultPageUserInfo(bundle2);
                        TBPublicMenu.updatePublicMenu(publicMenu, false);
                        if (Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("shop_render", "miniapp_feedback_enable", Boolean.TRUE.toString())) && (wXSDKInstance instanceof AliWXSDKInstance)) {
                            String str = (String) ((AliWXSDKInstance) wXSDKInstance).getExtra("miniAppFeedBackUri", "");
                            JSONObject jSONObject2 = (JSONObject) ((AliWXSDKInstance) wXSDKInstance).getExtra("miniAppFeedBackExtraInfo", "");
                            if (!TextUtils.isEmpty(str) && jSONObject2 != null) {
                                Bundle bundle3 = new Bundle();
                                jSONObject2.put("shopId", (Object) this.h);
                                bundle3.putSerializable("extraInfo", jSONObject2);
                                Bundle bundle4 = new Bundle();
                                bundle4.putBundle(hyt.ZZB_BUNDLE_KEY, bundle3);
                                publicMenu.setNavUrl(str);
                                publicMenu2.setDefaultPageUserInfo(bundle4);
                                TBPublicMenu.updatePublicMenu(publicMenu, false);
                            }
                        }
                    }
                    shopRenderActivity.mTBPublicMenu.show();
                    return null;
                }
                f fVar3 = new f();
                fVar3.f2023a = "WX_NO_TBPUBLICMENU";
                fVar3.b = "is Activity onCreateOptionsMenu called?";
                return fVar3;
            } catch (Exception e) {
                WXLogUtils.e("exception in cancel action animation. ", WXLogUtils.getStackTrace(e));
                f fVar4 = new f();
                fVar4.f2023a = "ERROR";
                fVar4.b = e.getMessage();
                return fVar4;
            }
        }
    }

    @Override // tb.amu
    public boolean onCreateOptionsMenu(WXSDKInstance wXSDKInstance, Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8a4d4d7", new Object[]{this, wXSDKInstance, menu})).booleanValue();
        }
        if (shouldSetNavigator()) {
            b(menu);
            e();
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
        List<com.alibaba.aliweex.hc.bundle.a> menuItemMore = getMenuItemMore();
        if (menuItemMore == null || menuItemMore.isEmpty()) {
            return;
        }
        int i = 0;
        for (final com.alibaba.aliweex.hc.bundle.a aVar : menuItemMore) {
            final int i2 = R.id.navigation_bar_more_start_id + i;
            MenuItem add = menu.add(R.id.navigation_bar_more_group, i2, 0, aVar.d);
            if (aVar.f2025a > 0) {
                add.setIcon(aVar.f2025a);
            } else if (aVar.b > 0) {
                add.setTitle(d().getString(aVar.b) + ":" + aVar.d);
            } else if (aVar.c != null && !aVar.c.isRecycled()) {
                add.setIcon(a(new BitmapDrawable(d(), aVar.c)));
            } else if (!TextUtils.isEmpty(aVar.e)) {
                ImageView imageView = new ImageView(c());
                WXImageStrategy wXImageStrategy = new WXImageStrategy();
                wXImageStrategy.isClipping = true;
                wXImageStrategy.setImageListener(new WXImageStrategy.ImageListener() { // from class: com.taobao.android.shop.weex.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
                    public void onImageFinish(String str, ImageView imageView2, boolean z, Map map) {
                        WeakReference weakReference;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView2, new Boolean(z), map});
                        } else if (map == null || (weakReference = (WeakReference) map.get(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS)) == null || weakReference.get() == null || a.a(a.this) == null) {
                        } else {
                            TBPublicMenu publicMenu = ((ITBPublicMenu) a.a(a.this)).getPublicMenu();
                            publicMenu.getExtraMenu(i2).setIconDrawable(a.a(a.this, (BitmapDrawable) weakReference.get()));
                            publicMenu.notifyMenuChanged();
                        }
                    }
                });
                WXSDKEngine.getIWXImgLoaderAdapter().setImage(aVar.e, imageView, WXImageQuality.ORIGINAL, wXImageStrategy);
            }
            add.setIntent(aVar.f);
            MenuItemCompat.setShowAsAction(add, 8);
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.android.shop.weex.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                    }
                    HashMap hashMap = new HashMap();
                    int i3 = -1;
                    if (menuItem != null && menuItem.getIntent() != null) {
                        try {
                            i3 = menuItem.getIntent().getIntExtra("index", -1);
                        } catch (Exception unused) {
                        }
                    }
                    if (i3 >= 0) {
                        hashMap.put("index", Integer.valueOf(i3));
                        if (aVar.h != null) {
                            aVar.h.a(i3);
                        } else {
                            a.b(a.this).fireEvent(a.c, hashMap);
                        }
                    }
                    return true;
                }
            });
            i++;
        }
    }

    private Resources d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("45bf56bc", new Object[]{this}) : c().getResources();
    }

    private void e() {
        final ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        final com.alibaba.aliweex.hc.bundle.a menuItemTitle = getMenuItemTitle();
        if (menuItemTitle == null || (supportActionBar = b().getSupportActionBar()) == null) {
            return;
        }
        if (TextUtils.isEmpty(menuItemTitle.d)) {
            supportActionBar.d(false);
            final ImageView imageView = new ImageView(c());
            if (menuItemTitle.g) {
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            if (menuItemTitle.f2025a > 0) {
                imageView.setImageResource(menuItemTitle.f2025a);
            } else if (menuItemTitle.b > 0) {
                imageView.setImageDrawable(a(a(b(), menuItemTitle.b)));
            } else if (menuItemTitle.c != null && !menuItemTitle.c.isRecycled()) {
                imageView.setImageDrawable(a(new BitmapDrawable(d(), menuItemTitle.c)));
            } else if (!TextUtils.isEmpty(menuItemTitle.e)) {
                WXImageStrategy wXImageStrategy = new WXImageStrategy();
                wXImageStrategy.isClipping = true;
                wXImageStrategy.setImageListener(new WXImageStrategy.ImageListener() { // from class: com.taobao.android.shop.weex.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
                    public void onImageFinish(String str, ImageView imageView2, boolean z, Map map) {
                        WeakReference weakReference;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView2, new Boolean(z), map});
                        } else if (map == null || (weakReference = (WeakReference) map.get(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS)) == null || weakReference.get() == null) {
                        } else {
                            BitmapDrawable bitmapDrawable = (BitmapDrawable) weakReference.get();
                            int c2 = (int) (supportActionBar.c() * 0.6d);
                            if (menuItemTitle.g) {
                                imageView.setLayoutParams(new Toolbar.LayoutParams(-1, c2));
                                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                                return;
                            }
                            Bitmap bitmap = bitmapDrawable.getBitmap();
                            imageView.setLayoutParams(new Toolbar.LayoutParams((int) ((c2 / bitmap.getHeight()) * bitmap.getWidth()), c2));
                        }
                    }
                });
                WXSDKEngine.getIWXImgLoaderAdapter().setImage(menuItemTitle.e, imageView, WXImageQuality.ORIGINAL, wXImageStrategy);
            }
            imageView.setClickable(true);
            supportActionBar.a(imageView);
            supportActionBar.e(true);
            supportActionBar.b(true);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.shop.weex.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        a.c(a.this).fireEvent(a.d, new HashMap());
                    }
                }
            });
            return;
        }
        supportActionBar.d(true);
        supportActionBar.e(false);
        supportActionBar.a(menuItemTitle.d);
    }

    private void b(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae95e54f", new Object[]{this, menu});
            return;
        }
        final com.alibaba.aliweex.hc.bundle.a menuItemRight = getMenuItemRight();
        try {
            menu.removeItem(R.id.navigation_bar_right_id);
        } catch (Throwable unused) {
        }
        if (menuItemRight == null) {
            return;
        }
        final MenuItem add = menu.add(0, R.id.navigation_bar_right_id, 0, "");
        if (!TextUtils.isEmpty(menuItemRight.d)) {
            add.setTitle(menuItemRight.d);
        } else if (menuItemRight.f2025a > 0) {
            add.setIcon(menuItemRight.f2025a);
        } else if (menuItemRight.b > 0) {
            add.setTitle(AppcompatUtils.getMenuTitle("", menuItemRight.b));
        } else if (menuItemRight.c != null && !menuItemRight.c.isRecycled()) {
            add.setIcon(a(new BitmapDrawable(d(), menuItemRight.c)));
        } else if (!TextUtils.isEmpty(menuItemRight.e)) {
            ImageView imageView = new ImageView(c());
            WXImageStrategy wXImageStrategy = new WXImageStrategy();
            wXImageStrategy.isClipping = true;
            wXImageStrategy.setImageListener(new WXImageStrategy.ImageListener() { // from class: com.taobao.android.shop.weex.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
                public void onImageFinish(String str, ImageView imageView2, boolean z, Map map) {
                    WeakReference weakReference;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView2, new Boolean(z), map});
                    } else if (map == null || (weakReference = (WeakReference) map.get(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS)) == null || weakReference.get() == null) {
                    } else {
                        add.setIcon(a.a(a.this, (BitmapDrawable) weakReference.get()));
                    }
                }
            });
            WXSDKEngine.getIWXImgLoaderAdapter().setImage(menuItemRight.e, imageView, WXImageQuality.ORIGINAL, wXImageStrategy);
        }
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.android.shop.weex.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                }
                if (menuItemRight.h != null) {
                    menuItemRight.h.a(0);
                } else {
                    a.d(a.this).fireEvent(a.b, new HashMap());
                }
                return true;
            }
        });
        MenuItemCompat.setShowAsAction(add, 2);
    }

    public static BitmapDrawable a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("eca02d22", new Object[]{activity, new Integer(i)});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(activity);
        tIconFontTextView.setText(i);
        tIconFontTextView.setTextSize(24.0f);
        tIconFontTextView.getPaint().setFakeBoldText(true);
        tIconFontTextView.setTextColor(FestivalMgr.a().a("actionbarTextColor", activity.getResources().getColor(R.color.abc_title_color)));
        try {
            tIconFontTextView.setTypeface(Typeface.createFromAsset(activity.getAssets(), "uik_iconfont.ttf"));
        } catch (RuntimeException e) {
            WXLogUtils.e("TBNavBarAdapter", WXLogUtils.getStackTrace(e));
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

    @Override // com.alibaba.aliweex.hc.bundle.WXHCNavBarAdapter
    public boolean shouldSetNavigator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823b61f3", new Object[]{this})).booleanValue();
        }
        if (!(b() instanceof ShopRenderActivity)) {
            return true;
        }
        return ((ShopRenderActivity) b()).mActionBarShow;
    }

    private BitmapDrawable a(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("18b3e2ce", new Object[]{this, bitmapDrawable});
        }
        try {
            int c2 = (int) (b().getSupportActionBar().c() * 0.6d);
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (c2 <= 0) {
                c2 = Math.min(116, bitmap.getHeight());
            }
            float f = c2 / height;
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            return new BitmapDrawable(d(), Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true));
        } catch (Throwable unused) {
            return bitmapDrawable;
        }
    }
}
