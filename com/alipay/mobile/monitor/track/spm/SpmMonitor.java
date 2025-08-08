package com.alipay.mobile.monitor.track.spm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.android.phone.wallet.spmtracker.ISpmMonitor;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.api.behavor.BehavorID;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.mobile.monitor.track.spm.TrackerHelper;
import com.alipay.mobile.monitor.track.spm.merge.MergeCenter;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;
import com.alipay.mobile.monitor.track.spm.monitor.TrackerExecutor;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.ClickTracker;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.ExposeTracker;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.MergeTracker;
import com.alipay.mobile.monitor.track.spm.monitor.tracker.SlideTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
/* loaded from: classes3.dex */
public enum SpmMonitor implements ISpmMonitor {
    INTANCE;
    
    private boolean b;
    private LeaveHintReceiver c;
    private Context d;
    private WeakReference<Object> f;

    /* renamed from: a  reason: collision with root package name */
    private final String f5761a = SpmMonitor.class.getSimpleName();
    private TrackerExecutor e = MergeCenter.INSTANCE.getTrackerExcutor();

    @MpaasClassInfo(BundleName = "android-phone-wallet-spmtracker", ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-spmtracker")
    /* loaded from: classes3.dex */
    public class LeaveHintReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public LeaveHintReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String str = SpmMonitor.this.f5761a;
            SpmLogCator.debug(str, "LeaveHintReceiver onReceive:" + intent.getAction());
            SpmMonitor.this.b = true;
        }
    }

    SpmMonitor(String str) {
        a();
    }

    private Behavor.Builder a(Object obj, String str, String str2, int i, Map<String, String> map, String... strArr) {
        return a(obj, str, str2, null, i, map, strArr);
    }

    private Behavor.Builder a(Object obj, String str, String str2, String str3, int i, Map<String, String> map, String... strArr) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        Behavor.Builder seedID = new Behavor.Builder(Constant.UCID).setSeedID(str);
        seedID.setBehaviourPro(str2).setPageId(getPageId(obj)).setEntityContentId(str3).setLoggerLevel(i);
        if (strArr != null && strArr.length > 0) {
            if (1 <= strArr.length) {
                seedID.setParam1(strArr[0]);
            }
            if (2 <= strArr.length) {
                seedID.setParam2(strArr[1]);
            }
            if (3 <= strArr.length) {
                seedID.setParam3(strArr[2]);
            }
        }
        if (map != null) {
            for (String str4 : map.keySet()) {
                seedID.addExtParam(str4, map.get(str4));
            }
        }
        seedID.addExtParams5(StEvent.EVENT_TIME, valueOf);
        return seedID;
    }

    private HashMap<String, String> a(Object obj, Map<String, String> map, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (map != null && !map.isEmpty()) {
            if (SpmUtils.isDebug && map.containsKey(Constant.KEY_FROMHOME)) {
                throw new IllegalArgumentException("\"fromHome\"为保留字段，扩展参数中key不能使用\"fromHome\"");
            }
            if (SpmUtils.isDebug && map.containsKey(Constant.KEY_PAGEBACK)) {
                throw new IllegalArgumentException("\"pageBack\"为保留字段，扩展参数中key不能使用\"pageBack\"");
            }
            if (SpmUtils.isDebug && map.containsKey("chInfo")) {
                throw new IllegalArgumentException("\"chInfo\"为保留字段，扩展参数中key不能使用\"chInfo\"");
            }
            if (SpmUtils.isDebug && map.containsKey("srcSpm")) {
                throw new IllegalArgumentException("\"srcSpm\"为保留字段，扩展参数中key不能使用\"srcSpm\"");
            }
            if (SpmUtils.isDebug && map.containsKey(Constant.KEY_REFER_SPM)) {
                throw new IllegalArgumentException("\"referSpm\"为保留字段，扩展参数中key不能使用\"referSpm\"");
            }
            if (SpmUtils.isDebug && map.containsKey(Constant.KEY_LANINFO)) {
                throw new IllegalArgumentException("\"laninfo\"为保留字段，扩展参数中key不能使用\"laninfo\"");
            }
            hashMap.putAll(map);
        }
        hashMap.put(Constant.KEY_FROMHOME, this.b ? "1" : "0");
        hashMap.put("srcSpm", TrackerHelper.instance.getSrcSpm(obj));
        hashMap.put(Constant.KEY_REFER_SPM, TrackerHelper.instance.getReferSpm(obj));
        TrackerHelper.TrackerParams trackerParams = TrackerHelper.instance.getTrackerParams(obj);
        if (trackerParams != null) {
            if (!StringUtils.isEmpty(trackerParams.chInfo)) {
                hashMap.put("chInfo", trackerParams.chInfo);
            }
            if (!StringUtils.isEmpty(trackerParams.lanInfo)) {
                hashMap.put(Constant.KEY_LANINFO, trackerParams.lanInfo);
            }
            if (!StringUtils.isEmpty(trackerParams.pageBack)) {
                hashMap.put(Constant.KEY_PAGEBACK, trackerParams.pageBack);
            }
        }
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("chInfo", str);
        }
        return hashMap;
    }

    private synchronized void a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.monitor.track.spm.SpmMonitor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (SpmMonitor.this.c != null || SpmMonitor.this.d == null) {
                        return;
                    }
                    SpmMonitor.this.c = new LeaveHintReceiver();
                    LocalBroadcastManager.getInstance(SpmMonitor.this.d).registerReceiver(SpmMonitor.this.c, new IntentFilter(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT));
                } catch (Error e) {
                    String str = SpmMonitor.this.f5761a;
                    Log.e(str, "registerHomePressReceiver error:" + e.toString());
                } catch (Exception e2) {
                    String str2 = SpmMonitor.this.f5761a;
                    Log.e(str2, "registerHomePressReceiver exception:" + e2.toString());
                }
            }
        }, 1000L);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void behaviorClick(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        if (!SpmTrackIntegrator.getInstance().isWithAutoTracker()) {
            setLastClickSpm(str);
        }
        this.e.commitTracker(new ClickTracker(a(obj, str, str2, str3, i, map, new String[0])));
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void behaviorExpose(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.e.commitTracker(new ExposeTracker(a(obj, str, str2, str3, i, map, new String[0])));
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void behaviorSlide(Object obj, String str, String str2, int i, String str3, Map<String, String> map) {
        if (StringUtils.isEmpty(str)) {
            return;
        }
        this.e.commitTracker(new SlideTracker(a(obj, str, str2, i, map, new String[0])));
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final String getLastClickSpmId() {
        return TrackerHelper.instance.getLastClickSpmId();
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final String getLastClickSpmIdByPage(Object obj) {
        return TrackerHelper.instance.getLastClickSpmIdByPage(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final String getMiniPageId(Object obj) {
        return TrackerHelper.instance.getMiniPageId(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final String getPageChInfo(Object obj) {
        return TrackerHelper.instance.getPageChInfo(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final String getPageId(Object obj) {
        return TrackerHelper.instance.getPageId(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final String getPageSpm(Object obj) {
        return TrackerHelper.instance.getPageSpm(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final String getSrcSpm(Object obj) {
        return TrackerHelper.instance.getSrcSpm(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final Object getTopPage() {
        WeakReference<Object> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final Map<String, String> getTracerInfo(Object obj) {
        return TrackerHelper.instance.getTracerInfo(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final boolean isPageStarted(Object obj) {
        return TrackerHelper.instance.isPageStarted(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void mergeExpose(Object obj, String str, String str2, int i, String str3, Map<String, String> map, String str4, int i2) {
        SpmLogCator.debug(this.f5761a, "mergeExpose spmId:".concat(String.valueOf(str)));
        if (StringUtils.isEmpty(str)) {
            return;
        }
        HashMap hashMap = map == null ? new HashMap() : map;
        hashMap.put(MergeUtil.KEY_RID, str4);
        if (i2 >= 0) {
            hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, Integer.toString(i2));
        }
        Behavor.Builder a2 = a(obj, str, str2, str3, i, hashMap, new String[0]);
        if ("1".equals(MergeUtil.isMergeActived())) {
            MergeCenter.INSTANCE.merge(new MergeTracker(BehavorID.MERGEEXPOSURE, a2));
        } else if (!"0".equals(MergeUtil.isMergeActived())) {
        } else {
            behaviorExpose(obj, str, str2, i, str3, hashMap);
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void pageOnCreate(Object obj, String str) {
        SpmLogCator.debug(this.f5761a, "pageOnCreate spmId:".concat(String.valueOf(str)));
        this.f = new WeakReference<>(obj);
        if (!StringUtils.isEmpty(str)) {
            SpmTrackIntegrator.getInstance().logPageStartWithSpmId(str, obj);
            TrackerHelper.instance.onPageCreate(obj);
        }
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void pageOnDestroy(Object obj) {
        TrackerHelper.instance.onPageDestroy(obj);
        SpmTrackIntegrator.getInstance().pageOnDestroy(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void pageOnPause(Object obj, String str, String str2, Map<String, String> map) {
        pageOnPause(obj, str, str2, map, null);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void pageOnPause(Object obj, String str, String str2, Map<String, String> map, String str3) {
        String str4 = this.f5761a;
        SpmLogCator.debug(str4, "pageOnPause spmId:" + str + ";chInfo:" + str3);
        if (!StringUtils.isEmpty(str)) {
            SpmTrackIntegrator.getInstance().logPageEndWithSpmId(str, obj, str2, a(obj, map, str3));
            MergeCenter.INSTANCE.commitImmediately(getPageId(obj));
        }
        TrackerHelper.instance.onPagePause(obj);
        this.b = false;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void pageOnResume(Object obj, String str) {
        SpmLogCator.debug(this.f5761a, "pageOnResume spmId:".concat(String.valueOf(str)));
        if (!StringUtils.isEmpty(str)) {
            TrackerHelper.instance.checkIsPageBack(obj);
            SpmTrackIntegrator.getInstance().logPageStartWithSpmId(str, obj);
            TrackerHelper.instance.onPageResume(obj);
        }
        this.f = new WeakReference<>(obj);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final void setContentTag(View view, String str) {
        SpmLogCator.debug(this.f5761a, "setContentTag scmId:".concat(String.valueOf(str)));
        SpmTrackIntegrator.getInstance().tagViewEntityContentId(view, str);
    }

    public final void setContext(Context context) {
        this.d = context;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void setHomePageTabSpms(List<String> list) {
        TrackerHelper.instance.setHomePageTabSpms(list);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void setIsDebug(boolean z) {
        SpmUtils.isDebug = z;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void setLastClickSpm(String str) {
        SpmTrackIntegrator.getInstance().setLastClickViewSpm(str, null);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void setMergeConfig(String str) {
        MergeUtil.MERGE_CONFIG = str;
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    public final void setSpmTag(View view, String str) {
        SpmLogCator.debug(this.f5761a, "setSpmTag spmId:".concat(String.valueOf(str)));
        SpmTrackIntegrator.getInstance().tagViewSpm(view, str);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final void setSpmTag(View view, String str, boolean z) {
        setSpmTag(view, str);
    }

    @Override // com.alipay.android.phone.wallet.spmtracker.ISpmMonitor
    @Deprecated
    public final void upateSrcSpm(Object obj, String str) {
        TrackerHelper.instance.updateSrcSpm(obj, str);
    }
}
