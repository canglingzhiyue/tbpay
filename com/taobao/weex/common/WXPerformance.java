package com.taobao.weex.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.a;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.performance.f;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import tb.kge;
import tb.mto;

@Deprecated
/* loaded from: classes9.dex */
public class WXPerformance {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_TYPE = "cacheType";
    public static final String DEFAULT = "default";
    public static boolean TRACE_DATA;
    public static final int VIEW_LIMIT_HEIGHT;
    public static final int VIEW_LIMIT_WIDTH;
    public long JSLibInitTime;
    public double JSLibSize;
    public double JSTemplateSize;
    public long actualNetworkTime;
    public long avgFPS;
    public long backImproveMemory;
    public long callBridgeTime;
    public long callCreateFinishTime;
    public long callCreateInstanceTime;
    public int cellExceedNum;
    @Deprecated
    public long communicateTime;
    public long componentCount;
    public long componentCreateTime;
    public String connectionType;
    public long cssLayoutTime;
    public String errCode;
    @Deprecated
    public String errMsg;
    public long firstScreenJSFExecuteTime;
    public int fsCallEventTotalNum;
    public int fsCallJsTotalNum;
    public long fsCallJsTotalTime;
    public int fsCallNativeTotalNum;
    public long fsCallNativeTotalTime;
    public int fsComponentCount;
    public int fsComponentCreateTime;
    public long fsRenderTime;
    public int fsRequestNum;
    public long interactionRealUnixTime;
    public long interactionTime;
    public int interactionViewAddCount;
    public int interactionViewAddLimitCount;
    public int localInteractionViewAddCount;
    public double localReadTime;
    private String mInstanceId;
    public int maxDeepVDomLayer;
    public int maxDeepViewLayer;
    public long networkTime;
    public long newFsRenderTime;
    public long packageSpendTime;
    public long parseJsonTime;
    public long pureNetworkTime;
    public String renderFailedDetail;
    public long renderTimeOrigin;
    public long renderUnixTimeOrigin;
    public long screenRenderTime;
    public long syncTaskTime;
    public long templateLoadTime;
    @Deprecated
    public String templateUrl;
    public int timerInvokeCount;
    public double totalTime;
    public double wrongImgSizeCount;
    public String zCacheInfo;
    @Deprecated
    public String bizType = "weex";
    public String cacheType = "none";
    public double fluency = 100.0d;
    public String pageName = "default";
    public int useScroller = 0;
    public String JSLibVersion = WXEnvironment.JS_LIB_SDK_VERSION;
    public String WXSDKVersion = WXEnvironment.WXSDK_VERSION;
    public String args = "";
    public String requestType = "other";
    @Deprecated
    public String[] wxDims = new String[5];
    @Deprecated
    public long[] measureTimes = new long[5];
    public int mActionAddElementCount = 0;
    public int mActionAddElementSumTime = 0;
    private StringBuilder mErrMsgBuilder = new StringBuilder();

    /* loaded from: classes9.dex */
    public enum Dimension {
        JSLibVersion,
        WXSDKVersion,
        pageName,
        spm,
        scheme,
        cacheType,
        requestType,
        networkType,
        connectionType,
        zcacheInfo,
        wxContainerName,
        wxInstanceType,
        wxParentPage,
        wxdim1,
        wxdim2,
        wxdim3,
        wxdim4,
        wxdim5,
        bizType,
        templateUrl,
        useScroller,
        hitInitOpt
    }

    /* loaded from: classes9.dex */
    public enum Measure {
        JSLibSize(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        JSLibInitTime(mto.a.GEO_NOT_SUPPORT, 80000.0d),
        SDKInitTime(mto.a.GEO_NOT_SUPPORT, 120000.0d),
        SDKInitInvokeTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        SDKInitExecuteTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        JSTemplateSize(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        pureNetworkTime(mto.a.GEO_NOT_SUPPORT, 15000.0d),
        networkTime(mto.a.GEO_NOT_SUPPORT, 15000.0d),
        fsCreateInstanceTime(mto.a.GEO_NOT_SUPPORT, 3000.0d),
        fsCallJsTotalTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        fsCallJsTotalNum(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        fsCallNativeTotalTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        fsCallNativeTotalNum(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        fsCallEventTotalNum(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        fsComponentCount(mto.a.GEO_NOT_SUPPORT, 100000.0d),
        fsComponentCreateTime(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        fsRenderTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        fsRequestNum(mto.a.GEO_NOT_SUPPORT, 100.0d),
        callCreateFinishTime(mto.a.GEO_NOT_SUPPORT, 10000.0d),
        cellExceedNum(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        communicateTotalTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        maxDeepViewLayer(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        maxDeepVDomLayer(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        componentCount(mto.a.GEO_NOT_SUPPORT, 1000000.0d),
        componentCreateTime(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        avgFps(mto.a.GEO_NOT_SUPPORT, 61.0d),
        timerCount(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        MaxImproveMemory(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        BackImproveMemory(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        PushImproveMemory(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        measureTime1(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        measureTime2(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        measureTime3(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        measureTime4(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        measureTime5(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        callBridgeTime(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        cssLayoutTime(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        parseJsonTime(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        communicateTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        screenRenderTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        totalTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        localReadTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        templateLoadTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        packageSpendTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        syncTaskTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        actualNetworkTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        firstScreenJSFExecuteTime(mto.a.GEO_NOT_SUPPORT, 5000.0d),
        fluency(mto.a.GEO_NOT_SUPPORT, 101.0d),
        imgSizeCount(mto.a.GEO_NOT_SUPPORT, 2000.0d),
        interactionTime(mto.a.GEO_NOT_SUPPORT, 10000.0d),
        interactionViewAddCount(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        interactionViewAddLimitCount(mto.a.GEO_NOT_SUPPORT, Double.MAX_VALUE),
        newFsRenderTime(mto.a.GEO_NOT_SUPPORT, 10000.0d);
        
        private double mMaxRange;
        private double mMinRange;

        Measure(double d, double d2) {
            this.mMinRange = d;
            this.mMaxRange = d2;
        }

        public double getMaxRange() {
            return this.mMaxRange;
        }

        public double getMinRange() {
            return this.mMinRange;
        }
    }

    public void afterInstanceDestroy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905ec5fa", new Object[]{this, str});
        }
    }

    static {
        kge.a(-895031322);
        VIEW_LIMIT_HEIGHT = (WXViewUtils.getScreenHeight() / 3) << 1;
        VIEW_LIMIT_WIDTH = (WXViewUtils.getScreenWidth() / 3) << 1;
        TRACE_DATA = WXEnvironment.isApkDebugable();
    }

    public WXPerformance(String str) {
        this.mInstanceId = str;
    }

    public Map<String, Double> getMeasureMap() {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bd55c90", new Object[]{this});
        }
        long j = this.fsRenderTime;
        if (j != 0) {
            d = j - this.renderTimeOrigin;
        } else {
            d = this.totalTime;
            if (d == mto.a.GEO_NOT_SUPPORT) {
                d = -1.0d;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Measure.JSLibSize.toString(), Double.valueOf(this.JSLibSize));
        hashMap.put(Measure.JSLibInitTime.toString(), Double.valueOf(this.JSLibInitTime));
        hashMap.put(Measure.SDKInitTime.toString(), Double.valueOf(WXEnvironment.sSDKInitTime));
        hashMap.put(Measure.SDKInitInvokeTime.toString(), Double.valueOf(WXEnvironment.sSDKInitInvokeTime));
        hashMap.put(Measure.SDKInitExecuteTime.toString(), Double.valueOf(WXEnvironment.sSDKInitExecuteTime));
        hashMap.put(Measure.JSTemplateSize.toString(), Double.valueOf(this.JSTemplateSize));
        hashMap.put(Measure.pureNetworkTime.toString(), Double.valueOf(this.pureNetworkTime));
        hashMap.put(Measure.networkTime.toString(), Double.valueOf(this.networkTime));
        hashMap.put(Measure.fsCreateInstanceTime.toString(), Double.valueOf(this.callCreateInstanceTime));
        hashMap.put(Measure.fsCallJsTotalTime.toString(), Double.valueOf(this.fsCallJsTotalTime));
        hashMap.put(Measure.fsCallJsTotalNum.toString(), Double.valueOf(this.fsCallJsTotalNum));
        hashMap.put(Measure.fsCallNativeTotalTime.toString(), Double.valueOf(this.fsCallNativeTotalTime));
        hashMap.put(Measure.fsCallNativeTotalNum.toString(), Double.valueOf(this.fsCallNativeTotalNum));
        hashMap.put(Measure.fsComponentCount.toString(), Double.valueOf(this.fsComponentCount));
        hashMap.put(Measure.fsComponentCreateTime.toString(), Double.valueOf(this.fsComponentCreateTime));
        hashMap.put(Measure.fsRenderTime.toString(), Double.valueOf(d));
        hashMap.put(Measure.fsRequestNum.toString(), Double.valueOf(this.fsRequestNum));
        hashMap.put(Measure.communicateTotalTime.toString(), Double.valueOf(this.totalTime));
        hashMap.put(Measure.maxDeepViewLayer.toString(), Double.valueOf(this.maxDeepViewLayer));
        hashMap.put(Measure.maxDeepVDomLayer.toString(), Double.valueOf(this.maxDeepVDomLayer));
        hashMap.put(Measure.componentCount.toString(), Double.valueOf(this.componentCount));
        hashMap.put(Measure.componentCreateTime.toString(), Double.valueOf(this.componentCreateTime));
        hashMap.put(Measure.cellExceedNum.toString(), Double.valueOf(this.cellExceedNum));
        hashMap.put(Measure.timerCount.toString(), Double.valueOf(this.timerInvokeCount));
        hashMap.put(Measure.avgFps.toString(), Double.valueOf(this.avgFPS));
        hashMap.put(Measure.fluency.toString(), Double.valueOf(this.fluency));
        hashMap.put(Measure.MaxImproveMemory.toString(), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
        hashMap.put(Measure.BackImproveMemory.toString(), Double.valueOf(this.backImproveMemory));
        hashMap.put(Measure.PushImproveMemory.toString(), Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
        hashMap.put(Measure.fsCallEventTotalNum.toString(), Double.valueOf(this.fsCallEventTotalNum));
        hashMap.put(Measure.callCreateFinishTime.toString(), Double.valueOf(this.callCreateFinishTime));
        hashMap.put(Measure.imgSizeCount.toString(), Double.valueOf(this.wrongImgSizeCount));
        hashMap.put(Measure.interactionTime.toString(), Double.valueOf(this.interactionTime));
        hashMap.put(Measure.interactionViewAddCount.toString(), Double.valueOf(this.interactionViewAddCount));
        hashMap.put(Measure.interactionViewAddLimitCount.toString(), Double.valueOf(this.interactionViewAddLimitCount));
        hashMap.put(Measure.newFsRenderTime.toString(), Double.valueOf(this.newFsRenderTime));
        hashMap.put(Measure.callBridgeTime.toString(), Double.valueOf(this.callBridgeTime));
        hashMap.put(Measure.cssLayoutTime.toString(), Double.valueOf(this.cssLayoutTime));
        hashMap.put(Measure.parseJsonTime.toString(), Double.valueOf(this.parseJsonTime));
        hashMap.put(Measure.screenRenderTime.toString(), Double.valueOf(this.screenRenderTime));
        hashMap.put(Measure.communicateTime.toString(), Double.valueOf(this.communicateTime));
        hashMap.put(Measure.localReadTime.toString(), Double.valueOf(this.localReadTime));
        hashMap.put(Measure.templateLoadTime.toString(), Double.valueOf(this.templateLoadTime));
        hashMap.put(Measure.firstScreenJSFExecuteTime.toString(), Double.valueOf(this.firstScreenJSFExecuteTime));
        hashMap.put(Measure.actualNetworkTime.toString(), Double.valueOf(this.actualNetworkTime));
        hashMap.put(Measure.syncTaskTime.toString(), Double.valueOf(this.syncTaskTime));
        hashMap.put(Measure.packageSpendTime.toString(), Double.valueOf(this.packageSpendTime));
        hashMap.put(Measure.measureTime1.toString(), Double.valueOf(this.measureTimes[0]));
        hashMap.put(Measure.measureTime2.toString(), Double.valueOf(this.measureTimes[1]));
        hashMap.put(Measure.measureTime3.toString(), Double.valueOf(this.measureTimes[2]));
        hashMap.put(Measure.measureTime4.toString(), Double.valueOf(this.measureTimes[3]));
        hashMap.put(Measure.measureTime5.toString(), Double.valueOf(this.measureTimes[4]));
        return hashMap;
    }

    public Map<String, String> getDimensionMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da02a408", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Dimension.JSLibVersion.toString(), this.JSLibVersion);
        hashMap.put(Dimension.WXSDKVersion.toString(), this.WXSDKVersion);
        hashMap.put(Dimension.pageName.toString(), this.pageName);
        hashMap.put(Dimension.requestType.toString(), this.requestType);
        hashMap.put(Dimension.networkType.toString(), "unknown");
        hashMap.put(Dimension.connectionType.toString(), this.connectionType);
        hashMap.put(Dimension.zcacheInfo.toString(), this.zCacheInfo);
        hashMap.put(Dimension.cacheType.toString(), this.cacheType);
        hashMap.put(Dimension.useScroller.toString(), String.valueOf(this.useScroller));
        WXSDKInstance sDKInstance = WXSDKManager.getInstance().getSDKInstance(this.mInstanceId);
        String str = a.UN_KNOW;
        hashMap.put("wxContainerName", sDKInstance == null ? str : sDKInstance.F().get("wxContainerName"));
        hashMap.put("wxInstanceType", sDKInstance == null ? str : sDKInstance.F().get("wxInstanceType"));
        if (sDKInstance != null) {
            str = sDKInstance.F().get(f.KEY_PAGE_PROPERTIES_PARENT_PAGE);
        }
        hashMap.put(f.KEY_PAGE_PROPERTIES_PARENT_PAGE, str);
        hashMap.put(Dimension.wxdim1.toString(), this.wxDims[0]);
        hashMap.put(Dimension.wxdim2.toString(), this.wxDims[1]);
        hashMap.put(Dimension.wxdim3.toString(), this.wxDims[2]);
        hashMap.put(Dimension.wxdim4.toString(), this.wxDims[3]);
        hashMap.put(Dimension.wxdim5.toString(), this.wxDims[4]);
        hashMap.put(Dimension.bizType.toString(), this.bizType);
        hashMap.put(Dimension.templateUrl.toString(), this.templateUrl);
        return hashMap;
    }

    public static String[] getDimensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6ebd5819", new Object[0]);
        }
        LinkedList linkedList = new LinkedList();
        for (Dimension dimension : Dimension.values()) {
            linkedList.add(dimension.toString());
        }
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public static String[] getMeasures() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("76c40ea1", new Object[0]);
        }
        LinkedList linkedList = new LinkedList();
        for (Measure measure : Measure.values()) {
            linkedList.add(measure.toString());
        }
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (WXEnvironment.isApkDebugable()) {
            return "bizType:" + this.bizType + ",pageName:" + this.pageName + ",templateLoadTime" + this.templateLoadTime + ",localReadTime:" + this.localReadTime + ",JSLibInitTime:" + this.JSLibInitTime + ",JSLibSize:" + this.JSLibSize + ",templateUrl" + this.templateUrl + ",JSTemplateSize:" + this.JSTemplateSize + ",communicateTime:" + this.communicateTime + ",screenRenderTime:" + this.screenRenderTime + ",firstScreenJSFExecuteTime:" + this.firstScreenJSFExecuteTime + ",componentCount:" + this.componentCount + ",syncTaskTime:" + this.syncTaskTime + ",pureNetworkTime:" + this.pureNetworkTime + ",networkTime:" + this.networkTime + ",actualNetworkTime:" + this.actualNetworkTime + ",packageSpendTime:" + this.packageSpendTime + ",connectionType:" + this.connectionType + ",requestType:" + this.requestType + ",initInvokeTime:" + WXEnvironment.sSDKInitInvokeTime + ",initExecuteTime:" + WXEnvironment.sSDKInitExecuteTime + ",SDKInitTime:" + WXEnvironment.sSDKInitTime + ",totalTime:" + this.totalTime + ",JSLibVersion:" + this.JSLibVersion + ",WXSDKVersion:" + this.WXSDKVersion + ",errCode:" + this.errCode + ",renderFailedDetail:" + this.renderFailedDetail + ",arg:" + this.args + ",errMsg:" + getErrMsg();
        }
        return super.toString();
    }

    public String getPerfData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f7a4af0", new Object[]{this});
        }
        return "networkTime:" + this.networkTime + " actualNetworkTime:" + this.actualNetworkTime + " connectionType:" + this.connectionType + " requestType:" + this.requestType + " firstScreenRenderTime:" + this.screenRenderTime + " firstScreenJSFExecuteTime:" + this.firstScreenJSFExecuteTime + " componentCount:" + this.componentCount + " JSTemplateSize:" + this.JSTemplateSize + " SDKInitTime:" + WXEnvironment.sSDKInitTime + " totalTime:" + this.totalTime + " JSLibVersion:" + this.JSLibVersion + " WXSDKVersion:" + this.WXSDKVersion + " pageName:" + this.pageName + " useScroller:" + this.useScroller;
    }

    public String getErrMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cbb17367", new Object[]{this}) : this.mErrMsgBuilder.toString();
    }

    public void appendErrMsg(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8416d6c1", new Object[]{this, charSequence});
        } else {
            this.mErrMsgBuilder.append(charSequence);
        }
    }

    public void beforeInstanceRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d0cefb", new Object[]{this, str});
            return;
        }
        this.renderTimeOrigin = System.currentTimeMillis();
        this.renderUnixTimeOrigin = WXUtils.getFixUnixTime();
    }
}
