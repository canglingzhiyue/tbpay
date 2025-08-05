package android.taobao.windvane.extra.performance2;

import android.taobao.windvane.c;
import android.taobao.windvane.monitor.o;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class WVFSPManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FSP";
    public static final int WV_FSP_STATE_Initialize = 0;
    public static final int WV_FSP_STATE_NavigationDidEnd = 2;
    public static final int WV_FSP_STATE_NavigationDidStart = 1;
    public static final int WV_FSP_STATE_UnitFinished = 3;
    private List<FSPCallback> fspCallbacks;
    private long startTime;
    private int state;
    private long time;
    public long time_H5Pages;
    private String url;

    /* loaded from: classes2.dex */
    public interface CompletionHandler {
        void stopObserving();

        void uploadFSPInfo(String str, long j);
    }

    /* loaded from: classes2.dex */
    public interface FSPCallback {
        void onFSPBack(long j);
    }

    static {
        kge.a(828615315);
        kge.a(1028243835);
    }

    public String eventForFSPStop() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5f110fa3", new Object[]{this}) : "Event_FSP_Stop";
    }

    public void navigationDidStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a6625e", new Object[]{this});
        } else if (!c.a().b().a()) {
        } else {
            int i = this.state;
            if (i != 0 && i != 2 && i != 3) {
                return;
            }
            this.state = 1;
            this.startTime = System.currentTimeMillis();
            m.c("FSP", "navigationDidStart");
        }
    }

    public void navigationDidFinishWithURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d841dafc", new Object[]{this, str});
        } else if (!c.a().b().a() || this.state != 1) {
        } else {
            this.time = System.currentTimeMillis();
            this.time_H5Pages = this.time;
            this.url = str;
            this.state = 2;
            m.c("FSP", "navigationDidFinishWithURL: " + str);
        }
    }

    public void unitDidFinish(CompletionHandler completionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c33a0f", new Object[]{this, completionHandler});
        } else if (!c.a().b().a() || completionHandler == null || this.state != 2) {
        } else {
            this.state = 3;
            commitStat();
            m.c("FSP", "unitDidFinish");
            completionHandler.stopObserving();
            completionHandler.uploadFSPInfo(this.url, this.time);
            this.time_H5Pages = this.time;
        }
    }

    public void setFspCallback(FSPCallback fSPCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a179d", new Object[]{this, fSPCallback});
            return;
        }
        if (this.fspCallbacks == null) {
            this.fspCallbacks = new ArrayList();
        }
        if (this.fspCallbacks.contains(fSPCallback)) {
            return;
        }
        this.fspCallbacks.add(fSPCallback);
    }

    public String jsCodeForFSP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40f7b2c9", new Object[]{this});
        }
        if (!c.a().b().a()) {
            return "";
        }
        String e = c.a().b().e();
        return "javascript:(function(){var badCaseMetaName=undefined;var classNames={};var ids={};var plainTextLabels={'SPAN':1,'I':1};var badCaseDOMName=\"data-observe-windvane-FSP-badcase-domname\";var previousTime=0;var callback=function(records){if(badCaseMetaName==undefined){if(document.querySelector('meta[name=\"windvane-AIT-badcase-metaname\"]')){badCaseMetaName=document.querySelector('meta[name=\"windvane-AIT-badcase-metaname\"]').getAttribute('content');if(badCaseMetaName){var metaNames=[];metaNames=badCaseMetaName.split('|');for(var i=0;i<metaNames.length;i++){var metaName=metaNames[i].substring(1,metaNames[i].length);if(metaNames[i].substring(0,1)=='.'){classNames[metaName]=true}else if(metaNames[i].substring(0,1)=='#'){ids[metaName]=true}}}}}var visibleTop=0;var visibleBottom=document.documentElement.clientHeight;var visibleLeft=0;var visibleRight=document.documentElement.clientWidth;var isAlreadySendMessage=false;var show=undefined;var hasBadCase=undefined;for(var record of records){var domNode=record.target;if(domNode==undefined){continue}if(record.addedNodes.length==0){continue}if(domNode.nodeType==1){}else if(domNode.nodeType==3){var parentNode=domNode.parentElement;if(parentNode.nodeType==1){domNode=parentNode}else{continue}}else{continue}var isPlainText=true;for(var i=0;i<record.addedNodes.length;i++){var addedDom=record.addedNodes[i];if(addedDom.nodeType==1&&plainTextLabels[addedDom.tagName]!=1){isPlainText=false;break}}if(isPlainText){continue}if(show==undefined){var domNodeTop=domNode.getBoundingClientRect().top;var domNodeBottom=domNode.getBoundingClientRect().bottom;var domNodeLeft=domNode.getBoundingClientRect().left;var domNodeRight=domNode.getBoundingClientRect().right;show=domNodeTop<visibleBottom&&domNodeBottom>visibleTop&&domNodeLeft<visibleRight&&domNodeRight>visibleLeft;if(record.addedNodes.length>0){var firstAddedDom=record.addedNodes[0];if(firstAddedDom.nodeType==1){var addedDomNodeTop=firstAddedDom.getBoundingClientRect().top;var addedDomNodeBottom=firstAddedDom.getBoundingClientRect().bottom;var addedDomNodeLeft=firstAddedDom.getBoundingClientRect().left;var addedDomNodeRight=firstAddedDom.getBoundingClientRect().right;show=addedDomNodeTop<visibleBottom&&addedDomNodeBottom>visibleTop&&addedDomNodeLeft<visibleRight&&addedDomNodeRight>visibleLeft}}}var filter=domNode.tagName!='HTML'&&domNode.tagName!='BODY'&&domNode.tagName!='HEAD'&&domNode.tagName!='SCRIPT'&&domNode.tagName!='STYLE';if(!show&&filter){break}if(show&&filter){if(window.getComputedStyle&&" + e + "){var domNodeCssStyle=window.getComputedStyle(domNode,null);if((domNodeCssStyle.getPropertyValue(\"transform\")!=\"\"&&domNodeCssStyle.getPropertyValue(\"transform\")!=\"none\")||(domNodeCssStyle.getPropertyValue(\"animation-name\")!=\"\"&&domNodeCssStyle.getPropertyValue(\"animation-name\")!=\"none\")){continue}var allHasAnimation=true;for(var i=0;i<record.addedNodes.length;i++){var addedDom=record.addedNodes[i];var addedDomCssStyle=window.getComputedStyle(addedDom,null);if(addedDom.nodeType==1){if((addedDomCssStyle.getPropertyValue(\"transform\")!=\"\"&&addedDomCssStyle.getPropertyValue(\"transform\")!=\"none\")||(addedDomCssStyle.getPropertyValue(\"animation-name\")!=\"\"&&addedDomCssStyle.getPropertyValue(\"animation-name\")!=\"none\")){}else{allHasAnimation=false;break}}}if(allHasAnimation==true){continue}}if(badCaseMetaName==undefined){var currentTime=(new Date()).getTime();if(currentTime-previousTime>10){console.log('hybrid://WVPerformance:FSP/receiveFSPTime?{\"time\":'+currentTime+'}');previousTime=currentTime}break}var isInIds=ids[domNode.id]==true;var isInClassNames=false;for(var i=0;i<domNode.classList.length;i++){if(classNames[domNode.classList[i]]==true){isInClassNames=true;break}}if(isInClassNames||isInIds){domNode.setAttribute(badCaseDOMName,'true');hasBadCase=true;continue}if(domNode.parentNode!=document){if(domNode.parentNode.getAttribute(badCaseDOMName)=='true'){domNode.setAttribute(badCaseDOMName,'true');hasBadCase=true;continue}}if(hasBadCase==undefined&&isAlreadySendMessage==false){var currentTime=(new Date()).getTime();if(currentTime-previousTime>10){console.log('hybrid://WVPerformance:FSP/receiveFSPTime?{\"time\":'+currentTime+'}');previousTime=currentTime;isAlreadySendMessage=true}}}}};var mo=new MutationObserver(callback);var options={'childList':true,'subtree':true};mo.observe(document.body,options);document.addEventListener('" + eventForFSPStop() + "',function(){mo.disconnect();mo.takeRecords()})})()";
    }

    public void receiveJSMessage(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c75102", new Object[]{this, new Long(j)});
        } else if (c.a().b().a()) {
            this.time = j;
            List<FSPCallback> list = this.fspCallbacks;
            if (list != null) {
                for (FSPCallback fSPCallback : list) {
                    fSPCallback.onFSPBack(j);
                }
            }
            m.c("FSP", "sendTime: " + j);
        }
    }

    private void commitStat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230ca732", new Object[]{this});
        } else if (!c.a().b().a()) {
        } else {
            if (o.getPerformanceMonitor() != null) {
                o.getPerformanceMonitor().didPageStartInFSP(this.url, this.time - this.startTime);
            }
            m.c("FSP", "FSP_URL: " + this.url + "\nFSP_Time: " + (this.time - this.startTime));
        }
    }
}
