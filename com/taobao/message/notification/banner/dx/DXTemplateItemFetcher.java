package com.taobao.message.notification.banner.dx;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.orange.OrangeConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher;", "", "()V", "currentConfig", "Lcom/alibaba/fastjson/JSONObject;", "getCurrentConfig", "()Lcom/alibaba/fastjson/JSONObject;", "setCurrentConfig", "(Lcom/alibaba/fastjson/JSONObject;)V", "defaultConfig", "kotlin.jvm.PlatformType", "getDefaultConfig", "mFetcher", "Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;", "getMFetcher", "()Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;", "setMFetcher", "(Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;)V", "fetchDXTemplateItem", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "templateId", "", "setFetcher", "", "fetcher", "TemplateFetcher", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class DXTemplateItemFetcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DXTemplateItemFetcher INSTANCE;
    private static JSONObject currentConfig;
    private static final JSONObject defaultConfig;
    private static TemplateFetcher mFetcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DXTemplateItemFetcher$TemplateFetcher;", "", "fetch", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "templateId", "", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public interface TemplateFetcher {
        DXTemplateItem fetch(int i);
    }

    static {
        kge.a(2131986725);
        INSTANCE = new DXTemplateItemFetcher();
        defaultConfig = JSON.parseObject("{\"281002\":{\"name\":\"alimp_test_new_push\",\"version\":1687838056288,\"templateUrl\":\"https://dinamicx.alibabausercontent.com/pub/alimp_test_new_push/1687838056288/alimp_test_new_push.zip\"},\"289001\":{\"name\":\"alimp_new_push_square\",\"version\":1687835691484,\"templateUrl\":\"https://dinamicx.alibabausercontent.com/pub/alimp_new_push_square/1687835691484/alimp_new_push_square.zip\"}}");
    }

    private DXTemplateItemFetcher() {
    }

    public final JSONObject getDefaultConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("63da8e54", new Object[]{this}) : defaultConfig;
    }

    public final JSONObject getCurrentConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("af71ef8c", new Object[]{this}) : currentConfig;
    }

    public final void setCurrentConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca3d610", new Object[]{this, jSONObject});
        } else {
            currentConfig = jSONObject;
        }
    }

    public final TemplateFetcher getMFetcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateFetcher) ipChange.ipc$dispatch("4287f03a", new Object[]{this}) : mFetcher;
    }

    public final void setMFetcher(TemplateFetcher templateFetcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ece0f30", new Object[]{this, templateFetcher});
        } else {
            mFetcher = templateFetcher;
        }
    }

    @JvmStatic
    public static final void setFetcher(TemplateFetcher fetcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4930dae7", new Object[]{fetcher});
            return;
        }
        q.c(fetcher, "fetcher");
        mFetcher = fetcher;
    }

    @JvmStatic
    public static final DXTemplateItem fetchDXTemplateItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("43b15fbe", new Object[]{new Integer(i)});
        }
        TemplateFetcher templateFetcher = mFetcher;
        if (templateFetcher != null) {
            if (templateFetcher == null) {
                q.a();
            }
            return templateFetcher.fetch(i);
        }
        if (currentConfig == null) {
            String config = OrangeConfig.getInstance().getConfig("mpm_data_switch", "pushLayoutInfo", "");
            if (!StringUtils.isEmpty(config)) {
                try {
                    currentConfig = JSON.parseObject(config);
                } catch (Exception unused) {
                }
            }
        }
        DXTemplateItem dXTemplateItem = null;
        JSONObject jSONObject = currentConfig;
        if (jSONObject != null) {
            if (jSONObject == null) {
                q.a();
            }
            if (jSONObject.containsKey(String.valueOf(i))) {
                JSONObject jSONObject2 = currentConfig;
                if (jSONObject2 == null) {
                    q.a();
                }
                dXTemplateItem = (DXTemplateItem) jSONObject2.getObject(String.valueOf(i), DXTemplateItem.class);
            }
        }
        if (dXTemplateItem != null) {
            return dXTemplateItem;
        }
        JSONObject jSONObject3 = defaultConfig;
        if (jSONObject3 == null) {
            q.a();
        }
        return jSONObject3.containsKey(String.valueOf(i)) ? (DXTemplateItem) defaultConfig.getObject(String.valueOf(i), DXTemplateItem.class) : dXTemplateItem;
    }
}
