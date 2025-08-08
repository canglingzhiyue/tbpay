package com.taobao.taopai2.material.base;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import mtopsdk.mtop.domain.MethodEnum;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class MaterialBaseRequestParams implements b, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int DEFUALT_CLIENTVER;
    public String bizLine;
    public String bizScene;
    private long cacheTime;
    public int clientVer;
    private MaterialRequestPolicy mRequestPolicy;

    public static long adjustTemplateId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84ddad6d", new Object[]{new Long(j)})).longValue();
        }
        if (j != -1) {
            return j;
        }
        return 4001L;
    }

    @Override // com.taobao.taopai2.material.base.a
    public String getCachePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97112b88", new Object[]{this});
        }
        return null;
    }

    public String getRequestName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e5c20f5", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.taopai2.material.base.b
    public boolean needLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c133777e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-422760735);
        kge.a(1028243835);
        kge.a(-181706853);
        DEFUALT_CLIENTVER = 4;
    }

    public MaterialBaseRequestParams() {
        this.clientVer = DEFUALT_CLIENTVER;
        this.cacheTime = com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.DEF_MAX_ASYNC_SECONDS;
        this.mRequestPolicy = MaterialRequestPolicy.CACHE_NET;
    }

    public MaterialBaseRequestParams(String str, String str2, int i) {
        this.clientVer = DEFUALT_CLIENTVER;
        this.cacheTime = com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a.DEF_MAX_ASYNC_SECONDS;
        this.mRequestPolicy = MaterialRequestPolicy.CACHE_NET;
        this.bizLine = str;
        this.bizScene = str2;
        this.clientVer = i;
    }

    @Override // com.taobao.taopai2.material.base.b
    public MaterialRequestPolicy getRequestPolicy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaterialRequestPolicy) ipChange.ipc$dispatch("8e3e5ab5", new Object[]{this}) : this.mRequestPolicy;
    }

    public String getBizLine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26095428", new Object[]{this}) : this.bizLine;
    }

    @Override // com.taobao.taopai2.material.base.a
    public long getCacheTimeS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f76f1835", new Object[]{this})).longValue() : this.cacheTime * 1000;
    }

    @Override // com.taobao.taopai2.material.base.b
    public MethodEnum getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this}) : MethodEnum.POST;
    }

    public MaterialRequestPriority getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaterialRequestPriority) ipChange.ipc$dispatch("146cc9b4", new Object[]{this}) : MaterialRequestPriority.DEFAULT;
    }

    public void setRequestPolicy(MaterialRequestPolicy materialRequestPolicy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2acb56f7", new Object[]{this, materialRequestPolicy});
        } else {
            this.mRequestPolicy = materialRequestPolicy;
        }
    }

    public void setCacheTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd59e010", new Object[]{this, new Long(j)});
        } else {
            this.cacheTime = j;
        }
    }

    public static String adjustBizParam(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("578a6e26", new Object[]{str}) : StringUtils.isEmpty(str) ? "taopai" : str;
    }
}
