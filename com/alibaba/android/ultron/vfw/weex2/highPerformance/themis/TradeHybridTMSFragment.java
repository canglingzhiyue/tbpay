package com.alibaba.android.ultron.vfw.weex2.highPerformance.themis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridPreRenderRecyclePolicy;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.tao.tbmainfragment.i;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.external.embed.a;
import com.uc.webview.export.media.MessageID;
import com.ut.mini.UTAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.w;
import kotlin.t;
import tb.bpl;
import tb.bzu;
import tb.eau;
import tb.iro;
import tb.jpt;
import tb.jqg;
import tb.kge;
import tb.ljl;
import tb.riy;
import tb.tnz;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 82\u00020\u0001:\u000289B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\u001f\u0010)\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\f2\b\u0010+\u001a\u0004\u0018\u00010,¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\u000e\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u000202J\u0018\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0002J\u0010\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment;", "Landroid/support/v4/app/DialogFragment;", "()V", "hasDisplayed", "", "lastDisplayTimestamp", "", "rootView", "Landroid/view/ViewGroup;", TradeHybridTMSFragment.TMS_BIZ_NAME, "", TradeHybridTMSFragment.TMS_CONTAINER_RES_ID, "", "tmsIns", "Lcom/taobao/themis/external/embed/TMSEmbed;", "tmsPageUrl", TradeHybridTMSFragment.TMS_SCENE_NAME, "dismissByTMSHost", "", "displayByTMSHost", "act", "Landroid/app/Activity;", "pageUrl", "initTMSEmbed", "onAttach", "context", "Landroid/content/Context;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", g4.b.i, "nextAnim", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", MessageID.onDestroy, "onDetach", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "(Ljava/lang/Integer;Landroid/view/KeyEvent;)Z", "onPause", "onResume", "processLifecycleByHost", "hostLifeCycle", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "redirectByTMSError", "url", HiAnalyticsConstant.HaKey.BI_KEY_ERRORREASON, "switchFragmentContainerState", "visible", "Companion", "HostLifeCycle", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class TradeHybridTMSFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    private static final String TAG = "TradeHybridTMSFragment";
    public static final String TMS_BIZ_NAME = "tmsBizName";
    public static final String TMS_CONTAINER_RES_ID = "tmsContainerResId";
    private static final String TMS_FRAGMENT_TAG = "tmsFragmentTag";
    public static final String TMS_SCENE_NAME = "tmsSceneName";
    private boolean hasDisplayed;
    private long lastDisplayTimestamp;
    private ViewGroup rootView;
    private TMSEmbed tmsIns;
    private int tmsContainerResId = -1;
    private String tmsBizName = "";
    private String tmsSceneName = "";
    private String tmsPageUrl = "";

    static {
        kge.a(694009650);
        Companion = new a(null);
    }

    @JvmStatic
    public static final TradeHybridTMSFragment initTMSContainer(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TradeHybridTMSFragment) ipChange.ipc$dispatch("80600a7d", new Object[]{bundle}) : Companion.a(bundle);
    }

    public static /* synthetic */ Object ipc$super(TradeHybridTMSFragment tradeHybridTMSFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void access$dismissByTMSHost(TradeHybridTMSFragment tradeHybridTMSFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ec2e25", new Object[]{tradeHybridTMSFragment});
        } else {
            tradeHybridTMSFragment.dismissByTMSHost();
        }
    }

    public static final /* synthetic */ TMSEmbed access$getTmsIns$p(TradeHybridTMSFragment tradeHybridTMSFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSEmbed) ipChange.ipc$dispatch("46e3c968", new Object[]{tradeHybridTMSFragment}) : tradeHybridTMSFragment.tmsIns;
    }

    public static final /* synthetic */ void access$redirectByTMSError(TradeHybridTMSFragment tradeHybridTMSFragment, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f93f619", new Object[]{tradeHybridTMSFragment, str, str2});
        } else {
            tradeHybridTMSFragment.redirectByTMSError(str, str2);
        }
    }

    public static final /* synthetic */ void access$setTmsBizName$p(TradeHybridTMSFragment tradeHybridTMSFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f79fe0", new Object[]{tradeHybridTMSFragment, str});
        } else {
            tradeHybridTMSFragment.tmsBizName = str;
        }
    }

    public static final /* synthetic */ void access$setTmsContainerResId$p(TradeHybridTMSFragment tradeHybridTMSFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bd2ca1", new Object[]{tradeHybridTMSFragment, new Integer(i)});
        } else {
            tradeHybridTMSFragment.tmsContainerResId = i;
        }
    }

    public static final /* synthetic */ void access$setTmsIns$p(TradeHybridTMSFragment tradeHybridTMSFragment, TMSEmbed tMSEmbed) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd21138", new Object[]{tradeHybridTMSFragment, tMSEmbed});
        } else {
            tradeHybridTMSFragment.tmsIns = tMSEmbed;
        }
    }

    public static final /* synthetic */ void access$setTmsSceneName$p(TradeHybridTMSFragment tradeHybridTMSFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc35cb59", new Object[]{tradeHybridTMSFragment, str});
        } else {
            tradeHybridTMSFragment.tmsSceneName = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "TMS_BIZ_NAME", "TMS_CONTAINER_RES_ID", "TMS_FRAGMENT_TAG", "TMS_SCENE_NAME", "initTMSContainer", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment;", "params", "Landroid/os/Bundle;", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(213242874);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final TradeHybridTMSFragment a(Bundle bundle) {
            String str;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TradeHybridTMSFragment) ipChange.ipc$dispatch("a6ad58a7", new Object[]{this, bundle});
            }
            TradeHybridTMSFragment tradeHybridTMSFragment = new TradeHybridTMSFragment();
            String str2 = "";
            if (bundle == null || (str = bundle.getString(TradeHybridTMSFragment.TMS_BIZ_NAME)) == null) {
                str = str2;
            }
            TradeHybridTMSFragment.access$setTmsBizName$p(tradeHybridTMSFragment, str);
            if (bundle != null && (string = bundle.getString(TradeHybridTMSFragment.TMS_SCENE_NAME)) != null) {
                str2 = string;
            }
            TradeHybridTMSFragment.access$setTmsSceneName$p(tradeHybridTMSFragment, str2);
            TradeHybridTMSFragment.access$setTmsContainerResId$p(tradeHybridTMSFragment, bundle != null ? bundle.getInt(TradeHybridTMSFragment.TMS_CONTAINER_RES_ID) : -1);
            return tradeHybridTMSFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "", "()V", "OnActivityResult", "OnDestroy", "OnPause", "OnResume", "OnStart", "OnStop", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnStart;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnResume;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnPause;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnStop;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnDestroy;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnActivityResult;", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static abstract class b {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnDestroy;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "()V", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
        /* renamed from: com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0106b extends b {
            public static final C0106b INSTANCE;

            static {
                kge.a(208709063);
                INSTANCE = new C0106b();
            }

            private C0106b() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnPause;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "()V", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes2.dex */
        public static final class c extends b {
            public static final c INSTANCE;

            static {
                kge.a(824589059);
                INSTANCE = new c();
            }

            private c() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnResume;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "()V", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes2.dex */
        public static final class d extends b {
            public static final d INSTANCE;

            static {
                kge.a(-146647872);
                INSTANCE = new d();
            }

            private d() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnStart;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "()V", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes2.dex */
        public static final class e extends b {
            public static final e INSTANCE;

            static {
                kge.a(827906415);
                INSTANCE = new e();
            }

            private e() {
                super(null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnStop;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "()V", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes2.dex */
        public static final class f extends b {
            public static final f INSTANCE;

            static {
                kge.a(-1912955563);
                INSTANCE = new f();
            }

            private f() {
                super(null);
            }
        }

        static {
            kge.a(1769785456);
        }

        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnActivityResult;", "Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle;", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Intent;)V", "getData", "()Landroid/content/Intent;", "getRequestCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResultCode", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/content/Intent;)Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$HostLifeCycle$OnActivityResult;", eau.PARSER_TAG, "", "other", "", "hashCode", "toString", "", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
        /* loaded from: classes2.dex */
        public static final class a extends b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final Integer f2805a;
            private final Integer b;
            private final Intent c;

            static {
                kge.a(-110220897);
            }

            public boolean equals(Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
                }
                if (this != obj) {
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        if (!q.a(this.f2805a, aVar.f2805a) || !q.a(this.b, aVar.b) || !q.a(this.c, aVar.c)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                IpChange ipChange = $ipChange;
                int i = 0;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
                }
                Integer num = this.f2805a;
                int hashCode = (num != null ? num.hashCode() : 0) * 31;
                Integer num2 = this.b;
                int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
                Intent intent = this.c;
                if (intent != null) {
                    i = intent.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "OnActivityResult(requestCode=" + this.f2805a + ", resultCode=" + this.b + ", data=" + this.c + riy.BRACKET_END_STR;
            }

            public a(Integer num, Integer num2, Intent intent) {
                super(null);
                this.f2805a = num;
                this.b = num2;
                this.c = intent;
            }

            public final Integer a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("5e2c18f", new Object[]{this}) : this.f2805a;
            }

            public final Integer b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("50145ad0", new Object[]{this}) : this.b;
            }

            public final Intent c() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("df5aea69", new Object[]{this}) : this.c;
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.d(inflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            FragmentActivity fragmentActivity = activity;
            this.rootView = new FrameLayout(fragmentActivity);
            ViewGroup viewGroup2 = this.rootView;
            if (viewGroup2 != null) {
                int c2 = bpl.c(fragmentActivity);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                if (c2 <= 0) {
                    c2 = 0;
                }
                marginLayoutParams.topMargin = c2;
                t tVar = t.INSTANCE;
                viewGroup2.setLayoutParams(marginLayoutParams);
                viewGroup2.setBackgroundColor(-1);
                TMSEmbed tMSEmbed = this.tmsIns;
                if (tMSEmbed != null && (b2 = tMSEmbed.b()) != null) {
                    ViewParent parent = b2.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        parent = null;
                    }
                    ViewGroup viewGroup3 = (ViewGroup) parent;
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(b2);
                    }
                    viewGroup2.addView(b2);
                }
            }
        }
        return this.rootView;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        switchFragmentContainerState(true);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageDisAppear(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageAppearDonotSkip(getActivity());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageDisAppear(getActivity());
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        switchFragmentContainerState(false);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.b(uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().pageAppearDonotSkip(getActivity());
    }

    private final void switchFragmentContainerState(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615e5c59", new Object[]{this, new Boolean(z)});
        } else if (this.tmsContainerResId == -1) {
            jqg.a(TAG, "switchFragmentContainerState:", "tmsContainerResId is invalid, state: " + z);
        } else {
            FragmentActivity activity = getActivity();
            View findViewById = activity != null ? activity.findViewById(this.tmsContainerResId) : null;
            if (!(findViewById instanceof View)) {
                findViewById = null;
            }
            if (findViewById == null) {
                return;
            }
            if (!z) {
                i = 8;
            }
            findViewById.setVisibility(i);
            this.hasDisplayed = z;
        }
    }

    public final boolean onKeyDown(Integer num, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fde41d72", new Object[]{this, num, keyEvent})).booleanValue();
        }
        if (!this.hasDisplayed || num == null || num.intValue() != 4) {
            return false;
        }
        dismissByTMSHost();
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (z) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(250L);
            return translateAnimation;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation2.setDuration(250L);
        return translateAnimation2;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        processLifecycleByHost(b.C0106b.INSTANCE);
        if (!iro.b(this.tmsSceneName, this.tmsBizName)) {
            jqg.a(TAG, "onDestroy:", "switcher is off, " + this.tmsSceneName + " - " + this.tmsBizName);
            return;
        }
        String str = this.tmsBizName;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            jqg.a(TAG, "onDestroy:", "tmsBizName is NullOrEmpty");
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a a2 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
        q.b(a2, "UltronTradeHybridManager.getInstance()");
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a d = a2.b().d(this.tmsPageUrl);
        if (d == null || TextUtils.isEmpty(d.e)) {
            jqg.a(TAG, "onDestroy:", "preRenderModel is invalid");
            return;
        }
        String str2 = d.e;
        if (str2.hashCode() != -224113450 || !str2.equals(UltronTradeHybridPreRenderRecyclePolicy.DESTROY_REBUILD)) {
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a a3 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
        q.b(a3, "UltronTradeHybridManager.getInstance()");
        JSONObject f = a3.d().f(this.tmsBizName);
        com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a a4 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a();
        q.b(a4, "UltronTradeHybridManager.getInstance()");
        a4.d().a(d, f);
    }

    public final boolean displayByTMSHost(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24e7f90", new Object[]{this, activity, str})).booleanValue();
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            jqg.a(TAG, "displayTMSContainer:", "pageUrl is NullOrEmpty");
            return false;
        } else if (this.tmsContainerResId == -1) {
            jqg.a(TAG, "displayTMSContainer:", "tmsContainerResId is invalid");
            return false;
        } else {
            if (activity instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                if (fragmentActivity.getSupportFragmentManager() != null) {
                    if (!(activity instanceof com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a) && !(i.a(fragmentActivity.getSupportFragmentManager()) instanceof com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a)) {
                        jqg.a(TAG, "displayTMSContainer:", "ITradeHybridTMSHost is invalid");
                        return false;
                    }
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(TMS_FRAGMENT_TAG);
                    if (isAdded() || this.hasDisplayed || findFragmentByTag != null || System.currentTimeMillis() - this.lastDisplayTimestamp < 500) {
                        jqg.a(TAG, "displayTMSContainer:", "fragment already displayed");
                        return true;
                    }
                    initTMSEmbed(activity, str);
                    FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                    beginTransaction.add(this.tmsContainerResId, this, TMS_FRAGMENT_TAG);
                    beginTransaction.commitAllowingStateLoss();
                    this.lastDisplayTimestamp = System.currentTimeMillis();
                    this.tmsPageUrl = str;
                    return true;
                }
            }
            jqg.a(TAG, "displayTMSContainer:", "activity is not FragmentActivity");
            return false;
        }
    }

    private final void initTMSEmbed(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e437c2b2", new Object[]{this, activity, str});
            return;
        }
        TMSEmbed tMSEmbed = new TMSEmbed(activity, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        this.tmsIns = tMSEmbed;
        tMSEmbed.a(new c(str));
        WebStartParams webStartParams = new WebStartParams();
        webStartParams.setUrl(str);
        t tVar = t.INSTANCE;
        tMSEmbed.a(webStartParams);
        tMSEmbed.a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/alibaba/android/ultron/vfw/weex2/highPerformance/themis/TradeHybridTMSFragment$initTMSEmbed$1$1", "Lcom/taobao/themis/external/embed/TMSEmbed$IRenderListener;", "onDowngrade", "", "canAutoDowngrade", "errorCode", "", "errorMsg", "onJSException", "", ljl.LAUNCHER_FINISH_TIME, ljl.LAUNCHER_START_TIME, "onPop", "onRenderFailed", ljl.RENDER_START_TIME, ljl.RENDER_SUCCESS_TIME, "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class c extends a.C0936a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -650670724:
                    super.a((String) objArr[0], (String) objArr[1]);
                    return null;
                case -635125116:
                    return new Boolean(super.a(((Boolean) objArr[0]).booleanValue(), (String) objArr[1], (String) objArr[2]));
                case 90991720:
                    super.a();
                    return null;
                case 91915241:
                    super.b();
                    return null;
                case 92838762:
                    super.c();
                    return null;
                case 93762283:
                    super.d();
                    return null;
                case 94685804:
                    super.e();
                    return null;
                case 1708636285:
                    super.b((String) objArr[0], (String) objArr[1]);
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public c(String str) {
            this.b = str;
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public boolean a(boolean z, String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("da24c284", new Object[]{this, new Boolean(z), errorCode, errorMsg})).booleanValue();
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", "onDowngrade, errorCode: " + errorCode + ", errorMsg: " + errorMsg);
            TradeHybridTMSFragment.access$redirectByTMSError(TradeHybridTMSFragment.this, this.b, "onDowngrade");
            return super.a(z, errorCode, errorMsg);
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void b(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", "onJSException, errorCode: " + errorCode + ", errorMsg: " + errorMsg);
            TradeHybridTMSFragment.access$redirectByTMSError(TradeHybridTMSFragment.this, this.b, "onJSException");
            super.b(errorCode, errorMsg);
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void e() {
            tnz tnzVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", ljl.LAUNCHER_FINISH_TIME);
            super.e();
            TMSEmbed access$getTmsIns$p = TradeHybridTMSFragment.access$getTmsIns$p(TradeHybridTMSFragment.this);
            if (access$getTmsIns$p == null || (tnzVar = (tnz) access$getTmsIns$p.a(tnz.class)) == null) {
                return;
            }
            tnzVar.a(new tnz.a() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tnz.a
                public final void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        TradeHybridTMSFragment.access$dismissByTMSHost(TradeHybridTMSFragment.this);
                    }
                }
            });
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", ljl.LAUNCHER_START_TIME);
            super.d();
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", "onPop");
            super.b();
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void a(String errorCode, String errorMsg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, errorCode, errorMsg});
                return;
            }
            q.d(errorCode, "errorCode");
            q.d(errorMsg, "errorMsg");
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", "onRenderFailed, errorCode: " + errorCode + ", errorMsg: " + errorMsg);
            TradeHybridTMSFragment.access$redirectByTMSError(TradeHybridTMSFragment.this, this.b, "onRenderFailed");
            super.a(errorCode, errorMsg);
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", ljl.RENDER_START_TIME);
            super.c();
        }

        @Override // com.taobao.themis.external.embed.a.C0936a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            jqg.a(TradeHybridTMSFragment.TAG, "displayTMSContainer:", ljl.RENDER_SUCCESS_TIME);
            super.a();
        }
    }

    private final void redirectByTMSError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3e0c9c", new Object[]{this, str, str2});
            return;
        }
        jpt a2 = bzu.a.b("redirectByTMSError").a(false);
        w wVar = w.INSTANCE;
        Object[] objArr = {str2, str};
        String format = String.format("%s - %s", Arrays.copyOf(objArr, objArr.length));
        q.b(format, "java.lang.String.format(format, *args)");
        bzu.a(a2.a(format).a(1.0f));
    }

    private final void dismissByTMSHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eea8a28", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (!(activity instanceof FragmentActivity) || activity.getSupportFragmentManager() == null) {
            jqg.a(TAG, "dismissTMSContainer:", "activity is not FragmentActivity");
        } else if (!(activity instanceof com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a) && !(i.a(activity.getSupportFragmentManager()) instanceof com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.a)) {
            jqg.a(TAG, "dismissTMSContainer:", "ITradeHybridTMSHost is invalid");
        } else {
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager != null ? supportFragmentManager.findFragmentByTag(TMS_FRAGMENT_TAG) : null;
            if (!(findFragmentByTag instanceof TradeHybridTMSFragment)) {
                findFragmentByTag = null;
            }
            TradeHybridTMSFragment tradeHybridTMSFragment = (TradeHybridTMSFragment) findFragmentByTag;
            if (tradeHybridTMSFragment == null) {
                return;
            }
            tradeHybridTMSFragment.dismiss();
        }
    }

    public final void processLifecycleByHost(b hostLifeCycle) {
        TMSEmbed tMSEmbed;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3343700", new Object[]{this, hostLifeCycle});
            return;
        }
        q.d(hostLifeCycle, "hostLifeCycle");
        if (hostLifeCycle instanceof b.e) {
            TMSEmbed tMSEmbed2 = this.tmsIns;
            if (tMSEmbed2 == null) {
                return;
            }
            tMSEmbed2.d();
        } else if (hostLifeCycle instanceof b.d) {
            TMSEmbed tMSEmbed3 = this.tmsIns;
            if (tMSEmbed3 == null) {
                return;
            }
            tMSEmbed3.f();
        } else if (hostLifeCycle instanceof b.c) {
            TMSEmbed tMSEmbed4 = this.tmsIns;
            if (tMSEmbed4 == null) {
                return;
            }
            tMSEmbed4.g();
        } else if (hostLifeCycle instanceof b.f) {
            TMSEmbed tMSEmbed5 = this.tmsIns;
            if (tMSEmbed5 == null) {
                return;
            }
            tMSEmbed5.e();
        } else if (hostLifeCycle instanceof b.C0106b) {
            TMSEmbed tMSEmbed6 = this.tmsIns;
            if (tMSEmbed6 == null) {
                return;
            }
            tMSEmbed6.c();
        } else if (!(hostLifeCycle instanceof b.a) || (tMSEmbed = this.tmsIns) == null) {
        } else {
            b.a aVar = (b.a) hostLifeCycle;
            Integer a2 = aVar.a();
            int intValue = a2 != null ? a2.intValue() : 0;
            Integer b2 = aVar.b();
            if (b2 != null) {
                i = b2.intValue();
            }
            tMSEmbed.a(intValue, i, aVar.c());
        }
    }
}
