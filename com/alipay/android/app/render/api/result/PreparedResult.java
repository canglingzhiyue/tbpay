package com.alipay.android.app.render.api.result;

import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class PreparedResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean mIsAsyncLayout;
    public final Template mRenderedTpl;
    public Object mResult;
    public String mTplContent;
    public String mTplId;

    private PreparedResult(Object obj, boolean z, Template template) {
        this.mResult = obj;
        this.mIsAsyncLayout = z;
        this.mRenderedTpl = template;
    }

    public static PreparedResult build(Object obj, boolean z, Template template) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreparedResult) ipChange.ipc$dispatch("c7f00350", new Object[]{obj, new Boolean(z), template}) : new PreparedResult(obj, z, template);
    }

    public PreparedResult templateContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedResult) ipChange.ipc$dispatch("373e00fe", new Object[]{this, str});
        }
        this.mTplContent = str;
        return this;
    }

    public PreparedResult templateId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedResult) ipChange.ipc$dispatch("c70c4f14", new Object[]{this, str});
        }
        this.mTplId = str;
        return this;
    }
}
