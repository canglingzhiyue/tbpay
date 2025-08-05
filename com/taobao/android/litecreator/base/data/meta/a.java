package com.taobao.android.litecreator.base.data.meta;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001f\u0010\b\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\r"}, d2 = {"Lcom/taobao/android/litecreator/base/data/meta/IMeta;", "", "addExtraInfoMeta", "", "key", "", "value", "Ljava/io/Serializable;", "getMeta", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "removeExtraInfoMeta", "setMeta", "litecreator_protocol_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface a {
    void addExtraInfoMeta(String str, Serializable serializable);

    <T> T getMeta(String str);

    void removeExtraInfoMeta(String str);

    void setMeta(String str, Serializable serializable);
}
