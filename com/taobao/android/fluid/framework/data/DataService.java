package com.taobao.android.fluid.framework.data;

import android.os.Handler;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.helper.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.datamodel.b;
import com.taobao.android.fluid.framework.data.remote.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import tb.jqu;
import tb.jul;
import tb.kge;
import tb.obo;
import tb.ptk;
import tb.skd;
import tb.skk;
import tb.skl;
import tb.skm;
import tb.skn;
import tb.sko;
import tb.skp;
import tb.skt;
import tb.skv;
import tb.skw;
import tb.slb;
import tb.sld;
import tb.sle;
import tb.slf;
import tb.slg;
import tb.slh;
import tb.sli;
import tb.slj;
import tb.slk;
import tb.slu;
import tb.snn;
import tb.spy;

/* loaded from: classes5.dex */
public class DataService implements IDataService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private sko mDataListenerManager;
    private final skk mDataServiceConfig;
    private skw mDetailRequestManagerWrapper;
    private slg mDynamicRecommendManager;
    private final FluidContext mFluidContext;
    private sld mMediaInfoRequestManager;
    private slh mRecommendDataManager;
    private sli mRecommendDataRequestManager;
    private boolean mTab3CacheDataRefreshShowLoading;
    private boolean mTab3CacheEnable;
    private boolean mTab3CacheHadExposedNeedPlayNextVideo;
    private skm mUnexposedDataManager;

    static {
        kge.a(1794634447);
        kge.a(-67754786);
    }

    public void addMultiDetailRequestListener(skv.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a726875", new Object[]{this, bVar});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public void removeDetailRequestListener(skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76f20d2a", new Object[]{this, aVar});
        }
    }

    public void removeMultiDetailRequestListener(skv.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d170958", new Object[]{this, bVar});
        }
    }

    public DataService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mDataListenerManager = new sko(fluidContext);
        this.mDataServiceConfig = new skk(fluidContext, this.mDataListenerManager);
    }

    public void addDataChangeListener(skp skpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4064aae", new Object[]{this, skpVar});
        } else {
            this.mDataListenerManager.addDataChangeListener(skpVar);
        }
    }

    @Override // tb.sks
    public void addDetailRequestListener(skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad4efed", new Object[]{this, aVar});
        } else {
            this.mDataListenerManager.addDetailRequestListener(aVar);
        }
    }

    @Override // tb.sks
    public void addDetailRequestSuccessListener(skt sktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f47c95", new Object[]{this, sktVar});
        } else {
            this.mDataListenerManager.addDetailRequestSuccessListener(sktVar);
        }
    }

    @Override // tb.sks
    public void addServerConfigChangeListener(jul julVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7a62a0", new Object[]{this, julVar});
        } else {
            this.mDataListenerManager.addServerConfigChangeListener(julVar);
        }
    }

    @Override // tb.slh
    public a getCurrentMediaSetData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3316160e", new Object[]{this}) : this.mRecommendDataManager.getCurrentMediaSetData();
    }

    @Override // tb.sks
    public boolean isDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ba4767a", new Object[]{this})).booleanValue() : this.mDataListenerManager.isDetailRequestSuccess();
    }

    @Override // tb.jul
    public void onServerConfigChanged(skl sklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5711093", new Object[]{this, sklVar});
        } else {
            this.mDataListenerManager.onServerConfigChanged(sklVar);
        }
    }

    public void removeDataChangeListener(skp skpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc511b51", new Object[]{this, skpVar});
        } else {
            this.mDataListenerManager.removeDataChangeListener(skpVar);
        }
    }

    public void removeDetailRequestSuccessListener(skt sktVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac991d78", new Object[]{this, sktVar});
        } else {
            this.mDataListenerManager.removeDetailRequestSuccessListener(sktVar);
        }
    }

    public void removeServerConfigChangeListener(jul julVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df87e043", new Object[]{this, julVar});
        } else {
            this.mDataListenerManager.a(julVar);
        }
    }

    @Override // tb.slh
    public int addDetailList(int i, slk.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("24b326e0", new Object[]{this, new Integer(i), aVar})).intValue() : this.mRecommendDataManager.addDetailList(i, aVar);
    }

    @Override // tb.slh
    public void appendDetailListAtFirst(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee3781c", new Object[]{this, aVar});
        } else {
            this.mRecommendDataManager.appendDetailListAtFirst(aVar);
        }
    }

    @Override // tb.slh
    public void appendDetailListAtLast(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b0afa", new Object[]{this, aVar});
        } else {
            this.mRecommendDataManager.appendDetailListAtLast(aVar);
        }
    }

    @Override // tb.slh
    public LinkedList<a> convertToMediaSetDataList(List<MediaContentDetailData> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("71484afa", new Object[]{this, list, jSONArray}) : this.mRecommendDataManager.convertToMediaSetDataList(list, jSONArray);
    }

    @Override // tb.slh
    public ArrayList<a> convertToMediaSetDataArrayList(slk.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("80415e3", new Object[]{this, aVar}) : this.mRecommendDataManager.convertToMediaSetDataArrayList(aVar);
    }

    @Override // tb.slh
    public String getCurrentContentId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fedca28", new Object[]{this}) : this.mRecommendDataManager.getCurrentContentId();
    }

    @Override // tb.slh
    public int getCurrentDetailSuccessMtopId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9b5b4c", new Object[]{this})).intValue() : this.mRecommendDataManager.getCurrentDetailSuccessMtopId();
    }

    @Override // tb.slh
    public a.c getCurrentMediaDetail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.c) ipChange.ipc$dispatch("bdcbea36", new Object[]{this}) : this.mRecommendDataManager.getCurrentMediaDetail();
    }

    @Override // tb.slh
    public int getCurrentMediaPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fde0424", new Object[]{this})).intValue() : this.mRecommendDataManager.getCurrentMediaPosition();
    }

    @Override // tb.slh
    public int getIndexOfList(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef8dcb67", new Object[]{this, aVar})).intValue() : this.mRecommendDataManager.getIndexOfList(aVar);
    }

    @Override // tb.slh
    public ArrayList<a> getMediaSetList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("e318faf3", new Object[]{this}) : this.mRecommendDataManager.getMediaSetList();
    }

    @Override // tb.slh
    public snn.a getOffsetPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (snn.a) ipChange.ipc$dispatch("90b4e91d", new Object[]{this}) : this.mRecommendDataManager.getOffsetPosition();
    }

    @Override // tb.slh
    public long getQuickSecondRefreshMd5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e9235809", new Object[]{this})).longValue() : this.mRecommendDataManager.getQuickSecondRefreshMd5();
    }

    @Override // tb.slh
    public int getTotalCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ffb341b", new Object[]{this})).intValue() : this.mRecommendDataManager.getTotalCount();
    }

    @Override // tb.slh
    public ArrayList<a> getUnRemoveMediaSetList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("27e83b10", new Object[]{this}) : this.mRecommendDataManager.getUnRemoveMediaSetList();
    }

    @Override // tb.slh
    public List<a> getUnmodifiableMediaSetList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("98383071", new Object[]{this}) : this.mRecommendDataManager.getUnmodifiableMediaSetList();
    }

    @Override // tb.slh
    public Handler getmPreloadNextHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a3d7e1fa", new Object[]{this}) : this.mRecommendDataManager.getmPreloadNextHandler();
    }

    @Override // tb.slh
    public void insertDetailListAtCurrent(slk.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c5a66", new Object[]{this, aVar});
        } else {
            this.mRecommendDataManager.insertDetailListAtCurrent(aVar);
        }
    }

    @Override // tb.slh
    public void refreshCurrentData(a aVar, spy.a aVar2, ptk ptkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c785fd", new Object[]{this, aVar, aVar2, ptkVar});
        } else {
            this.mRecommendDataManager.refreshCurrentData(aVar, aVar2, ptkVar);
        }
    }

    @Override // tb.slh
    public void removeDetailListAtIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3da30", new Object[]{this, new Integer(i)});
        } else {
            this.mRecommendDataManager.removeDetailListAtIndex(i);
        }
    }

    @Override // tb.slh
    public void removeDetailListByIds(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd2cae6", new Object[]{this, list});
        } else {
            this.mRecommendDataManager.removeDetailListByIds(list);
        }
    }

    @Override // tb.slh
    public void removeDetailListWithAuthor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59e7615", new Object[]{this, str});
        } else {
            this.mRecommendDataManager.removeDetailListWithAuthor(str);
        }
    }

    @Override // tb.slh
    public void replaceDetail(slk.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb0ec57", new Object[]{this, aVar, str});
        } else {
            this.mRecommendDataManager.replaceDetail(aVar, str);
        }
    }

    @Override // tb.slh
    public void setAutoSlideForNextVideo(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e7d5cd8", new Object[]{this, fluidContext});
        } else {
            this.mRecommendDataManager.setAutoSlideForNextVideo(fluidContext);
        }
    }

    @Override // tb.slh
    public void setMediaSet(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b141ebd8", new Object[]{this, list});
        } else {
            this.mRecommendDataManager.setMediaSet(list);
        }
    }

    @Override // tb.slh
    public void updateMediaSet(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81357bf", new Object[]{this, list});
        } else {
            this.mRecommendDataManager.updateMediaSet(list);
        }
    }

    @Override // tb.slh
    public void clearListNextData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b513a36f", new Object[]{this});
        } else {
            this.mRecommendDataManager.clearListNextData();
        }
    }

    @Override // tb.slh
    public boolean canLoopOnceRequestRecommend() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4e61f7cd", new Object[]{this})).booleanValue() : this.mRecommendDataManager.canLoopOnceRequestRecommend();
    }

    @Override // tb.slh
    public void setLoopOnceRequestRecommend(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5890d8d9", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataManager.setLoopOnceRequestRecommend(z);
        }
    }

    @Override // tb.slg
    public boolean dynamicRecommend(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("947d6f6b", new Object[]{this, bVar})).booleanValue() : this.mDynamicRecommendManager.dynamicRecommend(bVar);
    }

    @Override // tb.slg
    public boolean dynamicRecommend(b bVar, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbfc9875", new Object[]{this, bVar, aVar})).booleanValue() : this.mDynamicRecommendManager.dynamicRecommend(bVar, aVar);
    }

    @Override // tb.slg
    public boolean feedbackRequest(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d37eb3fe", new Object[]{this, bVar})).booleanValue() : this.mDynamicRecommendManager.feedbackRequest(bVar);
    }

    @Override // tb.slg
    public LinkedList<slk.a> getFeedbackList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("7e945bee", new Object[]{this}) : this.mDynamicRecommendManager.getFeedbackList();
    }

    @Override // tb.slg
    public boolean reOrderTailUnExposeList(List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("780399e2", new Object[]{this, list})).booleanValue() : this.mDynamicRecommendManager.reOrderTailUnExposeList(list);
    }

    @Override // tb.slg
    public void updateNoDynamicRecContents(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb65b6ae", new Object[]{this, str, new Boolean(z)});
        } else {
            this.mDynamicRecommendManager.updateNoDynamicRecContents(str, z);
        }
    }

    @Override // tb.sli
    public boolean enableRecommendMtopNew() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("67139b0a", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.enableRecommendMtopNew();
    }

    @Override // tb.sli
    public boolean getLoadingState(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e06616e6", new Object[]{this, new Boolean(z)})).booleanValue() : this.mRecommendDataRequestManager.getLoadingState(z);
    }

    @Override // tb.sli
    public String getNoMoreMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f44e9e4", new Object[]{this}) : this.mRecommendDataRequestManager.getNoMoreMsg();
    }

    @Override // tb.sli
    public String getNoMoreMsgUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94bb6349", new Object[]{this}) : this.mRecommendDataRequestManager.getNoMoreMsgUp();
    }

    @Override // tb.sli
    public int getNoRecReason() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15258af7", new Object[]{this})).intValue() : this.mRecommendDataRequestManager.getNoRecReason();
    }

    @Override // tb.sli
    public String getRequestRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee1a0884", new Object[]{this}) : this.mRecommendDataRequestManager.getRequestRetCode();
    }

    @Override // tb.sli
    public String getRecommendRequestId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("993fa4d5", new Object[]{this}) : this.mRecommendDataRequestManager.getRecommendRequestId();
    }

    @Override // tb.sli
    public long getStartRecommendtime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("76844038", new Object[]{this})).longValue() : this.mRecommendDataRequestManager.getStartRecommendtime();
    }

    @Override // tb.sli
    public Map<String, Object> getTransmission() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3c695056", new Object[]{this}) : this.mRecommendDataRequestManager.getTransmission();
    }

    @Override // tb.sli
    public void setTransmission(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ff92f8", new Object[]{this, map});
        } else {
            this.mRecommendDataRequestManager.setTransmission(map);
        }
    }

    @Override // tb.sli
    public Map<String, Object> getTransmissionUP() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("803efbb1", new Object[]{this}) : this.mRecommendDataRequestManager.getTransmissionUP();
    }

    @Override // tb.sli
    public boolean isDownNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de829217", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.isDownNoMoreData();
    }

    @Override // tb.sli
    public boolean isHasShowNoMoreMsg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("60df62c9", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.isHasShowNoMoreMsg();
    }

    @Override // tb.sli
    public void setHasShowNoMoreMsg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d802c77", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataRequestManager.setHasShowNoMoreMsg(z);
        }
    }

    @Override // tb.sli
    public boolean isLoadingMore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2ac832", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.isLoadingMore();
    }

    @Override // tb.sli
    public boolean isLoadingUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0a514f8", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.isLoadingUp();
    }

    @Override // tb.sli
    public boolean isNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b47f59d5", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.isNoMoreData();
    }

    @Override // tb.sli
    public boolean isNoMoreDataUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8956490", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.isNoMoreDataUp();
    }

    @Override // tb.sli
    public boolean isUpNoMoreData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3ac3ed0", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.isUpNoMoreData();
    }

    @Override // tb.sli
    public boolean ismHasShowNoMoreMsgUp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fcc931d", new Object[]{this})).booleanValue() : this.mRecommendDataRequestManager.ismHasShowNoMoreMsgUp();
    }

    @Override // tb.sli
    public void postLoadDownRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642ed0ac", new Object[]{this});
        } else {
            this.mRecommendDataRequestManager.postLoadDownRunnable();
        }
    }

    @Override // tb.sli
    public void postLoadMoreRunnable(int i, Map map, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402c6c17", new Object[]{this, new Integer(i), map, aVar});
        } else {
            this.mRecommendDataRequestManager.postLoadMoreRunnable(i, map, aVar);
        }
    }

    @Override // tb.sli
    public void postLoadUpRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b46a5", new Object[]{this});
        } else {
            this.mRecommendDataRequestManager.postLoadUpRunnable();
        }
    }

    @Override // tb.sli
    public void postLoadUpRunnable(int i, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884ed5ba", new Object[]{this, new Integer(i), aVar});
        } else {
            this.mRecommendDataRequestManager.postLoadUpRunnable(i, aVar);
        }
    }

    @Override // tb.sli
    public void requestDetailDataAndRefresh(skd skdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c810699", new Object[]{this, skdVar});
        } else {
            this.mRecommendDataRequestManager.requestDetailDataAndRefresh(skdVar);
        }
    }

    @Override // tb.sli
    public void requestForCommendData(boolean z, boolean z2, boolean z3, int i, String str, b bVar, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e11312c", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), str, bVar, aVar});
        } else {
            this.mRecommendDataRequestManager.requestForCommendData(z, z2, z3, i, str, bVar, aVar);
        }
    }

    @Override // tb.sli
    public void resetNoMoreDataFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e36a342", new Object[]{this});
        } else {
            this.mRecommendDataRequestManager.resetNoMoreDataFlag();
        }
    }

    @Override // tb.sli
    public void setHasShowNoMoreMsgUp(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75aa741c", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataRequestManager.setHasShowNoMoreMsgUp(z);
        }
    }

    @Override // tb.sli
    public void setTransmissionUp(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69391dd", new Object[]{this, map});
        } else {
            this.mRecommendDataRequestManager.setTransmissionUp(map);
        }
    }

    @Override // tb.sli
    public void updateAppendRecommenParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb62578", new Object[]{this, jSONObject});
        } else {
            this.mRecommendDataRequestManager.updateAppendRecommenParams(jSONObject);
        }
    }

    @Override // tb.sli
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.mRecommendDataRequestManager.a(z, z2);
        }
    }

    @Override // tb.sli
    public void removeLoadingRequestCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fbf1", new Object[]{this, new Boolean(z)});
        } else {
            this.mRecommendDataRequestManager.removeLoadingRequestCallback(z);
        }
    }

    @Override // tb.sli
    public List<a> getRelatedCollectionData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("56b3ad03", new Object[]{this}) : this.mRecommendDataRequestManager.getRelatedCollectionData();
    }

    @Override // tb.sli
    public int getLastDataSequenceNumber() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55cb555a", new Object[]{this})).intValue() : this.mRecommendDataRequestManager.getLastDataSequenceNumber();
    }

    @Override // tb.sli
    public void requestListInternal(boolean z, Map map, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bca69d6", new Object[]{this, new Boolean(z), map, aVar});
        } else {
            this.mRecommendDataRequestManager.requestListInternal(z, map, aVar);
        }
    }

    @Override // tb.sli
    public void requestListForCollectionPaging(boolean z, int i, Map map, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eef82af", new Object[]{this, new Boolean(z), new Integer(i), map, aVar});
        } else {
            this.mRecommendDataRequestManager.requestListForCollectionPaging(z, i, map, aVar);
        }
    }

    @Override // tb.skx
    public void fetchContentDetail(a.C0494a c0494a, skv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf5de4a", new Object[]{this, c0494a, aVar});
        } else {
            this.mDetailRequestManagerWrapper.fetchContentDetail(c0494a, aVar);
        }
    }

    @Override // tb.skx
    public void fetchContentDetail(Map map, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b69b8e", new Object[]{this, map, new Boolean(z), new Boolean(z2)});
        } else {
            this.mDetailRequestManagerWrapper.fetchContentDetail(map, z, z2);
        }
    }

    @Override // tb.skx
    public void fetchContentDetail(Map map, boolean z, boolean z2, boolean z3, skd skdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf624ea", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3), skdVar});
        } else {
            this.mDetailRequestManagerWrapper.fetchContentDetail(map, z, z2, z3, skdVar);
        }
    }

    @Override // tb.skx
    public long getBeforeDetailMtopTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f128d8f6", new Object[]{this})).longValue() : this.mDetailRequestManagerWrapper.getBeforeDetailMtopTime();
    }

    @Override // tb.skx
    public void setBeforeDetailMtopTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf1676", new Object[]{this, new Long(j)});
        } else {
            this.mDetailRequestManagerWrapper.setBeforeDetailMtopTime(j);
        }
    }

    public com.taobao.android.fluid.core.a<d<List<com.taobao.android.fluid.framework.data.datamodel.a>>> getDetailCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.fluid.core.a) ipChange.ipc$dispatch("7fe95c5b", new Object[]{this}) : this.mDetailRequestManagerWrapper.a();
    }

    public slb getDetailInterceptorManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (slb) ipChange.ipc$dispatch("d8004747", new Object[]{this}) : this.mDetailRequestManagerWrapper.b();
    }

    @Override // tb.skx
    public List<com.taobao.android.fluid.framework.data.datamodel.a> getDetailMediaSetDataList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("61b878f3", new Object[]{this}) : this.mDetailRequestManagerWrapper.getDetailMediaSetDataList();
    }

    @Override // tb.skx
    public long getDetailMtopCost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b127cc97", new Object[]{this})).longValue() : this.mDetailRequestManagerWrapper.getDetailMtopCost();
    }

    @Override // tb.skx
    public void setDetailMtopCost(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c216fdf5", new Object[]{this, new Long(j)});
        } else {
            this.mDetailRequestManagerWrapper.setDetailMtopCost(j);
        }
    }

    @Override // tb.skx
    public long getDetailMtopSuccessTIme() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("86ff741c", new Object[]{this})).longValue() : this.mDetailRequestManagerWrapper.getDetailMtopSuccessTIme();
    }

    @Override // tb.skx
    public void setDetailMtopSuccessTIme(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ae3da8", new Object[]{this, new Long(j)});
        } else {
            this.mDetailRequestManagerWrapper.setDetailMtopSuccessTIme(j);
        }
    }

    @Override // tb.skx
    public String getDetailRequestRefreshType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("27c8b6cc", new Object[]{this}) : this.mDetailRequestManagerWrapper.getDetailRequestRefreshType();
    }

    @Override // tb.skx
    public slu getDetailUnlikeRecorder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (slu) ipChange.ipc$dispatch("ac424d8e", new Object[]{this}) : this.mDetailRequestManagerWrapper.getDetailUnlikeRecorder();
    }

    @Override // tb.skx
    public jqu getDetailVideoPositiveFeedbackIdsModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqu) ipChange.ipc$dispatch("a2e4ba4e", new Object[]{this}) : this.mDetailRequestManagerWrapper.getDetailVideoPositiveFeedbackIdsModel();
    }

    @Override // tb.skx
    public String getPreloadUseCacheValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f21ddf6", new Object[]{this}) : this.mDetailRequestManagerWrapper.getPreloadUseCacheValue();
    }

    @Override // tb.skx
    public void setPreloadUseCacheValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49638940", new Object[]{this, str});
        } else {
            this.mDetailRequestManagerWrapper.setPreloadUseCacheValue(str);
        }
    }

    @Override // tb.skx
    public boolean isDetailLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c8c036ac", new Object[]{this})).booleanValue() : this.mDetailRequestManagerWrapper.isDetailLoading();
    }

    @Override // tb.skx
    public boolean isDetailMTopSuccess() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87a218ab", new Object[]{this})).booleanValue() : this.mDetailRequestManagerWrapper.isDetailMTopSuccess();
    }

    @Override // tb.skx
    public boolean isHasPageErrorShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d79f1b1", new Object[]{this})).booleanValue() : this.mDetailRequestManagerWrapper.isHasPageErrorShow();
    }

    @Override // tb.skx
    public boolean isTab3FirstCellIconStreamRequestDetail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("931ef808", new Object[]{this})).booleanValue() : this.mDetailRequestManagerWrapper.isTab3FirstCellIconStreamRequestDetail();
    }

    @Override // tb.skx
    public boolean isTab3LauncherHitMtopPrefetch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d4a7235", new Object[]{this})).booleanValue() : this.mDetailRequestManagerWrapper.isTab3LauncherHitMtopPrefetch();
    }

    @Override // tb.skx
    public void setTab3LauncherHitMtopPrefetch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bb55fb", new Object[]{this, new Boolean(z)});
        } else {
            this.mDetailRequestManagerWrapper.setTab3LauncherHitMtopPrefetch(z);
        }
    }

    @Override // tb.skx
    public String getDetailRequestRetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5a668ef3", new Object[]{this}) : this.mDetailRequestManagerWrapper.getDetailRequestRetCode();
    }

    @Override // tb.skx
    public int getDetailRequestStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5064ed4", new Object[]{this})).intValue() : this.mDetailRequestManagerWrapper.getDetailRequestStatus();
    }

    @Override // tb.sld
    public void fetchVideoInfoAndPrecreateDwInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f797c6", new Object[]{this});
        } else {
            this.mMediaInfoRequestManager.fetchVideoInfoAndPrecreateDwInstance();
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public skk getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (skk) ipChange.ipc$dispatch("febca834", new Object[]{this}) : this.mDataServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isTab3CacheDataRefreshShowLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1b123cf3", new Object[]{this})).booleanValue() : this.mTab3CacheDataRefreshShowLoading;
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setTab3CacheDataRefreshShowLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210286fd", new Object[]{this, new Boolean(z)});
        } else {
            this.mTab3CacheDataRefreshShowLoading = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isTab3CacheEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1cd46908", new Object[]{this})).booleanValue() : this.mTab3CacheEnable;
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setTab3CacheEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4834d88", new Object[]{this, new Boolean(z)});
        } else {
            this.mTab3CacheEnable = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public boolean isTab3CacheHadExposedNeedPlayNextVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("80e197ba", new Object[]{this})).booleanValue() : this.mTab3CacheHadExposedNeedPlayNextVideo;
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void setTab3CacheHadExposedNeedPlayNextVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de4e1a6", new Object[]{this, new Boolean(z)});
        } else {
            this.mTab3CacheHadExposedNeedPlayNextVideo = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void requestList(boolean z, Map map, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28200793", new Object[]{this, new Boolean(z), map, aVar});
            return;
        }
        a(z, false);
        this.mRecommendDataRequestManager.requestListInternal(z, map, aVar);
    }

    @Override // com.taobao.android.fluid.framework.data.IDataService
    public void requestListForCollection(boolean z, Map map, int i, com.taobao.android.fluid.core.a<slk.a> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91fda507", new Object[]{this, new Boolean(z), map, new Integer(i), aVar});
        } else if (obo.a(this.mFluidContext, map, aVar)) {
        } else {
            if (((ICollectionService) this.mFluidContext.getService(ICollectionService.class)).isCollectionPagingEnable() && i > 0) {
                this.mRecommendDataRequestManager.requestListForCollectionPaging(z, i, map, aVar);
            } else {
                this.mRecommendDataRequestManager.requestListInternal(z, map, aVar);
            }
        }
    }

    @Override // tb.skm
    public String getUnExposeIds() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72ff2b94", new Object[]{this}) : this.mUnexposedDataManager.getUnExposeIds();
    }

    @Override // tb.skm
    public List getUnExposeItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c74ff73", new Object[]{this}) : this.mUnexposedDataManager.getUnExposeItems();
    }

    @Override // tb.skm
    public List<a.c> getUnExposedItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7da581d1", new Object[]{this}) : this.mUnexposedDataManager.getUnExposedItems();
    }

    @Override // tb.skm
    public List<MediaContentDetailData> getUnVisibleOrExposedItems(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ae902e1a", new Object[]{this, new Boolean(z), new Boolean(z2)}) : this.mUnexposedDataManager.getUnVisibleOrExposedItems(z, z2);
    }

    public void notifyContentDetailCallback(skv.a aVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae2eb39", new Object[]{this, aVar, dVar});
        } else {
            this.mDataListenerManager.notifyContentDetailCallback(aVar, dVar);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.mDetailRequestManagerWrapper = new skw(this.mFluidContext);
        this.mRecommendDataRequestManager = new slk(this.mFluidContext);
        this.mRecommendDataManager = new slj(this.mFluidContext);
        this.mUnexposedDataManager = new skn(this.mFluidContext);
        this.mDynamicRecommendManager = new slf(this.mFluidContext);
        this.mMediaInfoRequestManager = new sle(this.mFluidContext);
    }

    @Override // tb.skp
    public void onDataChanged(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f85ba", new Object[]{this, aVar});
        } else {
            this.mDataListenerManager.onDataChanged(aVar);
        }
    }

    @Override // tb.skt
    public void onDetailRequestSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91cae82b", new Object[]{this});
        } else {
            this.mDataListenerManager.onDetailRequestSuccess();
        }
    }

    @Override // tb.skv.a
    public void onResult(d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1227a278", new Object[]{this, dVar});
        } else {
            this.mDataListenerManager.onResult(dVar);
        }
    }

    @Override // tb.skv.a
    public void onStartRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
        } else {
            this.mDataListenerManager.onStartRequest();
        }
    }

    @Override // tb.skv.b
    public void onResult(d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e8df43", new Object[]{this, dVar, dVar2});
        } else {
            this.mDataListenerManager.onResult(dVar, dVar2);
        }
    }

    @Override // tb.skv.b
    public void onStartRequest(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a52f90", new Object[]{this, new Integer(i)});
        } else {
            this.mDataListenerManager.onStartRequest(i);
        }
    }
}
