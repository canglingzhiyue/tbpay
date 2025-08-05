package com.alipay.android.app.render.birdnest.service;

import android.content.Context;
import android.view.View;
import com.alipay.android.app.cctemplate.utils.DrmUtil;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.birdnest.BirdNestBuilder;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.session.standalone.model.PrepareResult;
import com.flybird.session.standalone.model.PrerenderOptions;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.List;
import org.json.JSONObject;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public abstract class BirdNestService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PRE_RENDER_MAX_CONCURRENT_TASK_NUM = 2;
    private static final int PRE_RENDER_MAX_CONTEXT_NUM = 2;
    public static volatile PrerenderOptions prerenderOptions;
    public ICashierProvider mProvider;

    @Deprecated
    public abstract FBContext buildFBContext(BirdNestBuilder birdNestBuilder);

    public abstract PrepareResult buildPrepareResult(BirdNestBuilder birdNestBuilder);

    public abstract boolean onBackPressed(View view);

    public abstract List<JSONObject> releaseResource(int i);

    public BirdNestService() {
    }

    public BirdNestService(ICashierProvider iCashierProvider) {
        this.mProvider = iCashierProvider;
    }

    public ICashierProvider getProvider() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ICashierProvider) ipChange.ipc$dispatch("2dde5263", new Object[]{this}) : this.mProvider;
    }

    public void initialize(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90bb9d2", new Object[]{this, iCashierProvider});
        } else {
            this.mProvider = iCashierProvider;
        }
    }

    public static PrerenderOptions getPrerenderOptions(Context context) {
        int i;
        int i2;
        com.alibaba.fastjson.JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrerenderOptions) ipChange.ipc$dispatch("efa8f8ec", new Object[]{context});
        }
        if (prerenderOptions == null) {
            if (context != null) {
                try {
                    parseObject = com.alibaba.fastjson.JSONObject.parseObject(DrmUtil.getRawDrmValueFromKey(context, "bird_nest_pre_rend_options", null));
                    i = parseObject.getIntValue("maxContextNum");
                } catch (Throwable th) {
                    th = th;
                    i = 2;
                }
                try {
                    i2 = parseObject.getIntValue("maxConcurrentTaskNum");
                } catch (Throwable th2) {
                    th = th2;
                    LogUtils.printExceptionStackTrace(th);
                    i2 = 2;
                    LogUtils.record(2, "BirdNestService:getPrerenderOptions", "maxContextNum:" + i + "maxConcurrentTaskNum:" + i2);
                    prerenderOptions = new PrerenderOptions.Builder().setAllowPrerender(true).setMaxContextNum(i).setMaxConcurrentTaskNum(i2).build();
                    return prerenderOptions;
                }
            } else {
                i2 = 2;
                i = 2;
            }
            LogUtils.record(2, "BirdNestService:getPrerenderOptions", "maxContextNum:" + i + "maxConcurrentTaskNum:" + i2);
            prerenderOptions = new PrerenderOptions.Builder().setAllowPrerender(true).setMaxContextNum(i).setMaxConcurrentTaskNum(i2).build();
        }
        return prerenderOptions;
    }
}
