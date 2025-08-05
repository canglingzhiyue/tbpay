package com.taobao.tao;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.security.realidentity.ui.activity.BaseBioNavigatorActivity;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguActivity;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.tao.util.TBDialog;
import com.taobao.tao.util.TBMainLog;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.immersive.ITBImmersive;
import com.ut.mini.UTAnalytics;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class BaseActivity extends PanguActivity implements e, ITBPublicMenu, ITBImmersive {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LAUNCH_TYPE_COLD = "COLD";
    private static final String LAUNCH_TYPE_HOT = "HOT";
    private h mOnKeyDownListener;
    private TBPublicMenu mPublicMenu;
    private Toolbar mToolbar;
    public SystemBarDecorator systemBarDecorator;
    private final String TAG = BaseBioNavigatorActivity.g;
    private boolean disablefinishAnimation = false;
    private boolean mNeedPublicMenuShow = true;
    private boolean mActionbarInited = false;
    private boolean mTbPublicMenuInited = false;
    private boolean mIgnoreFestival = false;

    public static /* synthetic */ Object ipc$super(BaseActivity baseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1824869760:
                return new Boolean(super.onPrepareOptionsMenu((Menu) objArr[0]));
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -1512649357:
                super.onResume();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -244620436:
                super.setSupportActionBar((Toolbar) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 902425770:
                super.startActivityForResult((Intent) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 921927566:
                super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 1683598447:
                super.setContentView((View) objArr[0]);
                return null;
            case 1770587104:
                super.setContentView(((Number) objArr[0]).intValue());
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public final Activity getActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this}) : this;
    }

    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean needPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24050629", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean onMenuPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4ff2f5f", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    public boolean onPanelKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f42cd860", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        return null;
    }

    public boolean toolbarNeedNewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405dd14d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(1961281184);
        kge.a(-1343974867);
        kge.a(-213345416);
        kge.a(351500476);
        kge.a(37515620);
        com.taobao.application.common.c.a(new j(), true);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ActionBar supportActionBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        getTheme().applyStyle(R.style.TBDefaultStyle, true);
        this.systemBarDecorator = new SystemBarDecorator(this);
        super.onCreate(bundle);
        if (needActionBarInner() && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.b(false);
            supportActionBar.c(true);
            supportActionBar.a(true);
        }
        if (this.systemBarDecorator != null) {
            if (isImmersiveStatus()) {
                this.systemBarDecorator.enableImmersiveStatusBar();
            } else {
                this.systemBarDecorator.enableImmersiveStatus("#00000000", isTranslucent());
            }
        }
        if (needPublicMenu()) {
            initTBPublicMenu();
        }
        if (!needActionBarInner()) {
            return;
        }
        initDefaultActionBar();
    }

    private void initTBPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2b30d", new Object[]{this});
        } else if (this.mTbPublicMenuInited) {
        } else {
            this.mPublicMenu = new TBPublicMenu(this);
            if (toolbarNeedNewStyle()) {
                this.mPublicMenu.useNewActionViewStyle();
            }
            this.mPublicMenu.setActionViewIconColor(ContextCompat.getColor(this, R.color.uik_action_icon_normal));
            this.mTbPublicMenuInited = true;
        }
    }

    private void initDefaultActionBar() {
        ActionBar supportActionBar;
        Toolbar toolbar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74ec4c73", new Object[]{this});
        } else if (this.mActionbarInited || (supportActionBar = getSupportActionBar()) == null) {
        } else {
            supportActionBar.a(0.0f);
            supportActionBar.b(ContextCompat.getDrawable(this, R.color.uik_action_bar_normal));
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.action_bar_container);
            Toolbar toolbar2 = (Toolbar) findViewById(R.id.action_bar);
            if (toolbar2 == null && (toolbar = this.mToolbar) != null) {
                toolbar2 = toolbar;
            }
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                layoutParams.height = (int) getResources().getDimension(R.dimen.uik_action_bar_height);
                viewGroup.setLayoutParams(layoutParams);
            }
            if (toolbar2 != null) {
                toolbar2.setContentInsetStartWithNavigation(0);
                ViewGroup.LayoutParams layoutParams2 = toolbar2.getLayoutParams();
                layoutParams2.height = (int) getResources().getDimension(R.dimen.uik_action_bar_height);
                toolbar2.setLayoutParams(layoutParams2);
                toolbar2.setTitleTextAppearance(this, R.style.TBTitle);
                toolbar2.setSubtitleTextAppearance(this, R.style.TBSubTitle);
                toolbar2.setTitleMargin(0, toolbar2.getTitleMarginTop(), 0, toolbar2.getTitleMarginBottom());
                toolbar2.setTitleTextColor(ContextCompat.getColor(this, R.color.uik_action_icon_normal));
                toolbar2.setSubtitleTextColor(ContextCompat.getColor(this, R.color.uik_action_icon_normal));
                if ((supportActionBar.b() & 4) != 0) {
                    toolbar2.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
                }
                Drawable navigationIcon = toolbar2.getNavigationIcon();
                if (navigationIcon != null) {
                    Drawable wrap = DrawableCompat.wrap(navigationIcon);
                    wrap.mutate();
                    DrawableCompat.setTint(wrap, ContextCompat.getColor(this, R.color.uik_action_icon_normal));
                }
                Drawable overflowIcon = toolbar2.getOverflowIcon();
                if (overflowIcon != null) {
                    Drawable wrap2 = DrawableCompat.wrap(overflowIcon);
                    wrap2.mutate();
                    DrawableCompat.setTint(wrap2, ContextCompat.getColor(this, R.color.uik_action_icon_normal));
                }
            }
            TBPublicMenu tBPublicMenu = this.mPublicMenu;
            if (tBPublicMenu != null) {
                tBPublicMenu.setActionViewIconColor(ContextCompat.getColor(this, R.color.uik_action_icon_normal));
            }
            this.mActionbarInited = true;
        }
    }

    public String getUTClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b84448b", new Object[]{this}) : getClass().getName();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c9ecaa", new Object[]{this, intent, new Integer(i)});
        } else {
            super.startActivityForResult(intent, i);
        }
    }

    public void disableFinishAnimationOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c331d1", new Object[]{this});
        } else {
            this.disablefinishAnimation = true;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        com.taobao.android.linkback.f.a(getIntent(), this);
        super.finish();
        if (!this.disablefinishAnimation) {
            overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
        } else {
            this.disablefinishAnimation = false;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("isbk", "1");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
    }

    public void finish(boolean z) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Intent intent = getIntent();
            if (intent != null && (data = intent.getData()) != null) {
                ComponentName component = intent.getComponent();
                TBS.Ext.commitEvent(b.PAGE_FLOWCUSTOMS, 1013, "afc_finish_exception", data.toString(), component == null ? "Unknow" : component.getClassName());
            }
            super.finish();
        } else {
            finish();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu != null) {
            tBPublicMenu.onResume();
        }
        if (needActionBar()) {
            initDefaultActionBar();
        }
        this.mActionbarInited = true;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu == null) {
            return;
        }
        tBPublicMenu.onPause();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        if (Constants.statusBarHeight != 0) {
            return;
        }
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        Constants.statusBarHeight = rect.top;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu == null) {
            return super.onCreateOptionsMenu(menu);
        }
        tBPublicMenu.togglePublicMenu(this.mNeedPublicMenuShow);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null && supportActionBar.f()) {
            menu = this.mPublicMenu.onCreateOptionsMenu(getMenuInflater(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("933ab280", new Object[]{this, menu})).booleanValue();
        }
        TBPublicMenu tBPublicMenu = this.mPublicMenu;
        if (tBPublicMenu != null) {
            menu = tBPublicMenu.onPrepareOptionsMenu(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        h hVar;
        if (!isFinishing()) {
            if (keyEvent.getRepeatCount() > 0 && ((i == 4 || i == 25) && getString(R.string.env_switch).equals("1"))) {
                try {
                    Class<?> cls = Class.forName("android.taobao.mulitenv.EnvironmentViewControler");
                    Method method = cls.getMethod("getRootView", new Class[0]);
                    final Method method2 = cls.getMethod("exit", new Class[0]);
                    final Object newInstance = cls.getConstructor(Activity.class).newInstance(this);
                    if (newInstance != null) {
                        final TBDialog tBDialog = new TBDialog(this, -1, "环境设置", null, (View) method.invoke(newInstance, new Object[0]), true);
                        tBDialog.setPositiveButton(new View.OnClickListener() { // from class: com.taobao.tao.BaseActivity.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                tBDialog.dismiss();
                                SharedPreferences.Editor edit = BaseActivity.this.getApplicationContext().getSharedPreferences(TransportConstants.KEY_UUID, 0).edit();
                                edit.clear();
                                edit.commit();
                                try {
                                    method2.invoke(newInstance, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException unused) {
                                }
                            }
                        });
                        tBDialog.setNegativeButton(new View.OnClickListener() { // from class: com.taobao.tao.BaseActivity.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                tBDialog.dismiss();
                                try {
                                    method2.invoke(newInstance, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException unused) {
                                }
                            }
                        });
                        tBDialog.show();
                        TBMainLog.tlog(BaseBioNavigatorActivity.g, "show debug dialog");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            } else if (keyEvent.getRepeatCount() <= 0 && (hVar = this.mOnKeyDownListener) != null && hVar.onKeyDown(i, keyEvent)) {
                return false;
            } else {
                if (keyEvent.getRepeatCount() > 0 || onMenuPanelKeyDown(i, keyEvent) || onPanelKeyDown(i, keyEvent)) {
                    if (i != 4) {
                        return super.onKeyDown(i, keyEvent);
                    }
                    return true;
                } else if (i == 4) {
                    finish();
                    return true;
                } else {
                    return super.onKeyDown(i, keyEvent);
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public SharedPreferences getSharedPreferences(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("fd9d24e9", new Object[]{this, str, new Integer(i)}) : getApplicationContext().getSharedPreferences(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getFilesDir() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("71bd455a", new Object[]{this}) : getApplicationContext().getFilesDir();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getCacheDir() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("4c9546e5", new Object[]{this}) : getApplicationContext().getCacheDir();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getDir(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("3f9f0d92", new Object[]{this, str, new Integer(i)}) : getApplicationContext().getDir(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public File getDatabasePath(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("477c0ba6", new Object[]{this, str}) : getApplicationContext().getDatabasePath(str);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void setContentView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        super.setContentView(i);
        getSystemBarDecorator().enableFitsWindowsOnRoot(isFitsWindowsOnRoot());
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void setContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        super.setContentView(view);
        getSystemBarDecorator().enableFitsWindowsOnRoot(isFitsWindowsOnRoot());
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
            return;
        }
        super.setContentView(view, layoutParams);
        getSystemBarDecorator().enableFitsWindowsOnRoot(isFitsWindowsOnRoot());
    }

    public final <E extends View> E getView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)});
        }
        try {
            return (E) findViewById(i);
        } catch (ClassCastException e) {
            Log.e(BaseBioNavigatorActivity.g, "Could not cast View to concrete class.", e);
            throw e;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8788f87", new Object[]{this})).booleanValue();
        }
        if (onPanelKeyDown(4, new KeyEvent(1, 4))) {
            return true;
        }
        finish();
        overridePendingTransition(R.anim.activity_push_right_in, R.anim.activity_push_right_out);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue() : super.onOptionsItemSelected(menuItem);
    }

    public boolean isFitsWindowsOnRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86dc3ce3", new Object[]{this})).booleanValue();
        }
        if (this.systemBarDecorator == null) {
            this.systemBarDecorator = new SystemBarDecorator(this);
        }
        if (this.systemBarDecorator.getType() == 1) {
            return true;
        }
        return isTranslucent();
    }

    public SystemBarDecorator getSystemBarDecorator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SystemBarDecorator) ipChange.ipc$dispatch("c560c54d", new Object[]{this});
        }
        if (this.systemBarDecorator == null) {
            this.systemBarDecorator = new SystemBarDecorator(this);
        }
        return this.systemBarDecorator;
    }

    @Deprecated
    public void supportDisablePublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0884068", new Object[]{this});
        } else {
            this.mNeedPublicMenuShow = false;
        }
    }

    public void togglePublicMenu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c9aad1", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedPublicMenuShow = z;
        }
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this}) : this.mPublicMenu;
    }

    @Override // android.support.v7.app.AppCompatActivity
    public void setSupportActionBar(Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16b636c", new Object[]{this, toolbar});
            return;
        }
        super.setSupportActionBar(toolbar);
        this.mToolbar = toolbar;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.b(false);
        supportActionBar.c(true);
        supportActionBar.a(true);
    }

    public Toolbar getToolbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Toolbar) ipChange.ipc$dispatch("21834ebf", new Object[]{this}) : this.mToolbar;
    }

    public boolean isIgnoreFestival() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5f87bbf", new Object[]{this})).booleanValue() : this.mIgnoreFestival;
    }

    public void setIgnoreFestival(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc688441", new Object[]{this, new Boolean(z)});
        } else {
            this.mIgnoreFestival = z;
        }
    }

    @Override // com.taobao.tao.e
    public void registerOnKeyDownListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca6f2c1", new Object[]{this, hVar});
        } else {
            this.mOnKeyDownListener = hVar;
        }
    }

    private boolean needActionBarInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d90fd9a", new Object[]{this})).booleanValue();
        }
        if (!com.taobao.tao.tbmainfragment.d.d()) {
            return true;
        }
        return needActionBar();
    }
}
