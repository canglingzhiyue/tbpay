package com.taobao.share.ui.engine.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WindVaneInterface;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.runtimepermission.f;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.c;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;
import tb.nyy;
import tb.nzj;
import tb.nzo;
import tb.oba;
import tb.obg;
import tb.obk;
import tb.obl;

/* loaded from: classes8.dex */
public class TBWeexShare extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CLOSE_POP_PANEL = "share_receiver_close_share_menu";
    public static final String ACTION_CLOSE_SHARE_PANEL = "com.taobao.share.closeSharePanel";
    public static final String ACTION_SAVE_SHARE_IMAGE = "com.taobao.share.saveShareImage";
    private static final String HUB_FRAGMENT_TAG = "ShareModule_tag_fragment";
    public static final String INTENT_DATA = "data";
    public static final String NEW_WEEX_VERSION_SIGN = "newWeexShare";
    private static final String TAG = "TBWeexShare-WVApiPlugin";
    private static JSONObject mSinaWeiboAuthData;
    private volatile int imageListCount;
    private volatile AtomicInteger saveSuccessCount;

    static {
        kge.a(1197430440);
    }

    public static /* synthetic */ Object ipc$super(TBWeexShare tBWeexShare, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context access$000(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b4c4f87a", new Object[]{tBWeexShare}) : tBWeexShare.mContext;
    }

    public static /* synthetic */ Context access$100(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("92b85e59", new Object[]{tBWeexShare}) : tBWeexShare.mContext;
    }

    public static /* synthetic */ void access$200(TBWeexShare tBWeexShare, WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e25107", new Object[]{tBWeexShare, wVCallBackContext, str});
        } else {
            tBWeexShare.saveImageList(wVCallBackContext, str);
        }
    }

    public static /* synthetic */ Context access$300(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4e9f2a17", new Object[]{tBWeexShare}) : tBWeexShare.mContext;
    }

    public static /* synthetic */ AtomicInteger access$400(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("31073068", new Object[]{tBWeexShare}) : tBWeexShare.saveSuccessCount;
    }

    public static /* synthetic */ Context access$500(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("a85f5d5", new Object[]{tBWeexShare}) : tBWeexShare.mContext;
    }

    public static /* synthetic */ int access$600(TBWeexShare tBWeexShare) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f4470af", new Object[]{tBWeexShare})).intValue() : tBWeexShare.imageListCount;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("registerWeexShareListener".equals(str)) {
            registerWeexShareListener(wVCallBackContext, str2);
        } else if ("closeSharePanel".equals(str)) {
            closeSharePanel(wVCallBackContext, str2);
        } else if ("saveShareImage".equals(str)) {
            saveShareImage(wVCallBackContext, str2);
        } else if ("updateShareContent".equals(str)) {
            updateShareContent(wVCallBackContext, str2);
        } else if ("saveShareImageList".equals(str)) {
            saveShareImageList(wVCallBackContext, str2);
        } else if ("getContactsInfo".equals(str)) {
            getContactsInfo(wVCallBackContext, str2);
        } else if ("shareToContact".equals(str)) {
            shareToContact(wVCallBackContext, str2);
        } else if ("getRecentContacts".equals(str)) {
            getRecentContacts(wVCallBackContext, str2);
        } else if ("shareToChannel".equals(str)) {
            shareToChannel(wVCallBackContext, str2);
        } else if ("startGuangVideoDownload".equals(str)) {
            startGuangVideoDownload(wVCallBackContext, str2);
        } else if ("cancelGuangVideoDownload".equals(str)) {
            cancelGuangVideoDownload(wVCallBackContext, str2);
        } else if ("updateWaterMaskVideoPath".equals(str)) {
            updateWaterMaskVideoPath(wVCallBackContext, str2);
        } else if ("feShareToContact".equals(str)) {
            feShareToContact(wVCallBackContext, str2);
        } else if ("shareInputExposure".equals(str)) {
            traceShareBtnExpose(wVCallBackContext, str2);
        } else if ("shareSendBroadCast".equals(str)) {
            shareSendBroadCast(wVCallBackContext, str2);
        } else if ("requestScrollViewLayout".equals(str)) {
            requestScrollViewLayout(wVCallBackContext, str2);
        } else if ("requestScrollViewLayout".equals(str)) {
            requestScrollViewLayout(wVCallBackContext, str2);
        } else if (!"shareSendBroadCast".equals(str)) {
            return false;
        } else {
            shareSendBroadCast(wVCallBackContext, str2);
        }
        return true;
    }

    private void shareSendBroadCast(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5d6728", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("pageName");
            String string2 = parseObject.getString("pageUrl");
            String string3 = parseObject.getString("openTimestamp");
            Intent intent = new Intent("afc_page_open_broadcast");
            intent.putExtra("pageName", string);
            intent.putExtra("pageUrl", string2);
            intent.putExtra("openTimestamp", string3);
            intent.putExtra("data", str);
            LocalBroadcastManager.getInstance(this.mContext.getApplicationContext()).sendBroadcast(intent);
            wVCallBackContext.success();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    private void traceShareBtnExpose(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d65c54", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            ShareBusiness.traceShareBtnExpose(JSON.parseObject(str).getString("bizType"));
            wVCallBackContext.success();
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }

    private void requestScrollViewLayout(WVCallBackContext wVCallBackContext, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ced8ed9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nzo shareWeexSdk = ShareBizAdapter.getInstance().getShareWeexSdk("");
        WeexInstance weexInstance = null;
        if (shareWeexSdk != null) {
            weexInstance = shareWeexSdk.f();
        }
        if (weexInstance == null || weexInstance.getRootView() == null || !(weexInstance.getRootView() instanceof ViewGroup)) {
            return;
        }
        final View findViewWithTag = weexInstance.getRootView().findViewWithTag("sharescrollViewTag");
        if (!(findViewWithTag instanceof ScrollView)) {
            return;
        }
        final ScrollView scrollView = (ScrollView) findViewWithTag;
        findViewWithTag.post(new Runnable() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String string = JSON.parseObject(str).getString("subContentHeight");
                    float parseFloat = Float.parseFloat(string);
                    LinearLayout linearLayout = (LinearLayout) scrollView.getChildAt(0);
                    View childAt = linearLayout.getChildAt(0);
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i = (int) ((parseFloat * TBWeexShare.access$000(TBWeexShare.this).getResources().getDisplayMetrics().density) + 0.5f);
                    nyy.b("requestScrollViewLayout", "subContentHeight:" + string + " pxValue:" + i);
                    if (i > measuredHeight || i > 0) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        layoutParams.height = i;
                        childAt.setLayoutParams(layoutParams);
                        childAt.requestLayout();
                        childAt.invalidate();
                    }
                    nyy.b("requestScrollViewLayout", " getChildAt height:" + linearLayout.getLayoutParams().height + " ScrollView height:" + scrollView.getLayoutParams().height);
                } catch (Throwable unused) {
                }
            }
        });
        findViewWithTag.postDelayed(new Runnable() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    String string = JSON.parseObject(str).getString("subContentHeight");
                    float parseFloat = Float.parseFloat(string);
                    LinearLayout linearLayout = (LinearLayout) scrollView.getChildAt(0);
                    View childAt = linearLayout.getChildAt(0);
                    int measuredHeight = childAt.getMeasuredHeight();
                    int i = (int) ((parseFloat * TBWeexShare.access$100(TBWeexShare.this).getResources().getDisplayMetrics().density) + 0.5f);
                    nyy.b("requestScrollViewLayout", "subContentHeight:" + string + " pxValue:" + i);
                    if (i > measuredHeight || i > 0) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        layoutParams.height = i;
                        childAt.setLayoutParams(layoutParams);
                        childAt.requestLayout();
                        findViewWithTag.requestLayout();
                        findViewWithTag.invalidate();
                    }
                    nyy.b("requestScrollViewLayout", " getChildAt height:" + linearLayout.getLayoutParams().height + " ScrollView height:" + scrollView.getLayoutParams().height);
                } catch (Throwable unused) {
                }
            }
        }, 30L);
    }

    private void updateWaterMaskVideoPath(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8990be14", new Object[]{this, wVCallBackContext, str});
            return;
        }
        TBShareContent j = com.taobao.share.globalmodel.e.b().j();
        JSONObject parseObject = JSON.parseObject(str);
        if (j != null && parseObject != null && StringUtils.equals(parseObject.getString("videoPath"), j.extraParams.get("videoPath")) && !StringUtils.isEmpty(parseObject.getString("waterMaskVideoPath"))) {
            j.extraParams.put("waterMaskVideoPath", parseObject.getString("waterMaskVideoPath"));
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error();
    }

    private void startGuangVideoDownload(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b53f27", new Object[]{this, wVCallBackContext, str});
            return;
        }
        TBShareContent j = com.taobao.share.globalmodel.e.b().j();
        if (j != null) {
            j.extraParams.put("isWeexDownload", "true");
            com.taobao.share.ui.engine.structure.a aVar = new com.taobao.share.ui.engine.structure.a();
            c cVar = new c();
            cVar.a(j);
            aVar.a(cVar);
            aVar.a("videodownload");
            obk.a().onEvent(aVar);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error();
    }

    private void cancelGuangVideoDownload(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c582553f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        TBShareContent j = com.taobao.share.globalmodel.e.b().j();
        if (j != null) {
            com.taobao.share.ui.engine.structure.a aVar = new com.taobao.share.ui.engine.structure.a();
            c cVar = new c();
            cVar.a(j);
            aVar.a(cVar);
            aVar.a("videodownload");
            obk.a().a(aVar);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error();
    }

    @WindVaneInterface
    private void saveShareImageList(final WVCallBackContext wVCallBackContext, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740fc0a5", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            if (obl.b()) {
                saveImageList(wVCallBackContext, str);
            } else {
                f.a(this.mContext, obl.a()).b("tb_share").a(true).a(com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18168)).b(new Runnable() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        wVCallBackContext.error();
                        b.a(TBWeexShare.access$300(TBWeexShare.this), com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18167));
                    }
                }).a(new Runnable() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TBWeexShare.access$200(TBWeexShare.this, wVCallBackContext, str);
                        }
                    }
                }).a();
            }
        } catch (Throwable th) {
            wVCallBackContext.error();
            nyy.c("TBWeexShare", " saveShareImageList err:" + th.getMessage());
            th.printStackTrace();
        }
    }

    @WindVaneInterface
    private void saveImageList(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c280d7aa", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONArray jSONArray = JSONObject.parseObject(str).getJSONArray(BaseJsExecutor.NAME_IMAGE_LIST);
            this.saveSuccessCount = new AtomicInteger(0);
            this.imageListCount = jSONArray.size();
            for (int i = 0; i < this.imageListCount; i++) {
                com.taobao.phenix.intf.b.h().a(this.mContext.getApplicationContext()).a((String) jSONArray.get(i)).succListener(new AnonymousClass6(wVCallBackContext)).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.phenix.intf.event.a
                    public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                    }

                    public boolean a(FailPhenixEvent failPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                        }
                        nyy.c("TBWeexShare", " saveShareImageList load fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
                        wVCallBackContext.error();
                        return false;
                    }
                }).fetch();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.taobao.share.ui.engine.jsbridge.TBWeexShare$6  reason: invalid class name */
    /* loaded from: classes8.dex */
    public class AnonymousClass6 implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WVCallBackContext f19673a;

        public AnonymousClass6(WVCallBackContext wVCallBackContext) {
            this.f19673a = wVCallBackContext;
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null) {
                final Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                if (bitmap != null) {
                    final File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                    AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (StringUtils.isEmpty(oba.a(true, bitmap, externalStoragePublicDirectory, TBWeexShare.access$500(TBWeexShare.this)))) {
                                nyy.c("TBWeexShare", " saveShareImageList save fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
                            } else {
                                TBWeexShare.access$400(TBWeexShare.this).getAndIncrement();
                                nyy.c("TBWeexShare", " saveShareImageList index:" + TBWeexShare.access$400(TBWeexShare.this).get() + " total:" + TBWeexShare.access$600(TBWeexShare.this));
                                if (TBWeexShare.access$400(TBWeexShare.this).get() != TBWeexShare.access$600(TBWeexShare.this)) {
                                    return;
                                }
                                nyy.c("TBWeexShare", " saveShareImageList all done");
                                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.6.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        AnonymousClass6.this.f19673a.success();
                                        a.a().a("saveShareImageListSuccess", a.EMPTY_EVENT);
                                    }
                                });
                            }
                        }
                    });
                } else {
                    nyy.c("TBWeexShare", " saveShareImageList save fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
                }
            } else {
                nyy.c("TBWeexShare", " saveShareImageList save fail:" + TBWeexShare.access$400(TBWeexShare.this).get());
            }
            return true;
        }
    }

    @WindVaneInterface
    private void updateShareContent(WVCallBackContext wVCallBackContext, String str) {
        try {
            TBShareContent j = com.taobao.share.globalmodel.e.b().j();
            for (Map.Entry<String, Object> entry : JSONObject.parseObject(str).entrySet()) {
                Field declaredField = j.getClass().getDeclaredField(entry.getKey());
                declaredField.setAccessible(true);
                declaredField.set(j, entry.getValue());
            }
            wVCallBackContext.success();
        } catch (Exception e) {
            wVCallBackContext.error();
            e.printStackTrace();
            nyy.c(nyy.SHARE_TAG, " updateShareContent err:" + e.getMessage());
        }
    }

    @WindVaneInterface
    private void saveShareImage(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2949f5e7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Intent intent = new Intent(ACTION_SAVE_SHARE_IMAGE);
            intent.putExtra("data", str);
            LocalBroadcastManager.getInstance(this.mContext.getApplicationContext()).sendBroadcast(intent);
            wVCallBackContext.success();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void closeSharePanel(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76c484b", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            Intent intent = new Intent(ACTION_CLOSE_SHARE_PANEL);
            intent.putExtra("data", str);
            LocalBroadcastManager.getInstance(this.mContext.getApplicationContext()).sendBroadcast(intent);
            wVCallBackContext.success();
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void registerWeexShareListener(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769b871d", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            nyy.c("TIMECOST", "windvane registerWeexShareListener: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
            a.a().a(wVCallBackContext);
            TBShareContent j = com.taobao.share.globalmodel.e.b().j();
            if ("common".equals(j.templateId)) {
                String config = OrangeConfig.getInstance().getConfig("android_share", "commonTemplateId", "");
                if (!StringUtils.isEmpty(config)) {
                    j.templateId = config;
                }
            }
            if (ShareBizAdapter.getInstance().getFriendsProvider() == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) SubstituteConstants.KEY_CHANNEL_FRIENDS);
                jSONObject.put("state", (Object) (-1));
                a.a().a(a.DATA_STATE_EVENT, jSONObject);
            }
            if (str.contains(NEW_WEEX_VERSION_SIGN)) {
                return;
            }
            r rVar = new r();
            rVar.a(a.SHARE_CONTENT_KEY, JSON.toJSONString(j));
            wVCallBackContext.success(rVar);
        } catch (Exception e) {
            e.printStackTrace();
            wVCallBackContext.error();
            nyy.c("TBWeexShare", "registerWeexShareListener err:" + e.getMessage());
        }
    }

    @WindVaneInterface
    private void getContactsInfo(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d02de865", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            nyy.c("TIMECOST", "windvane getContactsInfo: " + (System.currentTimeMillis() - ShareBusiness.sShareStartTime));
            com.taobao.share.ui.engine.friend.a a2 = com.taobao.share.ui.engine.friend.a.a();
            a2.a(wVCallBackContext);
            a2.b();
        } catch (Exception e) {
            nyy.c(nyy.SHARE_TAG, "getContactsInfo err:" + e.getMessage());
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void shareToContact(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c2df94", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            com.taobao.share.ui.engine.friend.b.a().a((ContactInfo) JSONObject.parseObject(str, ContactInfo.class));
            wVCallBackContext.success();
        } catch (Exception e) {
            nyy.c(nyy.SHARE_TAG, "shareToContact err:" + e.getMessage());
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void getRecentContacts(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8d2ed2", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            ShareBizAdapter.getInstance().getFriendsProvider().a(0, new nzj() { // from class: com.taobao.share.ui.engine.jsbridge.TBWeexShare.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nzi.a
                public void onFriendsProvider(Object obj, Object obj2, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1ba85066", new Object[]{this, obj, obj2, new Integer(i), new Integer(i2)});
                        return;
                    }
                    String str2 = (String) obj;
                    if (StringUtils.isEmpty(str2)) {
                        wVCallBackContext.error();
                        return;
                    }
                    r rVar = new r();
                    rVar.a(com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_KEY, str2);
                    rVar.b();
                    wVCallBackContext.success(rVar);
                }
            });
        } catch (Throwable th) {
            wVCallBackContext.error();
            nyy.c("TBWeexShare", " getRecentContacts err:" + th.getMessage());
            th.printStackTrace();
        }
    }

    @WindVaneInterface
    private void shareToChannel(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703920b7", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            obg.a().a(JSONObject.parseObject(str));
            wVCallBackContext.success();
        } catch (Exception e) {
            nyy.c(nyy.SHARE_TAG, "shareToChannel err:" + e.getMessage());
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }

    @WindVaneInterface
    private void feShareToContact(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72680b73", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            if (parseObject != null) {
                String string = parseObject.getString("action");
                char c = 65535;
                int hashCode = string.hashCode();
                if (hashCode != 3135262) {
                    if (hashCode != 3541570) {
                        if (hashCode == 94750088 && string.equals("click")) {
                            c = 0;
                        }
                    } else if (string.equals("succ")) {
                        c = 1;
                    }
                } else if (string.equals("fail")) {
                    c = 2;
                }
                if (c == 0) {
                    com.taobao.share.taopassword.b.a(ShareTargetType.Share2Contact);
                    wVCallBackContext.success();
                    return;
                } else if (c == 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("platform", ShareTargetType.Share2Contact.getValue());
                    hashMap.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "success");
                    ShareBusiness.getInstance().onShareFinished(hashMap);
                    wVCallBackContext.success();
                    return;
                } else if (c == 2) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("platform", ShareTargetType.Share2Contact.getValue());
                    hashMap2.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, "fail");
                    ShareBusiness.getInstance().onShareFinished(hashMap2);
                    wVCallBackContext.success();
                    return;
                } else {
                    nyy.c(nyy.SHARE_TAG, "feShareToContact err");
                    wVCallBackContext.error();
                    return;
                }
            }
            nyy.c(nyy.SHARE_TAG, "feShareToContact err");
            wVCallBackContext.error();
        } catch (Exception e) {
            nyy.c(nyy.SHARE_TAG, "feShareToContact err:" + e.getMessage());
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }
}
