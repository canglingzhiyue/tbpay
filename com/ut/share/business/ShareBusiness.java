package com.ut.share.business;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.IInterface;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacyext.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.h;
import com.taobao.android.service.Services;
import com.taobao.android.share.resource.a;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.aidl.IShareBusiness;
import com.taobao.statistic.TBS;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.taobao.R;
import com.ut.share.ShareEnv;
import com.ut.share.business.ShareContent;
import com.ut.share.business.interf.IHasTaoPassword;
import com.ut.share.business.interf.ILog;
import com.ut.share.business.utils.ShareMemoryCache;
import com.ut.share.business.utils.ShareUTHelper;
import com.ut.share.utils.ShareUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.acg;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVITY_INFO_END_KEY = "activity_info_end";
    public static final String ACTIVITY_INFO_START_KEY = "activity_info_start";
    public static final String BIZ_CONFIG_END_KEY = "biz_config_end";
    public static final String BIZ_CONFIG_START_KEY = "biz_config_start";
    public static final String CC_LIST_END_KEY = "cc_list_end";
    public static final String CC_LIST_START_KEY = "cc_list_start";
    public static final String IS_GET_BIZ_CONFIG_BEFORE_ACTIVITY = "isGetBizConfigBeforeActivity";
    public static final String NATIVE_PUSH_KEY = "native_push";
    private static final String SHARE_CACHE_KEY = "tb_last_share_taopassword";
    public static final String SHARE_INTENT_EXTAR_ACTIVITY_PARAMS = "com.android.taobao.action.share.activity_params";
    public static final String SHARE_INTENT_EXTAR_BUSINESS_ID = "com.android.taobao.extra.share.businessId";
    public static final String SHARE_INTENT_EXTAR_CONTENTTYPE = "com.android.taobao.extra.share.contenttype";
    public static final String SHARE_INTENT_EXTAR_DESP = "com.android.taobao.action.share.description";
    public static final String SHARE_INTENT_EXTAR_DISABLE_CLIENT = "com.android.taobao.action.share.disableclient";
    public static final String SHARE_INTENT_EXTAR_DISABLE_HEAD_IMG = "com.android.taobao.action.share.disable_headimage";
    public static final String SHARE_INTENT_EXTAR_DISABLE_QRCODE = "com.android.taobao.action.share.disable_qrcode";
    public static final String SHARE_INTENT_EXTAR_DISABLE_TEXTINFO = "com.android.taobao.action.share.disable_textinfo";
    public static final String SHARE_INTENT_EXTAR_HEAD_URL = "com.android.taobao.action.share.headurl";
    public static final String SHARE_INTENT_EXTAR_IMAGE_URL = "com.android.taobao.action.share.image_url";
    public static final String SHARE_INTENT_EXTAR_MARK_MAP = "com.android.taobao.action.share.mark_map";
    public static final String SHARE_INTENT_EXTAR_MEDIAINFO = "com.android.taobao.action.share.mediaInfo";
    public static final String SHARE_INTENT_EXTAR_MEDIAPUBLISHER = "com.android.taobao.action.share.mediaPublisher";
    public static final String SHARE_INTENT_EXTAR_PARAMS = "com.android.taobao.action.share.extra_params";
    public static final String SHARE_INTENT_EXTAR_PHONE_NUMBER = "com.android.taobao.action.share.phone_numbers";
    public static final String SHARE_INTENT_EXTAR_POPTYPE = "com.android.taobao.action.share.pop_type";
    public static final String SHARE_INTENT_EXTAR_POPURL = "com.android.taobao.action.share.pop_url";
    public static final String SHARE_INTENT_EXTAR_QR_CONFIG = "com.android.taobao.action.share.qrconfig";
    public static final String SHARE_INTENT_EXTAR_SNAPSHOT_IMAGES = "com.android.taobao.action.share.snapshotimages";
    public static final String SHARE_INTENT_EXTAR_TEMPLATE_PARAMS = "com.android.taobao.action.share.templateParams";
    public static final String SHARE_INTENT_EXTAR_TITLE = "com.android.taobao.action.share.title";
    public static final String SHARE_INTENT_EXTAR_URL = "com.android.taobao.action.share.url";
    public static final String SHARE_INTENT_EXTAR_WEIXINTYPE = "com.android.taobao.action.share.weixinmsgtype";
    public static final String SHARE_INTENT_EXTAR_WEIXIN_APPID = "com.android.taobao.action.share.weixin.appid";
    public static final String SHARE_INTENT_EXTAR_WWMSGTYPE = "com.android.taobao.action.share.wwmsgtype";
    public static final String SHARE_INTENT_EXTRA_BUSINESS_INFO = "com.android.taobao.action.share.businessinfo";
    public static final String SHARE_INTENT_EXTRA_ISACTIVITY = "com.android.taobao.action.share.isactivity";
    public static final String SHARE_INTENT_EXTRA_MASK_ALPHA = "com.android.taobao.action.share.mask.alpha";
    public static final String SHARE_INTENT_EXTRA_QR_TIPS_TXT = "com.android.taobao.action.share.qr_tips_txt";
    public static final String SHARE_INTENT_EXTRA_SAVECONTENT = "com.android.taobao.action.share.needsavecontent";
    public static final String SHARE_INTENT_EXTRA_SMS_TEMPLATE = "com.android.taobao.action.share.sms_templte";
    public static final String SHARE_INTENT_EXTRA_TEMPLATE_ID = "com.android.taobao.action.share.templateid";
    private static final String SHARE_MODULE_NAME = "shareTaopassword";
    public static final String SHARE_START_KEY = "share_start";
    private static final String TAG = "ShareBusiness";
    public static final String WEEX_LOAD_END_KEY = "weex_load_end";
    public static final String WEEX_LOAD_START_KEY = "weex_load_start";
    public static final String WEEX_PULL_KEY = "weex_pull";
    public static final String WEEX_RENDER_END_KEY = "weex_render_end";
    public static final String WEEX_RENDER_START_KEY = "weex_render_start";
    private static ShareBusiness sInstance;
    public static long sShareStartTime;
    public static JSONObject sShareUTArgs;
    private IHasTaoPassword iHasTaoPassword;
    private ILog iLog;
    private ShareBusinessListener mShareBusinessListener;
    private WeakReference<Activity> weakActivity;

    static {
        kge.a(1706501538);
        sShareUTArgs = new JSONObject();
    }

    public static synchronized ShareBusiness getInstance() {
        synchronized (ShareBusiness.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShareBusiness) ipChange.ipc$dispatch("27dc03e1", new Object[0]);
            }
            if (sInstance == null) {
                sInstance = new ShareBusiness();
            }
            return sInstance;
        }
    }

    public ShareBusinessListener getShareListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareBusinessListener) ipChange.ipc$dispatch("8c1977f", new Object[]{this});
        }
        ShareBusinessListener shareBusinessListener = this.mShareBusinessListener;
        if (shareBusinessListener == null) {
            return null;
        }
        return shareBusinessListener;
    }

    public void setIHasTaoPassword(IHasTaoPassword iHasTaoPassword) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f973bc", new Object[]{this, iHasTaoPassword});
        } else {
            this.iHasTaoPassword = iHasTaoPassword;
        }
    }

    public void setILog(ILog iLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d0e89a", new Object[]{this, iLog});
        } else {
            this.iLog = iLog;
        }
    }

    public ILog getOrInstanceLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILog) ipChange.ipc$dispatch("ff43fe4b", new Object[]{this});
        }
        ILog iLog = this.iLog;
        return iLog != null ? iLog : new ILog() { // from class: com.ut.share.business.ShareBusiness.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ut.share.business.interf.ILog
            public void logr(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ccae41c9", new Object[]{this, str, str2});
                } else {
                    Log.e(str, str2);
                }
            }

            @Override // com.ut.share.business.interf.ILog
            public void logd(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1bebe7bb", new Object[]{this, str, str2});
                } else {
                    Log.e(str, str2);
                }
            }

            @Override // com.ut.share.business.interf.ILog
            public void loge(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a88c12bc", new Object[]{this, str, str2});
                } else {
                    Log.e(str, str2);
                }
            }
        };
    }

    public void setShareListener(ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c67d5493", new Object[]{this, shareBusinessListener});
        } else if (shareBusinessListener == null) {
        } else {
            this.mShareBusinessListener = shareBusinessListener;
        }
    }

    public Activity getShareActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fd743f29", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.weakActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static void share(Activity activity, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c027930", new Object[]{activity, shareContent});
            return;
        }
        a a2 = a.a();
        a2.b();
        a2.a(a.KEY_SHAREPANELSTART);
        getInstance().execute(activity, null, shareContent);
    }

    private static ShareContent translateShareContent(ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("90612d27", new Object[]{shareContent});
        }
        if (b.c() && !b.b() && shareContent != null) {
            if (shareContent.businessId != null) {
                if (!shareContent.businessId.contains("_" + b.d())) {
                    shareContent.businessId += "_" + b.d();
                }
            }
            m.b(TAG, "content.businessId is isI18n:" + shareContent.businessId);
            return shareContent;
        }
        m.b(TAG, " content.businessId:" + shareContent.businessId);
        return shareContent;
    }

    public boolean hasTaoPassword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6785886e", new Object[]{this})).booleanValue();
        }
        IHasTaoPassword iHasTaoPassword = this.iHasTaoPassword;
        if (iHasTaoPassword != null) {
            boolean hasTaoPassword = iHasTaoPassword.hasTaoPassword();
            ILog orInstanceLog = getOrInstanceLog();
            orInstanceLog.logd(TAG, "invoke ShareBusiness#hasTaoPassword, return" + hasTaoPassword);
            return hasTaoPassword;
        }
        getOrInstanceLog().loge(TAG, "invoke ShareBusiness#hasTaoPassword, IHasTaoPassword is Null, return false");
        return false;
    }

    public static void traceShareBtnExpose(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2232e6d7", new Object[]{str});
        } else {
            traceShareBtnExpose(str, null, null);
        }
    }

    public static void traceShareBtnClick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d3ae57", new Object[]{str});
        } else {
            traceShareBtnClick(str, null, null);
        }
    }

    public static void traceShareBtnExpose(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d87e3484", new Object[]{str, str2, map});
            return;
        }
        String jSONString = JSONObject.toJSONString(map);
        HashMap hashMap = new HashMap(4);
        if (str == null) {
            str = "default";
        }
        hashMap.put("bizType", str);
        if (str2 == null) {
            str2 = "default";
        }
        hashMap.put("location", str2);
        hashMap.put("ext", jSONString);
        ShareUTHelper.traceExpose("TB-Share_Button-InputExposure", hashMap);
    }

    public static void traceShareBtnClick(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf345d04", new Object[]{str, str2, map});
            return;
        }
        String jSONString = JSONObject.toJSONString(map);
        HashMap hashMap = new HashMap(4);
        if (str == null) {
            str = "default";
        }
        hashMap.put("bizType", str);
        if (str2 == null) {
            str2 = "default";
        }
        hashMap.put("location", str2);
        hashMap.put("ext", jSONString);
        ShareUTHelper.traceClick("TB-Share_Button-InputClick", hashMap);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.ut.share.business.ShareBusiness$2] */
    private void execute(final Activity activity, final List list, final ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e02aab7", new Object[]{this, activity, list, shareContent});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bizId=");
        String str = "";
        sb.append(shareContent == null ? str : shareContent.businessId);
        String sb2 = sb.toString();
        transformShareContent(shareContent);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("templateId=");
        if (shareContent != null) {
            str = shareContent.templateId;
        }
        sb3.append(str);
        TBS.Ext.commitEvent("Page_Extend", 19999, "ShowShareView", null, null, sb2, sb3.toString());
        if (activity == null || activity.getApplication() == null || activity.getBaseContext() == null) {
            m.e(TAG, "ShareBusiness.execute err return:activity is fake");
            return;
        }
        sShareStartTime = System.currentTimeMillis();
        sShareUTArgs.clear();
        sShareUTArgs.put(SHARE_START_KEY, (Object) Long.valueOf(sShareStartTime));
        this.weakActivity = new WeakReference<>(activity);
        TBS.Ext.commitEventBegin("ShareLoadTime", null);
        new AsyncTask<Void, Void, IShareBusiness>() { // from class: com.ut.share.business.ShareBusiness.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.AsyncTask
            public IShareBusiness doInBackground(Void... voidArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (IShareBusiness) ipChange2.ipc$dispatch("c85bdbfc", new Object[]{this, voidArr});
                }
                try {
                    return (IShareBusiness) Services.get(activity, (Class<IInterface>) IShareBusiness.class);
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(IShareBusiness iShareBusiness) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3cc0101a", new Object[]{this, iShareBusiness});
                } else if (iShareBusiness != null) {
                    try {
                        a a2 = a.a();
                        a2.a(a.KEY_SHAREPANELPARSESHARECONTENTSTART);
                        HashMap<String, String> parseShareContent = ShareBusiness.parseShareContent(shareContent);
                        ArrayList arrayList = new ArrayList();
                        if (list != null && list.size() > 0) {
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i) instanceof Integer) {
                                    arrayList.add(String.valueOf(list.get(i)));
                                } else if (list.get(i) instanceof String) {
                                    arrayList.add(list.get(i).toString());
                                }
                            }
                        }
                        a2.a(a.KEY_SHAREPANELPARSESHARECONTENTEND);
                        iShareBusiness.share(arrayList, JSON.toJSONString((Object) parseShareContent, true));
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.execute(new Void[0]);
    }

    public static HashMap<String, String> parseShareContent(ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e4bd3dcf", new Object[]{shareContent});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(SHARE_INTENT_EXTAR_BUSINESS_ID, shareContent.businessId);
        if (TextUtils.isEmpty(shareContent.contentType)) {
            shareContent.contentType = shareContent.shareScene;
        }
        hashMap.put(SHARE_INTENT_EXTAR_CONTENTTYPE, shareContent.contentType);
        hashMap.put(SHARE_INTENT_EXTAR_TITLE, shareContent.title);
        hashMap.put(SHARE_INTENT_EXTAR_DESP, shareContent.description);
        hashMap.put(SHARE_INTENT_EXTAR_IMAGE_URL, shareContent.imageUrl);
        hashMap.put(SHARE_INTENT_EXTAR_URL, shareContent.url);
        hashMap.put(SHARE_INTENT_EXTRA_TEMPLATE_ID, shareContent.templateId);
        hashMap.put(SHARE_INTENT_EXTAR_WEIXINTYPE, shareContent.weixinMsgType);
        hashMap.put(SHARE_INTENT_EXTRA_ISACTIVITY, shareContent.isActivity);
        hashMap.put(SHARE_INTENT_EXTRA_SAVECONTENT, shareContent.needSaveContent);
        hashMap.put(SHARE_INTENT_EXTAR_WEIXIN_APPID, shareContent.weixinAppId);
        hashMap.put(SHARE_INTENT_EXTAR_DISABLE_CLIENT, Boolean.toString(shareContent.disableBackToClient));
        if (shareContent.snapshotImages != null) {
            hashMap.put(SHARE_INTENT_EXTAR_SNAPSHOT_IMAGES, JSON.toJSONString(shareContent.snapshotImages));
        }
        if (shareContent.headUrl != null) {
            hashMap.put(SHARE_INTENT_EXTAR_HEAD_URL, shareContent.headUrl);
        }
        hashMap.put(SHARE_INTENT_EXTAR_DISABLE_QRCODE, Boolean.toString(shareContent.disableQrcode));
        hashMap.put(SHARE_INTENT_EXTAR_DISABLE_TEXTINFO, Boolean.toString(shareContent.disableTextInfo));
        hashMap.put(SHARE_INTENT_EXTAR_DISABLE_HEAD_IMG, Boolean.toString(shareContent.disableHeadUrl));
        if (shareContent.qrConfig != null) {
            hashMap.put(SHARE_INTENT_EXTAR_QR_CONFIG, JSON.toJSONString(shareContent.qrConfig));
        }
        if (shareContent.wwMsgType != null) {
            hashMap.put(SHARE_INTENT_EXTAR_WWMSGTYPE, shareContent.wwMsgType.getValue());
        } else {
            hashMap.put(SHARE_INTENT_EXTAR_WWMSGTYPE, WWMessageType.WWMessageTypeDefault.getValue());
        }
        if (shareContent.activityParams != null) {
            hashMap.put(SHARE_INTENT_EXTAR_ACTIVITY_PARAMS, JSON.toJSONString(shareContent.activityParams));
        }
        if (shareContent.templateParams != null) {
            hashMap.put(SHARE_INTENT_EXTAR_TEMPLATE_PARAMS, JSON.toJSONString(shareContent.templateParams));
        }
        if (shareContent.extendParams == null) {
            shareContent.extendParams = shareContent.extraParams;
        }
        if (shareContent.extendParams != null) {
            hashMap.put(SHARE_INTENT_EXTAR_PARAMS, JSON.toJSONString(shareContent.extendParams));
        }
        if (shareContent.businessInfo != null) {
            hashMap.put(SHARE_INTENT_EXTRA_BUSINESS_INFO, JSON.toJSONString(shareContent.businessInfo));
        }
        if (!TextUtils.isEmpty(shareContent.maskAlpha)) {
            hashMap.put(SHARE_INTENT_EXTRA_MASK_ALPHA, shareContent.maskAlpha);
        }
        if (shareContent.popType != ShareContent.TaoPasswordPopType.NONE && !TextUtils.isEmpty(shareContent.popUrl)) {
            hashMap.put(SHARE_INTENT_EXTAR_POPTYPE, shareContent.popType.name);
            hashMap.put(SHARE_INTENT_EXTAR_POPURL, shareContent.popUrl);
        }
        if (shareContent.phoneNumberList != null) {
            hashMap.put(SHARE_INTENT_EXTAR_PHONE_NUMBER, JSON.toJSONString(shareContent.phoneNumberList));
        }
        if (shareContent.markMap != null) {
            hashMap.put(SHARE_INTENT_EXTAR_MARK_MAP, JSON.toJSONString(shareContent.markMap));
        }
        if (!TextUtils.isEmpty(shareContent.smsTemplate)) {
            hashMap.put(SHARE_INTENT_EXTRA_SMS_TEMPLATE, shareContent.smsTemplate);
        }
        if (!TextUtils.isEmpty(shareContent.qrTipsText)) {
            hashMap.put(SHARE_INTENT_EXTRA_QR_TIPS_TXT, shareContent.qrTipsText);
        }
        if (shareContent.mediaPublisher != null) {
            hashMap.put(SHARE_INTENT_EXTAR_MEDIAPUBLISHER, JSON.toJSONString(shareContent.mediaPublisher));
        }
        if (shareContent.mediaInfo != null) {
            hashMap.put(SHARE_INTENT_EXTAR_MEDIAINFO, JSON.toJSONString(shareContent.mediaInfo));
        }
        return hashMap;
    }

    public static void share(Activity activity, ArrayList<String> arrayList, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88a0996a", new Object[]{activity, arrayList, shareContent});
        } else {
            getInstance().execute(activity, arrayList, shareContent);
        }
    }

    public static void share(Activity activity, ShareContent shareContent, ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6975d6db", new Object[]{activity, shareContent, shareBusinessListener});
            return;
        }
        getInstance().setShareListener(shareBusinessListener);
        getInstance().execute(activity, null, shareContent);
    }

    public static void share(Activity activity, ArrayList<String> arrayList, ShareContent shareContent, ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec61cce1", new Object[]{activity, arrayList, shareContent, shareBusinessListener});
            return;
        }
        getInstance().setShareListener(shareBusinessListener);
        getInstance().execute(activity, arrayList, shareContent);
    }

    @Deprecated
    public static void share(Activity activity, String str, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eba87fa", new Object[]{activity, str, shareContent});
        } else {
            getInstance().execute(activity, null, shareContent);
        }
    }

    @Deprecated
    public static void showPreviewAndShare(Activity activity, String str, ArrayList<Integer> arrayList, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21211cc", new Object[]{activity, str, arrayList, shareContent});
        } else {
            getInstance().execute(activity, arrayList, shareContent);
        }
    }

    @Deprecated
    public static void share(Activity activity, String str, ArrayList<Integer> arrayList, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea28ce0", new Object[]{activity, str, arrayList, shareContent});
        } else {
            getInstance().execute(activity, arrayList, shareContent);
        }
    }

    @Deprecated
    public static void share(Activity activity, String str, ShareContent shareContent, ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53d24851", new Object[]{activity, str, shareContent, shareBusinessListener});
        } else {
            share(activity, str, null, shareContent, shareBusinessListener);
        }
    }

    @Deprecated
    public static void share(Activity activity, String str, ArrayList<Integer> arrayList, ShareContent shareContent, ShareBusinessListener shareBusinessListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8a012b", new Object[]{activity, str, arrayList, shareContent, shareBusinessListener});
            return;
        }
        getInstance().setShareListener(shareBusinessListener);
        getInstance().execute(activity, arrayList, shareContent);
    }

    @Deprecated
    public static void shareFeedDetail(Activity activity, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62dc1ea3", new Object[]{activity, str, str2, str3, str4, str5, str6});
            return;
        }
        if (str2 != null || str3 != null) {
            str7 = "【" + str3 + b.a(R.string.taobao_app_1010_1_18148) + str2 + b.a(R.string.taobao_app_1010_1_18144);
        } else {
            str7 = b.a(R.string.taobao_app_1010_1_18145);
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "3";
        shareContent.title = b.a(R.string.taobao_app_1010_1_18147);
        shareContent.description = str7;
        shareContent.imageUrl = str6;
        shareContent.imageSoure = null;
        shareContent.shareScene = ImageStrategyConfig.WEITAO;
        shareContent.url = str5;
        shareContent.wwMsgType = WWMessageType.WWMessageTypeWeitao;
        getInstance().execute(activity, null, shareContent);
    }

    @Deprecated
    public static void shareShop(Activity activity, String str, String str2, String str3, Bitmap bitmap, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4dd7896", new Object[]{activity, str, str2, str3, bitmap, str4, str5});
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.title = b.a(R.string.taobao_app_1010_1_18146);
        shareContent.businessId = "2";
        shareContent.description = str2;
        shareContent.imageUrl = str5;
        shareContent.imageSoure = null;
        shareContent.shareScene = "shop";
        shareContent.url = str3;
        shareContent.wwMsgType = WWMessageType.WWMessageTypeShop;
        getInstance().execute(activity, null, shareContent);
    }

    @Deprecated
    public static void shareScratchCard(Activity activity, String str, String str2, String str3, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e77e0ec", new Object[]{activity, str, str2, str3, bitmap});
            return;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.title = b.a(R.string.taobao_app_1010_1_18149);
        shareContent.businessId = "11";
        shareContent.description = str2;
        shareContent.imageUrl = null;
        shareContent.imageSoure = bitmap;
        shareContent.shareScene = "other";
        shareContent.url = str3;
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDefault;
        getInstance().execute(activity, null, shareContent);
    }

    public void targetSelectedNotify(ShareContent shareContent, ShareTargetType shareTargetType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a69fc660", new Object[]{this, shareContent, shareTargetType});
            return;
        }
        ShareBusinessListener shareBusinessListener = this.mShareBusinessListener;
        if (shareBusinessListener == null) {
            return;
        }
        shareBusinessListener.onShare(shareContent, shareTargetType);
    }

    public void onShareFinished(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef6090c", new Object[]{this, map});
            return;
        }
        ShareBusinessListener shareBusinessListener = this.mShareBusinessListener;
        if (shareBusinessListener == null) {
            return;
        }
        shareBusinessListener.onFinished(map);
    }

    public void onSharePanelClosed(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8246aaee", new Object[]{this, map});
            return;
        }
        ShareBusinessListener shareBusinessListener = this.mShareBusinessListener;
        if (shareBusinessListener != null) {
            shareBusinessListener.onFinished(map);
        }
        this.mShareBusinessListener = null;
    }

    public String generateShareId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("350325f4", new Object[]{this}) : UUID.randomUUID().toString();
    }

    public boolean cacheLastShareContent(Context context, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("516cb76b", new Object[]{this, context, shareContent})).booleanValue();
        }
        if (shareContent == null) {
            return false;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putString("tb_last_share_content", shareContent.businessId + "," + shareContent.title + "," + shareContent.description + "," + shareContent.url + "," + shareContent.imageUrl + "," + shareContent.shareScene + ",");
        edit.commit();
        return true;
    }

    public ShareContent getLastShareContent(Context context) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("4b6bf513", new Object[]{this, context});
        }
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("tb_last_share_content", null);
        if (TextUtils.isEmpty(string) || (split = string.split(",")) == null || split.length < 6) {
            return null;
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = split[0];
        shareContent.title = split[1];
        shareContent.description = split[2];
        shareContent.url = split[3];
        shareContent.imageUrl = split[4];
        shareContent.shareScene = split[5];
        return shareContent;
    }

    private static h getSQLiteCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("af829d10", new Object[0]);
        }
        com.taobao.alivfssdk.cache.b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(SHARE_MODULE_NAME);
        if (cacheForModule != null) {
            return cacheForModule.b();
        }
        return null;
    }

    public static boolean putCacheTaopassword(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e771b9f", new Object[]{str})).booleanValue();
        }
        try {
            h sQLiteCache = getSQLiteCache();
            if (sQLiteCache != null) {
                return sQLiteCache.a(SHARE_CACHE_KEY, (Object) str);
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static String getCacheTaopassword() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b76d18c8", new Object[0]);
        }
        h sQLiteCache = getSQLiteCache();
        if (sQLiteCache != null) {
            return (String) sQLiteCache.b(SHARE_CACHE_KEY);
        }
        return null;
    }

    @Deprecated
    public static void updateLatestTaopassword(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998e949e", new Object[]{context, str});
        } else {
            putCacheTaopassword(str);
        }
    }

    @Deprecated
    public static boolean isMySelfLatestTaopassword(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b79ea0bb", new Object[]{context, str})).booleanValue();
        }
        String cacheTaopassword = getCacheTaopassword();
        putCacheTaopassword("");
        return !TextUtils.isEmpty(cacheTaopassword) && cacheTaopassword.equals(str);
    }

    @Deprecated
    public static String getTaopassword(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6e6f2866", new Object[]{context}) : getCacheTaopassword();
    }

    public static String getCacheTaoPassword(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f76df6d0", new Object[]{context});
        }
        String string = context.getSharedPreferences(ShareConstants.SP_SHARE, 0).getString(ShareConstants.KEY_TAO_PASSWORD, "");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (!TextUtils.equals(isFetchClipboardEnable() ? c.a(context) : null, string)) {
            return null;
        }
        clearPrimaryClip(clipboardManager);
        return string;
    }

    private static boolean isFetchClipboardEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8cafcf4", new Object[0])).booleanValue();
        }
        try {
            if ("212200".equals(acg.a().getString(acg.a().getResources().getIdentifier("ttid", "string", "com.taobao.taobao")))) {
                return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "gpFetchClipboardEnable", "false"));
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static void clearPrimaryClip(ClipboardManager clipboardManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("547170ee", new Object[]{clipboardManager});
            return;
        }
        try {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, ""));
        } catch (Exception unused) {
            Log.e("setPrimaryClip", "clear clip failed");
        }
    }

    public static Application getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5749e470", new Object[0]) : ShareEnv.getApplication();
    }

    private void transformShareContent(ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49b621a5", new Object[]{this, shareContent});
            return;
        }
        String str = null;
        String str2 = shareContent == null ? null : shareContent.url;
        if (shareContent != null) {
            str = shareContent.businessId;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return;
        }
        translateShareContent(shareContent);
        Map map = (Map) ShareMemoryCache.getValidData(str);
        ShareMemoryCache.remove(str);
        if (map == null) {
            return;
        }
        shareContent.url = ShareUtils.appendQueryInOverrideMode(str2, map);
    }
}
