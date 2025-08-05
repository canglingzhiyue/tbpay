package com.taobao.weex.ui.view.gesture;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.EventResult;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.WXEvent;
import com.taobao.weex.ui.component.Scrollable;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class WXGesture extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CUR_EVENT = -1;
    public static final String DOWN = "down";
    public static final String END = "end";
    public static final String LEFT = "left";
    public static final String MOVE = "move";
    public static final String RIGHT = "right";
    public static final String START = "start";
    private static final String TAG = "Gesture";
    public static final String UNKNOWN = "unknown";
    public static final String UP = "up";
    private WXComponent component;
    private GestureDetector mGestureDetector;
    private int mParentOrientation;
    private int shouldBubbleInterval;
    private boolean shouldBubbleResult;
    private long swipeDownTime = -1;
    private long panDownTime = -1;
    private WXGestureType mPendingPan = null;
    private boolean mIsPreventMoveEvent = false;
    private boolean mIsTouchEventConsumed = false;
    private boolean requestDisallowInterceptTouchEvent = false;
    private int shouldBubbleCallRemainTimes = 0;
    private final List<View.OnTouchListener> mTouchListeners = new LinkedList();
    private Rect globalRect = new Rect();
    private Point globalOffset = new Point();
    private Point globalEventOffset = new Point();
    private PointF locEventOffset = new PointF();
    private PointF locLeftTop = new PointF();

    /* loaded from: classes9.dex */
    public static class GestureHandler extends Handler {
        static {
            kge.a(1490818765);
        }

        public GestureHandler() {
            super(Looper.getMainLooper());
        }
    }

    static {
        kge.a(1095454008);
        kge.a(-468432129);
    }

    public static /* synthetic */ Object ipc$super(WXGesture wXGesture, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public WXGesture(WXComponent wXComponent, Context context) {
        this.mParentOrientation = -1;
        this.shouldBubbleResult = true;
        this.shouldBubbleInterval = 0;
        this.component = wXComponent;
        this.mGestureDetector = new GestureDetector(context, this, new GestureHandler());
        Scrollable parentScroller = wXComponent.getParentScroller();
        if (parentScroller != null) {
            this.mParentOrientation = parentScroller.getOrientation();
        }
        this.shouldBubbleResult = WXUtils.getBoolean(wXComponent.getAttrs().get(Constants.Name.SHOULD_STOP_PROPAGATION_INIT_RESULT), true).booleanValue();
        this.shouldBubbleInterval = WXUtils.getNumberInt(wXComponent.getAttrs().get(Constants.Name.SHOULD_STOP_PROPAGATION_INTERVAL), 0);
    }

    private boolean isParentScrollable() {
        Scrollable parentScroller;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fdf1246", new Object[]{this})).booleanValue();
        }
        WXComponent wXComponent = this.component;
        return wXComponent == null || (parentScroller = wXComponent.getParentScroller()) == null || parentScroller.isScrollable();
    }

    private boolean hasSameOrientationWithParent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("af09654b", new Object[]{this})).booleanValue() : (this.mParentOrientation == 0 && this.component.containsGesture(WXGestureType.HighLevelGesture.HORIZONTALPAN)) || (this.mParentOrientation == 1 && this.component.containsGesture(WXGestureType.HighLevelGesture.VERTICALPAN));
    }

    public void setPreventMoveEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9b303a", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsPreventMoveEvent = z;
        }
    }

    public boolean isTouchEventConsumedByAdvancedGesture() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("29ca658e", new Object[]{this})).booleanValue() : this.mIsTouchEventConsumed;
    }

    public static boolean isStopPropagation(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f0b1c75", new Object[]{str})).booleanValue() : Constants.Event.STOP_PROPAGATION.equals(str) || Constants.Event.STOP_PROPAGATION_RAX.equals(str);
    }

    public static boolean hasStopPropagation(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67f06320", new Object[]{wXComponent})).booleanValue();
        }
        WXEvent events = wXComponent.getEvents();
        if (events == null) {
            return false;
        }
        int size = events.size();
        for (int i = 0; i < size && i < events.size(); i++) {
            if (isStopPropagation(events.get(i))) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldBubbleTouchEvent(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602f627a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!hasStopPropagation(this.component)) {
            return true;
        }
        if (this.shouldBubbleInterval > 0 && (i = this.shouldBubbleCallRemainTimes) > 0) {
            this.shouldBubbleCallRemainTimes = i - 1;
            return this.shouldBubbleResult;
        }
        Map<String, Object> createFireEventParam = createFireEventParam(motionEvent, -1, null);
        createFireEventParam.put("type", "touch");
        if (motionEvent.getAction() == 0) {
            createFireEventParam.put("action", "start");
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            createFireEventParam.put("action", "end");
        } else {
            createFireEventParam.put("action", MOVE);
        }
        WXEvent events = this.component.getEvents();
        String str = Constants.Event.STOP_PROPAGATION;
        if (!events.contains(str)) {
            str = Constants.Event.STOP_PROPAGATION_RAX;
        }
        EventResult fireEventWait = this.component.fireEventWait(str, createFireEventParam);
        if (fireEventWait.isSuccess() && fireEventWait.getResult() != null) {
            this.shouldBubbleResult = !WXUtils.getBoolean(fireEventWait.getResult(), Boolean.valueOf(!this.shouldBubbleResult)).booleanValue();
        }
        this.shouldBubbleCallRemainTimes = this.shouldBubbleInterval;
        return this.shouldBubbleResult;
    }

    public void addOnTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4e7e48", new Object[]{this, onTouchListener});
        } else if (onTouchListener == null) {
        } else {
            this.mTouchListeners.add(onTouchListener);
        }
    }

    public boolean removeTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79db8e70", new Object[]{this, onTouchListener})).booleanValue();
        }
        if (onTouchListener == null) {
            return false;
        }
        return this.mTouchListeners.remove(onTouchListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:10:0x0026, B:12:0x0030, B:14:0x0038, B:15:0x003e, B:17:0x0044, B:18:0x0050, B:40:0x00ad, B:42:0x00b5, B:44:0x00bd, B:46:0x00c7, B:48:0x00cf, B:49:0x00d8, B:51:0x00dc, B:53:0x00f6, B:28:0x0063, B:30:0x0078, B:29:0x0072, B:31:0x007a, B:32:0x0089, B:34:0x0091, B:36:0x0097, B:38:0x00a3, B:39:0x00a6), top: B:58:0x0026 }] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.view.gesture.WXGesture.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    private String getPanEventAction(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fe0239b", new Object[]{this, motionEvent});
        }
        int action = motionEvent.getAction();
        return action != 0 ? action != 1 ? action != 2 ? action != 3 ? "unknown" : "end" : MOVE : "end" : "start";
    }

    private void finishDisallowInterceptTouchEvent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b11271c", new Object[]{this, view});
        } else if (view.getParent() == null) {
        } else {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    private boolean handlePanMotionEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74ad638f", new Object[]{this, motionEvent})).booleanValue();
        }
        WXGestureType wXGestureType = this.mPendingPan;
        if (wXGestureType == null) {
            return false;
        }
        String panEventAction = (wXGestureType == WXGestureType.HighLevelGesture.HORIZONTALPAN || this.mPendingPan == WXGestureType.HighLevelGesture.VERTICALPAN) ? getPanEventAction(motionEvent) : null;
        if (!this.component.containsGesture(this.mPendingPan)) {
            return false;
        }
        if (this.mIsPreventMoveEvent && MOVE.equals(panEventAction)) {
            return true;
        }
        for (Map<String, Object> map : createMultipleFireEventParam(motionEvent, panEventAction)) {
            this.component.fireEvent(this.mPendingPan.toString(), map);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.mPendingPan = null;
        }
        return true;
    }

    private boolean handleMotionEvent(WXGestureType wXGestureType, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fb0af25", new Object[]{this, wXGestureType, motionEvent})).booleanValue();
        }
        if (!this.component.containsGesture(wXGestureType)) {
            return false;
        }
        for (Map<String, Object> map : createMultipleFireEventParam(motionEvent, null)) {
            this.component.fireEvent(wXGestureType.toString(), map);
        }
        return true;
    }

    private List<Map<String, Object>> createMultipleFireEventParam(MotionEvent motionEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("84b9150c", new Object[]{this, motionEvent, str});
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize() + 1);
        arrayList.add(createFireEventParam(motionEvent, -1, str));
        return arrayList;
    }

    private List<Map<String, Object>> getHistoricalEvents(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("45e9992", new Object[]{this, motionEvent});
        }
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        if (motionEvent.getActionMasked() == 2) {
            for (int i = 0; i < motionEvent.getHistorySize(); i++) {
                arrayList.add(createFireEventParam(motionEvent, i, null));
            }
        }
        return arrayList;
    }

    private Map<String, Object> createFireEventParam(MotionEvent motionEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8741b381", new Object[]{this, motionEvent, new Integer(i), str});
        }
        JSONArray jSONArray = new JSONArray(motionEvent.getPointerCount());
        if (motionEvent.getActionMasked() == 2) {
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                jSONArray.add(createJSONObject(motionEvent, i, i2));
            }
        } else if (isPointerNumChanged(motionEvent)) {
            jSONArray.add(createJSONObject(motionEvent, -1, motionEvent.getActionIndex()));
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WXGestureType.GestureInfo.HISTORICAL_XY, jSONArray);
        hashMap.put(WXGestureType.GestureInfo.TOUCHES, jSONArray);
        if (str != null) {
            hashMap.put("state", str);
        }
        return hashMap;
    }

    private boolean isPointerNumChanged(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edccbe81", new Object[]{this, motionEvent})).booleanValue() : motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 3;
    }

    private boolean containsSimplePan() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65e8fcb7", new Object[]{this})).booleanValue() : this.component.containsGesture(WXGestureType.HighLevelGesture.PAN_START) || this.component.containsGesture(WXGestureType.HighLevelGesture.PAN_MOVE) || this.component.containsGesture(WXGestureType.HighLevelGesture.PAN_END);
    }

    private JSONObject createJSONObject(MotionEvent motionEvent, int i, int i2) {
        PointF eventLocInPageCoordinate;
        PointF eventLocInScreenCoordinate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("25f48c9f", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)});
        }
        if (i == -1) {
            eventLocInPageCoordinate = getEventLocInPageCoordinate(motionEvent, i2);
            eventLocInScreenCoordinate = getEventLocInScreenCoordinate(motionEvent, i2);
        } else {
            eventLocInPageCoordinate = getEventLocInPageCoordinate(motionEvent, i2, i);
            eventLocInScreenCoordinate = getEventLocInScreenCoordinate(motionEvent, i2, i);
        }
        JSONObject createJSONObject = createJSONObject(eventLocInScreenCoordinate, eventLocInPageCoordinate, motionEvent.getPointerId(i2));
        float pressure = motionEvent.getPressure();
        if (pressure > 0.0f && pressure < 1.0f) {
            createJSONObject.put("force", (Object) Float.valueOf(motionEvent.getPressure()));
        }
        return createJSONObject;
    }

    private JSONObject createJSONObject(PointF pointF, PointF pointF2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2bb42176", new Object[]{this, pointF, pointF2, new Float(f)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WXGestureType.GestureInfo.PAGE_X, (Object) Float.valueOf(pointF2.x));
        jSONObject.put(WXGestureType.GestureInfo.PAGE_Y, (Object) Float.valueOf(pointF2.y));
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_X, (Object) Float.valueOf(pointF.x));
        jSONObject.put(WXGestureType.GestureInfo.SCREEN_Y, (Object) Float.valueOf(pointF.y));
        jSONObject.put("identifier", (Object) Float.valueOf(f));
        return jSONObject;
    }

    private PointF getEventLocInScreenCoordinate(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("31456519", new Object[]{this, motionEvent, new Integer(i)}) : getEventLocInScreenCoordinate(motionEvent, i, -1);
    }

    private PointF getEventLocInScreenCoordinate(MotionEvent motionEvent, int i, int i2) {
        float historicalY;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("bc11b998", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)});
        }
        if (i2 == -1) {
            f = motionEvent.getX(i);
            historicalY = motionEvent.getY(i);
        } else {
            float historicalX = motionEvent.getHistoricalX(i, i2);
            historicalY = motionEvent.getHistoricalY(i, i2);
            f = historicalX;
        }
        return getEventLocInScreenCoordinate(f, historicalY);
    }

    private PointF getEventLocInScreenCoordinate(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("e91fb663", new Object[]{this, new Float(f), new Float(f2)});
        }
        this.globalRect.set(0, 0, 0, 0);
        this.globalOffset.set(0, 0);
        this.globalEventOffset.set((int) f, (int) f2);
        this.component.mo1594getRealView().getGlobalVisibleRect(this.globalRect, this.globalOffset);
        this.globalEventOffset.offset(this.globalOffset.x, this.globalOffset.y);
        return new PointF(WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.globalEventOffset.x, this.component.getInstance().y()), WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.globalEventOffset.y, this.component.getInstance().y()));
    }

    private PointF getEventLocInPageCoordinate(MotionEvent motionEvent, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("5bdc4316", new Object[]{this, motionEvent, new Integer(i)}) : getEventLocInPageCoordinate(motionEvent, i, -1);
    }

    private PointF getEventLocInPageCoordinate(MotionEvent motionEvent, int i, int i2) {
        float historicalY;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("e4569b3b", new Object[]{this, motionEvent, new Integer(i), new Integer(i2)});
        }
        if (i2 == -1) {
            f = motionEvent.getX(i);
            historicalY = motionEvent.getY(i);
        } else {
            float historicalX = motionEvent.getHistoricalX(i, i2);
            historicalY = motionEvent.getHistoricalY(i, i2);
            f = historicalX;
        }
        return getEventLocInPageCoordinate(f, historicalY);
    }

    private PointF getEventLocInPageCoordinate(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("46fdddc6", new Object[]{this, new Float(f), new Float(f2)});
        }
        this.locEventOffset.set(f, f2);
        this.locLeftTop.set(0.0f, 0.0f);
        this.component.computeVisiblePointInViewCoordinate(this.locLeftTop);
        this.locEventOffset.offset(this.locLeftTop.x, this.locLeftTop.y);
        return new PointF(WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.locEventOffset.x, this.component.getInstance().y()), WXViewInnerUtils.getWebPxByWidth(this.component.getInstance(), this.locEventOffset.y, this.component.getInstance().y()));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
        } else if (!this.component.containsGesture(WXGestureType.HighLevelGesture.LONG_PRESS)) {
        } else {
            List<Map<String, Object>> createMultipleFireEventParam = createMultipleFireEventParam(motionEvent, null);
            this.component.getInstance().a(this.component.getRef(), WXGestureType.HighLevelGesture.LONG_PRESS.toString(), createMultipleFireEventParam.get(createMultipleFireEventParam.size() - 1));
            this.mIsTouchEventConsumed = true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        WXGestureType.HighLevelGesture highLevelGesture;
        boolean handlePanMotionEvent;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent2.getY() - motionEvent.getY())) {
            highLevelGesture = WXGestureType.HighLevelGesture.HORIZONTALPAN;
        } else {
            highLevelGesture = WXGestureType.HighLevelGesture.VERTICALPAN;
        }
        if (this.mPendingPan == WXGestureType.HighLevelGesture.HORIZONTALPAN || this.mPendingPan == WXGestureType.HighLevelGesture.VERTICALPAN) {
            handlePanMotionEvent = handlePanMotionEvent(motionEvent2);
        } else {
            if (this.component.containsGesture(highLevelGesture)) {
                ViewParent parent = this.component.mo1594getRealView().getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                WXGestureType wXGestureType = this.mPendingPan;
                if (wXGestureType != null) {
                    handleMotionEvent(wXGestureType, motionEvent2);
                }
                this.mPendingPan = highLevelGesture;
                this.component.fireEvent(highLevelGesture.toString(), createFireEventParam(motionEvent2, -1, "start"));
            } else if (containsSimplePan()) {
                if (this.panDownTime != motionEvent.getEventTime()) {
                    this.panDownTime = motionEvent.getEventTime();
                    this.mPendingPan = WXGestureType.HighLevelGesture.PAN_END;
                    this.component.fireEvent(WXGestureType.HighLevelGesture.PAN_START.toString(), createFireEventParam(motionEvent, -1, null));
                } else {
                    this.component.fireEvent(WXGestureType.HighLevelGesture.PAN_MOVE.toString(), createFireEventParam(motionEvent2, -1, null));
                }
            } else if (!this.component.containsGesture(WXGestureType.HighLevelGesture.SWIPE) || this.swipeDownTime == motionEvent.getEventTime()) {
                handlePanMotionEvent = false;
            } else {
                this.swipeDownTime = motionEvent.getEventTime();
                List<Map<String, Object>> createMultipleFireEventParam = createMultipleFireEventParam(motionEvent2, null);
                Map<String, Object> map = createMultipleFireEventParam.get(createMultipleFireEventParam.size() - 1);
                if (Math.abs(f) > Math.abs(f2)) {
                    map.put("direction", f > 0.0f ? "left" : "right");
                } else {
                    map.put("direction", f2 > 0.0f ? "up" : "down");
                }
                this.component.getInstance().a(this.component.getRef(), WXGestureType.HighLevelGesture.SWIPE.toString(), map);
            }
            handlePanMotionEvent = true;
        }
        if (this.mIsTouchEventConsumed || handlePanMotionEvent) {
            z = true;
        }
        this.mIsTouchEventConsumed = z;
        return handlePanMotionEvent;
    }

    public boolean isRequestDisallowInterceptTouchEvent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e8921648", new Object[]{this})).booleanValue() : this.requestDisallowInterceptTouchEvent;
    }

    public void setRequestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c586d8", new Object[]{this, new Boolean(z)});
        } else {
            this.requestDisallowInterceptTouchEvent = z;
        }
    }
}
