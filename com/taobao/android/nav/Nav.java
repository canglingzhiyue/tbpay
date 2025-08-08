package com.taobao.android.nav;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.jump.JumpAbility;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.riy;
import tb.sxw;

/* loaded from: classes.dex */
public class Nav {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EXTRA_INTENT_FILTER_LABEL = "INTENT_FILTER_LABEL";
    public static final String KExtraReferrer = "referrer";
    public static final String NAV_SHARED_ELEMENT_NAME = "nav_shared_element_name";
    public static final String NAV_START_ACTIVITY_TIME = "NAV_START_ACTIVITY_TIME";
    public static final String NAV_START_ACTIVITY_UPTIME = "NAV_START_ACTIVITY_UPTIME";
    public static final String NAV_TO_URL_START_TIME = "NAV_TO_URL_START_TIME";
    public static final String NAV_TO_URL_START_UPTIME = "NAV_TO_URL_START_UPTIME";
    private static final String TAG = "Nav";
    private static final List<c> sAfterProcessor;
    private static final i sDefaultResolver;
    public static Drawable sDetailImageDrawable;
    private static d sExceptionHandler;
    private static h sLastProcessor;
    private static j sNavMonitor;
    private static volatile i sNavResolver;
    private static final List<h> sPreprocessor;
    private static final SparseArray<e> sPriorHookers;
    private static n sProcessorMonitor;
    private static final List<h> sStickPreprocessor;
    private static int[] sTransition;
    private static boolean sUseWelcome;
    private final Context mContext;
    private final com.taobao.android.nav.d mNavContext;
    private boolean mSkipHooker;
    private boolean mSkipPriorHooker;
    private List<Intent> mTaskStack;
    private Fragment mFragment = null;
    private final Intent mIntent = new Intent("android.intent.action.VIEW");
    private final String mSessionId = String.valueOf(System.currentTimeMillis());

    /* loaded from: classes6.dex */
    public static final class EscapeResolveInfo extends ResolveInfo {
        static {
            kge.a(-361824103);
        }

        @Override // android.content.pm.ResolveInfo
        public String toString() {
            return "EscapeResolveInfo";
        }
    }

    /* loaded from: classes6.dex */
    public static class NavigationCanceledException extends Exception {
        private static final long serialVersionUID = 5015146091187397488L;

        static {
            kge.a(-126075102);
        }

        public NavigationCanceledException(String str) {
            super(str);
        }
    }

    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes6.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public interface e {
        public static final int NAVHOOKER_HIGH_PRIORITY = 3;
        public static final int NAVHOOKER_LAST_PRORITY = 0;
        public static final int NAVHOOKER_LOW_PRIORITY = 1;
        public static final int NAVHOOKER_NORMAL_PRIORITY = 2;
        public static final int NAVHOOKER_STICKMAX_PRIORITY = 4;

        boolean a(Context context, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface f extends e {
        boolean a(Context context, Nav nav, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean beforeNavTo(Intent intent);
    }

    /* loaded from: classes.dex */
    public interface i {
        ResolveInfo a(PackageManager packageManager, Intent intent, int i, boolean z);

        List<ResolveInfo> a(PackageManager packageManager, Intent intent, int i);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(Context context, String str, Exception exc, boolean z);
    }

    /* loaded from: classes.dex */
    public interface k extends h {
        boolean a(Nav nav, Intent intent);
    }

    static {
        kge.a(-1903647772);
        sPreprocessor = new CopyOnWriteArrayList();
        sLastProcessor = null;
        sAfterProcessor = new CopyOnWriteArrayList();
        sStickPreprocessor = new CopyOnWriteArrayList();
        sPriorHookers = new SparseArray<>();
        sNavMonitor = null;
        sProcessorMonitor = null;
        b bVar = new b();
        sDefaultResolver = bVar;
        sNavResolver = bVar;
        sUseWelcome = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class NavHookIntent extends Intent {
        static {
            kge.a(-545802686);
        }

        private NavHookIntent() {
        }
    }

    public static Nav from(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Nav) ipChange.ipc$dispatch("fb9e170a", new Object[]{context}) : new Nav(context);
    }

    public Nav withFragment(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("26f4686c", new Object[]{this, fragment});
        }
        this.mFragment = fragment;
        this.mNavContext.a(fragment);
        return this;
    }

    public Nav witJumpAbility(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("b66a3556", new Object[]{this, str});
        }
        this.mNavContext.c(str);
        return this;
    }

    public Nav withOptions(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("30b4eb0c", new Object[]{this, bundle});
        }
        Bundle e2 = this.mNavContext.e();
        if (e2 != null) {
            e2.putAll(bundle);
        } else {
            this.mNavContext.a(bundle);
        }
        return this;
    }

    public Nav withCategory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("9eb3ea8c", new Object[]{this, str});
        }
        this.mIntent.addCategory(str);
        return this;
    }

    public Nav withExtras(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("4b0eb09d", new Object[]{this, bundle});
        }
        if (bundle == null) {
            return this;
        }
        this.mIntent.putExtras(bundle);
        return this;
    }

    public Nav withFlags(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("86ca6ba6", new Object[]{this, new Integer(i2)});
        }
        this.mIntent.addFlags(i2);
        return this;
    }

    public Nav withAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("ef504ed4", new Object[]{this, str});
        }
        this.mIntent.setAction(str);
        return this;
    }

    public Nav withClassName(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("87879509", new Object[]{this, str, str2});
        }
        this.mNavContext.a(str);
        this.mNavContext.b(str2);
        return this;
    }

    public Nav forResult(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("9332848b", new Object[]{this, new Integer(i2)});
        }
        if (!(this.mContext instanceof Activity)) {
            throw new IllegalStateException("Only valid from Activity, but from " + this.mContext);
        }
        this.mNavContext.a(i2);
        return this;
    }

    public boolean isForesultSet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b76585d", new Object[]{this})).booleanValue() : this.mNavContext.f() >= 0;
    }

    public Nav allowEscape() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("be7c93d0", new Object[]{this});
        }
        this.mNavContext.b(true);
        return this;
    }

    public Nav skipAllProcessors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("c53b0a77", new Object[]{this});
        }
        this.mNavContext.a(true);
        return this;
    }

    public Nav disallowLoopback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("308e4f54", new Object[]{this});
        }
        this.mNavContext.c(true);
        return this;
    }

    public Nav allowLoopback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("c496e7c6", new Object[]{this});
        }
        this.mNavContext.c(false);
        return this;
    }

    public Nav disableTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("54b3783d", new Object[]{this});
        }
        this.mNavContext.d(true);
        return this;
    }

    public Nav skipPreprocess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("ce58978f", new Object[]{this});
        }
        this.mNavContext.e(true);
        return this;
    }

    public Nav skipHooker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("34ae04eb", new Object[]{this});
        }
        this.mSkipHooker = true;
        return this;
    }

    public Nav skipPriorHooker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("f39b2d5f", new Object[]{this});
        }
        this.mSkipPriorHooker = true;
        return this;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.mContext;
    }

    public boolean toUri(com.taobao.android.nav.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("70bd2f21", new Object[]{this, iVar})).booleanValue() : toUri(iVar.a());
    }

    public boolean toUri(com.taobao.android.nav.i iVar, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ef23878f", new Object[]{this, iVar, aVar})).booleanValue() : toUri(iVar.a(), aVar);
    }

    public boolean toUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e4e8c6", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return toUri(Uri.parse(str));
        }
        return false;
    }

    public boolean toUri(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aca9274", new Object[]{this, str, aVar})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return toUri(Uri.parse(str), aVar);
        }
        return false;
    }

    public boolean toUri(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c3d61753", new Object[]{this, uri})).booleanValue() : toUri(uri, (a) null);
    }

    public boolean toUri(Uri uri, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d32d8c41", new Object[]{this, uri, aVar})).booleanValue();
        }
        if (uri != null) {
            return toUriNew(uri, aVar);
        }
        return false;
    }

    public boolean toUriSimple(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24c17181", new Object[]{this, uri})).booleanValue() : toUriNew(uri, null, true);
    }

    public boolean toUriSimple(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e464d458", new Object[]{this, str})).booleanValue() : toUriNew(Uri.parse(str), null, true);
    }

    private boolean toUriNew(Uri uri, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f38a983", new Object[]{this, uri, aVar})).booleanValue() : toUriNew(uri, aVar, false);
    }

    private boolean toUriNew(Uri uri, a aVar, boolean z) {
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47dd3939", new Object[]{this, uri, aVar, new Boolean(z)})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        TLog.loge(TAG, this.mSessionId, "origin uri is: ", uri.toString());
        long uptimeMillis = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        this.mIntent.putExtra("NAV_TO_URL_START_UPTIME", uptimeMillis);
        this.mIntent.putExtra("NAV_TO_URL_START_TIME", currentTimeMillis);
        String str = null;
        if (sProcessorMonitor != null && !uri.isOpaque()) {
            str = uri.getHost() + uri.getPath();
            sProcessorMonitor.a(this.mContext, str);
        }
        d dVar = sExceptionHandler;
        if (this.mContext == null) {
            if (dVar != null) {
                new NavigationCanceledException("Context shouldn't null");
            }
            TLog.loge(TAG, this.mSessionId, "origin uri is: ", uri.toString(), "; Nav context was null");
            j jVar = sNavMonitor;
            if (jVar == null) {
                return false;
            }
            jVar.a(this.mContext, uri.toString(), new Exception("Nav context was null!"), false);
            return false;
        }
        try {
            String str2 = str;
            Intent a2 = sxw.a(uri, this.mIntent, this.mNavContext, z, sProcessorMonitor);
            if (a2 == null) {
                a2 = intentForUriNew(uri, true);
            } else {
                a2.setPackage(this.mContext.getPackageName());
                resolveAndQueryActivity(a2);
            }
            if (a2 == null) {
                if (dVar != null) {
                    new NavigationCanceledException("Intent resolve was null");
                }
                if (sNavMonitor != null) {
                    sNavMonitor.a(this.mContext, uri.toString(), new Exception("Intent resolve was null"), false);
                }
                TLog.loge(TAG, this.mSessionId, "origin uri is: ", uri.toString(), "; Intent resolve was null");
                return true;
            }
            if (!this.mNavContext.d()) {
                com.taobao.android.nav.l a3 = m.a(4);
                if (a3 != null && !a3.a(this.mIntent).a(this.mSessionId).a(this.mNavContext)) {
                    return true;
                }
                com.taobao.android.nav.l a4 = m.a(5);
                if (a4 != null && !a4.a((Intent) this.mIntent.clone()).a(this.mNavContext)) {
                    return true;
                }
            }
            a2.putExtra("NAV_TO_URL_START_UPTIME", uptimeMillis);
            a2.putExtra("NAV_TO_URL_START_TIME", currentTimeMillis);
            ComponentName component = a2.getComponent();
            if (this.mNavContext.h() && (this.mContext instanceof Activity) && component != null && component.equals(((Activity) this.mContext).getComponentName())) {
                String str3 = "Loopback disallowed: " + uri;
                if (aVar != null) {
                    aVar.a(false, a2);
                }
                TLog.loge(TAG, this.mSessionId, "origin uri is: ", uri.toString(), " Loopback disallowed: " + uri);
                return false;
            }
            long uptimeMillis2 = SystemClock.uptimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            a2.putExtra("NAV_START_ACTIVITY_UPTIME", uptimeMillis2);
            a2.putExtra("NAV_START_ACTIVITY_TIME", currentTimeMillis2);
            long j2 = currentTimeMillis2 - currentTimeMillis;
            TLog.loge(TAG, this.mSessionId, "nav cost:", String.valueOf(j2));
            if (sProcessorMonitor != null) {
                sProcessorMonitor.a(this.mContext, "navCost", j2);
            }
            if (!this.mNavContext.c()) {
                Bundle n = this.mNavContext.n();
                if (n != null) {
                    a2.putExtra("nav_animation_extra", n);
                }
                jump(a2);
            }
            if (sProcessorMonitor != null) {
                sProcessorMonitor.b(this.mContext, str2);
            }
            TLog.loge(TAG, this.mSessionId, "final intent is: ", intent2String(a2));
            return true;
        } catch (ActivityNotFoundException e2) {
            j jVar2 = sNavMonitor;
            if (jVar2 != null) {
                jVar2.a(this.mContext, uri.toString(), e2, false);
            }
            TLog.loge(TAG, this.mSessionId, "origin uri:", uri.toString(), "; ActivityNotFound: ", e2.toString());
            return false;
        } catch (SecurityException e3) {
            j jVar3 = sNavMonitor;
            if (jVar3 != null) {
                c2 = 0;
                jVar3.a(this.mContext, uri.toString(), e3, false);
            } else {
                c2 = 0;
            }
            String[] strArr = new String[4];
            strArr[c2] = this.mSessionId;
            strArr[1] = "origin uri: ";
            strArr[2] = uri.toString();
            strArr[3] = "; SecurityException: " + e3.toString();
            TLog.loge(TAG, strArr);
            return false;
        }
    }

    private Intent intentForUriNew(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e1f34d7e", new Object[]{this, uri, new Boolean(z)});
        }
        if (uri != null) {
            uri.toString();
        }
        Intent intent = toNew(uri);
        if (intent == null) {
            return null;
        }
        try {
            if (!this.mNavContext.g()) {
                intent.setPackage(this.mContext.getPackageName());
            }
            resolveAndQueryActivity(intent);
            return intent;
        } catch (ActivityNotFoundException e2) {
            if (isDebug()) {
                Context context = this.mContext;
                Toast.makeText(context, uri.toString() + " CANN'T FOUND RESOLVED ACTIVITY", 1).show();
            }
            TLog.loge(TAG, this.mSessionId, "uri is: ", uri.toString(), "; ActivityNotFoundException:", e2.toString());
            if (z) {
                throw e2;
            }
            return intent;
        } catch (SecurityException e3) {
            if (isDebug()) {
                Context context2 = this.mContext;
                Toast.makeText(context2, uri.toString() + "SecurityException", 1).show();
            }
            TLog.loge(TAG, this.mSessionId, "uri is: ", uri.toString(), "; ActivityNotFoundException:", e3.toString());
            if (z) {
                throw e3;
            }
            return intent;
        }
    }

    private boolean tryJumpAbility(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23be3829", new Object[]{this, intent})).booleanValue();
        }
        JumpAbility a2 = com.taobao.android.nav.jump.a.a().a(this.mNavContext.o());
        if (a2 != null) {
            return a2.a(new com.taobao.android.nav.jump.b(intent, this.mNavContext));
        }
        return false;
    }

    private void jump(Intent intent) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94aa72", new Object[]{this, intent});
        } else if (tryJumpAbility(intent)) {
        } else {
            List<Intent> list = this.mTaskStack;
            if (list != null) {
                list.add(this.mIntent);
                List<Intent> list2 = this.mTaskStack;
                startActivities((Intent[]) list2.toArray(new Intent[list2.size()]), this.mNavContext.e());
            } else if (this.mNavContext.f() >= 0) {
                int f2 = this.mNavContext.f();
                Fragment fragment = this.mFragment;
                if (fragment != null) {
                    fragment.startActivityForResult(intent, f2, this.mNavContext.e());
                } else {
                    Context context = this.mContext;
                    if (context instanceof Activity) {
                        ((Activity) context).startActivityForResult(intent, f2, this.mNavContext.e());
                    } else {
                        context.startActivity(intent, this.mNavContext.e());
                    }
                }
            } else {
                if (!(this.mContext instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                this.mContext.startActivity(intent, this.mNavContext.e());
            }
            if (this.mNavContext.i() || (iArr = sTransition) == null) {
                return;
            }
            Context context2 = this.mContext;
            if (!(context2 instanceof Activity)) {
                return;
            }
            ((Activity) context2).overridePendingTransition(iArr[0], iArr[1]);
        }
    }

    public Intent intentForUri(com.taobao.android.nav.i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("58bd7968", new Object[]{this, iVar}) : intentForUri(iVar.a());
    }

    public Intent intentForUri(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("17d4e823", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return intentForUri(Uri.parse(str));
        }
        return null;
    }

    public Intent intentForUri(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("67c90492", new Object[]{this, uri}) : intentForUri(uri, false);
    }

    public Intent intentForUri(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("87dac420", new Object[]{this, uri, new Boolean(z)});
        }
        if (uri != null) {
            uri.toString();
        }
        if (uri == null) {
            Log.e(TAG, "Nav uri was null");
            return null;
        } else if (this.mContext == null) {
            Log.e(TAG, "Nav context was null");
            return null;
        } else if (com.taobao.android.nav.h.a()) {
            return intentForUriNew(uri, z);
        } else {
            Intent intent = to(uri);
            if (intent == null) {
                return null;
            }
            if (intent instanceof NavHookIntent) {
                return intent;
            }
            try {
                if (this.mNavContext.g()) {
                    ResolveInfo a2 = sNavResolver.a(this.mContext.getPackageManager(), intent, 65536, this.mNavContext.g());
                    if (a2 == null) {
                        List<ResolveInfo> a3 = sNavResolver.a(this.mContext.getPackageManager(), intent, 65536);
                        ResolveInfo resolveInfo = (a3 == null || a3.size() <= 0) ? null : a3.get(0);
                        if (resolveInfo == null) {
                            throw new ActivityNotFoundException("No Activity found to handle " + intent);
                        }
                        if (resolveInfo.labelRes != 0) {
                            intent.putExtra(EXTRA_INTENT_FILTER_LABEL, resolveInfo.labelRes);
                        }
                        intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
                    } else {
                        if (a2.labelRes != 0) {
                            intent.putExtra(EXTRA_INTENT_FILTER_LABEL, a2.labelRes);
                        }
                        intent.setClassName(a2.activityInfo.packageName, a2.activityInfo.name);
                    }
                } else {
                    intent.setPackage(this.mContext.getPackageName());
                    ResolveInfo a4 = sNavResolver.a(this.mContext.getPackageManager(), intent, 65536, this.mNavContext.g());
                    if (a4 == null) {
                        ResolveInfo optimum = optimum(getContext(), sNavResolver.a(this.mContext.getPackageManager(), intent, 65536));
                        if (optimum == null) {
                            throw new ActivityNotFoundException("No Activity found to handle " + intent);
                        }
                        if (optimum.labelRes != 0) {
                            intent.putExtra(EXTRA_INTENT_FILTER_LABEL, optimum.labelRes);
                        }
                        intent.setClassName(optimum.activityInfo.packageName, optimum.activityInfo.name);
                    } else {
                        if (a4.labelRes != 0) {
                            intent.putExtra(EXTRA_INTENT_FILTER_LABEL, a4.labelRes);
                        }
                        intent.setClassName(a4.activityInfo.packageName, a4.activityInfo.name);
                    }
                }
                return intent;
            } catch (ActivityNotFoundException e2) {
                if (isDebug()) {
                    Context context = this.mContext;
                    Toast.makeText(context, uri.toString() + " CANN'T FOUND RESOLVED ACTIVITY", 1).show();
                }
                TLog.loge(TAG, this.mSessionId, "uri is: ", uri.toString(), "; ActivityNotFoundException:", e2.toString());
                if (z) {
                    throw e2;
                }
                return intent;
            } catch (SecurityException e3) {
                if (isDebug()) {
                    Context context2 = this.mContext;
                    Toast.makeText(context2, uri.toString() + "SecurityException", 1).show();
                }
                TLog.loge(TAG, this.mSessionId, "uri is: ", uri.toString(), "; ActivityNotFoundException:", e3.toString());
                if (z) {
                    throw e3;
                }
                return intent;
            }
        }
    }

    private void resolveAndQueryActivity(Intent intent) throws ActivityNotFoundException, SecurityException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5cceb0", new Object[]{this, intent});
            return;
        }
        String k2 = this.mNavContext.k();
        String l2 = this.mNavContext.l();
        if (k2 != null && l2 != null) {
            intent.setClassName(k2, l2);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ResolveInfo a2 = sNavResolver.a(this.mContext.getPackageManager(), intent, 65536, this.mNavContext.g());
        n nVar = sProcessorMonitor;
        if (nVar != null) {
            nVar.a(this.mContext, "resolveActivity", System.currentTimeMillis() - currentTimeMillis);
        }
        if (a2 == null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<ResolveInfo> a3 = sNavResolver.a(this.mContext.getPackageManager(), intent, 65536);
            n nVar2 = sProcessorMonitor;
            if (nVar2 != null) {
                nVar2.a(this.mContext, "queryIntentActivities", System.currentTimeMillis() - currentTimeMillis2);
            }
            ResolveInfo optimum = optimum(getContext(), a3);
            if (optimum == null) {
                throw new ActivityNotFoundException("No Activity found to handle " + intent);
            }
            if (optimum.labelRes != 0) {
                intent.putExtra(EXTRA_INTENT_FILTER_LABEL, optimum.labelRes);
            }
            intent.setClassName(optimum.activityInfo.packageName, optimum.activityInfo.name);
        } else if (a2 instanceof EscapeResolveInfo) {
        } else {
            if (a2.labelRes != 0) {
                intent.putExtra(EXTRA_INTENT_FILTER_LABEL, a2.labelRes);
            }
            intent.setClassName(a2.activityInfo.packageName, a2.activityInfo.name);
        }
    }

    private void startActivities(Intent[] intentArr, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4238c638", new Object[]{this, intentArr, bundle});
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.mContext.startActivities(intentArr, bundle);
        } else {
            this.mContext.startActivities(intentArr);
        }
    }

    public PendingIntent toPendingUri(Uri uri, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PendingIntent) ipChange.ipc$dispatch("9ac2f23c", new Object[]{this, uri, new Integer(i2), new Integer(i3)});
        }
        Intent specify = specify(to(uri));
        if (specify == null) {
            return null;
        }
        if (this.mTaskStack != null && Build.VERSION.SDK_INT >= 11) {
            this.mTaskStack.add(this.mIntent);
            Context context = this.mContext;
            List<Intent> list = this.mTaskStack;
            return getActivities(context, i2, (Intent[]) list.toArray(new Intent[list.size()]), i3);
        }
        specify.addFlags(268435456);
        return com.android.taobao.aop.a.a(this.mContext, i2, specify, i3);
    }

    private static PendingIntent getActivities(Context context, int i2, Intent[] intentArr, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PendingIntent) ipChange.ipc$dispatch("64d1b242", new Object[]{context, new Integer(i2), intentArr, new Integer(i3)}) : getActivities(context, i2, intentArr, i3);
    }

    public Nav stack(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("d19e8e09", new Object[]{this, uri});
        }
        if (this.mNavContext.f() >= 0) {
            throw new IllegalStateException("Cannot stack URI for result");
        }
        Intent intent = new Intent(to(uri));
        if (this.mTaskStack == null) {
            this.mTaskStack = new ArrayList(1);
            intent.addFlags(268435456);
            if (Build.VERSION.SDK_INT >= 11) {
                intent.addFlags(49152);
            }
        }
        this.mTaskStack.add(intent);
        Nav nav = new Nav(this.mContext);
        nav.mTaskStack = this.mTaskStack;
        return nav;
    }

    private Intent toNew(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("5ad94318", new Object[]{this, uri});
        }
        this.mIntent.setData(uri);
        if (this.mNavContext.d()) {
            return this.mIntent;
        }
        com.taobao.android.nav.l a2 = m.a(0);
        if (a2 != null && !a2.a((Intent) this.mIntent.clone()).a(this.mNavContext)) {
            return null;
        }
        com.taobao.android.nav.l a3 = m.a(1);
        if (a3 != null && !a3.a(this.mIntent).a(this.mSessionId).a(this.mNavContext)) {
            return null;
        }
        com.taobao.android.nav.l a4 = m.a(2);
        if (a4 != null && !this.mNavContext.j() && !a4.a(this.mIntent).a(this.mSessionId).a(this.mNavContext)) {
            return null;
        }
        return this.mIntent;
    }

    private Intent to(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("bf66db6e", new Object[]{this, uri}) : to(uri, !this.mNavContext.j());
    }

    private Intent to(Uri uri, boolean z) {
        boolean beforeNavTo;
        boolean beforeNavTo2;
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("23f7c8c4", new Object[]{this, uri, new Boolean(z)});
        }
        this.mIntent.setData(uri);
        e eVar2 = sPriorHookers.get(4);
        if (!this.mSkipHooker && eVar2 != null) {
            if (eVar2 instanceof f) {
                System.currentTimeMillis();
                if (!((f) eVar2).a(this.mContext, this, this.mIntent)) {
                    return new NavHookIntent();
                }
            } else {
                System.currentTimeMillis();
                if (!eVar2.a(this.mContext, this.mIntent)) {
                    return new NavHookIntent();
                }
            }
        }
        if (!this.mSkipPriorHooker) {
            for (int i2 = 0; i2 < sPriorHookers.size(); i2++) {
                int keyAt = sPriorHookers.keyAt(i2);
                if (keyAt != 4 && (eVar = sPriorHookers.get(keyAt)) != null) {
                    if (eVar instanceof f) {
                        System.currentTimeMillis();
                        if (!((f) eVar).a(this.mContext, this, this.mIntent)) {
                            return new NavHookIntent();
                        }
                    } else {
                        System.currentTimeMillis();
                        if (!eVar.a(this.mContext, this.mIntent)) {
                            return new NavHookIntent();
                        }
                    }
                }
            }
        }
        if (!this.mIntent.hasExtra("referrer")) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                Intent intent = ((Activity) context).getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data != null) {
                        this.mIntent.putExtra("referrer", data.toString());
                    } else {
                        ComponentName component = intent.getComponent();
                        if (component != null) {
                            this.mIntent.putExtra("referrer", new Intent().setComponent(component).toUri(0));
                        } else {
                            this.mIntent.putExtra("referrer", intent.toUri(0));
                        }
                    }
                }
            } else {
                this.mIntent.putExtra("referrer", context.getPackageName());
            }
        }
        Process.myTid();
        if (!sStickPreprocessor.isEmpty()) {
            for (h hVar : sStickPreprocessor) {
                System.currentTimeMillis();
                boolean beforeNavTo3 = hVar.beforeNavTo(this.mIntent);
                System.currentTimeMillis();
                if (!beforeNavTo3) {
                    return null;
                }
            }
        }
        if (z && !sPreprocessor.isEmpty()) {
            for (h hVar2 : sPreprocessor) {
                System.currentTimeMillis();
                if (hVar2 instanceof k) {
                    beforeNavTo2 = ((k) hVar2).a(this, this.mIntent);
                } else {
                    beforeNavTo2 = hVar2.beforeNavTo(this.mIntent);
                }
                System.currentTimeMillis();
                if (!beforeNavTo2) {
                    return null;
                }
            }
        }
        if (z && sLastProcessor != null) {
            System.currentTimeMillis();
            h hVar3 = sLastProcessor;
            if (hVar3 instanceof k) {
                beforeNavTo = ((k) hVar3).a(this, this.mIntent);
            } else {
                beforeNavTo = hVar3.beforeNavTo(this.mIntent);
            }
            System.currentTimeMillis();
            if (!beforeNavTo) {
                return null;
            }
        }
        return this.mIntent;
    }

    private Intent specify(Intent intent) {
        ResolveInfo optimum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("6e58c64e", new Object[]{this, intent});
        }
        if (this.mNavContext.g() || (optimum = optimum(getContext(), sNavResolver.a(this.mContext.getPackageManager(), intent, 65536))) == null) {
            return intent;
        }
        intent.setClassName(optimum.activityInfo.packageName, optimum.activityInfo.name);
        return intent;
    }

    public static ResolveInfo optimum(Context context, List<ResolveInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResolveInfo) ipChange.ipc$dispatch("500f30e4", new Object[]{context, list});
        }
        if (context == null || list == null) {
            return null;
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            if (!StringUtils.isEmpty(resolveInfo.activityInfo.packageName)) {
                if (resolveInfo.activityInfo.packageName.endsWith(context.getPackageName())) {
                    arrayList.add(new l(resolveInfo, resolveInfo.priority, 1));
                } else {
                    String str = resolveInfo.activityInfo.packageName;
                    String packageName = context.getPackageName();
                    String[] split = str.split("\\.");
                    String[] split2 = packageName.split("\\.");
                    if (split.length >= 2 && split2.length >= 2 && split[0].equals(split2[0]) && split[1].equals(split2[1])) {
                        arrayList.add(new l(resolveInfo, resolveInfo.priority, 0));
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ResolveInfo b2 = l.b((l) arrayList.get(0));
        arrayList.clear();
        return b2;
    }

    /* loaded from: classes6.dex */
    public static final class l implements Comparable<l> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final ResolveInfo f14448a;
        private int b;
        private int c;

        static {
            kge.a(-1922043683);
            kge.a(415966670);
        }

        public static /* synthetic */ ResolveInfo b(l lVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ResolveInfo) ipChange.ipc$dispatch("d388c4db", new Object[]{lVar}) : lVar.f14448a;
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(l lVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a4672d6", new Object[]{this, lVar})).intValue() : a(lVar);
        }

        public l(ResolveInfo resolveInfo, int i, int i2) {
            this.b = 0;
            this.c = 0;
            this.f14448a = resolveInfo;
            this.b = i;
            this.c = i2;
        }

        public int a(l lVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff81af9e", new Object[]{this, lVar})).intValue();
            }
            if (this == lVar) {
                return 0;
            }
            int i = lVar.b;
            int i2 = this.b;
            if (i != i2) {
                return i - i2;
            }
            int i3 = lVar.c;
            int i4 = this.c;
            return i3 != i4 ? i3 - i4 : System.identityHashCode(this) < System.identityHashCode(lVar) ? -1 : 1;
        }
    }

    public static void registerStickPreprocessor(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94158aa", new Object[]{hVar});
        } else {
            sStickPreprocessor.add(hVar);
        }
    }

    public static void unregisterStickPreprocessor(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a51671", new Object[]{hVar});
        } else {
            sStickPreprocessor.remove(hVar);
        }
    }

    public static void registerPreprocessor(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a35920", new Object[]{hVar});
        } else {
            sPreprocessor.add(hVar);
        }
    }

    public static void registerLastPreprocessor(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacaa7d6", new Object[]{hVar});
        } else if (sLastProcessor != null) {
        } else {
            sLastProcessor = hVar;
        }
    }

    public static void unregisterPreprocessor(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b3daf9", new Object[]{hVar});
        } else {
            sPreprocessor.remove(hVar);
        }
    }

    public static void registerAfterProcessor(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdc298c", new Object[]{cVar});
        } else {
            sAfterProcessor.add(cVar);
        }
    }

    public static void unregisterAfterProcessor(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd39925", new Object[]{cVar});
        } else {
            sAfterProcessor.remove(cVar);
        }
    }

    public static void registerHooker(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df344dc4", new Object[]{eVar});
            return;
        }
        SparseArray<e> sparseArray = sPriorHookers;
        if (sparseArray == null) {
            return;
        }
        if (sparseArray.get(4) != null) {
            Log.e(TAG, "There is already one NavHooker with priority NAVHOOKER_HIGH_PRIORITY! Cannot override this NavHooker!");
        } else {
            sPriorHookers.put(4, eVar);
        }
    }

    public static void registerPriorHooker(e eVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd9246fb", new Object[]{eVar, new Integer(i2)});
        } else if (i2 > 3 || i2 < 0) {
            throw new RuntimeException("NavHooker's priority less than NAVHOOKER_HIGH_PRIORITY, larger than NAVHOOKER_LOW_PRIORITY");
        } else {
            sPriorHookers.put(i2, eVar);
        }
    }

    public static void registerNavMonitor(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d743a06", new Object[]{jVar});
        } else {
            sNavMonitor = jVar;
        }
    }

    public static void setProcessorMonitor(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f5af31", new Object[]{nVar});
        } else {
            sProcessorMonitor = nVar;
        }
    }

    public static n getProcessorMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("c8207991", new Object[0]) : sProcessorMonitor;
    }

    public static void setExceptionHandler(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b51f9cf", new Object[]{dVar});
        } else {
            sExceptionHandler = dVar;
        }
    }

    public static void setNavResolver(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a27934", new Object[]{iVar});
        } else {
            sNavResolver = iVar;
        }
    }

    public static void setTransition(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b551353e", new Object[]{new Integer(i2), new Integer(i3)});
            return;
        }
        sTransition = r0;
        int[] iArr = {i2};
        sTransition[1] = i3;
    }

    private Nav(Context context) {
        this.mContext = context;
        this.mNavContext = new com.taobao.android.nav.d(this.mContext);
    }

    public Nav withSharedElement(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("2b4a14c7", new Object[]{this, view});
        }
        this.mNavContext.a(view, true);
        return this;
    }

    public Nav withSharedElement(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("6ac3e6e7", new Object[]{this, view, new Boolean(z)});
        }
        this.mNavContext.a(view, z);
        return this;
    }

    public Nav withSourceViewLocation(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("a63fd331", new Object[]{this, view});
        }
        this.mNavContext.a(view);
        return this;
    }

    public Nav withSourceViewDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Nav) ipChange.ipc$dispatch("f6e18012", new Object[]{this, drawable});
        }
        this.mNavContext.a(drawable);
        return this;
    }

    /* loaded from: classes.dex */
    public static final class b implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1577217159);
            kge.a(636013929);
        }

        private b() {
        }

        @Override // com.taobao.android.nav.Nav.i
        public List<ResolveInfo> a(PackageManager packageManager, Intent intent, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d79afe97", new Object[]{this, packageManager, intent, new Integer(i)}) : packageManager.queryIntentActivities(intent, i);
        }

        @Override // com.taobao.android.nav.Nav.i
        public ResolveInfo a(PackageManager packageManager, Intent intent, int i, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ResolveInfo) ipChange.ipc$dispatch("cf731223", new Object[]{this, packageManager, intent, new Integer(i), new Boolean(z)}) : packageManager.resolveActivity(intent, i);
        }
    }

    private boolean isDebug() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a59fb54", new Object[]{this})).booleanValue() : (this.mContext.getApplicationInfo().flags & 2) != 0;
    }

    public static void useWelcome(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a245f832", new Object[]{new Boolean(z)});
        } else {
            sUseWelcome = z;
        }
    }

    public static boolean hasWelcome() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f9aaeff3", new Object[0])).booleanValue() : sUseWelcome;
    }

    private String intent2String(Intent intent) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63c71475", new Object[]{this, intent});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Intent { ");
        String action = intent.getAction();
        if (action != null) {
            sb.append("act=");
            sb.append(action);
            z = false;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (String str : categories) {
                sb.append(str);
                sb.append(',');
            }
            sb.append(riy.ARRAY_END_STR);
            z = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            sb.append(data);
            z = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=");
            sb.append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x");
            sb.append(Integer.toHexString(flags));
            z = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=");
            sb.append(str2);
            z = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cmp=");
            sb.append(component.flattenToShortString());
        }
        sb.append(" }");
        return sb.toString();
    }

    public static void initSwitch(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd9eeb3d", new Object[]{context});
        } else {
            com.taobao.android.nav.h.a(context);
        }
    }
}
