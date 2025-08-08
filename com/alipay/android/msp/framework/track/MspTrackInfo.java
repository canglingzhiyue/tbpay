package com.alipay.android.msp.framework.track;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.log.PageInfo;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.NumUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MspTrackInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String END_SEPARATOR_CHAR = "_";
    public static final String SEPARATOR_CHAR = "__";
    public static String lastTrackPage = "first";
    public static String lastViewName = "first";
    private static volatile MspTrackInfo sInstance;
    private PageInfo mCurrentPageInfo;
    public PageInfo referPageInfo;
    private PageInfo mAutoCurrentPageInfo = null;
    private final String pageMonitor = "pageMonitor";
    private Map<MspWindowFrame, PageInfo> pageInfos = new HashMap();
    private Map<MspWindowFrame, SpmInfo> spmDataInfos = new HashMap();
    private Map<String, String> spmPage = new HashMap();
    private Map<String, String> tplWithSpmMap = new HashMap();

    /* loaded from: classes3.dex */
    public static class SpmInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String abtestId;
        public String bizCode;
        public String param4;
        public String sessionId;
        public String spmId;
        public long startTimeStamp = System.currentTimeMillis();
        private long startTimeElapsed = SystemClock.elapsedRealtime();

        public void updateForStayTime(Map<String, String> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83735e02", new Object[]{this, map, str});
            } else if (map == null) {
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                map.put("pageStartTime", String.valueOf(this.startTimeStamp));
                map.put("pageEndTime", String.valueOf(currentTimeMillis));
                map.put("pageStayTime", String.valueOf(elapsedRealtime - this.startTimeElapsed));
                map.put("pageDisappearType", str);
            }
        }
    }

    public static synchronized MspTrackInfo getInstance() {
        synchronized (MspTrackInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MspTrackInfo) ipChange.ipc$dispatch("a5cdd563", new Object[0]);
            }
            if (sInstance == null) {
                sInstance = new MspTrackInfo();
            }
            return sInstance;
        }
    }

    public void updateCurrentPageInfo(PageInfo pageInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce51ac9", new Object[]{this, pageInfo});
        } else {
            this.mAutoCurrentPageInfo = pageInfo;
        }
    }

    private MspTrackInfo() {
    }

    public void putSpmDataInfo(MspWindowFrame mspWindowFrame, SpmInfo spmInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77c1be1", new Object[]{this, mspWindowFrame, spmInfo});
        } else {
            this.spmDataInfos.put(mspWindowFrame, spmInfo);
        }
    }

    public SpmInfo getSpmInfo(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SpmInfo) ipChange.ipc$dispatch("52b3f7ec", new Object[]{this, mspWindowFrame}) : this.spmDataInfos.get(mspWindowFrame);
    }

    public synchronized boolean logPageStartWithSpmId(String str, MspWindowFrame mspWindowFrame, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a241cbb", new Object[]{this, str, mspWindowFrame, str2})).booleanValue();
        } else if (mspWindowFrame == null) {
            LogUtil.record(8, "TrackInfo:logPageStartWithSpmId", "tplId is null");
            return false;
        } else {
            if (StringUtils.isEmpty(str)) {
                str = mspWindowFrame.getTplId();
                LogUtil.record(8, "TrackInfo:logPageStartWithSpmId", "spm is empty");
            }
            tagViewSpm(mspWindowFrame.getTplId(), str);
            PageInfo pageInfo = this.pageInfos.get(mspWindowFrame);
            if (pageInfo != null && !pageInfo.isEnd) {
                LogUtil.record(2, "TrackInfo:logPageStartWithSpmId", "lastInfo is not end");
                updateLastInfoSpm(pageInfo, str);
                return false;
            }
            PageInfo pageInfo2 = this.pageInfos.get(mspWindowFrame);
            if (pageInfo2 == null || !StringUtils.equals(pageInfo2.spm, str)) {
                pageInfo2 = new PageInfo();
            }
            pageInfo2.isEnd = false;
            pageInfo2.sessionId = str2;
            pageInfo2.tplViewId = mspWindowFrame.getTplId();
            pageInfo2.pageStartTime10 = System.currentTimeMillis();
            LogUtil.record(2, "TrackInfo:logPageStartWithSpmId", "pageStartTime10 = " + pageInfo2.pageStartTime10);
            pageInfo2.pageStartTime64 = NumUtil.c10to64(pageInfo2.pageStartTime10);
            pageInfo2.pageId = str + "__" + GlobalHelper.getInstance().getUtdid(GlobalHelper.getInstance().getContext()) + "__" + pageInfo2.pageStartTime64 + "_";
            pageInfo2.mReferPageInfo = this.referPageInfo;
            pageInfo2.pageStayTime = 0L;
            pageInfo2.spm = str;
            this.referPageInfo = pageInfo2;
            this.pageInfos.put(mspWindowFrame, pageInfo2);
            this.spmPage.put(mspWindowFrame.getTplId(), "");
            this.mCurrentPageInfo = pageInfo2;
            LogUtil.record(2, "TrackInfo:logPageStartWithSpmId", "page startPay  tpl = " + mspWindowFrame.getTplId() + " spm = " + str);
            return true;
        }
    }

    private void updateLastInfoSpm(PageInfo pageInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cf950dd", new Object[]{this, pageInfo, str});
        } else if (pageInfo == null || StringUtils.isEmpty(str)) {
            LogUtil.record(2, "TrackInfo:updateLastInfoSpm", "updateLastInfoSpm spm or lastInfo is null");
        } else {
            pageInfo.spm = str;
        }
    }

    public void removeTplPageInfo(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b127d1d6", new Object[]{this, mspWindowFrame});
            return;
        }
        this.pageInfos.remove(mspWindowFrame);
        this.spmDataInfos.remove(mspWindowFrame);
    }

    public synchronized PageInfo logPageEndWithSpmId(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("2ee013f7", new Object[]{this, mspWindowFrame});
        } else if (mspWindowFrame == null) {
            LogUtil.record(2, "TrackInfo:logPageEndWithSpmId", "End_View is null");
            return null;
        } else if (StringUtils.isEmpty(getViewTag(mspWindowFrame.getTplId()))) {
            LogUtil.record(2, "TrackInfo:logPageEndWithSpmId", " spm is null");
            return null;
        } else {
            PageInfo pageInfo = this.pageInfos.get(mspWindowFrame);
            if (pageInfo == null) {
                LogUtil.record(2, "TrackInfo:logPageEndWithSpmId", "End_pageInfo is null");
                return null;
            } else if (pageInfo.isEnd) {
                LogUtil.record(2, "TrackInfo:logPageEndWithSpmId", "is already call pageEnd");
                return null;
            } else {
                pageInfo.isEnd = true;
                long currentTimeMillis = System.currentTimeMillis() - pageInfo.pageStartTime10;
                LogUtil.record(2, "TrackInfo:logPageEndWithSpmId", "stayTime = ".concat(String.valueOf(currentTimeMillis)));
                pageInfo.pageStayTime = currentTimeMillis;
                return pageInfo;
            }
        }
    }

    public String getPageIdByView(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55c85b7", new Object[]{this, mspWindowFrame});
        }
        if (mspWindowFrame == null) {
            LogUtil.record(2, "TrackInfo:getPageIdByView", "getPageId_View is null or spm is null");
            return null;
        }
        PageInfo pageInfo = this.pageInfos.get(mspWindowFrame);
        if (pageInfo == null) {
            LogUtil.record(2, "TrackInfo:getPageIdByView", "getPageId_pageInfo is null");
            return null;
        }
        return pageInfo.pageId;
    }

    public String getPageStartTimeByView(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7569c02d", new Object[]{this, mspWindowFrame});
        }
        if (mspWindowFrame == null) {
            LogUtil.record(2, "TrackInfo:getPageStartTimeByView", "tplId is empty");
            return null;
        }
        PageInfo pageInfo = this.pageInfos.get(mspWindowFrame);
        if (pageInfo == null) {
            LogUtil.record(2, "TrackInfo:getPageStartTimeByView", "getPageTime_pageInfo is null");
            return null;
        }
        return pageInfo.pageStartTime64;
    }

    public PageInfo getPageInfoByView(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("4b59c989", new Object[]{this, mspWindowFrame});
        }
        if (mspWindowFrame == null) {
            LogUtil.record(2, "TrackInfo:getPageInfoByView", "tplId is empty");
            return null;
        }
        PageInfo pageInfo = this.pageInfos.get(mspWindowFrame);
        if (pageInfo != null) {
            return pageInfo;
        }
        LogUtil.record(2, "TrackInfo:getPageInfoByView", "getPageInfoByView view is null");
        return null;
    }

    public void tagViewSpm(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2520ec", new Object[]{this, str, str2});
            return;
        }
        try {
            if (StringUtils.isEmpty(str)) {
                LogUtil.record(4, "TrackInfo:tagViewSpm", "tplId is empty");
            } else if (str2 == null) {
                LogUtil.record(4, "TrackInfo:tagViewSpm", "spm is null");
            } else {
                LogUtil.record(2, "TrackInfo:tagViewSpm", "tpl= " + str + " spm= " + str2);
                this.tplWithSpmMap.put(str, str2);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public String getViewTag(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5fe42d0", new Object[]{this, str});
        }
        if (str != null && (str2 = this.tplWithSpmMap.get(str)) != null) {
            return str2;
        }
        return null;
    }

    public PageInfo getCurrentPageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageInfo) ipChange.ipc$dispatch("393efcf4", new Object[]{this}) : this.mAutoCurrentPageInfo;
    }

    public PageInfo getPageMonitorCurrentPageInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageInfo) ipChange.ipc$dispatch("ae8f86d5", new Object[]{this}) : this.mCurrentPageInfo;
    }

    public Map<MspWindowFrame, PageInfo> getPageInfos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6937cffc", new Object[]{this}) : this.pageInfos;
    }

    public void resetRefer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f7bc78", new Object[]{this});
            return;
        }
        try {
            this.referPageInfo = PhoneCashierMspEngine.getMspLog().getCurrentReferPageInfo();
        } catch (Throwable th) {
            this.referPageInfo = null;
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
