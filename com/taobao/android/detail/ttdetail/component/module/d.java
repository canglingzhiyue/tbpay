package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.am;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.eyx;
import tb.eyy;
import tb.ezg;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class d<T extends eyy> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_TYPE_HASH_ID = -1;
    public static final String ITEM_CLICK = "itemClick";
    public static final Object sLock;
    private static final AtomicInteger sTypeCount;
    private static final ConcurrentHashMap<Integer, Integer> sTypeMap;
    private volatile boolean isViewHide;
    public T mComponentData;
    public Context mContext;
    private volatile boolean mCreated;
    private Map<String, Object> mData;
    private volatile boolean mDestroyed;
    public eyx mDetailContext;
    public DataEntry[] mInitComponentData;
    public o<ezg> mParentGroup;
    public int mType;
    public View mView;
    private j mFrameSize = new j(-1, -2, 17);
    public int mLastWidthMeasureSpec = Integer.MIN_VALUE;
    public int mLastHeightMeasureSpec = Integer.MIN_VALUE;

    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
        }
    }

    public abstract View onGetComponentView(View view);

    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
        }
    }

    public void onWillDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7817f9", new Object[]{this});
        }
    }

    static {
        kge.a(655158815);
        sLock = new Object();
        sTypeCount = new AtomicInteger(0);
        sTypeMap = new ConcurrentHashMap<>(0);
    }

    public d(Context context, eyx eyxVar, T t, DataEntry... dataEntryArr) {
        this.mInitComponentData = dataEntryArr;
        if (dataEntryArr != null && dataEntryArr.length > 0) {
            for (DataEntry dataEntry : dataEntryArr) {
                setData(dataEntry.getKey(), dataEntry.getValue());
            }
        }
        this.mContext = context;
        this.mDetailContext = eyxVar;
        this.mComponentData = t;
        if (this.mComponentData == null) {
            throw new NullPointerException("Component constructor's parameter componentData can not be null");
        }
        this.mType = buildNewTypeId();
    }

    public void setData(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0b8b59", new Object[]{this, str, obj});
        } else if (str == null || obj == null) {
        } else {
            if (this.mData == null) {
                this.mData = new ConcurrentHashMap(1);
            }
            this.mData.put(str, obj);
        }
    }

    public <D> D getData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (D) ipChange.ipc$dispatch("7624f4a1", new Object[]{this, str});
        }
        if (str != null) {
            Map<String, Object> map = this.mData;
            D d = map != null ? (D) map.get(str) : null;
            if (d != null) {
                return d;
            }
            o parentComponent = getParentComponent();
            if (parentComponent != null) {
                return (D) parentComponent.getData(str);
            }
        }
        return null;
    }

    public final int buildNewTypeId() {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0c6fde1", new Object[]{this})).intValue();
        }
        synchronized (sLock) {
            int dataTypeHashId = getDataTypeHashId();
            Integer num = sTypeMap.get(Integer.valueOf(dataTypeHashId));
            if (num == null) {
                num = Integer.valueOf(sTypeCount.getAndIncrement());
                sTypeMap.put(Integer.valueOf(dataTypeHashId), num);
            }
            intValue = num.intValue();
        }
        return intValue;
    }

    public int getDataTypeHashId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30064ddd", new Object[]{this})).intValue();
        }
        if (this.mComponentData.c() != null) {
            return this.mComponentData.c().hashCode();
        }
        return -1;
    }

    public <C extends d> C findComponent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("2d63d1e0", new Object[]{this, str});
        }
        if (!TextUtils.equals(str, this.mComponentData.b())) {
            return null;
        }
        return this;
    }

    public <C extends d> C findComponentByUltronName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ipChange.ipc$dispatch("2c508b56", new Object[]{this, str});
        }
        if (!TextUtils.equals(str, this.mComponentData.r())) {
            return null;
        }
        return this;
    }

    public <C extends o> C getParentComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("bd603664", new Object[]{this}) : this.mParentGroup;
    }

    public T getComponentData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("6abf2f49", new Object[]{this}) : this.mComponentData;
    }

    public int getComponentViewType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("35aac060", new Object[]{this})).intValue() : this.mType;
    }

    public final View getComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f5308061", new Object[]{this, view});
        }
        View onGetComponentView = onGetComponentView(view);
        this.mView = onGetComponentView;
        updateComponentViewState();
        return onGetComponentView;
    }

    public final j getFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("288fc5c4", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        this.mLastWidthMeasureSpec = i;
        this.mLastHeightMeasureSpec = i2;
        return onGetFrameSize(i, i2);
    }

    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.mFrameSize;
    }

    public final void showComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690fb307", new Object[]{this});
            return;
        }
        this.isViewHide = false;
        updateComponentViewState();
    }

    public final void hideComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("154f48e2", new Object[]{this});
            return;
        }
        this.isViewHide = true;
        updateComponentViewState();
    }

    public void updateComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628120bb", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        this.mView = onGetComponentView(view);
        updateComponentViewState();
        this.mView.requestLayout();
    }

    private void updateComponentViewState() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1519b59f", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view == null) {
            return;
        }
        if (this.isViewHide) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void create() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
        } else if (this.mCreated) {
        } else {
            this.mCreated = true;
            onCreate();
        }
    }

    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        } else {
            onWillAppear();
        }
    }

    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
        } else {
            onDidAppear();
        }
    }

    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
        } else {
            fireExposeEvent(new RuntimeAbilityParam[0]);
        }
    }

    public void willDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d244c18", new Object[]{this});
        } else {
            onWillDisAppear();
        }
    }

    public void disAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179906ca", new Object[]{this});
        } else {
            onDisAppear();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.mDestroyed) {
        } else {
            this.mDestroyed = true;
            onDestroy();
        }
    }

    public RuntimeAbilityParam[] appendTriggerComponent(boolean z, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeAbilityParam[]) ipChange.ipc$dispatch("a2e9efae", new Object[]{this, new Boolean(z), runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            runtimeAbilityParamArr = new RuntimeAbilityParam[0];
        }
        List a2 = am.a(runtimeAbilityParamArr);
        a2.add(new RuntimeAbilityParam("ttTriggerComponent", this));
        if (z) {
            a2.add(new RuntimeAbilityParam("ttTriggerView", this.mView));
            a2.add(new RuntimeAbilityParam("ttTriggerRootView", this.mView));
        }
        return (RuntimeAbilityParam[]) a2.toArray(new RuntimeAbilityParam[0]);
    }

    public void fireExposeEvent(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765943cf", new Object[]{this, runtimeAbilityParamArr});
        } else {
            this.mDetailContext.c().a(this.mComponentData.g(), appendTriggerComponent(true, runtimeAbilityParamArr));
        }
    }

    public void triggerClickEvent(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62df04e5", new Object[]{this, runtimeAbilityParamArr});
        } else {
            this.mDetailContext.c().a(this.mComponentData.a("itemClick"), appendTriggerComponent(false, runtimeAbilityParamArr));
        }
    }
}
