package com.taobao.statistic;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.alibaba.analytics.core.model.LogField;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.internal.f;
import com.ut.mini.j;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;
import tb.apr;
import tb.apt;
import tb.aqc;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class TBS {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class CrashHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes8.dex */
        public interface OnCrashCaughtListener {
            Arg OnCrashCaught(Thread thread, Throwable th, Arg arg);
        }

        /* loaded from: classes8.dex */
        public interface OnDaemonThreadCrashCaughtListener {
            void OnDaemonThreadCrashCaught(Thread thread);
        }

        static {
            kge.a(-1914111052);
        }

        @Deprecated
        public static void disableEffect() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22228aa0", new Object[0]);
            }
        }

        @Deprecated
        public static void removeDaemonCrashCaughtListener(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8623ece0", new Object[]{str});
            }
        }

        @Deprecated
        public static void setContinueWhenDaemonThreadUncaughException() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2997488", new Object[0]);
            }
        }

        @Deprecated
        public static void setOnCrashCaughtListener(OnCrashCaughtListener onCrashCaughtListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc4c9e3c", new Object[]{onCrashCaughtListener});
            }
        }

        @Deprecated
        public static void setOnDaemonCrashCaughtListener(OnDaemonThreadCrashCaughtListener onDaemonThreadCrashCaughtListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9de4eee", new Object[]{onDaemonThreadCrashCaughtListener});
            }
        }

        @Deprecated
        public static void setOnDaemonCrashCaughtListener(String str, OnDaemonThreadCrashCaughtListener onDaemonThreadCrashCaughtListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a6314a4", new Object[]{str, onDaemonThreadCrashCaughtListener});
            }
        }

        @Deprecated
        public static void setSubmitToSystemFlag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b6f3d7", new Object[0]);
            }
        }

        @Deprecated
        public static void setToastStyle(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("898de6da", new Object[]{new Integer(i), str});
            }
        }

        @Deprecated
        public static void turnOff() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd39e339", new Object[0]);
            }
        }

        @Deprecated
        public static void withRestart(Activity activity, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f785da2", new Object[]{activity, new Integer(i), new Integer(i2)});
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class Network {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1843984003);
        }

        @Deprecated
        public static void download(String str, String str2, long j, long j2, String str3, String str4, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c8fd3bd", new Object[]{str, str2, new Long(j), new Long(j2), str3, str4, new Boolean(z)});
            }
        }

        @Deprecated
        public static void download(String str, String str2, long j, long j2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c82e0d1", new Object[]{str, str2, new Long(j), new Long(j2), new Boolean(z)});
            }
        }

        @Deprecated
        public static void pushArrive(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("346cde62", new Object[]{str});
            }
        }

        @Deprecated
        public static void pushDisplay(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ddf04d9", new Object[]{str});
            }
        }

        @Deprecated
        public static void pushView(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b3bfa30", new Object[]{str});
            }
        }

        @Deprecated
        public static void searchKeyword(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83faf03c", new Object[]{str, str2});
            }
        }

        @Deprecated
        public static void updateUTCookie(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3bbbaa8", new Object[]{str, map});
            }
        }

        @Deprecated
        public static void updateUTSIDToCookie(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a888636", new Object[]{str});
            }
        }

        @Deprecated
        public static void weiboShare(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c59a22f2", new Object[]{str, str2});
            }
        }
    }

    @Deprecated
    /* loaded from: classes8.dex */
    public interface OnInitFinishListener {
        void onFinish(int i);
    }

    static {
        kge.a(83462931);
    }

    @Deprecated
    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        }
    }

    @Deprecated
    public static void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{str});
        }
    }

    @Deprecated
    public static void setEnvironment(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbed3e70", new Object[]{context});
        }
    }

    @Deprecated
    public static void setEnvironment(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba9ac3a", new Object[]{context, str});
        }
    }

    @Deprecated
    public static void setKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c29617b8", new Object[]{str, str2});
        }
    }

    @Deprecated
    public static void setVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e718c27", new Object[]{str});
        }
    }

    @Deprecated
    public static void swithFromSimplePipeLineToCommon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a43d370", new Object[]{new Boolean(z)});
        }
    }

    @Deprecated
    public static void trade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed848f5", new Object[]{str});
        }
    }

    @Deprecated
    public static void turnDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4884955d", new Object[0]);
        }
    }

    @Deprecated
    public static void turnOnSecuritySDKSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77135f8", new Object[0]);
        }
    }

    @Deprecated
    public static void uninit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae64730", new Object[0]);
        }
    }

    /* loaded from: classes8.dex */
    public static class DelayEventObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long mTimestamp = 0;
        private Properties mProperties = null;
        private String mBeginOrEnd = "begin";

        static {
            kge.a(-1659228537);
        }

        public void setTimestamp(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77bcccc9", new Object[]{this, new Long(j)});
            } else {
                this.mTimestamp = j;
            }
        }

        public long getTimestamp() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue() : this.mTimestamp;
        }

        public void setProperties(Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("491d8b38", new Object[]{this, properties});
            } else {
                this.mProperties = properties;
            }
        }

        public Properties getProperties() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Properties) ipChange.ipc$dispatch("c96041a2", new Object[]{this}) : this.mProperties;
        }

        public void setBegin() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bbcb26e", new Object[]{this});
            } else {
                this.mBeginOrEnd = "begin";
            }
        }

        public void setEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("515fb120", new Object[]{this});
            } else {
                this.mBeginOrEnd = "end";
            }
        }

        public boolean isBegin() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638c2aa", new Object[]{this})).booleanValue() : this.mBeginOrEnd.equals("begin");
        }
    }

    public static void updateUserAccount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a7f52a", new Object[]{str});
        } else {
            UTAnalytics.getInstance().updateUserAccount(str, null);
        }
    }

    public static void updateUserAccount(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("782de874", new Object[]{str, str2});
        } else {
            UTAnalytics.getInstance().updateUserAccount(str, str2);
        }
    }

    public static void updateGPSInfo(String str, double d, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c42e080", new Object[]{str, new Double(d), new Double(d2)});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 1005, "" + d, "" + d2, null, null).build());
    }

    public static void updateSessionProperties(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8895f2e3", new Object[]{properties});
        } else {
            UTAnalytics.getInstance().updateSessionProperties(apt.a(properties));
        }
    }

    public static void updateNextPageProperties(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d96261", new Object[]{properties});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(apt.a(properties));
        }
    }

    public static void userRegister(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74607f9f", new Object[]{str});
        } else {
            UTAnalytics.getInstance().userRegister(str);
        }
    }

    /* loaded from: classes.dex */
    public static class Ext {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String PAGE_EXTEND = "Page_Extend";
        private static Object lCommitEventLockObj;
        private static HashMap<String, DelayEventObject> mDelayEventObject;

        public static /* synthetic */ String access$000(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5fe98958", new Object[]{strArr}) : _convertStringAToKVSString(strArr);
        }

        public static void commitEvent(String str, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a814df0", new Object[]{str, properties});
            } else if (aqc.e(str)) {
            } else {
                UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str);
                uTCustomHitBuilder.setProperties(apt.a(properties));
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                if (defaultTracker != null) {
                    defaultTracker.send(uTCustomHitBuilder.build());
                } else {
                    apr.c("TBS", "please call UTAnalytics.getInstance().setAppApplicationInstance() before this method");
                }
            }
        }

        static {
            kge.a(-2007418640);
            mDelayEventObject = new HashMap<>();
            lCommitEventLockObj = new Object();
        }

        public static void commitEventBegin(String str, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63f1b493", new Object[]{str, properties});
            } else if (aqc.e(str)) {
            } else {
                synchronized (lCommitEventLockObj) {
                    if (mDelayEventObject.size() > 2000) {
                        mDelayEventObject.clear();
                    }
                    if (mDelayEventObject.containsKey(str)) {
                        mDelayEventObject.remove(str);
                    }
                    DelayEventObject delayEventObject = new DelayEventObject();
                    delayEventObject.setTimestamp(System.currentTimeMillis());
                    delayEventObject.setProperties(properties);
                    delayEventObject.setBegin();
                    mDelayEventObject.put(str, delayEventObject);
                }
            }
        }

        public static void commitEventEnd(String str, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("922ec505", new Object[]{str, properties});
            } else if (aqc.e(str)) {
            } else {
                synchronized (lCommitEventLockObj) {
                    if (mDelayEventObject.containsKey(str)) {
                        DelayEventObject delayEventObject = mDelayEventObject.get(str);
                        mDelayEventObject.remove(str);
                        if (delayEventObject != null && delayEventObject.isBegin()) {
                            Properties properties2 = delayEventObject.getProperties();
                            HashMap hashMap = new HashMap();
                            if (properties2 != null) {
                                hashMap.putAll(apt.a(properties2));
                            }
                            if (properties != null) {
                                hashMap.putAll(apt.a(properties));
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(LogField.EVENTID.toString(), "19999");
                            hashMap2.put(LogField.ARG1.toString(), str);
                            String logField = LogField.ARG3.toString();
                            hashMap2.put(logField, "" + (System.currentTimeMillis() - delayEventObject.getTimestamp()));
                            hashMap2.putAll(hashMap);
                            hashMap2.put("_bmbu", Constants.VAL_YES);
                            UTAnalytics.getInstance().getDefaultTracker().send(hashMap2);
                        }
                    }
                }
            }
        }

        public static void commitEvent(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26f69f8f", new Object[]{str, new Integer(i)});
            } else {
                commitEvent(str, i, null, null, null, null);
            }
        }

        public static void commitEvent(String str, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f9d69ab", new Object[]{str, new Integer(i), obj});
            } else {
                commitEvent(str, i, obj, null, null, null);
            }
        }

        public static void commitEvent(String str, int i, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a8864c7", new Object[]{str, new Integer(i), obj, obj2});
            } else {
                commitEvent(str, i, obj, obj2, null, null);
            }
        }

        public static void commitEvent(String str, int i, Object obj, Object obj2, Object obj3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b6d50e3", new Object[]{str, new Integer(i), obj, obj2, obj3});
            } else {
                commitEvent(str, i, obj, obj2, obj3, null);
            }
        }

        private static String _convertStringAToKVSString(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6c16f9ea", new Object[]{strArr});
            }
            if (strArr != null && strArr.length == 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr != null && strArr.length > 0) {
                boolean z = false;
                for (int i = 0; i < strArr.length; i++) {
                    if (!aqc.e(strArr[i])) {
                        if (z) {
                            stringBuffer.append(",");
                        }
                        stringBuffer.append(strArr[i]);
                        z = true;
                    }
                }
            }
            return stringBuffer.toString();
        }

        public static void commitEvent(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b610b5c", new Object[]{str, new Integer(i), obj, obj2, obj3, strArr});
                return;
            }
            String _convertStringAToKVSString = _convertStringAToKVSString(strArr);
            HashMap hashMap = new HashMap();
            hashMap.put(LogField.PAGE.toString(), str);
            String logField = LogField.EVENTID.toString();
            hashMap.put(logField, "" + i);
            hashMap.put(LogField.ARG1.toString(), aqc.a(obj));
            hashMap.put(LogField.ARG2.toString(), aqc.a(obj2));
            hashMap.put(LogField.ARG3.toString(), aqc.a(obj3));
            if (_convertStringAToKVSString != null) {
                hashMap.put(LogField.ARGS.toString(), _convertStringAToKVSString);
            }
            hashMap.put("_bmbu", Constants.VAL_YES);
            hashMap.put("ut_tbs", "1");
            UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
        }

        public static void commitEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38eac999", new Object[]{new Integer(i)});
            } else {
                commitEvent(PAGE_EXTEND, i, null, null, null, null);
            }
        }

        public static void commitEvent(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7942e535", new Object[]{new Integer(i), obj});
            } else {
                commitEvent(PAGE_EXTEND, i, obj, null, null, null);
            }
        }

        public static void commitEvent(int i, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fbdd1d1", new Object[]{new Integer(i), obj, obj2});
            } else {
                commitEvent(PAGE_EXTEND, i, obj, obj2, null, null);
            }
        }

        public static void commitEvent(int i, Object obj, Object obj2, Object obj3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41a94f6d", new Object[]{new Integer(i), obj, obj2, obj3});
            } else {
                commitEvent(PAGE_EXTEND, i, obj, obj2, obj3, null);
            }
        }

        public static void commitEvent(int i, Object obj, Object obj2, Object obj3, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d35dc92", new Object[]{new Integer(i), obj, obj2, obj3, strArr});
            } else {
                commitEvent(PAGE_EXTEND, i, obj, obj2, obj3, strArr);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class Page {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2100130400);
        }

        @Deprecated
        public static void create(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c51bb68d", new Object[]{str});
            }
        }

        @Deprecated
        public static void create(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf773717", new Object[]{str, str2});
            }
        }

        @Deprecated
        public static void destroy(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c60d430b", new Object[]{str});
            }
        }

        @Deprecated
        public static void enter(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bcf0f69", new Object[]{str});
            }
        }

        @Deprecated
        public static void enterWithPageName(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("842801b3", new Object[]{str, str2});
            }
        }

        @Deprecated
        public static void goBack() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("156bc6f6", new Object[0]);
            }
        }

        @Deprecated
        public static void leave(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44629608", new Object[]{str});
            }
        }

        @Deprecated
        public static void updatePageName(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("317ed8be", new Object[]{str, str2});
            }
        }

        @Deprecated
        public static void updatePageProperties(String str, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44ca0498", new Object[]{str, properties});
            }
        }

        public static /* synthetic */ void access$100(String str, int i, CT ct, String str2, int i2, String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b6c0143", new Object[]{str, new Integer(i), ct, str2, new Integer(i2), strArr});
            } else {
                _commitCtrlEvent(str, i, ct, str2, i2, strArr);
            }
        }

        public static void ctrlClicked(CT ct, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13a86f45", new Object[]{ct, str});
            } else {
                _commitCtrlEvent(null, 2101, ct, str, 0, new String[0]);
            }
        }

        private static String _getCurPageName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3edeb1d6", new Object[0]);
            }
            String currentPageName = l.getInstance().getCurrentPageName();
            if (currentPageName == null || currentPageName.startsWith("Page_")) {
                return currentPageName;
            }
            return "Page_" + currentPageName;
        }

        private static String _calPageName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c22da426", new Object[]{str});
            }
            if (str == null || str.startsWith("Page_")) {
                return str;
            }
            return "Page_" + str;
        }

        private static String _calControlName(String str, CT ct, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("38283e82", new Object[]{str, ct, str2});
            }
            if (str == null || str2 == null) {
                return null;
            }
            if (!str.startsWith("Page_")) {
                str = "Page_" + str;
            }
            return str + "_" + ct.toString() + "-" + str2;
        }

        private static void _commitCtrlEvent(String str, int i, CT ct, String str2, int i2, String... strArr) {
            String _calPageName;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b09b71cb", new Object[]{str, new Integer(i), ct, str2, new Integer(i2), strArr});
                return;
            }
            if (str == null) {
                _calPageName = _getCurPageName();
            } else {
                _calPageName = _calPageName(str);
            }
            if (aqc.e(_calPageName)) {
                return;
            }
            String _calControlName = _calControlName(_calPageName, ct, str2);
            if (aqc.e(_calControlName)) {
                return;
            }
            String access$000 = Ext.access$000(strArr);
            HashMap hashMap = new HashMap();
            hashMap.put(LogField.PAGE.toString(), _calPageName);
            String logField = LogField.EVENTID.toString();
            hashMap.put(logField, "" + i);
            hashMap.put(LogField.ARG1.toString(), _calControlName);
            hashMap.put("_bmbu", Constants.VAL_YES);
            hashMap.put("ut_tbs", "1");
            if (i == 2102) {
                String logField2 = LogField.ARG3.toString();
                hashMap.put(logField2, "" + i2);
            }
            if (access$000 != null) {
                hashMap.put(LogField.ARGS.toString(), access$000);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(hashMap);
        }

        public static void buttonClicked(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85a85166", new Object[]{str});
            } else {
                ctrlClicked(CT.Button, str);
            }
        }

        public static void ctrlLongClicked(CT ct, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66cd0f61", new Object[]{ct, str});
            } else {
                _commitCtrlEvent(null, 2103, ct, str, 0, new String[0]);
            }
        }

        public static void itemSelected(CT ct, String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("811ce7f0", new Object[]{ct, str, new Integer(i)});
            } else {
                _commitCtrlEvent(null, 2102, ct, str, i, new String[0]);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class Adv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2007423102);
        }

        @Deprecated
        public static void destroy(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4515834", new Object[]{str, strArr});
            }
        }

        @Deprecated
        public static void easyTraceEnter(String str, boolean z, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af9d5dd1", new Object[]{str, new Boolean(z), strArr});
            }
        }

        @Deprecated
        public static void easyTraceInternalCtrlClick(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bce52d87", new Object[]{str, str2, strArr});
            }
        }

        @Deprecated
        public static void easyTraceLeave(String str, boolean z, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34325ef0", new Object[]{str, new Boolean(z), strArr});
            }
        }

        @Deprecated
        public static void enter(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b130c316", new Object[]{str, strArr});
            }
        }

        @Deprecated
        public static void enterWithPageName(String str, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b46888c", new Object[]{str, str2, strArr});
            }
        }

        @Deprecated
        public static void keepKvs(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7035b7ab", new Object[]{str, strArr});
            }
        }

        @Deprecated
        public static void leave(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b577a217", new Object[]{str, strArr});
            }
        }

        @Deprecated
        public static void onCaughException(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85841e98", new Object[]{th});
            }
        }

        @Deprecated
        public static void putKvs(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24b1e206", new Object[]{str, obj});
            }
        }

        @Deprecated
        public static void turnOffLogFriendly() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0e3e704", new Object[0]);
            }
        }

        @Deprecated
        public static void unKeepKvs(String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("768a9464", new Object[]{str, strArr});
            }
        }

        @Deprecated
        public void forceUpload() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("131fa753", new Object[]{this});
            }
        }

        public static void ctrlClicked(String str, CT ct, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79748744", new Object[]{str, ct, str2, strArr});
            } else {
                Page.access$100(str, 2101, ct, str2, 0, strArr);
            }
        }

        @Deprecated
        public static String getUtsid() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f70c80", new Object[0]) : f.getInstance().getUtsid();
        }

        public static void ctrlClicked(CT ct, String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae593dba", new Object[]{ct, str, strArr});
            } else {
                Page.access$100(null, 2101, ct, str, 0, strArr);
            }
        }

        public static void ctrlClickedOnPage(String str, CT ct, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bed1a072", new Object[]{str, ct, str2, strArr});
            } else {
                Page.access$100(str, 2101, ct, str2, 0, strArr);
            }
        }

        public static void ctrlLongClicked(String str, CT ct, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53bd08a8", new Object[]{str, ct, str2, strArr});
            } else {
                Page.access$100(str, 2103, ct, str2, 0, strArr);
            }
        }

        public static void ctrlLongClicked(CT ct, String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c64101e", new Object[]{ct, str, strArr});
            } else {
                Page.access$100(null, 2103, ct, str, 0, strArr);
            }
        }

        public static void ctrlLongClickedOnPage(String str, CT ct, String str2, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70e486d6", new Object[]{str, ct, str2, strArr});
            } else {
                Page.access$100(str, 2103, ct, str2, 0, strArr);
            }
        }

        public static void itemSelected(String str, CT ct, String str2, int i, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcfbaf65", new Object[]{str, ct, str2, new Integer(i), strArr});
            } else {
                Page.access$100(str, 2102, ct, str2, i, strArr);
            }
        }

        public static void itemSelected(CT ct, String str, int i, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9fbf72f", new Object[]{ct, str, new Integer(i), strArr});
            } else {
                Page.access$100(null, 2102, ct, str, i, strArr);
            }
        }

        public static void itemSelectedOnPage(String str, CT ct, String str2, int i, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8938c177", new Object[]{str, ct, str2, new Integer(i), strArr});
            } else {
                Page.access$100(str, 2102, ct, str2, i, strArr);
            }
        }

        public static void ctrlClicked(String str, CT ct, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e612cdfb", new Object[]{str, ct, str2});
            } else {
                Page.access$100(str, 2101, ct, str2, 0, new String[0]);
            }
        }

        public static void ctrlClickedOnPage(String str, CT ct, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5bb578d", new Object[]{str, ct, str2});
            } else {
                Page.access$100(str, 2101, ct, str2, 0, new String[0]);
            }
        }

        public static void ctrlLongClicked(String str, CT ct, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33f21f17", new Object[]{str, ct, str2});
            } else {
                Page.access$100(str, 2103, ct, str2, 0, new String[0]);
            }
        }

        public static void ctrlLongClickedOnPage(String str, CT ct, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724863a9", new Object[]{str, ct, str2});
            } else {
                Page.access$100(str, 2103, ct, str2, 0, new String[0]);
            }
        }

        public static void itemSelected(String str, CT ct, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("13815f7a", new Object[]{str, ct, str2, new Integer(i)});
            } else {
                Page.access$100(str, 2102, ct, str2, i, new String[0]);
            }
        }

        public static void itemSelectedOnPage(String str, CT ct, String str2, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae71f2a8", new Object[]{str, ct, str2, new Integer(i)});
            } else {
                Page.access$100(str, 2103, ct, str2, i, new String[0]);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class EasyTrace {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1603593714);
        }

        @Deprecated
        public static void easyTraceCtrlClickManual(View view, String str, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9f4482a", new Object[]{view, str, strArr});
            }
        }

        @Deprecated
        public static void easyTraceCtrlClickManual(View view, String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30aa7574", new Object[]{view, strArr});
            }
        }

        @Deprecated
        public static void easyTraceUpdatePageNameManual(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("958dfc67", new Object[]{str, str2});
            }
        }

        @Deprecated
        public static Runtime getUserTrackRuntime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runtime) ipChange.ipc$dispatch("6c4ff902", new Object[0]);
            }
            return null;
        }

        public static void easyTraceEnterManual(Activity activity, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f38febfe", new Object[]{activity, str});
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().pageAppear(activity);
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(activity, str);
        }

        public static void easyTraceLeaveManual(Activity activity, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bdd5e1d", new Object[]{activity, str});
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(activity, str);
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
        }

        public static void easyTraceUpdatePageNameManual(Activity activity, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("851a166f", new Object[]{activity, str});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(activity, str);
            }
        }

        public static void easyTraceFragmentEnterManual(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e06916e3", new Object[]{fragment});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().pageAppear(fragment);
            }
        }

        public static void easyTraceFragmentLeaveManual(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cd822c2", new Object[]{fragment});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(fragment);
            }
        }

        public static void easyTraceFragmentV4EnterManual(android.support.v4.app.Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f06a00de", new Object[]{fragment});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().pageAppear(fragment);
            }
        }

        public static void easyTraceFragmentV4LeaveManual(android.support.v4.app.Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe75239f", new Object[]{fragment});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(fragment);
            }
        }

        @Deprecated
        public static void updateEasyTraceActivityProperties(Activity activity, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb2a0db1", new Object[]{activity, properties});
            } else if (UTAnalytics.getInstance().getDefaultTracker() == null) {
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, apt.a(properties));
            }
        }

        @Deprecated
        public static void updateEasyTraceActivityPropertiesManual(Activity activity, String str, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1243ee21", new Object[]{activity, str, properties});
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, apt.a(properties));
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(activity, str);
        }

        public static void updateEasyTraceFragmentProperties(Fragment fragment, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5834591", new Object[]{fragment, properties});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(fragment, apt.a(properties));
            }
        }

        @Deprecated
        public static void updateEasyTraceFragmentV4Properties(android.support.v4.app.Fragment fragment, Properties properties) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2100756c", new Object[]{fragment, properties});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(fragment, apt.a(properties));
            }
        }
    }

    @Deprecated
    public static void h5UT(String str, WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb2360", new Object[]{str, webView});
        } else {
            h5UT(null, str, webView);
        }
    }

    private static void h5UT(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed84a63", new Object[]{str, str2, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!aqc.e(next)) {
                    String string = jSONObject.getString(next);
                    if (!aqc.e(string)) {
                        hashMap.put(next, string);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (obj == null) {
            return;
        }
        j.getInstance().h5UT(hashMap, obj);
    }

    public static void setH5Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1b94b1", new Object[]{str});
        } else {
            j.getInstance().setH5Url(str);
        }
    }

    @Deprecated
    public static synchronized void updateSharedProprety(String str, String str2) {
        synchronized (TBS.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba6627a4", new Object[]{str, str2});
            }
        }
    }

    @Deprecated
    public static synchronized String getSharedProperty(String str) {
        synchronized (TBS.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ef130ddf", new Object[]{str});
            }
            return null;
        }
    }

    @Deprecated
    public static void h5UT(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f160ab", new Object[]{str, context});
        } else {
            h5UT(null, str, context);
        }
    }
}
