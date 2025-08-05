package com.taobao.tbreachflow.shortcuts.windvane;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.login4android.api.Login;
import com.taobao.tbreachflow.shortcuts.windvane.WVShortcutsPlugin;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;
import tb.qif;
import tb.qih;
import tb.qog;

/* loaded from: classes9.dex */
public class WVShortcutsPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(WVShortcutsPlugin wVShortcutsPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(WVShortcutsPlugin wVShortcutsPlugin, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aa63e08", new Object[]{wVShortcutsPlugin, map});
        } else {
            wVShortcutsPlugin.trackUT(map);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        r rVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            rVar = new r();
        } catch (Throwable th) {
            qif.a("WVShortcutsPlugin.execute." + str + ".error.", th);
            wVCallBackContext.error();
        }
        if ("requestPinnedShortCut".equals(str)) {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString("iconId");
            String string2 = parseObject.getString("iconImageUrl");
            String string3 = parseObject.getString("targetUrl");
            String string4 = parseObject.getString(ChangeAppIconBridge.KEY_ICONNAME);
            qog.a(this.mContext, string, string4, string2, string3, new AnonymousClass1(wVCallBackContext, rVar, str, string, string4, string2, string3));
            return true;
        } else if ("checkPinnedShortcutAdded".equals(str)) {
            String a2 = qog.a(JSON.parseObject(str2).getString("iconId"));
            rVar.a("isAdded", Boolean.valueOf(TextUtils.isEmpty(a2)));
            rVar.a("notAddedReason", a2);
            wVCallBackContext.success(rVar);
            return true;
        } else {
            if ("jumpToSystemSettings".equals(str)) {
                if (Build.VERSION.SDK_INT < 26) {
                    wVCallBackContext.error("SYSTEM_LEVEL_INVALID");
                } else {
                    qih.a(this.mContext);
                    HashMap hashMap = new HashMap(4);
                    hashMap.put("action", str);
                    hashMap.put("brand", Build.BRAND.toLowerCase());
                    hashMap.put("model", Build.MODEL.toLowerCase());
                    hashMap.put("osVersion", Build.VERSION.RELEASE);
                    trackUT(hashMap);
                    wVCallBackContext.success(rVar);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.taobao.tbreachflow.shortcuts.windvane.WVShortcutsPlugin$1 */
    /* loaded from: classes9.dex */
    public class AnonymousClass1 implements qog.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ WVCallBackContext f22282a;
        public final /* synthetic */ r b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        public static /* synthetic */ void lambda$T_Ti21wHVg2MSLtQs1rvcwjig2Q(AnonymousClass1 anonymousClass1, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
            anonymousClass1.a(str, str2, str3, str4, str5, z, str6);
        }

        public AnonymousClass1(WVCallBackContext wVCallBackContext, r rVar, String str, String str2, String str3, String str4, String str5) {
            WVShortcutsPlugin.this = r1;
            this.f22282a = wVCallBackContext;
            this.b = rVar;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        @Override // tb.qog.a
        public void a(final boolean z, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                return;
            }
            if (z) {
                this.f22282a.success(this.b);
            } else {
                this.f22282a.error(str);
            }
            Handler handler = new Handler(Looper.getMainLooper());
            final String str2 = this.c;
            final String str3 = this.d;
            final String str4 = this.e;
            final String str5 = this.f;
            final String str6 = this.g;
            handler.postDelayed(new Runnable() { // from class: com.taobao.tbreachflow.shortcuts.windvane.-$$Lambda$WVShortcutsPlugin$1$T_Ti21wHVg2MSLtQs1rvcwjig2Q
                {
                    WVShortcutsPlugin.AnonymousClass1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WVShortcutsPlugin.AnonymousClass1.lambda$T_Ti21wHVg2MSLtQs1rvcwjig2Q(WVShortcutsPlugin.AnonymousClass1.this, str2, str3, str4, str5, str6, z, str);
                }
            }, 5000L);
        }

        public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcef9304", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z), str6});
                return;
            }
            HashMap hashMap = new HashMap(16);
            hashMap.put("action", str);
            hashMap.put("iconId", str2);
            hashMap.put(ChangeAppIconBridge.KEY_ICONNAME, str3);
            hashMap.put("iconImageUrl", str4);
            hashMap.put("targetUrl", str5);
            hashMap.put("success", String.valueOf(z));
            hashMap.put("failReason", str6);
            String a2 = qog.a(str2);
            hashMap.put("isIconIdAdded", String.valueOf(TextUtils.isEmpty(a2)));
            hashMap.put("isIconIdAddedFailReason", a2);
            WVShortcutsPlugin.access$000(WVShortcutsPlugin.this, hashMap);
        }
    }

    private void trackUT(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17a0eb4", new Object[]{this, map});
            return;
        }
        try {
            String userId = Login.getUserId();
            if (TextUtils.isEmpty(userId)) {
                userId = "";
            }
            map.put("userId", userId);
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("pinned_shortcuts");
            uTCustomHitBuilder.setEventPage("TBShortcutsManager");
            uTCustomHitBuilder.setProperties(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            qif.a("WVShortcutsPlugin.trackMap=%s", map.toString());
        } catch (Throwable th) {
            qif.a("WVShortcutsPlugin.error.", th);
        }
    }
}
