package com.taobao.message.notification.banner.support;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.android.nav.Nav;
import com.taobao.message.notification.banner.InnerNotificationAdapter;
import com.taobao.message.notification.banner.InnerPushVO;
import com.taobao.message.notification.banner.dx.DXTemplateItemFetcher;
import com.taobao.message.notification.banner.dx.DXTemplateVO;
import com.taobao.message.notification.banner.dx.DynamicSimpleComponent;
import com.taobao.message.notification.banner.dx.DynamicSimpleProps;
import com.taobao.message.notification.banner.dx.TapEventHandlerProxy;
import com.taobao.message.notification.banner.view.DefaultBannerView;
import com.taobao.message.notification.banner.view.NotificationBannerHelper;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.ParseUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.kge;

/* loaded from: classes7.dex */
public class MarketingInnerNotificationAdapter extends InnerNotificationAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IN_APP_PUSH = "inAppPush";
    public static final String KEY_IS_INAPPPUSH = "is_in_app";
    public static final String KEY_PUSHUTARGS = "pushUtArgs";
    private static final String TAG = "OfficalNotification";
    private static LruCache<String, Long> mClickMap;
    private static volatile TapHandler mTapHandler;
    private JSONObject agooJSONObject;
    private Map<String, String> extData;
    private JSONObject inAppPushTemplateData;
    private Integer inAppPushTemplateId;
    private String mAgooId;
    private DynamicSimpleComponent mDynamicComponent;
    private String mMsgId;
    private String mPushUTArgs;
    public long mTime;
    public String msgTypeId;
    private boolean stateNew;

    /* loaded from: classes7.dex */
    public static class AccountMessageTypeIdValue {
        public static final String MESSAGE_TYPE_ID_HUDONG = "20141013170024";
        public static final String MESSAGE_TYPE_ID_TONGZHI = "1002";
        public static final String MESSAGE_TYPE_ID_WULIU = "821";
        public static final String MESSAGE_TYPE_ID_YOUHUI = "1556181449297";

        static {
            kge.a(-1473537672);
        }
    }

    /* loaded from: classes7.dex */
    public static class RelationBizTypeValue {
        public static final String ACCOUNT_HUDONG = "20423";
        public static final String ACCOUNT_PINGTAI = "20007";
        public static final String ACCOUNT_TONGZHI = "20422";
        public static final String ACCOUNT_WULIU = "20421";
        public static final String ACCOUNT_YOUHUI = "20424";

        static {
            kge.a(-20571542);
        }
    }

    private static String getUTType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1046090a", new Object[0]) : "agoo";
    }

    public static /* synthetic */ Object ipc$super(MarketingInnerNotificationAdapter marketingInnerNotificationAdapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1865040893:
                super.onShow();
                return null;
            case -893949262:
                super.onDismiss();
                return null;
            case 634261907:
                super.onError(((Number) objArr[0]).intValue());
                return null;
            case 979191448:
                super.onDismissActive();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private static boolean supposeToBeDynamic(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f0b0fbe", new Object[]{new Integer(i)})).booleanValue() : i != -1;
    }

    public void onShowError(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912a8007", new Object[]{this, str, str2});
        }
    }

    public static /* synthetic */ boolean access$000(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue() : isClickedIn1s(str);
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            setClicked(str);
        }
    }

    public static /* synthetic */ String access$200(Map map, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69b818b8", new Object[]{map, bundle}) : actualClick(map, bundle);
    }

    public static /* synthetic */ void access$300(String str, String str2, Map map, Map map2, String str3, Integer num, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf23be3f", new Object[]{str, str2, map, map2, str3, num, new Boolean(z), str4});
        } else {
            actrualPerformUTClick(str, str2, map, map2, str3, num, z, str4);
        }
    }

    static {
        kge.a(-1536042310);
        mClickMap = new LruCache<>(32);
    }

    public MarketingInnerNotificationAdapter(Context context, InnerPushVO innerPushVO) {
        super(context, innerPushVO);
        this.mPushUTArgs = null;
        this.mMsgId = null;
        this.mAgooId = null;
        this.inAppPushTemplateId = -1;
        this.stateNew = true;
        String string = innerPushVO.mParam.getString(AgooConstants.MESSAGE_BODY);
        this.extData = new HashMap();
        this.msgTypeId = innerPushVO.mParam.getString("msg_type_id");
        if (TextUtils.isEmpty(this.mVO.title)) {
            this.mVO.title = innerPushVO.mParam.getString("title");
        }
        if (TextUtils.isEmpty(this.mVO.content)) {
            this.mVO.content = innerPushVO.mParam.getString("text");
        }
        if (TextUtils.isEmpty(this.mVO.iconUrl)) {
            this.mVO.iconUrl = innerPushVO.mParam.getString("m-icon");
            if (TextUtils.isEmpty(this.mVO.iconUrl)) {
                this.mVO.iconUrl = innerPushVO.mParam.getString("avatar");
            }
        }
        if (TextUtils.isEmpty(this.mVO.img)) {
            this.mVO.img = innerPushVO.mParam.getString("img");
        }
        this.mMsgId = innerPushVO.mParam.getString("messageId");
        this.mAgooId = innerPushVO.mParam.getString("id");
        this.mTime = System.currentTimeMillis();
        try {
            this.agooJSONObject = JSONObject.parseObject(string);
            if (this.agooJSONObject != null && this.agooJSONObject.containsKey(Constants.KEY_EXTS)) {
                JSONObject jSONObject = this.agooJSONObject.getJSONObject(Constants.KEY_EXTS);
                if (jSONObject.containsKey(IN_APP_PUSH)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(IN_APP_PUSH);
                    if (jSONObject2.containsKey("inAppPushTemplateId")) {
                        this.inAppPushTemplateId = jSONObject2.getInteger("inAppPushTemplateId");
                    }
                    if (jSONObject2.containsKey("inAppPushTemplateData")) {
                        this.inAppPushTemplateData = jSONObject2.getJSONObject("inAppPushTemplateData");
                    }
                }
                if (jSONObject.containsKey(KEY_PUSHUTARGS)) {
                    this.mPushUTArgs = jSONObject.getString(KEY_PUSHUTARGS);
                    this.extData.put(KEY_PUSHUTARGS, this.mPushUTArgs);
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        onInitUT();
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        super.onError(i);
        if (i == -3) {
            onShowError(String.valueOf(i), " app isAppBackground");
        } else if (i == -2) {
            onShowError(String.valueOf(i), " msg page filter");
        } else if (i != -1) {
        } else {
            onShowError(String.valueOf(i), " user close setting");
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        if (this.inAppPushTemplateId.intValue() == -1 || this.inAppPushTemplateData == null) {
            TLog.loge(DynamicSimpleComponent.TAG, "inAppPushTemplateId == -1 || inAppPushTemplateData == null");
            return getOldView();
        }
        DXTemplateItem fetchDXTemplateItem = DXTemplateItemFetcher.fetchDXTemplateItem(this.inAppPushTemplateId.intValue());
        if (fetchDXTemplateItem != null && this.mContext.getApplicationContext() != null) {
            this.mDynamicComponent = new DynamicSimpleComponent(new DynamicSimpleProps(this.inAppPushTemplateId.intValue(), new DXTemplateVO(fetchDXTemplateItem, this.inAppPushTemplateData), this.mContext.getApplicationContext(), null));
            this.mDynamicComponent.mount();
            if (this.mDynamicComponent.render()) {
                this.stateNew = true;
                View uIView = this.mDynamicComponent.getUIView();
                uIView.setTag(R.id.inapppush_param, this.mVO.mParam);
                uIView.setTag(R.id.inapppush_msgId, this.mMsgId);
                uIView.setTag(R.id.inapppush_agooId, this.mAgooId);
                uIView.setTag(R.id.inapppush_templateid, this.inAppPushTemplateId);
                uIView.setTag(R.id.inapppush_msgTypeId, this.msgTypeId);
                uIView.setTag(R.id.inapppush_stateNew, Boolean.valueOf(this.stateNew));
                uIView.setTag(R.id.inapppush_extData, this.extData);
                TLog.loge(TAG, "stateNew render: " + this.mMsgId);
                if (mTapHandler == null) {
                    mTapHandler = new TapHandler();
                    TapEventHandlerProxy.INSTANCE.addHandler(IN_APP_PUSH, mTapHandler);
                }
                uIView.measure(0, 0);
                FrameLayout frameLayout = new FrameLayout(uIView.getContext());
                frameLayout.addView(uIView, new FrameLayout.LayoutParams(uIView.getMeasuredWidth(), uIView.getMeasuredHeight()));
                return frameLayout;
            }
            TLog.loge(DynamicSimpleComponent.TAG, "renderFail:" + this.inAppPushTemplateId);
            return getOldView();
        }
        TLog.loge(DynamicSimpleComponent.TAG, "mDXTemplateItem or context is null:" + this.inAppPushTemplateId);
        return getOldView();
    }

    private static boolean isClickedIn1s(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43ed9319", new Object[]{str})).booleanValue() : (str == null || (l = mClickMap.get(str)) == null || SystemClock.elapsedRealtime() - l.longValue() > 1000) ? false : true;
    }

    private static void setClicked(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2d0a36", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            mClickMap.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    private View getOldView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d21169bf", new Object[]{this});
        }
        this.stateNew = false;
        DefaultBannerView build = DefaultBannerView.build(this.mContext.getApplicationContext(), this.mVO.iconUrl, this.mVO.title, this.mVO.content, this.mTime, this.mVO.img);
        build.hideReplyView();
        return build.getView();
    }

    /* loaded from: classes7.dex */
    public static class TapHandler extends h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-32772495);
        }

        @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                return;
            }
            TLog.loge(DynamicSimpleComponent.TAG, "handleEvent");
            DXRootView s = dXRuntimeContext.s();
            if (s != null) {
                Object tag = s.getTag(R.id.inapppush_param);
                Object tag2 = s.getTag(R.id.inapppush_msgId);
                Object tag3 = s.getTag(R.id.inapppush_agooId);
                Object tag4 = s.getTag(R.id.inapppush_templateid);
                Object tag5 = s.getTag(R.id.inapppush_msgTypeId);
                Object tag6 = s.getTag(R.id.inapppush_stateNew);
                Object tag7 = s.getTag(R.id.inapppush_extData);
                if ((tag instanceof Bundle) && (tag4 instanceof Integer) && (tag5 instanceof String) && (tag6 instanceof Boolean) && (tag7 instanceof Map)) {
                    Map<String, Object> map = null;
                    String str = tag2 instanceof String ? (String) tag2 : null;
                    String str2 = tag3 instanceof String ? (String) tag3 : null;
                    if (MarketingInnerNotificationAdapter.access$000(str)) {
                        TLog.loge(DynamicSimpleComponent.TAG, "handleEvent isClickedIn1s return");
                        return;
                    }
                    Bundle bundle = (Bundle) tag;
                    Integer num = (Integer) tag4;
                    String str3 = (String) tag5;
                    Boolean bool = (Boolean) tag6;
                    Map map2 = (Map) tag7;
                    try {
                        map = JSON.parseObject(bundle.getString(AgooConstants.MESSAGE_BODY)).getInnerMap();
                    } catch (Throwable unused) {
                    }
                    HashMap hashMap = map == null ? new HashMap() : map;
                    if (objArr.length > 1 && (objArr[1] instanceof String) && !TextUtils.isEmpty((String) objArr[1])) {
                        Activity topActivity = EnvUtil.getTopActivity();
                        TLog.loge(DynamicSimpleComponent.TAG, "handleEvent nav with url: " + ((String) objArr[1]));
                        MarketingInnerNotificationAdapter.access$100(str);
                        if (topActivity != null) {
                            Nav.from(topActivity).toUri((String) objArr[1]);
                        } else {
                            Nav.from(EnvUtil.getApplication()).toUri((String) objArr[1]);
                        }
                        NotificationBannerHelper.instance().dismissPushBar();
                    } else {
                        TLog.loge(DynamicSimpleComponent.TAG, "handleEvent default click");
                        MarketingInnerNotificationAdapter.access$100(str);
                        MarketingInnerNotificationAdapter.access$200(hashMap, bundle);
                    }
                    MarketingInnerNotificationAdapter.access$300(str2, str, hashMap, map2, str3, num, bool.booleanValue(), bundle.getString("type"));
                    return;
                }
                TLog.loge(DynamicSimpleComponent.TAG, "handleEvent param not correct");
                return;
            }
            TLog.loge(DynamicSimpleComponent.TAG, "handleEvent rootView == null");
        }
    }

    public void onInitUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d813dff5", new Object[]{this});
        } else if (supposeToBeDynamic(this.inAppPushTemplateId.intValue())) {
            TBS.Ext.commitEvent("Page_Extend", 2201, "SendTaoMessage", "Type=" + getUTType(), "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround(), "templateId=" + this.inAppPushTemplateId);
        } else {
            TBS.Ext.commitEvent("Page_Extend", 2201, "SendTaoMessage", "Type=" + getUTType(), "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
        }
    }

    public void onShowUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7517022", new Object[]{this});
            return;
        }
        EnvUtil.UTShow(getUtArgs(), 1, null);
        TBS.Ext.commitEvent("Page_Extend", 2001, "ShowTaoMessage", "Type=" + getUTType(), "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        onShowUT();
        try {
            TaobaoRegister.exposureMessage(EnvUtil.getApplication(), getAgooId(this.mAgooId, this.mMsgId), getRegisterArgs());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.stateNew && isClickedIn1s(this.mMsgId)) {
            TLog.loge(DynamicSimpleComponent.TAG, "performClick isClickedIn1s return:" + this.mMsgId);
        } else {
            if (this.stateNew) {
                TLog.loge(DynamicSimpleComponent.TAG, "performClick makeup:" + this.mMsgId);
                AppMonitor.Alarm.commitFail("AgooNotification", "clickNotConsumed", "-1", "新状态触发老点击事件，且1秒前未触发DX点击事件");
            }
            setClicked(this.mMsgId);
            String str = null;
            actualClick(null, this.mVO.mParam);
            Map<String, Object> hashMap = new HashMap<>();
            JSONObject jSONObject = this.agooJSONObject;
            if (jSONObject != null && jSONObject.getInnerMap() != null) {
                hashMap = this.agooJSONObject.getInnerMap();
            }
            Map<String, Object> map = hashMap;
            String str2 = this.mAgooId;
            String str3 = this.mMsgId;
            Map<String, String> map2 = this.extData;
            String str4 = this.msgTypeId;
            Integer num = this.inAppPushTemplateId;
            boolean z = this.stateNew;
            if (this.mVO.mParam != null) {
                str = this.mVO.mParam.getString("type");
            }
            actrualPerformUTClick(str2, str3, map, map2, str4, num, z, str);
        }
    }

    private static String getRegisterArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab9c0c23", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("showLoc", "1");
        return JSON.toJSONString(hashMap);
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.onDismiss();
        try {
            TaobaoRegister.dismissMessage(this.mContext.getApplicationContext(), getAgooId(this.mAgooId, this.mMsgId), getRegisterArgs());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2101, "Page_Push_TBMSGPush_Dismiss", 1, null, EnvUtil.mapToArray(getUtArgs()));
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismissActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a5d4698", new Object[]{this});
            return;
        }
        super.onDismissActive();
        TBS.Ext.commitEvent(UTMini.PAGE_AGOO, 2101, "Page_Push_TBMSGPush_Cancel", 1, null, EnvUtil.mapToArray(getUtArgs()));
    }

    private HashMap<String, String> getUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("468dbbc", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        HashMap<String, String> createUTData = EnvUtil.createUTData("agoo^0^" + this.mMsgId, this.mMsgId, getImbaBizTypeVal(this.msgTypeId), "1", this.mVO.mParam != null ? this.mVO.mParam.getString("type") : null, null, hashMap);
        if (supposeToBeDynamic(this.inAppPushTemplateId.intValue())) {
            createUTData.put("templateId", String.valueOf(this.inAppPushTemplateId));
            createUTData.put("stateNew", String.valueOf(this.stateNew ? 1 : 0));
        }
        HashMap hashMap2 = new HashMap();
        String str = this.mPushUTArgs;
        if (str != null) {
            try {
                for (Map.Entry<String, Object> entry : JSON.parseObject(str).entrySet()) {
                    if (entry.getValue() instanceof String) {
                        hashMap2.put(entry.getKey(), (String) entry.getValue());
                    }
                }
                if (!hashMap2.isEmpty()) {
                    createUTData.putAll(hashMap2);
                }
            } catch (Throwable unused) {
            }
        }
        return createUTData;
    }

    private static void actrualPerformUTClick(String str, String str2, Map<String, Object> map, Map<String, String> map2, String str3, Integer num, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcf7a54", new Object[]{str, str2, map, map2, str3, num, new Boolean(z), str4});
            return;
        }
        TBS.Ext.commitEvent("Page_Extend", 2101, "ClickTaoMessage", "Type=" + getUTType(), "msgid=" + str2, "isBackground=" + EnvUtil.isAppBackGround());
        HashMap hashMap = new HashMap();
        if (supposeToBeDynamic(num.intValue())) {
            hashMap.put("templateId", String.valueOf(num));
            hashMap.put("stateNew", String.valueOf(z ? 1 : 0));
        }
        HashMap hashMap2 = new HashMap();
        Object obj = map.get(KEY_PUSHUTARGS);
        String str5 = null;
        if (obj instanceof String) {
            str5 = (String) obj;
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = map2.get(KEY_PUSHUTARGS);
        }
        if (str5 != null) {
            try {
                for (Map.Entry<String, Object> entry : JSON.parseObject(str5).entrySet()) {
                    if (entry.getValue() instanceof String) {
                        hashMap2.put(entry.getKey(), (String) entry.getValue());
                    }
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.putAll(hashMap2);
                }
            } catch (Throwable unused) {
            }
        }
        HashMap<String, String> createUTData = EnvUtil.createUTData("agoo^0^" + str2, str2, getImbaBizTypeVal(str3), "1", str4, null, hashMap);
        EnvUtil.UTClick(createUTData, 1, String.valueOf(map == null ? "" : map.get("url")));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(createUTData));
        try {
            TaobaoRegister.clickMessage(EnvUtil.getApplication(), getAgooId(str, str2), getRegisterArgs());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String getAgooId(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba8b588e", new Object[]{str, str2}) : (TextUtils.isEmpty(str) || !"1".equals(OrangeConfig.getInstance().getConfig("mpm_business_switch", "useNewClickId", "1"))) ? str2 : str;
    }

    private static String getImbaBizTypeVal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1445ee2", new Object[]{str});
        }
        if (TextUtils.equals(str, AccountMessageTypeIdValue.MESSAGE_TYPE_ID_WULIU)) {
            return RelationBizTypeValue.ACCOUNT_WULIU;
        }
        if (TextUtils.equals(str, "1002")) {
            return RelationBizTypeValue.ACCOUNT_TONGZHI;
        }
        if (TextUtils.equals(str, AccountMessageTypeIdValue.MESSAGE_TYPE_ID_HUDONG)) {
            return RelationBizTypeValue.ACCOUNT_HUDONG;
        }
        if (!TextUtils.equals(str, AccountMessageTypeIdValue.MESSAGE_TYPE_ID_YOUHUI)) {
            return null;
        }
        return RelationBizTypeValue.ACCOUNT_YOUHUI;
    }

    private static String actualClick(Map<String, Object> map, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8ef5990", new Object[]{map, bundle});
        }
        if (map == null) {
            try {
                map = JSON.parseObject(bundle.getString(AgooConstants.MESSAGE_BODY)).getInnerMap();
            } catch (Throwable unused) {
            }
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(KEY_PUSHUTARGS, true);
        bundle2.putString(KEY_PUSHUTARGS, String.valueOf(map.get(KEY_PUSHUTARGS)));
        Object obj = map.get(d.BUNDLE_BUSINESS_JUMP_URL);
        if (obj == null) {
            obj = map.get("url");
            try {
                bundle2.putString("notifyContentIntentBody", bundle.getString(AgooConstants.MESSAGE_BODY));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String obj2 = obj == null ? NavUrls.NAV_URL_MSG_CENTER_CATEGORY : obj.toString();
        TLog.loge(TAG, "performClick, url = " + obj2);
        Activity topActivity = EnvUtil.getTopActivity();
        String urlSplicingFromParam = ParseUtil.urlSplicingFromParam(obj2);
        if (topActivity != null) {
            Nav.from(topActivity).withExtras(bundle2).toUri(urlSplicingFromParam);
        } else {
            Nav.from(EnvUtil.getApplication()).withExtras(bundle2).toUri(urlSplicingFromParam);
        }
        return urlSplicingFromParam;
    }
}
