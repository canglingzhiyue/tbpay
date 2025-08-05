package com.ut.mini.exposure;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import tb.apr;
import tb.apt;
import tb.kge;
import tb.mto;

/* loaded from: classes9.dex */
public class TrackerFrameLayout extends FrameLayout implements GestureDetector.OnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float CLICK_LIMIT = 20.0f;
    private static final Object HasExposrueObjectLock;
    private static final String TAG = "TrackerFrameLayout";
    public static long TIME_INTERVAL = 0;
    public static final int TRIGGER_VIEW_CHANGED = 0;
    public static final int TRIGGER_VIEW_STATUS_CHANGED = 3;
    public static final int TRIGGER_WINDOW_CHANGED = 1;
    private static final int UT_EXPORSURE_MAX_LENGTH = 25600;
    private static final String UT_SCM_TAG = "scm";
    private static final String UT_SPM_TAG = "spm";
    private static final int eventId = 2201;
    private static HashMap<String, Object> mCommonInfo;
    private static HashMap<String, Integer> mHasExposrueDataLength;
    private static Map<String, ArrayList> mHasExposrueMap;
    private static HashMap<String, HashSet<String>> mHasExposureSet;
    private static List<String> mImmediatelyCommitBlockList;
    private Map<String, d> currentViews;
    private long lastDispatchDrawSystemTimeMillis;
    private Rect mGlobalVisibleRect;
    private float mOriX;
    private float mOriY;
    private Runnable traceTask;
    private long traverseTime;

    public static /* synthetic */ Object ipc$super(TrackerFrameLayout trackerFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2090125984:
                super.dispatchVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1476722183:
                super.dispatchWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b398c1c3", new Object[]{this, motionEvent});
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void access$000(TrackerFrameLayout trackerFrameLayout, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6ff48a", new Object[]{trackerFrameLayout, new Integer(i), new Boolean(z)});
        } else {
            trackerFrameLayout.trace(i, z);
        }
    }

    static {
        kge.a(2050994417);
        kge.a(1204268671);
        TIME_INTERVAL = 100L;
        mCommonInfo = new HashMap<>();
        mHasExposureSet = new HashMap<>();
        mHasExposrueMap = Collections.synchronizedMap(new HashMap());
        mHasExposrueDataLength = new HashMap<>();
        HasExposrueObjectLock = new Object();
        mImmediatelyCommitBlockList = new Vector();
        l.addPageChangerListener(new a());
    }

    public TrackerFrameLayout(Context context) {
        super(context);
        this.currentViews = new ConcurrentHashMap();
        this.lastDispatchDrawSystemTimeMillis = 0L;
        this.mOriX = 0.0f;
        this.mOriY = 0.0f;
        this.traceTask = new Runnable() { // from class: com.ut.mini.exposure.TrackerFrameLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                apr.b(TrackerFrameLayout.TAG, "=====traceTask=====");
                TrackerFrameLayout.access$000(TrackerFrameLayout.this, 0, true);
            }
        };
        this.mGlobalVisibleRect = new Rect();
        addCommonArgsInfo();
        b.updateExposureConfig();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (com.ut.mini.exposure.a.f24109a) {
            com.ut.mini.exposure.a.a(TAG, "action:", Integer.valueOf(motionEvent.getAction()));
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mOriX = motionEvent.getX();
            this.mOriY = motionEvent.getY();
        } else if (action == 1) {
            Handler threadHandle = e.getInstance().getThreadHandle();
            if (threadHandle != null) {
                threadHandle.removeCallbacks(this.traceTask);
                threadHandle.postDelayed(this.traceTask, 1000L);
            }
        } else if (action == 2) {
            if (Math.abs(motionEvent.getX() - this.mOriX) > CLICK_LIMIT || Math.abs(motionEvent.getY() - this.mOriY) > CLICK_LIMIT) {
                long currentTimeMillis = System.currentTimeMillis();
                com.ut.mini.exposure.a.a(TAG, " begin");
                trace(0, false);
                if (com.ut.mini.exposure.a.f24109a) {
                    com.ut.mini.exposure.a.a(TAG, "end costTime=" + (System.currentTimeMillis() - currentTimeMillis) + "--\n");
                }
            } else {
                com.ut.mini.exposure.a.a(TAG, "onInterceptTouchEvent ACTION_MOVE but not in click limit");
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (com.ut.mini.exposure.a.f24109a) {
            com.ut.mini.exposure.a.a(TAG, "action:", Integer.valueOf(motionEvent.getAction()));
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        com.ut.mini.exposure.a.a(TAG, "begin");
        long currentTimeMillis = System.currentTimeMillis();
        trace(0, false);
        if (!com.ut.mini.exposure.a.f24109a) {
            return;
        }
        com.ut.mini.exposure.a.a(TAG, "end costTime=" + (System.currentTimeMillis() - currentTimeMillis) + "--");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        com.ut.mini.exposure.a.a(TAG, "dispatchDraw");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastDispatchDrawSystemTimeMillis > 1000) {
            this.lastDispatchDrawSystemTimeMillis = currentTimeMillis;
            addCommonArgsInfo();
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5804fe07", new Object[]{this, new Boolean(z)});
            return;
        }
        com.ut.mini.exposure.a.a(TAG, "begin");
        long currentTimeMillis = System.currentTimeMillis();
        trace(1, false);
        if (com.ut.mini.exposure.a.f24109a) {
            com.ut.mini.exposure.a.a(TAG, "end" + (System.currentTimeMillis() - currentTimeMillis) + "--");
        }
        super.dispatchWindowFocusChanged(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836b3560", new Object[]{this, view, new Integer(i)});
            return;
        }
        if (i == 8) {
            com.ut.mini.exposure.a.a(TAG, "begin");
            long currentTimeMillis = System.currentTimeMillis();
            trace(1, false);
            if (com.ut.mini.exposure.a.f24109a) {
                com.ut.mini.exposure.a.a(TAG, "end costTime=" + (System.currentTimeMillis() - currentTimeMillis) + "--");
            }
        } else {
            com.ut.mini.exposure.a.a(TAG, "visibility", Integer.valueOf(i));
        }
        super.dispatchVisibilityChanged(view, i);
    }

    private void addCommonArgsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12f8e3e", new Object[]{this});
        } else if (getContext() == null || !(getContext() instanceof Activity)) {
        } else {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            mCommonInfo.clear();
            HashMap<String, String> hashMap = e.getInstance().commonInfoMap;
            if (hashMap != null) {
                mCommonInfo.putAll(hashMap);
            }
            HashMap hashMap2 = (HashMap) decorView.getTag(c.ut_exprosure_common_info_tag);
            if (hashMap2 != null && !hashMap2.isEmpty()) {
                mCommonInfo.putAll(hashMap2);
                com.ut.mini.exposure.a.a(TAG, "addCommonArgsInfo mCommonInfo ", hashMap2);
            }
            com.ut.mini.exposure.a.a(TAG, "addCommonArgsInfo all mCommonInfo ", hashMap2);
        }
    }

    private void trace(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca02487d", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z && currentTimeMillis - this.traverseTime < TIME_INTERVAL) {
                if (!com.ut.mini.exposure.a.f24109a) {
                    return;
                }
                com.ut.mini.exposure.a.a(TAG, "triggerTime interval is too close to " + TIME_INTERVAL + "ms");
                return;
            }
            com.ut.mini.exposure.a.a(TAG, "扫描开始");
            this.traverseTime = currentTimeMillis;
            traverseViewTree(this);
            checkViewsStates(i);
            if (!com.ut.mini.exposure.a.f24109a) {
                return;
            }
            com.ut.mini.exposure.a.a(TAG, "扫描结束，耗时:" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            com.ut.mini.exposure.a.a(TAG, th, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void traverseViewTree(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.exposure.TrackerFrameLayout.traverseViewTree(android.view.View):void");
    }

    private void checkViewsStates(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cf9874", new Object[]{this, new Integer(i)});
            return;
        }
        Map<String, d> map = this.currentViews;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, d> entry : this.currentViews.entrySet()) {
            checkViewState(i, this.currentViews.get(String.valueOf(entry.getValue().view.hashCode())));
        }
    }

    private void checkViewState(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab59b795", new Object[]{this, new Integer(i), dVar});
        } else if (dVar == null) {
        } else {
            if (isVisableToUser(dVar.view)) {
                int i2 = dVar.lastState;
                if (i2 == 0) {
                    dVar.lastState = 1;
                    dVar.beginTime = System.currentTimeMillis();
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        dVar.lastState = 1;
                        dVar.beginTime = System.currentTimeMillis();
                    }
                } else if (i == 1 || i == 3) {
                    dVar.lastState = 2;
                    dVar.endTime = System.currentTimeMillis();
                }
            } else {
                int i3 = dVar.lastState;
                if (i3 != 0 && i3 == 1) {
                    dVar.lastState = 2;
                    dVar.endTime = System.currentTimeMillis();
                }
            }
            if (dVar.a()) {
                addToCommit(dVar);
                this.currentViews.remove(String.valueOf(dVar.view.hashCode()));
            } else if (dVar.lastState != 2) {
            } else {
                this.currentViews.remove(String.valueOf(dVar.view.hashCode()));
                com.ut.mini.exposure.a.a(TAG, "时间不满足，元素", dVar.tag);
            }
        }
    }

    private boolean isVisableToUser(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a5c8a639", new Object[]{this, view})).booleanValue() : viewSize(view) >= b.dimThreshold;
    }

    private double viewSize(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3469dd3", new Object[]{this, view})).doubleValue();
        }
        int width = view.getWidth() * view.getHeight();
        return (!view.getGlobalVisibleRect(this.mGlobalVisibleRect) || width <= 0) ? mto.a.GEO_NOT_SUPPORT : (this.mGlobalVisibleRect.width() * this.mGlobalVisibleRect.height()) / width;
    }

    private boolean isExposured(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180b3952", new Object[]{this, str, str2})).booleanValue();
        }
        HashSet<String> hashSet = mHasExposureSet.get(str);
        if (hashSet != null) {
            return hashSet.contains(str2);
        }
        return false;
    }

    private void setExposuredTag(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f774e2ba", new Object[]{this, str, str2});
            return;
        }
        HashSet<String> hashSet = mHasExposureSet.get(str);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            mHasExposureSet.put(str, hashSet);
        }
        hashSet.add(str2);
    }

    private void addToCommit(d dVar) {
        String str;
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1614fed7", new Object[]{this, dVar});
            return;
        }
        String str2 = dVar.block;
        String str3 = dVar.tag;
        if (isExposured(str2, str3)) {
            com.ut.mini.exposure.a.a(TAG, "isExposured block", str2, "viewId", str3);
            return;
        }
        setExposuredTag(str2, str3);
        Map<String, Object> map2 = dVar.viewData;
        HashMap hashMap = new HashMap();
        com.ut.mini.internal.a exposureViewHandle = e.getInstance().getExposureViewHandle();
        String[] strArr = null;
        if (exposureViewHandle != null) {
            Context context = dVar.view.getContext();
            Map<String, String> exposureViewProperties = exposureViewHandle.getExposureViewProperties(context != null ? l.getInstance().getPageUrl(context) : null, dVar.view);
            if (exposureViewProperties != null) {
                hashMap.putAll(exposureViewProperties);
            }
        }
        if (map2 != null && map2.get("UT_EXPROSURE_ARGS") != null && (map = (Map) map2.get("UT_EXPROSURE_ARGS")) != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        String str4 = (String) hashMap.remove("spm");
        String str5 = (String) hashMap.remove("scm");
        synchronized (HasExposrueObjectLock) {
            ArrayList arrayList = mHasExposrueMap.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                mHasExposrueMap.put(str2, arrayList);
                View view = dVar.view;
                if (view != null) {
                    Object tag = view.getTag(c.ut_exposure_data_spm);
                    if (tag instanceof Map) {
                        String str6 = (String) ((Map) tag).get("x-spm-c");
                        String str7 = (String) ((Map) tag).get("x-spm-d");
                        if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                            Object rootViewTag = getRootViewTag(view, c.ut_exposure_root_spm);
                            if (rootViewTag instanceof Map) {
                                String str8 = (String) ((Map) rootViewTag).get("x-spm-a");
                                String str9 = (String) ((Map) rootViewTag).get("x-spm-b");
                                if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str9)) {
                                    str4 = str8 + "." + str9 + "." + str6 + "." + str7;
                                }
                            }
                        }
                    }
                }
            } else {
                View view2 = dVar.view;
                if (view2 != null) {
                    Object tag2 = view2.getTag(c.ut_exposure_data_spm);
                    if (tag2 instanceof Map) {
                        String str10 = (String) ((Map) tag2).get("x-spm-c");
                        String str11 = (String) ((Map) tag2).get("x-spm-d");
                        if (!TextUtils.isEmpty(str10) && !TextUtils.isEmpty(str11)) {
                            String str12 = ((ExposureEntity) arrayList.get(0)).spm;
                            if (!TextUtils.isEmpty(str12)) {
                                strArr = str12.split("\\.");
                            }
                            if (strArr != null && strArr.length == 4) {
                                str4 = strArr[0] + "." + strArr[1] + "." + str10 + "." + str11;
                            }
                        }
                    }
                }
            }
            str = str4;
            ExposureEntity exposureEntity = new ExposureEntity(str, str5, hashMap, System.currentTimeMillis() - dVar.beginTime, dVar.area, str3);
            arrayList.add(exposureEntity);
            Integer num = mHasExposrueDataLength.get(str2);
            if (num == null) {
                num = 0;
            }
            Integer valueOf = Integer.valueOf(num.intValue() + exposureEntity.length());
            mHasExposrueDataLength.put(str2, valueOf);
            if (valueOf.intValue() > UT_EXPORSURE_MAX_LENGTH) {
                commitToUT(str2, mCommonInfo);
            } else if (mImmediatelyCommitBlockList.contains(str2)) {
                commitToUT(str2, mCommonInfo);
            }
        }
        com.ut.mini.module.trackerlistener.b.getInstance().addExposureViewToCommit(str2, str3, str, str5, hashMap);
        com.ut.mini.exposure.a.a(TAG, "提交元素viewId ", str3, com.taobao.android.weex_framework.util.a.ATOM_EXT_block, str2, "spm", str, "scm", str5, "args", hashMap);
    }

    private static Object getRootViewTag(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e86451d", new Object[]{view, new Integer(i)});
        }
        while (view != null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
            if (view != null && view.getTag(i) != null) {
                return view.getTag(i);
            }
        }
        return null;
    }

    private static void commitToUT(String str, HashMap<String, Object> hashMap) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb591e71", new Object[]{str, hashMap});
            return;
        }
        com.ut.mini.exposure.a.a();
        ArrayList remove = mHasExposrueMap.remove(str);
        HashMap hashMap2 = new HashMap();
        if (hashMap != null && hashMap.size() > 0 && (a2 = apt.a(hashMap)) != null) {
            hashMap2.putAll(a2);
        }
        hashMap2.put("expdata", getExpData(remove));
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(l.getInstance().getCurrentPageName(), 2201, str, null, null, hashMap2).build());
        mHasExposrueDataLength.remove(str);
    }

    private static String getExpData(ArrayList<ExposureEntity> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b88d16e", new Object[]{arrayList});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(arrayList);
        return jSONArray.toJSONString();
    }

    /* loaded from: classes9.dex */
    public static class ExposureEntity implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double area;
        public long duration;
        public Map<String, String> exargs;
        public String scm;
        public String spm;
        public String viewid;

        static {
            kge.a(-569501699);
            kge.a(1028243835);
        }

        public ExposureEntity(String str, String str2, Map map, long j, double d, String str3) {
            this.duration = 0L;
            this.spm = str;
            this.scm = str2;
            this.exargs = map;
            this.duration = j;
            this.area = d;
            this.viewid = str3;
        }

        public int length() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("451fdc60", new Object[]{this})).intValue();
            }
            String str = this.spm;
            if (str != null) {
                i = 0 + str.length() + 8;
            }
            String str2 = this.scm;
            if (str2 != null) {
                i += str2.length() + 8;
            }
            Map<String, String> map = this.exargs;
            if (map != null) {
                for (String str3 : map.keySet()) {
                    if (str3 != null) {
                        i += str3.length();
                    }
                    String str4 = this.exargs.get(str3);
                    if (str4 != null) {
                        i += str4.toString().length();
                    }
                    i += 5;
                }
            }
            String str5 = this.viewid;
            if (str5 != null) {
                i += str5.length() + 11;
            }
            return i + 50;
        }
    }

    public void onPageDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbea805c", new Object[]{this});
            return;
        }
        Handler threadHandle = e.getInstance().getThreadHandle();
        if (threadHandle != null) {
            threadHandle.removeCallbacks(this.traceTask);
        }
        trace(1, true);
        commitExposureData();
        mImmediatelyCommitBlockList.clear();
        this.currentViews.clear();
        if (!b.notClearTagAfterDisAppear) {
            mHasExposureSet.clear();
        }
        com.ut.mini.internal.a exposureViewHandle = e.getInstance().getExposureViewHandle();
        if (!(exposureViewHandle instanceof com.ut.mini.internal.c)) {
            return;
        }
        ((com.ut.mini.internal.c) exposureViewHandle).onExposureDataCleared();
    }

    /* loaded from: classes9.dex */
    public static class a implements l.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(400447322);
            kge.a(786836730);
        }

        @Override // com.ut.mini.l.a
        public void onPageAppear(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7330a6", new Object[]{this, obj});
            } else if (!(obj instanceof Activity)) {
            } else {
                View view = null;
                try {
                    view = ((Activity) obj).findViewById(16908290);
                } catch (Exception e) {
                    com.ut.mini.exposure.a.a(TrackerFrameLayout.TAG, e, new Object[0]);
                }
                if (!(view instanceof ViewGroup)) {
                    com.ut.mini.exposure.a.b(TrackerFrameLayout.TAG, "contentView", view);
                    return;
                }
                View childAt = ((ViewGroup) view).getChildAt(0);
                if (childAt instanceof TrackerFrameLayout) {
                    TrackerFrameLayout.access$000((TrackerFrameLayout) childAt, 1, true);
                } else {
                    com.ut.mini.exposure.a.b(TrackerFrameLayout.TAG, "cannot found the trace view", childAt);
                }
            }
        }

        @Override // com.ut.mini.l.a
        public void onPageDisAppear(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4c99138", new Object[]{this, obj});
            } else if (!(obj instanceof Activity)) {
            } else {
                View view = null;
                try {
                    view = ((Activity) obj).findViewById(16908290);
                } catch (Exception e) {
                    com.ut.mini.exposure.a.a(TrackerFrameLayout.TAG, e, new Object[0]);
                }
                if (!(view instanceof ViewGroup)) {
                    com.ut.mini.exposure.a.b(TrackerFrameLayout.TAG, "contentView", view);
                    return;
                }
                View childAt = ((ViewGroup) view).getChildAt(0);
                if (childAt instanceof TrackerFrameLayout) {
                    ((TrackerFrameLayout) childAt).onPageDisAppear();
                } else {
                    com.ut.mini.exposure.a.b(TrackerFrameLayout.TAG, "cannot found the trace view ", childAt);
                }
            }
        }
    }

    public static void refreshExposureData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd143a53", new Object[0]);
        } else {
            mHasExposureSet.clear();
        }
    }

    public static void refreshExposureData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c955d", new Object[]{str});
            return;
        }
        com.ut.mini.exposure.a.a(TAG, "[refreshExposureData]block", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mHasExposureSet.remove(str);
    }

    public static void refreshExposureDataByViewId(String str, String str2) {
        HashSet<String> hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f455a0de", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (hashSet = mHasExposureSet.get(str)) == null) {
        } else {
            hashSet.remove(str2);
        }
    }

    public static void commitExposureData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c098af", new Object[0]);
            return;
        }
        synchronized (HasExposrueObjectLock) {
            Object[] objArr = null;
            try {
                objArr = mHasExposrueMap.keySet().toArray();
            } catch (Throwable unused) {
            }
            if (objArr != null) {
                if (objArr.length > 0) {
                    for (int i = 0; i < objArr.length; i++) {
                        commitToUT(objArr[i] + "", mCommonInfo);
                    }
                }
            }
            mHasExposrueMap.clear();
        }
    }

    public static void setCommitImmediatelyExposureBlock(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c81092", new Object[]{str});
        } else {
            mImmediatelyCommitBlockList.add(str);
        }
    }
}
