package com.ali.user.mobile;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.ali.user.mobile.app.LoginContext;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.service.UserTrackService;
import com.ali.user.mobile.utils.HarmonyUtils;
import com.ali.user.mobile.utils.LanguageUtil;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.session.SessionManager;
import com.taobao.login4android.thread.LoginThreadHelper;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import tb.apt;
import tb.kge;

/* loaded from: classes2.dex */
public class UserTraceImpl implements UserTrackService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.UserTraceImpl";
    private Handler handler = new Handler(Looper.getMainLooper());
    private Map<String, Long> durationMap = new ConcurrentHashMap();

    static {
        kge.a(-105584334);
        kge.a(885526455);
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ca14be", new Object[]{this, str, str2, properties});
        } else {
            sendUT(str, str2, null, properties);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUserTrack(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5264f72", new Object[]{this, str, str2, map});
        } else {
            sendUserTrack(str, str2, map, true);
        }
    }

    public void sendUserTrack(final String str, final String str2, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa451a2", new Object[]{this, str, str2, map, new Boolean(z)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (z && !UTAnalytics.getInstance().isInit()) {
                final HashMap hashMap = new HashMap();
                if (map != null) {
                    hashMap.putAll(map);
                    hashMap.put("time1", String.valueOf(currentTimeMillis));
                }
                this.handler.postDelayed(new Runnable() { // from class: com.ali.user.mobile.UserTraceImpl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            UserTraceImpl.this.sendUserTrack(str, str2, hashMap, false);
                        }
                    }
                }, 2000L);
                return;
            }
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
            if (!StringUtils.isEmpty(str)) {
                uTCustomHitBuilder.setEventPage(str);
            } else {
                uTCustomHitBuilder.setEventPage(UTConstant.PageName.UT_PAGE_EXTEND);
            }
            if (map != null) {
                uTCustomHitBuilder.setProperties(map);
            } else {
                map = new HashMap<>();
            }
            addExtra(map);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            StringBuilder sb = new StringBuilder();
            sb.append("utUserTrack,pageName=");
            sb.append(str);
            sb.append(",arg1=");
            sb.append(str2);
            sb.append(",args=");
            sb.append(map == null ? "null" : JSON.toJSONString(map));
            LoginTLogAdapter.e("login.UserTraceImpl", sb.toString());
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("login.UserTraceImpl", "utUserTrack: ", th);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5e742", new Object[]{this, str, str2});
        } else {
            sendUT(str, str2, null);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca72c74", new Object[]{this, str, properties});
        } else {
            sendUT(null, str, properties);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{this, str});
        } else {
            sendUT(null, str, null);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2, String str3, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6433e88", new Object[]{this, str, str2, str3, properties});
        } else {
            sendUT(str, str2, str3, null, properties);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendUT(String str, String str2, String str3, String str4, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9549d2", new Object[]{this, str, str2, str3, str4, properties});
        } else {
            sendUT(str, str2, str3, str4, properties, true);
        }
    }

    public void sendUT(final String str, final String str2, final String str3, final String str4, Properties properties, boolean z) {
        Properties properties2 = properties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a614a342", new Object[]{this, str, str2, str3, str4, properties2, new Boolean(z)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (z && !UTAnalytics.getInstance().isInit()) {
                final Properties properties3 = new Properties();
                if (properties2 != null) {
                    properties3.putAll(properties2);
                    properties3.put("time1", String.valueOf(currentTimeMillis));
                }
                this.handler.postDelayed(new Runnable() { // from class: com.ali.user.mobile.UserTraceImpl.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            UserTraceImpl.this.sendUT(StringUtils.isEmpty(str) ? UTConstant.PageName.UT_PAGE_EXTEND : str, str2, str3, str4, properties3, false);
                        }
                    }
                }, 2000L);
                return;
            }
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
            if (!StringUtils.isEmpty(str)) {
                uTCustomHitBuilder.setEventPage(str);
            } else {
                uTCustomHitBuilder.setEventPage(UTConstant.PageName.UT_PAGE_EXTEND);
            }
            if (!StringUtils.isEmpty(str3)) {
                uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, str3);
            }
            if (!StringUtils.isEmpty(str4)) {
                uTCustomHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str4);
            }
            if (properties2 == null) {
                properties2 = new Properties();
            }
            long duration = getDuration(str2);
            if (duration > 0) {
                properties2.setProperty("duration", String.valueOf(duration));
            }
            Map<String, String> a2 = apt.a(properties2);
            addExtra(a2);
            uTCustomHitBuilder.setProperties(a2);
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
            LoginTLogAdapter.e("login.UserTraceImpl", "utSend,pageName=" + str + ",arg1=" + str2 + ",arg2=" + str3 + ",arg3=" + str4);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("login.UserTraceImpl", "sendUT: ", th);
        }
    }

    private long getDuration(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e59f820f", new Object[]{this, str})).longValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0L;
        }
        if (!str.endsWith("_commit") && !str.endsWith("_success")) {
            return 0L;
        }
        int lastIndexOf = str.lastIndexOf("_");
        String substring = str.substring(0, lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        if (StringUtils.equals(substring2, "commit")) {
            this.durationMap.put(substring, Long.valueOf(System.currentTimeMillis()));
            return 0L;
        } else if (!StringUtils.equals(substring2, "success") || (l = this.durationMap.get(substring)) == null || l.longValue() <= 0) {
            return 0L;
        } else {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            this.durationMap.remove(substring);
            return currentTimeMillis;
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c9742f", new Object[]{this, str, str2});
        } else {
            sendControlUT(str, str2, "", null);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e19039", new Object[]{this, str, str2, str3});
        } else {
            sendControlUT(str, str2, str3, null);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d98b22c", new Object[]{this, str, str2, str3, map});
        } else {
            sendControlUT(str, str2, str3, "", map);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void sendControlUT(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431bf62", new Object[]{this, str, str2, str3, str4, map});
        } else {
            sendControlUT(str, str2, str3, str4, map, true);
        }
    }

    public void sendControlUT(final String str, final String str2, final String str3, final String str4, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8206dfb2", new Object[]{this, str, str2, str3, str4, map, new Boolean(z)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z && !UTAnalytics.getInstance().isInit()) {
            final HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
                hashMap.put("time1", String.valueOf(currentTimeMillis));
            }
            this.handler.postDelayed(new Runnable() { // from class: com.ali.user.mobile.UserTraceImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        UserTraceImpl.this.sendControlUT(str, str2, str3, str4, hashMap, false);
                    }
                }
            }, 2000L);
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, str2);
        if (!StringUtils.isEmpty(str3)) {
            uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG2, str3);
        }
        if (!StringUtils.isEmpty(str4)) {
            uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG3, str4);
        }
        if (map == null) {
            map = new HashMap<>();
        }
        addExtra(map);
        uTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void UIShown(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9467f8", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                addExtra(hashMap);
                UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, hashMap);
                uTOriginalCustomHitBuilder.setProperties(hashMap);
                UTAnalytics.getInstance().getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void addExtra(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21d33cf", new Object[]{this, map});
            return;
        }
        try {
            map.put("utdid_hash", String.valueOf(Math.abs(AppInfo.getInstance().getUtdid().hashCode()) % 10000));
            map.put(ApLinkTokenUtils.KEY_TRACE_ID, LoginContext.getTraceId());
            map.put("launch_times", String.valueOf(LoginContext.getLaunchTimes()));
            if (!StringUtils.isEmpty(LoginContext.loginUIType)) {
                map.put("loginUIType", LoginContext.loginUIType);
            }
            if (!StringUtils.isEmpty(LoginContext.mFrom)) {
                map.put("source", LoginContext.mFrom);
            }
            map.put("isMainThread", String.valueOf(LoginThreadHelper.isMainThread()));
            map.put("userId", SessionManager.getInstance(DataProviderFactory.getApplicationContext()).getOldUserId());
            if (!StringUtils.isEmpty(LoginStatus.loginTrackInfo)) {
                map.put("loginTrackInfo", LoginStatus.loginTrackInfo);
            }
            map.put("sdk_lang", LanguageUtil.getLanguage());
            map.put("sdk_locale", LanguageUtil.getCountry());
            map.put("deviceBrand", Build.BRAND);
            map.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
            map.put("manufacturer", Build.MANUFACTURER);
            map.put("osVersion", Build.VERSION.RELEASE);
            map.put("harmonyVersion", HarmonyUtils.getHarmonyVersion());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void skipPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3613c7", new Object[]{this, activity});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().skipPage(activity);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void pageDisAppear(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fccd8d", new Object[]{this, activity});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        }
    }

    @Override // com.ali.user.mobile.service.UserTrackService
    public void updatePageName(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d91b77f", new Object[]{this, activity, str, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(activity, str);
        try {
            Map<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap = map;
            }
            addExtra(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
