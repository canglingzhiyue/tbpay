package com.taobao.pha.tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.IImageLoader;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.jsbridge.a;
import com.taobao.pha.core.p;
import com.taobao.pha.core.tabcontainer.b;
import com.taobao.pha.tb.tabcontainer.TabFrameActivity;
import com.taobao.share.ui.engine.friend.a;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.nfz;
import tb.ngn;
import tb.ngr;

@Deprecated
/* loaded from: classes7.dex */
public class m implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String e;

    /* renamed from: a  reason: collision with root package name */
    public TBActionView f18832a;
    public Map<Context, c> b = new HashMap();
    public AppController c;
    public Activity d;

    public static /* synthetic */ BitmapDrawable a(m mVar, BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("c00cc522", new Object[]{mVar, bitmapDrawable}) : mVar.a(bitmapDrawable);
    }

    static {
        kge.a(-868726079);
        kge.a(-112471224);
        e = m.class.getSimpleName();
    }

    public m(AppController appController) {
        this.c = appController;
        this.c.a(this);
    }

    @Override // com.taobao.pha.core.tabcontainer.b
    public void a(Menu menu) {
        boolean z;
        if (!(this.c.C() instanceof Activity)) {
            return;
        }
        this.d = (Activity) this.c.C();
        try {
            try {
                Field declaredField = this.d.getClass().getSuperclass().getSuperclass().getDeclaredField("mNeedPublicMenuShow");
                declaredField.setAccessible(true);
                z = ((Boolean) declaredField.get(this.d)).booleanValue();
            } catch (Exception unused) {
                ngr.c(e, "error in get mNeedPublicMenuShow from BaseActivity");
                z = true;
            }
            if (z) {
                MenuItem findItem = menu.findItem(R.id.uik_menu_overflow);
                if (findItem == null) {
                    menu = new TBPublicMenu(this.d).onCreateOptionsMenu(this.d.getMenuInflater(), menu);
                    findItem = menu.findItem(R.id.uik_menu_overflow);
                }
                if (findItem != null && findItem.getActionView() != null) {
                    this.f18832a = (TBActionView) findItem.getActionView();
                } else {
                    this.f18832a = ((TabFrameActivity) this.d).getPublicMenu().getCustomOverflow();
                    ((TabFrameActivity) this.d).getPublicMenu().setCustomOverflow(this.f18832a);
                }
            }
            menu.removeGroup(R.id.pha_navigation_bar_more_group);
            if (this.b != null && !this.b.isEmpty() && this.d != null) {
                int i = 0;
                for (Map.Entry<Context, c> entry : this.b.entrySet()) {
                    c value = entry.getValue();
                    final int i2 = R.id.navigation_bar_more_start_id + i;
                    MenuItem add = menu.add(R.id.pha_navigation_bar_more_group, i2, 0, value.d);
                    if (value.f18809a > 0) {
                        add.setIcon(value.f18809a);
                    } else if (value.b > 0) {
                        add.setTitle(this.d.getResources().getString(value.b) + ":" + value.d);
                    } else if (value.c != null && !value.c.isRecycled()) {
                        add.setIcon(a(new BitmapDrawable(this.d.getResources(), value.c)));
                    } else if (!StringUtils.isEmpty(value.e)) {
                        ImageView imageView = new ImageView(this.d);
                        IImageLoader t = p.b().t();
                        if (t != null) {
                            IImageLoader.b bVar = new IImageLoader.b();
                            bVar.f18706a = true;
                            bVar.c = new IImageLoader.a() { // from class: com.taobao.pha.tb.m.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.pha.core.IImageLoader.a
                                public void a(String str, ImageView imageView2, boolean z2, Map<String, WeakReference<BitmapDrawable>> map) {
                                    WeakReference<BitmapDrawable> weakReference;
                                    IpChange ipChange = $ipChange;
                                    if (ipChange instanceof IpChange) {
                                        ipChange.ipc$dispatch("3bb26b9d", new Object[]{this, str, imageView2, new Boolean(z2), map});
                                    } else if (map == null || (weakReference = map.get(a.CONTACTS_INFO_NOT_EMPTY_STATUS)) == null || weakReference.get() == null || !(m.this.d instanceof ITBPublicMenu)) {
                                    } else {
                                        TBPublicMenu publicMenu = ((ITBPublicMenu) m.this.d).getPublicMenu();
                                        publicMenu.getExtraMenu(i2).setIconDrawable(m.a(m.this, weakReference.get()));
                                        publicMenu.notifyMenuChanged();
                                    }
                                }
                            };
                            t.a(imageView, value.e, IImageLoader.ImageQuality.ORIGINAL, bVar);
                        }
                    }
                    add.setIntent(value.f);
                    MenuItemCompat.setShowAsAction(add, 8);
                    add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.pha.tb.m.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            int intExtra;
                            nfz pageView;
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                            }
                            if (menuItem == null || menuItem.getIntent() == null || (intExtra = menuItem.getIntent().getIntExtra("index", -1)) < 0) {
                                return false;
                            }
                            try {
                                com.taobao.pha.core.controller.k w = m.this.c.w();
                                if (w != null && w.c() != null && (pageView = w.c().getPageView()) != null) {
                                    View j = pageView.j();
                                    if (j instanceof WVUCWebView) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("index", (Object) Integer.valueOf(intExtra));
                                        pageView.evaluateJavaScript(ngn.a("menuitemclick", jSONObject, pageView.d()));
                                        WVStandardEventCenter.postNotificationToJS((WVUCWebView) j, "onPHAMenuItemClick", jSONObject.toJSONString());
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("msgType", (Object) "call");
                                        jSONObject2.put("func", (Object) "menuItemClick");
                                        JSONObject jSONObject3 = new JSONObject();
                                        jSONObject3.put("index", (Object) Integer.valueOf(intExtra));
                                        jSONObject2.put("param", (Object) jSONObject3);
                                        if (m.this.c.J() != null) {
                                            m.this.c.J().a(jSONObject2);
                                        }
                                        return true;
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            return false;
                        }
                    });
                    i++;
                }
            }
        } catch (Exception e2) {
            String str = e;
            ngr.c(str, "error in find overflow menu button. " + e2.getMessage());
        }
    }

    @Override // com.taobao.pha.core.tabcontainer.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f18832a = null;
        this.b.clear();
    }

    @Override // com.taobao.pha.core.tabcontainer.b
    public boolean a(final a.InterfaceC0751a interfaceC0751a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0427003", new Object[]{this, interfaceC0751a})).booleanValue();
        }
        if (this.c.D().isFragment()) {
            TBPublicMenu publicMenu = ((TBPHAFragment) this.c.D()).getPublicMenu();
            if (publicMenu != null) {
                publicMenu.show();
                interfaceC0751a.a(null);
                return true;
            }
            PHAErrorType pHAErrorType = PHAErrorType.REFERENCE_ERROR;
            interfaceC0751a.a(pHAErrorType, "No ActionBar in this Activity: " + this.d.getPackageName());
        } else {
            TBActionView tBActionView = this.f18832a;
            if (tBActionView != null) {
                tBActionView.setVisibility(4);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.pha.tb.m.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (m.this.f18832a != null) {
                            m.this.f18832a.performClick();
                        }
                        interfaceC0751a.a(null);
                    }
                }, 64L);
                return true;
            }
            interfaceC0751a.a(PHAErrorType.REFERENCE_ERROR, "ActionView is null");
        }
        return false;
    }

    @Override // com.taobao.pha.core.tabcontainer.b
    public boolean a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cb6e294", new Object[]{this, context, jSONObject})).booleanValue();
        }
        if (this.b.get(context) != null && context != this.d) {
            return false;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            if (jSONArray != null && jSONArray.size() > 0) {
                this.b.clear();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    c cVar = new c();
                    String string = jSONObject2.getString("text");
                    if (!StringUtils.isEmpty(string)) {
                        cVar.d = string;
                        boolean booleanValue = jSONObject2.getBooleanValue("fromNative");
                        boolean booleanValue2 = jSONObject2.getBooleanValue("iconFont");
                        String string2 = jSONObject2.getString("icon");
                        if (booleanValue) {
                            if (booleanValue2 && this.d != null) {
                                cVar.a((Context) this.d, string2);
                            } else {
                                cVar.a(string2);
                            }
                        } else {
                            cVar.a(this.d, string2);
                        }
                        cVar.f = new Intent();
                        cVar.f.putExtra("index", i);
                        this.b.put(context, cVar);
                    }
                }
                if (this.d != null) {
                    this.d.invalidateOptionsMenu();
                }
                return true;
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    private BitmapDrawable a(BitmapDrawable bitmapDrawable) {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("18b3e2ce", new Object[]{this, bitmapDrawable});
        }
        try {
            if ((this.d instanceof AppCompatActivity) && (supportActionBar = ((AppCompatActivity) this.d).getSupportActionBar()) != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                float c = ((int) (supportActionBar.c() * 0.6d)) / height;
                Matrix matrix = new Matrix();
                matrix.postScale(c, c);
                return new BitmapDrawable(this.d.getResources(), Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true));
            }
        } catch (Throwable th) {
            String str = e;
            ngr.b(str, "ResizeIcon failed " + th);
        }
        return bitmapDrawable;
    }
}
