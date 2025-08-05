package com.taobao.live.liveroom.good.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import tb.kge;
import tb.tqi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00060\u0002j\u0002`\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/taobao/live/liveroom/good/model/ItemCategory;", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/Serializable;", "Ljava/io/Serializable;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "categoryId", "getCategoryId", "setCategoryId", "bizType", "getBizType", "setBizType", "queryRights", "", "getQueryRights", "()Ljava/lang/Boolean;", "setQueryRights", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "backSortList", "getBackSortList", "setBackSortList", "isDefaultTab", "Companion", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ItemCategory implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private String bizType;
    private String categoryId;
    private String name;
    private Boolean queryRights = false;
    private Boolean backSortList = false;

    static {
        kge.a(-104302287);
        kge.a(1028243835);
        Companion = new a(null);
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public final String getCategoryId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab8b4baa", new Object[]{this}) : this.categoryId;
    }

    public final void setCategoryId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cc7b10c", new Object[]{this, str});
        } else {
            this.categoryId = str;
        }
    }

    public final String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.bizType;
    }

    public final void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    public final Boolean getQueryRights() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("915fd0d", new Object[]{this}) : this.queryRights;
    }

    public final void setQueryRights(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1e3fc9", new Object[]{this, bool});
        } else {
            this.queryRights = bool;
        }
    }

    public final Boolean getBackSortList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("6632095d", new Object[]{this}) : this.backSortList;
    }

    public final void setBackSortList(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96852ae1", new Object[]{this, bool});
        } else {
            this.backSortList = bool;
        }
    }

    public final boolean isDefaultTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1735fe9", new Object[]{this})).booleanValue() : tqi.INSTANCE.a(this.name, this.categoryId);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/live/liveroom/good/model/ItemCategory$Companion;", "", "<init>", "()V", "constructDefaultCategory", "Lcom/taobao/live/liveroom/good/model/ItemCategory;", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(1973115705);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }
    }
}
