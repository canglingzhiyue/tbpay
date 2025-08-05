package com.taobao.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.pm.ShortcutManagerCompat;
import android.taobao.windvane.config.a;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.browser.BrowserHybridWebView;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.utils.i;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.webview.PHAWVUCWebView;
import com.taobao.themis.container.app.TMSActivity;
import com.taobao.themis.kernel.f;
import com.uc.webview.internal.interfaces.IWebViewExtension;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.hyt;
import tb.kge;
import tb.ngr;
import tb.ngu;

/* loaded from: classes6.dex */
public class WebAppInterface extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private Handler mHandler;
    private PageStartWVEventListener pageStartWVEventListener;
    private boolean mAutoHideMenuRightItem = false;
    private boolean mAutoHideMenuSecondRightItem = false;
    private boolean mAutoHideMenuMoreItem = false;
    private boolean mAutoHideShortCut = false;
    private boolean mAutoShowNavbar = false;

    public static /* synthetic */ Object ipc$super(WebAppInterface webAppInterface, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        } else if (hashCode != -1504501726) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroy();
            return null;
        }
    }

    public static /* synthetic */ void access$000(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f95220e1", new Object[]{webAppInterface});
        } else {
            webAppInterface.tryAutoResetItem();
        }
    }

    public static /* synthetic */ Context access$100(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fd895a38", new Object[]{webAppInterface}) : webAppInterface.mContext;
    }

    public static /* synthetic */ Handler access$200(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("aca25ec7", new Object[]{webAppInterface}) : webAppInterface.mHandler;
    }

    public static /* synthetic */ boolean access$300(WebAppInterface webAppInterface, Context context, String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64ad5a54", new Object[]{webAppInterface, context, str, str2, bitmap})).booleanValue() : webAppInterface.createShortCutApi26(context, str, str2, bitmap);
    }

    public static /* synthetic */ boolean access$400(WebAppInterface webAppInterface, Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd9ed119", new Object[]{webAppInterface, context, str})).booleanValue() : webAppInterface.isShortCutOnDesktopApi26(context, str);
    }

    public static /* synthetic */ Context access$500(WebAppInterface webAppInterface) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5e60fb4", new Object[]{webAppInterface}) : webAppInterface.mContext;
    }

    static {
        kge.a(324610729);
        TAG = WebAppInterface.class.getSimpleName();
    }

    /* loaded from: classes6.dex */
    public static class PageStartWVEventListener implements aek {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<WebAppInterface> webAppInterfaceWeakReference;

        static {
            kge.a(-17515753);
            kge.a(1845411121);
        }

        public PageStartWVEventListener(WebAppInterface webAppInterface) {
            this.webAppInterfaceWeakReference = new WeakReference<>(webAppInterface);
        }

        @Override // tb.aek
        public ael onEvent(int i, aej aejVar, Object... objArr) {
            WeakReference<WebAppInterface> weakReference;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
            }
            if (i != 1001 || (weakReference = this.webAppInterfaceWeakReference) == null) {
                return null;
            }
            WebAppInterface webAppInterface = weakReference.get();
            if (webAppInterface != null) {
                WebAppInterface.access$000(webAppInterface);
                return null;
            } else if (!m.a()) {
                return null;
            } else {
                m.c("WebAppInterface", "webAppInterfaceWeakReference is free");
                return null;
            }
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
            return;
        }
        super.initialize(context, iWVWebView);
        if (iWVWebView instanceof BrowserHybridWebView) {
            this.mHandler = ((BrowserHybridWebView) iWVWebView).getOutHandler();
        } else {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        this.pageStartWVEventListener = new PageStartWVEventListener(this);
        aem.a().a(this.pageStartWVEventListener);
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mAutoHideMenuRightItem = false;
        this.mAutoHideMenuSecondRightItem = false;
        this.mAutoHideMenuMoreItem = false;
        this.mAutoHideShortCut = false;
        this.mAutoShowNavbar = false;
        this.mHandler = null;
        if (this.pageStartWVEventListener != null) {
            aem.a().b(this.pageStartWVEventListener);
        }
        super.onDestroy();
    }

    private void tryAutoResetItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d949129f", new Object[]{this});
            return;
        }
        if (this.mAutoHideMenuMoreItem) {
            this.mAutoHideMenuMoreItem = false;
            Message obtain = Message.obtain();
            obtain.what = i.ACTIONBAR_MENU_LIST;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i.ACTION_BAR_ITEM_HIDE, true);
            obtain.obj = bundle;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        }
        if (this.mAutoHideMenuRightItem) {
            this.mAutoHideMenuRightItem = false;
            Message obtain2 = Message.obtain();
            obtain2.what = i.ACTIONBAR_MENU_RIGHT;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(i.ACTION_BAR_ITEM_HIDE, true);
            obtain2.obj = bundle2;
            Handler handler2 = this.mHandler;
            if (handler2 != null) {
                handler2.sendMessage(obtain2);
            }
        }
        if (this.mAutoHideMenuSecondRightItem) {
            this.mAutoHideMenuSecondRightItem = false;
            Message obtain3 = Message.obtain();
            obtain3.what = i.ACTIONBAR_MENU_SECOND_RIGHT;
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(i.ACTION_BAR_ITEM_HIDE, true);
            obtain3.obj = bundle3;
            Handler handler3 = this.mHandler;
            if (handler3 != null) {
                handler3.sendMessage(obtain3);
            }
        }
        if (this.mAutoHideShortCut) {
            this.mAutoHideShortCut = false;
            Message obtain4 = Message.obtain();
            obtain4.what = i.ACTIONBAR_ADDTODESKTOP;
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean(i.ACTION_BAR_ITEM_HIDE, true);
            obtain4.obj = bundle4;
            Handler handler4 = this.mHandler;
            if (handler4 != null) {
                handler4.sendMessage(obtain4);
            }
        }
        if (!this.mAutoShowNavbar) {
            return;
        }
        this.mAutoShowNavbar = false;
        Message obtain5 = Message.obtain();
        obtain5.what = i.HIDDEN_NAVBAR;
        obtain5.obj = "0";
        Handler handler5 = this.mHandler;
        if (handler5 == null) {
            return;
        }
        handler5.sendMessage(obtain5);
    }

    public void pop(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b46e01f", new Object[]{this, wVCallBackContext, str});
        } else if (this.mContext instanceof TMSActivity) {
            f b = ((TMSActivity) this.mContext).b();
            if (b != null && b.p()) {
                wVCallBackContext.success();
            } else {
                wVCallBackContext.error("tmsInstance is null");
            }
        } else {
            Message obtain = Message.obtain(this.mHandler);
            obtain.obj = str;
            obtain.what = 88;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        }
    }

    public void setCustomPageTitle(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4daeb983", new Object[]{this, obj, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                String decode = URLDecoder.decode(str, "utf-8");
                try {
                    JSONObject jSONObject = new JSONObject(decode);
                    Bundle bundle = new Bundle();
                    String optString = jSONObject.optString("icon", "");
                    boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                    boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                    boolean optBoolean3 = jSONObject.optBoolean("stretch", false);
                    String optString2 = jSONObject.optString("title", "");
                    String optString3 = jSONObject.optString("iconType", "");
                    bundle.putString("icon", optString);
                    bundle.putString("title", optString2);
                    bundle.putBoolean("stretch", optBoolean3);
                    if (TextUtils.isEmpty(optString2)) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString("iconType", optString3);
                        } else {
                            String str2 = optBoolean ? optBoolean2 ? "IconFont" : "Native" : "Base64";
                            if (!TextUtils.isEmpty(str2)) {
                                bundle.putString("iconType", str2);
                            }
                        }
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = bundle;
                    obtain.what = 1104;
                    obtain.arg1 = 111;
                    if (this.mHandler != null) {
                        this.mHandler.sendMessage(obtain);
                    }
                    ((WVCallBackContext) obj).success();
                } catch (JSONException unused) {
                    m.e("WebAppInterface", "setCustomPageTitle: param parse to JSON error, param=" + decode);
                    ((WVCallBackContext) obj).error();
                }
            } catch (Exception unused2) {
                m.e("WebAppInterface", "getLinkparam: param decode error param=" + str);
                ((WVCallBackContext) obj).error();
            }
        }
    }

    public void getLinkparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d060cca", new Object[]{this, obj, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                str = URLDecoder.decode(str, "utf-8");
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("linkhref");
                String string2 = jSONObject.getString("linkonclick");
                if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("linkhref", string);
                bundle.putString("linkonclick", string2);
                Message obtain = Message.obtain();
                obtain.what = 1108;
                obtain.obj = bundle;
                if (this.mHandler != null) {
                    this.mHandler.sendMessage(obtain);
                }
                ((WVCallBackContext) obj).success();
            } catch (Exception unused) {
                m.e("WebAppInterface", "getLinkparam: param parse to JSON error, param=" + str);
                ((WVCallBackContext) obj).error();
            }
        }
    }

    private boolean createShortCutApi26(Context context, String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59d414d9", new Object[]{this, context, str, str2, bitmap})).booleanValue();
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage(context.getPackageName());
            intent.setData(Uri.parse(str));
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(new ShortcutInfo.Builder(context, str2).setShortLabel(str2).setLongLabel(str2).setIcon(Icon.createWithBitmap(bitmap)).setIntent(intent).build(), null);
        } catch (Exception e) {
            m.e("WebAppInterface", "createShortCutApi26: failed, reason:" + e);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.taobao.browser.jsbridge.WebAppInterface$1] */
    public void addShortcutToDesktop(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f92768", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final String optString = jSONObject.optString("title");
                final String optString2 = jSONObject.optString("icon");
                final String optString3 = jSONObject.optString("url");
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && Uri.parse(optString2).isHierarchical() && Uri.parse(optString3).isHierarchical()) {
                    new AsyncTask() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.os.AsyncTask
                        public Object doInBackground(Object[] objArr) {
                            Bitmap decodeByteArray;
                            Handler access$200;
                            Runnable runnable;
                            IpChange ipChange2 = $ipChange;
                            boolean z = true;
                            if (ipChange2 instanceof IpChange) {
                                return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                            }
                            byte[] bytedata = new DegradableNetwork(WebAppInterface.access$100(WebAppInterface.this)).syncSend(new RequestImpl(optString2), null).getBytedata();
                            if (bytedata == null || bytedata.length <= 0 || (decodeByteArray = BitmapFactory.decodeByteArray(bytedata, 0, bytedata.length)) == null || WebAppInterface.access$200(WebAppInterface.this) == null) {
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1.3
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.error(r.RET_PARAM_ERR);
                                            }
                                        }
                                    });
                                }
                                return null;
                            }
                            if (Build.VERSION.SDK_INT < 26 || !ShortcutManagerCompat.isRequestPinShortcutSupported(a.f)) {
                                BrowserUtil.a(a.f, optString3, optString, decodeByteArray);
                            } else {
                                z = WebAppInterface.access$300(WebAppInterface.this, a.f, optString3, optString, decodeByteArray);
                            }
                            if (z) {
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    access$200 = WebAppInterface.access$200(WebAppInterface.this);
                                    runnable = new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.success(r.RET_SUCCESS);
                                            }
                                        }
                                    };
                                    access$200.post(runnable);
                                }
                                return null;
                            }
                            if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                access$200 = WebAppInterface.access$200(WebAppInterface.this);
                                runnable = new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.1.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            wVCallBackContext.error(r.RET_FAIL);
                                        }
                                    }
                                };
                                access$200.post(runnable);
                            }
                            return null;
                        }
                    }.execute(new Object[0]);
                } else if (this.mHandler == null) {
                } else {
                    this.mHandler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                wVCallBackContext.error(r.RET_PARAM_ERR);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
                m.e("WebAppInterface", "setShortcutToDesktop: param parse to JSON error, param=" + str);
                Handler handler = this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            wVCallBackContext.error(r.RET_PARAM_ERR);
                        }
                    }
                });
            }
        } else {
            wVCallBackContext.error(r.RET_PARAM_ERR);
        }
    }

    private boolean isShortCutOnDesktopApi26(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28b56a5e", new Object[]{this, context, str})).booleanValue();
        }
        try {
            for (ShortcutInfo shortcutInfo : ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getPinnedShortcuts()) {
                if (str.equals(shortcutInfo.getLongLabel())) {
                    return true;
                }
            }
        } catch (Exception e) {
            m.e("WebAppInterface", "isShortCutOnDesktopApi26: failed, reason:" + e);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.taobao.browser.jsbridge.WebAppInterface$4] */
    public void isShortcutOnDesktop(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da4225b", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                final String optString = new JSONObject(str).optString("title");
                if (!TextUtils.isEmpty(optString)) {
                    new AsyncTask() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.os.AsyncTask
                        public Object doInBackground(Object[] objArr) {
                            Handler access$200;
                            Runnable runnable;
                            IpChange ipChange2 = $ipChange;
                            boolean z = false;
                            if (ipChange2 instanceof IpChange) {
                                return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                            }
                            if (WebAppInterface.access$200(WebAppInterface.this) == null) {
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4.3
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.error(r.RET_PARAM_ERR);
                                            }
                                        }
                                    });
                                }
                                return null;
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                z = WebAppInterface.access$400(WebAppInterface.this, a.f, optString);
                            }
                            if (z) {
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    access$200 = WebAppInterface.access$200(WebAppInterface.this);
                                    runnable = new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.success(r.RET_SUCCESS);
                                            }
                                        }
                                    };
                                    access$200.post(runnable);
                                }
                                return null;
                            }
                            if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                access$200 = WebAppInterface.access$200(WebAppInterface.this);
                                runnable = new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.4.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            wVCallBackContext.error(r.RET_FAIL);
                                        }
                                    }
                                };
                                access$200.post(runnable);
                            }
                            return null;
                        }
                    }.execute(new Object[0]);
                } else if (this.mHandler == null) {
                } else {
                    this.mHandler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                wVCallBackContext.error(r.RET_PARAM_ERR);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
                m.e("WebAppInterface", "isShortcutOnDesktop: param parse to JSON error, param=" + str);
                Handler handler = this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            wVCallBackContext.error(r.RET_PARAM_ERR);
                        }
                    }
                });
            }
        } else {
            wVCallBackContext.error(r.RET_PARAM_ERR);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.taobao.browser.jsbridge.WebAppInterface$7] */
    public void setShortcutToDesktop(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d911b07", new Object[]{this, wVCallBackContext, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final Bundle bundle = new Bundle();
                String optString = jSONObject.optString("title");
                final String optString2 = jSONObject.optString("icon");
                String optString3 = jSONObject.optString("url");
                String optString4 = jSONObject.optString("buttonText");
                this.mAutoHideShortCut = jSONObject.optBoolean("autoReset", false);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && Uri.parse(optString2).isHierarchical() && Uri.parse(optString3).isHierarchical()) {
                    bundle.putString("title", optString);
                    bundle.putString("icon", optString2);
                    bundle.putString("url", optString3);
                    bundle.putString("buttonText", optString4);
                    new AsyncTask() { // from class: com.taobao.browser.jsbridge.WebAppInterface.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.os.AsyncTask
                        public Object doInBackground(Object[] objArr) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr});
                            }
                            byte[] bytedata = new DegradableNetwork(WebAppInterface.access$500(WebAppInterface.this)).syncSend(new RequestImpl(optString2), null).getBytedata();
                            if (bytedata != null && bytedata.length > 0 && BitmapFactory.decodeByteArray(bytedata, 0, bytedata.length) != null) {
                                bundle.putByteArray(IWebViewExtension.SNAPSHOT_BUNDLE_KEY_BITMAP, bytedata);
                                Message obtain = Message.obtain();
                                obtain.what = i.ACTIONBAR_ADDTODESKTOP;
                                obtain.obj = bundle;
                                if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                    WebAppInterface.access$200(WebAppInterface.this).sendMessage(obtain);
                                    WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.7.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                wVCallBackContext.success(r.RET_SUCCESS);
                                            }
                                        }
                                    });
                                    return null;
                                }
                            }
                            if (WebAppInterface.access$200(WebAppInterface.this) != null) {
                                WebAppInterface.access$200(WebAppInterface.this).post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.7.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            wVCallBackContext.error(r.RET_PARAM_ERR);
                                        }
                                    }
                                });
                            }
                            return null;
                        }
                    }.execute(new Object[0]);
                } else if (this.mHandler == null) {
                } else {
                    this.mHandler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.8
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                wVCallBackContext.error(r.RET_PARAM_ERR);
                            }
                        }
                    });
                }
            } catch (Exception unused) {
                m.e("WebAppInterface", "setShortcutToDesktop: param parse to JSON error, param=" + str);
                Handler handler = this.mHandler;
                if (handler == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.taobao.browser.jsbridge.WebAppInterface.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            wVCallBackContext.error(r.RET_PARAM_ERR);
                        }
                    }
                });
            }
        } else {
            wVCallBackContext.error(r.RET_PARAM_ERR);
        }
    }

    public void setNaviBarRightItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea771d2", new Object[]{this, wVCallBackContext, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                String optString = jSONObject.optString("icon", "");
                boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                this.mAutoHideMenuRightItem = jSONObject.optBoolean("autoReset", false);
                String optString2 = jSONObject.optString("title", "");
                bundle.putString("icon", optString);
                bundle.putString("title", optString2);
                bundle.putBoolean("fromNative", optBoolean);
                bundle.putBoolean("iconFont", optBoolean2);
                Message obtain = Message.obtain();
                obtain.what = i.ACTIONBAR_MENU_RIGHT;
                obtain.obj = bundle;
                if (this.mHandler != null) {
                    this.mHandler.sendMessage(obtain);
                }
                wVCallBackContext.success();
            } catch (JSONException unused) {
                m.e("WebAppInterface", "setNaviBarRightItem: param parse to JSON error, param=" + str);
                wVCallBackContext.error();
            }
        }
    }

    public void setNaviBarSecondRightItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23afcfe", new Object[]{this, wVCallBackContext, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                String optString = jSONObject.optString("icon", "");
                boolean optBoolean = jSONObject.optBoolean("fromNative", false);
                boolean optBoolean2 = jSONObject.optBoolean("iconFont", false);
                this.mAutoHideMenuSecondRightItem = jSONObject.optBoolean("autoReset", false);
                String optString2 = jSONObject.optString("title", "");
                bundle.putString("icon", optString);
                bundle.putString("title", optString2);
                bundle.putBoolean("fromNative", optBoolean);
                bundle.putBoolean("iconFont", optBoolean2);
                Message obtain = Message.obtain();
                obtain.what = i.ACTIONBAR_MENU_SECOND_RIGHT;
                obtain.obj = bundle;
                if (this.mHandler != null) {
                    this.mHandler.sendMessage(obtain);
                }
                wVCallBackContext.success();
            } catch (JSONException unused) {
                m.e("WebAppInterface", "setNaviBarSecondRightItem: param parse to JSON error, param=" + str);
                wVCallBackContext.error();
            }
        }
    }

    public void setNaviBarMoreItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add04441", new Object[]{this, wVCallBackContext, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                this.mAutoHideMenuMoreItem = new JSONObject(str).optBoolean("autoReset", false);
                Bundle bundle = new Bundle();
                bundle.putString("param", str);
                Message obtain = Message.obtain();
                obtain.what = i.ACTIONBAR_MENU_LIST;
                obtain.obj = bundle;
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.sendMessage(obtain);
                }
                wVCallBackContext.success();
            } catch (JSONException unused) {
                wVCallBackContext.error(new r());
            }
        }
    }

    public void goToOrder(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff2d438", new Object[]{this, obj, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1109;
        obtain.obj = str;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        ((WVCallBackContext) obj).success();
    }

    public void fullScreen(WVCallBackContext wVCallBackContext, String str) {
        boolean equalsIgnoreCase;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4d66129", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i.FULL_SCREEN;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("on")) {
                equalsIgnoreCase = jSONObject.optBoolean("on", false);
            } else {
                equalsIgnoreCase = "true".equalsIgnoreCase(jSONObject.optString("open", "false"));
            }
            obtain.obj = Boolean.valueOf(equalsIgnoreCase);
            wVCallBackContext.success();
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.sendMessage(obtain);
        } catch (JSONException unused) {
            m.e("WebAppInterface", "fullScreen: param parse to JSON error, param=" + str);
            wVCallBackContext.error(new r());
        }
    }

    public void clearNaviBarMoreItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc790b6", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i.ACTIONBAR_MENU_LIST;
        Bundle bundle = new Bundle();
        bundle.putBoolean(i.ACTION_BAR_ITEM_HIDE, true);
        obtain.obj = bundle;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void clearShortcutToDesktop(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7be71e3c", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i.ACTIONBAR_ADDTODESKTOP;
        Bundle bundle = new Bundle();
        bundle.putBoolean(i.ACTION_BAR_ITEM_HIDE, true);
        obtain.obj = bundle;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void setNaviBarHidden(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc50623", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mAutoShowNavbar = jSONObject.optBoolean("autoReset", false);
            str = jSONObject.optString("hidden", "1");
        } catch (JSONException unused) {
        }
        Message obtain = Message.obtain();
        obtain.what = i.HIDDEN_NAVBAR;
        obtain.obj = str;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void clearNaviBarRightItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e99b3fd", new Object[]{this, wVCallBackContext, str});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i.ACTIONBAR_MENU_RIGHT;
        Bundle bundle = new Bundle();
        bundle.putBoolean(i.ACTION_BAR_ITEM_HIDE, true);
        obtain.obj = bundle;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.sendMessage(obtain);
        }
        wVCallBackContext.success();
    }

    public void enableHookNativeBack(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e832e992", new Object[]{this, wVCallBackContext, str});
            return;
        }
        IWVWebView webview = wVCallBackContext.getWebview();
        if (ngu.p() && (webview instanceof PHAWVUCWebView)) {
            AppController appController = PHAWVUCWebView.getAppController(webview);
            if (appController == null) {
                r rVar = new r();
                rVar.a("msg", "appController is null");
                wVCallBackContext.error(rVar);
                return;
            } else if (appController.b() != null) {
                ngr.d(TAG, "native back is not null.");
                wVCallBackContext.success();
                return;
            } else {
                appController.a(new com.taobao.browser.f((PHAWVUCWebView) webview));
                ngr.a(TAG, "set nativeBackHandler");
            }
        } else {
            Message obtain = Message.obtain();
            obtain.what = 1121;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        }
        wVCallBackContext.success();
    }

    public void setPageUserInfo(WVCallBackContext wVCallBackContext, String str) {
        try {
            String optString = new JSONObject(str).optString(hyt.ZZB_BUNDLE_KEY, "");
            if (this.mWebView != null && (this.mWebView instanceof BrowserHybridWebView)) {
                if (!TextUtils.isEmpty(optString)) {
                    BrowserUtil.a(TAG, "setPageUserInfo", "setData2H5", null, null);
                }
                ((BrowserHybridWebView) this.mWebView).setData2H5(optString);
                wVCallBackContext.success();
                return;
            }
            if (this.mContext != null && (this.mContext instanceof Activity)) {
                try {
                    Method method = this.mContext.getClass().getMethod("setPageUserInfo", String.class);
                    if (method != null) {
                        method.setAccessible(true);
                        method.invoke(this.mContext, optString);
                        wVCallBackContext.success();
                        return;
                    }
                } catch (Throwable th) {
                    m.d("WebAppInterface", "failed to set pageUserInfo: " + th.getMessage());
                    wVCallBackContext.error();
                    return;
                }
            }
            wVCallBackContext.error();
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }

    public void hideNaviBarDefaultMoreItem(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88eb4c8c", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            boolean optBoolean = new JSONObject(str).optBoolean(hyt.ZZB_BUNDLE_KEY, false);
            wVCallBackContext.success();
            Message obtain = Message.obtain();
            obtain.what = i.HIDE_DEAFAULT_MORE_ITEM;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i.ACTION_BAR_ITEM_USER_HELPER_HIDE, optBoolean);
            obtain.obj = bundle;
            Handler handler = this.mHandler;
            if (handler == null) {
                return;
            }
            handler.sendMessage(obtain);
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }

    public void setFestivalStyle(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e19025", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("naviBar", "");
            boolean optBoolean = jSONObject.optBoolean("noTimeCheck", false);
            if (!TextUtils.isEmpty(optString) && !"none".equals(optString)) {
                boolean a2 = FestivalMgr.a().a("global");
                if (!optBoolean && !a2) {
                    r rVar = new r();
                    rVar.a("msg", "Festival is not on, please test in daily or preRelease environment.");
                    wVCallBackContext.error(rVar);
                    return;
                }
            }
            Message obtain = Message.obtain();
            obtain.what = i.FESTIVAL_STYLE;
            obtain.obj = optString;
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        } catch (JSONException unused) {
            wVCallBackContext.error();
        }
    }

    public void hasMenu(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39fed2e7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle = new Bundle();
            bundle.putBoolean("hasMenu", jSONObject.optBoolean("hasMenu", true));
            bundle.putBoolean("autoReset", jSONObject.optBoolean("autoReset", true));
            Message obtain = Message.obtain();
            obtain.what = i.ACTIONBAR_HAS_MENU;
            obtain.obj = bundle;
            if (this.mHandler != null) {
                this.mHandler.sendMessage(obtain);
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private void cancelLoadingView(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82790575", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Message obtain = Message.obtain();
            obtain.what = i.HIDE_LOADING_DIALOG;
            if (this.mHandler != null) {
                this.mHandler.sendMessage(obtain);
                wVCallBackContext.success();
                return;
            }
            wVCallBackContext.error("mHandler==null");
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error(th.toString());
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        BrowserUtil.a(TAG, BrowserUtil.f16842a, str, this.mWebView != null ? this.mWebView.getUrl() : null, null);
        if ("goToOrder".equals(str)) {
            goToOrder(wVCallBackContext, str2);
        } else if ("setNaviBarMoreItem".equals(str)) {
            setNaviBarMoreItem(wVCallBackContext, str2);
        } else if ("setNaviBarRightItem".equals(str)) {
            setNaviBarRightItem(wVCallBackContext, str2);
        } else if ("setNaviBarSecondRightItem".equals(str)) {
            setNaviBarSecondRightItem(wVCallBackContext, str2);
        } else if ("getLinkparam".equals(str)) {
            getLinkparam(wVCallBackContext, str2);
        } else if ("setCustomPageTitle".equals(str)) {
            setCustomPageTitle(wVCallBackContext, str2);
        } else if ("pop".equals(str)) {
            pop(wVCallBackContext, str2);
        } else if ("transverseFullScreen".equals(str)) {
            fullScreen(wVCallBackContext, str2);
        } else if ("fullScreen".equals(str)) {
            fullScreen(wVCallBackContext, str2);
        } else if ("setNaviBarHidden".equals(str)) {
            setNaviBarHidden(wVCallBackContext, str2);
        } else if ("setShortcutToDesktop".equals(str)) {
            setShortcutToDesktop(wVCallBackContext, str2);
        } else if ("addShortcutToDesktop".equals(str)) {
            addShortcutToDesktop(wVCallBackContext, str2);
        } else if ("isShortcutOnDesktop".equals(str)) {
            isShortcutOnDesktop(wVCallBackContext, str2);
        } else if ("clearNaviBarMoreItem".equals(str)) {
            clearNaviBarMoreItem(wVCallBackContext, str2);
        } else if ("clearShortcutToDesktop".equals(str)) {
            clearShortcutToDesktop(wVCallBackContext, str2);
        } else if ("clearNaviBarRightItem".equals(str)) {
            clearNaviBarRightItem(wVCallBackContext, str2);
        } else if ("enableHookNativeBack".equals(str)) {
            enableHookNativeBack(wVCallBackContext, str2);
        } else if ("setPageUserInfo".equals(str)) {
            setPageUserInfo(wVCallBackContext, str2);
        } else if ("hideNaviBarDefaultMoreItem".equals(str)) {
            hideNaviBarDefaultMoreItem(wVCallBackContext, str2);
        } else if ("setFestivalStyle".equals(str)) {
            setFestivalStyle(wVCallBackContext, str2);
        } else if ("hasMenu".equals(str)) {
            hasMenu(wVCallBackContext, str2);
        } else if (!"cancelLoadingView".equals(str)) {
            return false;
        } else {
            cancelLoadingView(wVCallBackContext, str2);
        }
        return true;
    }
}
