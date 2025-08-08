package com.taobao.infoflow.taobao.subservice.biz.prefetchservice;

import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IPrefetchService;
import com.taobao.zcache.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.kge;
import tb.ldf;
import tb.ldi;
import tb.ljs;

/* loaded from: classes7.dex */
public class PrefetchServiceImpl implements h.b, IPrefetchService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PrefetchServiceImpl";
    private IConfigService mConfigService;
    private IDxItemClickService mDxItemClickService;
    private IDxItemClickService.OnDxClickNavListener mOnDxClickNavListener;
    private long mPrefetchTime = -1;

    static {
        kge.a(-135474920);
        kge.a(-195367788);
        kge.a(1625274566);
    }

    public static /* synthetic */ boolean access$000(PrefetchServiceImpl prefetchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("693480e0", new Object[]{prefetchServiceImpl, str})).booleanValue() : prefetchServiceImpl.curSectionEnabled(str);
    }

    public static /* synthetic */ List access$100(PrefetchServiceImpl prefetchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("6ae5cb2c", new Object[]{prefetchServiceImpl, str}) : prefetchServiceImpl.getABPrefetchConfig(str);
    }

    public static /* synthetic */ void access$200(PrefetchServiceImpl prefetchServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0ddcd0", new Object[]{prefetchServiceImpl});
        } else {
            prefetchServiceImpl.recordTime();
        }
    }

    public static /* synthetic */ List access$300(PrefetchServiceImpl prefetchServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1e7965ae", new Object[]{prefetchServiceImpl, str}) : prefetchServiceImpl.getOrangePrefetchConfig(str);
    }

    private IDxItemClickService.OnDxClickNavListener genNavListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDxItemClickService.OnDxClickNavListener) ipChange.ipc$dispatch("a833facf", new Object[]{this}) : new IDxItemClickService.OnDxClickNavListener() { // from class: com.taobao.infoflow.taobao.subservice.biz.prefetchservice.PrefetchServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
            public void a(BaseSectionModel baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("71ccf1d8", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
                    return;
                }
                ldf.d(PrefetchServiceImpl.TAG, "onNav - start");
                if (!PrefetchServiceImpl.access$000(PrefetchServiceImpl.this, baseSectionModel.getSectionBizCode())) {
                    ldf.d(PrefetchServiceImpl.TAG, "终止预取");
                    return;
                }
                String itemBizCode = baseSubItemModel.getItemBizCode();
                PrefetchServiceImpl prefetchServiceImpl = PrefetchServiceImpl.this;
                List access$100 = PrefetchServiceImpl.access$100(prefetchServiceImpl, "itemBizCode_" + itemBizCode);
                if (access$100 != null) {
                    if (access$100.isEmpty()) {
                        ldf.d(PrefetchServiceImpl.TAG, "命中对照组，不执行预取");
                        return;
                    }
                    ldf.d(PrefetchServiceImpl.TAG, "命中实验组，预取包名：" + access$100);
                    n.a(access$100);
                    PrefetchServiceImpl.access$200(PrefetchServiceImpl.this);
                    return;
                }
                List access$300 = PrefetchServiceImpl.access$300(PrefetchServiceImpl.this, baseSubItemModel.getItemBizCode());
                if (access$300 == null || access$300.isEmpty()) {
                    ldf.d(PrefetchServiceImpl.TAG, "未命中Orange配置，不执行预取");
                    return;
                }
                ldf.d(PrefetchServiceImpl.TAG, "命中Orange配置，预取包名：" + access$300);
                n.a(access$300);
                PrefetchServiceImpl.access$200(PrefetchServiceImpl.this);
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService.OnDxClickNavListener
            public /* synthetic */ void onNavFinished(boolean z) {
                IDxItemClickService.OnDxClickNavListener.CC.$default$onNavFinished(this, z);
            }
        };
    }

    private List<String> getABPrefetchConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7786f3a6", new Object[]{this, str});
        }
        VariationSet activate = UTABTest.activate("AB_HomePage_IconClickPrefetch", str);
        Variation variation = activate == null ? null : activate.getVariation("prefetchItem");
        String valueAsString = variation == null ? null : variation.getValueAsString("");
        ldf.d(TAG, "当前命中的实验配置: " + valueAsString + ", component=AB_HomePage_IconClickPrefetch, module=" + str + ", args=prefetchItem");
        if (StringUtils.isEmpty(valueAsString)) {
            return null;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(valueAsString);
            if (parseObject == null) {
                return Collections.emptyList();
            }
            if (!parseObject.isEmpty() && (parseObject.get("type") instanceof String) && StringUtils.equals(parseObject.getString("type"), "zcache") && (parseObject.get("resources") instanceof List)) {
                return (List) parseObject.get("resources");
            }
            return Collections.emptyList();
        } catch (Exception e) {
            ldf.a(TAG, "解析实验配置出错！", e);
            return Collections.emptyList();
        }
    }

    private boolean curSectionEnabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2750fc91", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            ldf.d(TAG, "异常：curSection=" + str);
            return false;
        }
        IConfigService iConfigService = this.mConfigService;
        if (iConfigService == null) {
            ldf.d(TAG, "异常：mConfigService==null");
            return false;
        }
        String string = iConfigService.getString("htapNavPrefetchEnabledSections", null);
        if (StringUtils.isEmpty(string)) {
            ldf.d(TAG, "Orange未配置任何section启用预取：orangeConfig=" + string);
            return false;
        }
        ldf.d(TAG, "Orange配置启用预取的section=" + string + ", curSection=" + str);
        try {
            return Arrays.asList(string.split(",")).contains(str);
        } catch (Exception e) {
            ldf.a(TAG, "解析Orange配置出错！", e);
            return false;
        }
    }

    private List<String> getOrangePrefetchConfig(String str) {
        Iterator<Object> it;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f5978759", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            ldf.d(TAG, "异常：curItemBizCode=" + str);
            return null;
        }
        IConfigService iConfigService = this.mConfigService;
        if (iConfigService == null) {
            ldf.d(TAG, "异常：mConfigService==null");
            return null;
        }
        String string = iConfigService.getString("homepageNavPrefetchConfig", null);
        if (StringUtils.isEmpty(string)) {
            ldf.d(TAG, "Orange未配置启用预取的item：config=" + string);
            return null;
        }
        ldf.d(TAG, "Orange prefetch config = " + string + ", 点击item = " + str);
        try {
            JSONObject parseObject = JSONObject.parseObject(string);
            JSONObject jSONObject2 = parseObject == null ? null : parseObject.getJSONObject("itemBizCode");
            it = (jSONObject2 == null ? new JSONArray() : jSONObject2.getJSONArray(str)).iterator();
        } catch (Exception e) {
            ldf.a(TAG, "解析Orange预取配置出错！", e);
        }
        do {
            if (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    ldf.d(TAG, str + "的Orange配置格式错误！终止预取");
                } else {
                    jSONObject = (JSONObject) next;
                }
            }
            return null;
        } while (!StringUtils.equals(jSONObject.getString("type"), "zcache"));
        return (List) jSONObject.get("resources");
    }

    private void recordTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b79845", new Object[]{this});
        } else {
            this.mPrefetchTime = System.currentTimeMillis();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceabc49c", new Object[]{this, ljsVar});
            return;
        }
        this.mDxItemClickService = (IDxItemClickService) ljsVar.a(IDxItemClickService.class);
        this.mConfigService = (IConfigService) ljsVar.a(IConfigService.class);
        if (this.mDxItemClickService != null) {
            if (this.mOnDxClickNavListener == null) {
                this.mOnDxClickNavListener = genNavListener();
            }
            this.mDxItemClickService.addDxClickNavListener(this.mOnDxClickNavListener);
        }
        ldi.a(this);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IDxItemClickService.OnDxClickNavListener onDxClickNavListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IDxItemClickService iDxItemClickService = this.mDxItemClickService;
        if (iDxItemClickService != null && (onDxClickNavListener = this.mOnDxClickNavListener) != null) {
            iDxItemClickService.removeDxClickNavListener(onDxClickNavListener);
        }
        ldi.b(this);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.h.b
    public String onIntercept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe4e6f2c", new Object[]{this, str});
        }
        if (this.mPrefetchTime < 0) {
            return str;
        }
        String str2 = str + "&hd_zcache_prefetched=" + this.mPrefetchTime;
        this.mPrefetchTime = -1L;
        return str2;
    }
}
