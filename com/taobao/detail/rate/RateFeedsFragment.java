package com.taobao.detail.rate;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.abilitykit.ability.g;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.megadesign.dx.view.DisplayVideoView;
import com.taobao.detail.rate.model.RateInfo;
import com.taobao.detail.rate.model.itemrates.entity.RateKeyword;
import com.taobao.detail.rate.vivid.ability.c;
import com.taobao.detail.rate.vivid.widget.RateRootFragment;
import com.taobao.search.common.util.i;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import com.uc.webview.export.media.MessageID;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import org.android.agoo.common.AgooConstants;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.aem;
import tb.alr;
import tb.bip;
import tb.dkt;
import tb.ivz;
import tb.kik;
import tb.kin;
import tb.kio;
import tb.kjp;
import tb.kpz;
import tb.mqw;
import tb.rih;
import tb.rwb;
import tb.ses;
import tb.tbt;
import tb.xkm;
import tb.xmt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0016\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0097\u0001\u0098\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010`\u001a\u00020aJ\u0006\u0010b\u001a\u00020aJ\b\u0010c\u001a\u00020aH\u0002J\b\u0010d\u001a\u0004\u0018\u00010\u0013J\b\u0010e\u001a\u00020\u0001H\u0016J\b\u0010f\u001a\u00020aH\u0016J\u0010\u0010g\u001a\u00020a2\u0006\u0010h\u001a\u000208H\u0002J\b\u0010i\u001a\u00020*H\u0002J\u0017\u0010j\u001a\u00020*2\b\u0010k\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0002\u0010lJ\b\u0010m\u001a\u00020*H\u0002J\b\u0010n\u001a\u00020*H\u0002J\u001a\u0010o\u001a\u00020*2\b\u0010p\u001a\u0004\u0018\u00010\u00132\u0006\u0010q\u001a\u00020\u0006H\u0002J\u0012\u0010r\u001a\u00020a2\b\u0010s\u001a\u0004\u0018\u00010tH\u0016J\"\u0010u\u001a\u0004\u0018\u00010v2\u0006\u0010w\u001a\u00020\u00102\u0006\u0010x\u001a\u00020*2\u0006\u0010y\u001a\u00020\u0010H\u0016J&\u0010z\u001a\u0004\u0018\u00010U2\u0006\u0010{\u001a\u00020|2\b\u0010}\u001a\u0004\u0018\u00010~2\b\u0010s\u001a\u0004\u0018\u00010tH\u0016J\b\u0010\u007f\u001a\u00020aH\u0016JC\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\u00102\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u00012\u001a\u0010\u0085\u0001\u001a\u000e\u0012\t\b\u0001\u0012\u0005\u0018\u00010\u0087\u00010\u0086\u0001\"\u0005\u0018\u00010\u0087\u0001H\u0016¢\u0006\u0003\u0010\u0088\u0001J\t\u0010\u0089\u0001\u001a\u00020aH\u0016J\t\u0010\u008a\u0001\u001a\u00020aH\u0016J$\u0010\u008b\u0001\u001a\u00020a2\b\u0010k\u001a\u0004\u0018\u00010\u00102\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0003\u0010\u008d\u0001J$\u0010\u008e\u0001\u001a\u00020a2\b\u0010k\u001a\u0004\u0018\u00010\u00102\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0003\u0010\u008d\u0001J\u0011\u0010\u008f\u0001\u001a\u00020a2\u0006\u0010B\u001a\u00020CH\u0016J\u0014\u0010\u0090\u0001\u001a\u00020a2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010KH\u0016J\u0014\u0010\u0092\u0001\u001a\u00020a2\t\u0010\u0093\u0001\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010\u0094\u0001\u001a\u00020a2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0003\u0010\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060>X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001e\"\u0004\bA\u0010 R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010D\u001a\u0004\u0018\u00010EX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010N\u001a\u00020OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010V\u001a\n\u0012\u0004\u0012\u00020X\u0018\u00010WX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010Y\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_¨\u0006\u0099\u0001"}, d2 = {"Lcom/taobao/detail/rate/RateFeedsFragment;", "Landroid/support/v4/app/Fragment;", "Landroid/taobao/windvane/service/WVEventListener;", "Lcom/taobao/detail/rate/IRateFragment;", "()V", "DEFAULT_QUESTION_ICON", "", "DEFAULT_QUESTION_TEXT", "kotlin.jvm.PlatformType", "abilityEngine", "Lcom/taobao/android/abilitykit/AKAbilityEngine;", "getAbilityEngine", "()Lcom/taobao/android/abilitykit/AKAbilityEngine;", "setAbilityEngine", "(Lcom/taobao/android/abilitykit/AKAbilityEngine;)V", "currentSelectedTabIndex", "", "Ljava/lang/Integer;", "defaultItemInfo", "Lcom/alibaba/fastjson/JSONObject;", "defaultSkuData", "Lcom/alibaba/fastjson/JSONArray;", "detailRatePresenter", "Lcom/taobao/detail/rate/vivid/presenter/DetailRatePresenter;", "getDetailRatePresenter", "()Lcom/taobao/detail/rate/vivid/presenter/DetailRatePresenter;", "setDetailRatePresenter", "(Lcom/taobao/detail/rate/vivid/presenter/DetailRatePresenter;)V", "initSelectSku", "getInitSelectSku", "()Lcom/alibaba/fastjson/JSONObject;", "setInitSelectSku", "(Lcom/alibaba/fastjson/JSONObject;)V", "initSelectSkuName", "getInitSelectSkuName", "()Ljava/lang/String;", "setInitSelectSkuName", "(Ljava/lang/String;)V", "initSelectTip", "getInitSelectTip", "setInitSelectTip", "isTabHasSelected", "", "jutrackSwitch", "getJutrackSwitch", "setJutrackSwitch", "loadingViewTrack", "Lcom/taobao/detail/rate/util/track/RateListLoadingViewFrameTrack;", "getLoadingViewTrack", "()Lcom/taobao/detail/rate/util/track/RateListLoadingViewFrameTrack;", "setLoadingViewTrack", "(Lcom/taobao/detail/rate/util/track/RateListLoadingViewFrameTrack;)V", "mQuestionIcon", "mQuestionLink", "mQuestionText", "mRateInfo", "Lcom/taobao/detail/rate/model/RateInfo;", "mSelectedTag", "openCacheForLoadingView", "openPreRequest", "openRateListUseDetailData", com.taobao.themis.kernel.entity.a.KEY_PAGE_PROPS, "", "paramsInfo", "getParamsInfo", "setParamsInfo", "preRenderContext", "Lcom/taobao/detail/rate/vivid/utils/PreRenderContext;", "preRequestPresenter", "Lcom/taobao/detail/rate/vivid/presenter/PreRequestPresenter;", "getPreRequestPresenter", "()Lcom/taobao/detail/rate/vivid/presenter/PreRequestPresenter;", "setPreRequestPresenter", "(Lcom/taobao/detail/rate/vivid/presenter/PreRequestPresenter;)V", "rateCallBack", "Lcom/taobao/detail/rate/RateFeedsFragment$RateCallBack;", "rateView", "Lcom/taobao/detail/rate/vivid/widget/RateRootFragment;", "registerReceiverAbilityBuild", "Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$Builder;", "getRegisterReceiverAbilityBuild", "()Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$Builder;", "setRegisterReceiverAbilityBuild", "(Lcom/taobao/detail/rate/vivid/ability/RegisterReceiverAbility$Builder;)V", "rootView", "Landroid/view/View;", "sourceKeyWordList", "", "Lcom/taobao/detail/rate/model/itemrates/entity/RateKeyword;", "tabIndex", "trackManager", "Lcom/taobao/detail/rate/util/track/RateListFirstFrameTrackManager;", "getTrackManager", "()Lcom/taobao/detail/rate/util/track/RateListFirstFrameTrackManager;", "setTrackManager", "(Lcom/taobao/detail/rate/util/track/RateListFirstFrameTrackManager;)V", "detailPause", "", "detailResume", kio.ENABLE_RATE_CPU_BOOST, "getDetailRate", "getFragment", "initParams", "initQuestionData", "bundle", "isActiveTab", "isChangeCurrentTabInMulti", "curIndex", "(Ljava/lang/Integer;)Z", "isMultiPopMode", "isPopMode", "isTargetPage", "rateExParams", "target", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", g4.b.i, "nextAnim", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", MessageID.onDestroy, MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "Landroid/taobao/windvane/service/WVEventResult;", "id", "wvEventContext", "Landroid/taobao/windvane/service/WVEventContext;", "p2", "", "", "(ILandroid/taobao/windvane/service/WVEventContext;[Ljava/lang/Object;)Landroid/taobao/windvane/service/WVEventResult;", "onPause", "onResume", "onTabSelect", com.taobao.android.weex_framework.util.a.ATOM_lastIndex, "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "onTabUnSelect", "setPreRender", "setRateCallBack", "callBack", "setRateInfo", "info", "setTabIndex", "index", "(Ljava/lang/Integer;)V", "Companion", "RateCallBack", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public class RateFeedsFragment extends Fragment implements c, aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private dkt abilityEngine;
    private Integer currentSelectedTabIndex;
    private JSONObject defaultItemInfo;
    private com.taobao.detail.rate.vivid.presenter.a detailRatePresenter;
    private String initSelectSkuName;
    private boolean isTabHasSelected;
    private xmt loadingViewTrack;
    private String mQuestionIcon;
    private String mQuestionLink;
    private String mQuestionText;
    private RateInfo mRateInfo;
    private String mSelectedTag;
    private boolean openCacheForLoadingView;
    private boolean openPreRequest;
    private boolean openRateListUseDetailData;
    private rih preRenderContext;
    private com.taobao.detail.rate.vivid.presenter.b preRequestPresenter;
    private b rateCallBack;
    private RateRootFragment rateView;
    private View rootView;
    private List<? extends RateKeyword> sourceKeyWordList;
    private Integer tabIndex;
    private ivz trackManager;
    public static final a Companion = new a(null);
    private static String TAG_WITHPIC = com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_has_picture);
    private static String TAG_VIDEO = com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_video);
    private static String currentUtPageName = "Page_DetailComments2";
    private static String currentUtPageSpm = "a1z0b.11346571";
    private final String DEFAULT_QUESTION_TEXT = Globals.getApplication().getString(R.string.rate_ask_default_text);
    private final String DEFAULT_QUESTION_ICON = "https://gw.alicdn.com/tps/TB1J7X6KXXXXXc4XXXXXXXXXXXX-102-60.png";
    private JSONObject paramsInfo = new JSONObject();
    private JSONArray defaultSkuData = new JSONArray();
    private String initSelectTip = com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_filter_by_category);
    private JSONObject initSelectSku = new JSONObject();
    private final Map<String, String> pageProps = new LinkedHashMap();
    private String jutrackSwitch = "false";
    private c.a registerReceiverAbilityBuild = new c.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/taobao/detail/rate/RateFeedsFragment$RateCallBack;", "", "onDismiss", "", "onShow", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public interface b {
        void a();

        void b();
    }

    @JvmStatic
    public static final RateFeedsFragment getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RateFeedsFragment) ipChange.ipc$dispatch("93d82eb2", new Object[0]) : Companion.a();
    }

    public static /* synthetic */ Object ipc$super(RateFeedsFragment rateFeedsFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public RateFeedsFragment() {
        enableCPUBoost();
    }

    public static final /* synthetic */ String access$getCurrentUtPageSpm$cp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f3b912c7", new Object[0]) : currentUtPageSpm;
    }

    public static final /* synthetic */ void access$setCurrentUtPageName$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e038e92", new Object[]{str});
        } else {
            currentUtPageName = str;
        }
    }

    public static final /* synthetic */ void access$setCurrentUtPageSpm$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3ec0f7", new Object[]{str});
        } else {
            currentUtPageSpm = str;
        }
    }

    public static final /* synthetic */ void access$setTAG_VIDEO$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24671d6e", new Object[]{str});
        } else {
            TAG_VIDEO = str;
        }
    }

    public static final /* synthetic */ void access$setTAG_WITHPIC$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa390145", new Object[]{str});
        } else {
            TAG_WITHPIC = str;
        }
    }

    public final JSONObject getParamsInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e2b64df1", new Object[]{this}) : this.paramsInfo;
    }

    public final void setParamsInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271ebbb3", new Object[]{this, jSONObject});
            return;
        }
        q.d(jSONObject, "<set-?>");
        this.paramsInfo = jSONObject;
    }

    public final String getInitSelectTip() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cf5fd80", new Object[]{this}) : this.initSelectTip;
    }

    public final void setInitSelectTip(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9669945e", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.initSelectTip = str;
    }

    public final JSONObject getInitSelectSku() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("df7f29c2", new Object[]{this}) : this.initSelectSku;
    }

    public final void setInitSelectSku(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3de29a", new Object[]{this, jSONObject});
            return;
        }
        q.d(jSONObject, "<set-?>");
        this.initSelectSku = jSONObject;
    }

    public final String getInitSelectSkuName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae8c95f3", new Object[]{this}) : this.initSelectSkuName;
    }

    public final void setInitSelectSkuName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2085304b", new Object[]{this, str});
        } else {
            this.initSelectSkuName = str;
        }
    }

    public final dkt getAbilityEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkt) ipChange.ipc$dispatch("cc574edc", new Object[]{this}) : this.abilityEngine;
    }

    public final void setAbilityEngine(dkt dktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3e7bd4", new Object[]{this, dktVar});
        } else {
            this.abilityEngine = dktVar;
        }
    }

    public final String getJutrackSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f4c173b", new Object[]{this}) : this.jutrackSwitch;
    }

    public final void setJutrackSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bed6b203", new Object[]{this, str});
            return;
        }
        q.d(str, "<set-?>");
        this.jutrackSwitch = str;
    }

    public final c.a getRegisterReceiverAbilityBuild() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("7e11ef4c", new Object[]{this}) : this.registerReceiverAbilityBuild;
    }

    public final void setRegisterReceiverAbilityBuild(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a7c908", new Object[]{this, aVar});
            return;
        }
        q.d(aVar, "<set-?>");
        this.registerReceiverAbilityBuild = aVar;
    }

    public final com.taobao.detail.rate.vivid.presenter.b getPreRequestPresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.detail.rate.vivid.presenter.b) ipChange.ipc$dispatch("bf645b12", new Object[]{this}) : this.preRequestPresenter;
    }

    public final void setPreRequestPresenter(com.taobao.detail.rate.vivid.presenter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0782ea", new Object[]{this, bVar});
        } else {
            this.preRequestPresenter = bVar;
        }
    }

    public final com.taobao.detail.rate.vivid.presenter.a getDetailRatePresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.detail.rate.vivid.presenter.a) ipChange.ipc$dispatch("90289b98", new Object[]{this}) : this.detailRatePresenter;
    }

    public final void setDetailRatePresenter(com.taobao.detail.rate.vivid.presenter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86cae286", new Object[]{this, aVar});
        } else {
            this.detailRatePresenter = aVar;
        }
    }

    public final ivz getTrackManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ivz) ipChange.ipc$dispatch("da974b7a", new Object[]{this}) : this.trackManager;
    }

    public final void setTrackManager(ivz ivzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d8ef4e", new Object[]{this, ivzVar});
        } else {
            this.trackManager = ivzVar;
        }
    }

    public final xmt getLoadingViewTrack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xmt) ipChange.ipc$dispatch("c34c38a0", new Object[]{this}) : this.loadingViewTrack;
    }

    public final void setLoadingViewTrack(xmt xmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62631c4", new Object[]{this, xmtVar});
        } else {
            this.loadingViewTrack = xmtVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/taobao/detail/rate/RateFeedsFragment$Companion;", "", "()V", "TAG_VIDEO", "", "getTAG_VIDEO", "()Ljava/lang/String;", "setTAG_VIDEO", "(Ljava/lang/String;)V", "TAG_WITHPIC", "getTAG_WITHPIC", "setTAG_WITHPIC", "currentUtPageName", "getCurrentUtPageName", "setCurrentUtPageName", "currentUtPageSpm", "getCurrentUtPageSpm", "setCurrentUtPageSpm", "getInstance", "Lcom/taobao/detail/rate/RateFeedsFragment;", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : RateFeedsFragment.access$getCurrentUtPageSpm$cp();
        }

        @JvmStatic
        public final RateFeedsFragment a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RateFeedsFragment) ipChange.ipc$dispatch("26c5541c", new Object[]{this}) : new RateFeedsFragment();
        }
    }

    @Override // android.support.v4.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        TranslateAnimation translateAnimation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        if (!ses.INSTANCE.a() || isPopMode()) {
            return null;
        }
        if (z) {
            translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        } else {
            translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        }
        translateAnimation.setDuration(kio.INSTANCE.v());
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        return translateAnimation;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        JSONObject detailRate;
        com.taobao.detail.rate.vivid.presenter.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        String str = null;
        if (!isMultiPopMode()) {
            RateInfo rateInfo = this.mRateInfo;
            Long valueOf = rateInfo != null ? Long.valueOf(rateInfo.getClickTimeMS()) : null;
            RateInfo rateInfo2 = this.mRateInfo;
            Long valueOf2 = rateInfo2 != null ? Long.valueOf(rateInfo2.getNavTimeMS()) : null;
            RateInfo rateInfo3 = this.mRateInfo;
            this.trackManager = new ivz(this, valueOf, valueOf2, rateInfo3 != null ? rateInfo3.openMode : null);
        }
        this.openPreRequest = xkm.INSTANCE.d();
        boolean f = xkm.INSTANCE.f();
        this.openCacheForLoadingView = xkm.INSTANCE.j();
        this.openRateListUseDetailData = xkm.INSTANCE.k();
        if (this.openPreRequest) {
            this.preRequestPresenter = new com.taobao.detail.rate.vivid.presenter.b(f, this.openCacheForLoadingView);
        }
        if (!isMultiPopMode() && this.openRateListUseDetailData && kio.INSTANCE.u()) {
            RateInfo rateInfo4 = this.mRateInfo;
            Long valueOf3 = rateInfo4 != null ? Long.valueOf(rateInfo4.getClickTimeMS()) : null;
            RateInfo rateInfo5 = this.mRateInfo;
            Long valueOf4 = rateInfo5 != null ? Long.valueOf(rateInfo5.getNavTimeMS()) : null;
            RateInfo rateInfo6 = this.mRateInfo;
            if (rateInfo6 != null) {
                str = rateInfo6.openMode;
            }
            this.loadingViewTrack = new xmt(valueOf3, valueOf4, str);
        }
        this.detailRatePresenter = new com.taobao.detail.rate.vivid.presenter.a();
        RateInfo rateInfo7 = this.mRateInfo;
        if (rateInfo7 == null || (detailRate = rateInfo7.getDetailRate()) == null || (aVar = this.detailRatePresenter) == null) {
            return;
        }
        aVar.a(detailRate);
    }

    public final JSONObject getDetailRate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9478bcee", new Object[]{this});
        }
        RateInfo rateInfo = this.mRateInfo;
        if (rateInfo == null) {
            return null;
        }
        return rateInfo.getDetailRate();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        dkt l;
        g b2;
        JSONObject c;
        RateRootFragment rateRootFragment;
        com.taobao.detail.rate.vivid.presenter.b bVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.d(inflater, "inflater");
        m.e(kin.INSTANCE.a(), "onCreateView.Start");
        aem.a().a(this);
        initParams();
        if (this.openPreRequest) {
            com.taobao.detail.rate.vivid.presenter.b bVar2 = this.preRequestPresenter;
            if (bVar2 != null) {
                bVar2.a(this.paramsInfo);
            }
            com.taobao.detail.rate.vivid.presenter.b bVar3 = this.preRequestPresenter;
            if (bVar3 != null) {
                bVar3.c();
            }
        }
        if (this.openCacheForLoadingView) {
            com.taobao.detail.rate.vivid.presenter.a aVar = this.detailRatePresenter;
            if (aVar != null && (bVar = this.preRequestPresenter) != null && bVar.d() != null) {
                JSONObject d = bVar.d();
                q.b(d, "presenter.requestResultForLoadingView");
                this.paramsInfo.put((JSONObject) "detailRate", (String) aVar.b(d));
            }
            xmt xmtVar = this.loadingViewTrack;
            if (xmtVar != null) {
                xmtVar.a((JSONObject) this.paramsInfo.get("detailRate"));
            }
        }
        dkt dktVar = null;
        this.rootView = View.inflate(getContext(), R.layout.rate_feed_vivd_fragment, null);
        View view = this.rootView;
        View findViewById = view != null ? view.findViewById(R.id.view_rate) : null;
        if (findViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.vivid.widget.RateRootFragment");
        }
        this.rateView = (RateRootFragment) findViewById;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("adaptByViewSize");
        }
        if (z && (rateRootFragment = this.rateView) != null) {
            rateRootFragment.setAdaptByViewSize(true);
        }
        rih rihVar = this.preRenderContext;
        DinamicXEngine c2 = rihVar != null ? rihVar.c() : null;
        rih rihVar2 = this.preRenderContext;
        if (rihVar2 != null && c2 != null) {
            if (rihVar2 != null) {
                dktVar = rihVar2.d();
            }
            this.abilityEngine = dktVar;
            rih rihVar3 = this.preRenderContext;
            q.a(rihVar3);
            this.registerReceiverAbilityBuild = rihVar3.e();
            dkt l2 = c2.l();
            if (l2 != null && (c = l2.c()) != null) {
                c.clear();
            }
            List<String> m = kio.INSTANCE.m();
            if (m != null) {
                for (String str : m) {
                    if (c2 != null && (l = c2.l()) != null && (b2 = l.b()) != null) {
                        b2.a(str);
                    }
                }
            }
        } else {
            this.abilityEngine = new dkt(new alr(kin.INSTANCE.b(), "DX"), null);
            c2 = kpz.INSTANCE.a(this.abilityEngine, this.registerReceiverAbilityBuild, getContext());
            c2.h();
        }
        DXRenderOptions.a aVar2 = new DXRenderOptions.a();
        RateRootFragment rateRootFragment2 = this.rateView;
        if (rateRootFragment2 != null) {
            rateRootFragment2.initDinamicX(c2, kio.INSTANCE.a(), this.paramsInfo, aVar2);
        }
        View view2 = this.rootView;
        if (view2 != null) {
            view2.setClickable(true);
        }
        m.e(kin.INSTANCE.a(), "onCreateView.End");
        return this.rootView;
    }

    private final boolean isPopMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a30695", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.mRateInfo;
        String str = null;
        if (!q.a((Object) (rateInfo != null ? rateInfo.openMode : null), (Object) "pop")) {
            RateInfo rateInfo2 = this.mRateInfo;
            if (rateInfo2 != null) {
                str = rateInfo2.openMode;
            }
            if (!q.a((Object) str, (Object) mqw.POP_MULTI_TAB)) {
                return false;
            }
        }
        return true;
    }

    private final boolean isMultiPopMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b30ac70", new Object[]{this})).booleanValue();
        }
        RateInfo rateInfo = this.mRateInfo;
        return q.a((Object) (rateInfo != null ? rateInfo.openMode : null), (Object) mqw.POP_MULTI_TAB);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        aem.a().b(this);
        b bVar = this.rateCallBack;
        if (bVar != null) {
            bVar.b();
        }
        this.registerReceiverAbilityBuild.a().d();
        DisplayVideoView.Companion.a(null);
        ivz ivzVar = this.trackManager;
        if (ivzVar == null) {
            return;
        }
        ivzVar.c();
    }

    @Override // com.taobao.detail.rate.c
    public void setRateCallBack(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d93f289e", new Object[]{this, bVar});
        } else {
            this.rateCallBack = bVar;
        }
    }

    @Override // com.taobao.detail.rate.c
    public void setRateInfo(RateInfo rateInfo) {
        rwb a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9ccb2", new Object[]{this, rateInfo});
            return;
        }
        this.mRateInfo = rateInfo;
        RateInfo rateInfo2 = this.mRateInfo;
        if (rateInfo2 == null) {
            return;
        }
        this.pageProps.put("shop_id", rateInfo2.getShopId());
        this.pageProps.put("seller_id", rateInfo2.getSellerId());
        this.pageProps.put("item_id", rateInfo2.getItemId());
        this.pageProps.put("version", "rate2.0");
        this.pageProps.put("spm-cnt", currentUtPageSpm);
        initQuestionData(rateInfo2);
        String selectTag = rateInfo2.getSelectTag();
        if (!(selectTag == null || selectTag.length() == 0) && rateInfo2.getRateKeywordList() != null) {
            this.mSelectedTag = rateInfo2.getSelectTag();
            List<RateKeyword> rateKeywordList = rateInfo2.getRateKeywordList();
            q.b(rateKeywordList, "it.rateKeywordList");
            if (!rateKeywordList.isEmpty()) {
                int size = rateKeywordList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    RateKeyword rateKeyword = rateKeywordList.get(i);
                    if (q.a((Object) this.mSelectedTag, (Object) rateKeyword.getWord())) {
                        rateInfo2.setExpression(rateKeyword.getAttribute());
                        if (rateKeyword.getRateType() != 100) {
                            rateInfo2.setRateType(String.valueOf(rateKeyword.getRateType()));
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        this.sourceKeyWordList = rateInfo2.getRateKeywordList();
        String skuVids = rateInfo2.getSkuVids();
        JSONObject skuInfo = rateInfo2.getSkuInfo();
        if (skuInfo != null && (skuInfo.getJSONArray("props") instanceof JSONArray)) {
            this.defaultSkuData = skuInfo.getJSONArray("props");
            JSONArray jSONArray = this.defaultSkuData;
            if (jSONArray != null && (a2 = p.a((Collection<?>) jSONArray)) != null) {
                Iterator<Integer> it = a2.iterator();
                while (it.hasNext()) {
                    int b2 = ((ae) it).b();
                    JSONArray jSONArray2 = this.defaultSkuData;
                    JSONObject jSONObject = jSONArray2 != null ? jSONArray2.getJSONObject(b2) : null;
                    if (jSONObject != null) {
                        JSONArray array = jSONObject.getJSONArray("values");
                        q.b(array, "array");
                        int size2 = array.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                JSONObject jSONObject2 = array.getJSONObject(i2);
                                String string = jSONObject2.getString(MspEventTypes.ACTION_STRING_VID);
                                String string2 = jSONObject2.getString("name");
                                if (skuVids != null && q.a((Object) skuVids, (Object) string)) {
                                    this.initSelectSku.put((JSONObject) "vids", string);
                                    this.initSelectSku.put((JSONObject) "name", string2);
                                    this.initSelectSkuName = string2;
                                    this.initSelectTip = com.taobao.android.litecreator.localization.a.Companion.a(R.string.rate_selected_rate);
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                }
            }
        }
        this.paramsInfo.put((JSONObject) "skuVids", rateInfo2.getSkuVids());
        this.paramsInfo.put((JSONObject) tbt.PRE_RENDER, "false");
        this.defaultItemInfo = rateInfo2.getItemInfo();
    }

    @Override // com.taobao.detail.rate.c
    public void setPreRender(rih preRenderContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695f1a9d", new Object[]{this, preRenderContext});
            return;
        }
        q.d(preRenderContext, "preRenderContext");
        if (!ses.INSTANCE.a()) {
            return;
        }
        this.preRenderContext = preRenderContext;
    }

    @Override // com.taobao.detail.rate.c
    public Fragment getFragment() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("67766af", new Object[]{this}) : this;
    }

    @Override // com.taobao.detail.rate.c
    public void setTabIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd092ef1", new Object[]{this, num});
        } else {
            this.tabIndex = num;
        }
    }

    private final boolean isActiveTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de460eb0", new Object[]{this})).booleanValue();
        }
        if (!isMultiPopMode()) {
            return true;
        }
        return q.a(this.tabIndex, this.currentSelectedTabIndex);
    }

    private final boolean isChangeCurrentTabInMulti(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d9dbb16", new Object[]{this, num})).booleanValue() : isMultiPopMode() && q.a(this.tabIndex, num);
    }

    @Override // com.taobao.detail.rate.c
    public void onTabSelect(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10984139", new Object[]{this, num, num2});
            return;
        }
        this.currentSelectedTabIndex = num;
        if (!isChangeCurrentTabInMulti(num)) {
            return;
        }
        if (num != null && num.intValue() > 0 && !this.isTabHasSelected) {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            Long valueOf2 = Long.valueOf(System.currentTimeMillis());
            RateInfo rateInfo = this.mRateInfo;
            String str = null;
            this.trackManager = new ivz(this, valueOf, valueOf2, rateInfo != null ? rateInfo.openMode : null);
            if (this.openCacheForLoadingView && kio.INSTANCE.u()) {
                RateInfo rateInfo2 = this.mRateInfo;
                Long valueOf3 = rateInfo2 != null ? Long.valueOf(rateInfo2.getClickTimeMS()) : null;
                RateInfo rateInfo3 = this.mRateInfo;
                Long valueOf4 = rateInfo3 != null ? Long.valueOf(rateInfo3.getNavTimeMS()) : null;
                RateInfo rateInfo4 = this.mRateInfo;
                if (rateInfo4 != null) {
                    str = rateInfo4.openMode;
                }
                this.loadingViewTrack = new xmt(valueOf3, valueOf4, str);
            }
        }
        this.isTabHasSelected = true;
        m.e(kin.INSTANCE.a(), "onTabSelect");
        if (num2 == null || num2.intValue() == -1) {
            return;
        }
        detailResume();
    }

    @Override // com.taobao.detail.rate.c
    public void onTabUnSelect(Integer num, Integer num2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e42072", new Object[]{this, num, num2});
            return;
        }
        this.currentSelectedTabIndex = num;
        if (!isChangeCurrentTabInMulti(num2)) {
            return;
        }
        m.e(kin.INSTANCE.a(), "onTabUnSelect");
        detailPause();
    }

    public void initParams() {
        Intent intent;
        JSONObject exParams;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5290783d", new Object[]{this});
            return;
        }
        RateInfo rateInfo = this.mRateInfo;
        Uri uri = null;
        if (rateInfo != null) {
            if (rateInfo != null && (exParams = rateInfo.getExParams()) != null) {
                if (exParams.containsKey("jutrack_Ab") && exParams.get("jutrack_Ab") != null) {
                    z = true;
                }
                if (!z) {
                    exParams = null;
                }
                if (exParams != null) {
                    this.jutrackSwitch = String.valueOf(exParams.remove("jutrack_Ab"));
                }
            }
            Object json = JSON.toJSON(this.mRateInfo);
            if (json == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            JSONObject jSONObject = (JSONObject) json;
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2;
            jSONObject3.put((JSONObject) "askText", this.mQuestionText);
            jSONObject3.put((JSONObject) "askIcon", this.mQuestionIcon);
            jSONObject3.put((JSONObject) "linkUrl", this.mQuestionLink);
            JSONObject jSONObject4 = jSONObject;
            jSONObject4.put((JSONObject) "isOpenSKUFilter", "true");
            jSONObject4.put((JSONObject) "isOpenGroup", "true");
            jSONObject4.put((JSONObject) Constants.Name.AUTO_PLAY, "true");
            jSONObject.remove("skuInfo");
            jSONObject4.put((JSONObject) "defaultSkuData", (String) this.defaultSkuData);
            jSONObject4.put((JSONObject) "askInfo", (String) jSONObject2);
            jSONObject4.put((JSONObject) "itemInfo", (String) this.defaultItemInfo);
            jSONObject4.put((JSONObject) "initSelectTip", this.initSelectTip);
            jSONObject4.put((JSONObject) "initSelectSku", (String) this.initSelectSku);
            jSONObject4.put((JSONObject) "initSelectSkuName", this.initSelectSkuName);
            RateInfo rateInfo2 = this.mRateInfo;
            jSONObject4.put((JSONObject) "foldFlag", String.valueOf(rateInfo2 != null ? Integer.valueOf(rateInfo2.getFoldFlag()) : null));
            JSONObject jSONObject5 = jSONObject.getJSONObject("rateExtParams");
            if (isTargetPage(jSONObject5, "12")) {
                currentUtPageName = "Page_DetailComments3";
                currentUtPageSpm = "a1z0b.28783249";
            } else if (isTargetPage(jSONObject5, AgooConstants.ACK_FLAG_NULL) && kio.INSTANCE.B()) {
                currentUtPageName = "Page_DetailComments4";
                currentUtPageSpm = "a1z0b.a1z0b.b34490092";
            } else {
                currentUtPageName = "Page_DetailComments2";
                currentUtPageSpm = "a1z0b.11346571";
            }
            jSONObject4.put((JSONObject) "spm", currentUtPageSpm);
            jSONObject4.put((JSONObject) "utPageName", currentUtPageName);
            this.paramsInfo = jSONObject;
        }
        try {
            FragmentActivity activity = getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                uri = intent.getData();
            }
            if (uri != null) {
                String queryParameter = uri.getQueryParameter("scm");
                if (!StringUtils.isEmpty(queryParameter)) {
                    this.pageProps.put("scm-pre", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("spm");
                if (!StringUtils.isEmpty(queryParameter2)) {
                    this.pageProps.put(bip.KEY_UMBRELLA_SPM_PRE, queryParameter2);
                }
            }
        } catch (Exception unused) {
        }
        this.paramsInfo.put((JSONObject) "renderStartTime", String.valueOf(System.currentTimeMillis()));
        this.paramsInfo.put((JSONObject) "hideLoading", (String) Boolean.valueOf(kio.INSTANCE.l()));
        this.paramsInfo.put((JSONObject) "enablePreRequest", (String) Boolean.valueOf(this.openPreRequest));
        this.paramsInfo.put((JSONObject) "streamRender", (String) Boolean.valueOf(xkm.INSTANCE.h()));
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put((JSONObject) "enableUseDetailData", (String) Boolean.valueOf(this.openRateListUseDetailData));
        this.paramsInfo.put((JSONObject) "performanceABParams", (String) jSONObject6);
    }

    private final boolean isTargetPage(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa8a050d", new Object[]{this, jSONObject, str})).booleanValue();
        }
        return (jSONObject != null ? jSONObject.getString("invokeSource") : null) != null && q.a((Object) str, (Object) jSONObject.getString("invokeSource"));
    }

    private final void enableCPUBoost() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3aeb05", new Object[]{this});
        } else if (!xkm.INSTANCE.a()) {
        } else {
            if (kjp.INSTANCE.a()) {
                i = 2;
            }
            ADaemon.boostCpu(i);
        }
    }

    private final void initQuestionData(RateInfo rateInfo) {
        String questionIcon;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c1502", new Object[]{this, rateInfo});
        } else if (rateInfo == null) {
        } else {
            this.mQuestionText = rateInfo.getQuestionText();
            if (StringUtils.isEmpty(this.mQuestionText)) {
                this.mQuestionText = this.DEFAULT_QUESTION_TEXT;
            }
            this.mQuestionLink = rateInfo.getQuestionLink();
            if (StringUtils.isEmpty(rateInfo.getQuestionIcon())) {
                questionIcon = this.DEFAULT_QUESTION_ICON;
            } else {
                questionIcon = rateInfo.getQuestionIcon();
            }
            this.mQuestionIcon = questionIcon;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        m.e(kin.INSTANCE.a(), "onResume.Start");
        if (isActiveTab()) {
            detailResume();
        }
        m.e(kin.INSTANCE.a(), "onResume.End");
    }

    public final void detailResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9693f165", new Object[]{this});
        } else if (getActivity() == null) {
        } else {
            b bVar = this.rateCallBack;
            if (bVar != null) {
                bVar.a();
            }
            kik.a((Activity) getActivity(), currentUtPageName, this.pageProps);
        }
    }

    public final void detailPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7d922c", new Object[]{this});
        } else if (getActivity() == null) {
        } else {
            if (q.a((Object) this.jutrackSwitch, (Object) "true")) {
                kik.b(getActivity(), "Page_Detail", this.pageProps);
            } else {
                kik.b(getActivity(), currentUtPageName, this.pageProps);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!isActiveTab()) {
            return;
        }
        detailPause();
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... p2) {
        g b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, p2});
        }
        q.d(p2, "p2");
        if (i == 3005 && (p2[0] instanceof String)) {
            JSONObject parseObject = JSON.parseObject((String) p2[0]);
            q.b(parseObject, "JSON.parseObject(p2[0] as String?)");
            Object obj = parseObject.get("param");
            if (!(obj instanceof JSONObject)) {
                obj = null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && q.a((Object) "taobao_rate_list", jSONObject.get("bizId"))) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "data", (String) jSONObject);
                dkt dktVar = this.abilityEngine;
                if (dktVar != null && (b2 = dktVar.b()) != null) {
                    b2.a("AR_MAKE_UP_COMPLETED", jSONObject2);
                }
            }
        }
        return null;
    }
}
