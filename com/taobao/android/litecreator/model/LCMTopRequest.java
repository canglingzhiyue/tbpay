package com.taobao.android.litecreator.model;

import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.Map;
import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/taobao/android/litecreator/model/LCMTopRequest;", "Lmtopsdk/mtop/domain/MtopRequest;", "()V", "bizId", "", "getBizId", "()Ljava/lang/String;", "setBizId", "(Ljava/lang/String;)V", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "setExtraHeaders", "(Ljava/util/Map;)V", "isHttps", "", "()Z", "setHttps", "(Z)V", MtopModule.KEY_PAGE_INDEX, "", "getPageIndex", "()Ljava/lang/Integer;", "setPageIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "topic", "getTopic", "setTopic", "litecreator_utils_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class LCMTopRequest extends MtopRequest {
    private String bizId;
    private Map<String, String> extraHeaders;
    private boolean isHttps;
    private Integer pageIndex;
    private String topic;

    static {
        kge.a(-1218779034);
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final void setHttps(boolean z) {
        this.isHttps = z;
    }

    public final String getBizId() {
        return this.bizId;
    }

    public final void setBizId(String str) {
        this.bizId = str;
    }

    public final Map<String, String> getExtraHeaders() {
        return this.extraHeaders;
    }

    public final void setExtraHeaders(Map<String, String> map) {
        this.extraHeaders = map;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final void setTopic(String str) {
        this.topic = str;
    }

    public final Integer getPageIndex() {
        return this.pageIndex;
    }

    public final void setPageIndex(Integer num) {
        this.pageIndex = num;
    }
}
